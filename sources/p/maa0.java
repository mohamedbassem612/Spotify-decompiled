package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class maa0 extends iaa0 {
    public final saa0 g;
    public final naa0 h;
    public final n0g i;
    public final Object t;

    public maa0(saa0 saa0Var, naa0 naa0Var, n0g n0gVar, Object obj) {
        this.g = saa0Var;
        this.h = naa0Var;
        this.i = n0gVar;
        this.t = obj;
    }

    @Override // p.iaa0
    public final boolean k() {
        return false;
    }

    @Override // p.iaa0
    public final void l(Throwable th) {
        n0g n0gVar = this.i;
        n0g n0gVarP0 = saa0.p0(n0gVar);
        saa0 saa0Var = this.g;
        naa0 naa0Var = this.h;
        Object obj = this.t;
        if (n0gVarP0 == null || !saa0Var.x0(naa0Var, n0gVarP0, obj)) {
            naa0Var.a.c(new xmc0(2), 2);
            n0g n0gVarP1 = saa0.p0(n0gVar);
            if (n0gVarP1 == null || !saa0Var.x0(naa0Var, n0gVarP1, obj)) {
                saa0Var.N(saa0Var.Y(naa0Var, obj));
            }
        }
    }
}
