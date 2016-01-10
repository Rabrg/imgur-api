package me.rabrg.imgur;

public final class Model<T> {

    private T data;
    private boolean success;
    private int status;

    public T getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getStatus() {
        return status;
    }
}
