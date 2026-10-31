package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qw5 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ipr b;

    public /* synthetic */ qw5(ipr iprVar, byte b) {
        this.a = b;
        this.b = iprVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ipr iprVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = iprVar.collect(new tv5(vr20Var, (byte) 2), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = iprVar.collect(new x5s(vr20Var, (byte) 7), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = iprVar.collect(new l6z(vr20Var, (byte) 25), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = iprVar.collect(new dgk0(vr20Var, (byte) 4), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = iprVar.collect(new wl01(vr20Var, (byte) 10), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            default:
                Object objCollect6 = iprVar.collect(new ml21(vr20Var, (byte) 16), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
        }
    }
}
