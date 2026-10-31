package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z1o0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ v3o0 b;
    public final /* synthetic */ vtp c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1o0(v3o0 v3o0Var, vtp vtpVar, iu30 iu30Var) {
        super(2);
        this.b = v3o0Var;
        this.c = vtpVar;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        vtp vtpVar = this.c;
        v3o0 v3o0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    j0o1.a(v3o0Var.d, vtpVar, iu30Var, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                j0o1.k(v3o0Var, vtpVar, iu30Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1o0(v3o0 v3o0Var, vtp vtpVar, iu30 iu30Var, int i) {
        super(2);
        this.b = v3o0Var;
        this.c = vtpVar;
        this.d = iu30Var;
    }
}
