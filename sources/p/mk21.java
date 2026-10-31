package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mk21 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk21(nk21 nk21Var, byte b) {
        super(1);
        this.a = b;
        this.b = nk21Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nk21 nk21Var = this.b;
        switch (b) {
            case 0:
                ul21 ul21Var = nk21Var.c;
                ql21 ql21Var = ul21Var.a;
                el21 el21Var = ul21Var.b;
                ul21Var.a = null;
                ul21Var.b = null;
                if (el21Var != null && ql21Var != null) {
                    ql21Var.invoke(el21Var);
                }
                return rih1Var;
            case 1:
                return new hp0(nk21Var.d.c(new mk21(nk21Var, (byte) 0)), (byte) 15);
            default:
                nk21Var.c.b = (el21) obj;
                nk21Var.b.c("");
                return rih1Var;
        }
    }
}
