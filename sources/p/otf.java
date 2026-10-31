package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class otf implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ plu b;

    public /* synthetic */ otf(plu pluVar, byte b) {
        this.a = b;
        this.b = pluVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        plu pluVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = pluVar.collect(new kmf(vr20Var, (byte) 4), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = pluVar.collect(new k9t(vr20Var, (byte) 29), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = pluVar.collect(new mcn0(vr20Var, (byte) 23), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = pluVar.collect(new r4t0(vr20Var, (byte) 2), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
