package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jmb0 implements DrawScope, lsl {
    public final vid a = new vid();
    public m7v b;

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void C0(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.a.C0(brush, j, j2, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void D(yk4 yk4Var, long j, float f, ColorFilter colorFilter, int i) {
        this.a.D(yk4Var, j, f, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void F(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, int i) {
        this.a.F(j, j2, j3, j4, drawStyle, f, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void F0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        this.a.F0(j, j2, j3, f, drawStyle, colorFilter, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void H0(long j, long j2, long j3) {
        this.a.H0(j, j2, j3);
    }

    @Override // p.wat
    public final long I(int i) {
        return this.a.I(i);
    }

    @Override // p.wat
    public final long L(float f) {
        return this.a.L(f);
    }

    @Override // p.wat
    public final float M0(int i) {
        return this.a.M0(i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void N(Brush brush, float f, long j, float f2, DrawStyle drawStyle) {
        this.a.N(brush, f, j, f2, drawStyle);
    }

    @Override // p.wat
    public final float N0(float f) {
        return f / this.a.h();
    }

    @Override // p.wat
    public final float U0() {
        return this.a.U0();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void V(long j, iu30 iu30Var, be50 be50Var) {
        be50Var.f(this, getLayoutDirection(), j, new pg(this, iu30Var, this.b, (byte) 16));
    }

    @Override // p.wat
    public final float X0(float f) {
        return this.a.h() * f;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void Z(yk4 yk4Var, long j, long j2, long j3, long j4, float f, ColorFilter colorFilter, int i, int i2) {
        this.a.Z(yk4Var, j, j2, j3, j4, f, colorFilter, i, i2);
    }

    public final void a(fid fidVar, long j, ndo0 ndo0Var, m7v m7vVar, be50 be50Var) {
        m7v m7vVar2 = this.b;
        this.b = m7vVar;
        flb0 flb0Var = ndo0Var.U0.a1;
        cab cabVar = this.a.b;
        wat watVarR = cabVar.r();
        flb0 flb0VarT = cabVar.t();
        fid fidVarP = cabVar.p();
        long jU = cabVar.u();
        be50 be50VarS = cabVar.s();
        cabVar.A(ndo0Var);
        cabVar.C(flb0Var);
        cabVar.z(fidVar);
        cabVar.D(j);
        cabVar.B(be50Var);
        fidVar.q();
        try {
            m7vVar.t0(this);
            fidVar.i();
            cabVar.A(watVarR);
            cabVar.C(flb0VarT);
            cabVar.z(fidVarP);
            cabVar.D(jU);
            cabVar.B(be50VarS);
            this.b = m7vVar2;
        } catch (Throwable th) {
            fidVar.i();
            cabVar.A(watVarR);
            cabVar.C(flb0VarT);
            cabVar.z(fidVarP);
            cabVar.D(jU);
            cabVar.B(be50VarS);
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final cab a1() {
        return this.a.b;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void e1(long j, long j2, long j3, float f, int i, uw4 uw4Var) {
        this.a.e1(j, j2, j3, f, i, uw4Var);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final long g1() {
        return this.a.g1();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final flb0 getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // p.wat
    public final float h() {
        return this.a.h();
    }

    @Override // p.wat
    public final int i0(float f) {
        return this.a.i0(f);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final long j() {
        return this.a.j();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void j0(u8s0 u8s0Var, long j, float f, DrawStyle drawStyle, int i) {
        this.a.j0(u8s0Var, j, f, drawStyle, i);
    }

    @Override // p.wat
    public final long k1(long j) {
        return this.a.k1(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void m0(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, int i) {
        this.a.m0(brush, j, j2, j3, f, drawStyle, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void n0(u8s0 u8s0Var, Brush brush, float f, DrawStyle drawStyle, int i) {
        this.a.n0(u8s0Var, brush, f, drawStyle, i);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void o1(long j, float f, float f2, long j2, long j3, DrawStyle drawStyle) {
        this.a.o1(j, f, f2, j2, j3, drawStyle);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void p1(Brush brush, long j, long j2, float f, float f2) {
        this.a.p1(brush, j, j2, f, f2);
    }

    @Override // p.wat
    public final float q0(long j) {
        return this.a.q0(j);
    }

    @Override // p.wat
    public final long s(float f) {
        return this.a.s(f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // p.lsl
    public final void s1() throws Throwable {
        vid vidVar = this.a;
        cab cabVar = vidVar.b;
        fid fidVarP = vidVar.b.p();
        x4t x4tVar = this.b;
        if (x4tVar == null) {
            throw l1d.w("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        pim0 pim0VarO = eio1.o(x4tVar);
        if (pim0VarO == null) {
            ndo0 ndo0VarW = oap1.w(x4tVar, 4);
            if (ndo0VarW.f1() == ((pim0) x4tVar).a) {
                ndo0VarW = ndo0VarW.X0;
                ndo0VarW.getClass();
            }
            ndo0VarW.C1(fidVarP, cabVar.s());
            return;
        }
        bfn0 bfn0Var = null;
        while (pim0VarO != null) {
            if (pim0VarO instanceof m7v) {
                m7v m7vVar = (m7v) pim0VarO;
                be50 be50VarS = cabVar.s();
                ndo0 ndo0VarW2 = oap1.w(m7vVar, 4);
                long jR = o0c.R(ndo0VarW2.c);
                hmb0 hmb0Var = ndo0VarW2.U0;
                hmb0Var.getClass();
                ((ha4) kmb0.a(hmb0Var)).getSharedDrawScope().a(fidVarP, jR, ndo0VarW2, m7vVar, be50VarS);
            } else if ((pim0VarO.c & 4) != 0 && (pim0VarO instanceof l5t)) {
                int i = 0;
                for (pim0 pim0Var = ((l5t) pim0VarO).P0; pim0Var != null; pim0Var = pim0Var.f) {
                    if ((pim0Var.c & 4) != 0) {
                        i++;
                        if (i == 1) {
                            pim0VarO = pim0Var;
                        } else {
                            if (bfn0Var == null) {
                                bfn0Var = new bfn0(0, new pim0[16]);
                            }
                            if (pim0VarO != null) {
                                bfn0Var.b(pim0VarO);
                                pim0VarO = null;
                            }
                            bfn0Var.b(pim0Var);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            pim0VarO = oap1.e(bfn0Var);
        }
    }

    @Override // p.wat
    public final long t(long j) {
        return this.a.t(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final void u0(long j, float f, long j2, float f2, DrawStyle drawStyle, int i) {
        this.a.u0(j, f, j2, f2, drawStyle, i);
    }

    @Override // p.wat
    public final float y(long j) {
        return this.a.y(j);
    }
}
