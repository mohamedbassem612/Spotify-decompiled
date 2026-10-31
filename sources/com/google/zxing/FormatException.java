package com.google.zxing;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class FormatException extends ReaderException {
    public static final FormatException c;

    static {
        FormatException formatException = new FormatException();
        c = formatException;
        formatException.setStackTrace(ReaderException.b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        return ReaderException.a ? new FormatException() : c;
    }
}
