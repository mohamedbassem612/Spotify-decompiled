package com.spotify.mobius.rx3;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class UnknownEffectException extends RuntimeException {
    public final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownEffectException(Object obj) {
        super(obj.toString());
        obj.getClass();
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnknownEffectException) {
            return this.a.equals(((UnknownEffectException) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
