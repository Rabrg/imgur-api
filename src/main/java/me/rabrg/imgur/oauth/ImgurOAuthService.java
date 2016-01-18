package me.rabrg.imgur.oauth;

import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.model.OAuthConfig;
import com.github.scribejava.core.model.OAuthConstants;
import com.github.scribejava.core.model.OAuthRequest;
import com.github.scribejava.core.model.Token;
import com.github.scribejava.core.model.Verifier;
import com.github.scribejava.core.oauth.OAuth20ServiceImpl;

public final class ImgurOAuthService extends OAuth20ServiceImpl {

    public ImgurOAuthService(final DefaultApi20 api, final OAuthConfig config) {
        super(api, config);
    }

    @Override
    public Token getAccessToken(final Token requestToken, final Verifier verifier) {
        final OAuthRequest request = new OAuthRequest(getApi().getAccessTokenVerb(),
                getApi().getAccessTokenEndpoint(), this);
        request.addBodyParameter(OAuthConstants.CLIENT_ID, getConfig().getApiKey());
        request.addBodyParameter(OAuthConstants.CLIENT_SECRET, getConfig().getApiSecret());
        request.addBodyParameter(OAuthConstants.GRANT_TYPE, "pin");
        request.addBodyParameter("pin", verifier.getValue());

        return getApi().getAccessTokenExtractor().extract(request.send().getBody());
    }
}
