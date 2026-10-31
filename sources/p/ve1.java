package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ve1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x010 b;

    public /* synthetic */ ve1(x010 x010Var, byte b) {
        this.a = b;
        this.b = x010Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        x010 x010Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = x010Var.collect(new mf(vr20Var, (byte) 28), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = x010Var.collect(new tv5(vr20Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = x010Var.collect(new nz7(vr20Var, (byte) 1), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = x010Var.collect(new y0l(vr20Var, (byte) 0), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = x010Var.collect(new y0l(vr20Var, (byte) 25), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = x010Var.collect(new k9t(vr20Var, (byte) 15), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = x010Var.collect(new w0x(vr20Var, (byte) 3), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = x010Var.collect(new i2e0(vr20Var, (byte) 5), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            default:
                Object objCollect9 = x010Var.collect(new g6z0(vr20Var, (byte) 22), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
        }
    }
}
