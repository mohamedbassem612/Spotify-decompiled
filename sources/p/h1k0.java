package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h1k0 implements k1k0 {
    public final i7k0 a;

    public h1k0(i7k0 i7k0Var) {
        this.a = i7k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1k0) && this.a.equals(((h1k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
