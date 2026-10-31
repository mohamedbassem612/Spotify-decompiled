package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b1k implements k1k {
    public final uv11 a;

    public b1k(uv11 uv11Var) {
        this.a = uv11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1k) && this.a.equals(((b1k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
