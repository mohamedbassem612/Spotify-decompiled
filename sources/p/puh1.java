package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class puh1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f5y0 b;

    public /* synthetic */ puh1(f5y0 f5y0Var, byte b) {
        this.a = b;
        this.b = f5y0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        f5y0 f5y0Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = f5y0Var.collect(new yhg1(vr20Var, (byte) 28), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = f5y0Var.collect(new lpl1(vr20Var, (byte) 6), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
