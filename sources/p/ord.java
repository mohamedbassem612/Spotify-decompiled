package p;

import androidx.car.app.model.CarProgressBarStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ord {
    public final float a;
    public CarProgressBarStyle b;

    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[PHI: r0
      0x0014: PHI (r0v4 float) = (r0v2 float), (r0v3 float) binds: [B:7:0x0012, B:10:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    public ord(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            hhg1.n("Progress cannot be NaN or infinite");
            throw null;
        }
        float f2 = 0.0f;
        if (f >= 0.0f) {
            f2 = 1.0f;
            f = f > 1.0f ? f2 : f;
        }
        this.a = f;
    }
}
