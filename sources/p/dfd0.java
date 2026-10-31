package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dfd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hux b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dfd0(hux huxVar, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = huxVar;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        int i = this.c;
        hux huxVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                g0p1.k(i, czo1.p(b2 | 1), b0kVar, huxVar);
                break;
            case 1:
                yah0.b(i, czo1.p(b2 | 1), b0kVar, huxVar);
                break;
            default:
                p1p1.b(i, czo1.p(b2 | 1), b0kVar, huxVar);
                break;
        }
        return rih1Var;
    }
}
