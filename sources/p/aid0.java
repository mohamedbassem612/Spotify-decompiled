package p;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aid0 implements qj41 {
    public final wj31 a;
    public final zhd0 b;
    public final boolean c;

    public aid0(wj31 wj31Var, zhd0 zhd0Var, boolean z) {
        this.a = wj31Var;
        this.b = zhd0Var;
        this.c = z;
    }

    @Override // p.qj41
    public final void a(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(818691153);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 256 : 128;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 8339) != 8338)) {
            x340Var.i0(783187512);
            boolean z = rk41Var.a;
            nim0 nim0Var = nim0.a;
            this.a.b(new jj31(z, i, u291.d(nim0Var, 1.0f), 0, (jfe) null, (List) null, (Map) null, false, false, (Function0) null, (iu30) null, 4088), x340Var, 8);
            x340Var.r(false);
            ven0 ven0VarY = h7w.y(x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            if (((Boolean) ven0VarY.getValue()).booleanValue()) {
                x340Var.i0(-1490553213);
                Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
                boolean z2 = (i3 & 896) == 256 || ((i3 & 512) != 0 && x340Var.i(rk41Var));
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new uka(rk41Var, lz20Var, null, (byte) 4);
                    x340Var.s0(objT2);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(-1490262991);
                x340Var.r(false);
            }
            x340Var.f0(783212260, Integer.valueOf(i));
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            hon1.v(x340Var);
            qim0 qim0VarA = i2cVar.a(uyn1.B(qim0VarD, 0.0f, 64.0f, 0.0f, 0.0f, 13), een.h);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarThen = vby0.p(u291.f(nim0Var, 1.0f), lz20Var).then(c030.a);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = ecd0.X0;
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarThen, true, (iu30) objT3);
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            boolean z4 = rk41Var.a;
            zhd0 zhd0Var = this.b;
            j0p1.f(z4, this.c, zhd0Var.a, (qim0) null, x340Var, 0);
            j0p1.d(rk41Var.a, this.c, zhd0Var.b, (qim0) null, x340Var, 0);
            j0p1.e(rk41Var.a, this.c, zhd0Var.c, (qim0) null, x340Var, 0);
            x340Var.r(true);
            uwr uwrVar = cbx.a;
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
            don1.i(zhd0Var.e, 2000, rk41Var.a, this.c, (qim0) null, (djc0) null, x340Var, 56, 48);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(this, i2cVar, i, rk41Var, function0, i2, (byte) 14);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return pk41.a;
    }
}
