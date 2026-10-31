package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jnj1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pnj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jnj1(pnj1 pnj1Var, byte b) {
        super(1);
        this.a = b;
        this.b = pnj1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pnj1 pnj1Var = this.b;
        switch (b) {
            case 0:
                ynj1 ynj1Var = (ynj1) obj;
                ioj1 ioj1Var = pnj1Var.x2;
                if (ioj1Var != null) {
                    ioj1Var.a(ynj1Var);
                    return rih1Var;
                }
                u890.C("pageStateController");
                throw null;
            case 1:
                ynj1 ynj1Var2 = (ynj1) obj;
                ioj1 ioj1Var2 = pnj1Var.x2;
                if (ioj1Var2 != null) {
                    ioj1Var2.a(ynj1Var2);
                    return rih1Var;
                }
                u890.C("pageStateController");
                throw null;
            case 2:
                ynj1 ynj1Var3 = (ynj1) obj;
                ioj1 ioj1Var3 = pnj1Var.x2;
                if (ioj1Var3 != null) {
                    ioj1Var3.a(ynj1Var3);
                    return rih1Var;
                }
                u890.C("pageStateController");
                throw null;
            default:
                ((Number) obj).intValue();
                return pnj1Var.F1.f().b();
        }
    }
}
