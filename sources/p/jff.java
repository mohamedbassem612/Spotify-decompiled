package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jff implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mnc0 b;

    public /* synthetic */ jff(mnc0 mnc0Var, byte b) {
        this.a = b;
        this.b = mnc0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 25;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mnc0 mnc0Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mnc0Var.collect(new y3e(vr20Var, (byte) 25), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = mnc0Var.collect(new y3e(vr20Var, (byte) 28), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = mnc0Var.collect(new uk50(vr20Var, (byte) 19), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = mnc0Var.collect(new xnc0(vr20Var, b2), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
