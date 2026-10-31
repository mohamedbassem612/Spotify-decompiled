package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nve1 extends f311 {
    public final String a;

    public nve1(String str) {
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        vu30 vu30Var;
        vu30 vu30Var2;
        llj lljVar;
        ?? r4;
        qim0 qim0Var;
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2021481772);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            hon1.v(x340Var);
            ven0 ven0VarR = zod.R(new hsi1("TimerScene", 0, 30000, irn1.o0(30000, 0, mlv.d, 2), rno1.b), rk41Var.a, function1, x340Var, 8 | (i2 & 896), 0);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarA = i2cVar.a(dug.f(uyn1.x(qim0Var2, 8.0f), z4p1.e(1711276032), d4o1.a), een.t);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function3 = hmb0.t1;
            if (z) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var4);
            String str = this.a;
            if (ihc1.y0(str)) {
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                lljVar = lljVar3;
                r4 = 0;
                qim0Var = qim0Var2;
                function2 = function3;
                x340Var.i0(-1017063964);
                x340Var.r(false);
            } else {
                x340Var.i0(-1017247763);
                uwr uwrVar = cbx.a;
                function2 = function3;
                vu30Var2 = vu30Var4;
                r4 = 0;
                qim0Var = qim0Var2;
                vu30Var = vu30Var3;
                lljVar = lljVar3;
                uwo1.e(str, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7), cbx.d(x340Var).g, u7h.f, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 3120, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            }
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, (int) r4);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, vu30Var);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var2);
            String strValueOf = String.valueOf(((Number) ven0VarR.getValue()).intValue());
            uwr uwrVar2 = cbx.a;
            x340 x340Var2 = x340Var;
            uwo1.e(strValueOf, (qim0) null, cbx.d(x340Var).g, u7h.f, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 3072, 0, 2034);
            x340Var = x340Var2;
            op71.g(x340Var, new wnb0(1.0f, true));
            x340Var.i0(-2120744216);
            x340Var.r((boolean) r4);
            x340Var.i0(-2120460504);
            x340Var.r((boolean) r4);
            x340Var.r(true);
            x0d.s(qim0Var, 32.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 18);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return nk41.a;
    }
}
