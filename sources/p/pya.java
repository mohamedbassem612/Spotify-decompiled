package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pya implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ evz b;

    public /* synthetic */ pya(evz evzVar, byte b) {
        this.a = b;
        this.b = evzVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        evz evzVar = this.b;
        switch (b) {
            case 0:
                Object objCollect = evzVar.collect(new bt9(vr20Var, (byte) 13), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = evzVar.collect(new wmo(vr20Var, (byte) 20), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = evzVar.collect(new rir(vr20Var, (byte) 10), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = evzVar.collect(new x5s(vr20Var, (byte) 14), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = evzVar.collect(new o010(vr20Var, (byte) 4), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            default:
                Object objCollect6 = evzVar.collect(new qmd1(vr20Var, (byte) 28), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
        }
    }
}
