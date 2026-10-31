package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k0v0 {
    public final int a;
    public final i0v0 b;

    public k0v0(int i, i0v0 i0v0Var) {
        this.a = i;
        this.b = i0v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0v0)) {
            return false;
        }
        k0v0 k0v0Var = (k0v0) obj;
        return this.a == k0v0Var.a && this.b.equals(k0v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
