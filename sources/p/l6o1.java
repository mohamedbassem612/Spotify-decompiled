package p;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import defpackage.m;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l6o1 {
    public static b180 a;

    public static final vtw A(wpw wpwVar) {
        return new vtw(wpwVar, (qbo1) null);
    }

    public static final Object B(Map map, String str, iu30 iu30Var) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            return null;
        }
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            bArrDecode.getClass();
            return iu30Var.invoke(bArrDecode);
        } catch (IllegalArgumentException unused) {
            l1d.z("BrowseDestination: Error parsing proto field for key '", str, "'");
            return null;
        }
    }

    public static final es41 C(final int i, int i2, int i3, b0k b0kVar) {
        final byte b = 1;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        boolean z = (((i2 & 14) ^ 6) > 4 && ((x340) b0kVar).e(i)) || (i2 & 6) == 4;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z || objT == fkj0.X) {
            objT = new Function0() { // from class: p.ytb0
                public final Object invoke() {
                    switch (b) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            return new xtb0(i, 0);
                        default:
                            return new es41(i);
                    }
                }
            };
            x340Var.s0(objT);
        }
        return (es41) k5p1.u(objArr, es41.k, (Function0) objT, x340Var, 0);
    }

    public static final qim0 D(qim0 qim0Var, es41 es41Var, boolean z, boolean z2, boolean z3) {
        qim0 qim0VarS;
        qqq0 qqq0Var = qqq0.a;
        qqq0 qqq0Var2 = z2 ? qqq0Var : qqq0.b;
        if (z3) {
            jdn0 jdn0Var = es41Var.e;
            nim0 nim0Var = nim0.a;
            qim0VarS = qim0Var.then(qqq0Var2 == qqq0Var ? i1p1.q(nim0Var, u5j1.b) : i1p1.q(nim0Var, gcg.c)).then(new qs41((p5c) null, (iq20) null, jdn0Var, qqq0Var2, (hxq0) null, es41Var, z, false, true));
        } else {
            qim0VarS = xfo1.s(qim0Var, es41Var, qqq0Var2, null, z, false, null, es41Var.e, null);
        }
        return qim0VarS.then(new zt41(es41Var, z2));
    }

    public static final void E(vu30 vu30Var, q6 q6Var, q6 q6Var2) {
        aym.t(aym.p(q6Var, q6Var2, vu30Var)).resumeWith(rih1.a);
    }

    public static ArrayList F(String str) {
        List listH = ayb1.l.h(str.toLowerCase(Locale.ROOT));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            if (((String) obj).length() >= 2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean G(int i, Context context, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) mjm1.a(context).a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static qim0 H(qim0 qim0Var, es41 es41Var, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return D(qim0Var, es41Var, z, true, true);
    }

    public static AbstractList I(List list, acp1 acp1Var) {
        return list instanceof RandomAccess ? new omd0(list, acp1Var) : new pmd0(list, acp1Var);
    }

    public static final void a(String str, kko kkoVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1595036237);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(kkoVar) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(kkoVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new xho(kkoVar);
                x340Var.s0(objT);
            }
            uho uhoVar = new uho(str, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254);
            qim0 qim0Var3 = nim0.a;
            otw.c((xho) objT, uhoVar, qim0Var3, (ipb1) null, x340Var, 392, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(str, kkoVar, qim0Var2, i, (byte) 19);
        }
    }

    public static final void b(ac6 ac6Var, kko kkoVar, rzo rzoVar, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1974398716);
        int i2 = i | (x340Var.i(ac6Var) ? 4 : 2) | (x340Var.i(kkoVar) ? 32 : 16) | (x340Var.i(rzoVar) ? 256 : 128) | (x340Var.i(gw70Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            mod.b(oi7.a.a(gw70Var), apo.r(-604985916, new wb6(ac6Var, kkoVar, rzoVar, iu30Var), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k40(ac6Var, kkoVar, rzoVar, gw70Var, iu30Var, qim0Var2, i, (byte) 5);
        }
    }

    public static final void c(zm7 zm7Var, kko kkoVar, rzo rzoVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        xu30 xu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(678335905);
        int i2 = i | (b0kVar3.i(zm7Var) ? 4 : 2) | (b0kVar3.i(kkoVar) ? 32 : 16) | (b0kVar3.i(rzoVar) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zov0 zov0Var = cbx.b(b0kVar3).g;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f));
            uvx uvxVar = new uvx(1, (pgx) null, 3, (vzq0) null, (zzq0) null, new tvx(2.0f, 12.0f, 8.0f), (hw61) null, 1, new p3v(48.0f), 90);
            boolean z = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new lj2(function0, (byte) 7);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            String str = zm7Var.c;
            xu30 xu30VarR = null;
            if (str.length() == 0) {
                str = null;
            }
            if (str == null) {
                str = null;
            } else if (str.length() > 0) {
                str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
            }
            if (str == null) {
                b0kVar3.i0(485453023);
                b0kVar3.r(false);
                xu30Var = null;
            } else {
                b0kVar3.i0(485453024);
                xu30 xu30VarR2 = apo.r(-83977735, new p3(str, (byte) 15), b0kVar3);
                b0kVar3.r(false);
                xu30Var = xu30VarR2;
            }
            if (kkoVar == null) {
                b0kVar3.i0(485781654);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(485781655);
                xu30VarR = apo.r(-1569525632, new n891(zm7Var, kkoVar, rzoVar, (byte) 17), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarZ, uvxVar, null, false, null, null, gbxVar, null, null, apo.r(-1854494248, new xb6(zm7Var, (byte) 0), b0kVar3), null, xu30Var, xu30VarR, null, null, apo.r(-1432786211, new xb6(zm7Var, (byte) 1), b0kVar3), b0kVar2, 805306432, 196608, 26044);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m((Object) zm7Var, (Object) kkoVar, (Object) rzoVar, (Object) function0, qim0Var2, i, (byte) 10);
        }
    }

    public static final void d(w4t0 w4t0Var, int i, qim0 qim0Var, b0k b0kVar, int i2) throws Throwable {
        qim0 qim0Var2;
        zob1 zob1Var;
        Throwable th;
        boolean z;
        ven0 ven0Var;
        ul7 ul7Var;
        boolean z2;
        m4c m4cVar = fkj0.X;
        p1f0 p1f0Var = w4t0Var.i;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-365464019);
        int i3 = (i2 & 6) == 0 ? i2 | ((i2 & 8) == 0 ? x340Var.g(w4t0Var) : x340Var.i(w4t0Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            ul7 ul7Var2 = (ul7) x340Var.k(vl7.a);
            ven0 ven0VarH = rwq.h((bpb1) p1f0Var.h, x340Var, 0);
            ven0 ven0VarH2 = rwq.h(w4t0Var.X, x340Var, 0);
            boolean zG = x340Var.g((p4t0) ven0VarH.getValue());
            Object objT = x340Var.T();
            jge jgeVar = r6x.a;
            if (zG || objT == m4cVar) {
                p4t0 p4t0Var = (p4t0) ven0VarH.getValue();
                objT = (p4t0Var == null || (zob1Var = p4t0Var.b) == null) ? jgeVar : zob1Var;
                x340Var.s0(objT);
            }
            ven0 ven0VarG = rwq.g((mr20) objT, new rnc0(), null, x340Var, 0, 2);
            boolean zG2 = x340Var.g((p4t0) ven0VarH.getValue());
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                p4t0 p4t0Var2 = (p4t0) ven0VarH.getValue();
                jge jgeVar2 = p4t0Var2 != null ? p4t0Var2.a : jgeVar;
                x340Var.s0(jgeVar2);
                objT2 = jgeVar2;
            }
            ven0 ven0VarG2 = rwq.g((mr20) objT2, new x8b0(0, 0, 0), null, x340Var, 0, 2);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = yv91.a(new d1c(ven0VarG2, ven0VarG, ven0VarH2, (byte) 7));
                x340Var.s0(objT3);
            }
            tob1 tob1Var = (tob1) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                khc khcVar = (khc) p1f0Var.d;
                LinkedHashMap linkedHashMap = (LinkedHashMap) p1f0Var.f;
                if (linkedHashMap == null) {
                    u890.C("elementFactories");
                    throw null;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    vu30 vu30Var = (vu30) entry.getValue();
                    snc0 snc0Var = (snc0) p1f0Var.e;
                    if (snc0Var == null) {
                        u890.C("listContentRuntime");
                        throw null;
                    }
                    linkedHashMap2.put(key, (laa) vu30Var.invoke(snc0Var.getMetadata(), (iac0) p1f0Var.a));
                }
                th = null;
                Map map = (Map) p1f0Var.g;
                if (map == null) {
                    u890.C("instrumentationEnvironments");
                    throw null;
                }
                snc0 snc0Var2 = (snc0) p1f0Var.e;
                if (snc0Var2 == null) {
                    u890.C("listContentRuntime");
                    throw null;
                }
                objT4 = khc.f(khcVar, linkedHashMap2, map, new wao0(1, snc0Var2, snc0.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, (byte) 23), 12);
                x340Var.s0(objT4);
            } else {
                th = null;
            }
            p1d0 p1d0Var = (p1d0) objT4;
            int iX0 = (int) ((wat) x340Var.k(t4k.h)).X0(12.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw th;
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
            if (((Boolean) tob1Var.getValue()).booleanValue()) {
                z = false;
                ven0Var = ven0VarG;
                ul7Var = ul7Var2;
                x340Var.i0(811303035);
                x340Var.r(false);
            } else {
                x340Var.i0(811237687);
                ven0Var = ven0VarG;
                z = false;
                ul7Var = ul7Var2;
                xto1.e(h2c.a.a(qim0Var3, een.h), 0, 0L, 0L, x340Var, 0, 14);
                x340Var = x340Var;
                x340Var.r(false);
            }
            int i5 = i4 & 112;
            boolean zE = x340Var.e(iX0) | (i5 == 32 ? true : z) | x340Var.i(ul7Var) | x340Var.i(p1d0Var) | x340Var.i(iac0Var);
            Object objT5 = x340Var.T();
            if (zE || objT5 == m4cVar) {
                z2 = true;
                hh6 hh6Var = new hh6(iX0, i, ul7Var, p1d0Var, iac0Var);
                p1d0Var = p1d0Var;
                x340Var.s0(hh6Var);
                objT5 = hh6Var;
            } else {
                z2 = true;
            }
            iu30 iu30Var = (iu30) objT5;
            if (i5 == 32) {
                z = z2;
            }
            ven0 ven0Var2 = ven0Var;
            boolean zI = z | x340Var.i(ven0Var2) | x340Var.i(p1d0Var) | x340Var.i(iac0Var) | x340Var.i(tob1Var);
            Object objT6 = x340Var.T();
            if (zI || objT6 == m4cVar) {
                qf8 qf8Var = new qf8(i, p1d0Var, iac0Var, ven0Var2, tob1Var, (byte) 1);
                x340Var.s0(qf8Var);
                objT6 = qf8Var;
            }
            dm5.a(iu30Var, (qim0) null, (iu30) objT6, x340Var, 0, 2);
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2((Object) w4t0Var, i, (Object) qim0Var2, i2, (byte) 3);
        }
    }

    public static final void e(String str, String str2, String str3, cm10 cm10Var, Function0 function0, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        String str4;
        qim0 qim0Var2;
        float f;
        qim0 qim0Var3;
        float f2;
        boolean z2;
        float f3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-73676142);
        if ((i & 48) == 0) {
            i2 = (x340Var.g(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? x340Var.g(cm10Var) : x340Var.i(cm10Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(function0) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= x340Var.h(z) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 4793489) != 4793488)) {
            qim0 qim0Var4 = nim0.a;
            if (z) {
                x340Var.i0(-157366385);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 54);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
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
                hux huxVar = cm10Var.a;
                qim0 qim0VarN = anm1.N("test-tag-feature-branding-icon", u291.r(qim0Var4, 16.0f));
                uwr uwrVar = cbx.a;
                qim0Var3 = qim0Var4;
                f2 = 8.0f;
                w0h1.a(huxVar, isl.a, qim0VarN, cbx.a(x340Var).c.c, 0L, false, x340Var, 440, 48);
                op71.g(x340Var, u291.v(qim0Var3, 8.0f));
                uwo1.e(cm10Var.b, null, cbx.d(x340Var).k, cbx.a(x340Var).b.c, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(true);
                f = 16.0f;
                op71.g(x340Var, u291.h(qim0Var3, 16.0f));
                z2 = false;
                x340Var.r(false);
            } else {
                f = 16.0f;
                qim0Var3 = qim0Var4;
                f2 = 8.0f;
                z2 = false;
                x340Var.i0(-156719632);
                x340Var.r(false);
            }
            uwr uwrVar2 = cbx.a;
            int i5 = (i4 >> 3) & 14;
            boolean z3 = z2;
            x340 x340Var2 = x340Var;
            float f4 = f;
            uwo1.e(str, null, cbx.d(x340Var).c, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var2, i5, 0, 2034);
            x340Var = x340Var2;
            op71.g(x340Var, u291.h(qim0Var3, f2));
            if (str2 == null) {
                x340Var.i0(-156534098);
                x340Var.r(z3);
                f3 = f4;
            } else {
                x340Var.i0(-156534097);
                uwo1.e(str2, d9y0.k(qim0Var3, 0.8f), cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 48, 0, 2032);
                x340Var.r(false);
                qim0Var3 = qim0Var3;
                f3 = 16.0f;
            }
            op71.g(x340Var, u291.h(qim0Var3, f3));
            str4 = str3;
            qim0 qim0Var5 = qim0Var3;
            function1 = function0;
            gfx.g(4, apo.r(-818723259, new ql(function1, str4, (byte) 28), x340Var), x340Var, 54);
            qim0Var2 = qim0Var5;
        } else {
            function1 = function0;
            str4 = str3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1(str, str2, str4, cm10Var, function1, qim0Var2, z, i);
        }
    }

    public static final void f(String str, kko kkoVar, rzo rzoVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1575878012);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(kkoVar) ? 32 : 16) | (x340Var.i(rzoVar) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = x340Var.g(kkoVar);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = rzoVar.a(kkoVar);
                x340Var.s0(objT);
            }
            p330 p330Var = new p330(str);
            qim0 qim0Var3 = nim0.a;
            otw.c((d430) objT, p330Var, qim0Var3, (ipb1) null, x340Var, 448, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, (Object) str, (Object) kkoVar, (Object) rzoVar, (Object) qim0Var2, (byte) 1);
        }
    }

    public static final void g(float f, s650 s650Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1490460386);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.g(s650Var) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            t1c.a(u291.h(dug.e(qim0Var, v9c.s(s650Var.a, 0.0f, 0.0f, 14), null, 0.0f, 6), f), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gf(f, s650Var, qim0Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final void h(xhl xhlVar, cpn1 cpn1Var, ihl ihlVar, ihl ihlVar2, ihl ihlVar3, ihl ihlVar4, ihl ihlVar5, ihl ihlVar6, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        ?? r0;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1412807827);
        int i2 = i | (b0kVar2.i(xhlVar) ? 4 : 2) | (b0kVar2.g(cpn1Var) ? 32 : 16) | (b0kVar2.g(ihlVar) ? 256 : 128) | (b0kVar2.g(ihlVar2) ? 2048 : 1024) | (b0kVar2.g(ihlVar3) ? 16384 : 8192) | (b0kVar2.g(ihlVar4) ? 131072 : 65536) | (b0kVar2.g(ihlVar5) ? 1048576 : 524288) | (b0kVar2.g(ihlVar6) ? 8388608 : 4194304);
        if (b0kVar2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z = cpn1Var instanceof ud50;
            nim0 nim0Var = nim0.a;
            if (z) {
                b0kVar2.i0(1721985600);
                boolean z2 = (i2 & 57344) == 16384;
                Object objT = b0kVar2.T();
                if (z2 || objT == m4cVar) {
                    objT = new pu(ihlVar3, (byte) 19);
                    b0kVar2.s0(objT);
                }
                xhlVar.getClass();
                op71.g(b0kVar2, xhl.j(nim0Var, ihlVar2, (iu30) objT));
                boolean z3 = (i2 & 3670016) == 1048576;
                Object objT2 = b0kVar2.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new pu(ihlVar5, (byte) 20);
                    b0kVar2.s0(objT2);
                }
                op71.g(b0kVar2, xhl.j(nim0Var, ihlVar4, (iu30) objT2));
                shl shlVarG = uhl.g(xhlVar, new nnb0[]{ihlVar2, ihlVar4});
                s650 s650VarT = ((ud50) cpn1Var).t(b0kVar2);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                boolean zG = b0kVar2.g(shlVarG);
                Object objT3 = b0kVar2.T();
                if (zG || objT3 == m4cVar) {
                    r0 = 0;
                    objT3 = new esy0(shlVarG, (byte) 0);
                    b0kVar2.s0(objT3);
                } else {
                    r0 = 0;
                }
                g(150.0f, s650VarT, xhl.j(qim0VarF, ihlVar6, (iu30) objT3), b0kVar2, r0);
                b0kVar2.r((boolean) r0);
            } else {
                if (!(cpn1Var instanceof vd50)) {
                    throw p3d1.k(b0kVar2, -498642501, false);
                }
                b0kVar2.i0(1723022085);
                b0kVar2.i0(-216936308);
                uwr uwrVar = cbx.a;
                s650 s650Var = new s650(p7h.M(new u7h[]{new u7h(cbx.a(b0kVar2).a.c), new u7h(u7h.b(cbx.a(b0kVar2).a.c, 0.0f, 0.0f, 0.0f, 0.0f, 14))}));
                b0kVar2.r(false);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                boolean z4 = (i2 & 57344) == 16384;
                Object objT4 = b0kVar2.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new pu(ihlVar3, (byte) 21);
                    b0kVar2.s0(objT4);
                }
                xhlVar.getClass();
                g(100.0f, s650Var, xhl.j(qim0VarF2, ihlVar, (iu30) objT4), b0kVar2, 0);
                b0kVar2.i0(-1010309204);
                s650 s650Var2 = new s650(p7h.M(new u7h[]{new u7h(u7h.b(cbx.a(b0kVar2).a.c, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(cbx.a(b0kVar2).a.c)}));
                b0kVar2.r(false);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                boolean z5 = (i2 & 3670016) == 1048576;
                Object objT5 = b0kVar2.T();
                if (z5 || objT5 == m4cVar) {
                    objT5 = new pu(ihlVar5, (byte) 22);
                    b0kVar2.s0(objT5);
                }
                g(15.0f, s650Var2, xhl.j(qim0VarF3, ihlVar6, (iu30) objT5), b0kVar2, 0);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n(xhlVar, cpn1Var, ihlVar, ihlVar2, ihlVar3, ihlVar4, ihlVar5, ihlVar6, i, (byte) 23);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(yon1 yon1Var, jtl1 jtl1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1709225244);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(yon1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(jtl1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (yon1Var instanceof td50) {
            x340Var.i0(-1602850435);
            cso1.d(Uri.parse(((td50) yon1Var).d), isl.a, qim0Var2, mif1.S0, null, null, null, x340Var, (i2 & 896) | 27696, 224);
            x340Var.r(false);
        } else {
            if (!(yon1Var instanceof sd50)) {
                throw p3d1.k(x340Var, 1887956891, false);
            }
            x340Var.i0(-1602581696);
            mp10.f(h5p1.G(new ocf0(((sd50) yon1Var).d), null, null, x340Var, 0, 62).c(), qim0Var, false, false, (bcf0) null, Integer.MAX_VALUE, (ddf0) null, v((htl1) f4p1.k(jtl1Var.b, (iac0) null, x340Var, 7).getValue()) ? een.h : een.e, (j6m) null, x340Var, ((i2 >> 3) & 112) | 1572864, 0, 2080700);
            x340Var = x340Var;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(yon1Var, jtl1Var, qim0Var, i, (byte) 12);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:118:0x01b3  */
    public static final void j(vgo1 vgo1Var, wd50 wd50Var, String str, String str2, String str3, cm10 cm10Var, Function0 function0, Function0 function1, Function0 function2, jtl1 jtl1Var, boolean z, qim0 qim0Var, nyn1 nyn1Var, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        int i3;
        int i4;
        boolean z2;
        Function0 function3;
        float f;
        gra graVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(577038797);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(vgo1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(wd50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.g(str3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= (i & 262144) == 0 ? x340Var.g(cm10Var) : x340Var.i(cm10Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= x340Var.i(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= x340Var.i(function1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= x340Var.i(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= x340Var.i(jtl1Var) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var.h(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.g(nyn1Var) ? 256 : 128;
        }
        int i6 = i4;
        if (x340Var.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            qim0 qim0VarY = voo1.y(u291.d(qim0Var, 1.0f), voo1.a);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            Function0 function4 = hmb0.t1;
            if (z3) {
                x340Var.l(function4);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (nyn1Var.equals(bgr0.c)) {
                z2 = true;
            } else if (!(nyn1Var instanceof agr0)) {
                eg.o();
                return;
            } else if (((agr0) nyn1Var).c > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i7 = i5 >> 12;
            i1o1.c(vgo1Var, cm10Var, z2, function1, function0, null, x340Var, (i5 & 14) | 64 | (i7 & 112) | (i7 & 7168) | ((i5 >> 6) & 57344), 32);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarZ = u291.z(qim0Var2, (fra) null, 3);
            if (!(((double) 1.0f) > 0.0d)) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarThen = qim0VarZ.then(new wnb0(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
            x340Var.m0();
            if (x340Var.S) {
                function3 = function4;
                x340Var.l(function3);
            } else {
                function3 = function4;
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarZ2 = u291.z(qim0Var2, (fra) null, 3);
            pw31 pw31Var = pw31.a;
            qim0 qim0VarA = pw31Var.a(0.3f, qim0VarZ2, true);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarA, 0.0f, 0.0f, cbx.b(x340Var).b.c, 0.0f, 11);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            yon1 yon1Var = wd50Var.a;
            gra graVar2 = een.h;
            h2c h2cVar = h2c.a;
            i(yon1Var, jtl1Var, h2cVar.a(qim0Var2, graVar2), x340Var, (i5 >> 24) & 112);
            cpn1 cpn1Var = wd50Var.b;
            boolean z4 = cpn1Var instanceof ud50;
            if (z4) {
                f = 150.0f;
            } else {
                if (!(cpn1Var instanceof vd50)) {
                    eg.o();
                    return;
                }
                f = 100.0f;
            }
            s650 s650VarT = cpn1Var.t(x340Var);
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            if (z4) {
                graVar = een.X;
            } else {
                if (!(cpn1Var instanceof vd50)) {
                    eg.o();
                    return;
                }
                graVar = een.e;
            }
            g(f, s650VarT, h2cVar.a(qim0VarF, graVar), x340Var, 0);
            x340Var.r(true);
            qim0 qim0VarE4 = pw31Var.e(pw31Var.a(0.7f, qim0Var2, true), een.N0);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarE4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function3);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            int i8 = i5 >> 3;
            e(str, str2, str3, cm10Var, function2, null, z, x340Var, (i8 & 57344) | (i8 & 112) | 6 | (i8 & 896) | (i8 & 7168) | 32768 | ((i5 >> 9) & 458752) | ((i6 << 21) & 29360128));
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            if (nyn1Var instanceof agr0) {
                x340Var.i0(-1078524397);
                agr0 agr0Var = (agr0) nyn1Var;
                sjo0.a(agr0Var.d, agr0Var.c, 384, x340Var, uyn1.B(qim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13));
                x340Var.r(false);
            } else {
                x340Var.i0(-1078347573);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fsy0(vgo1Var, wd50Var, str, str2, str3, cm10Var, function0, function1, function2, jtl1Var, z, qim0Var, nyn1Var, i, i2, (byte) 0);
        }
    }

    public static final void k(fcb0 fcb0Var, ecb0 ecb0Var, i8h1 i8h1Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        Object uuyVar;
        ven0 ven0Var;
        wel0 wel0Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-505270695);
        int i2 = i | (b0kVar3.g(fcb0Var) ? 4 : 2) | (b0kVar3.g(ecb0Var) ? 32 : 16) | (b0kVar3.i(i8h1Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            tbr0 tbr0VarC = ((cir0) b0kVar3.k(k2r0.a)).c();
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = new wel0();
                b0kVar3.s0(objT2);
            }
            wel0 wel0Var2 = (wel0) objT2;
            List list = fcb0Var.a;
            String str = fcb0Var.b;
            boolean zI = ((i2 & 14) == 4) | b0kVar3.i(i8h1Var) | b0kVar3.i(wel0Var2) | ((i2 & 112) == 32) | b0kVar3.i(tbr0VarC);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                ven0Var = ven0Var2;
                wel0Var = wel0Var2;
                uuyVar = new uuy((Object) ven0Var, (Object) i8h1Var, (Object) wel0Var, (Object) fcb0Var, (Object) ecb0Var, (Object) tbr0VarC, (byte) 11);
                tbr0VarC = tbr0VarC;
                b0kVar3.s0(uuyVar);
            } else {
                uuyVar = objT3;
                ven0Var = ven0Var2;
                wel0Var = wel0Var2;
            }
            vu30 vu30Var = (vu30) uuyVar;
            boolean zI2 = b0kVar3.i(i8h1Var) | b0kVar3.i(wel0Var) | b0kVar3.i(tbr0VarC);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                jzm jzmVar = new jzm(ven0Var, i8h1Var, wel0Var, tbr0VarC, (byte) 23);
                b0kVar3.s0(jzmVar);
                objT4 = jzmVar;
            }
            Function0 function0 = (Function0) objT4;
            b0kVar2 = b0kVar3;
            f6o1.c(list, vu30Var, function0, null, str, b0kVar2, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(fcb0Var, ecb0Var, i8h1Var, i, (byte) 17);
        }
    }

    public static final void l(xfx xfxVar, u7t0 u7t0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(326608775);
        int i2 = i | (x340Var.i(xfxVar) ? 4 : 2) | (x340Var.i(u7t0Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(xfxVar) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new umr0(xfxVar, iu30Var, (byte) 4);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(u7t0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new wvq0(u7t0Var, (byte) 18);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0Var, (iu30) objT2, x340Var, (i2 >> 3) & 112, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(xfxVar, u7t0Var, qim0Var, iu30Var, i, (byte) 10);
        }
    }

    public static final void m(vgo1 vgo1Var, wd50 wd50Var, String str, String str2, String str3, cm10 cm10Var, Function0 function0, Function0 function1, Function0 function2, jtl1 jtl1Var, boolean z, qim0 qim0Var, nyn1 nyn1Var, b0k b0kVar, int i, int i2) {
        int i3;
        wd50 wd50Var2;
        String str4;
        String str5;
        int i4;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1838704849);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(vgo1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            wd50Var2 = wd50Var;
            i3 |= b0kVar3.g(wd50Var2) ? 32 : 16;
        } else {
            wd50Var2 = wd50Var;
        }
        if ((i & 384) == 0) {
            str4 = str;
            i3 |= b0kVar3.g(str4) ? 256 : 128;
        } else {
            str4 = str;
        }
        if ((i & 3072) == 0) {
            str5 = str2;
            i3 |= b0kVar3.g(str5) ? 2048 : 1024;
        } else {
            str5 = str2;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.g(str3) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= (i & 262144) == 0 ? b0kVar3.g(cm10Var) : b0kVar3.i(cm10Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar3.i(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar3.i(function1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar3.i(function2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar3.i(jtl1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar3.h(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar3.g(qim0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar3.g(nyn1Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            qim0 qim0VarY = voo1.y(u291.d(qim0Var, 1.0f), voo1.a);
            b0kVar3.j0(475845883);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            b0kVar3.j0(-492369756);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, b0kVar3);
            }
            b0kVar3.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            b0kVar3.j0(-492369756);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(b0kVar3);
            }
            b0kVar3.r(false);
            xhl xhlVar = (xhl) objT2;
            b0kVar3.j0(-492369756);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT3);
            }
            b0kVar3.r(false);
            ven0 ven0Var = (ven0) objT3;
            b0kVar3.j0(-492369756);
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, b0kVar3);
            }
            b0kVar3.r(false);
            nil nilVar = (nil) objT4;
            b0kVar3.j0(-492369756);
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, b0kVar3);
            }
            b0kVar3.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            b0kVar2 = b0kVar3;
            who1.h(s161.b(qim0VarY, false, new tu(ufh0Var, (byte) 16)), apo.i(b0kVar2, -1488813576, new gsy0(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 12), nyn1Var, vgo1Var, cm10Var, function1, function0, wd50Var2, jtl1Var, str4, str5, str3, function2, z)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 12), b0kVar2, 48);
            b0kVar2.r(false);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fsy0(vgo1Var, wd50Var, str, str2, str3, cm10Var, function0, function1, function2, jtl1Var, z, qim0Var, nyn1Var, i, i2, (byte) 1);
        }
    }

    public static final void n(wd50 wd50Var, String str, String str2, cm10 cm10Var, Function0 function0, Function0 function1, Function0 function2, jtl1 jtl1Var, vgo1 vgo1Var, boolean z, String str3, nyn1 nyn1Var, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        String str4;
        boolean z2;
        int i5;
        int i6;
        nyn1 nyn1Var2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1336616351);
        if ((i & 6) == 0) {
            i4 = (x340Var.g(wd50Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            str4 = str;
            i4 |= x340Var.g(str4) ? 32 : 16;
        } else {
            str4 = str;
        }
        if ((i & 384) == 0) {
            i4 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? x340Var.g(cm10Var) : x340Var.i(cm10Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= x340Var.i(function1) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= x340Var.i(function2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= x340Var.i(jtl1Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= x340Var.g(vgo1Var) ? 67108864 : 33554432;
        }
        int i7 = i & 805306368;
        nim0 nim0Var = nim0.a;
        if (i7 == 0) {
            i4 |= x340Var.g(nim0Var) ? 536870912 : 268435456;
        }
        int i8 = i3 & 1024;
        if (i8 != 0) {
            z2 = z;
            i5 = 6;
        } else {
            z2 = z;
            if ((i2 & 6) == 0) {
                i5 = i2 | (x340Var.h(z2) ? 4 : 2);
            } else {
                i5 = i2;
            }
        }
        int i9 = i5 | (x340Var.g(str3) ? 32 : 16);
        int i10 = i3 & 4096;
        if (i10 != 0) {
            i6 = i9 | 384;
        } else {
            i6 = i9 | (x340Var.g(nyn1Var) ? 256 : 128);
        }
        if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            z3 = i8 != 0 ? false : z2;
            nyn1Var2 = i10 != 0 ? bgr0.c : nyn1Var;
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            boolean zG = x340Var.g(cir0Var) | ((i4 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new cqu0(cir0Var, function0, (lnm) null, (byte) 27);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (v((htl1) f4p1.k(jtl1Var.b, (iac0) null, x340Var, 7).getValue())) {
                x340Var.i0(-1661460559);
                qim0 qim0VarB = uyn1.B(nim0Var, 24.0f, 0.0f, 24.0f, 16.0f, 2);
                int i11 = i4 << 3;
                int i12 = ((i4 >> 24) & 14) | (i11 & 112);
                int i13 = i4 << 6;
                j(vgo1Var, wd50Var, str4, str3, str2, cm10Var, function0, function1, function2, jtl1Var, z3, qim0VarB, nyn1Var2, x340Var, (i11 & 896) | i12 | ((i6 << 6) & 7168) | (i13 & 57344) | 262144 | (i13 & 458752) | (i13 & 3670016) | (29360128 & i13) | (234881024 & i13) | (i13 & 1879048192), (i6 & 14) | 48 | (i6 & 896));
                x340Var.r(false);
            } else {
                x340Var.i0(-1661000302);
                int i14 = i4 << 3;
                int i15 = ((i4 >> 24) & 14) | (i14 & 112) | (i14 & 896) | ((i6 << 6) & 7168);
                int i16 = i4 << 6;
                m(vgo1Var, wd50Var, str, str3, str2, cm10Var, function0, function1, function2, jtl1Var, z3, uyn1.B(nim0Var, 24.0f, 0.0f, 24.0f, 32.0f, 2), nyn1Var2, x340Var, i15 | (i16 & 57344) | 262144 | (i16 & 458752) | (i16 & 3670016) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), (i6 & 14) | 48 | (i6 & 896));
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            nyn1Var2 = nyn1Var;
            z3 = z2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hsy0(wd50Var, str, str2, cm10Var, function0, function1, function2, jtl1Var, vgo1Var, z3, str3, nyn1Var2, i, i2, i3);
        }
    }

    public static final nbh0 o(jbh0... jbh0VarArr) {
        return new nbh0(Arrays.asList(Arrays.copyOf(jbh0VarArr, jbh0VarArr.length)));
    }

    public static final obh0 p(jbh0... jbh0VarArr) {
        return new obh0(p7h.M(Arrays.copyOf(jbh0VarArr, jbh0VarArr.length)));
    }

    public static final l441 q(vu30 vu30Var, i8d1 i8d1Var, i8d1 i8d1Var2) {
        return new l441(d9n.a, aym.t(aym.p(i8d1Var, i8d1Var2, vu30Var)));
    }

    public static zzq0 r(x340 x340Var) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        return new zzq0(4.0f, 4.0f, 70.0f, 0.0f);
    }

    public static zzq0 s(x340 x340Var) {
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        return uyn1.j(16.0f, 0.0f, 16.0f, 0.0f, 10);
    }

    public static qim0 t(qim0 qim0Var, es41 es41Var, int i) {
        return D(qim0Var, es41Var, (i & 2) != 0, false, true);
    }

    public static boolean u(Context context, int i) {
        if (G(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                t450 t450VarA = t450.a(context);
                if (packageInfo != null && (t450.c(packageInfo, false) || (t450.c(packageInfo, true) && h450.e(t450VarA.a)))) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.isLoggable("UidVerifier", 3);
                return false;
            }
        }
        return false;
    }

    public static final boolean v(htl1 htl1Var) {
        if (htl1Var == null) {
            return false;
        }
        ltl1 ltl1Var = htl1Var.a;
        if (ltl1Var.equals(ltl1.d)) {
            return true;
        }
        if (ltl1Var.equals(ltl1.c)) {
            return htl1Var.b.equals(brl1.b);
        }
        ltl1Var.equals(ltl1.b);
        return false;
    }

    public static int w(jl00 jl00Var, x5f0 x5f0Var, afh0 afh0Var, int i) {
        vfh0 vfh0Var = new vfh0(afh0Var, 2, 2, (byte) 1);
        long jB = jjl.b(0, i, 0, 0, 13);
        return ((zlb0) jl00Var.b).d(new c990(x5f0Var, x5f0Var.getLayoutDirection()), vfh0Var, jB).getHeight();
    }

    public static int x(wb00 wb00Var, x5f0 x5f0Var, afh0 afh0Var, int i) {
        vfh0 vfh0Var = new vfh0(afh0Var, 2, 1, (byte) 1);
        long jB = jjl.b(0, 0, 0, i, 7);
        return ((zlb0) wb00Var.b).d(new c990(x5f0Var, x5f0Var.getLayoutDirection()), vfh0Var, jB).getWidth();
    }

    public static int y(bm00 bm00Var, x5f0 x5f0Var, afh0 afh0Var, int i) {
        vfh0 vfh0Var = new vfh0(afh0Var, 1, 2, (byte) 1);
        long jB = jjl.b(0, i, 0, 0, 13);
        return ((zlb0) bm00Var.b).d(new c990(x5f0Var, x5f0Var.getLayoutDirection()), vfh0Var, jB).getHeight();
    }

    public static int z(ouz ouzVar, x5f0 x5f0Var, afh0 afh0Var, int i) {
        vfh0 vfh0Var = new vfh0(afh0Var, 1, 1, (byte) 1);
        long jB = jjl.b(0, 0, 0, i, 7);
        return ((zlb0) ouzVar.b).d(new c990(x5f0Var, x5f0Var.getLayoutDirection()), vfh0Var, jB).getWidth();
    }
}
