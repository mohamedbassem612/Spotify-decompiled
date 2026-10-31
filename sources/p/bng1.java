package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bng1 extends AnimatorListenerAdapter implements ghg1 {
    public final View a;
    public final View b;
    public int[] c;
    public float d;
    public float e;
    public final float f;
    public final float g;
    public boolean h;

    public bng1(View view, View view2, float f, float f2) {
        this.b = view;
        this.a = view2;
        this.f = f;
        this.g = f2;
        int[] iArr = (int[]) view2.getTag(2131431520);
        this.c = iArr;
        if (iArr != null) {
            view2.setTag(2131431520, null);
        }
    }

    public final void a() {
        int[] iArr = this.c;
        if (iArr == null) {
            iArr = new int[2];
            this.c = iArr;
        }
        View view = this.b;
        view.getLocationOnScreen(iArr);
        this.a.setTag(2131431520, this.c);
        this.d = view.getTranslationX();
        this.e = view.getTranslationY();
        view.setTranslationX(this.f);
        view.setTranslationY(this.g);
    }

    public final void b(jhg1 jhg1Var) {
        this.h = true;
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    public final void c() {
        float f = this.d;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.e);
    }

    public final void d(jhg1 jhg1Var) {
        if (this.h) {
            return;
        }
        this.a.setTag(2131431520, null);
    }

    public final void f(jhg1 jhg1Var) {
        d(jhg1Var);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.h = true;
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        float f = this.f;
        View view = this.b;
        view.setTranslationX(f);
        view.setTranslationY(this.g);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    public final void g(jhg1 jhg1Var) {
    }
}
