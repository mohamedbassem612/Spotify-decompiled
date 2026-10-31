package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import app.p000rive.runtime.kotlin.R;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class irl1 extends lrl1 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final gl10 f = new gl10((byte) 0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(View view, mrl1 mrl1Var) {
        jme jmeVarK = k(view);
        if (jmeVarK != null) {
            jmeVarK.r0(mrl1Var);
            if (jmeVarK.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), mrl1Var);
            }
        }
    }

    public static void g(View view, mrl1 mrl1Var, hsl1 hsl1Var, boolean z) {
        jme jmeVarK = k(view);
        if (jmeVarK != null) {
            jmeVarK.b = hsl1Var;
            if (!z) {
                jmeVarK.s0(mrl1Var);
                z = jmeVarK.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), mrl1Var, hsl1Var, z);
            }
        }
    }

    public static void h(View view, hsl1 hsl1Var, List list) {
        jme jmeVarK = k(view);
        if (jmeVarK != null) {
            hsl1Var = jmeVarK.t0(hsl1Var, list);
            if (jmeVarK.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), hsl1Var, list);
            }
        }
    }

    public static void i(View view, mrl1 mrl1Var, frl1 frl1Var) {
        jme jmeVarK = k(view);
        if (jmeVarK != null) {
            jmeVarK.u0(mrl1Var, frl1Var);
            if (jmeVarK.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), mrl1Var, frl1Var);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static jme k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof hrl1) {
            return ((hrl1) tag).a;
        }
        return null;
    }
}
