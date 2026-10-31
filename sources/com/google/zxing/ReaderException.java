package com.google.zxing;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ReaderException extends Exception {
    public static final boolean a;
    public static final StackTraceElement[] b;

    static {
        a = System.getProperty("surefire.test.class.path") != null;
        b = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
