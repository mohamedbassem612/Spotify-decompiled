package p;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ksl1 extends acq0 {
    public final Window c;
    public final up41 d;

    public ksl1(Window window, up41 up41Var) {
        this.c = window;
        this.d = up41Var;
    }

    public final void G(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    Q(4);
                } else if (i2 == 2) {
                    Q(2);
                } else if (i2 == 8) {
                    this.d.l();
                }
            }
        }
    }

    public final void J(boolean z) {
        if (!z) {
            R(8192);
            return;
        }
        Window window = this.c;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        Q(8192);
    }

    public final void K(int i) {
        this.c.getDecorView().setTag(356039078, Integer.valueOf(i));
        if (i == 0) {
            R(6144);
            return;
        }
        if (i == 1) {
            R(4096);
            Q(2048);
        } else {
            if (i != 2) {
                return;
            }
            R(2048);
            Q(4096);
        }
    }

    public final void L(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    R(4);
                    this.c.clearFlags(1024);
                } else if (i2 == 2) {
                    R(2);
                } else if (i2 == 8) {
                    this.d.s();
                }
            }
        }
    }

    public final void Q(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void R(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
