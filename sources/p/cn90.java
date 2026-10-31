package p;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cn90 implements Animator.AnimatorListener {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final w611 e;
    public final byte f;
    public final ValueAnimator g;
    public boolean h;
    public float i;
    public float j;
    public boolean k = false;
    public boolean l = false;
    public float m;
    public final /* synthetic */ int n;
    public final /* synthetic */ w611 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ fn90 f27p;

    /* JADX WARN: Multi-variable type inference failed */
    public cn90(fn90 fn90Var, w611 w611Var, int i, float f, float f2, float f3, float f4, int i2, w611 w611Var2) {
        this.f27p = fn90Var;
        this.n = i2;
        this.o = w611Var2;
        this.f = i;
        this.e = w611Var;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new kb5(this, (byte) 11));
        valueAnimatorOfFloat.setTarget(w611Var.a);
        valueAnimatorOfFloat.addListener(this);
        this.m = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.l) {
            this.e.B(true);
        }
        this.l = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.m = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.k) {
            return;
        }
        int i = this.n;
        w611 w611Var = this.o;
        fn90 fn90Var = this.f27p;
        if (i <= 0) {
            fn90Var.Y.a(fn90Var.Q0, w611Var);
        } else {
            fn90Var.a.add(w611Var.a);
            this.h = true;
            if (i > 0) {
                fn90Var.Q0.post(new wr3(fn90Var, this, i, (byte) 6, false));
            }
        }
        View view = fn90Var.V0;
        View view2 = w611Var.a;
        if (view == view2 && view2 == view) {
            fn90Var.V0 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
