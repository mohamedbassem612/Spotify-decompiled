package p;

import android.appwidget.AppWidgetManager;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.view.ViewGroup;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.player.esperanto.proto.EsContext;
import com.spotify.player.esperanto.proto.EsContextPage;
import com.spotify.player.esperanto.proto.EsRestrictions;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class u2o1 {
    public static final lqc a = new lqc((byte) 20);
    public static b180 b;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2042880333);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("connect-label", qim0Var3);
            String strO0 = cwl1.o0(x340Var, 2131957150);
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0VarN, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 2, false, cjc0Var, 0, null, x340Var, 1572864, 0, 1696);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var2, i, (byte) 6);
        }
    }

    public static final void b(gd80 gd80Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1711087799);
        int i2 = (x340Var.g(gd80Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.y(qim0Var2, f, 8.0f), 1.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            a(null, x340Var, 0);
            if (gd80Var == null) {
                x340Var.i0(2078439725);
            } else {
                x340Var.i0(2078439726);
                j6p1.c(gd80Var, x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(gd80Var, qim0Var, i, (byte) 3);
        }
    }

    public static final void c(c380 c380Var, b851 b851Var, wao0 wao0Var, r951 r951Var, qim0 qim0Var, boolean z, xb51 xb51Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        int i3;
        String str;
        String strK;
        xtb0 xtb0Var;
        g6o0 g6o0Var;
        int i4;
        boolean z2;
        boolean z3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-598820372);
        int i5 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= x340Var.g(b851Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= x340Var.i(wao0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= x340Var.i(r951Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= x340Var.e(0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= x340Var.e(0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= x340Var.i((Object) null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= x340Var.g((Object) null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= x340Var.i((Object) null) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= x340Var.i(qim0Var) ? 536870912 : 268435456;
        }
        if (x340Var.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (((((x340Var.h(z) ? (char) 4 : (char) 2) | (x340Var.g(xb51Var) ? ' ' : (char) 16)) | (x340Var.i(iu30Var) ? 256 : 128)) | (x340Var.i(iu30Var2) ? (char) 2048 : (char) 1024)) & 1171) == 1170) ? false : true)) {
            ven0 ven0VarS = v8r.s(wao0Var, x340Var);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = new r9y0(ven0VarS, (byte) 15);
                x340Var.s0(objT);
            }
            iu30 iu30Var3 = (iu30) objT;
            x340Var.i0(1837597046);
            x340Var.r(false);
            Object[] objArr = new Object[0];
            df41 df41Var = xtb0.y;
            boolean z4 = ((i5 & 57344) == 16384) | ((458752 & i5) == 131072);
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                i2 = 0;
                objT2 = new opg(0, (byte) 17);
                x340Var.s0(objT2);
            } else {
                i2 = 0;
            }
            xtb0 xtb0Var2 = (xtb0) k5p1.u(objArr, df41Var, (Function0) objT2, x340Var, i2);
            int i6 = i5 & 14;
            boolean z5 = i6 == 4 || ((i5 & 8) != 0 && x340Var.g(c380Var));
            Object objT3 = x340Var.T();
            if (z5 || objT3 == m4cVar) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                for (Iterator it = c380Var.iterator(); it.hasNext(); it = it) {
                    int i7 = i5;
                    xvl xvlVar = (cwl) it.next();
                    if (xvlVar instanceof xvl) {
                        str = xvlVar.a.a;
                    } else if (xvlVar instanceof wvl) {
                        str = ((wvl) xvlVar).a.a;
                    } else if (xvlVar instanceof rvl) {
                        str = ((rvl) xvlVar).a.a;
                    } else if (xvlVar instanceof qvl) {
                        str = ((qvl) xvlVar).a.a;
                    } else if (xvlVar instanceof bvl) {
                        str = ((bvl) xvlVar).a.a;
                    } else if (xvlVar instanceof avl) {
                        str = ((avl) xvlVar).a.a;
                    } else if (xvlVar instanceof jul) {
                        str = ((jul) xvlVar).a.a;
                    } else if (xvlVar instanceof iul) {
                        str = ((iul) xvlVar).a.a;
                    } else if (xvlVar instanceof ovl) {
                        str = ((ovl) xvlVar).a.a;
                    } else if (xvlVar instanceof nvl) {
                        str = ((nvl) xvlVar).a.a;
                    } else if (xvlVar instanceof hul) {
                        str = ((hul) xvlVar).a.a;
                    } else if (xvlVar instanceof gul) {
                        str = ((gul) xvlVar).a.a;
                    } else if (xvlVar instanceof zul) {
                        str = ((zul) xvlVar).a.a;
                    } else if (xvlVar instanceof yul) {
                        str = ((yul) xvlVar).a.a;
                    } else if (xvlVar instanceof lul) {
                        str = ((lul) xvlVar).a.a;
                    } else if (xvlVar instanceof kul) {
                        str = ((kul) xvlVar).a.a;
                    } else if (xvlVar instanceof vvl) {
                        str = ((vvl) xvlVar).a.a;
                    } else if (xvlVar instanceof uvl) {
                        str = ((uvl) xvlVar).a.a;
                    } else if (xvlVar instanceof nul) {
                        str = ((nul) xvlVar).a.a;
                    } else if (xvlVar instanceof mul) {
                        str = ((mul) xvlVar).a.a;
                    } else if (xvlVar instanceof qul) {
                        str = ((qul) xvlVar).a.a;
                    } else if (xvlVar instanceof zvl) {
                        str = ((zvl) xvlVar).a.a;
                    } else if (xvlVar instanceof oul) {
                        str = ((oul) xvlVar).a.a;
                    } else if (xvlVar instanceof mvl) {
                        str = ((mvl) xvlVar).a.a;
                    } else if (xvlVar instanceof pvl) {
                        str = ((pvl) xvlVar).a.a;
                    } else {
                        str = xvlVar instanceof cvl ? ((cvl) xvlVar).a.a : null;
                    }
                    if (str == null || ihc1.y0(str)) {
                        if (xvlVar instanceof yvl) {
                            xvlVar = ((yvl) xvlVar).a.b;
                        }
                        strK = l1d.k(xvlVar.hashCode(), xvlVar.getClass().getName(), ":");
                    } else {
                        strK = f4i1.f(xvlVar.getClass().getName(), ":", str);
                    }
                    int iIntValue = ((Number) linkedHashMap.getOrDefault(strK, 0)).intValue();
                    linkedHashMap.put(strK, Integer.valueOf(iIntValue + 1));
                    arrayList.add(strK + ":" + iIntValue);
                    i5 = i7;
                }
                i3 = i5;
                objT3 = mqo1.A(arrayList);
                x340Var.s0(objT3);
            } else {
                i3 = i5;
            }
            c380 c380Var2 = (c380) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = new wg31(iu30Var3, (byte) 18);
                x340Var.s0(objT4);
            }
            w0o1.f(xtb0Var2, b851Var, (Function0) objT4, x340Var, (i3 & 112) | 384);
            hqn1.i(xtb0Var2, iu30Var3, x340Var, 48);
            if (z) {
                x340Var.i0(1838082227);
                xtb0Var = xtb0Var2;
                g6o0Var = null;
                i4 = 32;
                vgo1.f((tl7) x340Var.k(rce0.a), xtb0Var, false, x340Var, 0, 4);
                z2 = false;
                x340Var.r(false);
            } else {
                xtb0Var = xtb0Var2;
                g6o0Var = null;
                i4 = 32;
                z2 = false;
                x340Var.i0(1838177366);
                x340Var.r(false);
            }
            qim0 qim0VarN = anm1.N("search_results_list", bmq0.L(qim0Var, k1o1.q(x340Var), g6o0Var));
            x340Var.i0(1838688184);
            x340Var.r(z2);
            qim0 qim0VarThen = qim0VarN.then(nim0.a);
            boolean zI = (i6 == 4 || ((i3 & 8) != 0 && x340Var.i(c380Var))) | x340Var.i(xtb0Var);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new rsy(c380Var, xtb0Var, (byte) 2);
                x340Var.s0(objT5);
            }
            qim0 qim0VarI = zr7.i(qim0VarThen, new kj21(xb51Var, iu30Var, (Function0) objT5, iu30Var2, (byte) 5));
            if (z) {
                x340Var.i0(59327426);
                qim0VarI = x2g0.E(x340Var, qim0VarI);
                z3 = false;
            } else {
                z3 = false;
                x340Var.i0(59328312);
            }
            x340Var.r(z3);
            qim0 qim0Var2 = qim0VarI;
            u85 u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(z3);
            vk80 vk80VarX = poo1.x(new bgc0(u85Var, i4), x340Var);
            if (i6 == 4 || ((i3 & 8) != 0 && x340Var.i(c380Var))) {
                z3 = true;
            }
            boolean zG = x340Var.g(c380Var2) | z3 | x340Var.i(r951Var);
            Object objT6 = x340Var.T();
            if (zG || objT6 == m4cVar) {
                objT6 = new v721(c380Var, c380Var2, r951Var, (byte) 26);
                x340Var.s0(objT6);
            }
            s3o1.d(qim0Var2, xtb0Var, vk80VarX, null, null, null, false, null, (iu30) objT6, x340Var, 0, 504);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ob8(c380Var, b851Var, wao0Var, r951Var, qim0Var, z, xb51Var, iu30Var, iu30Var2, i);
        }
    }

    public static final void d(hob1 hob1Var, j2i j2iVar, Function0 function0, Function0 function1, j2i j2iVar2, qim0 qim0Var, vu30 vu30Var, float f, vu30 vu30Var2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-236554174);
        int i2 = i | (x340Var.i(hob1Var) ? 4 : 2) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 131072 : 65536);
        if ((i & 12582912) == 0) {
            i2 |= x340Var.d(f) ? 8388608 : 4194304;
        }
        int i3 = i2 | (x340Var.i(vu30Var2) ? 67108864 : 33554432);
        if (x340Var.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            nyx.a(2, (wux) null, apo.r(-1022463403, new gsb1(hob1Var, qim0Var, f, function1, function0, j2iVar, vu30Var2, j2iVar2, vu30Var, (byte) 1), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e470(hob1Var, j2iVar, function0, function1, j2iVar2, qim0Var, vu30Var, f, vu30Var2, i);
        }
    }

    public static final yiy0 e(yiy0 yiy0Var, long j) {
        return new yiy0(j == 19500 ? yiy0Var.f() : yiy0Var.e());
    }

    public static final yiy0 f(yiy0 yiy0Var, long j) {
        return new yiy0(j == 19500 ? yiy0Var.f() : yiy0Var.e());
    }

    public static final rq2 g(s6h0 s6h0Var) {
        if (s6h0Var instanceof l6h0) {
            return rq2.NPV_MARTINI_CHAT;
        }
        if (s6h0Var instanceof n6h0) {
            return rq2.NPV_DJ;
        }
        if (s6h0Var instanceof m6h0) {
            return rq2.NPV_SEE_MORE;
        }
        if (s6h0Var instanceof i6h0) {
            return rq2.ADVANCED_CURATION;
        }
        if (s6h0Var instanceof r6h0) {
            return rq2.SEARCH_CROSSWORD;
        }
        if ((s6h0Var instanceof o6h0) || (s6h0Var instanceof q6h0) || (s6h0Var instanceof k6h0) || (s6h0Var instanceof j6h0) || (s6h0Var instanceof p6h0)) {
            return rq2.HOME_DJ;
        }
        eg.o();
        return null;
    }

    public static final w16 h(a8b0 a8b0Var) {
        b0h1 b0h1Var;
        b0h1 b0h1Var2;
        if (a8b0Var.w0() instanceof dq20) {
            w16 w16VarH = h(i3p1.C(a8b0Var));
            w16 w16VarH2 = h(i3p1.I(a8b0Var));
            return new w16(vzn1.q(y3o1.Z(i3p1.C((a8b0) w16VarH.a), i3p1.I((a8b0) w16VarH2.a)), vzn1.l(a8b0Var)), vzn1.q(y3o1.Z(i3p1.C((a8b0) w16VarH.b), i3p1.I((a8b0) w16VarH2.b)), vzn1.l(a8b0Var)));
        }
        sod sodVarT0 = a8b0Var.t0();
        boolean z = true;
        if (a8b0Var.t0() instanceof sod) {
            e1h1 e1h1VarL = sodVarT0.l();
            a8b0 a8b0VarH = o1h1.h(e1h1VarL.b(), a8b0Var.u0());
            int iC = l1d.C(e1h1VarL.a());
            if (iC == 1) {
                return new w16(a8b0VarH, rzn1.s(a8b0Var).p());
            }
            if (iC == 2) {
                return new w16(o1h1.h(rzn1.s(a8b0Var).o(), a8b0Var.u0()), a8b0VarH);
            }
            ncn0.e(e1h1VarL, "Only nontrivial projections should have been captured, not: ");
            return null;
        }
        if (a8b0Var.r0().isEmpty() || a8b0Var.r0().size() != sodVarT0.getParameters().size()) {
            return new w16(a8b0Var, a8b0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (mmr0 mmr0Var : o7h.v1(a8b0Var.r0(), sodVarT0.getParameters())) {
            e1h1 e1h1Var = (e1h1) mmr0Var.a;
            y0h1 y0h1Var = (y0h1) mmr0Var.b;
            y0h1Var.getClass();
            int iX = y0h1Var.x();
            if (iX == 0) {
                l1h1.a(35);
                throw null;
            }
            if (e1h1Var == null) {
                l1h1.a(36);
                throw null;
            }
            l1h1 l1h1Var = l1h1.b;
            int iC2 = l1d.C(e1h1Var.c() ? 3 : l1h1.b(iX, e1h1Var.a()));
            if (iC2 == 0) {
                b0h1Var2 = new b0h1(y0h1Var, e1h1Var.b(), e1h1Var.b());
            } else if (iC2 == 1) {
                b0h1Var2 = new b0h1(y0h1Var, e1h1Var.b(), kht.e(y0h1Var).p());
            } else {
                if (iC2 != 2) {
                    eg.o();
                    return null;
                }
                b0h1Var2 = new b0h1(y0h1Var, kht.e(y0h1Var).o(), e1h1Var.b());
            }
            if (e1h1Var.c()) {
                arrayList.add(b0h1Var2);
                arrayList2.add(b0h1Var2);
            } else {
                w16 w16VarH3 = h(b0h1Var2.b);
                a8b0 a8b0Var2 = (a8b0) w16VarH3.a;
                a8b0 a8b0Var3 = (a8b0) w16VarH3.b;
                w16 w16VarH4 = h(b0h1Var2.c);
                a8b0 a8b0Var4 = (a8b0) w16VarH4.a;
                a8b0 a8b0Var5 = (a8b0) w16VarH4.b;
                y0h1 y0h1Var2 = b0h1Var2.a;
                b0h1 b0h1Var3 = new b0h1(y0h1Var2, a8b0Var3, a8b0Var4);
                b0h1 b0h1Var4 = new b0h1(y0h1Var2, a8b0Var2, a8b0Var5);
                arrayList.add(b0h1Var3);
                arrayList2.add(b0h1Var4);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            b0h1Var = (b0h1) it.next();
            b0h1Var.getClass();
        } while (c8b0.a.b(b0h1Var.b, b0h1Var.c));
        return new w16(z ? rzn1.s(a8b0Var).o() : s(a8b0Var, arrayList), s(a8b0Var, arrayList2));
    }

    public static final EsContext.Context i(Context context) {
        cmz cmzVarP = EsContext.Context.p();
        if (context.pages().c()) {
            Iterable<ContextPage> iterable = (Iterable) context.pages().b();
            ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
            for (ContextPage contextPage : iterable) {
                emz emzVarP = EsContextPage.ContextPage.p();
                if (contextPage.tracks().c()) {
                    Iterable iterable2 = (Iterable) contextPage.tracks().b();
                    ArrayList arrayList2 = new ArrayList(q7h.U(iterable2, 10));
                    Iterator it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(xlm.b((ContextTrack) it.next()));
                    }
                    emzVarP.n(arrayList2);
                    emzVarP.r(false);
                } else {
                    emzVarP.r(true);
                }
                emzVarP.q(contextPage.metadata());
                emzVarP.t(contextPage.pageUrl());
                emzVarP.s(contextPage.nextPageUrl());
                arrayList.add(emzVarP.build());
            }
            cmzVarP.n(arrayList);
            cmzVarP.r(false);
        } else {
            cmzVarP.r(true);
        }
        cmzVarP.q(context.metadata());
        cmzVarP.t(context.uri());
        cmzVarP.u(context.url());
        if (context.restrictions().c()) {
            Restrictions restrictions = (Restrictions) context.restrictions().b();
            arz arzVarM0 = EsRestrictions.Restrictions.M0();
            arzVarM0.u(restrictions.disallowPausingReasons());
            arzVarM0.G(restrictions.disallowResumingReasons());
            arzVarM0.H(restrictions.disallowSeekingReasons());
            arzVarM0.w(restrictions.disallowPeekingPrevReasons());
            arzVarM0.v(restrictions.disallowPeekingNextReasons());
            arzVarM0.L(restrictions.disallowSkippingPrevReasons());
            arzVarM0.K(restrictions.disallowSkippingNextReasons());
            arzVarM0.Q(restrictions.disallowSwipePrevReasons());
            arzVarM0.P(restrictions.disallowSwipeNextReasons());
            arzVarM0.S(restrictions.disallowTogglingRepeatContextReasons());
            arzVarM0.T(restrictions.disallowTogglingRepeatTrackReasons());
            arzVarM0.U(restrictions.disallowTogglingShuffleReasons());
            arzVarM0.I(restrictions.disallowSetQueueReasons());
            arzVarM0.n(restrictions.disallowAddToQueueReasons());
            arzVarM0.q(restrictions.disallowAddToQueueTrackReasons());
            arzVarM0.t(restrictions.disallowInterruptingPlaybackReasons());
            arzVarM0.V(restrictions.disallowTransferringPlaybackReasons());
            arzVarM0.x(restrictions.disallowRemoteControlReasons());
            arzVarM0.s(restrictions.disallowInsertingIntoNextTracksReasons());
            arzVarM0.r(restrictions.disallowInsertingIntoContextTracksReasons());
            arzVarM0.E(restrictions.disallowReorderingInNextTracksReasons());
            arzVarM0.D(restrictions.disallowReorderingInContextTracksReasons());
            arzVarM0.z(restrictions.disallowRemovingFromNextTracksReasons());
            arzVarM0.y(restrictions.disallowRemovingFromContextTracksReasons());
            arzVarM0.W(restrictions.disallowUpdatingContextReasons());
            arzVarM0.J(restrictions.disallowSettingPlaybackSpeedReasons());
            j380 j380VarDisallowSignals = restrictions.disallowSignals();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(j380VarDisallowSignals.size()));
            for (Map.Entry entry : j380VarDisallowSignals.entrySet()) {
                Object key = entry.getKey();
                Restrictions.RestrictionReasons restrictionReasons = (Restrictions.RestrictionReasons) entry.getValue();
                zqz zqzVarR = EsRestrictions.RestrictionReasons.r();
                zqzVarR.n(o7h.l1(restrictionReasons.reasons()));
                linkedHashMap.put(key, zqzVarR.build());
            }
            arzVarM0.Z(linkedHashMap);
            arzVarM0.M(restrictions.disallowSleepTimerClearReasons());
            arzVarM0.N(restrictions.disallowSleepTimerDurationReasons());
            arzVarM0.O(restrictions.disallowSleepTimerEndOfTrackReasons());
            arzVarM0.R(restrictions.disallowTapToPlayTrackInNextTracksReasons());
            arzVarM0.F(restrictions.disallowReorderingTrackInNextTracksReasons());
            arzVarM0.C(restrictions.disallowReorderingEpisodeInNextTracksReasons());
            arzVarM0.B(restrictions.disallowReorderingEnqueuedTrackInNextTracksReasons());
            arzVarM0.A(restrictions.disallowReorderingEnqueuedEpisodeInNextTracksReasons());
            arzVarM0.Y(restrictions.disallowViewingQueueReasons());
            arzVarM0.X(restrictions.disallowViewingOrderedTracksInNextTracksReasons());
            cmzVarP.s(arzVarM0.build());
        }
        return cmzVarP.build();
    }

    public static final p8b j() {
        return new p8b(Thread.currentThread());
    }

    public static final String k(int i) {
        return f4i1.c(i, "appWidget-");
    }

    public static void l(android.content.Context context, l5o l5oVar, mlw0 mlw0Var) {
        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
        l5oVar.execute(new pvt(mlw0Var, 11, (Object) null, (byte) 3));
    }

    public static final AppWidgetManager m(android.content.Context context) {
        return (AppWidgetManager) context.getSystemService("appwidget");
    }

    public static final float n(jkr0 jkr0Var) {
        kl1 kl1Var = jkr0Var.d;
        return ((drr0) kl1Var.d).s() + ((err0) kl1Var.c).s();
    }

    public static final boolean o(kx5 kx5Var) {
        int i = kx5Var.a;
        return Integer.MIN_VALUE <= i && i < -1;
    }

    public static void p() {
        LinkedHashMap linkedHashMap = h8h1.a;
    }

    public static int q(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
            case 4:
            case 7:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case grn1.d /* 12 */:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
                return 4;
            case 16:
            case 19:
            default:
                return 0;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return 5;
        }
    }

    public static void r(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    public static final a8b0 s(a8b0 a8b0Var, ArrayList arrayList) {
        f1h1 f1h1Var;
        a8b0Var.r0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b0h1 b0h1Var = (b0h1) it.next();
            b0h1Var.getClass();
            a8b0 a8b0Var2 = b0h1Var.c;
            a8b0 a8b0Var3 = b0h1Var.b;
            y0h1 y0h1Var = b0h1Var.a;
            c8b0.a.b(a8b0Var3, a8b0Var2);
            if (u890.j(a8b0Var3, a8b0Var2)) {
                f1h1Var = new f1h1(a8b0Var3);
            } else {
                if (y0h1Var.x() == 2) {
                    f1h1Var = new f1h1(a8b0Var3);
                } else {
                    if (g6b0.F(a8b0Var3) && y0h1Var.x() != 2) {
                        f1h1Var = new f1h1(3 != y0h1Var.x() ? 3 : 1, a8b0Var2);
                    } else {
                        if (a8b0Var2 == null) {
                            g6b0.a(140);
                            throw null;
                        }
                        if (g6b0.y(a8b0Var2) && a8b0Var2.u0()) {
                            f1h1Var = new f1h1(2 == y0h1Var.x() ? 1 : 2, a8b0Var3);
                        } else {
                            f1h1Var = new f1h1(3 != y0h1Var.x() ? 3 : 1, a8b0Var2);
                        }
                    }
                }
            }
            arrayList2.add(f1h1Var);
        }
        return jzn1.y(a8b0Var, arrayList2, null, 6);
    }

    public static final String t(kx5 kx5Var) {
        return k(kx5Var.a);
    }

    public static final dtw u(wpw wpwVar, ViewGroup viewGroup) {
        tka0 tka0Var = dtw.C;
        return mhc.b(viewGroup.getContext(), viewGroup, wpwVar, rih1.a, (ipb1) null, 112);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0154 A[Catch: IllegalStateException -> 0x0141, IOException -> 0x0143, FileNotFoundException -> 0x0145, TRY_LEAVE, TryCatch #33 {FileNotFoundException -> 0x0145, IOException -> 0x0143, IllegalStateException -> 0x0141, blocks: (B:88:0x0128, B:91:0x013c, B:107:0x0154, B:105:0x0151, B:104:0x014e, B:90:0x0130, B:101:0x0149), top: B:291:0x0128, inners: #21, #28 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x016a  */
    /* JADX WARN: Code duplicated, block: B:124:0x018d A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #36 {all -> 0x019b, blocks: (B:122:0x0181, B:124:0x018d, B:133:0x019e), top: B:283:0x0181 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x019e A[Catch: all -> 0x019b, TRY_ENTER, TRY_LEAVE, TryCatch #36 {all -> 0x019b, blocks: (B:122:0x0181, B:124:0x018d, B:133:0x019e), top: B:283:0x0181 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e7 A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:156:0x01e1, B:158:0x01e7, B:159:0x01eb, B:161:0x01f1), top: B:243:0x01e1 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x01f1 A[Catch: all -> 0x0222, TRY_LEAVE, TryCatch #1 {all -> 0x0222, blocks: (B:156:0x01e1, B:158:0x01e7, B:159:0x01eb, B:161:0x01f1), top: B:243:0x01e1 }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0273  */
    /* JADX WARN: Code duplicated, block: B:230:0x027c  */
    /* JADX WARN: Code duplicated, block: B:243:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01f5 A[EDGE_INSN: B:292:0x01f5->B:163:0x01f5 BREAK  A[LOOP:0: B:159:0x01eb->B:293:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static void v(android.content.Context context, Executor executor, b8x0 b8x0Var, boolean z) {
        char c;
        FileInputStream fileInputStreamA;
        byte[] bArr;
        r0u[] r0uVarArrH;
        r0u[] r0uVarArr;
        b8x0 b8x0Var2;
        r0u[] r0uVarArr2;
        byte[] bArr2;
        byte[] bArr3;
        Object[] objArr;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr4;
        int i;
        ByteArrayOutputStream byteArrayOutputStream;
        int i2;
        qvt qvtVar;
        FileInputStream fileInputStreamA2;
        boolean z2;
        android.content.Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z3 = 0;
        z3 = 0;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z2 = j == packageInfo.lastUpdateTime;
                            if (z2) {
                                b8x0Var.d(2, (Object) null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    context.getPackageName();
                    eex0.c(context, false);
                    return;
                }
            }
            context.getPackageName();
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            qvt qvtVar2 = new qvt(assets, executor, b8x0Var, name, file2);
            byte[] bArr5 = qvtVar2.c;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            qvtVar2.f = true;
                            fileInputStreamA = qvtVar2.a(assets, "dexopt/baseline.prof");
                            bArr = y2o1.a;
                            c = '\b';
                            if (fileInputStreamA != null) {
                                r0uVarArrH = y2o1.H(fileInputStreamA, y2o1.D(fileInputStreamA, bArr), qvtVar2.e);
                                fileInputStreamA.close();
                                qvtVar2.g = r0uVarArrH;
                            }
                            r0uVarArr = qvtVar2.g;
                            if (r0uVarArr != null) {
                                fileInputStreamA2 = qvtVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 != null) {
                                    qvtVar2.g = y2o1.E(fileInputStreamA2, y2o1.D(fileInputStreamA2, y2o1.b), bArr5, r0uVarArr);
                                    fileInputStreamA2.close();
                                    qvtVar = qvtVar2;
                                } else {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    qvtVar = null;
                                }
                                if (qvtVar != null) {
                                    qvtVar2 = qvtVar;
                                }
                            }
                            b8x0Var2 = qvtVar2.b;
                            r0uVarArr2 = qvtVar2.g;
                            bArr2 = qvtVar2.c;
                            if (r0uVarArr2 != null) {
                                if (qvtVar2.f) {
                                    eg.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr2);
                                if (y2o1.J(byteArrayOutputStream, bArr2, r0uVarArr2)) {
                                    qvtVar2.h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    qvtVar2.g = null;
                                } else {
                                    b8x0Var2.d(5, (Object) null);
                                    qvtVar2.g = null;
                                    byteArrayOutputStream.close();
                                }
                            }
                            bArr3 = qvtVar2.h;
                            if (bArr3 != null) {
                                if (qvtVar2.f) {
                                    eg.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                fileOutputStream = new FileOutputStream(qvtVar2.d);
                                channel = fileOutputStream.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr4 = new byte[512];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr4);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStream.write(bArr4, 0, i);
                                        }
                                        c = 1;
                                        qvtVar2.b(1, (Serializable) null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        qvtVar2.h = null;
                                        qvtVar2.g = null;
                                        objArr = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            objArr = false;
                            c = 1;
                            if (objArr != false) {
                                r(packageInfo, filesDir);
                            }
                        } else {
                            qvtVar2.b(4, (Serializable) null);
                        }
                    } catch (IOException unused2) {
                        c = 1;
                        qvtVar2.b(4, (Serializable) null);
                    }
                } else if (file2.canWrite()) {
                    qvtVar2.f = true;
                    try {
                        fileInputStreamA = qvtVar2.a(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        b8x0Var.d(6, e);
                        fileInputStreamA = null;
                    } catch (IOException e2) {
                        b8x0Var.d(7, e2);
                        fileInputStreamA = null;
                    }
                    bArr = y2o1.a;
                    c = '\b';
                    try {
                        if (fileInputStreamA != null) {
                            try {
                                r0uVarArrH = y2o1.H(fileInputStreamA, y2o1.D(fileInputStreamA, bArr), qvtVar2.e);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e3) {
                                    b8x0Var.d(7, e3);
                                }
                            } catch (IOException e4) {
                                b8x0Var.d(7, e4);
                                try {
                                    fileInputStreamA.close();
                                } catch (IOException e5) {
                                    b8x0Var.d(7, e5);
                                }
                                r0uVarArrH = null;
                            } catch (IllegalStateException e6) {
                                b8x0Var.d(8, e6);
                                fileInputStreamA.close();
                                r0uVarArrH = null;
                            }
                            qvtVar2.g = r0uVarArrH;
                        }
                        r0uVarArr = qvtVar2.g;
                        if (r0uVarArr != null && ((i2 = Build.VERSION.SDK_INT) >= 31 || i2 == 24 || i2 == 25)) {
                            try {
                                fileInputStreamA2 = qvtVar2.a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamA2 != null) {
                                    try {
                                        qvtVar2.g = y2o1.E(fileInputStreamA2, y2o1.D(fileInputStreamA2, y2o1.b), bArr5, r0uVarArr);
                                        fileInputStreamA2.close();
                                        qvtVar = qvtVar2;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamA2.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamA2 != null) {
                                        fileInputStreamA2.close();
                                    }
                                    qvtVar = null;
                                }
                            } catch (FileNotFoundException e7) {
                                b8x0Var.d(9, e7);
                                qvtVar = null;
                            } catch (IOException e8) {
                                b8x0Var.d(7, e8);
                                qvtVar = null;
                            } catch (IllegalStateException e9) {
                                qvtVar2.g = null;
                                b8x0Var.d(8, e9);
                                qvtVar = null;
                            }
                            if (qvtVar != null) {
                                qvtVar2 = qvtVar;
                            }
                        }
                        b8x0Var2 = qvtVar2.b;
                        r0uVarArr2 = qvtVar2.g;
                        bArr2 = qvtVar2.c;
                        if (r0uVarArr2 != null && bArr2 != null) {
                            if (qvtVar2.f) {
                                eg.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr);
                                    byteArrayOutputStream.write(bArr2);
                                    if (y2o1.J(byteArrayOutputStream, bArr2, r0uVarArr2)) {
                                        b8x0Var2.d(5, (Object) null);
                                        qvtVar2.g = null;
                                        byteArrayOutputStream.close();
                                    } else {
                                        qvtVar2.h = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        qvtVar2.g = null;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                b8x0Var2.d(7, e10);
                            } catch (IllegalStateException e11) {
                                b8x0Var2.d(8, e11);
                            }
                        }
                        bArr3 = qvtVar2.h;
                        if (bArr3 != null) {
                            objArr = false;
                            c = 1;
                        } else {
                            try {
                                if (qvtVar2.f) {
                                    eg.m("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr3);
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream(qvtVar2.d);
                                                try {
                                                    try {
                                                        channel = fileOutputStream.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr4 = new byte[512];
                                                                                while (true) {
                                                                                    i = byteArrayInputStream.read(bArr4);
                                                                                    if (i > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStream.write(bArr4, 0, i);
                                                                                    }
                                                                                }
                                                                                c = 1;
                                                                                qvtVar2.b(1, (Serializable) null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStream.close();
                                                                                byteArrayInputStream.close();
                                                                                qvtVar2.h = null;
                                                                                qvtVar2.g = null;
                                                                                objArr = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    Throwable th13 = th;
                                                                    if (channel == null) {
                                                                        throw th13;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th13;
                                                                    } catch (Throwable th14) {
                                                                        th13.addSuppressed(th14);
                                                                        throw th13;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStream.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        c = 1;
                                        qvtVar2.b(6, e);
                                        qvtVar2.h = null;
                                        qvtVar2.g = null;
                                        objArr = false;
                                    } catch (IOException e13) {
                                        e = e13;
                                        c = 1;
                                        qvtVar2.b(7, e);
                                        qvtVar2.h = null;
                                        qvtVar2.g = null;
                                        objArr = false;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    qvtVar2.b(6, e);
                                    qvtVar2.h = null;
                                    qvtVar2.g = null;
                                    objArr = false;
                                } catch (IOException e15) {
                                    e = e15;
                                    qvtVar2.b(7, e);
                                    qvtVar2.h = null;
                                    qvtVar2.g = null;
                                    objArr = false;
                                }
                            } catch (Throwable th23) {
                                qvtVar2.h = null;
                                qvtVar2.g = null;
                                throw th23;
                            }
                        }
                        if (objArr != false) {
                            r(packageInfo, filesDir);
                        }
                    } catch (Throwable th24) {
                        try {
                            fileInputStreamA.close();
                            throw th24;
                        } catch (IOException e16) {
                            b8x0Var.d(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    qvtVar2.b(4, (Serializable) null);
                }
                if (objArr != false && z) {
                    z3 = c;
                }
                eex0.c(context, z3);
            }
            qvtVar2.b(3, Integer.valueOf(Build.VERSION.SDK_INT));
            c = 1;
            objArr = false;
            if (objArr != false) {
                z3 = c;
            }
            eex0.c(context, z3);
        } catch (PackageManager.NameNotFoundException e17) {
            b8x0Var.d(7, e17);
            eex0.c(context, false);
        }
    }

    public static void w(android.content.Context context, l5o l5oVar, mlw0 mlw0Var) {
        try {
            r(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            l5oVar.execute(new pvt(mlw0Var, 10, (Object) null, (byte) 3));
        } catch (PackageManager.NameNotFoundException e) {
            l5oVar.execute(new pvt(mlw0Var, 7, e, (byte) 3));
        }
    }

    public static void x(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                bhn0.i(f4i1.c(i2, "at index "));
                return;
            }
        }
    }
}
