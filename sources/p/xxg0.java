package p;

import android.animation.ObjectAnimator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xxg0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byg0 b;
    public final /* synthetic */ dg30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxg0(byg0 byg0Var, dg30 dg30Var, byte b) {
        super(0);
        this.a = b;
        this.b = byg0Var;
        this.c = dg30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byg0 byg0Var = this.b;
        switch (b) {
            case 0:
                dg30 dg30Var = this.c;
                tr0 tr0Var = new tr0(byg0Var, dg30Var, (byte) 2);
                h72 h72Var = byg0Var.n;
                if (h72Var == null) {
                    tr0Var.invoke();
                } else {
                    h72Var.Q(p7h.M(new ObjectAnimator[]{(ObjectAnimator) h72Var.c, (ObjectAnimator) h72Var.e, (ObjectAnimator) h72Var.i, (ObjectAnimator) h72Var.g, (ObjectAnimator) h72Var.X}), new lwg0(tr0Var, dg30Var, (byte) 1), hlv.a, 300L);
                }
                break;
            default:
                dg30 dg30Var2 = this.c;
                if (dg30Var2 != null) {
                    iug0 iug0Var = byg0Var.b;
                    tmq0 tmq0Var = iug0Var.N0;
                    w0o1.r(dg30Var2, tmq0Var.c, iug0Var.Z, iug0Var.a, tmq0Var.a, tmq0Var.b, tmq0Var.d, tmq0Var.e);
                }
                break;
        }
        return rih1Var;
    }
}
