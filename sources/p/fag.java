package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fag implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dkm b;

    public /* synthetic */ fag(dkm dkmVar, byte b) {
        this.a = b;
        this.b = dkmVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        dkm dkmVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = dkmVar.collect(new kmf(vr20Var, (byte) 16), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = dkmVar.collect(new oq0(vr20Var, (byte) 21), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = dkmVar.collect(new ae91(vr20Var, (byte) 28), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
