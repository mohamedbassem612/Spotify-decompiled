package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ped implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ht20 b;
    public final /* synthetic */ bfd c;

    public /* synthetic */ ped(ht20 ht20Var, bfd bfdVar, byte b) {
        this.a = b;
        this.b = ht20Var;
        this.c = bfdVar;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        bfd bfdVar = this.c;
        ht20 ht20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = ht20Var.collect(new med(vr20Var, bfdVar, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = ht20Var.collect(new vnb((byte) 19, bfdVar, vr20Var), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
