package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xxx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xxx(int i, qim0 qim0Var, int i2, j2i j2iVar, int i3, int i4) {
        super(2);
        this.b = i;
        this.c = qim0Var;
        this.d = i2;
        this.g = j2iVar;
        this.e = i3;
        this.f = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                int i2 = this.b;
                qim0 qim0Var = this.c;
                int i3 = this.d;
                suo1.e(i2, qim0Var, i3, (j2i) obj3, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                suo1.f((String) obj3, this.b, this.c, this.d, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xxx(String str, int i, qim0 qim0Var, int i2, int i3, int i4) {
        super(2);
        this.g = str;
        this.b = i;
        this.c = qim0Var;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }
}
