package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o8a {
    public final bw91 a;
    public final drr0 b;

    public o8a() {
        float[] fArr = new float[24];
        for (int i = 0; i < 24; i++) {
            fArr[i] = 0.0f;
        }
        Float[] fArrT0 = f46.T0(fArr);
        this.a = v8r.p(Arrays.copyOf(fArrT0, fArrT0.length));
        this.b = new drr0(0.4f);
    }
}
