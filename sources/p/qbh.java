package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qbh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qbh(qim0 qim0Var, j2i j2iVar, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.c = j2iVar;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.e;
        byte b2 = this.d;
        j2i j2iVar = this.c;
        qim0 qim0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                b6p1.c(czo1.p(b2 | 1), z ? 1 : 0, j2iVar, b0kVar, qim0Var);
                break;
            default:
                zko1.d(czo1.p(b2 | 1), z ? 1 : 0, j2iVar, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }
}
