package p;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class otb0 implements hsb0 {
    public final /* synthetic */ xtb0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vzq0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ g36 f;
    public final /* synthetic */ c36 g;
    public final /* synthetic */ c9n h;
    public final /* synthetic */ yd50 i;
    public final /* synthetic */ t2b j;
    public final /* synthetic */ nl3 k;
    public final /* synthetic */ pl3 l;

    public otb0(xtb0 xtb0Var, boolean z, vzq0 vzq0Var, boolean z2, ima0 ima0Var, g36 g36Var, c36 c36Var, c9n c9nVar, yd50 yd50Var, t2b t2bVar, nl3 nl3Var, pl3 pl3Var) {
        this.a = xtb0Var;
        this.b = z;
        this.c = vzq0Var;
        this.d = z2;
        this.e = ima0Var;
        this.f = g36Var;
        this.g = c36Var;
        this.h = c9nVar;
        this.i = yd50Var;
        this.j = t2bVar;
        this.k = nl3Var;
        this.l = pl3Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // p.hsb0
    public final hfh0 a(isb0 isb0Var, long j) throws KotlinNothingValueException {
        float fA;
        tlc1 tlc1Var = isb0Var.b;
        xtb0 xtb0Var = this.a;
        s8p1.h(xtb0Var.t);
        boolean z = xtb0Var.b || tlc1Var.W();
        boolean z2 = this.b;
        vxo1.k(j, z2 ? qqq0.a : qqq0.b);
        vzq0 vzq0Var = this.c;
        int iI0 = z2 ? tlc1Var.i0(vzq0Var.b(tlc1Var.getLayoutDirection())) : tlc1Var.i0(uyn1.n(vzq0Var, tlc1Var.getLayoutDirection()));
        int iI1 = z2 ? tlc1Var.i0(vzq0Var.c(tlc1Var.getLayoutDirection())) : tlc1Var.i0(uyn1.m(vzq0Var, tlc1Var.getLayoutDirection()));
        int iI2 = tlc1Var.i0(vzq0Var.d());
        int iI3 = tlc1Var.i0(vzq0Var.a());
        int i = iI2 + iI3;
        int i2 = iI0 + iI1;
        int i3 = z2 ? i : i2;
        boolean z3 = this.d;
        if (z2 && !z3) {
            iI1 = iI2;
        } else if (z2 && z3) {
            iI1 = iI3;
        } else if (!z2 && !z3) {
            iI1 = iI0;
        }
        int i4 = i3 - iI1;
        long jI = jjl.i(-i2, j, -i);
        ktb0 ktb0Var = (ktb0) this.e.invoke();
        aqb0 aqb0Var = ktb0Var.c;
        int i5 = hjl.i(jI);
        int iH = hjl.h(jI);
        aqb0Var.a.t(i5);
        aqb0Var.b.t(iH);
        if (z2) {
            g36 g36Var = this.f;
            if (g36Var == null) {
                throw kaa0.g("null verticalArrangement when isVertical == true");
            }
            fA = g36Var.a();
        } else {
            c36 c36Var = this.g;
            if (c36Var == null) {
                throw kaa0.g("null horizontalAlignment when isVertical == false");
            }
            fA = c36Var.a();
        }
        int iI4 = tlc1Var.i0(fA);
        int iC = ktb0Var.b.C();
        int iH2 = z2 ? hjl.h(j) - i : hjl.i(j) - i2;
        boolean z4 = this.d;
        if (z4 && iH2 <= 0) {
            if (!z2) {
                iI0 += iH2;
            }
            if (z2) {
                iI2 += iH2;
            }
        }
        int i6 = iI1;
        ntb0 ntb0Var = new ntb0(jI, this.b, ktb0Var, isb0Var, iC, iI4, this.k, this.l, z4, i6, i4, (((long) iI0) << 32) | (((long) iI2) & 4294967295L), this.a);
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            i25 i25Var = xtb0Var.e;
            int iS = ((err0) i25Var.b).s();
            int iP = qmo1.p(iS, i25Var.d, ktb0Var);
            if (iS != iP) {
                ((err0) i25Var.b).t(iP);
                ((ksb0) i25Var.e).c(iS);
            }
            int iS2 = ((err0) i25Var.c).s();
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            ptb0 ptb0VarL = hno1.l(iC, ntb0Var, iH2, i6, i4, iI4, iP, iS2, (tlc1Var.W() || !z) ? xtb0Var.h : xtb0Var.x.f(), jI, this.b, this.f, this.g, this.d, isb0Var, xtb0Var.o, ulo1.i(ktb0Var, xtb0Var.s, xtb0Var.f145p), z, tlc1Var.W(), this.h, xtb0Var.w, this.i, this.j, !xtb0Var.i, new mtb0(isb0Var, j, i2, i, (byte) 0));
            xtb0Var.g(ptb0VarL, tlc1Var.W(), false);
            l5s l5sVar = xtb0Var.a;
            return ptb0VarL;
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }
}
