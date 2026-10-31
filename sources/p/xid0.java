package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xid0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xid0(boolean z, boolean z2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        boolean z = this.c;
        boolean z2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                l0p1.c(z2, z, b0kVar, czo1.p(i | 1));
                break;
            default:
                vrq0.a(z2, z, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
