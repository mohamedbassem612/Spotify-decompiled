package p;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oek1 {
    public final WeakReference a;

    public oek1(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
    }

    public final void c() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void d(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void e(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void f(qek1 qek1Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (qek1Var != null) {
                view.animate().setListener(new oqr(qek1Var, view, (byte) 5));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void g() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void h(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
