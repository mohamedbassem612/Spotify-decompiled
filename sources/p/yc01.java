package p;

import android.app.Activity;
import android.os.Build;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yc01 implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ yc01(Activity activity, byte b) {
        this.a = b;
        this.b = activity;
    }

    public final void dispose() {
        Window window;
        nsl1 lsl1Var;
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                if (activity != null && (window = activity.getWindow()) != null) {
                    up41 up41Var = new up41(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        lsl1Var = new nsl1(window, up41Var);
                    } else if (i >= 30) {
                        lsl1Var = new msl1(window, up41Var);
                    } else {
                        lsl1Var = i >= 26 ? new lsl1(window, up41Var) : new ksl1(window, up41Var);
                    }
                    lsl1Var.L(1);
                    break;
                }
                break;
            default:
                activity.getWindow().clearFlags(8192);
                break;
        }
    }
}
