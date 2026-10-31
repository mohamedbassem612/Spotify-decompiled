package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fwx extends jmr0 {
    public final float X;
    public final jmr0 f;
    public final ColorFilter g;
    public final boolean h;
    public final jmr0 i;
    public final float t;

    public fwx(jmr0 jmr0Var, ColorFilter colorFilter, boolean z, jmr0 jmr0Var2, float f, float f2) {
        this.f = jmr0Var;
        this.g = colorFilter;
        this.h = z;
        this.i = jmr0Var2;
        this.t = f;
        this.X = f2;
    }

    @Override // p.jmr0
    public final long i() {
        return this.i.i();
    }

    @Override // p.jmr0
    public final void j(DrawScope drawScope) throws Throwable {
        DrawScope drawScope2 = drawScope;
        this.i.e(drawScope2, drawScope.j(), 1.0f, null);
        float fMin = Float.min(Float.intBitsToFloat((int) (drawScope2.j() >> 32)), Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L))) / 2.0f;
        float f = this.t;
        if (fMin < f || !this.h) {
            return;
        }
        float fO = yoi1.o(fMin, f, this.X);
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (drawScope2.j() >> 32)) - fO) / 2.0f;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)) - fO) / 2.0f;
        drawScope2.a1().v().r(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            try {
                this.f.e(drawScope2, (((long) Float.floatToRawIntBits(fO)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fO))), 1.0f, this.g);
                float f2 = -fIntBitsToFloat;
                float f3 = -fIntBitsToFloat2;
                drawScope2.a1().v().r(f2, f3, f2, f3);
            } catch (Throwable th) {
                th = th;
                drawScope2 = drawScope2;
                Throwable th2 = th;
                dg8 dg8VarV = drawScope2.a1().v();
                float f4 = -fIntBitsToFloat;
                float f5 = -fIntBitsToFloat2;
                dg8VarV.r(f4, f5, f4, f5);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
