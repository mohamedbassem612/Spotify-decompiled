package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jmr0 {
    public lw4 a;
    public boolean b;
    public ColorFilter c;
    public float d = 1.0f;
    public flb0 e = flb0.a;

    public static /* synthetic */ void g(jmr0 jmr0Var, DrawScope drawScope, long j, float f, f2b f2bVar, int i) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            f2bVar = null;
        }
        jmr0Var.e(drawScope, j, f2, f2bVar);
    }

    public boolean a(float f) {
        return false;
    }

    public boolean c(ColorFilter colorFilter) {
        return false;
    }

    public final void e(DrawScope drawScope, long j, float f, ColorFilter colorFilter) {
        if (this.d != f) {
            if (!a(f)) {
                lw4 lw4VarL = this.a;
                if (f == 1.0f) {
                    if (lw4VarL != null) {
                        lw4VarL.a(f);
                    }
                    this.b = false;
                } else {
                    if (lw4VarL == null) {
                        lw4VarL = fdg1.l();
                        this.a = lw4VarL;
                    }
                    lw4VarL.a(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!u890.j(this.c, colorFilter)) {
            if (!c(colorFilter)) {
                lw4 lw4VarL2 = this.a;
                if (colorFilter == null) {
                    if (lw4VarL2 != null) {
                        lw4VarL2.d(null);
                    }
                    this.b = false;
                } else {
                    if (lw4VarL2 == null) {
                        lw4VarL2 = fdg1.l();
                        this.a = lw4VarL2;
                    }
                    lw4VarL2.d(colorFilter);
                    this.b = true;
                }
            }
            this.c = colorFilter;
        }
        flb0 layoutDirection = drawScope.getLayoutDirection();
        if (this.e != layoutDirection) {
            d(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - Float.intBitsToFloat(i2);
        drawScope.a1().v().r(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        n511 n511VarG = anm1.g(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        fid fidVarP = drawScope.a1().p();
                        lw4 lw4VarL3 = this.a;
                        if (lw4VarL3 == null) {
                            lw4VarL3 = fdg1.l();
                            this.a = lw4VarL3;
                        }
                        try {
                            fidVarP.j(n511VarG, lw4VarL3);
                            j(drawScope);
                            fidVarP.i();
                        } catch (Throwable th) {
                            fidVarP.i();
                            throw th;
                        }
                    } else {
                        j(drawScope);
                    }
                }
            } catch (Throwable th2) {
                drawScope.a1().v().r(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        drawScope.a1().v().r(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public long i() {
        return 9205357640488583168L;
    }

    public void d(flb0 flb0Var) {
    }

    public void j(DrawScope drawScope) {
    }
}
