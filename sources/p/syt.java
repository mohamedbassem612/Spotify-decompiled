package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class syt implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ mr20 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ syt(mr20 mr20Var, Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = mr20Var;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = j;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        m441 m441Var = this.c;
        switch (b) {
            case 0:
                Object objCollect = ((any) m441Var).collect(new txt(vr20Var, (ezt) obj3, (oxt) obj2, (iwc1) obj, this.b), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            default:
                Object objCollect2 = m441Var.collect(new m1e0(vr20Var, (zad0) obj3, (String) obj2, (gad0) obj, this.b), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
        }
    }
}
