package p;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rah {
    public static final ArgbEvaluator c = new ArgbEvaluator();
    public int a;
    public final pah b;

    public rah(int i, pah pahVar) {
        this.a = i;
        this.b = pahVar;
    }

    public final void a(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(this.a, i);
        valueAnimator.setEvaluator(c);
        valueAnimator.setDuration(300L);
        valueAnimator.addUpdateListener(new kb5(this, (byte) 4));
        valueAnimator.start();
        this.a = i;
    }
}
