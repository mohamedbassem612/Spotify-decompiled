package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class im10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ osv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im10(osv0 osv0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = osv0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        osv0 osv0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                pwo1.b(osv0Var, b0kVar, czo1.p(49));
                break;
            default:
                pwo1.c(osv0Var, b0kVar, czo1.p(49));
                break;
        }
        return rih1Var;
    }
}
