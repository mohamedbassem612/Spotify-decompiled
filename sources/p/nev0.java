package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nev0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe01 b;

    public /* synthetic */ nev0(xe01 xe01Var, byte b) {
        this.a = b;
        this.b = xe01Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 29;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        xe01 xe01Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = xe01Var.a.collect(new dfu0(vr20Var, (byte) 22), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = xe01Var.a.collect(new g6z0(vr20Var, (byte) 5), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = xe01Var.a.collect(new g6z0(vr20Var, (byte) 11), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = xe01Var.a.collect(new wl01(vr20Var, b2), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = xe01Var.a.collect(new hu51(vr20Var, (byte) 21), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = xe01Var.a.collect(new oq0(vr20Var, (byte) 29), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = xe01Var.a.collect(new bw71(vr20Var, (byte) 26), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = xe01Var.a.collect(new ae91(vr20Var, (byte) 9), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = xe01Var.a.collect(new ae91(vr20Var, (byte) 24), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = xe01Var.a.collect(new ae91(vr20Var, (byte) 29), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = xe01Var.a.collect(new cza1(vr20Var, (byte) 7), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = xe01Var.a.collect(new yhg1(vr20Var, (byte) 9), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            default:
                Object objCollect13 = xe01Var.a.collect(new qzh1(vr20Var, (byte) 10), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
        }
    }
}
