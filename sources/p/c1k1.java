package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c1k1 implements h0r0 {
    public final qyj a;
    public final los b;
    public final c380 c;
    public final kly0 d;
    public final lr61 e;
    public final lzn0 f;
    public final a1r0 g;
    public final boolean h;
    public final cbr0 i;

    public c1k1(qyj qyjVar, los losVar, c380 c380Var, tsq tsqVar, lr61 lr61Var, nv4 nv4Var, lzn0 lzn0Var, a1r0 a1r0Var) {
        p6r0 p6r0VarD3;
        this.a = qyjVar;
        this.b = losVar;
        this.c = c380Var;
        this.d = tsqVar;
        this.e = lr61Var;
        this.f = lzn0Var;
        this.g = a1r0Var;
        boolean zD = nv4Var.d();
        this.h = zD;
        if (zD) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0VarD3 = yon1.b3();
        } else {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            p6r0VarD3 = yon1.d3();
        }
        this.i = new cbr0(new dbr0[]{new bn70(p6r0VarD3, zD ? nik1.t1 : nik1.s1, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, true, (nsm0) null, 3805)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(217468167, new muh1(this, (byte) 28), true));
    }

    public final void c(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(926983665);
        int i2 = (x340Var.i(c380Var) ? 4 : 2) | i | 48 | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = apo.q(0);
                x340Var.s0(objT);
            }
            hdn0 hdn0Var = (hdn0) objT;
            boolean zI = x340Var.i(hdn0Var) | x340Var.i(iac0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hij1(iac0Var, hdn0Var, (byte) 9);
                x340Var.s0(objT2);
            }
            qxd0.i(iac0Var, (iu30) objT2, x340Var);
            boolean zI2 = x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new z0k1(this, (byte) 1);
                x340Var.s0(objT3);
            }
            dgo1.c("VideoSettingsPage", (iu30) objT3, apo.r(1140724525, new pej1(this, c380Var, hdn0Var), x340Var), x340Var, 390);
            boolean zI3 = x340Var.i(this);
            Object objT4 = x340Var.T();
            if (zI3 || objT4 == m4cVar) {
                objT4 = new z0k1(this, (byte) 4);
                x340Var.s0(objT4);
            }
            qxd0.i(this, (iu30) objT4, x340Var);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pej1(this, c380Var, qim0Var2, i, (byte) 8);
        }
    }
}
