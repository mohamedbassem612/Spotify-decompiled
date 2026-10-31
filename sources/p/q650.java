package p;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q650 {
    public static final q650 a = new q650();

    public final LinearGradient a(long j, long j2, long[] jArr, float[] fArr, int i) {
        return i15.c(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, oon1.D(i));
    }

    public final RadialGradient b(long j, float f, long[] jArr, float[] fArr, int i) {
        return i15.d(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, oon1.D(i));
    }

    public final SweepGradient c(long j, long[] jArr, float[] fArr) {
        return i15.f(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
    }
}
