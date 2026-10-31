package p;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qah {
    public static final ArgbEvaluator c = new ArgbEvaluator();
    public final oah a;
    public int b = -1;

    public qah(oah oahVar) {
        this.a = oahVar;
    }

    public final void a(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(this.b, i);
        valueAnimator.setEvaluator(c);
        valueAnimator.setDuration(500L);
        valueAnimator.addUpdateListener(new kb5(this, (byte) 5));
        valueAnimator.start();
        this.b = i;
    }
}
