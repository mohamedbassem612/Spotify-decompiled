package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l8r0 implements i8r0 {
    public final ljm0 X;
    public final ia00 Y;
    public final psw Z;
    public final lzn0 a;
    public final m8r0 b;
    public final w8r0 c;
    public final n9r0 d;
    public final ypg0 e;
    public final zob1 f;
    public final k740 g;
    public final kt91 h;
    public final kg90 i;
    public final ov20 t;

    public l8r0(lzn0 lzn0Var, m8r0 m8r0Var, w8r0 w8r0Var, n9r0 n9r0Var, ypg0 ypg0Var, zob1 zob1Var, k740 k740Var, kt91 kt91Var, kg90 kg90Var, ov20 ov20Var) {
        this.a = lzn0Var;
        this.b = m8r0Var;
        this.c = w8r0Var;
        this.d = n9r0Var;
        this.e = ypg0Var;
        this.f = zob1Var;
        this.g = k740Var;
        this.h = kt91Var;
        this.i = kg90Var;
        this.t = ov20Var;
        q4r0 q4r0Var = q4r0.t;
        fns fnsVar = igu.a;
        this.X = h7w.D(q4r0Var, pyf0.a, null, new j2i(296942743, new sw1(this, (byte) 27), true), 4);
        this.Y = n3o1.q(this).a(jgq0.h, jgq0.i);
        j2i j2iVar = new j2i(-1449362769, new aso0(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.Z = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.Z;
    }

    public final void e(boolean z, boolean z2, boolean z3, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        int i4;
        qim0 qim0VarB;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1539786806);
        if ((i & 6) == 0) {
            i2 = (x340Var.g((Object) null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(this) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            String strO0 = cwl1.o0(x340Var, 2131959484);
            if (z2) {
                i3 = -1537713053;
                i4 = 2131959481;
            } else {
                i3 = -1537622905;
                i4 = 2131959480;
            }
            String strK = x0d.k(x340Var, i3, i4, x340Var, false);
            qim0 qim0Var = nim0.a;
            qim0 qim0VarN = z ? anm1.N("page_match_button_unavailable_test_tag", qim0Var) : qim0Var;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean zG = ((i2 & 57344) == 16384) | x340Var.g(strK);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new are(iu30Var, strK, (byte) 12);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            pex pexVar = pex.b;
            lex lexVarZ = yoo1.z(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN2 = anm1.N("page_match_button_test_tag", pqo.h(uyn1.z(0.0f, 8.0f, 1, qim0Var), z));
            if (z) {
                x340Var.i0(-1761706815);
                boolean zG2 = x340Var.g(strO0);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new atp0(strO0, (byte) 7);
                    x340Var.s0(objT2);
                }
                qim0VarB = s161.b(qim0Var, false, (iu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(-1761610188);
                x340Var.r(false);
                qim0VarB = qim0Var;
            }
            poo1.e(gbxVar, pexVar, lexVarZ, qim0VarN2.then(qim0VarB).then((!z3 || z) ? qim0Var : zr7.i(qim0Var, mgn0.t)), 0, (String) null, (max) null, j5j.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-548334711, new nso0(this, (byte) 18), x340Var), x340Var, 12582912, 3072, 8048);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vre(this, z, z2, z3, iu30Var, i, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        return this.X;
    }
}
