package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sex extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ af5 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sex(af5 af5Var, qim0 qim0Var, int i) {
        super(2);
        this.b = af5Var;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        qim0 qim0Var = this.c;
        af5 af5Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                eqr0.c(af5Var, qim0Var, b0kVar, czo1.p(1), b2);
                break;
            default:
                o8h0.a(af5Var, qim0Var, b0kVar, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sex(af5 af5Var, qim0 qim0Var, int i, int i2) {
        super(2);
        this.b = af5Var;
        this.c = qim0Var;
        this.d = i2;
    }
}
