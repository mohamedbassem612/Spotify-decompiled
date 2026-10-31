package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jdf1 extends f311 {
    public final o2b1 a;

    public jdf1(o2b1 o2b1Var) {
        this.a = o2b1Var;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1645361337);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1041) != 1040)) {
            Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(rk41Var));
            Object objT = x340Var.T();
            byte b = 2;
            lnm lnmVar = null;
            if (z || objT == fkj0.X) {
                objT = new jkz0(rk41Var, lnmVar, b);
                x340Var.s0(objT);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            vnr0 vnr0Var = (vnr0) ((wcf1) this.a.b).invoke(x340Var, 0);
            gra graVar = een.h;
            qgo1.f(vnr0Var, h2c.a.a(uyn1.z(24.0f, 0.0f, 2, u291.B(nim0Var, graVar, 2)), graVar), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, i2cVar, rk41Var, function0, (byte) 3);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return pk41.a;
    }
}
