package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lx9 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gx9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lx9(gx9 gx9Var, byte b) {
        super(3);
        this.a = b;
        this.b = gx9Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        gx9 gx9Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                if (!(gx9Var instanceof dx9)) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-84249113);
                    x340Var2.r(false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-84338486);
                    dx9 dx9Var = (dx9) gx9Var;
                    k4p1.c(384, dx9Var.a, dx9Var.b, x340Var3, u291.d(nim0Var, 1.0f));
                    x340Var3.r(false);
                }
                break;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (!(gx9Var instanceof ex9)) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(851011984);
                    x340Var5.r(false);
                } else {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(850917806);
                    ex9 ex9Var = (ex9) gx9Var;
                    k4p1.f(384, ex9Var.a, ex9Var.b, x340Var6, u291.d(nim0Var, 1.0f));
                    x340Var6.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
