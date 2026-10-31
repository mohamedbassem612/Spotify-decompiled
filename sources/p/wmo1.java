package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wmo1 {
    public static final float[][] a = {new float[]{15.0f, -5.0f}, new float[]{-15.0f, 5.0f}, new float[]{15.0f, -5.0f}, new float[]{-15.0f, 5.0f}, new float[]{15.0f, -5.0f}};
    public static b180 b;

    public static final af5 A(int i, int i2, String str, zma1 zma1Var, iu30 iu30Var, b0k b0kVar, int i3, int i4) {
        if ((i4 & 8) != 0) {
            zma1Var = null;
        }
        x340 x340Var = (x340) b0kVar;
        boolean zI = x340Var.i(zma1Var) | ((((i3 & 896) ^ 384) > 256 && x340Var.g(str)) || (i3 & 384) == 256) | ((((57344 & i3) ^ 24576) > 16384 && x340Var.g(iu30Var)) || (i3 & 24576) == 16384);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new bhc1(zma1Var, str, iu30Var, (byte) 1);
            x340Var.s0(objT);
        }
        return x(i, cwl1.o0(x340Var, i2), (vu30) objT, x340Var, i3 & 14);
    }

    public static final double B(int i) {
        if (i > 0) {
            return ((double) i) / 65535.0d;
        }
        Logger.k(f4i1.c(i, "Volume is lower or 0: "), new Object[0]);
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    public static final Next C(evo0 evo0Var, zuo0 zuo0Var) {
        mmr0 mmr0Var;
        String str;
        auo0 auo0Var;
        puo0 puo0Var = evo0Var.c;
        boolean z = evo0Var.d;
        k5a1 k5a1Var = evo0Var.a;
        boolean z2 = k5a1Var.b;
        String str2 = k5a1Var.h;
        int i = k5a1Var.l;
        if (zuo0Var instanceof xuo0) {
            k5a1 k5a1Var2 = ((xuo0) zuo0Var).a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ft0 ft0Var = new ft0(linkedHashSet, k5a1Var2, (byte) 16);
            dvo0 dvo0Var = new dvo0(linkedHashSet, k5a1Var2, (byte) 0);
            int i2 = k5a1Var2.l;
            int i3 = k5a1Var2.k;
            boolean z3 = k5a1Var2.b;
            if (!z3 && i3 == 2 && i != i2 && i != 1 && i2 != 1) {
                if (i2 == 2) {
                    ft0Var.invoke();
                } else if (i2 == 3) {
                    dvo0Var.invoke();
                }
            }
            dvo0 dvo0Var2 = new dvo0(linkedHashSet, k5a1Var2, (byte) 1);
            boolean z4 = k5a1Var.q;
            boolean z5 = k5a1Var2.q;
            if (!z3 && z4 != z5) {
                dvo0Var2.invoke();
            }
            ya0 ya0Var = evo0Var.b;
            if (i3 != 2 || z2 || ya0Var == null) {
                mmr0Var = null;
            } else {
                int iOrdinal = k5a1Var2.j.ordinal();
                if (iOrdinal == 4) {
                    a0s0 a0s0VarA = k5a1Var.a();
                    if (a0s0VarA == null || (str = k5a1Var.n) == null) {
                        auo0Var = null;
                    } else {
                        String str3 = ya0Var.d;
                        String str4 = a0s0VarA.b;
                        String str5 = ya0Var.b;
                        String str6 = ya0Var.a;
                        auo0Var = ya0Var.c == 1 ? new auo0(new vuo0(str3, str4, str5, str, str6)) : new luo0(str3, str4, str5, str, str6);
                    }
                    if (auo0Var != null) {
                        mmr0Var = new mmr0(auo0Var, hr90.e);
                    } else {
                        mmr0Var = null;
                    }
                } else if (iOrdinal != 6) {
                    mmr0Var = null;
                } else {
                    mmr0Var = new mmr0(new ouo0(ya0Var.a, str2 != null ? str2 : ""), hr90.d);
                }
            }
            if (mmr0Var != null) {
                puo0 puo0Var2 = (puo0) mmr0Var.a;
                hr90 hr90Var = (hr90) mmr0Var.b;
                if (z) {
                    linkedHashSet.add(puo0Var2);
                } else {
                    puo0Var = puo0Var2;
                }
                if (str2 != null) {
                    linkedHashSet.add(new buo0(str2, hr90Var));
                }
            }
            return Next.i(evo0.a(evo0Var, k5a1Var2, (ya0) null, puo0Var, false, 10), linkedHashSet);
        }
        if (zuo0Var instanceof yuo0) {
            if (k5a1Var.k != 2) {
                return Next.j();
            }
            if (str2 == null || str2.length() == 0) {
                return Next.j();
            }
            if (z2) {
                return Next.j();
            }
            int iC = l1d.C(i);
            if (iC == 0) {
                return Next.a(Effects.a(new huo0[]{huo0.a}));
            }
            if (iC == 1) {
                return Next.j();
            }
            if (iC == 2) {
                return Next.a(Effects.a(new iuo0[]{iuo0.a}));
            }
            eg.o();
            return null;
        }
        boolean z6 = zuo0Var instanceof wuo0;
        cuo0 cuo0Var = cuo0.a;
        if (!z6) {
            if (zuo0Var instanceof uuo0) {
                return ((uuo0) zuo0Var).a ? Next.a(Effects.a(new cuo0[]{cuo0Var})) : Next.j();
            }
            if (zuo0Var instanceof ruo0) {
                return Next.h(evo0.a(evo0Var, (k5a1) null, ((ruo0) zuo0Var).a, (puo0) null, false, 13));
            }
            if (zuo0Var instanceof tuo0) {
                evo0 evo0VarA = evo0.a(evo0Var, (k5a1) null, (ya0) null, (puo0) null, true, 3);
                Set setSingleton = puo0Var != null ? Collections.singleton(puo0Var) : null;
                if (setSingleton == null) {
                    setSingleton = w7x.a;
                }
                return Next.i(evo0VarA, setSingleton);
            }
            if (zuo0Var instanceof suo0) {
                return Next.h(evo0.a(evo0Var, (k5a1) null, (ya0) null, (puo0) null, false, 7));
            }
            if (!(zuo0Var instanceof vuo0)) {
                eg.o();
                return null;
            }
            vuo0 vuo0Var = (vuo0) zuo0Var;
            luo0 luo0Var = new luo0(vuo0Var.a, vuo0Var.b, vuo0Var.c, vuo0Var.d, vuo0Var.e);
            return z ? Next.i(evo0Var, Collections.singleton(luo0Var)) : Next.h(evo0.a(evo0Var, (k5a1) null, (ya0) null, luo0Var, false, 11));
        }
        d1a1 d1a1Var = ((wuo0) zuo0Var).a;
        if (d1a1Var instanceof d1a1) {
            return Next.a(Effects.a(new muo0[]{new muo0(d1a1Var.a)}));
        }
        if (d1a1Var instanceof l1a1) {
            String str7 = ((l1a1) d1a1Var).a.d;
            return (!z || str7 == null || ihc1.y0(str7)) ? Next.j() : Next.a(Effects.a(new duo0[]{new duo0(str7)}));
        }
        if (!(d1a1Var instanceof m1a1)) {
            if ((d1a1Var instanceof a1a1) || (d1a1Var instanceof b1a1) || (d1a1Var instanceof c1a1) || (d1a1Var instanceof g1a1) || (d1a1Var instanceof f1a1) || (d1a1Var instanceof e1a1) || (d1a1Var instanceof h1a1) || (d1a1Var instanceof i1a1)) {
                return Next.a(Effects.a(new cuo0[]{cuo0Var}));
            }
            return d1a1Var instanceof k1a1 ? Next.a(Effects.a(new kuo0[]{new kuo0(k5a1Var.f)})) : Next.j();
        }
        if (z) {
            List<a0s0> list = k5a1Var.i;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (a0s0 a0s0Var : list) {
                    if (!u890.j(a0s0Var.f, k5a1Var.m) || !a0s0Var.g) {
                    }
                }
            }
            List list2 = ((m1a1) d1a1Var).a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list2) {
                if (((jg61) obj).h) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            a0s0 a0s0VarA2 = k5a1Var.a();
            String str8 = a0s0VarA2 != null ? a0s0VarA2.b : null;
            if (arrayList2.isEmpty() && (str8 == null || str8.length() == 0)) {
                return Next.j();
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str9 = ((jg61) it.next()).d;
                if (str9 == null) {
                    str9 = "";
                }
                arrayList3.add(str9);
            }
            return Next.a(Effects.a(new nuo0[]{new nuo0(arrayList.size(), str8 != null ? str8 : "", arrayList3)}));
        }
        return Next.j();
    }

    public static void D(int i, int i2) {
        String strF;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strF = bpo1.F("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hhg1.n(gvg.l(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strF = bpo1.F("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static void E(int i, int i2) {
        if (i < 0 || i > i2) {
            eg.g(G(i, i2, "index"));
        }
    }

    public static void F(int i, int i2, int i3) {
        String strG;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strG = G(i, i3, "start index");
            } else {
                strG = (i2 < 0 || i2 > i3) ? G(i2, i3, "end index") : bpo1.F("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static String G(int i, int i2, String str) {
        if (i < 0) {
            return bpo1.F("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return bpo1.F("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hhg1.n(gvg.l(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }

    public static final void a(jv6 jv6Var, i8h1 i8h1Var, b0k b0kVar, int i) {
        h311 h311VarV;
        fv6 fv6Var;
        String str = jv6Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(223491012);
        int i2 = (x340Var.g(jv6Var) ? 4 : 2) | i | (x340Var.i(i8h1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            tbr0 tbr0VarC = ((cir0) x340Var.k(k2r0.a)).c();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG = x340Var.g("spotify:artist:" + str);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new zrk0(l1d.m("spotify:artist:", str));
                x340Var.s0(objT2);
            }
            zrk0 zrk0Var = (zrk0) objT2;
            if (jv6Var.d.isEmpty()) {
                x340Var.i0(822040952);
                boolean zI = x340Var.i(ven0Var) | x340Var.i(tbr0VarC);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new nx2(ven0Var, tbr0VarC, (byte) 26);
                    x340Var.s0(objT3);
                }
                qxd0.S((Function0) objT3, x340Var);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    fv6Var = new fv6(jv6Var, i8h1Var, i, (byte) 0);
                }
            } else {
                x340Var.i0(822261982);
                x340Var.r(false);
                Integer num = jv6Var.c;
                List list = jv6Var.d;
                boolean zI2 = x340Var.i(i8h1Var) | x340Var.i(zrk0Var) | x340Var.i(ven0Var) | x340Var.i(tbr0VarC);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    wb6 wb6Var = new wb6(i8h1Var, zrk0Var, ven0Var, tbr0VarC, (byte) 11);
                    x340Var.s0(wb6Var);
                    objT4 = wb6Var;
                }
                vu30 vu30Var = (vu30) objT4;
                boolean zI3 = x340Var.i(i8h1Var) | x340Var.i(zrk0Var) | x340Var.i(ven0Var) | x340Var.i(tbr0VarC);
                Object objT5 = x340Var.T();
                if (zI3 || objT5 == m4cVar) {
                    f80 f80Var = new f80(i8h1Var, zrk0Var, ven0Var, tbr0VarC, (byte) 8);
                    x340Var.s0(f80Var);
                    objT5 = f80Var;
                }
                c(num, list, vu30Var, (Function0) objT5, x340Var, 0);
            }
            h311VarV.d = fv6Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            fv6Var = new fv6(jv6Var, i8h1Var, i, (byte) 1);
            h311VarV.d = fv6Var;
        }
    }

    public static final void b(ven0 ven0Var, tbr0 tbr0Var, d331 d331Var) {
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            return;
        }
        ven0Var.setValue(Boolean.TRUE);
        tbr0Var.a(d331Var);
    }

    public static final void c(Integer num, List list, vu30 vu30Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        long j;
        int i2;
        gbx gbxVar;
        byte b2;
        Integer num2 = num;
        List list2 = list;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(700989557);
        int i3 = i | (x340Var2.g(num2) ? 4 : 2) | (x340Var2.g(list2) ? 32 : 16) | (x340Var2.i(vu30Var) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024);
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("filter_bottom_sheet", qim0Var);
            kiv kivVar = xce0.a;
            qim0 qim0VarH = l6o1.H(zr7.i(qim0VarN, gce0.c), l6o1.C(0, 0, 1, x340Var2), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            String strO0 = cwl1.o0(x340Var2, 2131955980);
            qim0 qim0VarN2 = anm1.N("filter_bottom_sheet_title", qim0Var);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarZ2 = uyn1.z(0.0f, 16.0f, 1, qim0VarN2);
            lee1 lee1Var = cbx.d(x340Var2).k;
            long j2 = cbx.a(x340Var2).b.b;
            int i4 = i3;
            qim0 qim0Var2 = qim0Var;
            boolean z = false;
            uwo1.e(strO0, qim0VarZ2, lee1Var, j2, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
            x340 x340Var3 = x340Var2;
            x340Var3.i0(-1426484931);
            int size = list2.size();
            int i5 = 0;
            while (i5 < size) {
                cb20 cb20Var = (cb20) list2.get(i5);
                boolean zJ = u890.j(cb20Var.b, num2);
                if (zJ) {
                    x340Var3.i0(1933438749);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var3).c.c;
                } else {
                    x340Var3.i0(1933439989);
                    uwr uwrVar3 = cbx.a;
                    j = cbx.a(x340Var3).b.a;
                }
                x340Var3.r(z);
                qim0 qim0Var3 = qim0Var2;
                qim0 qim0VarN3 = anm1.N("filter_option_".concat(cb20Var.a), qim0Var3);
                boolean zH = x340Var3.h(zJ);
                Object objT = x340Var3.T();
                if (zH || objT == m4cVar) {
                    objT = new gy((byte) 6, zJ);
                    x340Var3.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarN3, false, (iu30) objT);
                cvx cvxVar3 = cbx.b(x340Var3).b;
                uvx uvxVar = new uvx(1, (pgx) null, 2, uyn1.h(1, 0.0f, 16.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
                if (zJ) {
                    x340Var3.i0(-192465135);
                    String strO1 = cwl1.o0(x340Var3, 2131955979);
                    i2 = i4;
                    boolean z2 = (i2 & 7168) == 2048;
                    Object objT2 = x340Var3.T();
                    if (z2 || objT2 == m4cVar) {
                        objT2 = new lj2(function0, (byte) 10);
                        x340Var3.s0(objT2);
                    }
                    gbxVar = new gbx(new y50(strO1), (Function0) objT2);
                    b2 = 0;
                    x340Var3.r(false);
                } else {
                    i2 = i4;
                    x340Var3.i0(-192267944);
                    String strN0 = cwl1.n0(2131955978, new Object[]{cb20Var.c}, x340Var3);
                    boolean zG = ((i2 & 896) == 256) | x340Var3.g(cb20Var) | x340Var3.e(i5);
                    Object objT3 = x340Var3.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new wv1((Object) vu30Var, (Object) cb20Var, i5, (byte) 3);
                        x340Var3.s0(objT3);
                    }
                    gbxVar = new gbx(new y50(strN0), (Function0) objT3);
                    b2 = 0;
                    x340Var3.r(false);
                }
                x340 x340Var4 = x340Var3;
                jto1.b(qim0VarB, uvxVar, null, false, null, null, gbxVar, null, null, null, null, null, zJ ? b7i.a : null, null, null, apo.r(1452888469, new gv6(j, cb20Var, b2), x340Var3), x340Var4, 64, 196608, 28604);
                x340Var3 = x340Var4;
                i5++;
                list2 = list;
                qim0Var2 = qim0Var3;
                size = size;
                num2 = num;
                i4 = i2;
                z = false;
            }
            boolean z3 = z;
            qim0 qim0Var4 = qim0Var2;
            x340Var3.r(z3);
            uwr uwrVar4 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var3).b;
            qim0 qim0VarN4 = anm1.N("filter_bottom_sheet_cancel", ab80.o(qim0Var4, 12.0f, x340Var3, qim0Var4, 1.0f));
            boolean z4 = (i4 & 7168) == 2048 ? true : z3;
            Object objT4 = x340Var3.T();
            if (z4 || objT4 == m4cVar) {
                objT4 = new lj2(function0, (byte) 11);
                x340Var3.s0(objT4);
            }
            gbx gbxVar2 = new gbx(z50.c, (Function0) objT4);
            x340 x340Var5 = x340Var3;
            gra graVar = een.h;
            cvx cvxVar5 = cbx.b(x340Var5).b;
            cwl1.b(qim0VarN4, graVar, d4o1.a, (pgx) null, uyn1.h(1, 0.0f, 16.0f), (max) null, false, (idn0) null, (ga80) null, gbxVar2, (gbx) null, b7i.b, x340Var5, 0, 48, 1512);
            x340Var = x340Var5;
            cvx cvxVar6 = cbx.b(x340Var).b;
            x0d.s(qim0Var4, 16.0f, x340Var, true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, (Object) num, (Object) list, (Object) vu30Var, (Object) function0, (byte) 12);
        }
    }

    public static final void d(final Object obj, final int i, final qsb0 qsb0Var, final j2i j2iVar, b0k b0kVar, final int i2) {
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(872548579);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(qsb0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zG = x340Var.g(obj) | x340Var.g(qsb0Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new nsb0(obj, qsb0Var);
                x340Var.s0(objT);
            }
            nsb0 nsb0Var = (nsb0) objT;
            nsb0Var.c = i;
            hrr0 hrr0Var = nsb0Var.g;
            kiv kivVar = i2t0.a;
            nsb0 nsb0Var2 = (nsb0) x340Var.k(kivVar);
            jv91 jv91VarO = ekb.o();
            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
            jv91 jv91VarU = ekb.u(jv91VarO);
            try {
                if (nsb0Var2 != ((nsb0) hrr0Var.getValue())) {
                    hrr0Var.setValue(nsb0Var2);
                    if (nsb0Var.d > 0) {
                        nsb0 nsb0Var3 = nsb0Var.e;
                        if (nsb0Var3 != null) {
                            nsb0Var3.b();
                        }
                        if (nsb0Var2 != null) {
                            nsb0Var2.a();
                        } else {
                            nsb0Var2 = null;
                        }
                        nsb0Var.e = nsb0Var2;
                    }
                }
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                boolean zG2 = x340Var.g(nsb0Var);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new gv20(nsb0Var, (byte) 14);
                    x340Var.s0(objT2);
                }
                qxd0.i(nsb0Var, (iu30) objT2, x340Var);
                mod.b(kivVar.a(nsb0Var), j2iVar, x340Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                throw th;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.osb0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    wmo1.d(obj, i, qsb0Var, j2iVar, (b0k) obj2, czo1.p(i2 | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final void e(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1876477464);
        int i2 = (x340Var.g(qim0Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new td4((byte) 16);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
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
            h311VarV.d = new klb((byte) 6, i, j2iVar, qim0Var);
        }
    }

    public static final void f(i2c i2cVar, ArrayList arrayList, jkr0 jkr0Var, boolean z, cmt cmtVar, String str, String str2, db60 db60Var, slx0 slx0Var, kjp kjpVar, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        String str3;
        String str4;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(446983441);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(arrayList) : b0kVar3.i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(jkr0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= b0kVar3.h(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(cmtVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            str3 = str;
            i2 |= b0kVar3.g(str3) ? 131072 : 65536;
        } else {
            str3 = str;
        }
        if ((1572864 & i) == 0) {
            str4 = str2;
            i2 |= b0kVar3.g(str4) ? 1048576 : 524288;
        } else {
            str4 = str2;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? b0kVar3.g(db60Var) : b0kVar3.i(db60Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? b0kVar3.g(slx0Var) : b0kVar3.i(slx0Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= b0kVar3.i(kjpVar) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 306783379) != 306783378)) {
            wat watVar = (wat) b0kVar3.k(t4k.h);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar3.i0(54374998);
            mta mtaVar = cbx.b(b0kVar3).d;
            int iI0 = watVar.i0(32.0f);
            b0kVar3.r(false);
            boolean zG = b0kVar3.g(watVar) | b0kVar3.e(iI0);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = bb00.h(iI0, b0kVar3);
            }
            err0 err0Var = (hdn0) objT;
            float fM0 = watVar.M0(err0Var.s());
            float f = zjy.p(0.0f, new p3v((i2cVar.c() - fM0) - 16.0f)).a;
            float fD = i2cVar.d();
            float fMin = Math.min(i2cVar.d() * 0.74f, f * 0.5625f);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            szd szdVar = new szd(fMin, 16.0f - ((0.14999998f * fMin) / 2.0f), (fD - fMin) / 2.0f);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = kjpVar.a();
                b0kVar3.s0(objT2);
            }
            boolean z3 = z2;
            b0kVar2 = b0kVar3;
            qmo1.e(jkr0Var, szdVar, u291.c(nim0.a, 1.0f), null, apo.r(1942792882, new bc60(jkr0Var, arrayList, z3, db60Var, slx0Var, (gc60) objT2, str3, cmtVar, str4, err0Var, fM0), b0kVar3), b0kVar2, ((i3 >> 6) & 14) | 24576, 8);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cc60(i2cVar, arrayList, jkr0Var, z, cmtVar, str, str2, db60Var, slx0Var, kjpVar, i);
        }
    }

    public static final void g(fkz0 fkz0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-923865413);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(fkz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new j9z0(iu30Var, (byte) 5);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(null, null, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, apo.r(-426054414, new ikz0(fkz0Var, (byte) 0), b0kVar3), null, null, null, null, null, apo.r(539470839, new ikz0(fkz0Var, (byte) 1), b0kVar3), b0kVar2, 805306368, 196608, 32191);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(fkz0Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void h(gc60 gc60Var, fc60 fc60Var, int i, jkr0 jkr0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1105313030);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(gc60Var) : x340Var.i(gc60Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? x340Var.g(fc60Var) : x340Var.i(fc60Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(jkr0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.i(qim0Var) ? 131072 : 65536;
        }
        int i4 = 0;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean z2 = i == ((err0) jkr0Var.d.c).s();
            uwr uwrVar = cbx.a;
            int iT = jfv.t(cbx.c(x340Var).b.c, ngv.d);
            ceo ceoVar = ((jhx) cbx.c(x340Var).a.b).b;
            x340Var.i0(-1348884925);
            wat watVar = (wat) x340Var.k(t4k.h);
            cvx cvxVar = cbx.b(x340Var).b;
            float fX0 = watVar.X0(8.0f);
            x340Var.r(false);
            float f = z2 ? 1.0f : 0.0f;
            if (!z) {
                iT = 0;
            }
            if (z2 && z) {
                i4 = 150;
            }
            tob1 tob1VarB = z95.b(f, new pxg1(iT, i4, ceoVar), "shareButton", (iu30) null, x340Var, 3072, 20);
            boolean zI = x340Var.i(tob1VarB) | x340Var.d(fX0);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new na5(fX0, tob1VarB, (byte) 1);
                x340Var.s0(objT);
            }
            otw.c(gc60Var, fc60Var, i541.C(qim0Var, (iu30) objT), (ipb1) null, x340Var, (i3 & 14) | 72 | (i3 & 112), 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lkf(gc60Var, fc60Var, i, jkr0Var, z, qim0Var, i2);
        }
    }

    public static final void i(wi90 wi90Var, int i, boolean z, float f, boolean z2, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2134067115);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(wi90Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.h(z2) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            String strC = f4i1.c(i, "tilted-image-rotation-");
            float[] fArr = a[i];
            float f2 = fArr[0];
            float f3 = fArr[1];
            ilv.a.getClass();
            ven0 ven0VarR = zod.R(new hsi1(strC, Float.valueOf(f2), Float.valueOf(f3), new pxg1(666, (i + 1) * 83, flv.f), rno1.a), z, (Function0) null, x340Var, 8 | ((i4 >> 3) & 112), 4);
            yj41 yj41Var = wi90Var.b;
            yk4 yk4Var = new yk4(yj41Var.a);
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            gqb gqbVar = yj41Var.c;
            float f4 = f - (gqbVar != null ? gqbVar.b : 0.0f);
            qim0 qim0VarD = nim0.a;
            if (z2) {
                qim0VarD = i541.D(qim0VarD, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Number) ven0VarR.getValue()).floatValue(), 0L, null, false, 0L, 0L, 0, null, 1048319);
            }
            eso1.f(yk4Var, isl.a, v8r.j(qim0VarD, yj41Var.c), new p3v(f4), (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 24624, 448);
            x340Var = x340Var;
            qim0Var2 = qim0VarD;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r9f1(wi90Var, i, z, f, z2, qim0Var2, i2);
        }
    }

    public static final void j(float f, int i, int i2, int i3, b0k b0kVar, wi90 wi90Var, qim0 qim0Var, boolean z, boolean z2) {
        boolean z3;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1892701899);
        j06 j06Var = ((x340) b0kVar2).a;
        int i4 = i3 | (b0kVar2.i(wi90Var) ? 4 : 2) | (b0kVar2.e(i) ? 32 : 16) | (b0kVar2.d(f) ? 256 : 128) | (b0kVar2.h(z) ? 2048 : 1024) | (b0kVar2.e(i2) ? 16384 : 8192) | (b0kVar2.h(z2) ? 131072 : 65536) | (b0kVar2.g(qim0Var) ? 1048576 : 524288);
        if (b0kVar2.Y(i4 & 1, (599187 & i4) != 599186)) {
            String strC = f4i1.c(i, "Top-five-item-tilted-");
            ilv.a.getClass();
            ven0 ven0VarR = zod.R(new hsi1(strC, Float.valueOf(1.0f), Float.valueOf(0.0f), new pxg1(666, (i + 1) * 83, flv.b), rno1.a), z, (Function0) null, b0kVar2, ((i4 >> 6) & 112) | 8, 4);
            float f2 = ((Number) ven0VarR.getValue()).floatValue() < 1.0f ? 1.0f : 0.0f;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            fra fraVar = een.N0;
            b0kVar2.i0(2115393237);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v7f1.X;
                b0kVar2.s0(objT);
            }
            qim0 qim0VarB = uyn1.B(u291.f(s161.b(qim0Var, true, (iu30) objT), 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            nim0 nim0Var = nim0.a;
            if (z2) {
                boolean zG = b0kVar2.g(ven0VarR);
                Object objT2 = b0kVar2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new ry71(ven0VarR, (byte) 25);
                    b0kVar2.s0(objT2);
                }
                eqr0.B(nim0Var, (iu30) objT2);
                boolean zD = b0kVar2.d(f2);
                Object objT3 = b0kVar2.T();
                if (zD || objT3 == m4cVar) {
                    z3 = false;
                    objT3 = new waf1((byte) 0, f2);
                    b0kVar2.s0(objT3);
                } else {
                    z3 = false;
                }
                qim0VarB = qim0VarB.then(i541.C(nim0Var, (iu30) objT3));
            } else {
                z3 = false;
            }
            b0kVar2.r(z3);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z4 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qgo1.f(omo1.q((vnr0) wi90Var.a.invoke(b0kVar2, 0), cbx.d(b0kVar2).c, cbx.d(b0kVar2).b, b0kVar2), u291.v(nim0Var, ((wat) b0kVar2.k(t4k.h)).M0(i2)), null, 1, false, null, b0kVar2, 3080, 52);
            wnb0 wnb0Var = new wnb0(0.75f, true);
            mbh mbhVarA = jbh.a(h36.e, een.P0, b0kVar2, 6);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            qgo1.f(omo1.q((vnr0) wi90Var.c.invoke(b0kVar2, 0), lee1.a(cbx.d(b0kVar2).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(b0kVar2).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), b0kVar2), null, new a0e1(5), 2, false, null, b0kVar2, 3080, 50);
            b0kVar2 = b0kVar2;
            vnr0 vnr0Var = (vnr0) wi90Var.d.invoke(b0kVar2, 0);
            if (vnr0Var == null || ihc1.y0(vnr0Var.a)) {
                vnr0Var = null;
            }
            if (vnr0Var == null) {
                b0kVar2.i0(-2044833068);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-2044833067);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                qgo1.f(omo1.q(vnr0Var, lee1.a(kk0.p(nim0Var, 4.0f, b0kVar2, b0kVar2).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(b0kVar2).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), b0kVar2), null, new a0e1(5), 2, false, null, b0kVar2, 3080, 50);
                b0kVar2 = b0kVar2;
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            int i5 = i4 >> 3;
            i(wi90Var, i, z, f, z2, null, b0kVar2, (i4 & 126) | (i5 & 896) | ((i4 << 3) & 7168) | (i5 & 57344));
            ab80.p(nim0Var, 2.0f, b0kVar2, true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r9f1(wi90Var, i, f, z, i2, z2, qim0Var, i3);
        }
    }

    public static qim0 k(qim0 qim0Var, idn0 idn0Var, boolean z, gbx gbxVar, gbx gbxVar2, int i) {
        gbx gbxVar3 = (i & 8) != 0 ? null : gbxVar2;
        String str = gbxVar.c;
        String str2 = gbxVar3 != null ? gbxVar3.c : null;
        Function0 function0 = gbxVar3 != null ? gbxVar3.b : null;
        xzu xzuVar = gbxVar.b;
        if (xzuVar == null) {
            xzuVar = xzu.X0;
        }
        return qim0Var.then(bin.y(nim0.a, idn0Var, null, z, str, null, str2, function0, xzuVar, 256));
    }

    public static final boolean l(Uri uri) {
        return u890.j(uri.getScheme(), "file") || u890.j(uri.getScheme(), "content");
    }

    public static final void m(Object obj, al61 al61Var) {
        if (al61Var instanceof xk61) {
            Logger.e(((xk61) al61Var).a, "Failed to handle event: %s", new Object[]{obj});
        } else if (al61Var.equals(yk61.a)) {
            Logger.k("Failed to handle event: %s, no active Jam", new Object[]{obj});
        } else {
            if (al61Var.equals(zk61.a)) {
                return;
            }
            eg.o();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final nma0 n(kl1 kl1Var, tka0 tka0Var) throws SerializationException {
        nma0 nma0VarO = kl1Var.o(z6x.a, tka0Var);
        if (nma0VarO != null) {
            return nma0VarO;
        }
        String strR = tka0Var.r();
        if (strR == null) {
            strR = "<local class name not available>";
        }
        throw new SerializationException(f4i1.f("Serializer for class '", strR, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    public static final nma0 o(tka0 tka0Var, ArrayList arrayList, Function0 function0) {
        au50 r36Var;
        au50 v811Var;
        jd11 jd11Var = rc11.a;
        if (tka0Var.equals(jd11Var.b(Collection.class)) || tka0Var.equals(jd11Var.b(List.class)) || tka0Var.equals(jd11Var.b(List.class)) || tka0Var.equals(jd11Var.b(ArrayList.class))) {
            r36Var = new r36((nma0) arrayList.get(0), (byte) 0);
        } else if (tka0Var.equals(jd11Var.b(HashSet.class))) {
            r36Var = new au50((nma0) arrayList.get(0));
        } else if (tka0Var.equals(jd11Var.b(Set.class)) || tka0Var.equals(jd11Var.b(Set.class)) || tka0Var.equals(jd11Var.b(LinkedHashSet.class))) {
            r36Var = new r36((nma0) arrayList.get(0), (byte) 1);
        } else if (tka0Var.equals(jd11Var.b(HashMap.class))) {
            r36Var = new yt50((nma0) arrayList.get(0), (nma0) arrayList.get(1));
        } else if (tka0Var.equals(jd11Var.b(Map.class)) || tka0Var.equals(jd11Var.b(Map.class)) || tka0Var.equals(jd11Var.b(LinkedHashMap.class))) {
            r36Var = new nlc0((nma0) arrayList.get(0), (nma0) arrayList.get(1));
        } else {
            if (tka0Var.equals(jd11Var.b(Map.Entry.class))) {
                v811Var = new hng0((nma0) arrayList.get(0), (nma0) arrayList.get(1), (byte) 0);
            } else if (tka0Var.equals(jd11Var.b(mmr0.class))) {
                v811Var = new hng0((nma0) arrayList.get(0), (nma0) arrayList.get(1), (byte) 1);
            } else if (tka0Var.equals(jd11Var.b(yvg1.class))) {
                r36Var = new zvg1((nma0) arrayList.get(0), (nma0) arrayList.get(1), (nma0) arrayList.get(2));
            } else if (((wdg) tka0Var).n().isArray()) {
                v811Var = new v811((tka0) function0.invoke(), (nma0) arrayList.get(0));
            } else {
                r36Var = null;
            }
            r36Var = v811Var;
        }
        if (r36Var != null) {
            return r36Var;
        }
        nma0[] nma0VarArr = (nma0[]) arrayList.toArray(new nma0[0]);
        nma0[] nma0VarArr2 = (nma0[]) Arrays.copyOf(nma0VarArr, nma0VarArr.length);
        return syo1.k(((wdg) tka0Var).n(), (nma0[]) Arrays.copyOf(nma0VarArr2, nma0VarArr2.length));
    }

    public static final void p(ajq0 ajq0Var, jbh0 jbh0Var, String str, xu30 xu30Var) {
        h9n h9nVar = new h9n(xu30Var, (byte) 0);
        r95 r95Var = (r95) ajq0Var.e;
        mg30 mg30Var = (mg30) ajq0Var.b;
        ro30 ro30Var = mg30Var.a;
        rr10 rr10Var = new rr10(h9nVar, (byte) 14);
        fc3 fc3Var = new fc3(mg30Var, (byte) 8);
        r95Var.a(jbh0Var, new o860((Scheduler) ro30Var.b, new cb60((Object) ro30Var, (Object) str, (Object) rr10Var, (Object) fc3Var, (byte) 7), str, m830.c1, (byte) 9));
    }

    public static final void q(ajq0 ajq0Var, jbh0 jbh0Var, String str, xu30 xu30Var) {
        ajq0Var.J(jbh0Var, str, new h9n(xu30Var, (byte) 0));
    }

    public static final long r(hob1 hob1Var) {
        Long l;
        Long l2;
        lsm0 lsm0Var;
        sbw0 sbw0Var = hob1Var.y;
        jsm0 jsm0Var = (sbw0Var == null || (lsm0Var = sbw0Var.d) == null) ? null : lsm0Var.e;
        long jLongValue = (jsm0Var == null || (l2 = jsm0Var.b) == null) ? 0L : l2.longValue();
        return jLongValue <= 0 ? hob1Var.z + ((jsm0Var == null || (l = jsm0Var.a) == null) ? 0L : l.longValue()) : jLongValue;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final nma0 s(kl1 kl1Var, oma0 oma0Var) throws SerializationException {
        nma0 nma0VarU = u(kl1Var, oma0Var, true);
        if (nma0VarU != null) {
            return nma0VarU;
        }
        String strR = j0o1.u(oma0Var).r();
        if (strR == null) {
            strR = "<local class name not available>";
        }
        throw new SerializationException(f4i1.f("Serializer for class '", strR, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final nma0 t(tka0 tka0Var) throws SerializationException {
        nma0 nma0VarV = v(tka0Var);
        if (nma0VarV != null) {
            return nma0VarV;
        }
        String strR = tka0Var.r();
        if (strR == null) {
            strR = "<local class name not available>";
        }
        throw new SerializationException(f4i1.f("Serializer for class '", strR, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cf A[RETURN] */
    public static final nma0 u(kl1 kl1Var, oma0 oma0Var, boolean z) {
        nma0 nma0VarB;
        tcv0 tcv0VarO;
        tcv0 tcv0Var;
        tka0 tka0VarU = j0o1.u(oma0Var);
        boolean zI = oma0Var.i();
        List listV = oma0Var.v();
        ArrayList arrayList = new ArrayList(q7h.U(listV, 10));
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            oma0 oma0Var2 = ((tma0) it.next()).b;
            if (oma0Var2 == null) {
                bhn0.s(oma0Var2, "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(oma0Var2);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        z6x z6xVar = z6x.a;
        if (zIsEmpty) {
            if (syo1.w(tka0VarU) && kl1Var.o(z6xVar, tka0VarU) != null) {
                nma0VarB = null;
            } else if (zI) {
                nma0VarB = h761.b.b(tka0VarU);
            } else {
                nma0VarB = h761.a.b(tka0VarU);
                if (nma0VarB == null) {
                    nma0VarB = null;
                }
            }
        } else if (kl1Var.a) {
            nma0VarB = null;
        } else {
            Object objD = !zI ? h761.c.d(tka0VarU, arrayList) : h761.d.d(tka0VarU, arrayList);
            if (objD instanceof m231) {
                objD = null;
            }
            nma0VarB = (nma0) objD;
        }
        if (nma0VarB != null) {
            return nma0VarB;
        }
        if (arrayList.isEmpty()) {
            tcv0VarO = v(tka0VarU);
            if (tcv0VarO == null && (tcv0VarO = kl1Var.o(z6xVar, tka0VarU)) == null) {
                if (syo1.w(tka0VarU)) {
                    tcv0Var = new tcv0(tka0VarU);
                    tcv0VarO = tcv0Var;
                } else {
                    tcv0VarO = null;
                }
            }
            if (tcv0VarO != null) {
                if (zI) {
                    return m5n1.z(tcv0VarO);
                }
                return tcv0VarO;
            }
        } else {
            ArrayList arrayListW = w(kl1Var, arrayList, z);
            if (arrayListW != null) {
                tcv0 tcv0VarO2 = o(tka0VarU, arrayListW, new ww21(arrayList, (byte) 8));
                if (tcv0VarO2 == null) {
                    tcv0VarO = kl1Var.o(arrayListW, tka0VarU);
                    if (tcv0VarO == null) {
                        if (syo1.w(tka0VarU)) {
                            tcv0Var = new tcv0(tka0VarU);
                            tcv0VarO = tcv0Var;
                        } else {
                            tcv0VarO = null;
                        }
                    }
                } else {
                    tcv0VarO = tcv0VarO2;
                }
                if (tcv0VarO != null) {
                    if (zI) {
                        return m5n1.z(tcv0VarO);
                    }
                    return tcv0VarO;
                }
            }
        }
        return null;
    }

    public static final nma0 v(tka0 tka0Var) {
        nma0 nma0VarK = syo1.k(((wdg) tka0Var).n(), (nma0[]) Arrays.copyOf(new nma0[0], 0));
        return nma0VarK == null ? (nma0) vnw0.a.get(tka0Var) : nma0VarK;
    }

    public static final ArrayList w(kl1 kl1Var, List list, boolean z) {
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(s(kl1Var, (oma0) it.next()));
            }
            return arrayList;
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            nma0 nma0VarU = u(kl1Var, (oma0) it2.next(), false);
            if (nma0VarU == null) {
                return null;
            }
            arrayList2.add(nma0VarU);
        }
        return arrayList2;
    }

    public static final af5 x(int i, String str, vu30 vu30Var, b0k b0kVar, int i2) {
        String strN0 = cwl1.n0(i, new Object[]{"[PLACEHOLDER]"}, b0kVar);
        int iW0 = ihc1.w0(strN0, "[PLACEHOLDER]", 0, false, 6);
        ye5 ye5Var = new ye5();
        ye5Var.f(strN0.subSequence(0, iW0));
        vu30Var.invoke(ye5Var, str);
        ye5Var.f(strN0.subSequence(iW0 + 13, strN0.length()));
        return ye5Var.p();
    }

    public static final af5 y(int i, int i2, String str, zma1 zma1Var, iu30 iu30Var, b0k b0kVar, int i3) {
        if ((i3 & 8) != 0) {
            zma1Var = null;
        }
        return z(i, cwl1.o0(b0kVar, i2), str, zma1Var, iu30Var, b0kVar);
    }

    public static final af5 z(int i, String str, String str2, zma1 zma1Var, iu30 iu30Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        boolean zI = x340Var.i(zma1Var) | x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new bhc1(zma1Var, str2, iu30Var, (byte) 0);
            x340Var.s0(objT);
        }
        return x(i, str, (vu30) objT, x340Var, 0);
    }
}
