package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class svd extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iac0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ svd(iac0 iac0Var, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = iac0Var;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iac0 iac0Var = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                rjd rjdVar = new rjd(ven0Var, (byte) 1);
                iac0Var.getLifecycle().a(rjdVar);
                return new ht0(iac0Var, rjdVar, (byte) 8);
            default:
                x9d0 x9d0Var = new x9d0(ven0Var, (byte) 1);
                iac0Var.getLifecycle().a(x9d0Var);
                return new w9d0(iac0Var, x9d0Var, (byte) 4);
        }
    }
}
