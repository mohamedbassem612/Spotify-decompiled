package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class plu implements mr20 {
    public final mr20 a;
    public final iu30 b;
    public final vu30 c;

    public plu(mr20 mr20Var, iu30 iu30Var, vu30 vu30Var) {
        this.a = mr20Var;
        this.b = iu30Var;
        this.c = vu30Var;
    }

    @Override // p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        p811 p811Var = new p811();
        p811Var.a = wqn1.a;
        Object objCollect = this.a.collect(new e8m(this, p811Var, vr20Var, (byte) 1), lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
