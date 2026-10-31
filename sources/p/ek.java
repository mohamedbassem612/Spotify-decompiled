package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ek implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lt20 b;

    public /* synthetic */ ek(lt20 lt20Var, byte b) {
        this.a = b;
        this.b = lt20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        lt20 lt20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = lt20Var.collect(new mf(vr20Var, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = lt20Var.collect(new y3e(vr20Var, (byte) 27), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = lt20Var.collect(new uk50(vr20Var, b2), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = lt20Var.collect(new j4p0(vr20Var, (byte) 18), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = lt20Var.collect(new gtp0(vr20Var, (byte) 7), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = lt20Var.collect(new g6z0(vr20Var, (byte) 17), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            default:
                Object objCollect7 = lt20Var.collect(new lpl1(vr20Var, (byte) 28), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
        }
    }
}
