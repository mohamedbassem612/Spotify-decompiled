package p;

import android.view.MotionEvent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class f75 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k75 b;

    public /* synthetic */ f75(k75 k75Var, byte b) {
        this.a = b;
        this.b = k75Var;
    }

    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k75 k75Var = this.b;
        switch (b) {
            case 0:
                k75Var.T0 = (iu30) obj;
                return rih1Var;
            case 1:
                ha4 ha4Var = (oxq0) obj;
                ha4 ha4Var2 = ha4Var instanceof ha4 ? ha4Var : null;
                if (ha4Var2 != null) {
                    ha4Var2.getAndroidViewsHandler$ui().removeViewInLayout(k75Var);
                    w0h1.k(ha4Var2.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(ha4Var2.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(k75Var));
                    k75Var.setImportantForAccessibility(0);
                }
                k75Var.removeAllViewsInLayout();
                return rih1Var;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = k75Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = k75Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
