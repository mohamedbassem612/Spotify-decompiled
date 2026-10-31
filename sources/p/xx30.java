package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xx30 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zx30 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx30(zx30 zx30Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = zx30Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        zx30 zx30Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                lcc.d(zx30Var, iu30Var, b0kVar, czo1.p(9));
                break;
            default:
                lcc.e(zx30Var, iu30Var, b0kVar, czo1.p(9));
                break;
        }
        return rih1Var;
    }
}
