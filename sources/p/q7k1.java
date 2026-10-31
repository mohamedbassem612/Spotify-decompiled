package p;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q7k1 implements View.OnApplyWindowInsetsListener {
    public hsl1 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ k1q0 c;

    public q7k1(View view, k1q0 k1q0Var) {
        this.b = view;
        this.c = k1q0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        hsl1 hsl1VarG = hsl1.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        k1q0 k1q0Var = this.c;
        if (i < 30) {
            r7k1.a(windowInsets, this.b);
            if (hsl1VarG.equals(this.a)) {
                return k1q0Var.x(view, hsl1VarG).f();
            }
        }
        this.a = hsl1VarG;
        hsl1 hsl1VarX = k1q0Var.x(view, hsl1VarG);
        if (i >= 30) {
            return hsl1VarX.f();
        }
        WeakHashMap weakHashMap = b8k1.a;
        view.requestApplyInsets();
        return hsl1VarX.f();
    }
}
