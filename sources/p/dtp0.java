package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dtp0 {
    public final long a;
    public final boolean b;
    public final vgc0 c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dtp0(vgc0 vgc0Var, int i) {
        this(fdg1.k0(0, ngv.SECONDS), (i & 2) != 0, vgc0Var);
        ytw0 ytw0Var = jfv.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtp0)) {
            return false;
        }
        dtp0 dtp0Var = (dtp0) obj;
        return jfv.f(this.a, dtp0Var.a) && this.b == dtp0Var.b && u890.j(this.c, dtp0Var.c);
    }

    public final int hashCode() {
        ytw0 ytw0Var = jfv.b;
        int iG = xcg1.g(Long.hashCode(this.a) * 31, 31, this.b);
        vgc0 vgc0Var = this.c;
        return iG + (vgc0Var == null ? 0 : vgc0Var.hashCode());
    }

    public dtp0(long j, boolean z, vgc0 vgc0Var) {
        this.a = j;
        this.b = z;
        this.c = vgc0Var;
    }
}
