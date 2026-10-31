package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qjk1 extends AnimatorListenerAdapter implements ghg1 {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ tjk1 e;

    public qjk1(tjk1 tjk1Var, ViewGroup viewGroup, View view, View view2) {
        this.e = tjk1Var;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // p.ghg1
    public final void b(jhg1 jhg1Var) {
        if (this.d) {
            h();
        }
    }

    @Override // p.ghg1
    public final void f(jhg1 jhg1Var) {
        jhg1Var.G(this);
    }

    public final void h() {
        this.c.setTag(2131430744, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            b8k1.b(view, this.a);
        } else {
            this.e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(2131430744, view2);
            b8k1.b(view2, this.a);
            this.d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // p.ghg1
    public final void a() {
    }

    @Override // p.ghg1
    public final void c() {
    }

    @Override // p.ghg1
    public final void g(jhg1 jhg1Var) {
    }
}
