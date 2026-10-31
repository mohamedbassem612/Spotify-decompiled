package com.spotify.support.assertion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class Assertion$RecoverableAssertionError extends RuntimeException {
    public final String a;

    public Assertion$RecoverableAssertionError(String str, Throwable th) {
        super(str, th);
        this.a = null;
    }

    public Assertion$RecoverableAssertionError(String str, String str2) {
        super(str);
        this.a = str2;
    }
}
