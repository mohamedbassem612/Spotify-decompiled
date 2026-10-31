package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qt20 implements mr20 {
    public final /* synthetic */ mr20 a;
    public final /* synthetic */ int b;

    public qt20(mr20 mr20Var, int i) {
        this.a = mr20Var;
        this.b = i;
    }

    @Override // p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        Object objCollect = this.a.collect(new st20(new n811(), this.b, vr20Var), lnmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
