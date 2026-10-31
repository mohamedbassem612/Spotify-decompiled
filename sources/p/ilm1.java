package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ilm1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vlj1 b;

    public /* synthetic */ ilm1(vlj1 vlj1Var, byte b) {
        this.a = b;
        this.b = vlj1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        vlj1 vlj1Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = vlj1Var.collect(new lpl1(vr20Var, (byte) 23), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = vlj1Var.collect(new lpl1(vr20Var, (byte) 24), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
