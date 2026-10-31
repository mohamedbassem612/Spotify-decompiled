package p;

import android.graphics.Matrix;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bw40 extends zv61 {
    public static final List f;
    public static final List g;
    public final long d;
    public final long e;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        f = p7h.M(new Float[]{fValueOf, Float.valueOf(0.3f), Float.valueOf(0.55f)});
        g = p7h.M(new Float[]{Float.valueOf(0.25f), Float.valueOf(0.06f), fValueOf});
    }

    public bw40(long j, long j2) {
        this.d = j;
        this.e = j2;
    }

    public final Shader c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat < 1.0f) {
            fIntBitsToFloat = 1.0f;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat2 < 1.0f) {
            fIntBitsToFloat2 = 1.0f;
        }
        long j2 = this.e;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * fIntBitsToFloat;
        long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 & 4294967295L)) * fIntBitsToFloat) / 2.0f))) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32);
        float f2 = 1.2f * fIntBitsToFloat;
        List list = g;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new u7h(u7h.b(this.d, ((Number) it.next()).floatValue(), 0.0f, 0.0f, 0.0f, 14)));
        }
        RadialGradient radialGradientB = men1.b(f2, jFloatToRawIntBits, arrayList, f);
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, (fIntBitsToFloat2 * 2.0f) / fIntBitsToFloat);
        radialGradientB.setLocalMatrix(matrix);
        return radialGradientB;
    }
}
