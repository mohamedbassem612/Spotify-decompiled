package p;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class drz0 implements h0r0 {
    public final grz0 a;
    public final mmq b;
    public final qyj c;
    public final cbr0 d;

    public drz0(grz0 grz0Var, mmq mmqVar, qyj qyjVar) {
        this.a = grz0Var;
        this.b = mmqVar;
        this.c = qyjVar;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.w4(), nik1.T.b(pno1.c(grz0Var.a().h())), (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, (los) null, false, false, true, (nsm0) null, 3837), new hgr0(egr0.a, 0, 2)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.c.a(apo.j(-113099469, new crz0(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-901333855);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            this.b.getClass();
            hz5 hz5VarA = mmq.a();
            tbr0 tbr0VarC = ((cir0) x340Var.k(k2r0.a)).c();
            grz0 grz0Var = this.a;
            String strH = grz0Var.a().h();
            List listG = grz0Var.a().g();
            String strA = grz0Var.a().a();
            v0a v0aVarB = grz0Var.a().b();
            boolean zI = x340Var.i(tbr0VarC);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ziz0(tbr0VarC, (byte) 1);
                x340Var.s0(objT);
            }
            jrz0 jrz0Var = new jrz0(strH, listG, strA, v0aVarB, (vu30) objT);
            qim0 qim0VarY = too1.y(u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3), poo1.F(cev0.E(x340Var), 32));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            otw.c(hz5VarA, jrz0Var, uyn1.z(16.0f, 0.0f, 2, qim0VarY), (ipb1) null, x340Var, 8, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new crz0(this, i);
        }
    }
}
