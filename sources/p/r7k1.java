package p;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class r7k1 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(2131431213);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static hsl1 b(View view, hsl1 hsl1Var, Rect rect) {
        WindowInsets windowInsetsF = hsl1Var.f();
        if (windowInsetsF != null) {
            return hsl1.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return hsl1Var;
    }

    public static void c(View view, k1q0 k1q0Var) {
        q7k1 q7k1Var = k1q0Var != null ? new q7k1(view, k1q0Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131431203, q7k1Var);
        }
        if (view.getTag(2131431198) != null) {
            return;
        }
        if (q7k1Var != null) {
            view.setOnApplyWindowInsetsListener(q7k1Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(2131431213));
        }
    }
}
