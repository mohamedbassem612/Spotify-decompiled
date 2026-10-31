package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ks41 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ tob1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks41(xtb0 xtb0Var, tob1 tob1Var, byte b) {
        super(0);
        this.a = b;
        this.b = xtb0Var;
        this.c = tob1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        int iIntValue = 0;
        z = false;
        tob1 tob1Var = this.c;
        xtb0 xtb0Var = this.b;
        switch (b) {
            case 0:
                if (xtb0Var.d() && !((Boolean) tob1Var.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                qtb0 qtb0Var = (qtb0) o7h.s0(xtb0Var.h().l);
                if (qtb0Var != null) {
                    iIntValue = ((Number) tob1Var.getValue()).intValue() * qtb0Var.q;
                }
                return Integer.valueOf(iIntValue);
        }
    }
}
