package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mso0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oso0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mso0(oso0 oso0Var, byte b) {
        super(0);
        this.a = b;
        this.b = oso0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oso0 oso0Var = this.b;
        switch (b) {
            case 0:
                oso0Var.Z0();
                zso0 zso0Var = oso0Var.J1;
                if (zso0Var != null) {
                    zso0Var.c(1);
                }
                oso0Var.Y0(ywy0.a);
                lcs lcsVar = oso0Var.G1;
                if (lcsVar != null) {
                    lcsVar.a(oso0Var.N0(), oso0Var.I1, 2);
                }
                break;
            case 1:
                oso0Var.Z0();
                oso0Var.Y0(wwy0.a);
                zso0 zso0Var2 = oso0Var.J1;
                if (zso0Var2 != null) {
                    zso0Var2.c(2);
                }
                break;
            default:
                oso0Var.Z0();
                oso0Var.Y0(cxy0.a);
                zso0 zso0Var3 = oso0Var.J1;
                if (zso0Var3 != null) {
                    zso0Var3.c(3);
                }
                break;
        }
        return rih1Var;
    }
}
