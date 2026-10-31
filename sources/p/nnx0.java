package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nnx0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hft0 b;
    public final /* synthetic */ set0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nnx0(hft0 hft0Var, set0 set0Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hft0Var;
        this.c = set0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        set0 set0Var = this.c;
        hft0 hft0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                hon1.d(hft0Var, set0Var, iu30Var, b0kVar, czo1.p(1));
                break;
            default:
                n8p1.f(hft0Var, set0Var, iu30Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
