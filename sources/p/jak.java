package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jak implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fu20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ jak(fu20 fu20Var, String str, byte b) {
        this.a = b;
        this.b = fu20Var;
        this.c = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        String str = this.c;
        fu20 fu20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = fu20Var.collect(new st(vr20Var, str, (byte) 20), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = fu20Var.collect(new buc0(vr20Var, str, (byte) 28), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
