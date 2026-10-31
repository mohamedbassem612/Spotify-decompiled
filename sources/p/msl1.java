package p;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class msl1 extends acq0 {
    public final WindowInsetsController c;
    public final Window d;

    public msl1(Window window, up41 up41Var) {
        this.c = window.getInsetsController();
        this.d = window;
    }

    public final void G(int i) {
        this.c.hide(i & (-9));
    }

    public void I(boolean z) {
        Window window = this.d;
        if (window != null) {
            if (!z) {
                Q(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.c;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    public void J(boolean z) {
        Window window = this.d;
        if (window != null) {
            if (!z) {
                Q(SemanticState.Multiline);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | SemanticState.Multiline);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.c;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    public void K(int i) {
        Window window = this.d;
        if (window == null) {
            this.c.setSystemBarsBehavior(i);
            return;
        }
        window.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            Q(6144);
            return;
        }
        if (i == 1) {
            Q(SemanticState.Obscured);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | SemanticState.Modal);
        } else {
            if (i != 2) {
                return;
            }
            Q(SemanticState.Modal);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | SemanticState.Obscured);
        }
    }

    public final void L(int i) {
        this.c.show(i & (-9));
    }

    public final void Q(int i) {
        View decorView = this.d.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
