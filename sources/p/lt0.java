package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lt0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;

    public /* synthetic */ lt0(mr20 mr20Var, byte b) {
        this.a = b;
        this.b = mr20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 2;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new mf(vr20Var, (byte) 18), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = mr20Var.collect(new oq0(vr20Var, b2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = mr20Var.collect(new ulm(vr20Var, (byte) 23), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = mr20Var.collect(new fwv(vr20Var, (byte) 20), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = mr20Var.collect(new o010(vr20Var, (byte) 24), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = mr20Var.collect(new xhr0(vr20Var, (byte) 2), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = mr20Var.collect(new dfu0(vr20Var, (byte) 5), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = mr20Var.collect(new oq0(vr20Var, (byte) 25), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            default:
                Object objCollect9 = mr20Var.collect(new oq0(vr20Var, (byte) 26), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
        }
    }
}
