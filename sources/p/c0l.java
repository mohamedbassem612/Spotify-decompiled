package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c0l implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ht20 b;

    public /* synthetic */ c0l(ht20 ht20Var, byte b) {
        this.a = b;
        this.b = ht20Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        ht20 ht20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = ht20Var.collect(new x1h(vr20Var, (byte) 25), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ht20Var.collect(new g6z0(vr20Var, (byte) 4), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = ht20Var.collect(new bw71(vr20Var, (byte) 17), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
