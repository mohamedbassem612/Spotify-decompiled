package p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mnm0 extends ValueAnimator {
    public final knm0 a;

    public mnm0(knm0 knm0Var) {
        kb5 kb5Var = new kb5(this, (byte) 13);
        this.a = knm0Var;
        addUpdateListener(kb5Var);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void start() {
        this.a.e();
        super.start();
    }
}
