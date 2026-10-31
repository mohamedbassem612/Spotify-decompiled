package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y9a1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe01 b;
    public final /* synthetic */ baa1 c;

    public /* synthetic */ y9a1(xe01 xe01Var, baa1 baa1Var, byte b) {
        this.a = b;
        this.b = xe01Var;
        this.c = baa1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        baa1 baa1Var = this.c;
        xe01 xe01Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = xe01Var.a.collect(new x9a1(vr20Var, baa1Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = xe01Var.a.collect(new x9a1(vr20Var, baa1Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
