package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vak0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vak0(int i, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        byte b2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                u2p1.e(b2, i, czo1.p(7), b0kVar);
                break;
            default:
                sjo0.g(b2, i, czo1.p(1), b0kVar);
                break;
        }
        return rih1Var;
    }
}
