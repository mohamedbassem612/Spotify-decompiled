package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kq20 {
    public final float a;
    public final float b;

    public kq20(float f, wat watVar) {
        this.a = f;
        float fH = watVar.h();
        float f2 = lq20.a;
        this.b = fH * 386.0878f * 160.0f * 0.84f;
    }

    public final jq20 a(float f) {
        float[] fArr = mj4.a;
        float f2 = this.a;
        float f3 = this.b;
        double dA = mj4.a(f, f2 * f3);
        double d = lq20.a;
        double d2 = d - 1.0d;
        return new jq20(f, (float) (Math.exp((d / d2) * dA) * ((double) (f2 * f3))), (long) (Math.exp(dA / d2) * 1000.0d));
    }
}
