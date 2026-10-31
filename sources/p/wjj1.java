package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wjj1 implements h0r0 {
    public final qyj a;
    public final xjj1 b;
    public final cbr0 c;

    public wjj1(qyj qyjVar, los losVar, xjj1 xjj1Var) {
        this.a = qyjVar;
        this.b = xjj1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70(yon1.d3(), nik1.u1, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1877037685, new muh1(this, (byte) 20), true));
    }

    public final void c(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        int i3 = i2 | (kk0.t(-882822986, i, x340Var) ? 4 : 2) | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            era eraVar = een.Q0;
            d36 d36Var = new d36(dsa0.m(x340Var, 2131167192), false, new g21(een.Z, (byte) 28));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(too1.y(uyn1.B(u291.f(qim0Var3, 1.0f), 0.0f, dsa0.m(x340Var, 2131167193), 0.0f, 0.0f, 13), poo1.F(cev0.E(x340Var), 32)), dsa0.m(x340Var, 2131167191));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarH, 16.0f, 8.0f);
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(cwl1.o0(x340Var, 2131963754), (qim0) null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
            uwo1.e(cwl1.o0(x340Var, i2p1.i(i)), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(this, i, qim0Var2, i2, (byte) 27);
        }
    }
}
