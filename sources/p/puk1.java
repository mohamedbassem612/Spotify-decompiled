package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class puk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qyk1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ puk1(qyk1 qyk1Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = qyk1Var;
        this.c = iu30Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        iu30 iu30Var = this.c;
        qyk1 qyk1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                j82.b(qyk1Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                j82.g(qyk1Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                j82.w(qyk1Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
