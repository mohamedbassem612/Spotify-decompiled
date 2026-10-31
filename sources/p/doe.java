package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class doe implements zk90 {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final n381 c;

    public doe(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new yd91(3, new jgd0(this, (byte) 13));
                this.c = p381.a;
                break;
            case 2:
                this.b = new yd91(3, new pdp0(this, (byte) 12));
                this.c = p381.a;
                break;
            default:
                this.b = new yd91(3, new ptb(this, (byte) 27));
                this.c = p381.a;
                break;
        }
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.c;
    }

    @Override // p.pk90
    public final yd91 d() {
        byte b = this.a;
        return this.b;
    }

    public void e(List list, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(505294168);
        int i2 = (x340Var.g(list) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strY0 = o7h.y0(x340Var.k(t4k.n) == flb0.b ? o7h.T0(list) : list, ", ", (String) null, (String) null, (iu30) null, 62);
            uwr uwrVar = cbx.a;
            uwo1.e(strY0, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1722);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(this, list, i, (byte) 5);
        }
    }

    public void f(coe coeVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1799785136);
        int i2 = (x340Var.g(coeVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(coeVar.a, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1726);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(this, coeVar, i, (byte) 3);
        }
    }

    public void g(wee0 wee0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1043453525);
        int i2 = (x340Var.g(wee0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objK = x340Var.k(t4k.n);
            List listT0 = wee0Var.a;
            if (objK == flb0.b) {
                listT0 = o7h.T0(listT0);
            }
            String strY0 = o7h.y0(listT0, "", (String) null, (String) null, (iu30) null, 62);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwr uwrVar = cbx.a;
            uwo1.e(strY0, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1722);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(this, wee0Var, i, (byte) 2);
        }
    }

    public doe(erq erqVar) {
        this.a = (byte) 3;
        this.b = new yd91(3, new fe81(erqVar, (byte) 28));
        this.c = p381.a;
    }
}
