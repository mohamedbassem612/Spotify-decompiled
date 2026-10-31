package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y9i0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y9i0(int i, j2i j2iVar, int i2) {
        super(2);
        this.b = i;
        this.d = j2iVar;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.c;
        Object obj3 = this.d;
        int i = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                boo1.n((z9i0) obj3, b2, b0kVar, czo1.p(i | 1));
                break;
            default:
                w0o1.d(i, (j2i) obj3, b0kVar, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public y9i0(z9i0 z9i0Var, int i, int i2) {
        super(2);
        this.d = z9i0Var;
        this.c = i;
        this.b = i2;
    }
}
