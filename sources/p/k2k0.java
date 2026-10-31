package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k2k0 implements k4k0 {
    public final m7f0 a;

    public k2k0(m7f0 m7f0Var) {
        this.a = m7f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2k0) && this.a == ((k2k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
