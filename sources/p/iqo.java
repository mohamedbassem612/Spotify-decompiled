package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iqo extends jmr0 {
    public final long f;
    public final jmr0 g;
    public final i9h h;

    public iqo(long j, long j2, dui1 dui1Var) {
        this.f = j2;
        this.g = dui1Var;
        this.h = new i9h(j);
    }

    public final long i() {
        return 9205357640488583168L;
    }

    public final void j(DrawScope drawScope) throws Throwable {
        DrawScope drawScope2 = drawScope;
        this.h.e(drawScope2, drawScope.j(), 1.0f, (ColorFilter) null);
        float fMin = Float.min(Float.intBitsToFloat((int) (drawScope2.j() >> 32)), Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L))) / 4.0f;
        if (fMin < 0.0f) {
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope2.j() >> 32)) - fMin) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) - fMin) / 2.0f;
        ((dg8) drawScope2.a1().b).r(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            try {
                this.g.e(drawScope2, (((long) Float.floatToRawIntBits(fMin)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fMin))), 1.0f, new f2b(this.f, 5));
                float f = -fIntBitsToFloat;
                float f2 = -fIntBitsToFloat2;
                ((dg8) drawScope2.a1().b).r(f, f2, f, f2);
            } catch (Throwable th) {
                th = th;
                drawScope2 = drawScope2;
                Throwable th2 = th;
                dg8 dg8Var = (dg8) drawScope2.a1().b;
                float f3 = -fIntBitsToFloat;
                float f4 = -fIntBitsToFloat2;
                dg8Var.r(f3, f4, f3, f4);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
