package p;

import android.animation.Animator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pcg implements Animator.AnimatorListener {
    public final /* synthetic */ qcg a;
    public final /* synthetic */ rcg b;

    public pcg(rcg rcgVar, qcg qcgVar) {
        this.b = rcgVar;
        this.a = qcgVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        rcg rcgVar = this.b;
        qcg qcgVar = this.a;
        rcgVar.a(1.0f, qcgVar, true);
        qcgVar.k = qcgVar.e;
        qcgVar.l = qcgVar.f;
        qcgVar.m = qcgVar.g;
        qcgVar.a((qcgVar.j + 1) % qcgVar.i.length);
        if (!rcgVar.f) {
            rcgVar.e += 1.0f;
            return;
        }
        rcgVar.f = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (qcgVar.n) {
            qcgVar.n = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.e = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
