package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vtm1 {
    public final pix a;
    public final boolean b;
    public final boolean c;

    public vtm1(pix pixVar, boolean z, boolean z2) {
        this.a = pixVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtm1)) {
            return false;
        }
        vtm1 vtm1Var = (vtm1) obj;
        return this.a.equals(vtm1Var.a) && this.b == vtm1Var.b && this.c == vtm1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
