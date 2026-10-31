package p;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e75 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k75 b;
    public final /* synthetic */ hmb0 c;

    public /* synthetic */ e75(k75 k75Var, hmb0 hmb0Var, byte b) {
        this.a = b;
        this.b = k75Var;
        this.c = hmb0Var;
    }

    public final Object invoke(Object obj) {
        WindowInsets windowInsetsF;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hmb0 hmb0Var = this.c;
        k75 k75Var = this.b;
        switch (b) {
            case 0:
                m87.l(k75Var, hmb0Var);
                k75Var.c.g1 = true;
                int[] iArr = k75Var.Q0;
                int i = iArr[0];
                int i2 = iArr[1];
                View view = k75Var.b;
                view.getLocationOnScreen(iArr);
                long j = k75Var.R0;
                long jB = ((elb0) obj).b();
                k75Var.R0 = jB;
                hsl1 hsl1Var = k75Var.S0;
                if (hsl1Var != null && ((i != iArr[0] || i2 != iArr[1] || !yr80.b(j, jB)) && (windowInsetsF = k75Var.h(hsl1Var).f()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsF);
                }
                break;
            case 1:
                View view2 = k75Var.b;
                ha4 ha4Var = (oxq0) obj;
                ha4 ha4Var2 = ha4Var instanceof ha4 ? ha4Var : null;
                if (ha4Var2 != null) {
                    ha4Var2.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(k75Var, hmb0Var);
                    ha4Var2.getAndroidViewsHandler$ui().addView(k75Var);
                    ha4Var2.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(hmb0Var, k75Var);
                    k75Var.setImportantForAccessibility(1);
                    b8k1.p(k75Var, new ca4(ha4Var2, hmb0Var, ha4Var2));
                }
                if (view2.getParent() != k75Var) {
                    k75Var.addView(view2);
                }
                break;
            default:
                m87.l(k75Var, hmb0Var);
                break;
        }
        return rih1Var;
    }
}
