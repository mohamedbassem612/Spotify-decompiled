package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p90 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zob1 b;

    public /* synthetic */ p90(zob1 zob1Var, byte b) {
        this.a = b;
        this.b = zob1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 16;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        zob1 zob1Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = zob1Var.collect(new mf(vr20Var, (byte) 10), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = zob1Var.collect(new pl1(vr20Var, (byte) 26), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = zob1Var.collect(new oq0(vr20Var, (byte) 1), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = zob1Var.collect(new y3e(vr20Var, (byte) 4), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = zob1Var.collect(new y3e(vr20Var, b2), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = zob1Var.collect(new w0x(vr20Var, (byte) 27), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = zob1Var.collect(new xnc0(vr20Var, (byte) 13), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = zob1Var.collect(new gtp0(vr20Var, (byte) 24), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = zob1Var.collect(new wl01(vr20Var, (byte) 16), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = zob1Var.collect(new wl01(vr20Var, (byte) 20), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                Object objCollect11 = zob1Var.collect(new wl01(vr20Var, (byte) 27), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 11:
                Object objCollect12 = zob1Var.collect(new wl01(vr20Var, (byte) 28), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 12:
                Object objCollect13 = zob1Var.collect(new tm61(vr20Var, (byte) 2), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 13:
                Object objCollect14 = zob1Var.collect(new tm61(vr20Var, (byte) 3), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            default:
                Object objCollect15 = zob1Var.collect(new qmd1(vr20Var, (byte) 0), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
        }
    }
}
