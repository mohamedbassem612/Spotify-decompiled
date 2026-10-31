package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class byj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yxj0 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ byj0(yxj0 yxj0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = yxj0Var;
        this.c = iu30Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        iu30 iu30Var = this.c;
        yxj0 yxj0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                u1p1.j(yxj0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                u1p1.l(yxj0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
