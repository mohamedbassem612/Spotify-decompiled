package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(int i, iu30 iu30Var, boolean z, int i2) {
        super(2);
        this.a = (byte) 4;
        this.d = i;
        this.c = iu30Var;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        iu30 iu30Var = this.c;
        int i = this.d;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                syo1.c(z, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                syo1.h(z, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                j2p1.k(z, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                h7p1.k(z, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                z47.k(i, czo1.p(1), b0kVar, iu30Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a30(byte b, int i, iu30 iu30Var, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = iu30Var;
        this.d = i;
    }
}
