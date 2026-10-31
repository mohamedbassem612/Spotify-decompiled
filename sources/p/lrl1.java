package p;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class lrl1 {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public lrl1(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.d;
    }

    public float c() {
        float f = this.b;
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int d() {
        return this.a;
    }

    public void e(float f) {
        this.b = f;
    }
}
