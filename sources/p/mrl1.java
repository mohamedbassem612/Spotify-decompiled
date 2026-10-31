package p;

import android.os.Build;
import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import app.p000rive.runtime.kotlin.R;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mrl1 {
    public lrl1 a;

    public mrl1(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new krl1(k34.e(i, interpolator, j));
        } else {
            this.a = new irl1(i, interpolator, j);
        }
    }

    public static void e(View view, jme jmeVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            krl1.h(view, jmeVar);
            return;
        }
        PathInterpolator pathInterpolator = irl1.e;
        View.OnApplyWindowInsetsListener hrl1Var = jmeVar != null ? new hrl1(view, jmeVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, hrl1Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(hrl1Var);
        }
    }

    public static mrl1 g(WindowInsetsAnimation windowInsetsAnimation) {
        mrl1 mrl1Var = new mrl1(0, null, 0L);
        mrl1Var.a = new krl1(windowInsetsAnimation);
        return mrl1Var;
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final float c() {
        return this.a.c();
    }

    public final int d() {
        return this.a.d();
    }

    public final void f(float f) {
        this.a.e(f);
    }
}
