package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x9d0 implements aac0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ x9d0(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                if (k8c0Var == k8c0.ON_RESUME) {
                    ((Function0) ven0Var.getValue()).invoke();
                }
                break;
            case 1:
                int i = g8i0.a[k8c0Var.ordinal()];
                if (i == 1) {
                    ((iu30) ven0Var.getValue()).invoke(d5i0.a);
                    break;
                } else if (i == 2) {
                    ((iu30) ven0Var.getValue()).invoke(e5i0.a);
                    break;
                }
                break;
            case 2:
                if (k8c0Var == k8c0.ON_PAUSE) {
                    ((iu30) ven0Var.getValue()).invoke(new x571(false));
                }
                break;
            default:
                if (k8c0Var == k8c0.ON_PAUSE) {
                    rm71 rm71Var = (rm71) ven0Var.getValue();
                    rm71Var.a.invoke(new rg71(false));
                }
                if (k8c0Var == k8c0.ON_RESUME) {
                    rm71 rm71Var2 = (rm71) ven0Var.getValue();
                    rm71Var2.a.invoke(new rg71(true));
                }
                break;
        }
    }
}
