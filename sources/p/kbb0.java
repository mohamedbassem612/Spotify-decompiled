package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kbb0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ht20 b;
    public final /* synthetic */ o860 c;

    public /* synthetic */ kbb0(ht20 ht20Var, o860 o860Var, byte b) {
        this.a = b;
        this.b = ht20Var;
        this.c = o860Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        o860 o860Var = this.c;
        ht20 ht20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = ht20Var.collect(new jbb0(vr20Var, o860Var, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ht20Var.collect(new jbb0(vr20Var, o860Var, (byte) 1), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
