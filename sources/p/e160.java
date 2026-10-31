package p;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e160 implements Runnable {
    public final int a;
    public final View b;
    public final lc20 c;
    public final /* synthetic */ lc20 d;

    public e160(lc20 lc20Var, View view, int i, lc20 lc20Var2) {
        this.d = lc20Var;
        this.b = view;
        this.a = i;
        this.c = lc20Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        View view = this.b;
        if (view != null) {
            lc20 lc20Var = this.d;
            if (lc20.a(lc20Var) == null || !lc20.a(lc20Var).computeScrollOffset()) {
                return;
            }
            int currY = 0;
            boolean z = true;
            if (lc20.a(lc20Var).getCurrY() >= 0) {
                i = -1;
            } else {
                int currY2 = lc20.a(lc20Var).getCurrY();
                int i2 = this.a;
                if (currY2 <= i2) {
                    i = 1;
                    currY = i2;
                } else {
                    currY = lc20.a(lc20Var).getCurrY();
                    i = 1;
                    z = false;
                }
            }
            lc20 lc20Var2 = this.c;
            lc20Var2.n(currY);
            if (z) {
                lc20Var2.o((int) (Math.abs(lc20.a(lc20Var).getCurrVelocity()) * i));
                lc20.a(lc20Var).abortAnimation();
            } else {
                WeakHashMap weakHashMap = b8k1.a;
                view.postOnAnimation(this);
            }
        }
    }
}
