package p;

import android.graphics.Paint;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vid implements DrawScope {
    public final uid a;
    public final cab b;
    public lw4 c;
    public lw4 d;

    public vid() {
        xat xatVar = yoi1.d;
        uid uidVar = new uid();
        uidVar.a = xatVar;
        uidVar.b = flb0.a;
        uidVar.c = k6x.a;
        uidVar.d = 0L;
        this.a = uidVar;
        this.b = new cab(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static lw4 a(vid vidVar, long j, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) throws NoWhenBranchMatchedException {
        lw4 lw4VarC = vidVar.c(drawStyle);
        Paint paint = lw4VarC.a;
        if (f != 1.0f) {
            j = u7h.b(j, u7h.c(j) * f, 0.0f, 0.0f, 0.0f, 14);
        }
        long jL = fdg1.L(paint);
        int i2 = u7h.l;
        if (!z4h1.b(jL, j)) {
            lw4VarC.c(j);
        }
        if (lw4VarC.c != null) {
            lw4VarC.e(null);
        }
        if (!u890.j(lw4VarC.d, colorFilter)) {
            lw4VarC.d(colorFilter);
        }
        if (!jm5.j(lw4VarC.b, i)) {
            lw4VarC.b(i);
        }
        if (!k1p1.l(fdg1.M(paint), 1)) {
            fdg1.b0(paint, 1);
        }
        return lw4VarC;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void C0(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), b(brush, drawStyle, f, colorFilter, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void D(yk4 yk4Var, long j, float f, ColorFilter colorFilter, int i) {
        this.a.c.p(yk4Var, j, b(null, z520.a, f, colorFilter, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void F(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.l(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, drawStyle, f, null, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void F0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.d(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3), a(this, j, drawStyle, f, colorFilter, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void H0(long j, long j2, long j3) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), a(this, j, z520.a, 1.0f, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void N(Brush brush, float f, long j, float f2, DrawStyle drawStyle) {
        this.a.c.o(f, j, b(brush, drawStyle, f2, null, 3, 1));
    }

    @Override // p.wat
    public final float U0() {
        return this.a.a.U0();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void Z(yk4 yk4Var, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i, int i2) {
        this.a.c.e(yk4Var, j, j2, j3, j4, b(null, z520.a, f, colorFilter, i, i2));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final cab a1() {
        return this.b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final lw4 b(Brush brush, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2) throws NoWhenBranchMatchedException {
        lw4 lw4VarC = c(drawStyle);
        Paint paint = lw4VarC.a;
        if (brush != null) {
            brush.a(f, j(), lw4VarC);
        } else {
            if (lw4VarC.c != null) {
                lw4VarC.e(null);
            }
            long jL = fdg1.L(paint);
            int i3 = u7h.l;
            if (!z4h1.b(jL, nfb.i())) {
                lw4VarC.c(nfb.i());
            }
            if (fdg1.K(paint) != f) {
                lw4VarC.a(f);
            }
        }
        if (!u890.j(lw4VarC.d, colorFilter)) {
            lw4VarC.d(colorFilter);
        }
        if (!jm5.j(lw4VarC.b, i)) {
            lw4VarC.b(i);
        }
        if (!k1p1.l(fdg1.M(paint), i2)) {
            fdg1.b0(paint, i2);
        }
        return lw4VarC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final lw4 c(DrawStyle drawStyle) throws NoWhenBranchMatchedException {
        if (u890.j(drawStyle, z520.a)) {
            lw4 lw4Var = this.c;
            if (lw4Var != null) {
                return lw4Var;
            }
            lw4 lw4VarL = fdg1.l();
            lw4VarL.g(0);
            this.c = lw4VarL;
            return lw4VarL;
        }
        if (!(drawStyle instanceof phc1)) {
            eg.o();
            return null;
        }
        lw4 lw4VarL2 = this.d;
        if (lw4VarL2 == null) {
            lw4VarL2 = fdg1.l();
            lw4VarL2.g(1);
            this.d = lw4VarL2;
        }
        Paint paint = lw4VarL2.a;
        phc1 phc1Var = (phc1) drawStyle;
        if (fdg1.R(paint) != phc1Var.e()) {
            lw4VarL2.f(phc1Var.e());
        }
        if (!hno1.h(fdg1.O(paint), phc1Var.a())) {
            fdg1.e0(paint, phc1Var.a());
        }
        if (fdg1.Q(paint) != phc1Var.c()) {
            fdg1.g0(paint, phc1Var.c());
        }
        if (!kno1.p(fdg1.P(paint), phc1Var.b())) {
            fdg1.f0(paint, phc1Var.b());
        }
        if (!u890.j(lw4VarL2.e, phc1Var.d())) {
            uw4 uw4VarD = phc1Var.d();
            fdg1.c0(paint, uw4VarD);
            lw4VarL2.e = uw4VarD;
        }
        return lw4VarL2;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void e1(long j, long j2, long j3, float f, int i, uw4 uw4Var) {
        fid fidVar = this.a.c;
        lw4 lw4VarL = this.d;
        if (lw4VarL == null) {
            lw4VarL = fdg1.l();
            lw4VarL.g(1);
            this.d = lw4VarL;
        }
        Paint paint = lw4VarL.a;
        long jL = fdg1.L(paint);
        int i2 = u7h.l;
        if (!z4h1.b(jL, j)) {
            lw4VarL.c(j);
        }
        if (lw4VarL.c != null) {
            lw4VarL.e(null);
        }
        if (!u890.j(lw4VarL.d, (Object) null)) {
            lw4VarL.d(null);
        }
        if (!jm5.j(lw4VarL.b, 3)) {
            lw4VarL.b(3);
        }
        if (fdg1.R(paint) != f) {
            lw4VarL.f(f);
        }
        if (fdg1.Q(paint) != 4.0f) {
            fdg1.g0(paint, 4.0f);
        }
        if (!hno1.h(fdg1.O(paint), i)) {
            fdg1.e0(paint, i);
        }
        if (!kno1.p(fdg1.P(paint), 0)) {
            fdg1.f0(paint, 0);
        }
        if (!u890.j(lw4VarL.e, uw4Var)) {
            fdg1.c0(paint, uw4Var);
            lw4VarL.e = uw4Var;
        }
        if (!k1p1.l(fdg1.M(paint), 1)) {
            fdg1.b0(paint, 1);
        }
        fidVar.k(j2, j3, lw4VarL);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final flb0 getLayoutDirection() {
        return this.a.b;
    }

    @Override // p.wat
    public final float h() {
        return this.a.a.h();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void j0(u8s0 u8s0Var, long j, float f, DrawStyle drawStyle, int i) {
        this.a.c.u(u8s0Var, a(this, j, drawStyle, f, null, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void m0(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.l(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), b(brush, drawStyle, f, null, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void n0(u8s0 u8s0Var, Brush brush, float f, DrawStyle drawStyle, int i) {
        this.a.c.u(u8s0Var, b(brush, drawStyle, f, null, i, 1));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void o1(long j, float f, float f2, long j2, long j3, DrawStyle drawStyle) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, a(this, j, drawStyle, 1.0f, null, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void p1(Brush brush, long j, long j2, float f, float f2) {
        fid fidVar = this.a.c;
        lw4 lw4VarL = this.d;
        if (lw4VarL == null) {
            lw4VarL = fdg1.l();
            lw4VarL.g(1);
            this.d = lw4VarL;
        }
        Paint paint = lw4VarL.a;
        if (brush != null) {
            brush.a(f2, j(), lw4VarL);
        } else if (fdg1.K(paint) != f2) {
            lw4VarL.a(f2);
        }
        if (!u890.j(lw4VarL.d, (Object) null)) {
            lw4VarL.d(null);
        }
        if (!jm5.j(lw4VarL.b, 3)) {
            lw4VarL.b(3);
        }
        if (fdg1.R(paint) != f) {
            lw4VarL.f(f);
        }
        if (fdg1.Q(paint) != 4.0f) {
            fdg1.g0(paint, 4.0f);
        }
        if (!hno1.h(fdg1.O(paint), 0)) {
            fdg1.e0(paint, 0);
        }
        if (!kno1.p(fdg1.P(paint), 0)) {
            fdg1.f0(paint, 0);
        }
        if (!u890.j(lw4VarL.e, (Object) null)) {
            fdg1.c0(paint, (uw4) null);
            lw4VarL.e = null;
        }
        if (!k1p1.l(fdg1.M(paint), 1)) {
            fdg1.b0(paint, 1);
        }
        fidVar.k(j, j2, lw4VarL);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void u0(long j, float f, long j2, float f2, DrawStyle drawStyle, int i) {
        this.a.c.o(f, j2, a(this, j, drawStyle, f2, null, i));
    }
}
