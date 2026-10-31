package p;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zv61 extends Brush {
    public ffe1 a;
    public long b = 9205357640488583168L;
    public float[] c;

    @Override // androidx.compose.ui.graphics.Brush
    public final void a(float f, long j, lw4 lw4Var) {
        Paint paint = lw4Var.a;
        ffe1 ffe1Var = this.a;
        if (ffe1Var == null || !Size.c(this.b, j)) {
            if (Size.g(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                ffe1Var = null;
            } else {
                ffe1Var = this.a;
                if (ffe1Var == null) {
                    ffe1Var = new ffe1((byte) 12);
                    this.a = ffe1Var;
                }
                float[] fArr = this.c;
                if (fArr != null) {
                    ffe1Var.s(fArr);
                }
                ffe1Var.q(c(j));
                this.a = ffe1Var;
                this.b = j;
            }
        }
        long jL = fdg1.L(paint);
        int i = u7h.l;
        if (!z4h1.b(jL, nfb.i())) {
            lw4Var.c(nfb.i());
        }
        if (!u890.j(lw4Var.c, ffe1Var != null ? ffe1Var.h() : null)) {
            lw4Var.e(ffe1Var != null ? ffe1Var.h() : null);
        }
        if (fdg1.K(paint) == f) {
            return;
        }
        lw4Var.a(f);
    }

    public Shader c(long j) {
        List listM = p7h.M(new u7h[]{new u7h(z4p1.g(4289704447L)), new u7h(z4p1.g(4282122468L)), new u7h(z4p1.g(4284032511L)), new u7h(z4p1.g(4278190080L))});
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i) * 0.3f;
        return men1.a(0, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i) * 0.85f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f))), listM, (List) null);
    }
}
