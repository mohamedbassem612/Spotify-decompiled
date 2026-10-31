package p;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class txj {
    public final boolean a;
    public final l5d0 b;
    public final boolean c;
    public final wmy d;
    public final j1v0 e;
    public final s061 f;
    public final mr20 g;
    public final tl7 h;
    public final r6h1 i;
    public final npp j;
    public final wen0 k;
    public Boolean l;
    public Integer m;
    public final hrr0 n = v8r.q((Object) null);
    public final LinkedHashMap o = new LinkedHashMap();

    public txj(boolean z, l5d0 l5d0Var, boolean z2, wmy wmyVar, j1v0 j1v0Var, s061 s061Var, mr20 mr20Var, tl7 tl7Var, r6h1 r6h1Var, npp nppVar, wen0 wen0Var) {
        this.a = z;
        this.b = l5d0Var;
        this.c = z2;
        this.d = wmyVar;
        this.e = j1v0Var;
        this.f = s061Var;
        this.g = mr20Var;
        this.h = tl7Var;
        this.i = r6h1Var;
        this.j = nppVar;
        this.k = wen0Var;
    }

    public final void a(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1010661905);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new f4g(ven0Var, (byte) 17);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = lrn1.x(cev0.G(qim0VarF, (iu30) objT2), ((Boolean) ven0Var.getValue()).booleanValue() ? 2.0f : 1.0f);
            gfh0 gfh0VarC = t1c.c(een.e, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = u291.f(u291.x(0.0f, dsa0.m(x340Var, 2131166901), 1, nim0.a), 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            ywx0.l(54, j2iVar, h2c.a, x340Var, true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(this, qim0Var, j2iVar, i, (byte) 28);
        }
    }

    public final void b(String str, hwq hwqVar, String str2, String str3, boolean z, tob1 tob1Var, r6h1 r6h1Var, w061 w061Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-587066801);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(hwqVar) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.g(tob1Var) ? 131072 : 65536) | (x340Var.i(r6h1Var) ? 1048576 : 524288) | (x340Var.i(w061Var) ? 8388608 : 4194304) | (x340Var.i(this) ? 67108864 : 33554432);
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            l7e0 l7e0Var = hwqVar.g;
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                LinkedHashMap linkedHashMap = this.e.n;
                if (linkedHashMap == null) {
                    u890.C("rowElements");
                    throw null;
                }
                objT = (maa) linkedHashMap.get(str);
                x340Var.s0(objT);
            }
            maa maaVar = (maa) objT;
            if (maaVar == null) {
                hhg1.n("There is no element, this is impossible.");
                return;
            }
            String strA = l7e0Var.a();
            boolean zI = x340Var.i(r6h1Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new puh(hwqVar, r6h1Var, (byte) 22);
                x340Var.s0(objT2);
            }
            dgo1.c(strA, (iu30) objT2, apo.r(428851851, new twj(maaVar, hwqVar, str, this, w061Var, l7e0Var, str2, str3, z, tob1Var), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qw1(this, str, hwqVar, str2, str3, z, tob1Var, r6h1Var, w061Var, i);
        }
    }

    public final void c(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1811566);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fki.Y;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = x340Var.g(ven0Var) | x340Var.i(this) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new wwj(this, z, ven0Var, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2(this, z, i, (byte) 4);
        }
    }

    public final void d(hwq hwqVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(152435156);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(hwqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (hwqVar.a == 0) {
            x340Var.i0(1415406143);
            boolean z = hwqVar.g instanceof j7e0;
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fki.Z;
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = x340Var.h(z) | x340Var.g(ven0Var) | x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zH || objT2 == m4cVar) {
                objT2 = new wwj(z, this, ven0Var, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            x340Var.r(false);
        } else {
            x340Var.i0(1415851086);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xwj(this, hwqVar, i, (byte) 0);
        }
    }

    public final void e(String str, cxc0 cxc0Var, int i, b0k b0kVar, int i2) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(936797766);
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.g(cxc0Var) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                LinkedHashMap linkedHashMap = this.e.r;
                if (linkedHashMap == null) {
                    u890.C("allSectionElementsAndCompanions");
                    throw null;
                }
                objT = (wtw) linkedHashMap.get(str);
                x340Var.s0(objT);
            }
            wtw wtwVar = (wtw) objT;
            if (wtwVar != null) {
                x340Var.i0(-1795984091);
                maa maaVar = wtwVar.c.a;
                boolean zI = x340Var.i(this) | ((i3 & 896) == 256);
                Object objT2 = x340Var.T();
                if (zI || objT2 == obj) {
                    objT2 = new ym(i, this, (byte) 9);
                    x340Var.s0(objT2);
                }
                dgo1.c(str, (iu30) objT2, apo.r(-1910952020, new sxj(str, maaVar, cxc0Var, this, wtwVar, (byte) 0), x340Var), x340Var, i4 | 384);
                x340Var.r(false);
            } else {
                x340Var.i0(-1794715571);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(this, str, cxc0Var, i, i2);
        }
    }

    public final void f(Function0 function0, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(655554310);
        int i2 = (x340Var.i(function0) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarX = lrn1.x(u291.f(h2c.a.a(nim0.a, een.X), 1.0f), 4.0f);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = new usj(iu30Var, (byte) 3);
                x340Var.s0(objT);
            }
            qim0 qim0VarX2 = ern1.x(qim0VarX, (iu30) objT);
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new vj0(function0, (byte) 22);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = eqr0.B(qim0VarX2, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(this, function0, iu30Var, j2iVar, i, (byte) 18);
        }
    }
}
