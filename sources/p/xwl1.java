package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xwl1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mw20 b;

    public /* synthetic */ xwl1(mw20 mw20Var, byte b) {
        this.a = b;
        this.b = mw20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        mw20 mw20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mw20Var.collect(new tji1(vr20Var, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = mw20Var.collect(new lpl1(vr20Var, (byte) 2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
