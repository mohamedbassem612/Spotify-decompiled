package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k890 implements l890 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public k890(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // p.l890
    public final float q(float f, float f2, float f3) {
        float f4 = this.b;
        float f5 = this.a;
        float f6 = f4 - f5;
        if (f6 == 0.0f) {
            f6 = 1.0f / f4;
        }
        float f7 = (f3 - f5) / f6;
        return (0.0f * f7) + ((1.0f - f7) * this.c);
    }

    public final String toString() {
        return String.format(Locale.US, "map(%.2f, %.2f, %.2f, %.2f)", Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(0.0f));
    }
}
