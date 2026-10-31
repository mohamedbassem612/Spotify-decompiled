package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ked implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ mr20 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ked(mr20 mr20Var, Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.d = mr20Var;
        this.e = obj;
        this.b = obj2;
        this.c = i;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.b;
        Object obj2 = this.e;
        zed1 zed1Var = this.d;
        switch (b) {
            case 0:
                Object objCollect = ((ht20) zed1Var).collect(new n77(vr20Var, (bfd) obj2, (String) obj, this.c, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                ((ay8) zed1Var).collect(new c3r0(vr20Var, (zl5) obj2, (String) obj, this.c, (byte) 16), lnmVar);
                return d9nVar;
            default:
                Object objCollect2 = zed1Var.collect(new n77(vr20Var, (rfr0) obj2, (ufr0) obj, this.c, (byte) 3), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
