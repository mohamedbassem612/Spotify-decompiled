package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class veb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ teb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ veb1(teb1 teb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = teb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        teb1 teb1Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(teb1Var.b);
            default:
                tey0 tey0VarR = dko1.r((hwq) obj, teb1Var.b, teb1Var.c);
                c1x0 c1x0Var = tey0VarR instanceof c1x0 ? (c1x0) tey0VarR : null;
                return c1x0Var == null ? new c1x0((String) null, (x4i1) null, 7) : c1x0Var;
        }
    }
}
