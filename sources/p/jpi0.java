package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jpi0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fpi0 b;
    public final /* synthetic */ gw70 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpi0(fpi0 fpi0Var, gw70 gw70Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = fpi0Var;
                this.c = gw70Var;
                this.d = iu30Var;
                this.e = i;
                super(2);
                break;
            default:
                this.b = fpi0Var;
                this.c = gw70Var;
                this.d = iu30Var;
                this.e = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        gw70 gw70Var = this.c;
        fpi0 fpi0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                oto1.d(fpi0Var, gw70Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                oto1.e(fpi0Var, gw70Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
