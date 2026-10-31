package p;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xk5 extends lm5 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ WeakReference f;
    public final /* synthetic */ bl5 g;

    public xk5(bl5 bl5Var, int i, int i2, WeakReference weakReference) {
        this.g = bl5Var;
        this.d = i;
        this.e = i2;
        this.f = weakReference;
    }

    public final void o(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.d) != -1) {
            typeface = ph5.e(typeface, i, (this.e & 2) != 0);
        }
        bl5 bl5Var = this.g;
        if (bl5Var.n) {
            bl5Var.l = typeface;
            TextView textView = (TextView) this.f.get();
            if (textView != null) {
                boolean zIsAttachedToWindow = textView.isAttachedToWindow();
                int i2 = bl5Var.j;
                if (zIsAttachedToWindow) {
                    textView.post(new wr3(textView, typeface, i2, (byte) 1));
                } else {
                    bl5.d(textView, typeface, i2);
                }
            }
        }
    }
}
