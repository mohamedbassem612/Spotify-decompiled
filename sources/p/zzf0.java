package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zzf0 implements h0r0 {
    public final qyj a;
    public final na9 b;
    public final cbr0 c;

    public zzf0(qyj qyjVar, na9 na9Var) {
        this.a = qyjVar;
        this.b = na9Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{new bn70(yon1.a3(), nik1.r1, (nar0) null), new s9h1(14, true, false, false), new t1r0(true)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.c;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(-1707997231, new yzf0(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2139304693);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xto.t(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new vk1(ven0Var, (lnm) null, (byte) 15);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            bby bbyVarE = xay.e(2, irn1.o0(400, 1500, (dlv) null, 4));
            pxg1 pxg1VarO0 = irn1.o0(400, 1500, (dlv) null, 4);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = dvf0.Z;
                x340Var.s0(objT3);
            }
            fq7.b(pbh.a, zBooleanValue, (qim0) null, bbyVarE.a(xay.o(pxg1VarO0, (iu30) objT3)), (ln00) null, (String) null, apo.r(-1536600985, new otf0(this, (byte) 3), x340Var), x340Var, 1572870, 26);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yzf0(this, i);
        }
    }
}
