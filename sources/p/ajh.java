package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ajh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ajh(byte b, int i, int i2, iu30 iu30Var) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = iu30Var;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        iu30 iu30Var = this.c;
        int i2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                t6p1.e(i2, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                dio1.h(i2, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                kbb.k(i2, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
