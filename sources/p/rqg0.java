package p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.lexicon.dj.v1.DJPersona;
import com.spotify.widget.widget.WidgetPickerService;
import defpackage.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rqg0 {
    public static boolean a = false;
    public static int b = 1;
    public static final int[] c = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};
    public static b180 d;
    public static b180 e;

    public static void A(WidgetPickerService widgetPickerService, k3i0 k3i0Var) {
        widgetPickerService.a = k3i0Var;
    }

    public static void B(WidgetPickerService widgetPickerService, ghk1 ghk1Var) {
        widgetPickerService.b = ghk1Var;
    }

    public static final lvl0 C(urk0 urk0Var, ri40 ri40Var) {
        d8r0 d8r0Var = ri40Var.f;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), ri40Var.e, (byte) 3);
    }

    public static owa D(owa owaVar, int i) {
        owa owaVar2 = new owa();
        int i2 = owaVar.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || owaVar.e(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                owaVar2.b(i8, i);
            } else {
                if (i8 == 0) {
                    owaVar2.b(i5 | 1, i);
                } else {
                    owaVar2.b(i5, i);
                }
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return owaVar2;
    }

    public static final n7r E(int i) {
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return n7r.a;
            case 1:
                return n7r.b;
            case 2:
                return n7r.c;
            case 3:
                return n7r.d;
            case 4:
                return n7r.e;
            case 5:
                return n7r.f;
            case 6:
                return n7r.g;
            default:
                eg.o();
                return null;
        }
    }

    public static final xk41 F(sxk sxkVar) {
        int iC = l1d.C(sxkVar.a);
        int i = 1;
        if (iC != 0) {
            if (iC != 1) {
                i = 3;
                if (iC != 2) {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    i = 4;
                }
            } else {
                i = 2;
            }
        }
        int i2 = sxkVar.b;
        return new xk41(i, i2 != 0 ? E(i2) : null);
    }

    public static final knf1 G(lnf1 lnf1Var, aof1 aof1Var) {
        int iOrdinal = aof1Var.ordinal();
        if (iOrdinal == 0) {
            return lnf1Var.a;
        }
        if (iOrdinal == 1) {
            return lnf1Var.b;
        }
        eg.o();
        return null;
    }

    public static final void a(cce cceVar, o0i o0iVar, l2c l2cVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-462639555);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(cceVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(l2cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gfx.b(18, apo.r(-1408623694, new m(qim0Var, function0, l2cVar, cceVar, o0iVar), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy0((byte) 18, i, cceVar, o0iVar, l2cVar, function0, qim0Var);
        }
    }

    public static final void b(hux huxVar, String str, boolean z, iu30 iu30Var, String str2, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(591672886);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = c13.l(z, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = x340Var.i(ven0Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new hj6(z, ven0Var, (lnm) null, (byte) 9);
                x340Var.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT2);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            int i3 = i2;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, 56 | (i2 & 14), 48);
            lee1 lee1Var = cbx.d(x340Var).g;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.z(8.0f, 0.0f, 2, wnb0Var), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, (i3 >> 3) & 14, 0, 2040);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI2 = x340Var.i(ven0Var) | ((i3 & 7168) == 2048);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new gp0(iu30Var, ven0Var, (byte) 17);
                x340Var.s0(objT3);
            }
            str3 = str2;
            anm1.c(zBooleanValue, (iu30) objT3, anm1.N(str3, nim0Var), (max) null, (idn0) null, x340Var, 0, 24);
            x340Var.r(true);
        } else {
            str3 = str2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(huxVar, str, z, iu30Var, str3, qim0Var, i);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1393628589);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            avw0 avw0Var = cbx.b(x340Var).c;
            qim0 qim0Var2 = nim0.a;
            hr80.d(qim0Var2, 1.0f, jC, x340Var, 6, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 14);
        }
    }

    public static final void d(String str, String str2, String str3, String str4, k4m k4mVar, qim0 qim0Var, b0k b0kVar, int i) {
        k4m k4mVar2;
        String str5;
        xtx xtxVar;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1830214449);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.g(str4) ? 2048 : 1024) | (x340Var.e(k4mVar.ordinal()) ? 16384 : 8192) | (x340Var.g(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0VarD = sgc1.D(1, qim0Var);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Uri uri = Uri.parse(str3);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(nim0Var, cr31VarB);
            ltx ltxVar = ltx.c;
            nux nuxVar = new nux(ltxVar, ltxVar);
            p3v p3vVar = new p3v(56.0f);
            isl islVar = isl.a;
            eso1.e(uri, islVar, qim0VarQ, p3vVar, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073744944, 0, 3568);
            qim0 qim0VarC = u291.c(new wnb0(1.0f, true), 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarC, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            mbh mbhVarA = jbh.a(h36.h, een.P0, x340Var, 6);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 2, false, new cjc0(2), 0, null, x340Var, (i2 & 14) | 1572912, 0, 1712);
            x340 x340Var2 = x340Var;
            qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var2, 48);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarZ);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            k4mVar2 = k4mVar;
            if (k4mVar2 != k4m.d) {
                x340Var2.i0(-1092534470);
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = iub.g;
                    x340Var2.s0(objT);
                }
                iu30 iu30Var = (iu30) objT;
                zov0 zov0Var = cbx.b(x340Var2).g;
                qim0 qim0VarR = u291.r(nim0Var, 12.0f);
                boolean z3 = (i2 & 57344) == 16384;
                Object objT2 = x340Var2.T();
                if (z3 || objT2 == m4cVar) {
                    z = false;
                    objT2 = new q2c(k4mVar2, (byte) 0);
                    x340Var2.s0(objT2);
                } else {
                    z = false;
                }
                dm5.a(iu30Var, qim0VarR, (iu30) objT2, x340Var2, 6, 0);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                ab80.p(nim0Var, 4.0f, x340Var2, z);
            } else {
                x340Var2.i0(-1092201003);
                x340Var2.r(false);
            }
            if (str4 != null) {
                str5 = str4;
                xtxVar = str5.equals("video") ? xtx.c : null;
            } else {
                str5 = str4;
                xtxVar = null;
            }
            if (xtxVar == null) {
                x340Var2.i0(-1092148366);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1092148365);
                zov0 zov0Var2 = cbx.b(x340Var2).g;
                w0h1.a(xtxVar, islVar, u291.r(nim0Var, 12.0f), 0L, 0L, false, x340Var2, 56, 56);
                x340Var2 = x340Var2;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                ab80.p(nim0Var, 4.0f, x340Var2, false);
            }
            x340 x340Var3 = x340Var2;
            uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var3, ((i2 >> 3) & 14) | 1572912, 0, 1712);
            x340Var = x340Var3;
            us71.m(x340Var, true, true, true);
        } else {
            k4mVar2 = k4mVar;
            str5 = str4;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(str, str2, str3, str5, k4mVar2, qim0Var, i, (byte) 10);
        }
    }

    public static final void e(fdq0 fdq0Var, xbq0 xbq0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1603496009);
        int i2 = i | (b0kVar3.g(fdq0Var) ? 4 : 2) | (b0kVar3.g(xbq0Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(nim0.a, 1.0f), new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27), null, false, null, null, null, null, null, apo.r(656460416, new ukm0(fdq0Var, hso1.G(grx.c, 0L, 0L, b0kVar3, grx.d, 30), (byte) 12), b0kVar3), null, apo.r(-1938427007, new jdq0(fdq0Var, (byte) 0), b0kVar3), apo.r(270697474, new tf((Object) fdq0Var, z, (Object) function0, (Object) xbq0Var, (byte) 23), b0kVar3), null, null, apo.r(-1691863675, new jdq0(fdq0Var, (byte) 1), b0kVar3), b0kVar2, 805306432, 197040, 26108);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((byte) 16, i, (Object) fdq0Var, (Object) xbq0Var, function0, z);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(474143733);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131956900);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            uwo1.e(strO0, anm1.N("guest-controls-footer", uyn1.z(16.0f, 0.0f, 2, qim0Var3)), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var2, i, (byte) 15);
        }
    }

    public static final void g(wr90 wr90Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String strK;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1540458007);
        int i2 = i | (x340Var.g(wr90Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z = wr90Var.c;
            String str = wr90Var.b;
            if (z) {
                x340Var.i0(-826472714);
                if (str != null) {
                    x340Var.i0(-826423517);
                    strK = cwl1.n0(2131956904, new Object[]{str}, x340Var);
                    x340Var.r(false);
                } else {
                    strK = x0d.k(x340Var, -826311359, 2131956903, x340Var, false);
                }
                String str2 = strK;
                ztx ztxVar = ztx.c;
                boolean z2 = wr90Var.d;
                boolean z3 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    objT = new bv70(iu30Var, (byte) 13);
                    x340Var.s0(objT);
                }
                b(ztxVar, str2, z2, (iu30) objT, "guest-controls-volume-switch", anm1.N("guest-controls-volume-control", qim0Var3), x340Var, ztx.d | 24576);
                x340Var.r(false);
            } else {
                x340Var.i0(-825925905);
                x340Var.r(false);
            }
            msx msxVar = msx.c;
            String strO0 = cwl1.o0(x340Var, 2131956901);
            boolean z4 = wr90Var.e;
            boolean z5 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new bv70(iu30Var, (byte) 14);
                x340Var.s0(objT2);
            }
            b(msxVar, strO0, z4, (iu30) objT2, "guest-controls-playback-switch", anm1.N("guest-controls-playback-control", qim0Var3), x340Var, msx.d | 24576);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(wr90Var, iu30Var, qim0Var2, i, (byte) 5);
        }
    }

    public static final void h(wr90 wr90Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(318249272);
        int i2 = (x340Var.g(wr90Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new zi80(iu30Var, (byte) 19);
                x340Var.s0(objT);
            }
            s(0, (Function0) objT, x340Var, null);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            c(null, x340Var, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            g(wr90Var, iu30Var, null, x340Var, i2 & 126);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            f(null, x340Var, 0);
            x0d.s(nim0Var, cbx.b(x340Var).b.c, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(wr90Var, iu30Var, i, (byte) 29);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(692535987);
        if (x340Var.Y(i & 1, i != 0)) {
            gra graVar = een.h;
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("allboarding_page_loading", voo1.y(dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a), voo1.c));
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            yto1.e(0, 0, 3, x340Var, null);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 16, i, false);
        }
    }

    public static final void j(ArrayList arrayList, List list, Function0 function0, xfx xfxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(166357833);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xfxVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((cqm0) it.next()).b);
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((cqm0) it2.next()).c);
            }
            bqm0 bqm0Var = new bqm0(arrayList2, arrayList3, list);
            boolean zI = x340Var.i(xfxVar) | ((i3 & 896) == 256) | x340Var.i(bqm0Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new gnf0(xfxVar, bqm0Var, function0, (byte) 26);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI2 = x340Var.i(bqm0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new xkm0(bqm0Var, (byte) 2);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            dm5.a(iu30Var, qim0Var3, (iu30) objT2, x340Var, (i3 >> 9) & 112, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(arrayList, list, function0, xfxVar, qim0Var2, i, (byte) 7);
        }
    }

    public static final void k(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        String str3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1809857129);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= x340Var.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarX = bin.x(u291.f(qim0Var2, 1.0f), false, null, new pm31(0), null, function0, 11);
            boolean z2 = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new mj10((byte) 21, z);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarB, 16.0f, 16.0f, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(str, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i3 & 14, 0, 2034);
            cvx cvxVar5 = cbx.b(x340Var).b;
            uwo1.e(str3, null, kk0.p(qim0Var2, 2.0f, x340Var, x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, (i3 >> 3) & 14, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
            cvx cvxVar6 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.v(qim0Var2, 12.0f));
            ilx ilxVar = ilx.c;
            long j = cbx.a(x340Var).b.f;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(ilxVar, isl.a, d9y0.k(u291.r(qim0Var2, 24.0f), z ? 1.0f : 0.0f), j, 0L, false, x340Var, ilx.d | 48, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ahu(str, str2, z, function0, qim0Var2, i, (byte) 2);
        }
    }

    public static final void l(boolean z, yeu0 yeu0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(698377747);
        int i2 = i | (b0kVar2.h(z) ? 4 : 2) | (b0kVar2.g(yeu0Var) ? 32 : 16) | (b0kVar2.i(iu30Var) ? 256 : 128) | 3072;
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            bgc0 bgc0Var = new bgc0(lhc.g(b0kVar2).g, 32);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(too1.y(qim0Var3, bgc0Var), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String strO0 = cwl1.o0(b0kVar2, 2131960425);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar2).h;
            long j = cbx.a(b0kVar2).b.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            uwo1.e(strO0, uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, 16.0f, 2), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2016);
            String strO1 = cwl1.o0(b0kVar2, 2131960424);
            String strO2 = cwl1.o0(b0kVar2, 2131960423);
            int i3 = i2 & 112;
            int i4 = i2 & 896;
            boolean z2 = (i3 == 32) | (i4 == 256);
            Object objT = b0kVar2.T();
            if (z2 || objT == m4cVar) {
                objT = new qpw0(yeu0Var, iu30Var, (byte) 0);
                b0kVar2.s0(objT);
            }
            qim0Var2 = qim0Var3;
            boolean z3 = false;
            b0kVar2 = b0kVar2;
            k((i2 << 6) & 896, strO1, strO2, (Function0) objT, b0kVar2, null, z);
            String strO3 = cwl1.o0(b0kVar2, 2131960422);
            String strO4 = cwl1.o0(b0kVar2, 2131960421);
            boolean z4 = !z;
            boolean z5 = i3 == 32;
            if (i4 == 256) {
                z3 = true;
            }
            boolean z6 = z5 | z3;
            Object objT2 = b0kVar2.T();
            if (z6 || objT2 == m4cVar) {
                objT2 = new qpw0(yeu0Var, iu30Var, (byte) 1);
                b0kVar2.s0(objT2);
            }
            k(0, strO3, strO4, (Function0) objT2, b0kVar2, null, z4);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(z, yeu0Var, iu30Var, qim0Var2, i);
        }
    }

    public static final void m(String str, xtb0 xtb0Var, c380 c380Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(561620732);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xtb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(c380Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iI0 = ((wat) x340Var.k(t4k.h)).i0(214.0f);
            boolean zI = ((i2 & 896) == 256) | ((i2 & 14) == 4) | x340Var.i(xtb0Var) | x340Var.e(iI0);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                fe6 fe6Var = new fe6(c380Var, xtb0Var, str, iI0, (lnm) null, (byte) 15);
                x340Var.s0(fe6Var);
                objT = fe6Var;
            }
            qxd0.s(str, c380Var, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(str, xtb0Var, c380Var, i, (byte) 3);
        }
    }

    public static final void n(int i, int i2, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        Function0 function2;
        Function0 function3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1122577698);
        int i4 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192);
        if (!x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            i3 = i;
            function2 = function0;
            function3 = function1;
            x340Var.b0();
        } else if (function1 != null) {
            x340Var.i0(2097026540);
            i3 = i;
            function2 = function0;
            q(i3, (i4 & 1022) | ((i4 >> 3) & 7168) | ((i4 << 3) & 57344), function2, function1, x340Var, qim0Var, z);
            function3 = function1;
            x340Var = x340Var;
            x340Var.r(false);
        } else {
            i3 = i;
            function2 = function0;
            function3 = function1;
            x340Var.i0(2097115448);
            r(i3, i4 & 8190, function2, x340Var, qim0Var, z);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y2t0(i3, i2, function2, function3, qim0Var, z);
        }
    }

    public static final void o(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-633497699);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, i);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).k, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var, 0, 0, 1722);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p4g0((byte) 24, i, i2);
        }
    }

    public static final void p(rba1 rba1Var, String str, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(703177442);
        int i2 = i | (b0kVar3.g(str) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            m(str, xtb0VarA, rba1Var.a, b0kVar3, (i2 >> 3) & 14);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("song_dna_search_chip_row", u291.f(qim0Var3, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                e971 e971Var = new e971((byte) 8, rba1Var, j2iVar, iu30Var, str);
                b0kVar3.s0(e971Var);
                objT = e971Var;
            }
            b0kVar2 = b0kVar3;
            too1.b(qim0VarN, xtb0VarA, zzq0VarH, (iu30) objT, b0kVar2, 0, 0);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0(rba1Var, str, iu30Var, j2iVar, qim0Var2, i);
        }
    }

    public static final void q(int i, int i2, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1400119730);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new ijp0(function0, function1, (byte) 2);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            poo1.g(z, (iu30) objT, new nex(4), yoo1.z(b0kVar3), u291.x(0.0f, 214.0f, 1, qim0Var), 0, null, null, null, null, null, null, null, false, null, apo.r(1106582645, new p4g0(i, (byte) 25), b0kVar3), b0kVar2, (i3 >> 3) & 14, 196608, 32736);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pk7(i, i2, function0, function1, qim0Var, z);
        }
    }

    public static final void r(int i, int i2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(299201401);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(b0kVar3).c;
            long j = cbx.a(b0kVar3).a.c;
            cr31 cr31Var = er31.a;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = d1u.E(1.0f, j, qim0Var2, cr31Var);
            int i4 = i3 & 112;
            boolean z2 = ((i3 & 896) == 256) | (i4 == 32);
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new y96(z, function0, (byte) 8);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            nex nexVar = z ? new nex(4) : pex.b;
            lex lexVarZ = yoo1.z(b0kVar3);
            qim0 qim0VarX = u291.x(0.0f, 214.0f, 1, qim0Var);
            boolean z3 = i4 == 32;
            Object objT2 = b0kVar3.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new mj10((byte) 27, z);
                b0kVar3.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarX, false, (iu30) objT2);
            if (z) {
                qim0Var2 = qim0VarE;
            }
            b0kVar2 = b0kVar3;
            poo1.e(gbxVar, nexVar, lexVarZ, qim0VarB.then(qim0Var2), 0, null, null, null, null, null, null, false, null, apo.r(238584660, new p4g0(i, (byte) 26), b0kVar3), b0kVar2, 0, 3072, 8176);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fou(i, z, function0, qim0Var, i2, (byte) 2);
        }
    }

    public static final void s(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1830621722);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), 48.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("guest-controls-top-bar", uyn1.z(16.0f, 0.0f, 2, qim0VarH));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            qim0 qim0VarR = u291.r(qim0Var3, 32.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 23);
                x340Var.s0(objT);
            }
            qim0 qim0VarN2 = anm1.N("guest-controls-navigate-back-button", bin.x(qim0VarR, false, null, null, null, (Function0) objT, 15));
            gra graVar = een.h;
            cwl1.b(qim0VarN2, graVar, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, pti.a, x340Var, 0, 48, 2044);
            cwl1.b(new wnb0(1.0f, true), graVar, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, pti.b, x340Var, 0, 48, 2044);
            qim0Var2 = qim0Var3;
            ywx0.n(qim0Var2, 32.0f, x340Var, true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 5);
        }
    }

    public static final you t(DJPersona dJPersona) {
        return new you(dJPersona.getDisplayName(), dJPersona.r(), dJPersona.q(), dJPersona.o(), dJPersona.n(), dJPersona.p(), dJPersona.t(), dJPersona.s());
    }

    public static final gu3 u(wub1 wub1Var) {
        return new gu3(wub1Var.a, wub1Var.c.getClass().getSimpleName());
    }

    public static void v(qwa qwaVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    qwaVar.b(i5, i4);
                    qwaVar.b(i5, i6);
                    qwaVar.b(i4, i5);
                    qwaVar.b(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        qwaVar.b(i7, i7);
        int i8 = i7 + 1;
        qwaVar.b(i8, i7);
        qwaVar.b(i7, i8);
        int i9 = i + i2;
        qwaVar.b(i9, i7);
        qwaVar.b(i9, i8);
        qwaVar.b(i9, i9 - 1);
    }

    public static owa w(owa owaVar, int i, int i2) {
        ai40 ai40Var;
        int i3 = owaVar.b / i2;
        if (i2 == 4) {
            ai40Var = ai40.j;
        } else if (i2 == 6) {
            ai40Var = ai40.i;
        } else if (i2 == 8) {
            ai40Var = ai40.l;
        } else if (i2 == 10) {
            ai40Var = ai40.h;
        } else {
            if (i2 != 12) {
                hhg1.n("Unsupported word size ".concat(String.valueOf(i2)));
                return null;
            }
            ai40Var = ai40.g;
        }
        uxy0 uxy0Var = new uxy0(ai40Var);
        int i4 = i / i2;
        int[] iArr = new int[i4];
        int i5 = owaVar.b / i2;
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                i7 |= owaVar.e((i6 * i2) + i8) ? 1 << ((i2 - i8) - 1) : 0;
            }
            iArr[i6] = i7;
        }
        uxy0Var.u(i4 - i3, iArr);
        owa owaVar2 = new owa();
        owaVar2.b(0, i % i2);
        for (int i9 = 0; i9 < i4; i9++) {
            owaVar2.b(iArr[i9], i2);
        }
        return owaVar2;
    }

    public static final List x(ojf0 ojf0Var) {
        a9h a9hVar;
        vpf0 vpf0Var = ojf0Var.c;
        vpf0 vpf0Var2 = vpf0Var instanceof vpf0 ? vpf0Var : null;
        if (vpf0Var2 != null && (a9hVar = vpf0Var2.a) != null) {
            fef0 fef0Var = a9hVar.a;
            String str = fef0Var.d;
            List list = fef0Var.i;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!nhc1.S((String) obj, str, true)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                xng1 xng1Var = ojf0Var.h;
                xng1 xng1Var2 = xng1Var instanceof xng1 ? xng1Var : null;
                return cev0.K(str, xng1Var2 != null ? xng1Var2.a : null, upn1.s(), arrayList);
            }
        }
        return z6x.a;
    }

    public static synchronized int y(Context context) {
        String str;
        try {
            zod.t(context, "Context is null");
            "preferredRenderer: ".concat("null");
            if (a) {
                return 0;
            }
            try {
                d2o1 d2o1VarR = hm5.R(context);
                try {
                    hpn1 hpn1VarG1 = d2o1VarR.g1();
                    zod.s(hpn1VarG1);
                    ern1.a = hpn1VarG1;
                    oio1 oio1VarI1 = d2o1VarR.i1();
                    if (si1.b == null) {
                        zod.t(oio1VarI1, "delegate must not be null");
                        si1.b = oio1VarI1;
                    }
                    a = true;
                    try {
                        Parcel parcelY0 = d2o1VarR.Y0(9, d2o1VarR.a1());
                        int i = parcelY0.readInt();
                        parcelY0.recycle();
                        if (i == 2) {
                            b = 2;
                        }
                        qfp0 qfp0Var = new qfp0(context);
                        Parcel parcelA1 = d2o1VarR.a1();
                        tsn1.b(parcelA1, qfp0Var);
                        parcelA1.writeInt(0);
                        d2o1VarR.c1(10, parcelA1);
                    } catch (RemoteException unused) {
                    }
                    int i2 = b;
                    if (i2 != 1) {
                        str = i2 != 2 ? "null" : "LATEST";
                    } else {
                        str = "LEGACY";
                    }
                    "loadedRenderer: ".concat(str);
                    return 0;
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException((Throwable) e2);
                }
            } catch (GooglePlayServicesNotAvailableException e3) {
                return e3.a;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void z(Context context) {
        y(context);
    }
}
