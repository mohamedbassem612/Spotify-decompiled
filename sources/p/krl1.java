package p;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class krl1 extends lrl1 {
    public final WindowInsetsAnimation e;

    public krl1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static nk80 f(WindowInsetsAnimation.Bounds bounds) {
        return nk80.d(bounds.getUpperBound());
    }

    public static nk80 g(WindowInsetsAnimation.Bounds bounds) {
        return nk80.d(bounds.getLowerBound());
    }

    public static void h(View view, jme jmeVar) {
        view.setWindowInsetsAnimationCallback(jmeVar != null ? new jrl1(jmeVar) : null);
    }

    @Override // p.lrl1
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // p.lrl1
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // p.lrl1
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // p.lrl1
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // p.lrl1
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
