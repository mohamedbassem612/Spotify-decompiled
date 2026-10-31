package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class py3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public py3(int i, j2i j2iVar, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 1;
        this.b = qim0Var;
        this.c = j2iVar;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        j2i j2iVar = this.c;
        qim0 qim0Var = this.b;
        boolean z = this.e;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                vby0.a(czo1.p(i | 1), j2iVar, (b0k) obj, qim0Var, z);
                break;
            case 1:
                ((Number) obj2).intValue();
                m1p1.k(czo1.p(i | 1), z ? 1 : 0, j2iVar, (b0k) obj, qim0Var);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP = czo1.p(3073);
                qxy0.c(this.d, iP, this.c, (b0k) obj, this.b, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                l6p1.d(czo1.p(i | 1), j2iVar, (b0k) obj, qim0Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public py3(int i, int i2, j2i j2iVar, qim0 qim0Var, boolean z) {
        super(2);
        this.a = (byte) 2;
        this.d = i;
        this.e = z;
        this.b = qim0Var;
        this.c = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py3(boolean z, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.e = z;
        this.b = qim0Var;
        this.c = j2iVar;
        this.d = i;
    }
}
