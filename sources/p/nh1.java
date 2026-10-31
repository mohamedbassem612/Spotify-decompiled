package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nh1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg1 b;
    public final /* synthetic */ af10 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nh1(yg1 yg1Var, af10 af10Var, iu30 iu30Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = yg1Var;
        this.c = af10Var;
        this.d = iu30Var;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                r6p1.b(this.b, this.c, this.d, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.e;
                int iP2 = czo1.p(1);
                t6p1.a(this.b, this.c, this.d, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
