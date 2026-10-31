package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class clq0 extends klq0 {
    public static final clq0 c = new clq0(1, 0, 2);

    @Override // p.klq0
    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        int iL = a9aVar.l(0);
        int i = hf91Var.v;
        int iO = hf91Var.O(hf91Var.q(i), hf91Var.b);
        int iF = hf91Var.f(hf91Var.q(i + 1), hf91Var.b);
        for (int iMax = Math.max(iO, iF - iL); iMax < iF; iMax++) {
            Object obj = hf91Var.c[hf91Var.g(iMax)];
            if (obj instanceof b440) {
                h72Var.D((b440) obj);
            } else if (obj instanceof h311) {
                ((h311) obj).d();
            }
        }
        if (iL <= 0) {
            g0k.a("Check failed");
        }
        int i2 = hf91Var.v;
        int iO2 = hf91Var.O(hf91Var.q(i2), hf91Var.b);
        int iF2 = hf91Var.f(hf91Var.q(i2 + 1), hf91Var.b) - iL;
        if (iF2 < iO2) {
            g0k.a("Check failed");
        }
        hf91Var.K(iF2, iL, i2);
        int i3 = hf91Var.i;
        if (i3 >= iO2) {
            hf91Var.i = i3 - iL;
        }
    }
}
