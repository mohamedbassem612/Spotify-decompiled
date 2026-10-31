package p;

import android.view.View;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class wyb1 {
    public static final PathInterpolator a = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);

    public static final void a(View view, long j, long j2) {
        view.setTranslationY((-view.getMeasuredHeight()) / 2.0f);
        view.setAlpha(0.0f);
        oek1 oek1VarC = b8k1.c(view);
        oek1VarC.a(1.0f);
        View view2 = (View) oek1VarC.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(j2);
        }
        oek1VarC.d(j);
        oek1VarC.h(0.0f);
        oek1VarC.e(a);
        oek1VarC.b(1.0f);
        oek1VarC.g();
    }

    public static void b(View view, long j) {
        view.setTranslationX(view.getMeasuredWidth() / 4.0f);
        view.setAlpha(0.0f);
        oek1 oek1VarC = b8k1.c(view);
        oek1VarC.a(1.0f);
        WeakReference weakReference = oek1VarC.a;
        View view2 = (View) weakReference.get();
        if (view2 != null) {
            view2.animate().setStartDelay(j);
        }
        oek1VarC.d(200L);
        View view3 = (View) weakReference.get();
        if (view3 != null) {
            view3.animate().translationX(0.0f);
        }
        oek1VarC.e(a);
        oek1VarC.b(1.0f);
        oek1VarC.g();
    }
}
