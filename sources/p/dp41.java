package p;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dp41 implements nr70 {
    public ValueAnimator a;
    public final /* synthetic */ ep41 b;

    public dp41(ep41 ep41Var) {
        this.b = ep41Var;
    }

    @Override // p.nr70
    public final void clear() {
        j2h1.o("ScreenFlashView");
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.a = null;
        }
        ep41 ep41Var = this.b;
        ep41Var.setAlpha(0.0f);
        ep41Var.setBrightness(0.0f);
    }
}
