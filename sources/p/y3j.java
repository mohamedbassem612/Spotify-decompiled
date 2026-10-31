package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y3j extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ rho0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3j(iu30 iu30Var, rho0 rho0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = rho0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rho0 rho0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new pho0(rho0Var.a.a.a));
                break;
            default:
                iu30Var.invoke(new pho0(rho0Var.a.a.a));
                break;
        }
        return rih1Var;
    }
}
