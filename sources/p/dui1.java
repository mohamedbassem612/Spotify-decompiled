package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dui1 extends jmr0 {
    public ColorFilter X;
    public final hrr0 f = xto.t(new Size(0));
    public final hrr0 g = xto.t(Boolean.FALSE);
    public final pti1 h;
    public final hrr0 i;
    public float t;

    public dui1(ej50 ej50Var) {
        pti1 pti1Var = new pti1(ej50Var);
        pti1Var.f = new ww21(this, (byte) 28);
        this.h = pti1Var;
        this.i = xto.s(rih1.a, f331.X0);
        this.t = 1.0f;
    }

    @Override // p.jmr0
    public final boolean a(float f) {
        this.t = f;
        return true;
    }

    @Override // p.jmr0
    public final boolean c(ColorFilter colorFilter) {
        this.X = colorFilter;
        return true;
    }

    @Override // p.jmr0
    public final long i() {
        return ((Size) this.f.getValue()).a;
    }

    @Override // p.jmr0
    public final void j(DrawScope drawScope) {
        ColorFilter colorFilter = this.X;
        pti1 pti1Var = this.h;
        if (colorFilter == null) {
            colorFilter = (ColorFilter) pti1Var.g.getValue();
        }
        if (((Boolean) this.g.getValue()).booleanValue() && drawScope.getLayoutDirection() == flb0.b) {
            long jG1 = drawScope.g1();
            cab cabVarA1 = drawScope.a1();
            long jU = cabVarA1.u();
            cabVarA1.p().q();
            try {
                cabVarA1.v().t(-1.0f, 1.0f, jG1);
                pti1Var.e(drawScope, this.t, colorFilter);
                i3a.n(cabVarA1, jU);
            } catch (Throwable th) {
                i3a.n(cabVarA1, jU);
                throw th;
            }
        } else {
            pti1Var.e(drawScope, this.t, colorFilter);
        }
        this.i.getValue();
    }
}
