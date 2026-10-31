package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oeb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ peb1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oeb1(peb1 peb1Var, byte b) {
        super(1);
        this.a = b;
        this.b = peb1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        peb1 peb1Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(peb1Var.a);
            default:
                tey0 tey0VarR = dko1.r((hwq) obj, peb1Var.a, peb1Var.c);
                am1 am1Var = tey0VarR instanceof am1 ? (am1) tey0VarR : null;
                return am1Var == null ? new am1(26, "", null, "", false, false) : am1Var;
        }
    }
}
