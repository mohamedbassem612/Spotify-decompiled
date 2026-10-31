package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v9v extends jmr0 {
    public final hw61 f;
    public final bw61 g;
    public final em3 h;
    public float i = 1.0f;
    public ColorFilter t;

    public v9v(hw61 hw61Var, bw61 bw61Var, em3 em3Var) {
        this.f = hw61Var;
        this.g = bw61Var;
        this.h = em3Var;
    }

    public final boolean a(float f) {
        this.i = f;
        return true;
    }

    public final boolean c(ColorFilter colorFilter) {
        this.t = colorFilter;
        return true;
    }

    public final long i() {
        return 9205357640488583168L;
    }

    public final void j(DrawScope drawScope) {
        w9v w9vVar;
        em3 em3Var = this.h;
        hw61 hw61Var = this.f;
        long j = drawScope.j();
        flb0 layoutDirection = drawScope.getLayoutDirection();
        bw61 bw61Var = this.g;
        synchronized (em3Var) {
            j15 j15Var = (j15) em3Var.c;
            if (j15Var == null) {
                j15 j15Var2 = new j15(d4o1.a, 0L, flb0.a, 1.0f, null);
                em3Var.c = j15Var2;
                j15Var = j15Var2;
            }
            j15Var.a = hw61Var;
            j15Var.b = j;
            j15Var.c = layoutDirection;
            j15Var.d = drawScope.h();
            j15Var.e = new bw61(bw61Var.a, bw61Var.b, 0L, bw61Var.e, bw61Var.f, bw61Var.g, bw61Var.d);
            nen0 nen0Var = (nen0) em3Var.b;
            if (nen0Var == null) {
                nen0Var = new nen0();
                em3Var.b = nen0Var;
            }
            w9vVar = (w9v) nen0Var.g(j15Var);
            if (w9vVar == null) {
                w9vVar = new w9v(bw61Var, hw61Var.a(j, layoutDirection, drawScope));
                nen0 nen0Var2 = (nen0) em3Var.b;
                if (nen0Var2 == null) {
                    nen0Var2 = new nen0();
                    em3Var.b = nen0Var2;
                }
                nen0Var2.m(new j15(j15Var.a, j15Var.b, j15Var.c, j15Var.d, j15Var.e), w9vVar);
            }
        }
        float fX0 = drawScope.X0(r3v.a(this.g.c));
        float fX1 = drawScope.X0(r3v.b(this.g.c));
        ((dg8) drawScope.a1().b).z(fX0, fX1);
        try {
            ColorFilter colorFilter = this.t;
            long j2 = drawScope.j();
            bw61 bw61Var2 = w9vVar.i;
            w9vVar.a(drawScope, colorFilter, j2, bw61Var2.e, bw61Var2.f, yoi1.o(this.i * bw61Var2.g, 0.0f, 1.0f), w9vVar.i.d);
        } finally {
            ((dg8) drawScope.a1().b).z(-fX0, -fX1);
        }
    }
}
