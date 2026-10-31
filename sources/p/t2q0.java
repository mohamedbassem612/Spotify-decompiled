package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t2q0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u2q0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2q0(u2q0 u2q0Var, byte b) {
        super(0);
        this.a = b;
        this.b = u2q0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        u2q0 u2q0Var = this.b;
        switch (b) {
            case 0:
                tro0 tro0Var = u2q0Var.a2;
                if (tro0Var != null) {
                    tro0Var.invoke();
                }
                lzn0 lzn0Var = u2q0Var.Y1;
                if (lzn0Var == null) {
                    u890.C("navigator");
                    throw null;
                }
                lzn0Var.h(bhl.a);
                u2q0Var.dismiss();
                return rih1Var;
            default:
                tro0 tro0Var2 = u2q0Var.b2;
                if (tro0Var2 != null) {
                    tro0Var2.invoke();
                }
                u2q0Var.dismiss();
                return rih1Var;
        }
    }
}
