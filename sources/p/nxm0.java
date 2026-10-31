package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nxm0 implements pxm0, egb1 {
    public final iu30 a;
    public final vu30 b;

    public nxm0(iu30 iu30Var, vu30 vu30Var) {
        this.a = iu30Var;
        this.b = vu30Var;
    }

    @Override // p.egb1
    public final iu30 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxm0)) {
            return false;
        }
        nxm0 nxm0Var = (nxm0) obj;
        return this.a.equals(nxm0Var.a) && this.b.equals(nxm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
