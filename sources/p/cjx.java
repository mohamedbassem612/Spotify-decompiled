package p;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cjx {
    public final View a;

    public cjx(View view) {
        this.a = view;
    }

    public final void a(int i) {
        int iC = l1d.C(i);
        View view = this.a;
        if (iC == 0) {
            view.performHapticFeedback(0);
            return;
        }
        if (iC == 1) {
            if (Build.VERSION.SDK_INT >= 27) {
                view.performHapticFeedback(9);
                return;
            } else {
                view.performHapticFeedback(4);
                return;
            }
        }
        if (iC == 2) {
            if (Build.VERSION.SDK_INT >= 34) {
                view.performHapticFeedback(23);
                return;
            } else {
                view.performHapticFeedback(1);
                return;
            }
        }
        if (iC != 3) {
            eg.o();
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            view.performHapticFeedback(24);
        } else if (i2 >= 27) {
            view.performHapticFeedback(8);
        } else {
            view.performHapticFeedback(1);
        }
    }
}
