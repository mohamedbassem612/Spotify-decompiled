package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w9s implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe01 b;
    public final /* synthetic */ y9s c;

    public /* synthetic */ w9s(xe01 xe01Var, y9s y9sVar, byte b) {
        this.a = b;
        this.b = xe01Var;
        this.c = y9sVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        y9s y9sVar = this.c;
        xe01 xe01Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = xe01Var.a.collect(new v9s(vr20Var, y9sVar, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = xe01Var.a.collect(new v9s(vr20Var, y9sVar, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
