package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class flq0 extends klq0 {
    public static final flq0 c = new flq0(1, 1);

    @Override // p.klq0
    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        Object objM = a9aVar.m(0);
        int iL = a9aVar.l(0);
        if (objM instanceof b440) {
            h72Var.M((b440) objM);
        }
        Object objL = hf91Var.L(hf91Var.t, iL, objM);
        if (objL instanceof b440) {
            h72Var.D((b440) objL);
        } else if (objL instanceof h311) {
            ((h311) objL).d();
        }
    }
}
