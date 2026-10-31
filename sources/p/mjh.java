package p;

import android.graphics.Rect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mjh implements o1i {
    public final /* synthetic */ byte a;
    public final bcl1 b;
    public final Object c;
    public final Object d;

    public mjh(bcl1 bcl1Var, tmh tmhVar, lik1 lik1Var) {
        this.a = (byte) 0;
        this.b = bcl1Var;
        this.c = tmhVar;
        this.d = lik1Var;
    }

    public final /* bridge */ /* synthetic */ void a(int i, o0i o0iVar, z0i z0iVar, b0k b0kVar, qim0 qim0Var) {
        switch (this.a) {
            case 0:
                c((ljh) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 1:
                d((lu50) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            case 2:
                e((k8e1) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
            default:
                f((zlf1) z0iVar, o0iVar, qim0Var, b0kVar, i);
                break;
        }
    }

    public void c(ljh ljhVar, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1347915494);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ljhVar) ? 4 : 2) | i;
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
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(this) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new d1c(this, o0iVar, ljhVar, (byte) 23);
                x340Var.s0(objT);
            }
            z6p1.d(ljhVar, (Function0) objT, qim0Var, x340Var, i2 & 910);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, ljhVar, o0iVar, qim0Var, (byte) 28);
        }
    }

    public void d(lu50 lu50Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        o0i o0iVar2;
        lu50 lu50Var2 = lu50Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(770256998);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lu50Var2) ? 4 : 2) | i;
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
        boolean z = false;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            hcl1 hcl1Var = (hcl1) this.d;
            int i4 = i3 & 112;
            boolean zI = x340Var.i(this) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar)));
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new fz40(this, o0iVar, (byte) 11);
                x340Var.s0(objT);
            }
            l0o1.c(hcl1Var, lu50Var2, (iu30) objT, qim0Var, x340Var, (i3 << 3) & 7280);
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = v8r.q(z6x.a);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zG = x340Var.g(ven0Var) | (i5 == 4) | x340Var.i(this);
            if (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar))) {
                z = true;
            }
            boolean z3 = zG | z;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                o0iVar2 = o0iVar;
                lu50Var2 = lu50Var;
                lhx lhxVar = new lhx(lu50Var2, this, o0iVar2, ven0Var, (byte) 12);
                x340Var.s0(lhxVar);
                objT3 = lhxVar;
            } else {
                o0iVar2 = o0iVar;
                lu50Var2 = lu50Var;
            }
            oto1.c(lu50Var2, o0iVar2, (iu30) objT3, x340Var, i5 | 64 | i4);
        } else {
            o0iVar2 = o0iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, (Object) this, (Object) lu50Var2, (Object) o0iVar2, (Object) qim0Var, (byte) 7);
        }
    }

    public void e(k8e1 k8e1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        q9l1 q9l1Var = (q9l1) this.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(998357222);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(k8e1Var) ? 4 : 2) | i;
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
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fM0 = ((wat) x340Var.k(t4k.h)).M0(((Rect) q9l1Var.h.d.e).width());
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            int i3 = i2;
            ven0 ven0VarG = rwq.g(new n8e1(q9l1Var.h.e, j), new u7h(j), (o8n) null, x340Var, 0, 2);
            qim0 qim0VarZ = uyn1.z(fM0, 0.0f, 2, qim0Var);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            gbx gbxVar = null;
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
            kgx kgxVar = new kgx(0, (vu30) null, (vu30) null, (vu30) null, 15);
            if (k8e1Var.d.length() > 0) {
                x340Var.i0(2117315721);
                boolean zI = x340Var.i(this) | ((i3 & 14) == 4) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar)));
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new o8e1(this, k8e1Var, o0iVar, (byte) 0);
                    x340Var.s0(objT);
                }
                gbx gbxVar2 = new gbx(z50.c, (Function0) objT);
                x340Var.r(false);
                gbxVar = gbxVar2;
            } else {
                x340Var.i0(2117457297);
                x340Var.r(false);
            }
            boolean z = (i3 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new qwc1(k8e1Var, (byte) 16);
                x340Var.s0(objT2);
            }
            cwl1.b(s161.b(nim0.a, false, (iu30) objT2), graVar, (hw61) null, kgxVar, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(4281187, new p8e1(k8e1Var, this, ven0VarG, b), x340Var), x340Var, 100663344, 48, 1268);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, k8e1Var, o0iVar, qim0Var, (byte) 13);
        }
    }

    public void f(zlf1 zlf1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-738821018);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(zlf1Var) ? 4 : 2) | i;
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
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            zbm zbmVar = new zbm(1, "");
            String str = zlf1Var.e;
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(o0iVar))) | x340Var.i(this) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new o8e1(this, o0iVar, zlf1Var, (byte) 8);
                x340Var.s0(objT);
            }
            mp10.d(zbmVar, str, (Function0) objT, qim0Var, x340Var, (i2 << 3) & 7168);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, this, zlf1Var, o0iVar, qim0Var, (byte) 6);
        }
    }

    public void g(String str, lee1 lee1Var, long j, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1496309471);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(lee1Var) ? 32 : 16) | (x340Var.f(j) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.g(qim0Var2) ? 2048 : 1024);
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            int i6 = i3 & 14;
            int i7 = i3 << 3;
            uwo1.e(str, e9k.n(60, u291.D(qim0Var4, (era) null, 3)), lee1Var, j, new a0e1(3), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, (i7 & 896) | i6 | (i7 & 7168), 0, 1760);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q8e1(this, str, lee1Var, j, qim0Var3, i, i2);
        }
    }

    public /* synthetic */ mjh(Object obj, Object obj2, bcl1 bcl1Var, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = bcl1Var;
    }

    public mjh(ssf1 ssf1Var, bcl1 bcl1Var, lik1 lik1Var) {
        this.a = (byte) 3;
        this.c = ssf1Var;
        this.b = bcl1Var;
        this.d = lik1Var;
    }
}
