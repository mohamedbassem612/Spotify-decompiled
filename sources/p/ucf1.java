package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ucf1 extends f311 {
    public final lfa1 a;
    public final tob1 b;
    public final boolean c;
    public final int d;
    public final int e;
    public final Function0 f;
    public final boolean g;
    public final boolean h;

    public ucf1(lfa1 lfa1Var, tob1 tob1Var, boolean z, Function0 function0, int i) {
        int i2 = (i & 8) != 0 ? 0 : 300;
        int i3 = (i & 16) != 0 ? 1 : 2;
        function0 = (i & 32) != 0 ? q9f1.h : function0;
        boolean z2 = (i & 64) == 0;
        this.a = lfa1Var;
        this.b = tob1Var;
        this.c = z;
        this.d = i2;
        this.e = i3;
        this.f = function0;
        this.g = z2;
        this.h = false;
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1661578232);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? b0kVar3.g(this) : b0kVar3.i(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1041) != 1040)) {
            qam1 qam1Var = (qam1) b0kVar3.k(sam1.a);
            boolean zBooleanValue = ((Boolean) this.b.getValue()).booleanValue();
            boolean z = rk41Var.a;
            boolean zI = ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && b0kVar3.i(this))) | b0kVar3.i(qam1Var);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new x0e1(this, qam1Var, (byte) 16);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            tcf1 tcf1VarQ = lvx.q(zBooleanValue, this.c, z, this.d, "image", this.e, (Function0) objT, this.f, b0kVar2, 0);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar2).b.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            h7w.b(this.a, uyn1.y(qim0VarD2, f, 16.0f), ((Boolean) tcf1VarQ.g.getValue()).booleanValue(), this.g, tcf1VarQ, b0kVar2, 0);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, i2cVar, rk41Var, function0, (byte) 1);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return nk41.a;
    }
}
