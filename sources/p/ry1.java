package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ry1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ry1(int i, iu30 iu30Var, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        iu30 iu30Var = this.c;
        int i2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                x9p1.a(i2, czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 1:
                fno1.c(i2, czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            case 2:
                nho1.e(i2, czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
            default:
                cso1.g(i2, czo1.p(i | 1), b0kVar, iu30Var, qim0Var);
                break;
        }
        return rih1Var;
    }
}
