package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k4r0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k4r0(mr20 mr20Var, Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        mr20 mr20Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = mr20Var.collect(new l2j0(this.c, vr20Var, (zl5) obj3, (zob1) obj2, (String) obj, (byte) 1), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = mr20Var.collect(new l2j0(this.c, vr20Var, (av61) obj3, (kv61) obj2, (zu61) obj, (byte) 2), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
