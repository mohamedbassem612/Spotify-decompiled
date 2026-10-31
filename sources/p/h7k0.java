package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h7k0 implements i7k0 {
    public final a7k0 a;

    public h7k0(a7k0 a7k0Var) {
        this.a = a7k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h7k0) && this.a.equals(((h7k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
