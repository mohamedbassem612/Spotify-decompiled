package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rbh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ j2i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rbh(int i, j2i j2iVar, qim0 qim0Var, boolean z) {
        super(2);
        this.a = (byte) 3;
        this.c = qim0Var;
        this.b = z;
        this.d = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        j2i j2iVar = this.d;
        qim0 qim0Var = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                e6p1.b(czo1.p(49), z ? 1 : 0, j2iVar, b0kVar, qim0Var);
                break;
            case 1:
                yto1.f(czo1.p(3121), j2iVar, b0kVar, qim0Var, z);
                break;
            case 2:
                i8p1.e(czo1.p(385), j2iVar, b0kVar, qim0Var, z);
                break;
            case 3:
                a8o.g(czo1.p(385), j2iVar, b0kVar, qim0Var, z);
                break;
            case 4:
                htj0.b(czo1.p(1572865), j2iVar, b0kVar, qim0Var, z);
                break;
            case 5:
                v1p1.b(czo1.p(49), z ? 1 : 0, j2iVar, b0kVar, qim0Var);
                break;
            default:
                sv71.a(czo1.p(49), z ? 1 : 0, j2iVar, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rbh(qim0 qim0Var, j2i j2iVar, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.d = j2iVar;
        this.b = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rbh(boolean z, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = qim0Var;
        this.d = j2iVar;
    }
}
