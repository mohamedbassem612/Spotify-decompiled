package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nr00 implements o1i {
    public final /* synthetic */ byte a;

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((mr00) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((jz70) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                e((vw81) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        switch (this.a) {
            case 0:
                return new x0i(new w0i(o0iVar.e, cbp1.h("badge_row", ((mr00) z0iVar).a), null, null, 12));
            case 1:
                return new x0i(new w0i(o0iVar.e, "image_row", null, null, 12));
            default:
                return new x0i(new w0i(o0iVar.e, "simple_entity_row", null, null, 12));
        }
    }

    public void c(mr00 mr00Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1610148838);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mr00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 131) != 130)) {
            k4m k4mVar = mr00Var.b ? k4m.a : k4m.b;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fa00.t;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zE = x340Var.e(k4mVar.ordinal()) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                objT2 = new f0z(k4mVar, mr00Var, (byte) 23);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var, qim0Var, (iu30) objT2, x340Var, ((i2 >> 3) & 112) | 6, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, mr00Var, o0iVar, qim0Var, (byte) 24);
        }
    }

    public void d(jz70 jz70Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1301902106);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(jz70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 131) != 130)) {
            Uri uri = Uri.parse(jz70Var.a.a);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            eso1.e(uri, isl.a, uyn1.z(0.0f, cbx.b(b0kVar3).b.c, 1, qim0Var), null, null, null, mif1.Q0, null, null, null, false, false, b0kVar2, 1797168, 0, 3968);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, this, jz70Var, o0iVar, qim0Var, (byte) 18);
        }
    }

    public void e(vw81 vw81Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1065837388);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(vw81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 131) != 130)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String str = vw81Var.a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1722);
            uwo1.e(vw81Var.b, (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1714);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, this, vw81Var, o0iVar, qim0Var, (byte) 16);
        }
    }
}
