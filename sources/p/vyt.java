package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vyt implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ ezt c;
    public final /* synthetic */ oxt d;

    public /* synthetic */ vyt(bpb1 bpb1Var, ezt eztVar, oxt oxtVar, byte b) {
        this.a = b;
        this.b = bpb1Var;
        this.c = eztVar;
        this.d = oxtVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        oxt oxtVar = this.d;
        ezt eztVar = this.c;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new uyt(vr20Var, eztVar, oxtVar, (byte) 0), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = mr20Var.collect(new uyt(vr20Var, eztVar, oxtVar, (byte) 2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            default:
                Object objCollect3 = mr20Var.collect(new uyt(vr20Var, eztVar, oxtVar, (byte) 3), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
        }
    }
}
