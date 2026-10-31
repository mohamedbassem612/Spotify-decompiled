package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bvk1 {
    public final n8h1 a;
    public final j2i b;

    public bvk1(n8h1 n8h1Var, j2i j2iVar) {
        this.a = n8h1Var;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bvk1) {
            bvk1 bvk1Var = (bvk1) obj;
            return u890.j(this.a, bvk1Var.a) && this.b == bvk1Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
