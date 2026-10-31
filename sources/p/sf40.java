package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sf40 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sf40(int i, qim0 qim0Var, int i2) {
        super(2);
        this.b = i;
        this.c = qim0Var;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        qim0 qim0Var = this.c;
        int i = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                tf40.c(czo1.p(i | 1), b2, b0kVar, qim0Var);
                break;
            default:
                i1k0.f(i, czo1.p(b2 | 1), b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sf40(qim0 qim0Var, int i, int i2) {
        super(2);
        this.c = qim0Var;
        this.b = i;
        this.d = i2;
    }
}
