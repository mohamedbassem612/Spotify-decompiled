package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z6g0 implements h0r0 {
    public final yuj a;
    public final q6g0 b;
    public final jpa0 c;
    public final d4e0 d;
    public final pbq e;
    public final e7g0 f;
    public final sb40 g;
    public final n8l0 h;
    public final cbr0 i;

    public z6g0(yuj yujVar, q6g0 q6g0Var, jpa0 jpa0Var, d4e0 d4e0Var, pbq pbqVar, e7g0 e7g0Var, khc khcVar, sb40 sb40Var, e5b0 e5b0Var, n8l0 n8l0Var) {
        this.a = yujVar;
        this.b = q6g0Var;
        this.c = jpa0Var;
        this.d = d4e0Var;
        this.e = pbqVar;
        this.f = e7g0Var;
        this.g = sb40Var;
        this.h = n8l0Var;
        this.i = new cbr0(new dbr0[]{new bn70(e7g0Var.e(), e7g0Var.a(), (nar0) null), new yxe1(new jx21(2131958071)), new pu00(true), new t1r0(true), e5b0Var}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.i;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        boolean zB = this.g.b.b();
        yuj yujVar = this.a;
        return zB ? yuj.b(yujVar, f610.e(new p6e0[0], new u6g0(this, (lnm) null, (byte) 1)), apo.j(-1842682792, new v6g0(this, (byte) 1), true), new n7e0(new y6g0(this), new x6g0(this, (byte) 1), new ubc((byte) 15), j2g0.h)) : yuj.b(yujVar, f610.e(new p6e0[0], new u6g0(this, (lnm) null, (byte) 0)), apo.j(1728994071, new v6g0(this, (byte) 0), true), new n7e0(new w6g0(this), new x6g0(this, (byte) 0), new nbc((byte) 15), j2g0.g));
    }

    public final void c(iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1571025282);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarV = xto.v(iu30Var, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new s6g0(ven0VarV);
                x340Var.s0(objT);
            }
            s6g0 s6g0Var = (s6g0) objT;
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            boolean zG = x340Var.g(cir0Var) | x340Var.i(s6g0Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new j2d0(cir0Var, s6g0Var, (byte) 23);
                x340Var.s0(objT2);
            }
            qxd0.i(cir0Var, (iu30) objT2, x340Var);
            j2iVar.invoke(x340Var, Integer.valueOf((i2 >> 3) & 14));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, iu30Var, j2iVar, i, (byte) 14);
        }
    }

    public final void d(r6g0 r6g0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2050180910);
        int i2 = (x340Var.g(r6g0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            irn1.u((qim0) null, (vu30) null, (vu30) null, (erl1) null, apo.r(1495128231, new iwf0(r6g0Var, this, iu30Var, (byte) 2), x340Var), x340Var, 24576, 15);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t6g0(this, r6g0Var, iu30Var, i, (byte) 0);
        }
    }

    public final void e(r6g0 r6g0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1088555695);
        int i2 = (x340Var.g(r6g0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = khc.i(r6g0Var);
                x340Var.s0(objT);
            }
            kln1.e((h7g0) objT, cwl1.C(((cir0) x340Var.k(k2r0.a)).g()), this.e, this.h, iu30Var, x340Var, (i2 << 9) & 57344);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t6g0(this, r6g0Var, iu30Var, i, (byte) 1);
        }
    }
}
