package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e6s implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uji1 b;

    public /* synthetic */ e6s(uji1 uji1Var, byte b) {
        this.a = b;
        this.b = uji1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        uji1 uji1Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = uji1Var.collect(new x5s(vr20Var, (byte) 2), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = uji1Var.collect(new inu(vr20Var, (byte) 27), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = uji1Var.collect(new fwv(vr20Var, (byte) 3), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = uji1Var.collect(new o010(vr20Var, (byte) 15), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = uji1Var.collect(new dgk0(vr20Var, (byte) 0), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = uji1Var.collect(new xhr0(vr20Var, (byte) 4), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = uji1Var.collect(new xhr0(vr20Var, (byte) 5), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = uji1Var.collect(new xhr0(vr20Var, (byte) 6), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            default:
                Object objCollect9 = uji1Var.collect(new v4y0(vr20Var, (byte) 19), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
        }
    }
}
