package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class il70 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jmr0 b;
    public final /* synthetic */ x9h c;
    public final /* synthetic */ String d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    public /* synthetic */ il70(jmr0 jmr0Var, x9h x9hVar, String str, qim0 qim0Var, int i, byte b) {
        this.a = b;
        this.b = jmr0Var;
        this.c = x9hVar;
        this.d = str;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = czo1.p(i | 1);
                ol70.a(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = czo1.p(i | 1);
                ol70.b(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
