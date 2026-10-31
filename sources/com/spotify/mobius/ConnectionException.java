package com.spotify.mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class ConnectionException extends RuntimeException {
    public final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionException(Object obj, Throwable th) {
        super(obj.toString(), th);
        obj.getClass();
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionException) {
            return this.a.equals(((ConnectionException) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
