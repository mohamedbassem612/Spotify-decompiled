package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ir9 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qt20 b;

    public /* synthetic */ ir9(qt20 qt20Var, byte b) {
        this.a = b;
        this.b = qt20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 0;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        qt20 qt20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = qt20Var.collect(new nz7(vr20Var, (byte) 28), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = qt20Var.collect(new bt9(vr20Var, (byte) 0), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = qt20Var.collect(new fwv(vr20Var, (byte) 21), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = qt20Var.collect(new fwv(vr20Var, (byte) 24), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = qt20Var.collect(new o010(vr20Var, b2), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = qt20Var.collect(new ilf0(vr20Var, (byte) 12), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = qt20Var.collect(new j4p0(vr20Var, (byte) 7), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            default:
                Object objCollect8 = qt20Var.collect(new v4y0(vr20Var, (byte) 20), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
        }
    }
}
