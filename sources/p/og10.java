package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class og10 extends AnimatorListenerAdapter implements ghg1 {
    public final View a;
    public boolean b = false;

    public og10(View view) {
        this.a = view;
    }

    @Override // p.ghg1
    public final void a() {
        View view = this.a;
        view.setTag(2131431519, Float.valueOf(view.getVisibility() == 0 ? rik1.a.x(view) : 0.0f));
    }

    @Override // p.ghg1
    public final void c() {
        this.a.setTag(2131431519, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        rik1.a.z(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        tik1 tik1Var = rik1.a;
        tik1Var.z(view, 1.0f);
        tik1Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // p.ghg1
    public final void b(jhg1 jhg1Var) {
    }

    @Override // p.ghg1
    public final void e(jhg1 jhg1Var) {
    }

    @Override // p.ghg1
    public final void f(jhg1 jhg1Var) {
    }

    @Override // p.ghg1
    public final void g(jhg1 jhg1Var) {
    }
}
