package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ewb extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ewb(float f, int i, qim0 qim0Var) {
        super(2);
        this.c = f;
        this.b = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        qim0 qim0Var = this.b;
        float f = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                tm80.d(f, czo1.p(b2 | 1), b0kVar, qim0Var);
                break;
            case 1:
                upo1.n(f, czo1.p(1), b2, b0kVar, qim0Var);
                break;
            default:
                l4p1.l(f, czo1.p(1), b2, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ewb(float f, qim0 qim0Var, int i, int i2) {
        super(2);
        this.c = f;
        this.b = qim0Var;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ewb(qim0 qim0Var, float f, int i, int i2) {
        super(2);
        this.b = qim0Var;
        this.c = f;
        this.d = i2;
    }
}
