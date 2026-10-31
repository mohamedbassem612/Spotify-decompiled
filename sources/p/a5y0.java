package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a5y0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ i5y0 c;

    public /* synthetic */ a5y0(mr20 mr20Var, i5y0 i5y0Var, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = i5y0Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        i5y0 i5y0Var = this.c;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new z4y0(vr20Var, i5y0Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = mr20Var.collect(new z4y0(vr20Var, i5y0Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
