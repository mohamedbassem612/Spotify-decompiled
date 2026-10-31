package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class laa0 extends ohd {
    public final saa0 t;

    public laa0(lnm lnmVar, saa0 saa0Var) {
        super(1, lnmVar);
        this.t = saa0Var;
    }

    @Override // p.ohd
    public final Throwable p(saa0 saa0Var) {
        Throwable thC;
        Object objG0 = this.t.g0();
        if (!(objG0 instanceof naa0) || (thC = ((naa0) objG0).c()) == null) {
            return objG0 instanceof nyh ? ((nyh) objG0).a : saa0Var.g();
        }
        return thC;
    }

    @Override // p.ohd
    public final String z() {
        return "AwaitContinuation";
    }
}
