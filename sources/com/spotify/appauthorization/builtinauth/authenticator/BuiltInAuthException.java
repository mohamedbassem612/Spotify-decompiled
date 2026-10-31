package com.spotify.appauthorization.builtinauth.authenticator;

import p.f4i1;
import p.z5c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class BuiltInAuthException extends RuntimeException {
    public final int a;
    public final String b;

    public BuiltInAuthException(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        int i = this.a;
        if (i == 1) {
            str = "ERROR_USER_NEEDS_AUTHORIZATION";
        } else if (i == 2) {
            str = "ERROR_NOT_LOGGED_IN";
        } else if (i == 3) {
            str = "ERROR_OFFLINE_MODE_ACTIVE";
        } else if (i == 4) {
            str = "ERROR_AUTHORIZATION_TIMEOUT";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "ERROR_AUTHORIZATION_RESPONSE";
        }
        return f4i1.f(str, ": ", this.b);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "BuiltInAuthException{" + z5c.s(this.a) + ":" + this.b + "}";
    }
}
