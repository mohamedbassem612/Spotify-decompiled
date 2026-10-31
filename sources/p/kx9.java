package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kx9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx9(int i, boolean z, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 3;
        this.c = i;
        this.d = z;
        this.b = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        qim0 qim0Var = this.b;
        boolean z = this.d;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                k4p1.a(czo1.p(i | 1), b0kVar, qim0Var, z);
                break;
            case 1:
                x4p1.f(czo1.p(i | 1), z ? 1 : 0, b0kVar, qim0Var);
                break;
            case 2:
                b5p1.d(czo1.p(i | 1), z ? 1 : 0, b0kVar, qim0Var);
                break;
            case 3:
                rjo1.m(i, czo1.p(1), b0kVar, qim0Var, z);
                break;
            case 4:
                qxd0.x(i, czo1.p(1), b0kVar, qim0Var, z);
                break;
            default:
                f3o1.a(czo1.p(i | 1), b0kVar, qim0Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kx9(byte b, int i, int i2, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx9(boolean z, int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 4;
        this.d = z;
        this.c = i;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx9(boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = z;
        this.b = qim0Var;
        this.c = i;
    }
}
