package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x6a implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe01 b;

    public /* synthetic */ x6a(xe01 xe01Var, byte b) {
        this.a = b;
        this.b = xe01Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        xe01 xe01Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = xe01Var.a.collect(new bt9(vr20Var, (byte) 7), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = xe01Var.a.collect(new gtp0(vr20Var, (byte) 27), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = xe01Var.a.collect(new g6z0(vr20Var, (byte) 2), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
