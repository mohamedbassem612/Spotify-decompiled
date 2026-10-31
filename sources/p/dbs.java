package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dbs implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uji1 b;

    public /* synthetic */ dbs(uji1 uji1Var, byte b) {
        this.a = b;
        this.b = uji1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        uji1 uji1Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = uji1Var.collect(new x5s(vr20Var, (byte) 9), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = uji1Var.collect(new cy20(vr20Var, (byte) 2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = uji1Var.collect(new cy20(vr20Var, (byte) 3), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            default:
                Object objCollect4 = uji1Var.collect(new uk50(vr20Var, (byte) 16), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
        }
    }
}
