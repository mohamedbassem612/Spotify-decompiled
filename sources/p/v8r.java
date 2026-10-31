package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class v8r {
    public static final j2i a = new j2i(636288403, new tii((byte) 0), false);
    public static final j2i b = new j2i(-1357803046, new tii((byte) 1), false);
    public static b180 c;
    public static b180 d;

    public static final void a(gok gokVar, xnk xnkVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1234401564);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(gokVar) : x340Var.i(gokVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(xnkVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = gokVar instanceof fok;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-848922208);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
                xto1.e((qim0) null, 4, 0L, 0L, x340Var, 48, 13);
                x340Var.r(true);
                x340Var.r(false);
            } else if (gokVar instanceof eok) {
                x340Var.i0(-848913406);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.c, 7);
                boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(gokVar))) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new o0d(gokVar, xnkVar, iu30Var, (byte) 22);
                    x340Var.s0(objT);
                }
                ujo1.d(qim0VarF2, (xtb0) null, zzq0VarJ, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 506);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(-545332196);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(gokVar, xnkVar, iu30Var, i, (byte) 0);
        }
    }

    public static final void b(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-57467134);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            gfx.b(6, apo.r(502754285, new zxd1(i, (byte) 4), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b271(i, qim0Var, i2);
        }
    }

    public static final void c(Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1811456817);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16) | (x340Var.i(function2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131963906);
            String strO1 = cwl1.o0(x340Var, 2131963894);
            String strO2 = cwl1.o0(x340Var, 2131963908);
            String strO3 = cwl1.o0(x340Var, 2131963907);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new z9t(function0, (byte) 6);
                x340Var.s0(objT);
            }
            Function0 function3 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function3));
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new z9t(function1, (byte) 8);
                x340Var.s0(objT2);
            }
            Function0 function4 = (Function0) objT2;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function2, (i3u) null, (hux) null, strO2, strO3, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function4)), x340Var, ((i2 >> 6) & 14) | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w96(function0, function1, function2, i, (byte) 2);
        }
    }

    public static final void d(fbh0 fbh0Var, xnk xnkVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, b0k b0kVar, int i) {
        x340 x340Var;
        boolean z;
        String str = fbh0Var.b;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2125196582);
        int i2 = i | (x340Var2.g(fbh0Var) ? 4 : 2) | (x340Var2.e(xnkVar.ordinal()) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(function1) ? 2048 : 1024) | (x340Var2.i(function2) ? 16384 : 8192) | (x340Var2.i(function3) ? 131072 : 65536);
        if (x340Var2.Y(i2 & 1, (74899 & i2) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 12.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new ugj(function0, (byte) 6);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX2 = bin.x(qim0VarX, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15);
            fra fraVar = een.N0;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX2);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            bmq0.a(Uri.parse(fbh0Var.c), (qim0) null, hcx.d, (String) null, str, 0L, 0L, false, x340Var2, 384, 234);
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var2).g, 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1784);
            x340Var = x340Var2;
            int i3 = ook.a[xnkVar.ordinal()];
            isl islVar = isl.a;
            if (i3 == 1) {
                x340Var.i0(227883896);
                uox uoxVar = uox.c;
                long j = cbx.a(x340Var).c.b;
                boolean z3 = (57344 & i2) == 16384;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new ugj(function2, (byte) 7);
                    x340Var.s0(objT2);
                }
                w0h1.a(uoxVar, islVar, bin.x(nim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), j, 0L, false, x340Var, uox.d | 48, 48);
                z = false;
                x340Var.r(false);
            } else {
                x340Var.i0(228140979);
                fsx fsxVar = fsx.c;
                long j2 = cbx.a(x340Var).c.b;
                boolean z4 = (i2 & 7168) == 2048;
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new ugj(function1, (byte) 8);
                    x340Var.s0(objT3);
                }
                w0h1.a(fsxVar, islVar, bin.x(nim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15), j2, 0L, false, x340Var, fsx.d | 48, 48);
                z = false;
                x340Var.r(false);
            }
            fpx fpxVar = fpx.c;
            long j3 = cbx.a(x340Var).c.b;
            boolean z5 = (i2 & 458752) == 131072 ? true : z;
            Object objT4 = x340Var.T();
            if (z5 || objT4 == m4cVar) {
                objT4 = new ugj(function3, (byte) 9);
                x340Var.s0(objT4);
            }
            w0h1.a(fpxVar, islVar, bin.x(nim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15), j3, 0L, false, x340Var, fpx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40((Object) fbh0Var, (Object) xnkVar, (Object) function0, (Object) function1, (Object) function2, (Object) function3, i, (byte) 19);
        }
    }

    public static final void e(String str, boolean z, String str2, Function0 function0, qim0 qim0Var, String str3, b0k b0kVar, int i, int i2) {
        String str4;
        int i3;
        b0k b0kVar2;
        String str5;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-768139945);
        int i4 = (b0kVar3.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= b0kVar3.g(str2) ? 256 : 128;
        }
        int i5 = i4 | (b0kVar3.i(function0) ? 2048 : 1024);
        int i6 = i5 | 24576;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 = i5 | 221184;
            str4 = str3;
        } else {
            str4 = str3;
            i3 = i6 | (b0kVar3.g(str4) ? 131072 : 65536);
        }
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            xu30 xu30VarR = null;
            if (i7 != 0) {
                str4 = null;
            }
            uvx uvxVar = new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new j160(function0, (byte) 22);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            if (str4 == null) {
                b0kVar3.i0(-70918839);
            } else {
                b0kVar3.i0(-70918838);
                xu30VarR = apo.r(1952145066, new z3y(str4, (byte) 14), b0kVar3);
            }
            b0kVar3.r(false);
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVar, z ? jax.a : new hax(str2), false, (idn0) null, (ga80) null, gbxVar, (gbx) null, jti.b, (xu30) null, (xu30) null, xu30VarR, (xu30) null, (xu30) null, (xu30) null, apo.r(1059323283, new z3y(str, (byte) 15), b0kVar3), b0kVar2, 100663360, 196608, 30392);
            str5 = str4;
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            str5 = str4;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rsh(str, z, str2, function0, qim0Var2, str5, i, i2);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(628962267);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float f = cbx.b(x340Var).b.a;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(cwl1.o0(x340Var, 2131961072), anm1.N("on-other-networks-text", u291.f(uyn1.y(qim0Var3, f, 8.0f), 1.0f)), cbx.d(x340Var).k, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var2, i, (byte) 17);
        }
    }

    public static final void g(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1861246097);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarH = u291.h(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).a.d;
            u5j1 u5j1Var = d4o1.a;
            t1c.a(dug.f(qim0VarH, j, u5j1Var), x340Var, 0);
            uwo1.e(cwl1.o0(x340Var, 2131958843), uyn1.z(8.0f, 0.0f, 2, nim0Var), cbx.d(x340Var).j, ((yex) zex.a.d).g, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 48, 0, 2032);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            t1c.a(dug.f(u291.h(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), cbx.a(x340Var).a.d, u5j1Var), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 16);
        }
    }

    public static final void h(int i, hdl1 hdl1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(193845592);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.i(hdl1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            qim0Var2 = qim0Var;
            i3 |= b0kVar3.g(qim0Var2) ? 2048 : 1024;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            gdx gdxVarS = yla.s(b0kVar3);
            qim0 qim0VarA = nfc.a(qim0Var2);
            ldx ldxVar = ldx.c;
            boolean zI = ((i3 & 14) == 4) | b0kVar3.i(hdl1Var) | ((i3 & 896) == 256);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new f8f1(i, hdl1Var, iu30Var);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarA, (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(466929687, new zxd1((byte) 5, i, false), b0kVar3), b0kVar2, 48, 48, 2008);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(i, (Object) hdl1Var, (Object) iu30Var, (Object) qim0Var, i2, (byte) 23);
        }
    }

    public static final void i(yqg yqgVar, hdl1 hdl1Var, Function0 function0, iu30 iu30Var, qim0 qim0Var, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z;
        int i2;
        ven0 ven0Var;
        boolean z2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-623399043);
        j06 j06Var = ((x340) b0kVar3).a;
        int i3 = i | (b0kVar3.g(yqgVar) ? 4 : 2) | (b0kVar3.i(hdl1Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(iu30Var) ? 2048 : 1024) | 24576 | (b0kVar3.i(function1) ? 131072 : 65536);
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = bb00.h(0, b0kVar3);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, b0kVar3);
            }
            err0 err0Var2 = (hdn0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var2 = (ven0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = q(0L);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var3 = (ven0) objT4;
            Integer numValueOf = Integer.valueOf(err0Var.s());
            boolean z3 = (i3 & 7168) == 2048;
            Object objT5 = b0kVar3.T();
            if (z3 || objT5 == m4cVar) {
                z = true;
                objT5 = new wba1(iu30Var, err0Var, ven0Var2, err0Var2, (lnm) null, (byte) 22);
                b0kVar3.s0(objT5);
            } else {
                z = true;
            }
            qxd0.t(numValueOf, b0kVar3, (vu30) objT5);
            Long lValueOf = Long.valueOf(((Number) ven0Var3.getValue()).longValue());
            int i4 = i3 & 14;
            boolean zI = ((i3 & 458752) == 131072) | b0kVar3.i(hdl1Var) | (i4 == 4 ? z : false);
            Object objT6 = b0kVar3.T();
            if (zI || objT6 == m4cVar) {
                i2 = i3;
                ven0Var = ven0Var3;
                qt61 qt61Var = new qt61(hdl1Var, yqgVar, function1, ven0Var, ven0Var2, err0Var2, (lnm) null);
                b0kVar3.s0(qt61Var);
                objT6 = qt61Var;
            } else {
                i2 = i3;
                ven0Var = ven0Var3;
            }
            qxd0.t(lValueOf, b0kVar3, (vu30) objT6);
            era eraVar = een.Q0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar3, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z4 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf2, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, b0kVar3, 54);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarF2);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            qim0 qim0VarB = uyn1.B(qim0Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            int i5 = i2 & 896;
            boolean z5 = (i5 == 256) | (i4 == 4);
            Object objT7 = b0kVar3.T();
            if (z5 || objT7 == m4cVar) {
                ael1 ael1Var = new ael1(yqgVar, function0, err0Var, ven0Var, (byte) 0);
                b0kVar3.s0(ael1Var);
                objT7 = ael1Var;
            }
            int i6 = (i2 & 112) | 3078;
            h(1, hdl1Var, (iu30) objT7, qim0VarB, b0kVar3, i6);
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                b0kVar3.i0(-1790599581);
                z2 = false;
                b(err0Var2.s(), 0, b0kVar3, null);
                b0kVar3.r(false);
            } else {
                z2 = false;
                b0kVar3.i0(-1790530389);
                b0kVar3.r(false);
            }
            qim0 qim0VarB2 = uyn1.B(qim0Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean z6 = i4 == 4 ? true : z2;
            if (i5 == 256) {
                z2 = true;
            }
            boolean z7 = z6 | z2;
            Object objT8 = b0kVar3.T();
            if (z7 || objT8 == m4cVar) {
                ael1 ael1Var2 = new ael1(yqgVar, function0, err0Var, ven0Var, (byte) 1);
                b0kVar3.s0(ael1Var2);
                objT8 = ael1Var2;
            }
            b0kVar2 = b0kVar3;
            h(2, hdl1Var, (iu30) objT8, qim0VarB2, b0kVar2, i6);
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(yqgVar, hdl1Var, function0, iu30Var, qim0Var2, function1, i);
        }
    }

    public static final qim0 j(qim0 qim0Var, gqb gqbVar) {
        if (gqbVar == null || p3v.b(gqbVar.b, 0.0f) <= 0) {
            return qim0Var;
        }
        tla tlaVar = new tla(gqbVar, (byte) 16);
        qim0 qim0Var2 = nim0.a;
        qim0 qim0VarS = exd0.s(qim0Var2, tlaVar);
        if (qim0VarS != null) {
            qim0Var2 = qim0VarS;
        }
        return qim0Var.then(qim0Var2);
    }

    public static final tn31 k(Bundle bundle) {
        return new tn31(bundle != null ? bundle.containsKey("android.service.media.extra.SUGGESTED") : false ? tyo1.k(bundle) : "default", bundle != null ? bundle.getString("com.spotify.music.extra.CLIENT_ID", null) : null, bundle != null ? bundle.getString("com.spotify.music.extra.VERSION", null) : null, bundle != null ? bundle.containsKey("android.service.media.extra.SUGGESTED") : false, bundle != null ? bundle.containsKey("android.service.media.extra.RECENT") : false, (t380) null, bundle, 80);
    }

    public static final String l(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final b180 m() {
        b180 b180Var = d;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.VideoVerticalActive16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(14.49f, 0.513f);
        cwh0VarG.g(0.328f, 0.328f, 0.512f, 0.773f, 0.512f, 1.237f);
        cwh0VarG.v(12.5f);
        cwh0VarG.c(1.75f, 1.75f, false, true, -1.75f, 1.75f);
        cwh0VarG.i(-10.5f);
        cwh0VarG.c(1.75f, 1.75f, false, true, -1.75f, -1.75f);
        cwh0VarG.u(1.75f);
        cwh0VarG.b(1.75f, 1.75f, false, true, 2.752f, 0.0f);
        cwh0VarG.i(10.5f);
        cwh0VarG.g(0.464f, 0.0f, 0.91f, 0.184f, 1.237f, 0.513f);
        cwh0VarG.e();
        cwh0VarG.l(6.0f, 5.0f);
        cwh0VarG.v(6.0f);
        cwh0VarG.k(5.196f, -3.0f);
        cwh0VarG.e();
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        d = b180VarB;
        return b180VarB;
    }

    public static final String n(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final boolean o(sxk sxkVar) {
        return sxkVar.a != 1;
    }

    public static final bw91 p(Object... objArr) {
        bw91 bw91Var = new bw91();
        bw91Var.addAll(f46.Q0(objArr));
        return bw91Var;
    }

    public static hrr0 q(Object obj) {
        return new hrr0(obj, kcx0.R0);
    }

    public static final ven0 r(String str, int i, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i2, int i3) {
        if ((i3 & 16) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = q9f1.b;
                x340Var.s0(objT);
            }
            function0 = (Function0) objT;
        }
        Function0 function1 = function0;
        ilv.a.getClass();
        hsi1 hsi1Var = new hsi1(str, Float.valueOf(0.0f), Float.valueOf(1.0f), new pxg1(700, i, flv.g), rno1.a);
        int i4 = i2 >> 3;
        return zod.S(hsi1Var, z, z2, function1, b0kVar, (i4 & 112) | 8 | (i4 & 896) | (i4 & 7168), 0);
    }

    public static final ven0 s(Object obj, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = q(obj);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        ven0Var.setValue(obj);
        return ven0Var;
    }

    public static k03 t(String str, Map map) {
        Object next;
        Object obj = map.get(str);
        if (obj == null) {
            bhn0.f("No AiDisclosureContentProvider bound for content type: ".concat(str));
            return null;
        }
        l03 l03Var = (l03) obj;
        String strB = l03Var.b();
        String strI = l03Var.i();
        List listF = l03Var.f();
        tr80 tr80VarK = p7h.K(listF);
        ArrayList arrayList = new ArrayList(q7h.U(tr80VarK, 10));
        lr80 it = tr80VarK.iterator();
        while (((sr80) it).c) {
            arrayList.add("%" + (it.nextInt() + 1) + "$s");
        }
        ArrayList arrayList2 = new ArrayList();
        int length = 0;
        while (length < strI.length()) {
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                int iW0 = ihc1.w0(strI, (String) obj2, length, false, 4);
                mmr0 mmr0Var = iW0 >= 0 ? new mmr0(Integer.valueOf(i), Integer.valueOf(iW0)) : null;
                if (mmr0Var != null) {
                    arrayList3.add(mmr0Var);
                }
                i = i2;
            }
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int iIntValue = ((Number) ((mmr0) next).b).intValue();
                    do {
                        Object next2 = it2.next();
                        int iIntValue2 = ((Number) ((mmr0) next2).b).intValue();
                        if (iIntValue > iIntValue2) {
                            next = next2;
                            iIntValue = iIntValue2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            mmr0 mmr0Var2 = (mmr0) next;
            if (mmr0Var2 == null) {
                arrayList2.add(new rqc1(strI.substring(length)));
                break;
            }
            int iIntValue3 = ((Number) mmr0Var2.a).intValue();
            int iIntValue4 = ((Number) mmr0Var2.b).intValue();
            if (iIntValue4 > length) {
                arrayList2.add(new rqc1(strI.substring(length, iIntValue4)));
            }
            r7u r7uVar = (r7u) listF.get(iIntValue3);
            arrayList2.add(new qqc1(r7uVar.a, r7uVar.b));
            length = ((String) arrayList.get(iIntValue3)).length() + iIntValue4;
        }
        return new k03(strB, arrayList2, l03Var.g(), l03Var.h(), l03Var.e());
    }

    public static final void u(kd31 kd31Var, float f) {
        kd31Var.b(f);
        kd31Var.i(2);
        kd31Var.E(kd31Var.T0.h() * 50.0f * (1.0f - f));
    }

    public static final String v(lnm lnmVar) {
        String m231Var;
        if (lnmVar instanceof vfu) {
            return ((vfu) lnmVar).toString();
        }
        try {
            m231Var = lnmVar + '@' + n(lnmVar);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            m231Var = lnmVar.getClass().getName() + '@' + n(lnmVar);
        }
        return m231Var;
    }

    public static final c380 w(c380 c380Var, List list) {
        List list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list2) {
            linkedHashMap.put(((vcl) obj).a, obj);
        }
        ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
        Iterator it = c380Var.iterator();
        while (it.hasNext()) {
            rxk rxkVar = (rxk) it.next();
            vcl vclVar = (vcl) linkedHashMap.get(rxkVar.a);
            if (vclVar != null) {
                boolean z = vclVar.e;
                boolean z2 = vclVar.h;
                String str = vclVar.b;
                if (ihc1.y0(str)) {
                    str = rxkVar.d;
                }
                rxkVar = new rxk(rxkVar.a, z, str, z2);
            }
            arrayList.add(rxkVar);
        }
        return mqo1.A(arrayList);
    }
}
