package me.rabrg.imgur;

public final class Model<T> {

    private T data;
    private boolean success;
    private int status;

    T getData() {
        return data;
    }

    boolean isSuccess() {
        return success;
    }

    int getStatus() {
        return status;
    }
}
