package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xda0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dea0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xda0(dea0 dea0Var, byte b) {
        super(4);
        this.a = b;
        this.b = dea0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        dea0 dea0Var = this.b;
        switch (b) {
            case 0:
                tda0 tda0Var = (tda0) obj;
                ((Number) obj3).intValue();
                return new sal0((bbl0) dea0Var.h, tda0Var.a.a, y9g1.A(tda0Var.h));
            default:
                tda0 tda0Var2 = (tda0) obj;
                ((Number) obj3).intValue();
                return new zal0((bbl0) dea0Var.h, tda0Var2.a.a, y9g1.A(tda0Var2.h));
        }
    }
}
