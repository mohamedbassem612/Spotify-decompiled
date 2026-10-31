package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wjr0 implements hsb0 {
    public final /* synthetic */ jkr0 a;
    public final /* synthetic */ qqq0 b;
    public final /* synthetic */ vzq0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ gdr0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ pl3 h;
    public final /* synthetic */ nl3 i;
    public final /* synthetic */ byte j;
    public final /* synthetic */ xu91 k;
    public final /* synthetic */ c9n l;

    /* JADX WARN: Multi-variable type inference failed */
    public wjr0(jkr0 jkr0Var, qqq0 qqq0Var, vzq0 vzq0Var, float f, gdr0 gdr0Var, ima0 ima0Var, Function0 function0, pl3 pl3Var, nl3 nl3Var, int i, xu91 xu91Var, c9n c9nVar) {
        this.a = jkr0Var;
        this.b = qqq0Var;
        this.c = vzq0Var;
        this.d = f;
        this.e = gdr0Var;
        this.f = ima0Var;
        this.g = function0;
        this.h = pl3Var;
        this.i = nl3Var;
        this.j = i;
        this.k = xu91Var;
        this.l = c9nVar;
    }

    @Override // p.hsb0
    public final hfh0 a(isb0 isb0Var, long j) {
        tlc1 tlc1Var = isb0Var.b;
        jkr0 jkr0Var = this.a;
        s8p1.h(jkr0Var.C);
        qqq0 qqq0Var = this.b;
        qqq0 qqq0Var2 = qqq0.a;
        boolean z = qqq0Var == qqq0Var2;
        vxo1.k(j, z ? qqq0Var2 : qqq0.b);
        vzq0 vzq0Var = this.c;
        int iI0 = z ? tlc1Var.i0(vzq0Var.b(tlc1Var.getLayoutDirection())) : tlc1Var.i0(uyn1.n(vzq0Var, tlc1Var.getLayoutDirection()));
        int iI1 = z ? tlc1Var.i0(vzq0Var.c(tlc1Var.getLayoutDirection())) : tlc1Var.i0(uyn1.m(vzq0Var, tlc1Var.getLayoutDirection()));
        int iI2 = tlc1Var.i0(vzq0Var.d());
        int iI3 = tlc1Var.i0(vzq0Var.a()) + iI2;
        boolean z2 = z;
        int i = iI0 + iI1;
        int i2 = z2 ? iI3 : i;
        if (z2) {
            iI1 = iI2;
        } else if (!z2) {
            iI1 = iI0;
        }
        int i3 = i2 - iI1;
        long jI = jjl.i(-i, j, -iI3);
        jkr0Var.n = isb0Var;
        int iI4 = tlc1Var.i0(this.d);
        int iH = z2 ? hjl.h(j) - iI3 : hjl.i(j) - i;
        long j2 = (((long) iI0) << 32) | (((long) iI2) & 4294967295L);
        int iA = this.e.a(isb0Var, iH);
        int i4 = iA < 0 ? 0 : iA;
        jjl.b(0, qqq0Var == qqq0Var2 ? hjl.i(jI) : i4, 0, qqq0Var != qqq0Var2 ? hjl.h(jI) : i4, 5);
        sjr0 sjr0Var = (sjr0) this.f.invoke();
        int i5 = iH + iI1 + i3;
        xu91 xu91Var = this.k;
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            kl1 kl1Var = jkr0Var.d;
            int iV = kl1Var.v(sjr0Var, kl1Var.p());
            kl1Var.p();
            float fQ = kl1Var.q();
            jkr0Var.l();
            int iU = jch0.U(xu91Var.a(i5, i4, iI1, i3) - (fQ * (i4 + iI4)));
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            edn0 edn0VarI = ulo1.i(sjr0Var, jkr0Var.A, jkr0Var.w);
            fdn0 fdn0Var = pr80.a;
            xjr0 xjr0VarV = i1o1.v(isb0Var, ((Number) this.g.invoke()).intValue(), sjr0Var, iH, iI1, i3, iI4, iV, iU, jI, qqq0Var, this.h, this.i, j2, i4, this.j, edn0VarI, this.k, jkr0Var.B, this.l, isb0Var, new mtb0(isb0Var, j, i, iI3, (byte) 1), new fdn0());
            jkr0Var.h(xjr0VarV, tlc1Var.W(), false);
            k1o1.d(isb0Var, jkr0Var.v, xjr0VarV.a);
            return xjr0VarV;
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }
}
