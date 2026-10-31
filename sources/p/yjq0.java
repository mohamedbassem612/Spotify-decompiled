package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yjq0 extends klq0 {
    public static final yjq0 c = new yjq0(0, 2, 1);

    @Override // p.klq0
    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        s340 s340Var = (s340) a9aVar.m(0);
        Object objM = a9aVar.m(1);
        if (objM instanceof b440) {
            h72Var.M((b440) objM);
        }
        if (hf91Var.n != 0) {
            g0k.a("Can only append a slot if not current inserting");
        }
        int i = hf91Var.i;
        int i2 = hf91Var.j;
        int iC = hf91Var.c(s340Var);
        int iF = hf91Var.f(hf91Var.q(iC + 1), hf91Var.b);
        hf91Var.i = iF;
        hf91Var.j = iF;
        hf91Var.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        hf91Var.c[iF] = objM;
        hf91Var.i = i;
        hf91Var.j = i2;
    }
}
