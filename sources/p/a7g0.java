package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a7g0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g7g0 b;
    public final /* synthetic */ vzq0 c;
    public final /* synthetic */ pbq d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7g0(g7g0 g7g0Var, vzq0 vzq0Var, pbq pbqVar, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = g7g0Var;
        this.c = vzq0Var;
        this.d = pbqVar;
        this.e = iu30Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                men1.g(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                men1.i(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
