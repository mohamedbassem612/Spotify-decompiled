package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j2a implements o1i {
    public final /* synthetic */ byte a;
    public final cce b;

    public /* synthetic */ j2a(cce cceVar, byte b) {
        this.a = b;
        this.b = cceVar;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((h2a) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((dyc) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                e((jy81) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public void c(h2a h2aVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(776555238);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(h2aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            x340Var.i0(64242360);
            Iterator it = h2aVar.a.iterator();
            while (it.hasNext()) {
                this.b.a(392 | ((i3 >> 3) & 14), o0iVar, (z0i) it.next(), x340Var, nim0.a);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, h2aVar, o0iVar, qim0Var, (byte) 26);
        }
    }

    public void d(dyc dycVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(674701402);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dycVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        boolean z = true;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            qim0 qim0VarT = zro1.t(u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3), xtb0VarA);
            d36 d36Var = new d36(8.0f, true, new g21(een.P0, (byte) 29));
            boolean zI = ((i2 & 14) == 4) | x340Var.i(this);
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !x340Var.i(o0iVar))) {
                z = false;
            }
            boolean z2 = zI | z;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new oo6(dycVar, this, o0iVar, (byte) 29);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarT, xtb0VarA, (vzq0) null, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 24576, 492);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, dycVar, o0iVar, qim0Var, (byte) 10);
        }
    }

    public void e(jy81 jy81Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1708156103);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(jy81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = qim0Var2;
            boolean z = true;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            x340Var.i0(-268983620);
            Iterator it = jy81Var.b.iterator();
            while (it.hasNext()) {
                this.b.a(((i2 >> 3) & 14) | 392, o0iVar, (z0i) it.next(), x340Var, u291.f(nim0.a, 1.0f));
                z = z;
            }
            x340Var.r(false);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, this, jy81Var, o0iVar, qim0Var, (byte) 18);
        }
    }
}
