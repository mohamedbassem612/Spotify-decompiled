package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class be40 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a5y0 b;

    public /* synthetic */ be40(a5y0 a5y0Var, byte b) {
        this.a = b;
        this.b = a5y0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        a5y0 a5y0Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = a5y0Var.collect(new cy20(vr20Var, (byte) 19), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = a5y0Var.collect(new v4y0(vr20Var, (byte) 3), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = a5y0Var.collect(new yhg1(vr20Var, (byte) 27), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = a5y0Var.collect(new zmj1(vr20Var, (byte) 10), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
