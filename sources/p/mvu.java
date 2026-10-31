package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mvu implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ gvu c;

    public /* synthetic */ mvu(zob1 zob1Var, gvu gvuVar, byte b) {
        this.a = b;
        this.b = zob1Var;
        this.c = gvuVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        gvu gvuVar = this.c;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new lvu(vr20Var, gvuVar, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = mr20Var.collect(new lvu(vr20Var, gvuVar, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
