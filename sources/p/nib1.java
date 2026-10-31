package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nib1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rib1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nib1(rib1 rib1Var, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = rib1Var;
        this.c = z;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        boolean z = this.c;
        rib1 rib1Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                xzn1.b(rib1Var, z, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                xzn1.g(rib1Var, z, b0kVar, czo1.p(i | 1));
                break;
            default:
                xzn1.h(rib1Var, z, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
