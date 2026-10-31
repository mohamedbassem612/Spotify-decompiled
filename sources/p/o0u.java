package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o0u extends q0u {
    public final RuntimeException a;

    public o0u(RuntimeException runtimeException) {
        this.a = runtimeException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0u) && this.a.equals(((o0u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
