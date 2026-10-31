package p;

import android.content.Intent;
import android.graphics.PointF;
import android.os.Bundle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class kbb implements vbb {
    public static final String[] a = {"Various", "Various Artists", "Various Artist", "Various Artists.", "Various Artistes"};
    public static b180 b;
    public static b180 c;

    public static final yv30 A(lf30 lf30Var) {
        if (!lf30Var.d() || lf30Var.c()) {
            return null;
        }
        zv30 zv30VarA = aw30.c.a(lf30Var.g().b(), lf30Var.i().b());
        if (zv30VarA != null) {
            return zv30VarA.a;
        }
        return null;
    }

    public static final ContextTrack B(PlayerState playerState) {
        Object objH = playerState.track().h();
        ContextTrack contextTrack = (ContextTrack) objH;
        Object obj = null;
        if (contextTrack == null || !l4o1.H(contextTrack)) {
            objH = null;
        }
        ContextTrack contextTrack2 = (ContextTrack) objH;
        if (contextTrack2 != null) {
            return contextTrack2;
        }
        b380 b380VarPrevTracks = playerState.prevTracks();
        ListIterator listIterator = b380VarPrevTracks.listIterator(b380VarPrevTracks.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            ContextTrack contextTrack3 = (ContextTrack) objPrevious;
            contextTrack3.getClass();
            if (l4o1.H(contextTrack3)) {
                obj = objPrevious;
                break;
            }
        }
        return (ContextTrack) obj;
    }

    public static final a8b0 C(a8b0 a8b0Var) {
        H(a8b0Var);
        if (a8b0Var.getAnnotations().F(rfb1.p) == null) {
            return null;
        }
        return ((e1h1) a8b0Var.r0().get(q(a8b0Var))).b();
    }

    public static final List D(a8b0 a8b0Var) {
        H(a8b0Var);
        List listR0 = a8b0Var.r0();
        return listR0.subList(((!H(a8b0Var) || a8b0Var.getAnnotations().F(rfb1.p) == null) ? 0 : 1) + q(a8b0Var), listR0.size() - 1);
    }

    public static final boolean E(mvv0 mvv0Var) {
        boolean zG;
        List<ow50> list = mvv0Var.b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ow50 ow50Var : list) {
                if (ow50Var instanceof ow50) {
                    zG = G(ow50Var.c);
                } else if (ow50Var instanceof ktv0) {
                    htv0 htv0Var = ((ktv0) ow50Var).n;
                    zG = htv0Var != null && G(htv0Var.b);
                } else if (ow50Var instanceof aq50) {
                    List list2 = ((aq50) ow50Var).e;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                htv0 htv0Var2 = ((ktv0) it.next()).n;
                                if (htv0Var2 == null || !G(htv0Var2.b)) {
                                }
                            }
                        }
                    }
                }
                if (zG) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ArrayList F(List list, List list2, float f) {
        Object ekc1Var;
        Object ekc1Var2;
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            if (i < 0 || i >= list.size()) {
                ekc1 ekc1Var3 = (ekc1) o7h.C0(list);
                if (ekc1Var3 == null) {
                    ekc1Var3 = (ekc1) o7h.q0(list2);
                }
                int i2 = ekc1Var3.a;
                float f2 = ekc1Var3.c;
                ekc1Var = new ekc1(0.0f, f2, f2, i2);
            } else {
                ekc1Var = list.get(i);
            }
            ekc1 ekc1Var4 = (ekc1) ekc1Var;
            if (i < 0 || i >= list2.size()) {
                ekc1 ekc1Var5 = (ekc1) o7h.C0(list2);
                if (ekc1Var5 == null) {
                    ekc1Var5 = (ekc1) o7h.q0(list);
                }
                int i3 = ekc1Var5.a;
                float f3 = ekc1Var5.c;
                ekc1Var2 = new ekc1(0.0f, f3, f3, i3);
            } else {
                ekc1Var2 = list2.get(i);
            }
            ekc1 ekc1Var6 = (ekc1) ekc1Var2;
            int i4 = ekc1Var6.a;
            float f4 = ekc1Var4.b;
            float fE = l1d.e(ekc1Var6.b, f4, f, f4);
            float f5 = ekc1Var4.c;
            float fE2 = l1d.e(ekc1Var6.c, f5, f, f5);
            float f6 = ekc1Var4.d;
            arrayList.add(new ekc1(fE, fE2, l1d.e(ekc1Var6.d, f6, f, f6), i4));
        }
        return arrayList;
    }

    public static final boolean G(doc docVar) {
        String str = docVar.b;
        if (str != null && !ihc1.y0(str)) {
            return true;
        }
        String str2 = docVar.c;
        return (str2 == null || ihc1.y0(str2)) ? false : true;
    }

    public static final boolean H(a8b0 a8b0Var) {
        yv30 yv30VarA;
        jfg jfgVarS = a8b0Var.t0().s();
        if (jfgVarS == null) {
            return false;
        }
        if ((jfgVarS instanceof beg) && g6b0.K(jfgVarS)) {
            int i = kht.a;
            yv30VarA = A(iht.f(jfgVarS));
        } else {
            yv30VarA = null;
        }
        return u890.j(yv30VarA, uv30.d) || u890.j(yv30VarA, xv30.d);
    }

    public static boolean I(Intent intent) {
        return ila0.s(intent, "child_credentials", hwe0.class) != null;
    }

    public static x0m0 J(String str, String str2) {
        return new x0m0(str, str2);
    }

    public static final List K(List list, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-854608327);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(list);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(list);
            x340Var.s0(objT2);
        }
        ven0 ven0Var2 = (ven0) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT3);
        }
        ven0 ven0Var3 = (ven0) objT3;
        Object objT4 = x340Var.T();
        if (objT4 == m4cVar) {
            objT4 = c97.b(1.0f);
            x340Var.s0(objT4);
        }
        o95 o95Var = (o95) objT4;
        Object objT5 = x340Var.T();
        if (objT5 == m4cVar) {
            objT5 = v8r.q(true);
            x340Var.s0(objT5);
        }
        ven0 ven0Var4 = (ven0) objT5;
        boolean zBooleanValue = ((Boolean) ven0Var4.getValue()).booleanValue();
        ven0Var4.setValue(true);
        if (!zBooleanValue) {
            ven0Var.setValue(list);
            ven0Var2.setValue(list);
            ven0Var3.setValue(Boolean.FALSE);
        }
        if (!list.equals((List) ven0Var2.getValue())) {
            ven0Var.setValue(((Number) o95Var.e()).floatValue() < 1.0f ? F((List) ven0Var.getValue(), (List) ven0Var2.getValue(), ((Number) o95Var.e()).floatValue()) : (List) ven0Var2.getValue());
            ven0Var2.setValue(list);
            ven0Var3.setValue(Boolean.valueOf((!zBooleanValue || ((List) ven0Var.getValue()).isEmpty() || list.isEmpty()) ? false : true));
        }
        List list2 = (List) ven0Var2.getValue();
        boolean zI = x340Var.i(o95Var);
        Object objT6 = x340Var.T();
        if (zI || objT6 == m4cVar) {
            objT6 = new wt(o95Var, ven0Var3, null, (byte) 17);
            x340Var.s0(objT6);
        }
        qxd0.s(list2, true, (vu30) objT6, x340Var);
        float fFloatValue = (!((Boolean) ven0Var3.getValue()).booleanValue() || ((Number) o95Var.e()).floatValue() < 1.0f) ? ((Number) o95Var.e()).floatValue() : 0.0f;
        if (!zBooleanValue || fFloatValue >= 1.0f) {
            x340Var.r(false);
            return list;
        }
        ArrayList arrayListF = F((List) ven0Var.getValue(), (List) ven0Var2.getValue(), fFloatValue);
        x340Var.r(false);
        return arrayListF;
    }

    public static Next L(kak0 kak0Var) {
        return Next.h(kak0.a(kak0Var, ndm0.a, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575));
    }

    public static final void a(String str, String str2, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(83926837);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new us21(function0, (byte) 2);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT);
            int i3 = i2;
            foo1.c(gbxVar, new idx(), (qim0) null, (max) null, yla.r(x340Var), (vzq0) null, (idn0) null, (ga80) null, vdj.b, (vu30) null, apo.r(585390112, new p9y0(str, (byte) 28), x340Var), x340Var, 805306368, 48, 1500);
            boolean z2 = (i3 & 7168) == 2048;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new us21(function1, (byte) 3);
                x340Var.s0(objT2);
            }
            foo1.c(new gbx(z50Var, (Function0) objT2), ldx.c, (qim0) null, (max) null, yla.r(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1732983031, new p9y0(str2, (byte) 29), x340Var), x340Var, 0, 48, 2012);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(str, str2, function0, function1, qim0Var, i, (byte) 27);
        }
    }

    public static final void b(rk2 rk2Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        j2i j2iVarR;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-140580940);
        int i2 = i | (x340Var.g(rk2Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarZ = u291.z(u291.c(nim0.a, 1.0f), een.N0, 2);
            if (rk2Var.h != 0) {
                x340Var.i0(-453292544);
                j2iVarR = apo.r(1110534999, new mk2(function1, rk2Var), x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-453026440);
                x340Var.r(false);
                j2iVarR = null;
            }
            j82.s(function2, qim0VarZ, (vu30) null, j2iVarR, (r891) null, (bke1) null, apo.r(1051732828, new mk2(rk2Var, function0), x340Var), x340Var, ((i2 >> 9) & 14) | 1573248, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, rk2Var, function0, function1, function2, (byte) 22);
        }
    }

    public static final void c(String str, long j, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1453688816);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ncf0 ncf0VarG = h5p1.G(new pcf0(str), str, (xu30) null, x340Var, 57344 & (i3 << 12), 46);
            PointF pointF = ndf0.a;
            ddf0 ddf0VarS = e130.s(new edf0[]{e130.t(1, Integer.valueOf(z4p1.G(j)), new String[]{"bolt", "**"}, x340Var, 6)}, x340Var);
            int i4 = i3 >> 3;
            mp10.e(ncf0VarG.c(), grn1.v(ncf0VarG.c(), z, x340Var, i4 & 112), qim0Var, false, false, false, (xc21) null, false, ddf0VarS, een.h, mif1.P0, false, false, (Map) null, (jj7) null, false, x340Var, (i4 & 896) | 134217728, 0, 63736);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iz80(str, j, z, qim0Var, i);
        }
    }

    public static final void d(dok0 dok0Var, float f, pmg1 pmg1Var, qim0 qim0Var, boolean z, g7f0 g7f0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        h311 h311VarV;
        z8b z8bVar;
        qim0 qim0Var3;
        int i2;
        z6x z6xVar;
        long j;
        int iCeil;
        x6b x6bVar;
        x6b x6bVar2;
        m4c m4cVar = fkj0.X;
        cok0 cok0Var = dok0Var.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1152558099);
        int i3 = i | (b0kVar3.i(dok0Var) ? 32 : 16) | (b0kVar3.d(f) ? 256 : 128) | (b0kVar3.g(pmg1Var) ? 2048 : 1024) | 24576 | (b0kVar3.h(z) ? 131072 : 65536) | (b0kVar3.g((Object) null) ? 1048576 : 524288) | (b0kVar3.i(g7f0Var) ? 8388608 : 4194304);
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                qim0Var3 = nim0.a;
            } else {
                b0kVar3.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar3.s();
            l7f0 l7f0Var = g7f0Var.a;
            z6x z6xVar2 = z6x.a;
            z6x z6xVar3 = (l7f0Var == null || (x6bVar2 = l7f0Var.b) == null) ? z6xVar2 : x6bVar2.a;
            uaa0 uaa0Var = dok0Var.l;
            z6x z6xVar4 = (uaa0Var == null || (x6bVar = uaa0Var.b) == null) ? z6xVar2 : x6bVar.a;
            ruq0 ruq0Var = cok0Var.a.b;
            azb azbVar = cok0Var.b;
            boolean z2 = cok0Var.o;
            int iY = w3p1.y(wyb.a, azbVar, z2);
            int iY2 = w3p1.y(vyb.a, azbVar, z2);
            boolean z3 = (((Collection) z6xVar3).isEmpty() || iY == 3) ? false : true;
            boolean z4 = (((Collection) z6xVar4).isEmpty() || iY2 == 3) ? false : true;
            float fO = o(z3, "loopingAlphaAnimation", b0kVar3);
            float fO2 = o(z4, "jogwheelAlphaAnimation", b0kVar3);
            if (fO == 0.0f && fO2 == 0.0f) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    z8bVar = new z8b(dok0Var, f, pmg1Var, qim0Var3, z, g7f0Var, i, (byte) 0);
                }
            } else {
                float f2 = 0.0f;
                List listK = K(z6xVar3, b0kVar3, 0);
                List listK2 = K(z6xVar4, b0kVar3, 2);
                z6x z6xVar5 = z6xVar3;
                long jK = f5p1.k(b0kVar3, 2131102365);
                long jK2 = f5p1.k(b0kVar3, 2131102363);
                float fP = pqo.p(ruq0Var, cok0Var.B);
                boolean z5 = z3 && !z;
                b0kVar3.i0(1732312765);
                boolean z6 = z4;
                boolean z7 = z6xVar5.size() == 1;
                if (fP > 0.0f) {
                    Iterator it = ((Iterable) z6xVar5).iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        ekc1 ekc1Var = (ekc1) it.next();
                        Iterator it2 = it;
                        float f3 = ekc1Var.b / fP;
                        float f4 = z7 ? 1.0f : ekc1Var.d;
                        if (f3 > 0.0f) {
                            j = jK2;
                            iCeil = ((int) Math.ceil((f4 - ekc1Var.c) / f3)) - 1;
                            if (iCeil < 0) {
                            }
                            i4 += iCeil;
                            it = it2;
                            jK2 = j;
                        } else {
                            j = jK2;
                        }
                        iCeil = 0;
                        i4 += iCeil;
                        it = it2;
                        jK2 = j;
                    }
                    i2 = i4;
                } else {
                    i2 = 0;
                }
                long j2 = jK2;
                if (i2 <= 0) {
                    b0kVar3.r(false);
                    z6xVar = z6xVar2;
                    listK2 = listK2;
                } else {
                    Object objT = b0kVar3.T();
                    if (objT == m4cVar) {
                        objT = c97.b(0.0f);
                        b0kVar3.s0(objT);
                    }
                    o95 o95Var = (o95) objT;
                    Integer numValueOf = Integer.valueOf(z5 ? i2 : 0);
                    boolean zI = b0kVar3.i(o95Var) | b0kVar3.h(z5) | b0kVar3.e(i2);
                    Object objT2 = b0kVar3.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new qe5(o95Var, z5, i2, (lnm) null);
                        b0kVar3.s0(objT2);
                    }
                    qxd0.t(numValueOf, b0kVar3, (vu30) objT2);
                    float fFloatValue = ((Number) o95Var.e()).floatValue();
                    z6x arrayList = new ArrayList(i2);
                    int i5 = 0;
                    while (i5 < i2) {
                        float f5 = i2;
                        float f6 = i5 / f5;
                        i5++;
                        float f7 = fFloatValue;
                        arrayList.add(Float.valueOf(yoi1.o((f7 - f6) / ((i5 / f5) - f6), f2, 1.0f)));
                        fFloatValue = f7;
                        f2 = 0.0f;
                    }
                    b0kVar3.r(false);
                    z6xVar = arrayList;
                }
                qim0 qim0VarS = u291.s(h2c.a.a(qim0Var3, een.h), ((wat) b0kVar3.k(t4k.h)).N0(pmg1Var.a), f);
                int i6 = i3 & 7168;
                boolean z8 = i6 == 2048;
                Object objT3 = b0kVar3.T();
                if (z8 || objT3 == m4cVar) {
                    objT3 = new a9b(pmg1Var, (byte) 0);
                    b0kVar3.s0(objT3);
                }
                qim0 qim0VarZ = uyn1.z(0.0f, ((0.15f * f) * 3.0f) / 4.0f, 1, i541.C(qim0VarS, (iu30) objT3));
                boolean zH = (i6 == 2048) | b0kVar3.h(z3) | ((i3 & 458752) == 131072) | b0kVar3.h(false) | b0kVar3.d(fO) | b0kVar3.d(fP) | b0kVar3.i(z6xVar5);
                qim0 qim0Var4 = qim0Var3;
                boolean z9 = z3;
                boolean zE = b0kVar3.e(l1d.C(iY)) | zH | b0kVar3.f(jK) | b0kVar3.g(z6xVar) | b0kVar3.i(listK) | b0kVar3.d(fO2);
                List list = listK2;
                boolean zE2 = b0kVar3.e(l1d.C(iY2)) | zE | b0kVar3.i(list) | b0kVar3.f(j2) | b0kVar3.h(z6);
                Object objT4 = b0kVar3.T();
                if (zE2 || objT4 == m4cVar) {
                    b9b b9bVar = new b9b(pmg1Var, z9, z, fO, fP, z6xVar5, jK, z6xVar, listK, iY, fO2, list, j2, z6, iY2);
                    b0kVar2 = b0kVar3;
                    b0kVar2.s0(b9bVar);
                    objT4 = b9bVar;
                } else {
                    b0kVar2 = b0kVar3;
                }
                j0o1.b(0, b0kVar2, (iu30) objT4, qim0VarZ);
                qim0Var2 = qim0Var4;
            }
            h311VarV.d = z8bVar;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        qim0Var2 = qim0Var;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            z8bVar = new z8b(dok0Var, f, pmg1Var, qim0Var2, z, g7f0Var, i, (byte) 1);
            h311VarV.d = z8bVar;
        }
    }

    public static final void e(String str, long j, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1276751793);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ncf0 ncf0VarG = h5p1.G(new pcf0(str), str, (xu30) null, x340Var2, 57344 & (i3 << 12), 46);
            PointF pointF = ndf0.a;
            ddf0 ddf0VarS = e130.s(new edf0[]{e130.t(1, Integer.valueOf(z4p1.G(j)), new String[]{"**", "Bolt", "**"}, x340Var2, 6)}, x340Var2);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            nim0 nim0Var = nim0.a;
            mp10.f(ncf0VarG.c(), u291.h(nim0Var, 48.0f), false, false, (bcf0) null, 0, ddf0VarS, (tl3) null, mif1.Q0, x340Var2, 0, 4096, 2056188);
            qim0 qim0VarA = h2c.a.a(nim0Var, een.g);
            ldx ldxVar = ldx.c;
            gdx gdxVarR = yla.r(x340Var2);
            boolean z = (i3 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new us21(function0, (byte) 4);
                x340Var2.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarA, (max) null, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, vdj.a, x340Var2, 0, 6, 984);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q18(str, j, function0, qim0Var, i);
        }
    }

    public static final void f(lye0 lye0Var, na9 na9Var, iye0 iye0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1481177748);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lye0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(na9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(iye0Var) : x340Var.i(iye0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            k2t0 k2t0VarV = kkn.v(ti5.g(x340Var), x340Var);
            irn1.u(bmq0.L(nim0.a, k2t0VarV.c, (g6o0) null), apo.r(312020679, new cb60(lye0Var, iye0Var, k2t0VarV, iu30Var, (byte) 28), x340Var), (vu30) null, (erl1) null, apo.r(715206797, new c9y(iu30Var, lye0Var, l6o1.C(0, 0, 1, x340Var), na9Var, (byte) 10), x340Var), x340Var, 24624, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, lye0Var, na9Var, iye0Var, iu30Var, (byte) 19);
        }
    }

    public static final void g(String str, lee1 lee1Var, long j, long j2, float f, b0k b0kVar, int i) {
        int i2;
        float f2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1750454897);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lee1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.f(j2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            lee1 lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, new phc1(6.0f, 0.0f, 0, 1, (uw4) null, 22), 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16760831);
            uwr uwrVar = cbx.a;
            yfu yfuVar = ajx.a;
            gxo1.c(str, (qim0) null, lee1VarA, j2, (a0e1) null, 0, false, (djc0) null, (qx8) null, 150.0f, (FontWeight) ((bjx) yfuVar.c).f, (iu30) null, x340Var, i3 & 7182, 0, 2546);
            int i4 = i3 << 3;
            gxo1.c(str, (qim0) null, lee1Var, j, (a0e1) null, 0, false, (djc0) null, (qx8) null, 150.0f, (FontWeight) ((bjx) yfuVar.c).f, (iu30) null, x340Var, (i3 & 14) | (i4 & 896) | (i4 & 7168), 0, 2546);
            x340Var = x340Var;
            x340Var.r(true);
            f2 = 6.0f;
        } else {
            x340Var.b0();
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ax60(str, lee1Var, j, j2, f2, i);
        }
    }

    public static final void h(wzv0 wzv0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1942966958);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wzv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            boolean zI = x340Var.i(c9nVar) | x340Var.i(wzv0Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new v721(c9nVar, wzv0Var, iu30Var, (byte) 11);
                x340Var.s0(objT2);
            }
            cso1.k(wzv0Var, (iac0) null, (iu30) objT2, x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(wzv0Var, iu30Var, i, (byte) 12);
        }
    }

    public static final void i(d631 d631Var, boolean z, wzv0 wzv0Var, iu30 iu30Var, Function0 function0, Function0 function1, iu30 iu30Var2, Function0 function2, b0k b0kVar, int i) {
        int i2;
        d631 d631Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(290707679);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(d631Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(wzv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(function2) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            if (d631Var.w.length() > 0) {
                x340Var.i0(1818757009);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT);
                }
                c9n c9nVar = (c9n) objT;
                boolean zI = x340Var.i(c9nVar) | x340Var.i(iu30Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new qb90(c9nVar, iu30Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                cso1.k(rih1.a, (iac0) null, (iu30) objT2, x340Var, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(1818897315);
                x340Var.r(false);
            }
            int i4 = i3 >> 6;
            h(wzv0Var, iu30Var2, x340Var, (i4 & 14) | ((i3 >> 15) & 112));
            long jA = d631Var.f.a();
            uwr uwrVar = cbx.a;
            int i5 = (i3 << 3) & 896;
            int i6 = i5 | 6;
            float fU = grn1.u(700, irn1.o0(400, 0, ((jhx) cbx.c(x340Var).a.b).b, 2), z, x340Var, i6);
            xpv0 xpv0Var = cbx.c(x340Var).c;
            float fU2 = grn1.u(1500, irn1.l0(pto1.q(2000, 1, 120.0f), 2000.0f, (Object) null, 4), z, x340Var, i6);
            float fU3 = grn1.u(2300, irn1.o0((int) jfv.h(cbx.c(x340Var).b.c), 0, ((jhx) cbx.c(x340Var).a.b).b, 2), z, x340Var, i6);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), yah.a, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            c(d631Var.t, jA, z, u291.d(nim0Var, 1.0f), x340Var, i5);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarD, lhc.g(x340Var).f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
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
            e(d631Var.u, jA, function0, uyn1.x(u291.f(nim0Var, 1.0f), 24.0f), x340Var, i4 & 896);
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            qim0 qim0VarH = l6o1.H(uyn1.z(24.0f, 0.0f, 2, u291.f(nim0Var, 1.0f)), es41VarC, false, 14);
            mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarH);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            j(d631Var, jA, grn1.o(grn1.y(nim0Var, fU, 0.85f), fU), x340Var, i3 & 14);
            d631Var2 = d631Var;
            op71.g(x340Var, u291.h(nim0Var, 60.0f));
            m(0, d631Var2.m, d631Var2.n, x340Var, grn1.o(grn1.y(nim0Var, fU2, 0.25f), fU2));
            op71.g(x340Var, u291.h(nim0Var, 48.0f));
            a(d631Var2.o, d631Var2.r, function1, function2, grn1.o(grn1.z(fU3), fU3), x340Var, ((i3 >> 9) & 896) | ((i3 >> 12) & 7168));
            x340Var = x340Var;
            x340Var.r(true);
            if (es41VarC.f.s() > 0) {
                x340Var.i0(-1099930522);
                rrn1.r(es41VarC, u291.c(h2c.a.a(nim0Var, een.i), 1.0f), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1099777723);
                x340Var.r(false);
            }
            us71.m(x340Var, true, true, true);
        } else {
            d631Var2 = d631Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(d631Var2, z, wzv0Var, iu30Var, function0, function1, iu30Var2, function2, i);
        }
    }

    public static final void j(d631 d631Var, long j, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        d631 d631Var2;
        Function0 function0;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1661009750);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(d631Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(new d36(32.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z) {
                x340Var.l(function2);
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
            String str = d631Var.j;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            long j2 = yah.a;
            int i3 = i2;
            uwo1.e(str, (qim0) null, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, j2, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var, 0, 0, 1778);
            mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function2;
                x340Var.l(function0);
            } else {
                function0 = function2;
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.O0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            d631Var2 = d631Var;
            String strValueOf = String.valueOf(d631Var2.b);
            lee1 lee1Var2 = cbx.d(x340Var).c;
            yfu yfuVar = ajx.a;
            int i4 = (i3 << 6) & 7168;
            Function0 function3 = function0;
            gxo1.c(strValueOf, (qim0) null, lee1Var2, j, (a0e1) null, 0, false, (djc0) null, (qx8) null, 150.0f, (FontWeight) ((bjx) yfuVar.c).f, (iu30) null, x340Var, i4, 0, 2546);
            g(f4i1.c(d631Var2.c, " / "), cbx.d(x340Var).c, j2, j, 0.0f, x340Var, i4 | 384);
            x340Var.r(true);
            gxo1.c(d631Var2.g.toUpperCase(uct0.a.i().b().a), (qim0) null, cbx.d(x340Var).c, j, new a0e1(3), 0, false, new cjc0(2), (qx8) null, 0.0f, (FontWeight) ((bjx) yfuVar.c).f, (iu30) null, x340Var, i4, 0, 2914);
            x340Var.r(true);
            mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                function1 = function3;
                x340Var.l(function1);
            } else {
                function1 = function3;
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            jlx jlxVar = jlx.c;
            long j3 = cbx.a(x340Var).c.b;
            int i5 = jlx.d | 48;
            Function0 function4 = function1;
            isl islVar = isl.a;
            w0h1.a(jlxVar, islVar, (qim0) null, j3, 0L, false, x340Var, i5, 52);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            uwo1.e(d631Var2.k, (qim0) null, lee1.a(cbx.d(x340Var).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, j2, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1786);
            op71.g(x340Var, u291.v(nim0Var, 4.0f));
            uwo1.e(ab80.m(d631Var2.d, d631Var2.e, "/"), (qim0) null, lee1.a(cbx.d(x340Var).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, j2, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1778);
            x340Var.r(true);
            jw31 jw31VarA3 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode6 = Long.hashCode(x340Var.T);
            xos0 xos0VarM6 = x340Var.m();
            qim0 qim0VarE6 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function4);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA3, x340Var, lljVar);
            nko1.H(xos0VarM6, x340Var, lljVar2);
            x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE6, x340Var, lljVar4);
            w0h1.a(dtx.c, islVar, (qim0) null, cbx.a(x340Var).c.b, 0L, false, x340Var, dtx.d | 48, 52);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            uwo1.e(d631Var2.l, (qim0) null, lee1.a(cbx.d(x340Var).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, j2, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), 0L, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1786);
            op71.g(x340Var, u291.v(nim0Var, 4.0f));
            uwo1.e(d631Var2.h, (qim0) null, lee1.a(cbx.d(x340Var).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, j2, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1778);
            x340Var = x340Var;
            us71.m(x340Var, true, true, true);
        } else {
            d631Var2 = d631Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new je3(d631Var2, j, qim0Var, i, (byte) 8);
        }
    }

    public static final void k(int i, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1692067288);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ia9(i, (byte) 4);
                x340Var.s0(objT);
            }
            hdn0 hdn0Var = (hdn0) k5p1.s(objArr, (Function0) objT, x340Var, 0);
            Integer numValueOf = Integer.valueOf(i);
            boolean zI = x340Var.i(hdn0Var) | (i4 == 4) | x340Var.i(iu30Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                zi3 zi3Var = new zi3(i, iu30Var, hdn0Var, (lnm) null, (byte) 15);
                x340Var.s0(zi3Var);
                objT2 = zi3Var;
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ajh((byte) 2, i, i2, iu30Var);
        }
    }

    public static final void l(c380 c380Var, boolean z, int i, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1301221728);
        int i3 = i2 | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            String strO0 = cwl1.o0(x340Var, 2131956005);
            boolean zI = x340Var.i(xtb0VarA);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new l8t0(xtb0VarA, (lnm) null, (byte) 12);
                x340Var.s0(objT);
            }
            k(i, (iu30) objT, x340Var, (i3 >> 6) & 14);
            boolean zG = x340Var.g(strO0);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new pg61(strO0, (byte) 23);
                x340Var.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, false, (iu30) objT2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 16.0f, 8.0f);
            boolean z2 = ((i3 & 112) == 32) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objT3 = x340Var.T();
            if (z2 || objT3 == m4cVar) {
                gh1 gh1Var = new gh1(z, c380Var, (cv30) function0, iu30Var, (byte) 29);
                x340Var.s0(gh1Var);
                objT3 = gh1Var;
            }
            too1.b(qim0VarB, xtb0VarA, zzq0Var, (iu30) objT3, x340Var, 0, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pta0(c380Var, z, i, iu30Var, function0, qim0Var2, i2);
        }
    }

    public static final void m(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        x340 x340Var2;
        int i2;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-480189936);
        int i3 = i | (x340Var3.g(str) ? 4 : 2) | (x340Var3.g(str2) ? 32 : 16) | (x340Var3.i(qim0Var) ? 256 : 128);
        if (x340Var3.Y(i3 & 1, (i3 & 147) != 146)) {
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.Q0, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0Var);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            if (ihc1.y0(str)) {
                x340Var2 = x340Var3;
                i2 = 3;
                x340Var2.i0(397124348);
                x340Var2.r(false);
            } else {
                x340Var3.i0(396913889);
                uwr uwrVar = cbx.a;
                i2 = 3;
                uwo1.e(str, (qim0) null, lee1.a(cbx.d(x340Var3).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, yah.a, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), 0L, new a0e1(3), (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var3, i3 & 14, 0, 1770);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            uwr uwrVar2 = cbx.a;
            x340 x340Var4 = x340Var2;
            uwo1.e(str2, (qim0) null, lee1.a(cbx.d(x340Var2).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, yah.a, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), 0L, new a0e1(i2), (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var4, (i3 >> 3) & 14, 0, 1770);
            x340Var = x340Var4;
            x340Var.r(true);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c4(str, str2, qim0Var, i, (byte) 28);
        }
    }

    public static final rze1 n(boolean z) {
        return z ? rze1.a : rze1.b;
    }

    public static final float o(boolean z, String str, b0k b0kVar) {
        float f = z ? 1.0f : 0.0f;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = c9b.a;
            x340Var.s0(objT);
        }
        return ((Number) z95.b(f, irn1.o0(250, 0, new e9b((nla0) objT, (byte) 0), 2), str, (iu30) null, x340Var, 3072, 20).getValue()).floatValue();
    }

    public static Bundle p(boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("arg_pses_pre_fetched", z);
        bundle.putBoolean("arg_show_spinner_immediately", z2);
        return bundle;
    }

    public static final int q(a8b0 a8b0Var) {
        pf5 pf5VarF = a8b0Var.getAnnotations().F(rfb1.q);
        if (pf5VarF == null) {
            return 0;
        }
        return ((Number) ((sgl) ((sgl) sqg0.G(sfb1.e, pf5VarF.a()))).a).intValue();
    }

    public static final qx81 r(g6b0 g6b0Var, fg5 fg5Var, a8b0 a8b0Var, List list, ArrayList arrayList, a8b0 a8b0Var2, boolean z) {
        beg begVarL;
        fg5 hg5Var = rzs0.g;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (a8b0Var != null ? 1 : 0) + 1);
        List list2 = list;
        ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new f1h1(1, (a8b0) it.next()));
        }
        arrayList2.addAll(arrayList3);
        h4p1.d(arrayList2, a8b0Var != null ? new f1h1(1, a8b0Var) : null);
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList2.add(new f1h1(1, (a8b0) obj));
            i = i2;
        }
        arrayList2.add(new f1h1(1, a8b0Var2));
        int size = list.size() + arrayList.size() + (a8b0Var == null ? 0 : 1);
        if (z) {
            begVarL = g6b0Var.w(size);
        } else {
            ajn0 ajn0Var = sfb1.a;
            begVarL = g6b0Var.l("Function" + size);
        }
        if (a8b0Var != null) {
            kf30 kf30Var = rfb1.p;
            if (!fg5Var.d0(kf30Var)) {
                ArrayList arrayListM0 = o7h.M0(fg5Var, new qbc(g6b0Var, kf30Var, b7x.a));
                fg5Var = arrayListM0.isEmpty() ? hg5Var : new hg5(arrayListM0, (byte) 0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            kf30 kf30Var2 = rfb1.q;
            if (!fg5Var.d0(kf30Var2)) {
                ArrayList arrayListM1 = o7h.M0(fg5Var, new qbc(g6b0Var, kf30Var2, Collections.singletonMap(sfb1.e, new zr80(size2))));
                if (!arrayListM1.isEmpty()) {
                    hg5Var = new hg5(arrayListM1, (byte) 0);
                }
                fg5Var = hg5Var;
            }
        }
        return y3o1.h0(prn1.w(fg5Var), begVarL, arrayList2);
    }

    public static final void s(DrawScope drawScope, List list, long j, float f, float f2, float f3, boolean z, float f4, float f5) {
        ekc1 ekc1Var = (ekc1) o7h.s0(list);
        if (ekc1Var == null) {
            return;
        }
        float f6 = ekc1Var.c;
        float f7 = f6 * f;
        float f8 = (ekc1Var.d - f6) * f;
        if (f8 <= 0.0f) {
            return;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
        DrawScope.g0(drawScope, u7h.b(j, f3 * 0.4f, 0.0f, 0.0f, 0.0f, 14), (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), jFloatToRawIntBits, (DrawStyle) null, 0.0f, 0, 240);
        if (z) {
            DrawScope.g0(drawScope, u7h.b(j, f3, 0.0f, 0.0f, 0.0f, 14), (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), jFloatToRawIntBits, new phc1(f5, 0.0f, 0, 0, (uw4) null, 30), 0.0f, 0, 224);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0122  */
    public static final void t(DrawScope drawScope, List list, long j, float f, float f2, float f3, float f4, float f5, List list2) {
        int iCeil;
        int i;
        float f6;
        int i2;
        int i3;
        float f7;
        float f8;
        drawScope = drawScope;
        int i4 = 1;
        boolean z = list.size() == 1;
        float f9 = f4 * 0.1f;
        float f10 = 1.0f;
        float fX0 = drawScope.X0(1.0f);
        float fX1 = drawScope.X0(8.0f);
        Iterator it = list.iterator();
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            i5++;
            ekc1 ekc1Var = (ekc1) it.next();
            float f11 = ekc1Var.b;
            float f12 = ekc1Var.c;
            float f13 = f11 / f;
            float f14 = z ? f10 : ekc1Var.d;
            int i7 = i5 == list.size() - i4 ? i4 : 0;
            if (f13 <= 0.0f || (iCeil = ((int) Math.ceil((f14 - f12) / f13)) - i4) < 0) {
                iCeil = 0;
            }
            float f15 = f13 * f2;
            float f16 = f15 > fX1 ? fX0 / 2.0f : 0.0f;
            if (i4 <= iCeil) {
                int i8 = i4;
                while (true) {
                    float fFloatValue = ((Number) ((i6 < 0 || i6 >= list2.size()) ? Float.valueOf(f10) : list2.get(i6))).floatValue();
                    i = i6 + 1;
                    if (fFloatValue > 0.0f) {
                        float f17 = (((i8 * f13) + f12) * f2) + f16;
                        if (i7 != 0) {
                            f8 = f15 - (f16 * 2.0f);
                        } else {
                            f8 = f15 - (f16 * 2.0f);
                            float f18 = (f14 * f2) - f17;
                            if (f8 > f18) {
                                f8 = f18;
                            }
                        }
                        if (f8 > 0.0f) {
                            float fMin = Math.min(f5, 0.3f * f8);
                            i2 = iCeil;
                            f7 = f12;
                            i3 = i8;
                            f6 = 1.0f;
                            DrawScope.g0(drawScope, u7h.b(j, f9 * fFloatValue, 0.0f, 0.0f, 0.0f, 14), (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (((long) Float.floatToRawIntBits(f8)) << 32), (((long) Float.floatToRawIntBits(fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMin)) << 32), (DrawStyle) null, 0.0f, 0, 240);
                        } else {
                            f6 = f10;
                            i2 = iCeil;
                            i3 = i8;
                            f7 = f12;
                        }
                    } else {
                        f6 = f10;
                        i2 = iCeil;
                        i3 = i8;
                        f7 = f12;
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i8 = i3 + 1;
                    drawScope = drawScope;
                    f12 = f7;
                    iCeil = i2;
                    i6 = i;
                    f10 = f6;
                }
                i4 = 1;
                i6 = i;
                f10 = f6;
            }
        }
    }

    public static final void u(DrawScope drawScope, List list, long j, float f, float f2, float f3, float f4, boolean z, boolean z2, float f5, float f6) {
        float f7 = 0.0f;
        int i = 0;
        float f8 = f5;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (Object obj : (list.size() <= 1 || !z2) ? list : Collections.singletonList(o7h.q0(list))) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            ekc1 ekc1Var = (ekc1) obj;
            float f11 = ekc1Var.c * f2;
            float f12 = (ekc1Var.b / f) * f2;
            float fMin = Math.min(f5, f12 * 0.3f);
            if (i == 0) {
                f10 = f12;
                f9 = f11;
                f8 = fMin;
            }
            v(drawScope, u7h.b(j, f4 * 0.3f, 0.0f, 0.0f, 0.0f, 14), u7h.b(j, f4 * 0.1f, 0.0f, 0.0f, 0.0f, 14), (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L), (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMin)) & 4294967295L), f2, z520.a);
            f7 = f7;
            i = i2;
        }
        float f13 = f7;
        if (z) {
            v(drawScope, u7h.b(j, f4, 0.0f, 0.0f, 0.0f, 14), u7h.b(j, f4 * 0.1f, 0.0f, 0.0f, 0.0f, 14), (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), f2, new phc1(f6, 0.0f, 0, 0, (uw4) null, 30));
        }
    }

    public static final void v(DrawScope drawScope, long j, long j2, long j3, long j4, long j5, float f, DrawStyle drawStyle) {
        if (Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32)) <= f) {
            DrawScope.g0(drawScope, j, j3, j4, j5, drawStyle, 0.0f, 0, 224);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
        cab cabVarA1 = drawScope.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).k(0.0f, 0.0f, f, fIntBitsToFloat, 1);
            DrawScope.g0(drawScope, j, j3, j4, j5, drawStyle, 0.0f, 0, 224);
            cabVarA1.p().i();
            cabVarA1.D(jU);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L));
            cab cabVarA2 = drawScope.a1();
            long jU2 = cabVarA2.u();
            cabVarA2.p().q();
            try {
                ((dg8) cabVarA2.b).k(f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, 1);
                DrawScope.g0(drawScope, j2, j3, j4, j5, drawStyle, 0.0f, 0, 224);
            } finally {
                i3a.n(cabVarA2, jU2);
            }
        } catch (Throwable th) {
            i3a.n(cabVarA1, jU);
            throw th;
        }
    }

    public static final boolean w(int i, int i2) {
        return i == i2;
    }

    public static final ajn0 x(a8b0 a8b0Var) {
        String str;
        pf5 pf5VarF = a8b0Var.getAnnotations().F(rfb1.r);
        if (pf5VarF != null) {
            Object objW0 = o7h.W0(pf5VarF.a().values());
            ghc1 ghc1Var = objW0 instanceof ghc1 ? (ghc1) objW0 : null;
            if (ghc1Var != null && (str = (String) ((sgl) ghc1Var).a) != null) {
                if (!ajn0.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return ajn0.e(str);
                }
            }
        }
        return null;
    }

    public static final String y(g0l g0lVar) {
        String strD;
        inr inrVar = (inr) g0lVar;
        l0l l0lVarC = inrVar.c();
        if (l0lVarC != null && (strD = l0lVarC.d()) != null) {
            return strD;
        }
        nnr nnrVarK = inrVar.k();
        if (nnrVarK != null) {
            return nnrVarK.d;
        }
        for (l0l l0lVar : inrVar.i()) {
            if (l0lVar.l()) {
                return l0lVar.d();
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    public static final List z(a8b0 a8b0Var) {
        H(a8b0Var);
        int iQ = q(a8b0Var);
        if (iQ == 0) {
            return z6x.a;
        }
        List listSubList = a8b0Var.r0().subList(0, iQ);
        ArrayList arrayList = new ArrayList(q7h.U(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((e1h1) it.next()).b());
        }
        return arrayList;
    }
}
