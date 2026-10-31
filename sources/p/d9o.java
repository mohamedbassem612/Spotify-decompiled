package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d9o extends jmr0 {
    public ColorFilter N0;
    public jmr0 O0;
    public final long P0;
    public voe1 X;
    public boolean Y;
    public final jmr0 f;
    public final j6m g;
    public final long h;
    public final boolean i;
    public final err0 t = new err0(0);
    public float Z = 1.0f;

    public d9o(jmr0 jmr0Var, jmr0 jmr0Var2, j6m j6mVar, long j, boolean z) {
        this.f = jmr0Var2;
        this.g = j6mVar;
        this.h = j;
        this.i = z;
        this.O0 = jmr0Var;
        long jI = jmr0Var != null ? jmr0Var.i() : 0L;
        long jI2 = jmr0Var2 != null ? jmr0Var2.i() : 0L;
        long jFloatToRawIntBits = 9205357640488583168L;
        boolean z2 = jI != 9205357640488583168L;
        boolean z3 = jI2 != 9205357640488583168L;
        if (z2 && z3) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jI >> 32)), Float.intBitsToFloat((int) (jI2 >> 32))))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (jI & 4294967295L)), Float.intBitsToFloat((int) (jI2 & 4294967295L))))));
        }
        this.P0 = jFloatToRawIntBits;
    }

    public final boolean a(float f) {
        this.Z = f;
        return true;
    }

    public final boolean c(ColorFilter colorFilter) {
        this.N0 = colorFilter;
        return true;
    }

    public final long i() {
        return this.P0;
    }

    public final void j(DrawScope drawScope) {
        boolean z = this.Y;
        jmr0 jmr0Var = this.f;
        if (z) {
            k(drawScope, jmr0Var, this.Z);
            return;
        }
        voe1 voe1Var = this.X;
        if (voe1Var == null) {
            voe1Var = new voe1(sjm0.a());
            this.X = voe1Var;
        }
        float fH = jfv.h(voe1.a(voe1Var.a)) / jfv.h(this.h);
        float fO = yoi1.o(fH, 0.0f, 1.0f);
        float f = this.Z;
        float f2 = fO * f;
        if (this.i) {
            f -= f2;
        }
        this.Y = fH >= 1.0f;
        k(drawScope, this.O0, f);
        k(drawScope, jmr0Var, f2);
        if (this.Y) {
            this.O0 = null;
        } else {
            err0 err0Var = this.t;
            err0Var.t(err0Var.s() + 1);
        }
    }

    public final void k(DrawScope drawScope, jmr0 jmr0Var, float f) {
        if (jmr0Var == null || f <= 0.0f) {
            return;
        }
        long j = drawScope.j();
        long jI = jmr0Var.i();
        long jO = (jI == 9205357640488583168L || Size.g(jI) || j == 9205357640488583168L || Size.g(j)) ? j : t3k1.O(jI, this.g.a(jI, j));
        if (j == 9205357640488583168L || Size.g(j)) {
            jmr0Var.e(drawScope, jO, f, this.N0);
            return;
        }
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (jO >> 32))) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (jO & 4294967295L))) / 2.0f;
        ((dg8) drawScope.a1().b).r(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            jmr0Var.e(drawScope, jO, f, this.N0);
        } finally {
            float f2 = -fIntBitsToFloat;
            float f3 = -fIntBitsToFloat2;
            ((dg8) drawScope.a1().b).r(f2, f3, f2, f3);
        }
    }
}
