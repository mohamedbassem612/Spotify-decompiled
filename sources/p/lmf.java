package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lmf implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mnc0 b;

    public /* synthetic */ lmf(mnc0 mnc0Var, byte b) {
        this.a = b;
        this.b = mnc0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mnc0 mnc0Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mnc0Var.collect(new kmf(vr20Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = mnc0Var.collect(new uk50(vr20Var, (byte) 17), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = mnc0Var.collect(new xnc0(vr20Var, (byte) 22), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = mnc0Var.collect(new fed0(vr20Var, (byte) 5), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = mnc0Var.collect(new fed0(vr20Var, (byte) 13), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = mnc0Var.collect(new zmj1(vr20Var, (byte) 9), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = mnc0Var.collect(new lpl1(vr20Var, (byte) 26), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            default:
                Object objCollect8 = mnc0Var.collect(new lpl1(vr20Var, (byte) 27), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
        }
    }
}
