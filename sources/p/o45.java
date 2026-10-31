package p;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o45 extends TextPaint {
    public lw4 a;
    public TextDecoration b;
    public byte c;
    public Shadow d;
    public u7h e;
    public Brush f;
    public mdt g;
    public Size h;
    public DrawStyle i;

    public final lw4 a() {
        lw4 lw4Var = this.a;
        if (lw4Var != null) {
            return lw4Var;
        }
        lw4 lw4VarB = fdg1.B(this);
        this.a = lw4VarB;
        return lw4VarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (jm5.j(i, this.c)) {
            return;
        }
        a().b(i);
        this.c = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    public final void c(Brush brush, long j, float f) throws NoWhenBranchMatchedException {
        if (brush == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (brush instanceof n6a1) {
            d(ila0.A(f, ((n6a1) brush).a));
            return;
        }
        if (!(brush instanceof zv61)) {
            eg.o();
            return;
        }
        if (u890.j(this.f, brush)) {
            Size size = this.h;
            if (!(size == null ? false : Size.c(size.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = brush;
                    this.h = new Size(j);
                    this.g = xto.l(new n45(brush, j, (byte) 0));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = brush;
            this.h = new Size(j);
            this.g = xto.l(new n45(brush, j, (byte) 0));
        }
        lw4 lw4VarA = a();
        mdt mdtVar = this.g;
        lw4VarA.e(mdtVar != null ? (Shader) mdtVar.getValue() : null);
        this.e = null;
        jhc1.D(this, f);
    }

    public final void d(long j) {
        u7h u7hVar = this.e;
        if ((u7hVar == null ? false : z4h1.b(u7hVar.a, j)) || j == 16) {
            return;
        }
        this.e = new u7h(j);
        setColor(z4p1.G(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e(DrawStyle drawStyle) throws NoWhenBranchMatchedException {
        if (drawStyle == null || u890.j(this.i, drawStyle)) {
            return;
        }
        this.i = drawStyle;
        if (drawStyle.equals(z520.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(drawStyle instanceof phc1)) {
            eg.o();
            return;
        }
        a().g(1);
        phc1 phc1Var = (phc1) drawStyle;
        a().f(phc1Var.e());
        lw4 lw4VarA = a();
        fdg1.g0(lw4VarA.a, phc1Var.c());
        lw4 lw4VarA2 = a();
        fdg1.f0(lw4VarA2.a, phc1Var.b());
        lw4 lw4VarA3 = a();
        fdg1.e0(lw4VarA3.a, phc1Var.a());
        lw4 lw4VarA4 = a();
        uw4 uw4VarD = phc1Var.d();
        fdg1.c0(lw4VarA4.a, uw4VarD);
        lw4VarA4.e = uw4VarD;
    }

    public final void f(Shadow shadow) {
        if (shadow == null || u890.j(this.d, shadow)) {
            return;
        }
        this.d = shadow;
        Shadow shadow2 = Shadow.d;
        if (shadow.equals(oto1.m())) {
            clearShadowLayer();
        } else {
            setShadowLayer(k5p1.l(this.d.c), Float.intBitsToFloat((int) (this.d.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), z4p1.G(this.d.a));
        }
    }

    public final void g(TextDecoration textDecoration) {
        if (textDecoration == null || u890.j(this.b, textDecoration)) {
            return;
        }
        this.b = textDecoration;
        setUnderlineText(textDecoration.a(TextDecoration.c));
        setStrikeThruText(this.b.a(TextDecoration.d));
    }
}
