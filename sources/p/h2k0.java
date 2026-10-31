package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h2k0 implements k4k0 {
    public final ha20 a;

    public h2k0(ha20 ha20Var) {
        this.a = ha20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2k0) && this.a == ((h2k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
