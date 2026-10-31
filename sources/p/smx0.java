package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class smx0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ umx0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ smx0(umx0 umx0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = umx0Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        umx0 umx0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                nmn1.a(umx0Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                nmn1.d(umx0Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                nmn1.i(umx0Var, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                nmn1.i(umx0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                nmn1.j(umx0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
