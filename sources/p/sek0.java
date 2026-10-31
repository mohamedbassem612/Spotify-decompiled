package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sek0 implements xpw {
    public final e9g0 a;
    public final rey0 b = new rey0(new mbj0(this, (byte) 16));
    public final ia00 c = n3o1.q(this).a(w7k0.T0, w7k0.U0);
    public final psw d;

    public sek0(e9g0 e9g0Var) {
        this.a = e9g0Var;
        j2i j2iVar = new j2i(1895767082, new y3i0(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-632170657);
        int i2 = i | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(function1) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).b.a, 0.0f, 2, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131958744);
            lee1 lee1Var = cbx.d(x340Var2).d;
            float f = cbx.b(x340Var2).b.a;
            float f2 = cbx.b(x340Var2).b.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            nim0 nim0Var = nim0.a;
            uwo1.e(strO0, uyn1.B(nim0Var, f, 16.0f, f2, 0.0f, 8), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
            String strO1 = cwl1.o0(x340Var2, 2131958741);
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            uwo1.e(strO1, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var2, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2016);
            idx idxVar = new idx(4);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarN = anm1.N("harmonize_confirmation_primary", uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13));
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                z = true;
                objT = new kek0(function0, (byte) 1);
                x340Var2.s0(objT);
            } else {
                z = true;
            }
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, (Function0) objT), idxVar, qim0VarN, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, f2j.a, x340Var2, 0, 48, 2040);
            ldx ldxVar = ldx.c;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            cvx cvxVar5 = cbx.b(x340Var2).b;
            qim0 qim0VarN2 = anm1.N("harmonize_confirmation_secondary", uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 16.0f, 5));
            boolean z3 = (i2 & 112) == 32;
            Object objT2 = x340Var2.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new kek0(function1, (byte) 2);
                x340Var2.s0(objT2);
            }
            foo1.c(new gbx(z50Var, (Function0) objT2), ldxVar, qim0VarN2, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, f2j.b, x340Var2, 0, 48, 2040);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, this, function0, function1, qim0Var, (byte) 22);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
