package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.FacebookException;
import com.google.protobuf.Duration;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class lro1 {
    public static b180 a;

    public static final Next A(ncf ncfVar, q1f q1fVar) {
        h7q0 h7q0Var = ncfVar.S0;
        h7q0 h7q0Var2 = h7q0Var instanceof h7q0 ? h7q0Var : null;
        if (h7q0Var2 == null) {
            return Next.j();
        }
        apl aplVar = h7q0Var2.a;
        wol wolVar = aplVar instanceof wol ? (wol) aplVar : null;
        if (wolVar == null) {
            return Next.j();
        }
        return !u890.j(wolVar.a, q1fVar.a) ? Next.j() : Next.h(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, new h7q0(wol.a(wolVar, q1fVar.b, 5)), false, null, false, null, null, null, null, false, null, null, -262145, 7));
    }

    public static final Next B(r1f r1fVar) {
        return Next.a(Effects.a(new dye[]{new dye(r1fVar.a)}));
    }

    public static final Next C(ncf ncfVar) {
        ncf ncfVarA = ncf.a(ncfVar, null, acf.a(ncfVar.e, (ArrayList) null, 3), null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -17, 7);
        goe goeVar = ncfVar.a;
        return Next.i(ncfVarA, Effects.a(new gxe[]{new gxe(goeVar.a, ncfVar.b.a, goeVar.c.g())}));
    }

    public static final Next D(ncf ncfVar) {
        return Next.h(ncf.a(ncfVar, null, acf.a(ncfVar.e, (ArrayList) null, 5), null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -17, 7));
    }

    public static final Next E(ncf ncfVar) {
        return Next.i(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2097153, 7), Effects.a(new axe[]{new axe(ncfVar.a.a)}));
    }

    public static final Next F(ncf ncfVar, w1f w1fVar) {
        return Next.i(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2097153, 7), Effects.a(new nye[]{new lye(w1fVar.a), new axe(ncfVar.a.a)}));
    }

    public static final Next G(ncf ncfVar, x1f x1fVar) {
        boolean z = ncfVar.V0;
        boolean z2 = x1fVar.a;
        return z == z2 ? Next.j() : Next.h(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, null, z2, null, false, null, null, null, null, false, null, null, -2097153, 7));
    }

    public static final Next H(ncf ncfVar, y1f y1fVar) {
        return Next.h(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, null, false, y1fVar.a, false, null, null, null, null, false, null, null, -4194305, 7));
    }

    public static final Next I(ncf ncfVar, z1f z1fVar) {
        Object next;
        mg31 mg31Var;
        String str;
        mg31 mg31Var2;
        String str2 = z1fVar.a;
        h7q0 h7q0Var = ncfVar.S0;
        String str3 = null;
        h7q0 h7q0Var2 = h7q0Var instanceof h7q0 ? h7q0Var : null;
        if (h7q0Var2 == null) {
            return Next.j();
        }
        ppl pplVar = h7q0Var2.a;
        ppl pplVar2 = pplVar instanceof ppl ? pplVar : null;
        if (pplVar2 == null) {
            return Next.j();
        }
        List list = pplVar2.b;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            mg31Var2 = ((opl) next).c;
        } while (!u890.j(mg31Var2 != null ? mg31Var2.b : null, str2));
        opl oplVar = (opl) next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            mg31 mg31Var3 = ((opl) obj).c;
            if (!u890.j(mg31Var3 != null ? mg31Var3.b : null, str2)) {
                arrayList.add(obj);
            }
        }
        t7q0 h7q0Var3 = arrayList.isEmpty() ? null : new h7q0(ppl.a(pplVar2, arrayList, 5));
        if (oplVar != null && (mg31Var = oplVar.c) != null && (str = mg31Var.a) != null && !str.equals(str2)) {
            str3 = str;
        }
        Set setB0 = dm61.B0(new String[]{str2, str3});
        Map map = ncfVar.Z0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!setB0.contains((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((List) entry2.getValue()).isEmpty()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return Next.i(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, h7q0Var3, false, null, false, linkedHashMap2, null, null, null, false, null, null, -33816577, 7), Collections.singleton(new zwe(o7h.l1(setB0))));
    }

    public static final Next J(ncf ncfVar, b2f b2fVar) {
        long j = b2fVar.b;
        if (!(ncfVar.g instanceof kcf)) {
            return Next.j();
        }
        List list = b2fVar.a;
        String strValueOf = String.valueOf(j);
        String strL = l1d.l(j, "spotify:ugcimage:");
        List<a2f> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (a2f a2fVar : list2) {
            arrayList.add(new opl(strL, a2fVar.c, new mg31(a2fVar.b, a2fVar.a, 0, 0, 0L, a2fVar.d, a2fVar.e)));
        }
        ppl pplVar = new ppl(strL, arrayList, false);
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (a2f a2fVar2 : list2) {
            arrayList2.add(new jxe(a2fVar2.c, a2fVar2.d, a2fVar2.e, a2fVar2.a, a2fVar2.b));
        }
        return ncfVar.b1 ? Next.i(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, new h7q0(pplVar), false, null, false, null, strValueOf, null, null, false, null, null, -67371009, 7), Effects.a(new kxe[]{new kxe(ncfVar.h(), strValueOf, arrayList2)})) : Next.h(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, new h7q0(pplVar), false, null, false, null, null, null, null, false, null, null, -262145, 7));
    }

    public static final Next K(ncf ncfVar, d2f d2fVar) {
        Object obj;
        Object next;
        if (!ncfVar.b()) {
            return Next.j();
        }
        String str = d2fVar.a;
        long j = d2fVar.b;
        Iterator it = ncfVar.a.f.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((tom) next).a, str));
        tom tomVar = (tom) next;
        if (tomVar == null) {
            return Next.j();
        }
        if (!u890.j(tomVar.g, qom.a)) {
            return Next.j();
        }
        for (Object obj2 : tomVar.h) {
            if (u890.j(((gxz0) obj2).c.a, ncfVar.b.a)) {
                obj = obj2;
                break;
            }
        }
        gxz0 gxz0Var = (gxz0) obj;
        return gxz0Var == null ? m(str, new gxz0(String.valueOf(j), "❤️", ncfVar.b, 0L, 24), ncfVar) : j0(str, gxz0Var, ncfVar);
    }

    public static final Next L(ncf ncfVar, l2f l2fVar) {
        Object obj;
        Object next;
        String str = l2fVar.a;
        String str2 = l2fVar.b;
        String str3 = ncfVar.b.a;
        long j = l2fVar.c;
        goe goeVar = ncfVar.a;
        Iterator it = goeVar.f.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((tom) next).a, str));
        tom tomVar = (tom) next;
        if (tomVar == null) {
            return Next.j();
        }
        for (Object obj2 : tomVar.h) {
            if (u890.j(((gxz0) obj2).c.a, str3)) {
                obj = obj2;
                break;
            }
        }
        gxz0 gxz0Var = (gxz0) obj;
        if (gxz0Var == null) {
            return m(str, new gxz0(String.valueOf(j), str2, ncfVar.b, 0L, 24), ncfVar);
        }
        String str4 = gxz0Var.b;
        if (u890.j(str4, str2)) {
            return j0(str, gxz0Var, ncfVar);
        }
        if (u890.j(str4, str2)) {
            return Next.j();
        }
        gxz0 gxz0Var2 = new gxz0(String.valueOf(j), str2, ncfVar.b, 0L, 24);
        return Next.i(ncf.a(ncfVar, goe.a(goeVar, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o(goeVar.f, new w8c(str, (byte) 24), new w9f(gxz0Var, gxz0Var2, (byte) 3)), 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7), Effects.a(new yxe[]{new yxe(goeVar.a, str, gxz0Var2, ncfVar.e1)}));
    }

    public static final Next M(ncf ncfVar, d3f d3fVar) {
        return Next.h(ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o(ncfVar.a.f, new raf(d3fVar, (byte) 0), new raf(d3fVar, (byte) 1)), 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7));
    }

    public static final Next N(ncf ncfVar, e3f e3fVar) {
        return Next.h(ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o(ncfVar.a.f, new saf(e3fVar, (byte) 0), new taf(e3fVar, ncfVar, (byte) 1)), 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7));
    }

    public static final Next O(ncf ncfVar, m2f m2fVar) {
        Object next;
        String str = m2fVar.a;
        Iterator it = ncfVar.a.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((tom) next).a, str));
        tom tomVar = (tom) next;
        List list = tomVar != null ? tomVar.h : null;
        if (list == null) {
            list = z6x.a;
        }
        return list.isEmpty() ? Next.j() : Next.a(Effects.a(new fxe[]{new fxe(str, list, m2fVar.b)}));
    }

    public static final Next P(ncf ncfVar, n2f n2fVar) {
        Object next;
        String str = n2fVar.a;
        goe goeVar = ncfVar.a;
        Iterator it = goeVar.f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((tom) next).a, str));
        tom tomVar = (tom) next;
        if (tomVar == null || u890.j(tomVar.c.a, ncfVar.b.a)) {
            return Next.j();
        }
        lpl lplVar = tomVar.f;
        lpl lplVar2 = lplVar instanceof lpl ? lplVar : null;
        String str2 = lplVar2 != null ? lplVar2.a : null;
        if (str2 == null) {
            str2 = "";
        }
        return Next.a(Effects.a(new zxe[]{new zxe(goeVar.a, str, str2, n2fVar.b)}));
    }

    public static final Next Q(ncf ncfVar, p2f p2fVar) {
        goe goeVar = ncfVar.a;
        return Next.h(ncf.a(ncfVar, goe.a(goeVar, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o(goeVar.f, new uaf(p2fVar, (byte) 0), new uaf(p2fVar, (byte) 1)), 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7));
    }

    public static final Next R(ncf ncfVar, r2f r2fVar) {
        mcf mcfVar = ncfVar.g;
        goe goeVar = ncfVar.a;
        if (!(mcfVar instanceof hcf)) {
            if (u890.j(mcfVar, kcf.a)) {
                return Next.i(ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o(goeVar.f, new vaf(r2fVar, (byte) 1), nve.Y), 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7), Effects.a(new pxe[]{new pxe(goeVar.a, r2fVar.a)}));
            }
            return Next.j();
        }
        hcf hcfVar = (hcf) mcfVar;
        List listO = o(goeVar.f, new vaf(r2fVar, (byte) 0), nve.X);
        List list = goeVar.e;
        btf btfVar = goeVar.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!u890.j(((jwm) obj).a.a, ncfVar.b.a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((jwm) it.next()).a.a);
        }
        bcf bcfVar = hcfVar.a;
        if (bcfVar instanceof fcf) {
            ncf ncfVarA = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, listO, 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7);
            String str = r2fVar.a;
            tom tomVar = ((fcf) bcfVar).b;
            btf btfVar2 = btfVar instanceof btf ? btfVar : null;
            return Next.i(ncfVarA, Effects.a(new ywe[]{new ywe(btfVar2 != null ? btfVar2.a : null, arrayList2, str, hcfVar.c, tomVar)}));
        }
        if (bcfVar instanceof bcf) {
            ncf ncfVarA2 = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, listO, 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7);
            String str2 = r2fVar.a;
            tom tomVar2 = bcfVar.b;
            btf btfVar3 = btfVar instanceof btf ? btfVar : null;
            return Next.i(ncfVarA2, Effects.a(new wwe[]{new wwe(btfVar3 != null ? btfVar3.a : null, arrayList2, str2, hcfVar.c, tomVar2)}));
        }
        if (bcfVar instanceof dcf) {
            ncf ncfVarA3 = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, listO, 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7);
            String str3 = r2fVar.a;
            dcf dcfVar = (dcf) bcfVar;
            tom tomVar3 = dcfVar.b;
            tom tomVar4 = dcfVar.c;
            btf btfVar4 = btfVar instanceof btf ? btfVar : null;
            return Next.i(ncfVarA3, Effects.a(new vwe[]{new vwe(btfVar4 != null ? btfVar4.a : null, arrayList2, str3, hcfVar.c, tomVar3, tomVar4)}));
        }
        if (bcfVar instanceof ccf) {
            ncf ncfVarA4 = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, listO, 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7);
            String str4 = r2fVar.a;
            ccf ccfVar = (ccf) bcfVar;
            tom tomVar5 = ccfVar.b;
            tom tomVar6 = ccfVar.c;
            btf btfVar5 = btfVar instanceof btf ? btfVar : null;
            return Next.i(ncfVarA4, Effects.a(new uwe[]{new uwe(btfVar5 != null ? btfVar5.a : null, arrayList2, str4, hcfVar.c, tomVar5, tomVar6)}));
        }
        if (!(bcfVar instanceof ecf)) {
            eg.o();
            return null;
        }
        ncf ncfVarA5 = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, listO, 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7);
        String str5 = r2fVar.a;
        tom tomVar7 = ((ecf) bcfVar).b;
        btf btfVar6 = btfVar instanceof btf ? btfVar : null;
        return Next.i(ncfVarA5, Effects.a(new xwe[]{new xwe(btfVar6 != null ? btfVar6.a : null, arrayList2, str5, hcfVar.c, tomVar7)}));
    }

    public static final Next S(ncf ncfVar, s2f s2fVar) {
        Object obj;
        Object next;
        List list;
        String str = s2fVar.a;
        goe goeVar = ncfVar.a;
        Iterator it = goeVar.f.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((tom) next).a, str));
        tom tomVar = (tom) next;
        if (tomVar != null && (list = tomVar.h) != null) {
            for (Object obj2 : list) {
                if (u890.j(((gxz0) obj2).a, s2fVar.b)) {
                    obj = obj2;
                    break;
                }
            }
            gxz0 gxz0Var = (gxz0) obj;
            if (gxz0Var != null) {
                return Next.a(Effects.a(new yxe[]{new yxe(goeVar.a, str, gxz0Var, ncfVar.e1)}));
            }
        }
        return Next.j();
    }

    public static final Next T(ncf ncfVar, t2f t2fVar) {
        wol wolVar = t2fVar.a;
        ncf ncfVarA = ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, new h7q0(wolVar), false, null, false, null, null, null, null, false, null, null, -262145, 7);
        wol wolVar2 = wolVar instanceof wol ? wolVar : null;
        return wolVar2 != null ? Next.i(ncfVarA, Effects.a(new nxe[]{new nxe(wolVar2.a)})) : Next.h(ncfVarA);
    }

    public static final Next U(v2f v2fVar) {
        return Next.a(Effects.a(new sxe[]{new sxe(v2fVar.a)}));
    }

    public static final Next V(ncf ncfVar, x2f x2fVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        List<tom> list = ncfVar.a.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (tom tomVarA : list) {
            if (u890.j(tomVarA.a, x2fVar.a)) {
                tomVarA = tom.a(tomVarA, (w4i1) null, (upl) null, new oom(atomicBoolean.getAndSet(false), false), (List) null, (List) null, (nom) null, false, 4031);
            }
            arrayList.add(tomVarA);
        }
        return Next.h(ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, arrayList, 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7));
    }

    public static final Next W(ncf ncfVar, y2f y2fVar) {
        Integer numValueOf;
        List<tom> list = y2fVar.b;
        goe goeVar = ncfVar.a;
        List listO = goeVar.f;
        for (tom tomVar : list) {
            listO = o(listO, new w9f(y2fVar, tomVar, (byte) 2), new qaf(tomVar, (byte) 1));
        }
        List list2 = listO;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            tom tomVar2 = (tom) obj;
            if (w(tomVar2) || t(tomVar2)) {
                arrayList.add(obj);
            }
        }
        ba80 ba80VarU1 = o7h.u1(goeVar.f);
        int iS = zno1.s(q7h.U(ba80VarU1, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        ca80 it = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it;
            String str = null;
            if (!((Iterator) ca80Var.c).hasNext()) {
                break;
            }
            aa80 aa80Var = (aa80) ca80Var.next();
            int i = aa80Var.a;
            String str2 = ((tom) aa80Var.b).a;
            tom tomVar3 = (tom) o7h.t0(i + 1, goeVar.f);
            if (tomVar3 != null) {
                str = tomVar3.a;
            }
            linkedHashMap.put(str2, str);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            tom tomVar4 = (tom) obj2;
            if (!w(tomVar4) && !t(tomVar4)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(o7h.a1(arrayList2, new p0d((byte) 6)));
        ud31 it2 = new wd31(arrayList).iterator();
        while (true) {
            ListIterator listIterator = (ListIterator) it2.b;
            if (!listIterator.hasPrevious()) {
                return Next.h(ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, arrayList3, 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7));
            }
            tom tomVar5 = (tom) listIterator.previous();
            Iterator it3 = z561.S(z561.c0(new paf(linkedHashMap, (byte) 1), tomVar5.a), 1).iterator();
            do {
                if (!it3.hasNext()) {
                    numValueOf = null;
                    break;
                }
                String str3 = (String) it3.next();
                Iterator it4 = arrayList3.iterator();
                int i2 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (u890.j(((tom) it4.next()).a, str3)) {
                        break;
                    }
                    i2++;
                }
                numValueOf = Integer.valueOf(i2);
                if (i2 < 0) {
                    numValueOf = null;
                }
            } while (numValueOf == null);
            if (numValueOf != null) {
                arrayList3.add(numValueOf.intValue(), tomVar5);
            } else {
                arrayList3.add(tomVar5);
            }
        }
    }

    public static final Next X(ncf ncfVar, z2f z2fVar) {
        String str;
        long j = z2fVar.c;
        ppl pplVar = z2fVar.b;
        icf icfVar = ncfVar.g;
        goe goeVar = ncfVar.a;
        w4i1 w4i1Var = ncfVar.b;
        if (icfVar instanceof icf) {
            if (pplVar instanceof ppl) {
                return Next.j();
            }
            tom tomVarM0 = m0(z2fVar, w4i1Var, goeVar.a);
            tom tomVarP0 = p0(z2fVar, w4i1Var, goeVar.a);
            icf icfVar2 = icfVar;
            w4i1 w4i1Var2 = w4i1Var;
            ncf ncfVarA = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, p7h.M(new tom[]{tomVarM0, tomVarP0}), 0, 4063), null, null, new hcf(new ccf(String.valueOf(j), tomVarM0, tomVarP0), false, icfVar2.a), false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -294978, 7);
            List list = goeVar.e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                w4i1 w4i1Var3 = w4i1Var2;
                if (!u890.j(((jwm) obj).a.a, w4i1Var3.a)) {
                    arrayList.add(obj);
                }
                w4i1Var2 = w4i1Var3;
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((jwm) it.next()).a.a);
            }
            String strValueOf = String.valueOf(j);
            btf btfVar = goeVar.b;
            btf btfVar2 = btfVar instanceof btf ? btfVar : null;
            return Next.i(ncfVarA, Effects.a(new uwe[]{new uwe(btfVar2 != null ? btfVar2.a : null, arrayList2, strValueOf, icfVar2.a, tomVarM0, tomVarP0)}));
        }
        if (!u890.j(icfVar, kcf.a)) {
            return Next.j();
        }
        boolean z = pplVar instanceof ppl;
        nye nyeVar = rxe.a;
        xks0 xks0Var = xks0.b;
        yks0 yks0Var = yks0.b;
        if (!z) {
            tom tomVarM1 = m0(z2fVar, w4i1Var, goeVar.a);
            tom tomVarP1 = p0(z2fVar, w4i1Var, goeVar.a);
            uxe uxeVar = new uxe(goeVar.a, String.valueOf(j), tomVarM1, tomVarP1, ncfVar.j1, ncfVar.e1);
            goe goeVarA = goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o7h.N0(goeVar.f, p7h.M(new tom[]{tomVarM1, tomVarP1})), 0, 4063);
            zks0 zks0Var = goeVar.c;
            return Next.i(ncf.a(ncfVar, goeVarA, null, null, null, zks0Var.d != yks0Var && zks0Var.b == xks0Var, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -295042, 7), Effects.a(new nye[]{uxeVar, nyeVar}));
        }
        List list2 = pplVar.b;
        String strI0 = i0(ncfVar, j, true);
        tom tomVarM2 = m0(z2fVar, w4i1Var, goeVar.a);
        nye wxeVar = new wxe(goeVar.a, String.valueOf(j), tomVarM2, ncfVar.j1, ncfVar.e1);
        List<opl> list3 = list2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            mg31 mg31Var = ((opl) it2.next()).c;
            String str2 = mg31Var != null ? mg31Var.b : null;
            if (mg31Var == null || (str = mg31Var.a) == null || str.equals(mg31Var.b)) {
                str = null;
            }
            r7h.W(f46.i0(new String[]{str2, str}), arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (opl oplVar : list3) {
            mg31 mg31Var2 = oplVar.c;
            hye hyeVar = mg31Var2 != null ? new hye(oplVar.b, mg31Var2.f, mg31Var2.g, mg31Var2.b, mg31Var2.a) : null;
            if (hyeVar != null) {
                arrayList4.add(hyeVar);
            }
        }
        goe goeVarA2 = goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o7h.N0(goeVar.f, Collections.singletonList(tomVarM2)), 0, 4063);
        zks0 zks0Var2 = goeVar.c;
        ncf ncfVarA2 = ncf.a(ncfVar, goeVarA2, null, null, null, zks0Var2.d != yks0Var && zks0Var2.b == xks0Var, 0, false, false, false, null, 0, null, false, null, false, sqg0.P(ncfVar.Z0, new mmr0(strI0, arrayList3)), null, null, null, false, null, null, -100958338, 7);
        String str3 = goeVar.a;
        return Next.i(ncfVarA2, Effects.a(new nye[]{wxeVar, new iye(str3, strI0, arrayList4), new lxe(str3, strI0), nyeVar}));
    }

    public static final Next Y(ncf ncfVar, a3f a3fVar) {
        goe goeVar = ncfVar.a;
        w4i1 w4i1Var = ncfVar.b;
        long j = a3fVar.c;
        icf icfVar = ncfVar.g;
        nlv nlvVar = null;
        if (!(icfVar instanceof icf)) {
            if (!u890.j(icfVar, kcf.a)) {
                return Next.j();
            }
            tom tomVarR0 = r0(a3fVar, w4i1Var, goeVar.a);
            tom tomVarN0 = n0(a3fVar, w4i1Var, goeVar.a);
            vxe vxeVar = new vxe(goeVar.a, String.valueOf(j), tomVarN0, tomVarR0, ncfVar.j1, ncfVar.e1);
            goe goeVarA = goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o7h.N0(goeVar.f, p7h.M(new tom[]{tomVarN0, tomVarR0})), 0, 4063);
            zks0 zks0Var = goeVar.c;
            boolean z = zks0Var.d != yks0.b && zks0Var.b == xks0.b;
            List list = f3i1.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (ihc1.h0(tomVarR0.f.a, (String) it.next(), false)) {
                        nlvVar = nlv.a;
                        break;
                    }
                }
            }
            return Next.i(ncf.a(ncfVar, goeVarA, null, nlvVar, null, z, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -295074, 7), Effects.a(new nye[]{vxeVar, bxe.a, rxe.a}));
        }
        tom tomVarR1 = r0(a3fVar, w4i1Var, goeVar.a);
        tom tomVarN1 = n0(a3fVar, w4i1Var, goeVar.a);
        icf icfVar2 = icfVar;
        w4i1 w4i1Var2 = w4i1Var;
        ncf ncfVarA = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, p7h.M(new tom[]{tomVarN1, tomVarR1}), 0, 4063), null, null, new hcf(new dcf(tomVarR1.a, tomVarN1, tomVarR1), false, icfVar2.a), false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -294978, 7);
        List list2 = goeVar.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            w4i1 w4i1Var3 = w4i1Var2;
            if (!u890.j(((jwm) obj).a.a, w4i1Var3.a)) {
                arrayList.add(obj);
            }
            w4i1Var2 = w4i1Var3;
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((jwm) it2.next()).a.a);
        }
        String strValueOf = String.valueOf(j);
        btf btfVar = goeVar.b;
        btf btfVar2 = btfVar instanceof btf ? btfVar : null;
        return Next.i(ncfVarA, Effects.a(new vwe[]{new vwe(btfVar2 != null ? btfVar2.a : null, arrayList2, strValueOf, icfVar2.a, tomVarN1, tomVarR1)}));
    }

    public static final Next Z(ncf ncfVar, f3f f3fVar) {
        String str;
        icf icfVar = ncfVar.g;
        goe goeVar = ncfVar.a;
        w4i1 w4i1Var = ncfVar.b;
        if (icfVar instanceof icf) {
            apl aplVar = f3fVar.a;
            long j = f3fVar.b;
            if (aplVar instanceof ppl) {
                return Next.j();
            }
            String str2 = goeVar.a;
            String strValueOf = String.valueOf(j);
            tom tomVar = new tom(strValueOf, str2, w4i1Var, j, true, aplVar, new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
            icf icfVar2 = icfVar;
            w4i1 w4i1Var2 = w4i1Var;
            ncf ncfVarA = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, Collections.singletonList(tomVar), 0, 4063), null, null, new hcf(new ecf(strValueOf, tomVar), false, icfVar2.a), false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -294978, 7);
            List list = goeVar.e;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                w4i1 w4i1Var3 = w4i1Var2;
                if (!u890.j(((jwm) obj).a.a, w4i1Var3.a)) {
                    arrayList.add(obj);
                }
                w4i1Var2 = w4i1Var3;
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((jwm) it.next()).a.a);
            }
            String strValueOf2 = String.valueOf(j);
            btf btfVar = goeVar.b;
            btf btfVar2 = btfVar instanceof btf ? btfVar : null;
            return Next.i(ncfVarA, Effects.a(new xwe[]{new xwe(btfVar2 != null ? btfVar2.a : null, arrayList2, strValueOf2, icfVar2.a, tomVar)}));
        }
        if (!u890.j(icfVar, kcf.a)) {
            return Next.j();
        }
        ppl pplVar = f3fVar.a;
        long j2 = f3fVar.b;
        boolean z = pplVar instanceof ppl;
        nye nyeVar = rxe.a;
        xks0 xks0Var = xks0.b;
        yks0 yks0Var = yks0.b;
        if (!z) {
            tom tomVar2 = new tom(String.valueOf(j2), goeVar.a, w4i1Var, j2, true, pplVar, new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
            aye ayeVar = new aye(goeVar.a, String.valueOf(j2), tomVar2, ncfVar.e1);
            goe goeVarA = goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o7h.N0(goeVar.f, Collections.singletonList(tomVar2)), 0, 4063);
            zks0 zks0Var = goeVar.c;
            return Next.i(ncf.a(ncfVar, goeVarA, null, null, null, zks0Var.d != yks0Var && zks0Var.b == xks0Var, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -295042, 7), Effects.a(new nye[]{ayeVar, nyeVar}));
        }
        List list2 = pplVar.b;
        String strI0 = i0(ncfVar, j2, false);
        List<opl> list3 = list2;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            mg31 mg31Var = ((opl) it2.next()).c;
            String str3 = mg31Var != null ? mg31Var.b : null;
            if (mg31Var == null || (str = mg31Var.a) == null || str.equals(mg31Var.b)) {
                str = null;
            }
            r7h.W(f46.i0(new String[]{str3, str}), arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        for (opl oplVar : list3) {
            mg31 mg31Var2 = oplVar.c;
            hye hyeVar = mg31Var2 != null ? new hye(oplVar.b, mg31Var2.f, mg31Var2.g, mg31Var2.b, mg31Var2.a) : null;
            if (hyeVar != null) {
                arrayList4.add(hyeVar);
            }
            xks0Var = xks0Var;
        }
        xks0 xks0Var2 = xks0Var;
        Map mapP = sqg0.P(ncfVar.Z0, new mmr0(strI0, arrayList3));
        zks0 zks0Var2 = goeVar.c;
        return Next.i(ncf.a(ncfVar, null, null, null, null, zks0Var2.d != yks0Var && zks0Var2.b == xks0Var2, 0, false, false, false, null, 0, null, false, null, false, mapP, null, null, null, false, null, null, -100958337, 7), Effects.a(new nye[]{new iye(ncfVar.h(), strI0, arrayList4), new lxe(ncfVar.h(), strI0), nyeVar}));
    }

    public static final void a(g2c g2cVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1389472179);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(g2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function0) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            olx olxVar = olx.c;
            jsl jslVar = new jsl(cwl1.o0(b0kVar3, 2131955623));
            qim0 qim0VarX = bin.x(g2cVar.a(nim0.a, een.g), false, null, null, null, function0, 15);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            w0h1.a(olxVar, jslVar, u291.r(uyn1.B(qim0VarX, cbx.b(b0kVar3).e.b, 0.0f, 0.0f, 0.0f, 14), 24.0f), 0L, 0L, false, b0kVar2, olx.d, 56);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(g2cVar, function0, i, (byte) 7);
        }
    }

    public static final Next a0(ncf ncfVar, g3f g3fVar) {
        goe goeVar = ncfVar.a;
        w4i1 w4i1Var = ncfVar.b;
        long j = g3fVar.b;
        icf icfVar = ncfVar.g;
        nlv nlvVar = null;
        if (!(icfVar instanceof icf)) {
            if (!u890.j(icfVar, kcf.a)) {
                return Next.j();
            }
            tom tomVarS0 = s0(g3fVar, w4i1Var, goeVar.a);
            bye byeVar = new bye(goeVar.a, String.valueOf(j), tomVarS0, ncfVar.j1, ncfVar.e1);
            goe goeVarA = goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o7h.N0(goeVar.f, Collections.singletonList(tomVarS0)), 0, 4063);
            zks0 zks0Var = goeVar.c;
            boolean z = zks0Var.d != yks0.b && zks0Var.b == xks0.b;
            List list = f3i1.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (ihc1.h0(tomVarS0.f.a, (String) it.next(), false)) {
                        nlvVar = nlv.a;
                        break;
                    }
                }
            }
            return Next.i(ncf.a(ncfVar, goeVarA, null, nlvVar, null, z, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -295074, 7), Effects.a(new nye[]{byeVar, bxe.a, rxe.a}));
        }
        tom tomVarS1 = s0(g3fVar, w4i1Var, goeVar.a);
        icf icfVar2 = icfVar;
        w4i1 w4i1Var2 = w4i1Var;
        ncf ncfVarA = ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, Collections.singletonList(tomVarS1), 0, 4063), null, null, new hcf(new fcf(tomVarS1.a, tomVarS1), false, icfVar2.a), false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -294978, 7);
        List list2 = goeVar.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            w4i1 w4i1Var3 = w4i1Var2;
            if (!u890.j(((jwm) obj).a.a, w4i1Var3.a)) {
                arrayList.add(obj);
            }
            w4i1Var2 = w4i1Var3;
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((jwm) it2.next()).a.a);
        }
        String strValueOf = String.valueOf(j);
        btf btfVar = goeVar.b;
        btf btfVar2 = btfVar instanceof btf ? btfVar : null;
        return Next.i(ncfVarA, Effects.a(new ywe[]{new ywe(btfVar2 != null ? btfVar2.a : null, arrayList2, strValueOf, icfVar2.a, tomVarS1)}));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(z4a z4aVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        byte b;
        cnx cnxVar;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2031677453);
        int i2 = (x340Var.i(z4aVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            fra fraVar = een.Z;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int iC = l1d.C(z4aVar.a);
            if (iC == 0) {
                cnxVar = klx.c;
            } else {
                if (iC != 1 && iC != 2) {
                    eg.o();
                    return;
                }
                cnxVar = cnx.c;
            }
            int iC2 = l1d.C(z4aVar.a);
            if (iC2 == 0) {
                x340Var.i0(466220225);
                j = cbx.a(x340Var).b.f;
                x340Var.r(false);
            } else if (iC2 == 1) {
                x340Var.i0(466222176);
                j = cbx.a(x340Var).b.e;
                x340Var.r(false);
            } else {
                if (iC2 != 2) {
                    throw p3d1.k(x340Var, 466218331, false);
                }
                x340Var.i0(466223969);
                j = cbx.a(x340Var).b.d;
                x340Var.r(false);
            }
            long j2 = j;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(cnxVar, isl.a, u291.r(nim0Var, 16.0f), j2, 0L, true, x340Var, 196664, 16);
            b = 1;
            uwo1.e(z4aVar.b, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            b = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s2c0(z4aVar, i, b);
        }
    }

    public static final Next b0(ncf ncfVar, h3f h3fVar) {
        return Next.h(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, new f7q0(h3fVar.a, null, null, null, null, 120), false, null, false, null, null, null, null, false, null, null, -262145, 7));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x0158  */
    /* JADX WARN: Code duplicated, block: B:43:0x015c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0169  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        xu30 xu30Var2;
        boolean z;
        x340 x340Var;
        xu30 xu30Var3;
        qim0 qim0Var2;
        h311 h311VarV;
        qim0 qim0Var3;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        h2c h2cVar;
        boolean z3;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1367751377);
        j06 j06Var = x340Var2.a;
        int i3 = (x340Var2.g(str) ? 4 : 2) | i;
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                xu30Var2 = xu30Var;
                i4 |= x340Var2.i(xu30Var2) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    xu30Var2 = null;
                }
                qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z2 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, u291.h(u291.f(qim0Var3, 1.0f), 56.0f));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                h2cVar = h2c.a;
                if (xu30Var2 == null) {
                    x340Var2.i0(1733677576);
                    z3 = false;
                    x340Var2.r(false);
                } else {
                    z3 = false;
                    x340Var2.i0(2134135065);
                    hrt.k(((i4 >> 3) & 112) | 6, xu30Var2, h2cVar, x340Var2, false);
                }
                uwr uwrVar = cbx.a;
                uwo1.e(str, h2cVar.a(qim0Var3, een.h), cbx.d(x340Var2).g, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var2, i4 & 14, 0, 1784);
                x340Var = x340Var2;
                x340Var.r(true);
                t1c.a(dug.f(u291.h(u291.f(qim0Var3, 1.0f), 1.0f), ((vex) zex.a.e).i, d4o1.a), x340Var, 0);
                x340Var.r(true);
                xu30Var3 = xu30Var2;
                qim0Var2 = qim0Var3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                xu30Var3 = xu30Var2;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new dg6(str, qim0Var2, xu30Var3, i, i2, (byte) 6);
            }
        }
        i4 = i3 | 432;
        xu30Var2 = xu30Var;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i4 & 1, z)) {
            if (i5 != 0) {
                xu30Var2 = null;
            }
            qim0Var3 = nim0.a;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarF2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z2 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar7);
            nko1.F(x340Var2);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar8);
            qim0 qim0VarZ2 = uyn1.z(0.0f, 8.0f, 1, u291.h(u291.f(qim0Var3, 1.0f), 56.0f));
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarZ2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar5);
            nko1.H(xos0VarM3, x340Var2, lljVar6);
            x0d.q(iHashCode3, x340Var2, lljVar7, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar8);
            h2cVar = h2c.a;
            if (xu30Var2 == null) {
                x340Var2.i0(1733677576);
                z3 = false;
                x340Var2.r(false);
            } else {
                z3 = false;
                x340Var2.i0(2134135065);
                hrt.k(((i4 >> 3) & 112) | 6, xu30Var2, h2cVar, x340Var2, false);
            }
            uwr uwrVar2 = cbx.a;
            uwo1.e(str, h2cVar.a(qim0Var3, een.h), cbx.d(x340Var2).g, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var2, i4 & 14, 0, 1784);
            x340Var = x340Var2;
            x340Var.r(true);
            t1c.a(dug.f(u291.h(u291.f(qim0Var3, 1.0f), 1.0f), ((vex) zex.a.e).i, d4o1.a), x340Var, 0);
            x340Var.r(true);
            xu30Var3 = xu30Var2;
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            xu30Var3 = xu30Var2;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dg6(str, qim0Var2, xu30Var3, i, i2, (byte) 6);
        }
    }

    public static final Next c0(ncf ncfVar, i3f i3fVar) {
        return Next.h(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, i3fVar.a, false, null, false, null, null, null, null, false, null, null, -262145, 7));
    }

    public static final void d(gbx gbxVar, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        idn0 idn0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-171678651);
        int i2 = i | (x340Var.g(gbxVar) ? 4 : 2) | 432;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var3 = (idn0) objT;
            fux fuxVar = fux.c;
            String strX = hrt.x(2);
            qim0Var2 = nim0.a;
            cuo1.k(fuxVar, gbxVar, new jsl(cwl1.o0(x340Var, 2131956004)), anm1.N(strX, qim0Var2), idn0Var3, x340Var, ((i2 << 3) & 112) | fux.d | 24576, 0);
            idn0Var2 = idn0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fix(gbxVar, qim0Var2, idn0Var2, i, (byte) 0);
        }
    }

    public static final Next d0(ncf ncfVar, j3f j3fVar) {
        return Next.h(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, j3fVar.a, null, -1, 5));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ac  */
    public static final void e(String str, String str2, String str3, p0o p0oVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        int i2;
        qim0 qim0VarQ;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1960112831);
        j06 j06Var = x340Var2.a;
        int i3 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(str3) ? 256 : 128) | (x340Var2.g(p0oVar) ? 2048 : 1024) | (x340Var2.g(qim0Var) ? 16384 : 8192);
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0VarZ = u291.z(qim0Var, (fra) null, 3);
            boolean z = (i3 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new kak(str3, (byte) 28);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT);
            era eraVar = een.P0;
            d36 d36Var = new d36(8.0f, true, new g21(eraVar, (byte) 29));
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 54);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            Uri uri = Uri.parse(p0oVar != null ? p0oVar.a : "");
            jsl jslVar = new jsl(str3);
            nkx nkxVar = nkx.c;
            nux nuxVar = new nux(nkxVar, nkxVar);
            qim0 qim0Var2 = nim0.a;
            if (p0oVar != null) {
                i2 = i3;
                qim0VarQ = x0o.a[l1d.C(p0oVar.b)] == 1 ? i1p1.q(qim0Var2, er31.b(8.0f)) : i1p1.q(qim0Var2, er31.a);
                if (qim0VarQ == null) {
                }
                eso1.e(uri, jslVar, qim0VarQ, new p3v(48.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var2, 1073744896, 0, 3568);
                d36 d36Var2 = new d36(4.0f, false, new g21(fraVar, (byte) 28));
                qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                mbh mbhVarA = jbh.a(d36Var2, eraVar, x340Var2, 6);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                uwr uwrVar = cbx.a;
                uwo1.e(str, null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var2, (i2 & 14) | 1572864, 0, 1714);
                uwo1.e(str2, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var2, ((i2 >> 3) & 14) | 1572864, 0, 1714);
                x340Var = x340Var2;
                x340Var.r(true);
                x340Var.r(true);
            } else {
                i2 = i3;
            }
            qim0VarQ = qim0Var2;
            eso1.e(uri, jslVar, qim0VarQ, new p3v(48.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var2, 1073744896, 0, 3568);
            d36 d36Var3 = new d36(4.0f, false, new g21(fraVar, (byte) 28));
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            mbh mbhVarA2 = jbh.a(d36Var3, eraVar, x340Var2, 6);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            uwr uwrVar2 = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var2, (i2 & 14) | 1572864, 0, 1714);
            uwo1.e(str2, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var2, ((i2 >> 3) & 14) | 1572864, 0, 1714);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 15, i, (Object) str, (Object) str2, (Object) str3, (Object) p0oVar, (Object) qim0Var);
        }
    }

    public static final Next e0(ncf ncfVar) {
        if (!ncfVar.c || !(ncfVar.g instanceof kcf) || ncfVar.N0 || ncfVar.Y) {
            return Next.j();
        }
        int i = ncfVar.Q0 + ncfVar.R0;
        return Next.i(ncf.a(ncfVar, null, null, null, null, false, 0, true, false, false, null, i, null, false, null, false, null, null, null, null, false, null, null, -67585, 7), Effects.a(new mye[]{new mye(new bif(ncfVar.a.a, i))}));
    }

    public static final void f(boolean z, iu30 iu30Var, String str, qim0 qim0Var, String str2, boolean z2, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1008801006);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.g(str) ? 256 : 128) | 3072 | (b0kVar3.g(str2) ? 16384 : 8192) | (b0kVar3.h(z2) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            poo1.g(z, iu30Var, new nex(4), yoo1.z(b0kVar3), qim0Var3, 0, null, str2, null, null, null, null, null, z2, yoo1.z(b0kVar3).a, apo.r(487667211, new qeu(str, (byte) 17), b0kVar3), b0kVar2, (i2 & 126) | 24576 | ((i2 << 9) & 29360128), ((i2 >> 6) & 7168) | 196608, 8032);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new erc(z, iu30Var, str, qim0Var2, str2, z2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    public static final Next f0(ncf ncfVar, l3f l3fVar) {
        int i;
        Object next;
        goe goeVar = ncfVar.a;
        List list = goeVar.f;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            tom tomVar = (tom) obj;
            if (w(tomVar) || t(tomVar)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((tom) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList3);
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((tom) it2.next()).a);
        }
        Set setP2 = o7h.p1(arrayList4);
        List list2 = l3fVar.a;
        List list3 = list2;
        ArrayList arrayList5 = new ArrayList(q7h.U(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((tvm) it3.next()).a);
        }
        Set setP3 = o7h.p1(arrayList5);
        List<tvm> list4 = list2;
        ArrayList arrayList6 = new ArrayList();
        for (tvm tvmVar : list4) {
            Iterator it4 = tvmVar.b.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!(((dph0) next).b instanceof uxh1));
            dph0 dph0Var = (dph0) next;
            mmr0 mmr0Var = dph0Var != null ? new mmr0(tvmVar.a, dph0Var.b.a) : null;
            if (mmr0Var != null) {
                arrayList6.add(mmr0Var);
            }
        }
        Map mapT = sqg0.T(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : list4) {
            List list5 = ((tvm) obj2).b;
            ArrayList<dph0> arrayList8 = new ArrayList();
            for (Object obj3 : list5) {
                if (((dph0) obj3).c) {
                    arrayList8.add(obj3);
                }
            }
            if (!arrayList8.isEmpty() && !arrayList8.isEmpty()) {
                for (dph0 dph0Var2 : arrayList8) {
                    if (dph0Var2.b.equals(txh1.a) || (dph0Var2.b instanceof vxh1)) {
                        arrayList7.add(obj2);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList9 = new ArrayList(q7h.U(arrayList7, 10));
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            arrayList9.add(((tvm) it5.next()).a);
        }
        Set setP4 = o7h.p1(arrayList9);
        List<tom> list6 = goeVar.f;
        ArrayList arrayList10 = new ArrayList();
        for (tom tomVarA : list6) {
            boolean zW = w(tomVarA);
            String str = tomVarA.a;
            if (zW && mapT.containsKey(str)) {
                if (o7h.i0(setP1, (String) mapT.get(str))) {
                    tomVarA = null;
                } else {
                    tomVarA = tom.a(tomVarA, (w4i1) null, (upl) null, new pom(false), (List) null, (List) null, (nom) null, false, 4031);
                }
            } else if (w(tomVarA) && setP4.contains(str)) {
                tomVarA = tom.a(tomVarA, (w4i1) null, (upl) null, new oom(false, true), (List) null, (List) null, (nom) null, false, 4031);
            } else if (t(tomVarA) && !setP4.contains(str) && setP3.contains(str)) {
                tomVarA = tom.a(tomVarA, (w4i1) null, (upl) null, new pom(true), (List) null, (List) null, (nom) null, false, 4031);
            } else if ((w(tomVarA) || t(tomVarA)) && !setP3.contains(str)) {
                tomVarA = null;
            }
            if (tomVarA != null) {
                arrayList10.add(tomVarA);
            }
        }
        w4i1 w4i1Var = ncfVar.b;
        String strH = ncfVar.h();
        ArrayList<tvm> arrayList11 = new ArrayList();
        for (Object obj4 : list4) {
            tvm tvmVar2 = (tvm) obj4;
            List list7 = tvmVar2.b;
            String str2 = tvmVar2.a;
            List list8 = list7;
            if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                Iterator it6 = list8.iterator();
                while (it6.hasNext()) {
                    if (((dph0) it6.next()).c) {
                        List list9 = tvmVar2.b;
                        if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                            Iterator it7 = list9.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    if (((dph0) it7.next()).b instanceof sxh1) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (!setP2.contains(str2) && !mapT.containsKey(str2)) {
                            arrayList11.add(obj4);
                            break;
                        }
                        break;
                    }
                }
            }
        }
        ArrayList arrayList12 = new ArrayList(q7h.U(arrayList11, 10));
        for (tvm tvmVar3 : arrayList11) {
            String str3 = tvmVar3.a;
            String str4 = tvmVar3.a;
            pom pomVar = !setP4.contains(str3) ? new pom(true) : new oom(false, true);
            Long lD0 = nhc1.d0(10, str4);
            long jLongValue = lD0 != null ? lD0.longValue() : 0L;
            List list10 = tvmVar3.b;
            ArrayList arrayList13 = new ArrayList();
            for (Object obj5 : list10) {
                if (((dph0) obj5).c) {
                    arrayList13.add(obj5);
                }
            }
            ArrayList arrayList14 = new ArrayList(q7h.U(arrayList13, 10));
            Iterator it8 = arrayList13.iterator();
            while (it8.hasNext()) {
                cph0 cph0Var = ((dph0) it8.next()).a.c;
                if (cph0Var instanceof bph0) {
                    i = 2;
                } else {
                    if (!(cph0Var instanceof aph0)) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                arrayList14.add(new opl(str4, i, (mg31) null));
            }
            arrayList12.add(new tom(str4, strH, w4i1Var, jLongValue, true, new ppl(str4, arrayList14, false), pomVar, (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968));
        }
        return Next.h(ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o7h.N0(arrayList10, arrayList12), 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7));
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0205  */
    /* JADX WARN: Code duplicated, block: B:122:0x0217  */
    public static final void g(zn60 zn60Var, iu30 iu30Var, boolean z, float f, boolean z2, boolean z3, aod aodVar, ce60 ce60Var, boolean z4, qim0 qim0Var, iu30 iu30Var2, vzq0 vzq0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vzq0 vzq0Var2;
        tob1 tob1Var;
        int iNextIndex;
        xtb0 xtb0Var;
        String str;
        String str2;
        ven0 ven0Var;
        int i2;
        xn60 xn60Var;
        Object objPrevious;
        ce60 ce60Var2;
        m4c m4cVar = fkj0.X;
        xn60 xn60Var2 = zn60Var.b;
        c9 c9Var = zn60Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1764656831);
        int i3 = i | (x340Var.g(zn60Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | (x340Var.h(z2) ? 16384 : 8192) | (x340Var.h(z3) ? 131072 : 65536) | (x340Var.g(aodVar) ? 1048576 : 524288) | (x340Var.e(ce60Var == null ? -1 : ce60Var.ordinal()) ? 8388608 : 4194304) | (x340Var.h(z4) ? 67108864 : 33554432) | 805306368;
        int i4 = (x340Var.i(iu30Var2) ? (char) 4 : (char) 2) | '0' | (x340Var.g((Object) null) ? 256 : 128);
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 147) == 146) ? false : true)) {
            vzq0 vzq0VarH = uyn1.h(2, 12.0f, 0.0f);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            p811 p811Var = new p811();
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                x340Var.s0((Object) null);
                objT = null;
            }
            p811Var.a = objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            boolean z5 = z && !j960.a;
            if (z5 || ((ce60) j960.b.getValue()) == null) {
                x340Var.i0(-490799675);
                boolean zG = x340Var.g(xtb0VarA);
                Object objT3 = x340Var.T();
                if (zG || objT3 == m4cVar) {
                    objT3 = yv91.a(new ih1(xtb0VarA, (byte) 26));
                    x340Var.s0(objT3);
                }
                tob1 tob1Var2 = (tob1) objT3;
                boolean zG2 = x340Var.g(xtb0VarA);
                Object objT4 = x340Var.T();
                if (zG2 || objT4 == m4cVar) {
                    objT4 = yv91.a(new bu2(tob1Var2, (byte) 7));
                    x340Var.s0(objT4);
                }
                tob1 tob1Var3 = (tob1) objT4;
                ListIterator listIterator = c9Var.listIterator(c9Var.b());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        tob1Var = tob1Var2;
                        iNextIndex = -1;
                        break;
                    } else {
                        tob1Var = tob1Var2;
                        if (((un60) listIterator.previous()).f) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                        tob1Var2 = tob1Var;
                    }
                }
                xtb0Var = xtb0VarA;
                qxd0.s(Integer.valueOf(((Number) tob1Var3.getValue()).intValue()), Integer.valueOf(iNextIndex), new dk6(iNextIndex, ce60Var, z5, p811Var, c9nVar, tob1Var, xtb0Var, (lnm) null), x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-488650879);
                x340Var.r(false);
                xtb0Var = xtb0VarA;
            }
            if (z3) {
                ListIterator listIterator2 = c9Var.listIterator(c9Var.b());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!((un60) objPrevious).f);
                un60 un60Var = (un60) objPrevious;
                if (un60Var == null || (ce60Var2 = (ce60) j960.b.getValue()) == null) {
                    str = null;
                } else {
                    on60 on60Var = un60Var.i;
                    int iOrdinal = ce60Var2.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            eg.o();
                            return;
                        } else if (on60Var != null) {
                            str = on60Var.b;
                        } else {
                            str = null;
                        }
                    } else if (on60Var != null) {
                        str = on60Var.a;
                    } else {
                        str = null;
                    }
                    if (str == null || str.length() == 0) {
                        str = null;
                    }
                }
            } else {
                str = null;
            }
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT5);
            }
            ven0 ven0Var2 = (ven0) objT5;
            Boolean boolValueOf = Boolean.valueOf(z4);
            boolean z6 = (i3 & 234881024) == 67108864;
            Object objT6 = x340Var.T();
            if (z6 || objT6 == m4cVar) {
                objT6 = new hj6(z4, ven0Var2, (lnm) null, (byte) 8);
                x340Var.s0(objT6);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT6);
            boolean zG3 = x340Var.g(str);
            Object objT7 = x340Var.T();
            if (zG3 || objT7 == m4cVar) {
                objT7 = v8r.q((Object) null);
                x340Var.s0(objT7);
            }
            ven0 ven0Var3 = (ven0) objT7;
            Boolean bool = (Boolean) ven0Var2.getValue();
            bool.getClass();
            String str3 = str;
            boolean zG4 = ((3670016 & i3) == 1048576) | x340Var.g(str) | x340Var.g(ven0Var3);
            Object objT8 = x340Var.T();
            if (zG4 || objT8 == m4cVar) {
                objT8 = new ary(str3, aodVar, ven0Var2, ven0Var3, (lnm) null);
                str2 = str3;
                ven0Var = ven0Var3;
                x340Var.s0(objT8);
            } else {
                ven0Var = ven0Var3;
                str2 = str3;
            }
            qxd0.s(str2, bool, (vu30) objT8, x340Var);
            boolean z7 = xn60Var2 instanceof xn60;
            xn60 xn60Var3 = z7 ? xn60Var2 : null;
            un60 un60Var2 = xn60Var3 != null ? xn60Var3.a : null;
            xn60 xn60Var4 = z7 ? xn60Var2 : null;
            vn60 vn60Var = xn60Var4 != null ? xn60Var4.b : null;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            az20 az20Var = (az20) x340Var.k(t4k.i);
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zG5 = x340Var.g(az20Var) | x340Var.g(view);
            Object objT9 = x340Var.T();
            if (zG5 || objT9 == m4cVar) {
                objT9 = new ao60(az20Var, view);
                x340Var.s0(objT9);
            }
            ao60 ao60Var = (ao60) objT9;
            boolean zI = x340Var.i(ao60Var);
            Object objT10 = x340Var.T();
            if (zI || objT10 == m4cVar) {
                objT10 = new xy50(ao60Var, (byte) 1);
                x340Var.s0(objT10);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = d9y0.q(qim0Var3, (iu30) objT10);
            boolean zI2 = x340Var.i(ao60Var);
            Object objT11 = x340Var.T();
            if (zI2 || objT11 == m4cVar) {
                objT11 = new v6a(1, ao60Var, ao60.class, "onPreviewKeyEvent", "onPreviewKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, (byte) 3);
                x340Var.s0(objT11);
            }
            qim0 qim0VarN = anm1.N("HomeFilterRow", u291.f(o0c.d(u291.j(f, 0.0f, 2, f8d1.b(y9g1.t(qim0VarQ, (iu30) objT11), rih1.a, new vix(p811Var, (byte) 1))), (ni20) null, 3), 1.0f));
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            boolean zG6 = ((i4 & 14) == 4) | x340Var.g(un60Var2) | x340Var.g(ven0Var) | ((i3 & 112) == 32) | ((458752 & i3) == 131072) | ((i3 & 896) == 256) | x340Var.g(vn60Var) | ((i4 & 896) == 256);
            int i5 = -1;
            boolean zE = zG6 | x340Var.e(-1) | x340Var.g(c9Var);
            Object objT12 = x340Var.T();
            if (zE || objT12 == m4cVar) {
                un60 un60Var3 = un60Var2;
                i2 = 16384;
                xn60Var = null;
                cwu cwuVar = new cwu(-1, c9Var, iu30Var2, un60Var3, iu30Var, z3, z, vn60Var, ven0Var);
                i5 = -1;
                un60Var2 = un60Var3;
                x340Var.s0(cwuVar);
                objT12 = cwuVar;
            } else {
                i2 = 16384;
                xn60Var = null;
            }
            xtb0 xtb0Var2 = xtb0Var;
            ujo1.e(qim0VarN, xtb0Var2, vzq0VarH, d36Var, fraVar, null, false, null, (iu30) objT12, x340Var, 196992, 456);
            x340Var = x340Var;
            wat watVar = (wat) x340Var.k(t4k.h);
            xn60 xn60Var5 = z7 ? xn60Var2 : xn60Var;
            xn60 xn60Var6 = xn60Var5 != null ? xn60Var5.a : xn60Var;
            xn60 xn60Var7 = xn60Var6 != null ? ((un60) xn60Var6).d : xn60Var;
            Object objT13 = x340Var.T();
            if (objT13 == m4cVar) {
                objT13 = v8r.q(xn60Var7);
                x340Var.s0(objT13);
            }
            ven0 ven0Var4 = (ven0) objT13;
            c9 c9Var2 = (c9) ven0Var4.getValue();
            boolean z8 = (c9Var2 == null || c9Var2.isEmpty() || u890.j((c9) ven0Var4.getValue(), xn60Var7)) ? false : true;
            ven0Var4.setValue(xn60Var7);
            boolean zG7 = x340Var.g(un60Var2) | x340Var.g(c9Var) | x340Var.e(i5) | ((i3 & 57344) == i2) | x340Var.g(xtb0Var2) | x340Var.g(watVar) | x340Var.d(8.0f) | x340Var.h(z8);
            Object objT14 = x340Var.T();
            if (zG7 || objT14 == m4cVar) {
                do60 do60Var = new do60(un60Var2, i5, z2, xtb0Var2, watVar, z8, c9Var, null);
                x340Var.s0(do60Var);
                objT14 = do60Var;
            }
            qxd0.s(un60Var2, vn60Var, (vu30) objT14, x340Var);
            vzq0Var2 = vzq0VarH;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            vzq0Var2 = vzq0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bo60(zn60Var, iu30Var, z, f, z2, z3, aodVar, ce60Var, z4, qim0Var2, iu30Var2, vzq0Var2, i);
        }
    }

    public static final Next g0(o3f o3fVar) {
        return Next.a(Effects.a(new fye[]{new fye(o3fVar.a)}));
    }

    public static final void h(n6c0 n6c0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, b0k b0kVar, int i) {
        Throwable th;
        Function0 function4;
        Function0 function5 = function1;
        Function0 function6 = function2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-488482755);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(n6c0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function5) ? 256 : 128) | (x340Var.i(function6) ? 2048 : 1024) | (x340Var.i(function3) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = c97.b(0.0f);
                x340Var.s0(objT);
            }
            o95 o95Var = (o95) objT;
            uwr uwrVar = cbx.a;
            int iH = (int) jfv.h(cbx.c(x340Var).b.b);
            ceo ceoVar = ((jhx) cbx.c(x340Var).a.b).a;
            String str = n6c0Var.f;
            e8a e8aVar = n6c0Var.a;
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new to1(function0, (lnm) null, (byte) 12);
                x340Var.s0(objT2);
            }
            qxd0.s(str, e8aVar, (vu30) objT2, x340Var);
            boolean zI = x340Var.i(o95Var) | x340Var.e(iH) | x340Var.g(ceoVar);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                th = null;
                objT3 = new zi3(o95Var, iH, ceoVar, (lnm) null, (byte) 9);
                x340Var.s0(objT3);
            } else {
                th = null;
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT3);
            boolean zI2 = x340Var.i(o95Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new wqe(o95Var, (byte) 10);
                x340Var.s0(objT4);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(i541.C(nim0Var, (iu30) objT4), 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarN = anm1.N("LibraryImportMatchResultElement", dug.f(qim0VarB, jA, er31.b(16.0f)));
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw th;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function7 = hmb0.t1;
            if (z2) {
                x340Var.l(function7);
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
            fra fraVar = een.Z;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function7);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str2 = n6c0Var.b;
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            cvx cvxVar5 = cbx.b(x340Var).b;
            uwo1.e(str2, uyn1.B(wnb0Var, 16.0f, 16.0f, 8.0f, 0.0f, 8), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            if (n6c0Var.g) {
                x340Var.i0(-211828106);
                String strO0 = cwl1.o0(x340Var, 2131964088);
                boolean z3 = (i2 & 57344) == 16384;
                Object objT5 = x340Var.T();
                if (z3 || objT5 == m4cVar) {
                    objT5 = new aba0(function3, (byte) 5);
                    x340Var.s0(objT5);
                }
                Function0 function8 = (Function0) objT5;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    wro1.h(new gbx(new y50(strO0), function8), ldx.c, anm1.N("LibraryImportMatchResultDismissButton", nim0Var), null, yla.s(x340Var), null, false, null, null, ivi.b, x340Var, 432, 6, 984);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-211257985);
                x340Var.r(false);
            }
            x340Var.r(true);
            cvx cvxVar6 = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            cvx cvxVar7 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarZ2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                function4 = function7;
                x340Var.l(function4);
            } else {
                function4 = function7;
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            cvx cvxVar8 = cbx.b(x340Var).b;
            cvx cvxVar9 = ywx0.k(nim0Var, 8.0f, x340Var, x340Var).b;
            mbh mbhVarA3 = jbh.a(new d36(12.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function4);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            x340Var.i0(4757077);
            Iterator it = n6c0Var.c.iterator();
            while (it.hasNext()) {
                b((z4a) it.next(), x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            if (n6c0Var.d == null && n6c0Var.e == null) {
                x340Var.i0(-127286575);
                x340Var.r(false);
                function5 = function1;
                function6 = function2;
            } else {
                x340Var.i0(-128272561);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar10 = cbx.b(x340Var).b;
                qim0 qim0VarO = ab80.o(nim0Var, 12.0f, x340Var, nim0Var, 1.0f);
                cvx cvxVar11 = cbx.b(x340Var).b;
                d36 d36Var = new d36(12.0f, true, new um5(false));
                cvx cvxVar12 = cbx.b(x340Var).b;
                function5 = function1;
                function6 = function2;
                k5p1.d(qim0VarO, d36Var, new d36(12.0f, true, new um5(false)), null, 0, 0, apo.r(-1640673711, new cy00(n6c0Var, function5, function6, (byte) 20), x340Var), x340Var, 1572870, 56);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 20, i, (Object) n6c0Var, (Object) function0, (Object) function5, (Object) function6, (Object) function3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object h0(xtb0 xtb0Var, int i, List list, onm onmVar) {
        eo60 eo60Var;
        double dH0;
        float f;
        xtb0 xtb0Var2;
        int i2;
        int i3;
        float f2;
        int i4;
        double d;
        xtb0 xtb0Var3;
        pxg1 pxg1VarO0;
        int i5 = i;
        if (onmVar instanceof eo60) {
            eo60Var = (eo60) onmVar;
            int i6 = eo60Var.g;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eo60Var.g = i6 - Integer.MIN_VALUE;
            } else {
                eo60Var = new eo60(onmVar);
            }
        } else {
            eo60Var = new eo60(onmVar);
        }
        Object obj = eo60Var.f;
        int i7 = eo60Var.g;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i7 == 0) {
            hm5.M(obj);
            if (!list.isEmpty()) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Integer(((qtb0) it.next()).q));
                }
                dH0 = o7h.h0(arrayList);
                f = (float) (((double) i5) * dH0);
                eo60Var.a = xtb0Var;
                eo60Var.b = i5;
                eo60Var.c = 1000;
                eo60Var.d = dH0;
                eo60Var.e = f;
                eo60Var.g = 1;
                if (hap1.i(1000L, eo60Var) != d9nVar) {
                    xtb0Var2 = xtb0Var;
                    i2 = 1000;
                }
                return d9nVar;
            }
            return rih1Var;
        }
        if (i7 == 1) {
            float f3 = eo60Var.e;
            dH0 = eo60Var.d;
            int i8 = eo60Var.c;
            int i9 = eo60Var.b;
            xtb0Var2 = eo60Var.a;
            hm5.M(obj);
            i2 = i8;
            f = f3;
            i5 = i9;
        } else {
            if (i7 == 2) {
                f2 = eo60Var.e;
                double d2 = eo60Var.d;
                i4 = eo60Var.c;
                int i10 = eo60Var.b;
                xtb0 xtb0Var4 = eo60Var.a;
                hm5.M(obj);
                d = d2;
                i3 = i10;
                xtb0Var3 = xtb0Var4;
                eo60Var.a = xtb0Var3;
                eo60Var.b = i3;
                eo60Var.c = i4;
                eo60Var.d = d;
                eo60Var.e = f2;
                eo60Var.g = 3;
                if (hap1.i(i4, eo60Var) != d9nVar) {
                }
                return d9nVar;
            }
            if (i7 != 3) {
                if (i7 == 4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = eo60Var.e;
            d = eo60Var.d;
            i4 = eo60Var.c;
            i3 = eo60Var.b;
            xtb0Var3 = eo60Var.a;
            hm5.M(obj);
        }
        pxg1VarO0 = irn1.o0(i4, 0, null, 6);
        eo60Var.a = null;
        eo60Var.b = i3;
        eo60Var.c = i4;
        eo60Var.d = d;
        eo60Var.e = f2;
        eo60Var.g = 4;
        if (kqn1.l(xtb0Var3, -f2, pxg1VarO0, eo60Var) != d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        pxg1 pxg1VarO1 = irn1.o0(i2, 0, null, 6);
        eo60Var.a = xtb0Var2;
        eo60Var.b = i5;
        eo60Var.c = i2;
        eo60Var.d = dH0;
        eo60Var.e = f;
        eo60Var.g = 2;
        if (kqn1.l(xtb0Var2, f, pxg1VarO1, eo60Var) != d9nVar) {
            i3 = i5;
            f2 = f;
            i4 = i2;
            d = dH0;
            xtb0Var3 = xtb0Var2;
            eo60Var.a = xtb0Var3;
            eo60Var.b = i3;
            eo60Var.c = i4;
            eo60Var.d = d;
            eo60Var.e = f2;
            eo60Var.g = 3;
            if (hap1.i(i4, eo60Var) != d9nVar) {
                pxg1VarO0 = irn1.o0(i4, 0, null, 6);
                eo60Var.a = null;
                eo60Var.b = i3;
                eo60Var.c = i4;
                eo60Var.d = d;
                eo60Var.e = f2;
                eo60Var.g = 4;
                if (kqn1.l(xtb0Var3, -f2, pxg1VarO0, eo60Var) != d9nVar) {
                    return rih1Var;
                }
            }
        }
        return d9nVar;
    }

    public static final void i(gbx gbxVar, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        idn0 idn0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1563532148);
        int i2 = i | (x340Var.g(gbxVar) ? 4 : 2) | 432;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var3 = (idn0) objT;
            enx enxVar = enx.c;
            String strX = hrt.x(5);
            qim0Var2 = nim0.a;
            cuo1.k(enxVar, gbxVar, new jsl(cwl1.o0(x340Var, 2131956008)), anm1.N(strX, qim0Var2), idn0Var3, x340Var, ((i2 << 3) & 112) | enx.d | 24576, 0);
            idn0Var2 = idn0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fix(gbxVar, qim0Var2, idn0Var2, i, (byte) 1);
        }
    }

    public static final String i0(ncf ncfVar, long j, boolean z) {
        String str = ncfVar.a1;
        if (str != null) {
            return str;
        }
        if (z) {
            j++;
        }
        String strValueOf = String.valueOf(j);
        if (ncfVar.b1) {
            n57.s("pendingUploadContributionId was null, falling back to timestamp");
        }
        return strValueOf;
    }

    public static final void j(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1873243152);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("permission-banner-tag", qim0Var3), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarX, er31.b(16.0f)), cbx.a(x340Var).a.a.a(), d4o1.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarF2, 16.0f);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX2);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.5f, true);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = egs0.X;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(wnb0VarQ, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            uwo1.e(cwl1.o0(x340Var, 2131963594), null, cbx.d(x340Var).h, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1722);
            uwo1.e(cwl1.o0(x340Var, 2131963593), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(3), 0, null, x340Var, 0, 0, 1714);
            x340Var.r(true);
            String strO0 = cwl1.o0(x340Var, 2131963592);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), new idx(), anm1.N("permission-banner-button-tag", qim0Var3), null, yla.s(x340Var), null, null, null, null, null, a7j.a, x340Var, 0, 48, 2008);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 18);
        }
    }

    public static final Next j0(String str, gxz0 gxz0Var, ncf ncfVar) {
        goe goeVar = ncfVar.a;
        return Next.i(ncf.a(ncfVar, goe.a(goeVar, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o(goeVar.f, new w8c(str, (byte) 23), new oaf(gxz0Var, (byte) 1)), 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7), gxz0Var.e ? Effects.a(new nye[0]) : Effects.a(new mxe[]{new mxe(str, gxz0Var, ncfVar.e1)}));
    }

    public static final void k(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(180300038);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(16.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(i1p1.q(qim0Var3, cr31VarB), ((yex) zex.a.d).c, d4o1.a);
            boolean z = (i2 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new uuc1(function0, (byte) 2);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, true, null, null, null, (Function0) objT, 14);
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z2 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            jw31 jw31VarA2 = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, wnb0Var);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA2, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            lee1 lee1Var = cbx.d(b0kVar3).h;
            long j = cbx.a(b0kVar3).b.a;
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var2 = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            uwo1.e(str, uyn1.B(wnb0Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11), lee1Var, j, null, null, 0, false, null, 0, null, b0kVar2, i2 & 14, 0, 2032);
            b0kVar2.r(true);
            w0h1.a(jkx.c, isl.a, u291.r(qim0Var3, 20.0f), cbx.a(b0kVar2).b.a, 0L, false, b0kVar2, jkx.d | 48, 48);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k0(xtb0 xtb0Var, int i, float f, boolean z, onm onmVar) {
        fo60 fo60Var;
        Object next;
        if (onmVar instanceof fo60) {
            fo60Var = (fo60) onmVar;
            int i2 = fo60Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fo60Var.f = i2 - Integer.MIN_VALUE;
            } else {
                fo60Var = new fo60(onmVar);
            }
        } else {
            fo60Var = new fo60(onmVar);
        }
        Object obj = fo60Var.e;
        int i3 = fo60Var.f;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(obj);
            if (z) {
                fo60Var.a = xtb0Var;
                fo60Var.b = i;
                fo60Var.c = f;
                fo60Var.d = z;
                fo60Var.f = 1;
                if (hap1.i(300L, fo60Var) != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (i3 == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = fo60Var.d;
        f = fo60Var.c;
        i = fo60Var.b;
        xtb0Var = fo60Var.a;
        hm5.M(obj);
        Iterator it = xtb0Var.h().l.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((qtb0) next).a != i);
        qtb0 qtb0Var = (qtb0) next;
        if (qtb0Var != null) {
            float f2 = qtb0Var.p - f;
            fo60Var.a = null;
            fo60Var.b = i;
            fo60Var.c = f;
            fo60Var.d = z;
            fo60Var.f = 2;
            if (kqn1.l(xtb0Var, f2, irn1.l0(0.0f, 0.0f, null, 7), fo60Var) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        int i4 = i - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        fo60Var.a = null;
        fo60Var.b = i;
        fo60Var.c = f;
        fo60Var.d = z;
        fo60Var.f = 3;
        if (xtb0Var.f(i4, 0, fo60Var) == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    public static final qhi1 l(xpw xpwVar, dtb1 dtb1Var) {
        return new qhi1(xpwVar, dtb1Var, dtb1Var.getId());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public static final int l0(er51 er51Var, int i) {
        int i2;
        int[] iArr = er51Var.f;
        int i3 = i + 1;
        int length = er51Var.e.length - 1;
        int i4 = 0;
        while (i4 <= length) {
            i2 = (i4 + length) >>> 1;
            int i5 = iArr[i2];
            if (i5 < i3) {
                i4 = i2 + 1;
            } else {
                if (i5 <= i3) {
                    if (i2 >= 0) {
                        return i2;
                    }
                    return ~i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i4) - 1;
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    public static final Next m(String str, gxz0 gxz0Var, ncf ncfVar) {
        goe goeVar = ncfVar.a;
        return Next.i(ncf.a(ncfVar, goe.a(ncfVar.a, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o(goeVar.f, new w8c(str, (byte) 22), new oaf(gxz0Var, (byte) 0)), 0, 4063), null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -2, 7), Effects.a(new yxe[]{new yxe(goeVar.a, str, gxz0Var, ncfVar.e1)}));
    }

    public static final tom m0(z2f z2fVar, w4i1 w4i1Var, String str) {
        long j = z2fVar.c;
        return new tom(String.valueOf(j), str, w4i1Var, j + 1, true, new vol(ihc1.e1(z2fVar.a).toString(), (String) null), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
    }

    public static final rhi0 n(ioj0 ioj0Var, mey0 mey0Var) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        goj0 goj0VarA3;
        goj0 goj0VarA4;
        goj0 goj0VarA5;
        goj0 goj0VarA6;
        goj0 goj0VarA7;
        goj0 goj0VarA8;
        goj0 goj0VarA9;
        String str = mey0Var.c;
        hoj0 hoj0VarC = ioj0Var.c(pjw0.class, str);
        ez00 ez00Var = null;
        pjw0 pjw0Var = (pjw0) ((hoj0VarC == null || (goj0VarA9 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA9.a);
        String str2 = mey0Var.d;
        hoj0 hoj0VarC2 = ioj0Var.c(nbw0.class, str2);
        ez00 ez00Var2 = (hoj0VarC2 == null || (goj0VarA8 = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA8.a;
        if (ez00Var2 == null) {
            hhg1.f(f4i1.f(nbw0.class.getSimpleName(), " not found for uri: ", str2));
            return null;
        }
        nbw0 nbw0Var = (nbw0) ez00Var2;
        hoj0 hoj0VarC3 = ioj0Var.c(nbw0.class, str);
        ez00 ez00Var3 = (hoj0VarC3 == null || (goj0VarA7 = hoj0VarC3.a()) == null) ? null : (ez00) goj0VarA7.a;
        if (ez00Var3 == null) {
            hhg1.f(f4i1.f(nbw0.class.getSimpleName(), " not found for uri: ", str));
            return null;
        }
        nbw0 nbw0Var2 = (nbw0) ez00Var3;
        hoj0 hoj0VarC4 = ioj0Var.c(jo70.class, str);
        ez00 ez00Var4 = (hoj0VarC4 == null || (goj0VarA6 = hoj0VarC4.a()) == null) ? null : (ez00) goj0VarA6.a;
        if (ez00Var4 == null) {
            hhg1.f(f4i1.f(jo70.class.getSimpleName(), " not found for uri: ", str));
            return null;
        }
        jo70 jo70Var = (jo70) ez00Var4;
        hoj0 hoj0VarC5 = ioj0Var.c(mtl.class, str);
        ez00 ez00Var5 = (hoj0VarC5 == null || (goj0VarA5 = hoj0VarC5.a()) == null) ? null : (ez00) goj0VarA5.a;
        if (ez00Var5 == null) {
            hhg1.f(f4i1.f(mtl.class.getSimpleName(), " not found for uri: ", str));
            return null;
        }
        mtl mtlVar = (mtl) ez00Var5;
        hoj0 hoj0VarC6 = ioj0Var.c(prl.class, str);
        prl prlVar = (prl) ((hoj0VarC6 == null || (goj0VarA4 = hoj0VarC6.a()) == null) ? null : (ez00) goj0VarA4.a);
        hoj0 hoj0VarC7 = ioj0Var.c(xkk1.class, str);
        xkk1 xkk1Var = (xkk1) ((hoj0VarC7 == null || (goj0VarA3 = hoj0VarC7.a()) == null) ? null : (ez00) goj0VarA3.a);
        hoj0 hoj0VarC8 = ioj0Var.c(e2k1.class, str);
        e2k1 e2k1Var = (e2k1) ((hoj0VarC8 == null || (goj0VarA2 = hoj0VarC8.a()) == null) ? null : (ez00) goj0VarA2.a);
        hoj0 hoj0VarC9 = ioj0Var.c(hzy.class, str);
        if (hoj0VarC9 != null && (goj0VarA = hoj0VarC9.a()) != null) {
            ez00Var = (ez00) goj0VarA.a;
        }
        return new rhi0(pjw0Var, nbw0Var, nbw0Var2, jo70Var, mtlVar, prlVar, xkk1Var, e2k1Var, (hzy) ez00Var);
    }

    public static final tom n0(a3f a3fVar, w4i1 w4i1Var, String str) {
        long j = a3fVar.c;
        return new tom(String.valueOf(j), str, w4i1Var, j + 1, true, new vol(ihc1.e1(a3fVar.a).toString(), (String) null), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
    }

    public static final List o(List list, iu30 iu30Var, iu30 iu30Var2) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Boolean) iu30Var.invoke(it.next())).booleanValue()) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return list;
        }
        return o7h.N0(o7h.Y0(list, yoi1.Q(i + 1, list.size())), o7h.O0(iu30Var2.invoke(list.get(i)), o7h.Y0(list, yoi1.Q(0, i))));
    }

    public static final tom o0(b3f b3fVar, w4i1 w4i1Var, String str) {
        return new tom(String.valueOf(b3fVar.b), str, w4i1Var, b3fVar.b, true, new vol(ihc1.e1(b3fVar.a).toString(), (String) null), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
    }

    public static hn61 p(Context context, gn61 gn61Var) {
        vm61 vm61Var = gn61Var.d;
        if (vm61Var instanceof vm61) {
            vm61 vm61Var2 = vm61Var;
            String strT = zmo1.t(context, vm61Var2.a, null);
            String str = strT == null ? "" : strT;
            String strT2 = zmo1.t(context, vm61Var2.b, null);
            String str2 = strT2 == null ? "" : strT2;
            String strT3 = zmo1.t(context, vm61Var2.c, null);
            return new hn61((String) null, str, str2, (j2i) null, strT3 == null ? "" : strT3, context.getString(R.string.cancel), (Boolean) null, 201);
        }
        if (vm61Var instanceof zm61) {
            zm61 zm61Var = (zm61) vm61Var;
            String str3 = zm61Var.a;
            String strT4 = zmo1.t(context, zm61Var.b, null);
            String str4 = strT4 == null ? "" : strT4;
            String strT5 = zmo1.t(context, zm61Var.c, null);
            String str5 = strT5 == null ? "" : strT5;
            fj10 fj10Var = zm61Var.d;
            j2i j2iVar = fj10Var != null ? new j2i(1052224122, new gqw0(fj10Var), true) : null;
            String strT6 = zmo1.t(context, zm61Var.e, null);
            return new hn61(str3, str4, str5, j2iVar, strT6 == null ? "" : strT6, zm61Var.g ? context.getString(2131961696) : null, gn61Var.f ? Boolean.FALSE : null, 64);
        }
        if (!(vm61Var instanceof xm61)) {
            eg.o();
            return null;
        }
        xm61 xm61Var = (xm61) vm61Var;
        String strT7 = zmo1.t(context, xm61Var.a, xm61Var.b);
        String str6 = strT7 == null ? "" : strT7;
        String strT8 = zmo1.t(context, xm61Var.c, xm61Var.d);
        String str7 = strT8 == null ? "" : strT8;
        String strT9 = zmo1.t(context, xm61Var.e, xm61Var.f);
        String str8 = strT9 == null ? "" : strT9;
        String strT10 = zmo1.t(context, xm61Var.g, xm61Var.h);
        return new hn61((String) null, str6, str7, (j2i) null, str8, strT10 == null ? "" : strT10, (Boolean) null, 137);
    }

    public static final tom p0(z2f z2fVar, w4i1 w4i1Var, String str) {
        return new tom(String.valueOf(z2fVar.c), str, w4i1Var, z2fVar.c, true, z2fVar.b, new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:124:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:5:0x000e  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #10 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:47:0x00d3, B:49:0x00e1, B:51:0x00e5, B:58:0x00fd, B:60:0x0117, B:62:0x011f, B:69:0x0139, B:71:0x013f, B:74:0x014b, B:76:0x014f, B:77:0x0158, B:65:0x0129, B:67:0x0131, B:99:0x01bb, B:100:0x01c2), top: B:125:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #10 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:47:0x00d3, B:49:0x00e1, B:51:0x00e5, B:58:0x00fd, B:60:0x0117, B:62:0x011f, B:69:0x0139, B:71:0x013f, B:74:0x014b, B:76:0x014f, B:77:0x0158, B:65:0x0129, B:67:0x0131, B:99:0x01bb, B:100:0x01c2), top: B:125:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x014f A[Catch: all -> 0x00f4, Exception -> 0x00f8, TryCatch #10 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:47:0x00d3, B:49:0x00e1, B:51:0x00e5, B:58:0x00fd, B:60:0x0117, B:62:0x011f, B:69:0x0139, B:71:0x013f, B:74:0x014b, B:76:0x014f, B:77:0x0158, B:65:0x0129, B:67:0x0131, B:99:0x01bb, B:100:0x01c2), top: B:125:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0158 A[Catch: all -> 0x00f4, Exception -> 0x00f8, TRY_LEAVE, TryCatch #10 {Exception -> 0x00f8, all -> 0x00f4, blocks: (B:47:0x00d3, B:49:0x00e1, B:51:0x00e5, B:58:0x00fd, B:60:0x0117, B:62:0x011f, B:69:0x0139, B:71:0x013f, B:74:0x014b, B:76:0x014f, B:77:0x0158, B:65:0x0129, B:67:0x0131, B:99:0x01bb, B:100:0x01c2), top: B:125:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:82:0x016c A[Catch: all -> 0x0199, Exception -> 0x019d, TryCatch #11 {Exception -> 0x019d, all -> 0x0199, blocks: (B:79:0x0165, B:82:0x016c, B:85:0x0182, B:87:0x0188, B:95:0x01ad), top: B:124:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01b7  */
    public static en7 q(Context context) throws Throwable {
        en7 en7Var;
        Exception exc;
        Cursor cursor;
        Throwable th;
        Uri uri;
        Uri uri2;
        PackageManager packageManager;
        String installerPackageName;
        Cursor cursorQuery;
        int columnIndex;
        int columnIndex2;
        Method methodQ;
        Object objS;
        Method method;
        Method method2;
        Cursor cursor2 = null;
        try {
            if (!u(context) || (methodQ = fpi1.q("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", new Class[]{Context.class})) == null || (objS = fpi1.s((Object) null, methodQ, new Object[]{context})) == null) {
                en7Var = null;
            } else {
                try {
                    method = objS.getClass().getMethod("getId", (Class[]) Arrays.copyOf(new Class[0], 0));
                } catch (NoSuchMethodException unused) {
                    method = null;
                }
                try {
                    method2 = objS.getClass().getMethod("isLimitAdTrackingEnabled", (Class[]) Arrays.copyOf(new Class[0], 0));
                } catch (NoSuchMethodException unused2) {
                    method2 = null;
                }
                if (method == null || method2 == null) {
                    en7Var = null;
                } else {
                    en7Var = new en7();
                    en7Var.a = (String) fpi1.s(objS, method, new Object[0]);
                    Boolean bool = (Boolean) fpi1.s(objS, method2, new Object[0]);
                    en7Var.e = bool != null ? bool.booleanValue() : false;
                }
            }
        } catch (Exception unused3) {
            wf10 wf10Var = wf10.a;
        }
        if (en7Var == null) {
            if (u(context)) {
                dn7 dn7Var = new dn7();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    try {
                        if (context.bindService(intent, (ServiceConnection) dn7Var, 1)) {
                            try {
                                cn7 cn7Var = new cn7(dn7Var.a());
                                en7 en7Var2 = new en7();
                                en7Var2.a = cn7Var.s();
                                en7Var2.e = cn7Var.B0();
                                context.unbindService(dn7Var);
                                en7Var = en7Var2;
                            } catch (Exception unused4) {
                                wf10 wf10Var2 = wf10.a;
                                context.unbindService(dn7Var);
                                en7Var = null;
                            }
                        } else {
                            en7Var = null;
                        }
                    } catch (Throwable th2) {
                        context.unbindService(dn7Var);
                        throw th2;
                    }
                } catch (SecurityException unused5) {
                }
            } else {
                en7Var = null;
            }
            if (en7Var == null) {
                en7Var = new en7();
            }
        }
        try {
            if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                throw new FacebookException("getAttributionIdentifiers cannot be called on the main thread.");
            }
            en7 en7Var3 = en7.f;
            if (en7Var3 != null && System.currentTimeMillis() - en7Var3.b < 3600000) {
                return en7Var3;
            }
            String[] strArr = {"aid", "androidid", "limit_tracking"};
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
            ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
            if (providerInfoResolveContentProvider == null || !ag10.a(context, providerInfoResolveContentProvider.packageName)) {
                if (providerInfoResolveContentProvider2 == null || !ag10.a(context, providerInfoResolveContentProvider2.packageName)) {
                    uri = null;
                } else {
                    uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                }
                packageManager = context.getPackageManager();
                if (packageManager != null) {
                    installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                } else {
                    installerPackageName = null;
                }
                if (installerPackageName != null) {
                    en7Var.d = installerPackageName;
                }
                if (uri == null) {
                    en7Var.b = System.currentTimeMillis();
                    en7.f = en7Var;
                } else {
                    cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                int columnIndex3 = cursorQuery.getColumnIndex("aid");
                                columnIndex = cursorQuery.getColumnIndex("androidid");
                                columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                                en7Var.c = cursorQuery.getString(columnIndex3);
                                if (columnIndex > 0 && columnIndex2 > 0 && en7Var.a() == null) {
                                    en7Var.a = cursorQuery.getString(columnIndex);
                                    en7Var.e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                                }
                                cursorQuery.close();
                                en7Var.b = System.currentTimeMillis();
                                en7.f = en7Var;
                                return en7Var;
                            }
                        } catch (Exception e) {
                            cursor = cursorQuery;
                            exc = e;
                            try {
                                exc.toString();
                                wf10 wf10Var3 = wf10.a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return null;
                            } catch (Throwable th3) {
                                th = th3;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    throw th;
                                }
                                cursor2.close();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor2 = cursorQuery;
                            th = th;
                            if (cursor2 != null) {
                                throw th;
                            }
                            cursor2.close();
                            throw th;
                        }
                    }
                    en7Var.b = System.currentTimeMillis();
                    en7.f = en7Var;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
                return en7Var;
            }
            uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
            uri = uri2;
            packageManager = context.getPackageManager();
            if (packageManager != null) {
                installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
            } else {
                installerPackageName = null;
            }
            if (installerPackageName != null) {
                en7Var.d = installerPackageName;
            }
            if (uri == null) {
                en7Var.b = System.currentTimeMillis();
                en7.f = en7Var;
            } else {
                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    if (!cursorQuery.moveToFirst()) {
                        int columnIndex4 = cursorQuery.getColumnIndex("aid");
                        columnIndex = cursorQuery.getColumnIndex("androidid");
                        columnIndex2 = cursorQuery.getColumnIndex("limit_tracking");
                        en7Var.c = cursorQuery.getString(columnIndex4);
                        if (columnIndex > 0) {
                            en7Var.a = cursorQuery.getString(columnIndex);
                            en7Var.e = Boolean.parseBoolean(cursorQuery.getString(columnIndex2));
                        }
                        cursorQuery.close();
                        en7Var.b = System.currentTimeMillis();
                        en7.f = en7Var;
                        return en7Var;
                    }
                }
                en7Var.b = System.currentTimeMillis();
                en7.f = en7Var;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return en7Var;
        } catch (Exception e2) {
            exc = e2;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static final kpl q0(s7q0 s7q0Var) {
        epl cplVar;
        if (s7q0Var instanceof i7q0) {
            i7q0 i7q0Var = (i7q0) s7q0Var;
            return new bpl(i7q0Var.a, i7q0Var.b);
        }
        if (s7q0Var instanceof o7q0) {
            o7q0 o7q0Var = (o7q0) s7q0Var;
            return new hpl(o7q0Var.a, o7q0Var.b, o7q0Var.c, o7q0Var.d);
        }
        if (s7q0Var instanceof r7q0) {
            r7q0 r7q0Var = (r7q0) s7q0Var;
            return new jpl(r7q0Var.a, r7q0Var.b, r7q0Var.c);
        }
        if (s7q0Var instanceof q7q0) {
            return new ipl(((q7q0) s7q0Var).a);
        }
        if (s7q0Var instanceof n7q0) {
            return new gpl(((n7q0) s7q0Var).a);
        }
        if (!(s7q0Var instanceof m7q0)) {
            eg.o();
            return null;
        }
        m7q0 m7q0Var = (m7q0) s7q0Var;
        String str = m7q0Var.a;
        long j = m7q0Var.b;
        long j2 = m7q0Var.c;
        l7q0 l7q0Var = m7q0Var.d;
        if (l7q0Var instanceof k7q0) {
            cplVar = new dpl(((k7q0) l7q0Var).a);
        } else {
            if (!(l7q0Var instanceof j7q0)) {
                eg.o();
                return null;
            }
            cplVar = new cpl(((j7q0) l7q0Var).a);
        }
        return new fpl(str, j, j2, cplVar);
    }

    public static final m210 r(String str) {
        return new m210(406, "google-engage", (String) null, (String) null, "app_to_app", "app", "google", (String) null, (String) null, "media_session", str);
    }

    public static final tom r0(a3f a3fVar, w4i1 w4i1Var, String str) {
        String strValueOf = String.valueOf(a3fVar.c);
        long j = a3fVar.c;
        f7q0 f7q0Var = a3fVar.b;
        String str2 = f7q0Var.a;
        sge0 sge0Var = f7q0Var.f;
        bc71 bc71VarT0 = sge0Var != null ? t0(sge0Var) : lb71.a;
        String str3 = f7q0Var.c;
        s7q0 s7q0Var = f7q0Var.e;
        return new tom(strValueOf, str, w4i1Var, j, true, new lpl(str2, bc71VarT0, str3, s7q0Var != null ? q0(s7q0Var) : null, (hmp0) null, (String) null, f7q0Var.d, 48), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
    }

    public static final go80 s(klm klmVar, qbp0 qbp0Var, qbp0 qbp0Var2, qbp0 qbp0Var3) {
        return klmVar.a("AppLanguageSyncDaemon", new iyo0(qbp0Var, qbp0Var2, qbp0Var3, (byte) 8));
    }

    public static final tom s0(g3f g3fVar, w4i1 w4i1Var, String str) {
        String strValueOf = String.valueOf(g3fVar.b);
        long j = g3fVar.b;
        f7q0 f7q0Var = g3fVar.a;
        sge0 sge0Var = f7q0Var.f;
        bc71 bc71VarT0 = sge0Var != null ? t0(sge0Var) : lb71.a;
        String str2 = f7q0Var.c;
        String str3 = f7q0Var.a;
        s7q0 s7q0Var = f7q0Var.e;
        return new tom(strValueOf, str, w4i1Var, j, true, new lpl(str3, bc71VarT0, str2, s7q0Var != null ? q0(s7q0Var) : null, (hmp0) null, (String) null, f7q0Var.d, 48), new pom(false), (ArrayList) null, (ArrayList) null, (nom) null, false, (xo2) null, 3968);
    }

    public static final boolean t(tom tomVar) {
        oom oomVar = tomVar.g;
        return (oomVar instanceof oom) && oomVar.b;
    }

    public static final bc71 t0(sge0 sge0Var) {
        pge0 pge0Var = sge0Var.a;
        String str = sge0Var.d;
        String str2 = sge0Var.c;
        float f = sge0Var.b;
        if (pge0Var instanceof oge0) {
            return lb71.a;
        }
        if (pge0Var instanceof pge0) {
            return new wb71(new rb71(f, new nb71(pge0Var.a)), str2, str);
        }
        if (pge0Var instanceof qge0) {
            return new wb71(new rb71(f, new pb71(((qge0) pge0Var).a)), str2, str);
        }
        eg.o();
        return null;
    }

    public static boolean u(Context context) {
        Method methodQ = fpi1.q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", new Class[]{Context.class});
        if (methodQ != null) {
            Object objS = fpi1.s((Object) null, methodQ, new Object[]{context});
            if ((objS instanceof Integer) && objS.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean v(tom tomVar, tom tomVar2) {
        lpl lplVar = tomVar.f;
        lpl lplVar2 = tomVar2.f;
        if ((lplVar instanceof lpl) && (lplVar2 instanceof lpl)) {
            return u890.j(lplVar.a, lplVar2.a);
        }
        if ((lplVar instanceof vol) && (lplVar2 instanceof vol)) {
            return u890.j(((vol) lplVar).a, ((vol) lplVar2).a);
        }
        return (lplVar instanceof apl) && (lplVar2 instanceof apl) && lplVar.getClass() == lplVar2.getClass() && u890.j(((apl) lplVar).getId(), ((apl) lplVar2).getId());
    }

    public static final boolean w(tom tomVar) {
        pom pomVar = tomVar.g;
        return (pomVar instanceof pom) && pomVar.a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01df  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:128:0x020b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0237  */
    /* JADX WARN: Code duplicated, block: B:133:0x023c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0245  */
    /* JADX WARN: Code duplicated, block: B:138:0x024f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0266  */
    /* JADX WARN: Code duplicated, block: B:148:0x026b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0276  */
    /* JADX WARN: Code duplicated, block: B:154:0x027e  */
    /* JADX WARN: Code duplicated, block: B:157:0x028c  */
    /* JADX WARN: Code duplicated, block: B:159:0x029f  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:173:0x02da  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:178:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:183:0x030a  */
    /* JADX WARN: Code duplicated, block: B:186:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x0331  */
    /* JADX WARN: Code duplicated, block: B:189:0x0339  */
    /* JADX WARN: Code duplicated, block: B:191:0x035a  */
    /* JADX WARN: Code duplicated, block: B:195:0x0362  */
    /* JADX WARN: Code duplicated, block: B:198:0x0371  */
    /* JADX WARN: Code duplicated, block: B:200:0x0377  */
    /* JADX WARN: Code duplicated, block: B:202:0x037d  */
    /* JADX WARN: Code duplicated, block: B:203:0x0381  */
    /* JADX WARN: Code duplicated, block: B:205:0x0384  */
    /* JADX WARN: Code duplicated, block: B:207:0x0390  */
    /* JADX WARN: Code duplicated, block: B:208:0x0395  */
    /* JADX WARN: Code duplicated, block: B:211:0x039a  */
    /* JADX WARN: Code duplicated, block: B:214:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:216:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:219:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:220:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:224:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:227:0x03de  */
    /* JADX WARN: Code duplicated, block: B:229:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:232:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:236:0x03fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x0401  */
    /* JADX WARN: Code duplicated, block: B:240:0x0404 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:241:0x0406  */
    /* JADX WARN: Code duplicated, block: B:242:0x0409  */
    /* JADX WARN: Code duplicated, block: B:243:0x040c  */
    /* JADX WARN: Code duplicated, block: B:245:0x0410  */
    /* JADX WARN: Code duplicated, block: B:247:0x0415  */
    /* JADX WARN: Code duplicated, block: B:250:0x0424  */
    /* JADX WARN: Code duplicated, block: B:251:0x0427  */
    /* JADX WARN: Code duplicated, block: B:254:0x0437  */
    /* JADX WARN: Code duplicated, block: B:256:0x043d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0448  */
    /* JADX WARN: Code duplicated, block: B:260:0x045e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0474  */
    /* JADX WARN: Code duplicated, block: B:264:0x0479  */
    /* JADX WARN: Code duplicated, block: B:267:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:269:0x04be  */
    /* JADX WARN: Code duplicated, block: B:270:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:272:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:275:0x04e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:276:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:277:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:278:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:280:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:285:0x050e  */
    /* JADX WARN: Code duplicated, block: B:286:0x0511  */
    /* JADX WARN: Code duplicated, block: B:289:0x0519 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:314:0x0589  */
    /* JADX WARN: Code duplicated, block: B:317:0x0594  */
    /* JADX WARN: Code duplicated, block: B:319:0x0598  */
    /* JADX WARN: Code duplicated, block: B:320:0x059d  */
    /* JADX WARN: Code duplicated, block: B:323:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:326:0x05c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x05cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:333:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:334:0x05db  */
    /* JADX WARN: Code duplicated, block: B:336:0x05df  */
    /* JADX WARN: Code duplicated, block: B:337:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:340:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:341:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:343:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:344:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:347:0x0609  */
    /* JADX WARN: Code duplicated, block: B:349:0x060e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:350:0x0610  */
    /* JADX WARN: Code duplicated, block: B:351:0x0617  */
    /* JADX WARN: Code duplicated, block: B:353:0x061d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0621  */
    /* JADX WARN: Code duplicated, block: B:356:0x0625  */
    /* JADX WARN: Code duplicated, block: B:361:0x063c  */
    /* JADX WARN: Code duplicated, block: B:363:0x0651  */
    /* JADX WARN: Code duplicated, block: B:366:0x0655 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x065a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:372:0x0660  */
    /* JADX WARN: Code duplicated, block: B:375:0x066f  */
    /* JADX WARN: Code duplicated, block: B:378:0x0678  */
    /* JADX WARN: Code duplicated, block: B:382:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x013e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0194  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c6  */
    public static final hob1 x(mey0 mey0Var, t810 t810Var, rhi0 rhi0Var, yqg yqgVar, fza fzaVar, ytp0 ytp0Var, hvp0 hvp0Var, Function0 function0, vu30 vu30Var) {
        String str;
        nje njeVar;
        boolean z;
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        njw0 njw0Var;
        boolean z6;
        mjw0 mjw0Var;
        vp70 vp70Var;
        String str3;
        String str4;
        boolean z7;
        int i;
        yh10 yh10Var;
        yh10 yh10Var2;
        hzy hzyVar;
        xkk1 xkk1Var;
        nje njeVar2;
        String str5;
        int iC;
        d2k1 d2k1Var;
        vp70 vp70Var2;
        String str6;
        String str7;
        mgo0 mgo0Var;
        Iterator it;
        Object obj;
        ho70 ho70Var;
        Object next;
        ho70 ho70Var2;
        String str8;
        mq70 mq70Var;
        d2k1 d2k1Var2;
        iu30 eei0Var;
        r4p1 r4p1VarH;
        vp70 vp70Var3;
        d2k1 d2k1Var3;
        er00 dr00Var;
        boolean z8;
        boolean z9;
        boolean z10;
        d2k1 d2k1Var4;
        boolean z11;
        d2k1 d2k1Var5;
        d2k1 d2k1Var6;
        d2k1 d2k1Var7;
        d2k1 d2k1Var8;
        d2k1 d2k1VarJ;
        nje njeVar3;
        String str9;
        d2k1 d2k1VarU;
        d2k1 d2k1Var9;
        d2k1 d2k1Var10;
        d2k1 d2k1Var11;
        boolean z12;
        d2k1 d2k1Var12;
        d2k1 m9g1Var;
        pjw0 pjw0Var;
        lsm0 lsm0VarO;
        d2k1 d2k1Var13;
        boolean z13;
        d2k1 d2k1Var14;
        d2k1 d2k1Var15;
        d2k1 d2k1Var16;
        d2k1 d2k1Var17;
        long jP;
        ojw0 ojw0Var;
        boolean z14;
        boolean zA;
        d2k1 d2k1Var18;
        r9g1 r9g1Var;
        boolean z15;
        d2k1 d2k1VarValueOf;
        mjw0 mjw0Var2;
        mjw0 mjw0Var3;
        String str10;
        boolean z16;
        up70 up70VarA;
        d2k1 d2k1Var19 = mey0Var.f;
        d2k1 d2k1Var20 = mey0Var.c;
        zkm zkmVar = t810Var.b;
        boolean z17 = t810Var.g;
        boolean z18 = t810Var.f;
        hwt hwtVar = t810Var.c;
        jo70 jo70Var = rhi0Var.d;
        List list = jo70Var.d;
        io70 io70Var = jo70Var.e;
        pjw0 pjw0Var2 = rhi0Var.a;
        boolean z19 = pjw0Var2 != null;
        prl prlVar = rhi0Var.f;
        nbw0 nbw0Var = rhi0Var.b;
        String str11 = nbw0Var.e;
        Duration duration = nbw0Var.h;
        String str12 = nbw0Var.a;
        nbw0 nbw0Var2 = rhi0Var.c;
        e2k1 e2k1Var = rhi0Var.h;
        xkk1 xkk1Var2 = rhi0Var.g;
        Set set = s4b1.f;
        boolean zG = uic.g(d2k1Var20, blc0.ed);
        ktl ktlVar = rhi0Var.e.a;
        boolean z20 = ktlVar == ktl.b;
        boolean z21 = zG && !z20;
        long jU = 0;
        boolean z22 = z20;
        if (zG) {
            if (io70Var == null || (str = io70Var.a) == null || ihc1.y0(str)) {
                str = null;
            }
            String str13 = nbw0Var2.p.a;
            if (ihc1.y0(str13)) {
                str13 = null;
            }
            String strY0 = o7h.y0(f46.i0(new String[]{str12, str}), " - ", (String) null, (String) null, (iu30) null, 62);
            String str14 = jo70Var.b;
            if (ihc1.y0(str14) || ktlVar != ktl.c) {
                str14 = null;
            }
            long jP2 = duration.p();
            Long lValueOf = Long.valueOf(jP2);
            if (jP2 <= 0) {
                lValueOf = null;
            }
            njeVar = new nje(strY0, str13, str14, lValueOf);
        } else {
            njeVar = new nje((String) null, (String) null, (String) null, (Long) null);
            zkmVar = zkmVar;
        }
        if (!zG) {
            nbw0Var2 = nbw0Var;
        }
        String str15 = nbw0Var2.p.a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((ho70) it2.next()).a);
        }
        if (ihc1.y0(str15)) {
            str15 = null;
        }
        String strY1 = o7h.y0(o7h.N0(p7h.N(str15), arrayList), ", ", (String) null, (String) null, (iu30) null, 62);
        if (!zG) {
            Set set2 = s4b1.f;
            if (!uic.h(d2k1Var20, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6})) {
                strY1 = null;
            } else if (z22 || ihc1.y0(strY1)) {
                strY1 = null;
            }
        } else if (z22) {
            strY1 = null;
        } else {
            strY1 = null;
        }
        Long l = njeVar.d;
        String strE = l != null ? hvp0Var.e(l.longValue()) : null;
        q8i0 q8i0VarB = pjw0Var2 != null ? kno1.B(pjw0Var2, null) : null;
        m8i0 m8i0Var = m8i0.a;
        boolean z23 = z19 && kno1.B(pjw0Var2, hwtVar).equals(m8i0Var);
        if (z23 && t810Var.e) {
            Set set3 = s4b1.f;
            if (!uic.h(d2k1Var20, new blc0[]{blc0.Pg, blc0.Qg, blc0.Rg, blc0.Ug, blc0.Vg, blc0.z6, blc0.B6, blc0.C6}) || (z22 && !z18)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z23 && z18) {
            Set set4 = s4b1.f;
            str2 = strY1;
            boolean z24 = uic.h(d2k1Var20, new blc0[]{blc0.ti, blc0.ui});
            if (!z || z24) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || z21 || (zG && z18)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 || (z18 && z23)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (t810Var.i || (z17 && !t810Var.h)) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z25 = z3;
            String str16 = mey0Var.d;
            if (pjw0Var2 != null) {
                njw0Var = pjw0Var2.b;
            } else {
                njw0Var = null;
            }
            z6 = z4;
            if (njw0Var instanceof mjw0) {
                mjw0Var = (mjw0) njw0Var;
            } else {
                mjw0Var = null;
            }
            vp70Var = vp70.d;
            if (mjw0Var != null || (up70VarA = mjw0Var.a.b.a(vp70Var)) == null) {
                str3 = null;
            } else {
                str3 = up70VarA.a.a;
            }
            str4 = nbw0Var.g;
            z7 = z5;
            i = nbw0Var.l;
            yh10Var = new yh10(str12, str3, (String) null, new ugo0(false, str11, str16, false, false, (String) null, (mgo0) null, 493), 20);
            if (z7) {
                yh10Var2 = yh10Var;
            } else {
                yh10Var2 = null;
            }
            hzyVar = rhi0Var.i;
            if (hzyVar == null) {
                xkk1Var = rhi0Var.g;
                if (xkk1Var == null && (mq70Var = xkk1Var.a) != null) {
                    njeVar2 = njeVar;
                    up70 up70VarA2 = mq70Var.a(vp70.c);
                    str5 = up70VarA2 != null ? up70VarA2.a.a : null;
                    if (str5 == null) {
                        str5 = "";
                    }
                    iC = l1d.C(hzyVar.a);
                    if (iC != 3) {
                        if (iC == 6) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                next = it.next();
                                Iterator it3 = it;
                                ho70Var2 = (ho70) next;
                                if (!ihc1.y0(ho70Var2.a)) {
                                    str8 = ho70Var2.b;
                                    Set set5 = s4b1.f;
                                    if (uic.g(str8, blc0.m2)) {
                                        obj = next;
                                        break;
                                    }
                                }
                                it = it3;
                            }
                            ho70Var = (ho70) obj;
                            if (ho70Var != null) {
                                d2k1Var = d2k1Var20;
                                vp70Var2 = vp70Var;
                                mgo0Var = new mgo0(ho70Var.b, ho70Var.a, 2, str5);
                            }
                        }
                        d2k1Var = d2k1Var20;
                        vp70Var2 = vp70Var;
                    } else {
                        d2k1Var = d2k1Var20;
                        vp70Var2 = vp70Var;
                        if (io70Var != null) {
                            str6 = io70Var.b;
                            str7 = io70Var.a;
                            if (!ihc1.y0(str7)) {
                                Set set6 = s4b1.f;
                                if (uic.g(str6, blc0.fh)) {
                                    mgo0Var = new mgo0(str6, str7, 1, str5);
                                }
                            }
                        }
                    }
                    if (d2k1Var19 == null) {
                        d2k1Var2 = "";
                    } else {
                        d2k1Var2 = d2k1Var19;
                    }
                    boolean z26 = t810Var.g;
                    boolean z27 = t810Var.h;
                    boolean z28 = t810Var.i;
                    boolean z29 = t810Var.j;
                    if (vu30Var != null) {
                        eei0Var = new eei0(vu30Var, mey0Var, (byte) 7);
                    } else {
                        eei0Var = null;
                    }
                    wcm wcmVarP = bpo1.p(d2k1Var2, yh10Var2, z26, z27, z28, z29, function0, null, str12, false, eei0Var, false, mgo0Var, null, 43524);
                    r4p1VarH = fza.h(nbw0Var.j);
                    if (pjw0Var2 != null) {
                        if (q8i0VarB != null) {
                            if (q8i0VarB.equals(l8i0.a)) {
                                String strL = o2p1.l(xkk1Var2, str4);
                                ar00 ar00Var = new ar00(nbw0Var.c, (String) null, upo1.D(nbw0Var), nbw0Var.b, 18);
                                k4m k4mVarF = upo1.F(i);
                                if (hwtVar != null || (hwtVar.d && !hwtVar.e)) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                vp70Var3 = vp70Var2;
                                dr00Var = new cr00(k4mVarF, z16, ar00Var, strL, r4p1VarH);
                            } else {
                                if (!q8i0VarB.equals(m8i0Var)) {
                                    eg.o();
                                    return null;
                                }
                                mjw0Var2 = pjw0Var2.b;
                                if (mjw0Var2 instanceof mjw0) {
                                    mjw0Var3 = mjw0Var2;
                                } else {
                                    mjw0Var3 = null;
                                }
                                if (mjw0Var3 != null) {
                                    mq70 mq70Var2 = mjw0Var3.a.b;
                                    vp70Var3 = vp70Var2;
                                    up70 up70VarA3 = mq70Var2.a(vp70Var3);
                                    str10 = up70VarA3 != null ? up70VarA3.a.a : null;
                                    if (str10 == null) {
                                        str10 = "";
                                    }
                                    dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                                } else {
                                    vp70Var3 = vp70Var2;
                                }
                                if (str10 == null) {
                                    str10 = "";
                                }
                                dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                            }
                            d2k1Var3 = null;
                        } else {
                            vp70Var3 = vp70Var2;
                            d2k1Var3 = null;
                            dr00Var = null;
                        }
                        if (dr00Var != null) {
                            z8 = false;
                        }
                        z9 = dr00Var instanceof dr00;
                        if (z17 || !(dr00Var instanceof cr00)) {
                            z10 = z8;
                        } else {
                            z10 = true;
                        }
                        if (z9) {
                            Set set7 = s4b1.f;
                            d2k1Var4 = d2k1Var;
                            if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                                z11 = true;
                            }
                            String str17 = mey0Var.a;
                            if (zG || io70Var == null) {
                                d2k1Var5 = d2k1Var4;
                            } else {
                                d2k1Var5 = io70Var.b;
                            }
                            if (zG) {
                                d2k1Var6 = d2k1Var3;
                            } else if (d2k1Var19 == null) {
                                d2k1Var6 = d2k1Var4;
                            } else {
                                d2k1Var6 = d2k1Var19;
                            }
                            if (zG) {
                                d2k1Var7 = d2k1Var3;
                            } else {
                                d2k1Var7 = d2k1Var4;
                            }
                            zkm zkmVar2 = zkmVar;
                            boolean zS = p2o1.s(zkmVar2, d2k1Var4);
                            boolean zV = p2o1.v(zkmVar2, d2k1Var4);
                            if (d2k1Var19 == null) {
                                d2k1Var8 = "";
                            } else {
                                d2k1Var8 = d2k1Var19;
                            }
                            boolean zV2 = upo1.v(t810Var, d2k1Var8);
                            k4m k4mVarF2 = upo1.F(i);
                            String str18 = mey0Var.f;
                            if (z9) {
                                if (e2k1Var != null) {
                                    d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                                } else {
                                    d2k1VarValueOf = d2k1Var3;
                                }
                                d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                            } else {
                                d2k1VarJ = d2k1Var3;
                            }
                            boolean z30 = t810Var.g;
                            boolean z31 = t810Var.m;
                            boolean z32 = t810Var.o;
                            njeVar3 = njeVar2;
                            if (str2 == null) {
                                str9 = njeVar3.b;
                            } else {
                                str9 = str2;
                            }
                            lfi0 lfi0VarR = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF2, wcmVarP, str18, d2k1VarJ, false, false, z30, z31, z2, z32, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                            if (z19) {
                                String str19 = mey0Var.a;
                                String str20 = mey0Var.c;
                                gab0 gab0Var = nbw0Var.m;
                                String str21 = gab0Var.a;
                                String str22 = gab0Var.b;
                                if (hwtVar != null) {
                                    z15 = hwtVar.d;
                                } else {
                                    z15 = true;
                                }
                                d2k1VarU = bpo1.u(648, str19, str20, str21, null, str22, null, z15, false, z2, false);
                            } else {
                                d2k1VarU = d2k1Var3;
                            }
                            d2k1Var9 = mey0Var.c;
                            if (zG) {
                                d2k1Var10 = d2k1Var3;
                            } else if (d2k1Var19 == null) {
                                d2k1Var10 = d2k1Var9;
                            } else {
                                d2k1Var10 = d2k1Var19;
                            }
                            if (zG || io70Var == null) {
                                d2k1Var11 = d2k1Var3;
                            } else {
                                d2k1Var11 = io70Var.b;
                            }
                            set0 set0VarS = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                            z12 = z11;
                            if (d2k1Var19 == null) {
                                d2k1Var12 = "";
                            } else {
                                d2k1Var12 = d2k1Var19;
                            }
                            uho uhoVarQ = bpo1.q(d2k1Var12, d2k1Var4, str12);
                            if (pjw0Var2 == null && z9) {
                                boolean z33 = hwtVar != null && hwtVar.d;
                                String str23 = mey0Var.c;
                                if (z) {
                                    r9g1Var = s9g1.a;
                                } else {
                                    d2k1 d2k1Var21 = pjw0Var2.b;
                                    d2k1 d2k1Var22 = d2k1Var21 instanceof mjw0 ? (mjw0) d2k1Var21 : d2k1Var3;
                                    d2k1 d2k1Var23 = d2k1Var22 != null ? ((mjw0) d2k1Var22).b : d2k1Var3;
                                    r9g1Var = new r9g1(d2k1Var23 != null ? jfv.h(((ojw0) d2k1Var23).a) : 0L, d2k1Var23 != null ? jfv.h(((ojw0) d2k1Var23).b) : 0L, bs51.q(pjw0Var2));
                                }
                                m9g1Var = new m9g1(str23, z33, r9g1Var, new w8g1(), t810Var.g);
                            } else {
                                d2k1VarU = d2k1VarU;
                                z12 = z12;
                                m9g1Var = d2k1Var3;
                            }
                            String str24 = mey0Var.b;
                            String str25 = mey0Var.a;
                            if (pjw0Var2 != null) {
                                hwt hwtVar2 = t810Var.c;
                                if (prlVar != null) {
                                    d2k1Var18 = prlVar.c;
                                } else {
                                    d2k1Var18 = d2k1Var3;
                                }
                                lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar2, d2k1Var18);
                                pjw0Var = pjw0Var2;
                            } else {
                                pjw0Var = pjw0Var2;
                                ubw0.a.getClass();
                                lsm0VarO = rbw0.b;
                            }
                            lsm0 lsm0Var = lsm0VarO;
                            long j = (z9 ? z10 == 0 : !z) ? 0L : 1000L;
                            if (t810Var.u) {
                                d2k1Var13 = 3000L;
                            } else {
                                d2k1Var13 = d2k1Var3;
                            }
                            if (pjw0Var != null) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z34 = !t810Var.t;
                            if (io70Var != null) {
                                d2k1Var14 = io70Var.b;
                            } else {
                                d2k1Var14 = d2k1Var3;
                            }
                            if (zG) {
                                d2k1Var15 = d2k1Var14;
                            } else {
                                d2k1Var15 = d2k1Var3;
                            }
                            sbw0 sbw0Var = new sbw0(str24, str25, "", lsm0Var, j, z, z10, z13, z34, d2k1Var15, d2k1Var13);
                            if (!z19) {
                                jP = -1;
                            } else if (z2) {
                                jP = duration.p() * 1000;
                            } else {
                                d2k1Var16 = pjw0Var.b;
                                if (d2k1Var16 instanceof mjw0) {
                                    d2k1Var17 = (mjw0) d2k1Var16;
                                } else {
                                    d2k1Var17 = d2k1Var3;
                                }
                                if (d2k1Var17 != null && (ojw0Var = ((mjw0) d2k1Var17).b) != null) {
                                    jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                                }
                                jP = jU * 1000;
                            }
                            long j2 = jP;
                            if (pjw0Var != null) {
                                zA = dr00Var.a();
                                Set set8 = s4b1.f;
                                if (uic.g(d2k1Var4, blc0.ed)) {
                                    zA = true;
                                }
                                if (zA && !z) {
                                    if (!z22 || z12) {
                                        d2k1Var3 = 2131959807;
                                    } else {
                                        d2k1Var3 = 2131963836;
                                    }
                                }
                            }
                            d2k1 d2k1Var24 = d2k1Var3;
                            boolean z35 = t810Var.g;
                            if (z6 || !upo1.B(hwtVar)) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            return new hob1(str17, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV, zS, dr00Var, zV2, (mbw0) null, lfi0VarR, d2k1VarU, (xfn0) null, set0VarS, wcmVarP, uhoVarQ, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var, j2, z35, false, d2k1Var24, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                        }
                        d2k1Var4 = d2k1Var;
                        z11 = z8;
                        String str110 = mey0Var.a;
                        if (zG) {
                            d2k1Var5 = d2k1Var4;
                        } else {
                            d2k1Var5 = d2k1Var4;
                        }
                        if (zG) {
                            d2k1Var6 = d2k1Var3;
                        } else if (d2k1Var19 == null) {
                            d2k1Var6 = d2k1Var4;
                        } else {
                            d2k1Var6 = d2k1Var19;
                        }
                        if (zG) {
                            d2k1Var7 = d2k1Var3;
                        } else {
                            d2k1Var7 = d2k1Var4;
                        }
                        zkm zkmVar3 = zkmVar;
                        boolean zS2 = p2o1.s(zkmVar3, d2k1Var4);
                        boolean zV3 = p2o1.v(zkmVar3, d2k1Var4);
                        if (d2k1Var19 == null) {
                            d2k1Var8 = "";
                        } else {
                            d2k1Var8 = d2k1Var19;
                        }
                        boolean zV4 = upo1.v(t810Var, d2k1Var8);
                        k4m k4mVarF3 = upo1.F(i);
                        String str111 = mey0Var.f;
                        if (z9) {
                            if (e2k1Var != null) {
                                d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                            } else {
                                d2k1VarValueOf = d2k1Var3;
                            }
                            d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                        } else {
                            d2k1VarJ = d2k1Var3;
                        }
                        boolean z36 = t810Var.g;
                        boolean z37 = t810Var.m;
                        boolean z38 = t810Var.o;
                        njeVar3 = njeVar2;
                        if (str2 == null) {
                            str9 = njeVar3.b;
                        } else {
                            str9 = str2;
                        }
                        lfi0 lfi0VarR2 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF3, wcmVarP, str111, d2k1VarJ, false, false, z36, z37, z2, z38, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                        if (z19) {
                            String str112 = mey0Var.a;
                            String str26 = mey0Var.c;
                            gab0 gab0Var2 = nbw0Var.m;
                            String str27 = gab0Var2.a;
                            String str28 = gab0Var2.b;
                            if (hwtVar != null) {
                                z15 = hwtVar.d;
                            } else {
                                z15 = true;
                            }
                            d2k1VarU = bpo1.u(648, str112, str26, str27, null, str28, null, z15, false, z2, false);
                        } else {
                            d2k1VarU = d2k1Var3;
                        }
                        d2k1Var9 = mey0Var.c;
                        if (zG) {
                            d2k1Var10 = d2k1Var3;
                        } else if (d2k1Var19 == null) {
                            d2k1Var10 = d2k1Var9;
                        } else {
                            d2k1Var10 = d2k1Var19;
                        }
                        if (zG) {
                            d2k1Var11 = d2k1Var3;
                        } else {
                            d2k1Var11 = d2k1Var3;
                        }
                        set0 set0VarS2 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                        z12 = z11;
                        if (d2k1Var19 == null) {
                            d2k1Var12 = "";
                        } else {
                            d2k1Var12 = d2k1Var19;
                        }
                        uho uhoVarQ2 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                        if (pjw0Var2 == null) {
                            d2k1VarU = d2k1VarU;
                            z12 = z12;
                            m9g1Var = d2k1Var3;
                        } else {
                            d2k1VarU = d2k1VarU;
                            z12 = z12;
                            m9g1Var = d2k1Var3;
                        }
                        String str29 = mey0Var.b;
                        String str210 = mey0Var.a;
                        if (pjw0Var2 != null) {
                            hwt hwtVar3 = t810Var.c;
                            if (prlVar != null) {
                                d2k1Var18 = prlVar.c;
                            } else {
                                d2k1Var18 = d2k1Var3;
                            }
                            lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar3, d2k1Var18);
                            pjw0Var = pjw0Var2;
                        } else {
                            pjw0Var = pjw0Var2;
                            ubw0.a.getClass();
                            lsm0VarO = rbw0.b;
                        }
                        lsm0 lsm0Var2 = lsm0VarO;
                        if (z9) {
                        }
                        if (t810Var.u) {
                            d2k1Var13 = 3000L;
                        } else {
                            d2k1Var13 = d2k1Var3;
                        }
                        if (pjw0Var != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z39 = !t810Var.t;
                        if (io70Var != null) {
                            d2k1Var14 = io70Var.b;
                        } else {
                            d2k1Var14 = d2k1Var3;
                        }
                        if (zG) {
                            d2k1Var15 = d2k1Var14;
                        } else {
                            d2k1Var15 = d2k1Var3;
                        }
                        sbw0 sbw0Var2 = new sbw0(str29, str210, "", lsm0Var2, j, z, z10, z13, z39, d2k1Var15, d2k1Var13);
                        if (!z19) {
                            jP = -1;
                        } else if (z2) {
                            jP = duration.p() * 1000;
                        } else {
                            d2k1Var16 = pjw0Var.b;
                            if (d2k1Var16 instanceof mjw0) {
                                d2k1Var17 = (mjw0) d2k1Var16;
                            } else {
                                d2k1Var17 = d2k1Var3;
                            }
                            if (d2k1Var17 != null) {
                                jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                            }
                            jP = jU * 1000;
                        }
                        long j3 = jP;
                        if (pjw0Var != null) {
                            zA = dr00Var.a();
                            Set set9 = s4b1.f;
                            if (uic.g(d2k1Var4, blc0.ed)) {
                                zA = true;
                            }
                            if (zA) {
                                if (z22) {
                                    d2k1Var3 = 2131959807;
                                } else {
                                    d2k1Var3 = 2131959807;
                                }
                            }
                        }
                        d2k1 d2k1Var25 = d2k1Var3;
                        boolean z310 = t810Var.g;
                        if (z6) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        return new hob1(str110, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV3, zS2, dr00Var, zV4, (mbw0) null, lfi0VarR2, d2k1VarU, (xfn0) null, set0VarS2, wcmVarP, uhoVarQ2, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var2, j3, z310, false, d2k1Var25, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                    }
                    vp70Var3 = vp70Var2;
                    d2k1Var3 = null;
                    z8 = false;
                    dr00Var = new dr00(false, upo1.F(i), false, o2p1.k(xkk1Var2, vp70Var3, str4));
                    z9 = dr00Var instanceof dr00;
                    if (z17) {
                        z10 = z8;
                    } else {
                        z10 = z8;
                    }
                    if (z9) {
                        Set set10 = s4b1.f;
                        d2k1Var4 = d2k1Var;
                        if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                            z11 = true;
                        }
                        String str113 = mey0Var.a;
                        if (zG) {
                            d2k1Var5 = d2k1Var4;
                        } else {
                            d2k1Var5 = d2k1Var4;
                        }
                        if (zG) {
                            d2k1Var6 = d2k1Var3;
                        } else if (d2k1Var19 == null) {
                            d2k1Var6 = d2k1Var4;
                        } else {
                            d2k1Var6 = d2k1Var19;
                        }
                        if (zG) {
                            d2k1Var7 = d2k1Var3;
                        } else {
                            d2k1Var7 = d2k1Var4;
                        }
                        zkm zkmVar4 = zkmVar;
                        boolean zS3 = p2o1.s(zkmVar4, d2k1Var4);
                        boolean zV5 = p2o1.v(zkmVar4, d2k1Var4);
                        if (d2k1Var19 == null) {
                            d2k1Var8 = "";
                        } else {
                            d2k1Var8 = d2k1Var19;
                        }
                        boolean zV6 = upo1.v(t810Var, d2k1Var8);
                        k4m k4mVarF4 = upo1.F(i);
                        String str114 = mey0Var.f;
                        if (z9) {
                            if (e2k1Var != null) {
                                d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                            } else {
                                d2k1VarValueOf = d2k1Var3;
                            }
                            d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                        } else {
                            d2k1VarJ = d2k1Var3;
                        }
                        boolean z311 = t810Var.g;
                        boolean z312 = t810Var.m;
                        boolean z313 = t810Var.o;
                        njeVar3 = njeVar2;
                        if (str2 == null) {
                            str9 = njeVar3.b;
                        } else {
                            str9 = str2;
                        }
                        lfi0 lfi0VarR3 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF4, wcmVarP, str114, d2k1VarJ, false, false, z311, z312, z2, z313, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                        if (z19) {
                            String str115 = mey0Var.a;
                            String str211 = mey0Var.c;
                            gab0 gab0Var3 = nbw0Var.m;
                            String str212 = gab0Var3.a;
                            String str213 = gab0Var3.b;
                            if (hwtVar != null) {
                                z15 = hwtVar.d;
                            } else {
                                z15 = true;
                            }
                            d2k1VarU = bpo1.u(648, str115, str211, str212, null, str213, null, z15, false, z2, false);
                        } else {
                            d2k1VarU = d2k1Var3;
                        }
                        d2k1Var9 = mey0Var.c;
                        if (zG) {
                            d2k1Var10 = d2k1Var3;
                        } else if (d2k1Var19 == null) {
                            d2k1Var10 = d2k1Var9;
                        } else {
                            d2k1Var10 = d2k1Var19;
                        }
                        if (zG) {
                            d2k1Var11 = d2k1Var3;
                        } else {
                            d2k1Var11 = d2k1Var3;
                        }
                        set0 set0VarS3 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                        z12 = z11;
                        if (d2k1Var19 == null) {
                            d2k1Var12 = "";
                        } else {
                            d2k1Var12 = d2k1Var19;
                        }
                        uho uhoVarQ3 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                        if (pjw0Var2 == null) {
                            d2k1VarU = d2k1VarU;
                            z12 = z12;
                            m9g1Var = d2k1Var3;
                        } else {
                            d2k1VarU = d2k1VarU;
                            z12 = z12;
                            m9g1Var = d2k1Var3;
                        }
                        String str214 = mey0Var.b;
                        String str215 = mey0Var.a;
                        if (pjw0Var2 != null) {
                            hwt hwtVar4 = t810Var.c;
                            if (prlVar != null) {
                                d2k1Var18 = prlVar.c;
                            } else {
                                d2k1Var18 = d2k1Var3;
                            }
                            lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar4, d2k1Var18);
                            pjw0Var = pjw0Var2;
                        } else {
                            pjw0Var = pjw0Var2;
                            ubw0.a.getClass();
                            lsm0VarO = rbw0.b;
                        }
                        lsm0 lsm0Var3 = lsm0VarO;
                        if (z9) {
                        }
                        if (t810Var.u) {
                            d2k1Var13 = 3000L;
                        } else {
                            d2k1Var13 = d2k1Var3;
                        }
                        if (pjw0Var != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z314 = !t810Var.t;
                        if (io70Var != null) {
                            d2k1Var14 = io70Var.b;
                        } else {
                            d2k1Var14 = d2k1Var3;
                        }
                        if (zG) {
                            d2k1Var15 = d2k1Var14;
                        } else {
                            d2k1Var15 = d2k1Var3;
                        }
                        sbw0 sbw0Var3 = new sbw0(str214, str215, "", lsm0Var3, j, z, z10, z13, z314, d2k1Var15, d2k1Var13);
                        if (!z19) {
                            jP = -1;
                        } else if (z2) {
                            jP = duration.p() * 1000;
                        } else {
                            d2k1Var16 = pjw0Var.b;
                            if (d2k1Var16 instanceof mjw0) {
                                d2k1Var17 = (mjw0) d2k1Var16;
                            } else {
                                d2k1Var17 = d2k1Var3;
                            }
                            if (d2k1Var17 != null) {
                                jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                            }
                            jP = jU * 1000;
                        }
                        long j4 = jP;
                        if (pjw0Var != null) {
                            zA = dr00Var.a();
                            Set set11 = s4b1.f;
                            if (uic.g(d2k1Var4, blc0.ed)) {
                                zA = true;
                            }
                            if (zA) {
                                if (z22) {
                                    d2k1Var3 = 2131959807;
                                } else {
                                    d2k1Var3 = 2131959807;
                                }
                            }
                        }
                        d2k1 d2k1Var26 = d2k1Var3;
                        boolean z315 = t810Var.g;
                        if (z6) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        return new hob1(str113, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV5, zS3, dr00Var, zV6, (mbw0) null, lfi0VarR3, d2k1VarU, (xfn0) null, set0VarS3, wcmVarP, uhoVarQ3, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var3, j4, z315, false, d2k1Var26, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                    }
                    d2k1Var4 = d2k1Var;
                    z11 = z8;
                    String str116 = mey0Var.a;
                    if (zG) {
                        d2k1Var5 = d2k1Var4;
                    } else {
                        d2k1Var5 = d2k1Var4;
                    }
                    if (zG) {
                        d2k1Var6 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var6 = d2k1Var4;
                    } else {
                        d2k1Var6 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var7 = d2k1Var3;
                    } else {
                        d2k1Var7 = d2k1Var4;
                    }
                    zkm zkmVar5 = zkmVar;
                    boolean zS4 = p2o1.s(zkmVar5, d2k1Var4);
                    boolean zV7 = p2o1.v(zkmVar5, d2k1Var4);
                    if (d2k1Var19 == null) {
                        d2k1Var8 = "";
                    } else {
                        d2k1Var8 = d2k1Var19;
                    }
                    boolean zV8 = upo1.v(t810Var, d2k1Var8);
                    k4m k4mVarF5 = upo1.F(i);
                    String str117 = mey0Var.f;
                    if (z9) {
                        if (e2k1Var != null) {
                            d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                        } else {
                            d2k1VarValueOf = d2k1Var3;
                        }
                        d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                    } else {
                        d2k1VarJ = d2k1Var3;
                    }
                    boolean z316 = t810Var.g;
                    boolean z317 = t810Var.m;
                    boolean z318 = t810Var.o;
                    njeVar3 = njeVar2;
                    if (str2 == null) {
                        str9 = njeVar3.b;
                    } else {
                        str9 = str2;
                    }
                    lfi0 lfi0VarR4 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF5, wcmVarP, str117, d2k1VarJ, false, false, z316, z317, z2, z318, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                    if (z19) {
                        String str118 = mey0Var.a;
                        String str216 = mey0Var.c;
                        gab0 gab0Var4 = nbw0Var.m;
                        String str217 = gab0Var4.a;
                        String str218 = gab0Var4.b;
                        if (hwtVar != null) {
                            z15 = hwtVar.d;
                        } else {
                            z15 = true;
                        }
                        d2k1VarU = bpo1.u(648, str118, str216, str217, null, str218, null, z15, false, z2, false);
                    } else {
                        d2k1VarU = d2k1Var3;
                    }
                    d2k1Var9 = mey0Var.c;
                    if (zG) {
                        d2k1Var10 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var10 = d2k1Var9;
                    } else {
                        d2k1Var10 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var11 = d2k1Var3;
                    } else {
                        d2k1Var11 = d2k1Var3;
                    }
                    set0 set0VarS4 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                    z12 = z11;
                    if (d2k1Var19 == null) {
                        d2k1Var12 = "";
                    } else {
                        d2k1Var12 = d2k1Var19;
                    }
                    uho uhoVarQ4 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                    if (pjw0Var2 == null) {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    } else {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    }
                    String str219 = mey0Var.b;
                    String str2110 = mey0Var.a;
                    if (pjw0Var2 != null) {
                        hwt hwtVar5 = t810Var.c;
                        if (prlVar != null) {
                            d2k1Var18 = prlVar.c;
                        } else {
                            d2k1Var18 = d2k1Var3;
                        }
                        lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar5, d2k1Var18);
                        pjw0Var = pjw0Var2;
                    } else {
                        pjw0Var = pjw0Var2;
                        ubw0.a.getClass();
                        lsm0VarO = rbw0.b;
                    }
                    lsm0 lsm0Var4 = lsm0VarO;
                    if (z9) {
                    }
                    if (t810Var.u) {
                        d2k1Var13 = 3000L;
                    } else {
                        d2k1Var13 = d2k1Var3;
                    }
                    if (pjw0Var != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z319 = !t810Var.t;
                    if (io70Var != null) {
                        d2k1Var14 = io70Var.b;
                    } else {
                        d2k1Var14 = d2k1Var3;
                    }
                    if (zG) {
                        d2k1Var15 = d2k1Var14;
                    } else {
                        d2k1Var15 = d2k1Var3;
                    }
                    sbw0 sbw0Var4 = new sbw0(str219, str2110, "", lsm0Var4, j, z, z10, z13, z319, d2k1Var15, d2k1Var13);
                    if (!z19) {
                        jP = -1;
                    } else if (z2) {
                        jP = duration.p() * 1000;
                    } else {
                        d2k1Var16 = pjw0Var.b;
                        if (d2k1Var16 instanceof mjw0) {
                            d2k1Var17 = (mjw0) d2k1Var16;
                        } else {
                            d2k1Var17 = d2k1Var3;
                        }
                        if (d2k1Var17 != null) {
                            jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                        }
                        jP = jU * 1000;
                    }
                    long j5 = jP;
                    if (pjw0Var != null) {
                        zA = dr00Var.a();
                        Set set12 = s4b1.f;
                        if (uic.g(d2k1Var4, blc0.ed)) {
                            zA = true;
                        }
                        if (zA) {
                            if (z22) {
                                d2k1Var3 = 2131959807;
                            } else {
                                d2k1Var3 = 2131959807;
                            }
                        }
                    }
                    d2k1 d2k1Var27 = d2k1Var3;
                    boolean z3110 = t810Var.g;
                    if (z6) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    return new hob1(str116, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV7, zS4, dr00Var, zV8, (mbw0) null, lfi0VarR4, d2k1VarU, (xfn0) null, set0VarS4, wcmVarP, uhoVarQ4, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var4, j5, z3110, false, d2k1Var27, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                }
                njeVar2 = njeVar;
                if (str5 == null) {
                    str5 = "";
                }
                iC = l1d.C(hzyVar.a);
                if (iC != 3) {
                    if (iC == 6) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            next = it.next();
                            Iterator it4 = it;
                            ho70Var2 = (ho70) next;
                            if (!ihc1.y0(ho70Var2.a)) {
                                str8 = ho70Var2.b;
                                Set set13 = s4b1.f;
                                if (uic.g(str8, blc0.m2)) {
                                    obj = next;
                                    break;
                                }
                            }
                            it = it4;
                        }
                        ho70Var = (ho70) obj;
                        if (ho70Var != null) {
                            d2k1Var = d2k1Var20;
                            vp70Var2 = vp70Var;
                            mgo0Var = new mgo0(ho70Var.b, ho70Var.a, 2, str5);
                        }
                    }
                    d2k1Var = d2k1Var20;
                    vp70Var2 = vp70Var;
                } else {
                    d2k1Var = d2k1Var20;
                    vp70Var2 = vp70Var;
                    if (io70Var != null) {
                        str6 = io70Var.b;
                        str7 = io70Var.a;
                        if (!ihc1.y0(str7)) {
                            Set set14 = s4b1.f;
                            if (uic.g(str6, blc0.fh)) {
                                mgo0Var = new mgo0(str6, str7, 1, str5);
                            }
                        }
                    }
                }
                if (d2k1Var19 == null) {
                    d2k1Var2 = "";
                } else {
                    d2k1Var2 = d2k1Var19;
                }
                boolean z210 = t810Var.g;
                boolean z211 = t810Var.h;
                boolean z212 = t810Var.i;
                boolean z213 = t810Var.j;
                if (vu30Var != null) {
                    eei0Var = new eei0(vu30Var, mey0Var, (byte) 7);
                } else {
                    eei0Var = null;
                }
                wcm wcmVarP2 = bpo1.p(d2k1Var2, yh10Var2, z210, z211, z212, z213, function0, null, str12, false, eei0Var, false, mgo0Var, null, 43524);
                r4p1VarH = fza.h(nbw0Var.j);
                if (pjw0Var2 != null) {
                    if (q8i0VarB != null) {
                        if (q8i0VarB.equals(l8i0.a)) {
                            String strL2 = o2p1.l(xkk1Var2, str4);
                            ar00 ar00Var2 = new ar00(nbw0Var.c, (String) null, upo1.D(nbw0Var), nbw0Var.b, 18);
                            k4m k4mVarF6 = upo1.F(i);
                            if (hwtVar != null) {
                                z16 = true;
                            } else {
                                z16 = true;
                            }
                            vp70Var3 = vp70Var2;
                            dr00Var = new cr00(k4mVarF6, z16, ar00Var2, strL2, r4p1VarH);
                        } else {
                            if (!q8i0VarB.equals(m8i0Var)) {
                                eg.o();
                                return null;
                            }
                            mjw0Var2 = pjw0Var2.b;
                            if (mjw0Var2 instanceof mjw0) {
                                mjw0Var3 = mjw0Var2;
                            } else {
                                mjw0Var3 = null;
                            }
                            if (mjw0Var3 != null) {
                                mq70 mq70Var3 = mjw0Var3.a.b;
                                vp70Var3 = vp70Var2;
                                up70 up70VarA4 = mq70Var3.a(vp70Var3);
                                if (up70VarA4 != null) {
                                }
                                if (str10 == null) {
                                    str10 = "";
                                }
                                dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                            } else {
                                vp70Var3 = vp70Var2;
                            }
                            if (str10 == null) {
                                str10 = "";
                            }
                            dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                        }
                        d2k1Var3 = null;
                    } else {
                        vp70Var3 = vp70Var2;
                        d2k1Var3 = null;
                        dr00Var = null;
                    }
                    if (dr00Var != null) {
                        z8 = false;
                    }
                    z9 = dr00Var instanceof dr00;
                    if (z17) {
                        z10 = z8;
                    } else {
                        z10 = z8;
                    }
                    if (z9) {
                        Set set15 = s4b1.f;
                        d2k1Var4 = d2k1Var;
                        if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                            z11 = true;
                        }
                        String str119 = mey0Var.a;
                        if (zG) {
                            d2k1Var5 = d2k1Var4;
                        } else {
                            d2k1Var5 = d2k1Var4;
                        }
                        if (zG) {
                            d2k1Var6 = d2k1Var3;
                        } else if (d2k1Var19 == null) {
                            d2k1Var6 = d2k1Var4;
                        } else {
                            d2k1Var6 = d2k1Var19;
                        }
                        if (zG) {
                            d2k1Var7 = d2k1Var3;
                        } else {
                            d2k1Var7 = d2k1Var4;
                        }
                        zkm zkmVar6 = zkmVar;
                        boolean zS5 = p2o1.s(zkmVar6, d2k1Var4);
                        boolean zV9 = p2o1.v(zkmVar6, d2k1Var4);
                        if (d2k1Var19 == null) {
                            d2k1Var8 = "";
                        } else {
                            d2k1Var8 = d2k1Var19;
                        }
                        boolean zV10 = upo1.v(t810Var, d2k1Var8);
                        k4m k4mVarF7 = upo1.F(i);
                        String str1110 = mey0Var.f;
                        if (z9) {
                            if (e2k1Var != null) {
                                d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                            } else {
                                d2k1VarValueOf = d2k1Var3;
                            }
                            d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                        } else {
                            d2k1VarJ = d2k1Var3;
                        }
                        boolean z3111 = t810Var.g;
                        boolean z3112 = t810Var.m;
                        boolean z3113 = t810Var.o;
                        njeVar3 = njeVar2;
                        if (str2 == null) {
                            str9 = njeVar3.b;
                        } else {
                            str9 = str2;
                        }
                        lfi0 lfi0VarR5 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF7, wcmVarP2, str1110, d2k1VarJ, false, false, z3111, z3112, z2, z3113, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                        if (z19) {
                            String str1111 = mey0Var.a;
                            String str2111 = mey0Var.c;
                            gab0 gab0Var5 = nbw0Var.m;
                            String str2112 = gab0Var5.a;
                            String str2113 = gab0Var5.b;
                            if (hwtVar != null) {
                                z15 = hwtVar.d;
                            } else {
                                z15 = true;
                            }
                            d2k1VarU = bpo1.u(648, str1111, str2111, str2112, null, str2113, null, z15, false, z2, false);
                        } else {
                            d2k1VarU = d2k1Var3;
                        }
                        d2k1Var9 = mey0Var.c;
                        if (zG) {
                            d2k1Var10 = d2k1Var3;
                        } else if (d2k1Var19 == null) {
                            d2k1Var10 = d2k1Var9;
                        } else {
                            d2k1Var10 = d2k1Var19;
                        }
                        if (zG) {
                            d2k1Var11 = d2k1Var3;
                        } else {
                            d2k1Var11 = d2k1Var3;
                        }
                        set0 set0VarS5 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                        z12 = z11;
                        if (d2k1Var19 == null) {
                            d2k1Var12 = "";
                        } else {
                            d2k1Var12 = d2k1Var19;
                        }
                        uho uhoVarQ5 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                        if (pjw0Var2 == null) {
                            d2k1VarU = d2k1VarU;
                            z12 = z12;
                            m9g1Var = d2k1Var3;
                        } else {
                            d2k1VarU = d2k1VarU;
                            z12 = z12;
                            m9g1Var = d2k1Var3;
                        }
                        String str2114 = mey0Var.b;
                        String str2115 = mey0Var.a;
                        if (pjw0Var2 != null) {
                            hwt hwtVar6 = t810Var.c;
                            if (prlVar != null) {
                                d2k1Var18 = prlVar.c;
                            } else {
                                d2k1Var18 = d2k1Var3;
                            }
                            lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar6, d2k1Var18);
                            pjw0Var = pjw0Var2;
                        } else {
                            pjw0Var = pjw0Var2;
                            ubw0.a.getClass();
                            lsm0VarO = rbw0.b;
                        }
                        lsm0 lsm0Var5 = lsm0VarO;
                        if (z9) {
                        }
                        if (t810Var.u) {
                            d2k1Var13 = 3000L;
                        } else {
                            d2k1Var13 = d2k1Var3;
                        }
                        if (pjw0Var != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z3114 = !t810Var.t;
                        if (io70Var != null) {
                            d2k1Var14 = io70Var.b;
                        } else {
                            d2k1Var14 = d2k1Var3;
                        }
                        if (zG) {
                            d2k1Var15 = d2k1Var14;
                        } else {
                            d2k1Var15 = d2k1Var3;
                        }
                        sbw0 sbw0Var5 = new sbw0(str2114, str2115, "", lsm0Var5, j, z, z10, z13, z3114, d2k1Var15, d2k1Var13);
                        if (!z19) {
                            jP = -1;
                        } else if (z2) {
                            jP = duration.p() * 1000;
                        } else {
                            d2k1Var16 = pjw0Var.b;
                            if (d2k1Var16 instanceof mjw0) {
                                d2k1Var17 = (mjw0) d2k1Var16;
                            } else {
                                d2k1Var17 = d2k1Var3;
                            }
                            if (d2k1Var17 != null) {
                                jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                            }
                            jP = jU * 1000;
                        }
                        long j6 = jP;
                        if (pjw0Var != null) {
                            zA = dr00Var.a();
                            Set set16 = s4b1.f;
                            if (uic.g(d2k1Var4, blc0.ed)) {
                                zA = true;
                            }
                            if (zA) {
                                if (z22) {
                                    d2k1Var3 = 2131959807;
                                } else {
                                    d2k1Var3 = 2131959807;
                                }
                            }
                        }
                        d2k1 d2k1Var28 = d2k1Var3;
                        boolean z3115 = t810Var.g;
                        if (z6) {
                            z14 = false;
                        } else {
                            z14 = false;
                        }
                        return new hob1(str119, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV9, zS5, dr00Var, zV10, (mbw0) null, lfi0VarR5, d2k1VarU, (xfn0) null, set0VarS5, wcmVarP2, uhoVarQ5, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var5, j6, z3115, false, d2k1Var28, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                    }
                    d2k1Var4 = d2k1Var;
                    z11 = z8;
                    String str1112 = mey0Var.a;
                    if (zG) {
                        d2k1Var5 = d2k1Var4;
                    } else {
                        d2k1Var5 = d2k1Var4;
                    }
                    if (zG) {
                        d2k1Var6 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var6 = d2k1Var4;
                    } else {
                        d2k1Var6 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var7 = d2k1Var3;
                    } else {
                        d2k1Var7 = d2k1Var4;
                    }
                    zkm zkmVar7 = zkmVar;
                    boolean zS6 = p2o1.s(zkmVar7, d2k1Var4);
                    boolean zV11 = p2o1.v(zkmVar7, d2k1Var4);
                    if (d2k1Var19 == null) {
                        d2k1Var8 = "";
                    } else {
                        d2k1Var8 = d2k1Var19;
                    }
                    boolean zV12 = upo1.v(t810Var, d2k1Var8);
                    k4m k4mVarF8 = upo1.F(i);
                    String str1113 = mey0Var.f;
                    if (z9) {
                        if (e2k1Var != null) {
                            d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                        } else {
                            d2k1VarValueOf = d2k1Var3;
                        }
                        d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                    } else {
                        d2k1VarJ = d2k1Var3;
                    }
                    boolean z3116 = t810Var.g;
                    boolean z3117 = t810Var.m;
                    boolean z3118 = t810Var.o;
                    njeVar3 = njeVar2;
                    if (str2 == null) {
                        str9 = njeVar3.b;
                    } else {
                        str9 = str2;
                    }
                    lfi0 lfi0VarR6 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF8, wcmVarP2, str1113, d2k1VarJ, false, false, z3116, z3117, z2, z3118, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                    if (z19) {
                        String str1114 = mey0Var.a;
                        String str2116 = mey0Var.c;
                        gab0 gab0Var6 = nbw0Var.m;
                        String str2117 = gab0Var6.a;
                        String str2118 = gab0Var6.b;
                        if (hwtVar != null) {
                            z15 = hwtVar.d;
                        } else {
                            z15 = true;
                        }
                        d2k1VarU = bpo1.u(648, str1114, str2116, str2117, null, str2118, null, z15, false, z2, false);
                    } else {
                        d2k1VarU = d2k1Var3;
                    }
                    d2k1Var9 = mey0Var.c;
                    if (zG) {
                        d2k1Var10 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var10 = d2k1Var9;
                    } else {
                        d2k1Var10 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var11 = d2k1Var3;
                    } else {
                        d2k1Var11 = d2k1Var3;
                    }
                    set0 set0VarS6 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                    z12 = z11;
                    if (d2k1Var19 == null) {
                        d2k1Var12 = "";
                    } else {
                        d2k1Var12 = d2k1Var19;
                    }
                    uho uhoVarQ6 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                    if (pjw0Var2 == null) {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    } else {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    }
                    String str2119 = mey0Var.b;
                    String str21110 = mey0Var.a;
                    if (pjw0Var2 != null) {
                        hwt hwtVar7 = t810Var.c;
                        if (prlVar != null) {
                            d2k1Var18 = prlVar.c;
                        } else {
                            d2k1Var18 = d2k1Var3;
                        }
                        lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar7, d2k1Var18);
                        pjw0Var = pjw0Var2;
                    } else {
                        pjw0Var = pjw0Var2;
                        ubw0.a.getClass();
                        lsm0VarO = rbw0.b;
                    }
                    lsm0 lsm0Var6 = lsm0VarO;
                    if (z9) {
                    }
                    if (t810Var.u) {
                        d2k1Var13 = 3000L;
                    } else {
                        d2k1Var13 = d2k1Var3;
                    }
                    if (pjw0Var != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z3119 = !t810Var.t;
                    if (io70Var != null) {
                        d2k1Var14 = io70Var.b;
                    } else {
                        d2k1Var14 = d2k1Var3;
                    }
                    if (zG) {
                        d2k1Var15 = d2k1Var14;
                    } else {
                        d2k1Var15 = d2k1Var3;
                    }
                    sbw0 sbw0Var6 = new sbw0(str2119, str21110, "", lsm0Var6, j, z, z10, z13, z3119, d2k1Var15, d2k1Var13);
                    if (!z19) {
                        jP = -1;
                    } else if (z2) {
                        jP = duration.p() * 1000;
                    } else {
                        d2k1Var16 = pjw0Var.b;
                        if (d2k1Var16 instanceof mjw0) {
                            d2k1Var17 = (mjw0) d2k1Var16;
                        } else {
                            d2k1Var17 = d2k1Var3;
                        }
                        if (d2k1Var17 != null) {
                            jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                        }
                        jP = jU * 1000;
                    }
                    long j7 = jP;
                    if (pjw0Var != null) {
                        zA = dr00Var.a();
                        Set set17 = s4b1.f;
                        if (uic.g(d2k1Var4, blc0.ed)) {
                            zA = true;
                        }
                        if (zA) {
                            if (z22) {
                                d2k1Var3 = 2131959807;
                            } else {
                                d2k1Var3 = 2131959807;
                            }
                        }
                    }
                    d2k1 d2k1Var29 = d2k1Var3;
                    boolean z31110 = t810Var.g;
                    if (z6) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    return new hob1(str1112, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV11, zS6, dr00Var, zV12, (mbw0) null, lfi0VarR6, d2k1VarU, (xfn0) null, set0VarS6, wcmVarP2, uhoVarQ6, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var6, j7, z31110, false, d2k1Var29, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                }
                vp70Var3 = vp70Var2;
                d2k1Var3 = null;
                z8 = false;
                dr00Var = new dr00(false, upo1.F(i), false, o2p1.k(xkk1Var2, vp70Var3, str4));
                z9 = dr00Var instanceof dr00;
                if (z17) {
                    z10 = z8;
                } else {
                    z10 = z8;
                }
                if (z9) {
                    Set set18 = s4b1.f;
                    d2k1Var4 = d2k1Var;
                    if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                        z11 = true;
                    }
                    String str1115 = mey0Var.a;
                    if (zG) {
                        d2k1Var5 = d2k1Var4;
                    } else {
                        d2k1Var5 = d2k1Var4;
                    }
                    if (zG) {
                        d2k1Var6 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var6 = d2k1Var4;
                    } else {
                        d2k1Var6 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var7 = d2k1Var3;
                    } else {
                        d2k1Var7 = d2k1Var4;
                    }
                    zkm zkmVar8 = zkmVar;
                    boolean zS7 = p2o1.s(zkmVar8, d2k1Var4);
                    boolean zV13 = p2o1.v(zkmVar8, d2k1Var4);
                    if (d2k1Var19 == null) {
                        d2k1Var8 = "";
                    } else {
                        d2k1Var8 = d2k1Var19;
                    }
                    boolean zV14 = upo1.v(t810Var, d2k1Var8);
                    k4m k4mVarF9 = upo1.F(i);
                    String str1116 = mey0Var.f;
                    if (z9) {
                        if (e2k1Var != null) {
                            d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                        } else {
                            d2k1VarValueOf = d2k1Var3;
                        }
                        d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                    } else {
                        d2k1VarJ = d2k1Var3;
                    }
                    boolean z31111 = t810Var.g;
                    boolean z31112 = t810Var.m;
                    boolean z31113 = t810Var.o;
                    njeVar3 = njeVar2;
                    if (str2 == null) {
                        str9 = njeVar3.b;
                    } else {
                        str9 = str2;
                    }
                    lfi0 lfi0VarR7 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF9, wcmVarP2, str1116, d2k1VarJ, false, false, z31111, z31112, z2, z31113, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                    if (z19) {
                        String str1117 = mey0Var.a;
                        String str21111 = mey0Var.c;
                        gab0 gab0Var7 = nbw0Var.m;
                        String str21112 = gab0Var7.a;
                        String str21113 = gab0Var7.b;
                        if (hwtVar != null) {
                            z15 = hwtVar.d;
                        } else {
                            z15 = true;
                        }
                        d2k1VarU = bpo1.u(648, str1117, str21111, str21112, null, str21113, null, z15, false, z2, false);
                    } else {
                        d2k1VarU = d2k1Var3;
                    }
                    d2k1Var9 = mey0Var.c;
                    if (zG) {
                        d2k1Var10 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var10 = d2k1Var9;
                    } else {
                        d2k1Var10 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var11 = d2k1Var3;
                    } else {
                        d2k1Var11 = d2k1Var3;
                    }
                    set0 set0VarS7 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                    z12 = z11;
                    if (d2k1Var19 == null) {
                        d2k1Var12 = "";
                    } else {
                        d2k1Var12 = d2k1Var19;
                    }
                    uho uhoVarQ7 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                    if (pjw0Var2 == null) {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    } else {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    }
                    String str21114 = mey0Var.b;
                    String str21115 = mey0Var.a;
                    if (pjw0Var2 != null) {
                        hwt hwtVar8 = t810Var.c;
                        if (prlVar != null) {
                            d2k1Var18 = prlVar.c;
                        } else {
                            d2k1Var18 = d2k1Var3;
                        }
                        lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar8, d2k1Var18);
                        pjw0Var = pjw0Var2;
                    } else {
                        pjw0Var = pjw0Var2;
                        ubw0.a.getClass();
                        lsm0VarO = rbw0.b;
                    }
                    lsm0 lsm0Var7 = lsm0VarO;
                    if (z9) {
                    }
                    if (t810Var.u) {
                        d2k1Var13 = 3000L;
                    } else {
                        d2k1Var13 = d2k1Var3;
                    }
                    if (pjw0Var != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z31114 = !t810Var.t;
                    if (io70Var != null) {
                        d2k1Var14 = io70Var.b;
                    } else {
                        d2k1Var14 = d2k1Var3;
                    }
                    if (zG) {
                        d2k1Var15 = d2k1Var14;
                    } else {
                        d2k1Var15 = d2k1Var3;
                    }
                    sbw0 sbw0Var7 = new sbw0(str21114, str21115, "", lsm0Var7, j, z, z10, z13, z31114, d2k1Var15, d2k1Var13);
                    if (!z19) {
                        jP = -1;
                    } else if (z2) {
                        jP = duration.p() * 1000;
                    } else {
                        d2k1Var16 = pjw0Var.b;
                        if (d2k1Var16 instanceof mjw0) {
                            d2k1Var17 = (mjw0) d2k1Var16;
                        } else {
                            d2k1Var17 = d2k1Var3;
                        }
                        if (d2k1Var17 != null) {
                            jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                        }
                        jP = jU * 1000;
                    }
                    long j8 = jP;
                    if (pjw0Var != null) {
                        zA = dr00Var.a();
                        Set set19 = s4b1.f;
                        if (uic.g(d2k1Var4, blc0.ed)) {
                            zA = true;
                        }
                        if (zA) {
                            if (z22) {
                                d2k1Var3 = 2131959807;
                            } else {
                                d2k1Var3 = 2131959807;
                            }
                        }
                    }
                    d2k1 d2k1Var210 = d2k1Var3;
                    boolean z31115 = t810Var.g;
                    if (z6) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    return new hob1(str1115, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV13, zS7, dr00Var, zV14, (mbw0) null, lfi0VarR7, d2k1VarU, (xfn0) null, set0VarS7, wcmVarP2, uhoVarQ7, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var7, j8, z31115, false, d2k1Var210, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                }
                d2k1Var4 = d2k1Var;
                z11 = z8;
                String str1118 = mey0Var.a;
                if (zG) {
                    d2k1Var5 = d2k1Var4;
                } else {
                    d2k1Var5 = d2k1Var4;
                }
                if (zG) {
                    d2k1Var6 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var6 = d2k1Var4;
                } else {
                    d2k1Var6 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var7 = d2k1Var3;
                } else {
                    d2k1Var7 = d2k1Var4;
                }
                zkm zkmVar9 = zkmVar;
                boolean zS8 = p2o1.s(zkmVar9, d2k1Var4);
                boolean zV15 = p2o1.v(zkmVar9, d2k1Var4);
                if (d2k1Var19 == null) {
                    d2k1Var8 = "";
                } else {
                    d2k1Var8 = d2k1Var19;
                }
                boolean zV16 = upo1.v(t810Var, d2k1Var8);
                k4m k4mVarF10 = upo1.F(i);
                String str1119 = mey0Var.f;
                if (z9) {
                    if (e2k1Var != null) {
                        d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                    } else {
                        d2k1VarValueOf = d2k1Var3;
                    }
                    d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                } else {
                    d2k1VarJ = d2k1Var3;
                }
                boolean z31116 = t810Var.g;
                boolean z31117 = t810Var.m;
                boolean z31118 = t810Var.o;
                njeVar3 = njeVar2;
                if (str2 == null) {
                    str9 = njeVar3.b;
                } else {
                    str9 = str2;
                }
                lfi0 lfi0VarR8 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF10, wcmVarP2, str1119, d2k1VarJ, false, false, z31116, z31117, z2, z31118, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                if (z19) {
                    String str11110 = mey0Var.a;
                    String str21116 = mey0Var.c;
                    gab0 gab0Var8 = nbw0Var.m;
                    String str21117 = gab0Var8.a;
                    String str21118 = gab0Var8.b;
                    if (hwtVar != null) {
                        z15 = hwtVar.d;
                    } else {
                        z15 = true;
                    }
                    d2k1VarU = bpo1.u(648, str11110, str21116, str21117, null, str21118, null, z15, false, z2, false);
                } else {
                    d2k1VarU = d2k1Var3;
                }
                d2k1Var9 = mey0Var.c;
                if (zG) {
                    d2k1Var10 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var10 = d2k1Var9;
                } else {
                    d2k1Var10 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var11 = d2k1Var3;
                } else {
                    d2k1Var11 = d2k1Var3;
                }
                set0 set0VarS8 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                z12 = z11;
                if (d2k1Var19 == null) {
                    d2k1Var12 = "";
                } else {
                    d2k1Var12 = d2k1Var19;
                }
                uho uhoVarQ8 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                if (pjw0Var2 == null) {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                } else {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                }
                String str21119 = mey0Var.b;
                String str211110 = mey0Var.a;
                if (pjw0Var2 != null) {
                    hwt hwtVar9 = t810Var.c;
                    if (prlVar != null) {
                        d2k1Var18 = prlVar.c;
                    } else {
                        d2k1Var18 = d2k1Var3;
                    }
                    lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar9, d2k1Var18);
                    pjw0Var = pjw0Var2;
                } else {
                    pjw0Var = pjw0Var2;
                    ubw0.a.getClass();
                    lsm0VarO = rbw0.b;
                }
                lsm0 lsm0Var8 = lsm0VarO;
                if (z9) {
                }
                if (t810Var.u) {
                    d2k1Var13 = 3000L;
                } else {
                    d2k1Var13 = d2k1Var3;
                }
                if (pjw0Var != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z31119 = !t810Var.t;
                if (io70Var != null) {
                    d2k1Var14 = io70Var.b;
                } else {
                    d2k1Var14 = d2k1Var3;
                }
                if (zG) {
                    d2k1Var15 = d2k1Var14;
                } else {
                    d2k1Var15 = d2k1Var3;
                }
                sbw0 sbw0Var8 = new sbw0(str21119, str211110, "", lsm0Var8, j, z, z10, z13, z31119, d2k1Var15, d2k1Var13);
                if (!z19) {
                    jP = -1;
                } else if (z2) {
                    jP = duration.p() * 1000;
                } else {
                    d2k1Var16 = pjw0Var.b;
                    if (d2k1Var16 instanceof mjw0) {
                        d2k1Var17 = (mjw0) d2k1Var16;
                    } else {
                        d2k1Var17 = d2k1Var3;
                    }
                    if (d2k1Var17 != null) {
                        jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                    }
                    jP = jU * 1000;
                }
                long j9 = jP;
                if (pjw0Var != null) {
                    zA = dr00Var.a();
                    Set set110 = s4b1.f;
                    if (uic.g(d2k1Var4, blc0.ed)) {
                        zA = true;
                    }
                    if (zA) {
                        if (z22) {
                            d2k1Var3 = 2131959807;
                        } else {
                            d2k1Var3 = 2131959807;
                        }
                    }
                }
                d2k1 d2k1Var211 = d2k1Var3;
                boolean z311110 = t810Var.g;
                if (z6) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                return new hob1(str1118, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV15, zS8, dr00Var, zV16, (mbw0) null, lfi0VarR8, d2k1VarU, (xfn0) null, set0VarS8, wcmVarP2, uhoVarQ8, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var8, j9, z311110, false, d2k1Var211, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
            }
            d2k1Var = d2k1Var20;
            vp70Var2 = vp70Var;
            njeVar2 = njeVar;
            mgo0Var = null;
            if (d2k1Var19 == null) {
                d2k1Var2 = "";
            } else {
                d2k1Var2 = d2k1Var19;
            }
            boolean z214 = t810Var.g;
            boolean z215 = t810Var.h;
            boolean z216 = t810Var.i;
            boolean z217 = t810Var.j;
            if (vu30Var != null) {
                eei0Var = new eei0(vu30Var, mey0Var, (byte) 7);
            } else {
                eei0Var = null;
            }
            wcm wcmVarP3 = bpo1.p(d2k1Var2, yh10Var2, z214, z215, z216, z217, function0, null, str12, false, eei0Var, false, mgo0Var, null, 43524);
            r4p1VarH = fza.h(nbw0Var.j);
            if (pjw0Var2 != null) {
                if (q8i0VarB != null) {
                    if (q8i0VarB.equals(l8i0.a)) {
                        String strL3 = o2p1.l(xkk1Var2, str4);
                        ar00 ar00Var3 = new ar00(nbw0Var.c, (String) null, upo1.D(nbw0Var), nbw0Var.b, 18);
                        k4m k4mVarF11 = upo1.F(i);
                        if (hwtVar != null) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        vp70Var3 = vp70Var2;
                        dr00Var = new cr00(k4mVarF11, z16, ar00Var3, strL3, r4p1VarH);
                    } else {
                        if (!q8i0VarB.equals(m8i0Var)) {
                            eg.o();
                            return null;
                        }
                        mjw0Var2 = pjw0Var2.b;
                        if (mjw0Var2 instanceof mjw0) {
                            mjw0Var3 = mjw0Var2;
                        } else {
                            mjw0Var3 = null;
                        }
                        if (mjw0Var3 != null) {
                            mq70 mq70Var4 = mjw0Var3.a.b;
                            vp70Var3 = vp70Var2;
                            up70 up70VarA5 = mq70Var4.a(vp70Var3);
                            if (up70VarA5 != null) {
                            }
                            if (str10 == null) {
                                str10 = "";
                            }
                            dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                        } else {
                            vp70Var3 = vp70Var2;
                        }
                        if (str10 == null) {
                            str10 = "";
                        }
                        dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                    }
                    d2k1Var3 = null;
                } else {
                    vp70Var3 = vp70Var2;
                    d2k1Var3 = null;
                    dr00Var = null;
                }
                if (dr00Var != null) {
                    z8 = false;
                }
                z9 = dr00Var instanceof dr00;
                if (z17) {
                    z10 = z8;
                } else {
                    z10 = z8;
                }
                if (z9) {
                    Set set111 = s4b1.f;
                    d2k1Var4 = d2k1Var;
                    if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                        z11 = true;
                    }
                    String str11111 = mey0Var.a;
                    if (zG) {
                        d2k1Var5 = d2k1Var4;
                    } else {
                        d2k1Var5 = d2k1Var4;
                    }
                    if (zG) {
                        d2k1Var6 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var6 = d2k1Var4;
                    } else {
                        d2k1Var6 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var7 = d2k1Var3;
                    } else {
                        d2k1Var7 = d2k1Var4;
                    }
                    zkm zkmVar10 = zkmVar;
                    boolean zS9 = p2o1.s(zkmVar10, d2k1Var4);
                    boolean zV17 = p2o1.v(zkmVar10, d2k1Var4);
                    if (d2k1Var19 == null) {
                        d2k1Var8 = "";
                    } else {
                        d2k1Var8 = d2k1Var19;
                    }
                    boolean zV18 = upo1.v(t810Var, d2k1Var8);
                    k4m k4mVarF12 = upo1.F(i);
                    String str11112 = mey0Var.f;
                    if (z9) {
                        if (e2k1Var != null) {
                            d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                        } else {
                            d2k1VarValueOf = d2k1Var3;
                        }
                        d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                    } else {
                        d2k1VarJ = d2k1Var3;
                    }
                    boolean z311111 = t810Var.g;
                    boolean z311112 = t810Var.m;
                    boolean z311113 = t810Var.o;
                    njeVar3 = njeVar2;
                    if (str2 == null) {
                        str9 = njeVar3.b;
                    } else {
                        str9 = str2;
                    }
                    lfi0 lfi0VarR9 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF12, wcmVarP3, str11112, d2k1VarJ, false, false, z311111, z311112, z2, z311113, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                    if (z19) {
                        String str11113 = mey0Var.a;
                        String str211111 = mey0Var.c;
                        gab0 gab0Var9 = nbw0Var.m;
                        String str211112 = gab0Var9.a;
                        String str211113 = gab0Var9.b;
                        if (hwtVar != null) {
                            z15 = hwtVar.d;
                        } else {
                            z15 = true;
                        }
                        d2k1VarU = bpo1.u(648, str11113, str211111, str211112, null, str211113, null, z15, false, z2, false);
                    } else {
                        d2k1VarU = d2k1Var3;
                    }
                    d2k1Var9 = mey0Var.c;
                    if (zG) {
                        d2k1Var10 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var10 = d2k1Var9;
                    } else {
                        d2k1Var10 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var11 = d2k1Var3;
                    } else {
                        d2k1Var11 = d2k1Var3;
                    }
                    set0 set0VarS9 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                    z12 = z11;
                    if (d2k1Var19 == null) {
                        d2k1Var12 = "";
                    } else {
                        d2k1Var12 = d2k1Var19;
                    }
                    uho uhoVarQ9 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                    if (pjw0Var2 == null) {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    } else {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    }
                    String str211114 = mey0Var.b;
                    String str211115 = mey0Var.a;
                    if (pjw0Var2 != null) {
                        hwt hwtVar10 = t810Var.c;
                        if (prlVar != null) {
                            d2k1Var18 = prlVar.c;
                        } else {
                            d2k1Var18 = d2k1Var3;
                        }
                        lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar10, d2k1Var18);
                        pjw0Var = pjw0Var2;
                    } else {
                        pjw0Var = pjw0Var2;
                        ubw0.a.getClass();
                        lsm0VarO = rbw0.b;
                    }
                    lsm0 lsm0Var9 = lsm0VarO;
                    if (z9) {
                    }
                    if (t810Var.u) {
                        d2k1Var13 = 3000L;
                    } else {
                        d2k1Var13 = d2k1Var3;
                    }
                    if (pjw0Var != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z311114 = !t810Var.t;
                    if (io70Var != null) {
                        d2k1Var14 = io70Var.b;
                    } else {
                        d2k1Var14 = d2k1Var3;
                    }
                    if (zG) {
                        d2k1Var15 = d2k1Var14;
                    } else {
                        d2k1Var15 = d2k1Var3;
                    }
                    sbw0 sbw0Var9 = new sbw0(str211114, str211115, "", lsm0Var9, j, z, z10, z13, z311114, d2k1Var15, d2k1Var13);
                    if (!z19) {
                        jP = -1;
                    } else if (z2) {
                        jP = duration.p() * 1000;
                    } else {
                        d2k1Var16 = pjw0Var.b;
                        if (d2k1Var16 instanceof mjw0) {
                            d2k1Var17 = (mjw0) d2k1Var16;
                        } else {
                            d2k1Var17 = d2k1Var3;
                        }
                        if (d2k1Var17 != null) {
                            jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                        }
                        jP = jU * 1000;
                    }
                    long j10 = jP;
                    if (pjw0Var != null) {
                        zA = dr00Var.a();
                        Set set112 = s4b1.f;
                        if (uic.g(d2k1Var4, blc0.ed)) {
                            zA = true;
                        }
                        if (zA) {
                            if (z22) {
                                d2k1Var3 = 2131959807;
                            } else {
                                d2k1Var3 = 2131959807;
                            }
                        }
                    }
                    d2k1 d2k1Var212 = d2k1Var3;
                    boolean z311115 = t810Var.g;
                    if (z6) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    return new hob1(str11111, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV17, zS9, dr00Var, zV18, (mbw0) null, lfi0VarR9, d2k1VarU, (xfn0) null, set0VarS9, wcmVarP3, uhoVarQ9, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var9, j10, z311115, false, d2k1Var212, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                }
                d2k1Var4 = d2k1Var;
                z11 = z8;
                String str11114 = mey0Var.a;
                if (zG) {
                    d2k1Var5 = d2k1Var4;
                } else {
                    d2k1Var5 = d2k1Var4;
                }
                if (zG) {
                    d2k1Var6 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var6 = d2k1Var4;
                } else {
                    d2k1Var6 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var7 = d2k1Var3;
                } else {
                    d2k1Var7 = d2k1Var4;
                }
                zkm zkmVar11 = zkmVar;
                boolean zS10 = p2o1.s(zkmVar11, d2k1Var4);
                boolean zV19 = p2o1.v(zkmVar11, d2k1Var4);
                if (d2k1Var19 == null) {
                    d2k1Var8 = "";
                } else {
                    d2k1Var8 = d2k1Var19;
                }
                boolean zV110 = upo1.v(t810Var, d2k1Var8);
                k4m k4mVarF13 = upo1.F(i);
                String str11115 = mey0Var.f;
                if (z9) {
                    if (e2k1Var != null) {
                        d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                    } else {
                        d2k1VarValueOf = d2k1Var3;
                    }
                    d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                } else {
                    d2k1VarJ = d2k1Var3;
                }
                boolean z311116 = t810Var.g;
                boolean z311117 = t810Var.m;
                boolean z311118 = t810Var.o;
                njeVar3 = njeVar2;
                if (str2 == null) {
                    str9 = njeVar3.b;
                } else {
                    str9 = str2;
                }
                lfi0 lfi0VarR10 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF13, wcmVarP3, str11115, d2k1VarJ, false, false, z311116, z311117, z2, z311118, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                if (z19) {
                    String str11116 = mey0Var.a;
                    String str211116 = mey0Var.c;
                    gab0 gab0Var10 = nbw0Var.m;
                    String str211117 = gab0Var10.a;
                    String str211118 = gab0Var10.b;
                    if (hwtVar != null) {
                        z15 = hwtVar.d;
                    } else {
                        z15 = true;
                    }
                    d2k1VarU = bpo1.u(648, str11116, str211116, str211117, null, str211118, null, z15, false, z2, false);
                } else {
                    d2k1VarU = d2k1Var3;
                }
                d2k1Var9 = mey0Var.c;
                if (zG) {
                    d2k1Var10 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var10 = d2k1Var9;
                } else {
                    d2k1Var10 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var11 = d2k1Var3;
                } else {
                    d2k1Var11 = d2k1Var3;
                }
                set0 set0VarS10 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                z12 = z11;
                if (d2k1Var19 == null) {
                    d2k1Var12 = "";
                } else {
                    d2k1Var12 = d2k1Var19;
                }
                uho uhoVarQ10 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                if (pjw0Var2 == null) {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                } else {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                }
                String str211119 = mey0Var.b;
                String str2111110 = mey0Var.a;
                if (pjw0Var2 != null) {
                    hwt hwtVar11 = t810Var.c;
                    if (prlVar != null) {
                        d2k1Var18 = prlVar.c;
                    } else {
                        d2k1Var18 = d2k1Var3;
                    }
                    lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar11, d2k1Var18);
                    pjw0Var = pjw0Var2;
                } else {
                    pjw0Var = pjw0Var2;
                    ubw0.a.getClass();
                    lsm0VarO = rbw0.b;
                }
                lsm0 lsm0Var10 = lsm0VarO;
                if (z9) {
                }
                if (t810Var.u) {
                    d2k1Var13 = 3000L;
                } else {
                    d2k1Var13 = d2k1Var3;
                }
                if (pjw0Var != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z311119 = !t810Var.t;
                if (io70Var != null) {
                    d2k1Var14 = io70Var.b;
                } else {
                    d2k1Var14 = d2k1Var3;
                }
                if (zG) {
                    d2k1Var15 = d2k1Var14;
                } else {
                    d2k1Var15 = d2k1Var3;
                }
                sbw0 sbw0Var10 = new sbw0(str211119, str2111110, "", lsm0Var10, j, z, z10, z13, z311119, d2k1Var15, d2k1Var13);
                if (!z19) {
                    jP = -1;
                } else if (z2) {
                    jP = duration.p() * 1000;
                } else {
                    d2k1Var16 = pjw0Var.b;
                    if (d2k1Var16 instanceof mjw0) {
                        d2k1Var17 = (mjw0) d2k1Var16;
                    } else {
                        d2k1Var17 = d2k1Var3;
                    }
                    if (d2k1Var17 != null) {
                        jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                    }
                    jP = jU * 1000;
                }
                long j11 = jP;
                if (pjw0Var != null) {
                    zA = dr00Var.a();
                    Set set113 = s4b1.f;
                    if (uic.g(d2k1Var4, blc0.ed)) {
                        zA = true;
                    }
                    if (zA) {
                        if (z22) {
                            d2k1Var3 = 2131959807;
                        } else {
                            d2k1Var3 = 2131959807;
                        }
                    }
                }
                d2k1 d2k1Var213 = d2k1Var3;
                boolean z3111110 = t810Var.g;
                if (z6) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                return new hob1(str11114, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV19, zS10, dr00Var, zV110, (mbw0) null, lfi0VarR10, d2k1VarU, (xfn0) null, set0VarS10, wcmVarP3, uhoVarQ10, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var10, j11, z3111110, false, d2k1Var213, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
            }
            vp70Var3 = vp70Var2;
            d2k1Var3 = null;
            z8 = false;
            dr00Var = new dr00(false, upo1.F(i), false, o2p1.k(xkk1Var2, vp70Var3, str4));
            z9 = dr00Var instanceof dr00;
            if (z17) {
                z10 = z8;
            } else {
                z10 = z8;
            }
            if (z9) {
                Set set114 = s4b1.f;
                d2k1Var4 = d2k1Var;
                if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                    z11 = true;
                }
                String str11117 = mey0Var.a;
                if (zG) {
                    d2k1Var5 = d2k1Var4;
                } else {
                    d2k1Var5 = d2k1Var4;
                }
                if (zG) {
                    d2k1Var6 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var6 = d2k1Var4;
                } else {
                    d2k1Var6 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var7 = d2k1Var3;
                } else {
                    d2k1Var7 = d2k1Var4;
                }
                zkm zkmVar12 = zkmVar;
                boolean zS11 = p2o1.s(zkmVar12, d2k1Var4);
                boolean zV111 = p2o1.v(zkmVar12, d2k1Var4);
                if (d2k1Var19 == null) {
                    d2k1Var8 = "";
                } else {
                    d2k1Var8 = d2k1Var19;
                }
                boolean zV112 = upo1.v(t810Var, d2k1Var8);
                k4m k4mVarF14 = upo1.F(i);
                String str11118 = mey0Var.f;
                if (z9) {
                    if (e2k1Var != null) {
                        d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                    } else {
                        d2k1VarValueOf = d2k1Var3;
                    }
                    d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                } else {
                    d2k1VarJ = d2k1Var3;
                }
                boolean z3111111 = t810Var.g;
                boolean z3111112 = t810Var.m;
                boolean z3111113 = t810Var.o;
                njeVar3 = njeVar2;
                if (str2 == null) {
                    str9 = njeVar3.b;
                } else {
                    str9 = str2;
                }
                lfi0 lfi0VarR11 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF14, wcmVarP3, str11118, d2k1VarJ, false, false, z3111111, z3111112, z2, z3111113, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                if (z19) {
                    String str11119 = mey0Var.a;
                    String str2111111 = mey0Var.c;
                    gab0 gab0Var11 = nbw0Var.m;
                    String str2111112 = gab0Var11.a;
                    String str2111113 = gab0Var11.b;
                    if (hwtVar != null) {
                        z15 = hwtVar.d;
                    } else {
                        z15 = true;
                    }
                    d2k1VarU = bpo1.u(648, str11119, str2111111, str2111112, null, str2111113, null, z15, false, z2, false);
                } else {
                    d2k1VarU = d2k1Var3;
                }
                d2k1Var9 = mey0Var.c;
                if (zG) {
                    d2k1Var10 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var10 = d2k1Var9;
                } else {
                    d2k1Var10 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var11 = d2k1Var3;
                } else {
                    d2k1Var11 = d2k1Var3;
                }
                set0 set0VarS11 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                z12 = z11;
                if (d2k1Var19 == null) {
                    d2k1Var12 = "";
                } else {
                    d2k1Var12 = d2k1Var19;
                }
                uho uhoVarQ11 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                if (pjw0Var2 == null) {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                } else {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                }
                String str2111114 = mey0Var.b;
                String str2111115 = mey0Var.a;
                if (pjw0Var2 != null) {
                    hwt hwtVar12 = t810Var.c;
                    if (prlVar != null) {
                        d2k1Var18 = prlVar.c;
                    } else {
                        d2k1Var18 = d2k1Var3;
                    }
                    lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar12, d2k1Var18);
                    pjw0Var = pjw0Var2;
                } else {
                    pjw0Var = pjw0Var2;
                    ubw0.a.getClass();
                    lsm0VarO = rbw0.b;
                }
                lsm0 lsm0Var11 = lsm0VarO;
                if (z9) {
                }
                if (t810Var.u) {
                    d2k1Var13 = 3000L;
                } else {
                    d2k1Var13 = d2k1Var3;
                }
                if (pjw0Var != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z3111114 = !t810Var.t;
                if (io70Var != null) {
                    d2k1Var14 = io70Var.b;
                } else {
                    d2k1Var14 = d2k1Var3;
                }
                if (zG) {
                    d2k1Var15 = d2k1Var14;
                } else {
                    d2k1Var15 = d2k1Var3;
                }
                sbw0 sbw0Var11 = new sbw0(str2111114, str2111115, "", lsm0Var11, j, z, z10, z13, z3111114, d2k1Var15, d2k1Var13);
                if (!z19) {
                    jP = -1;
                } else if (z2) {
                    jP = duration.p() * 1000;
                } else {
                    d2k1Var16 = pjw0Var.b;
                    if (d2k1Var16 instanceof mjw0) {
                        d2k1Var17 = (mjw0) d2k1Var16;
                    } else {
                        d2k1Var17 = d2k1Var3;
                    }
                    if (d2k1Var17 != null) {
                        jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                    }
                    jP = jU * 1000;
                }
                long j12 = jP;
                if (pjw0Var != null) {
                    zA = dr00Var.a();
                    Set set115 = s4b1.f;
                    if (uic.g(d2k1Var4, blc0.ed)) {
                        zA = true;
                    }
                    if (zA) {
                        if (z22) {
                            d2k1Var3 = 2131959807;
                        } else {
                            d2k1Var3 = 2131959807;
                        }
                    }
                }
                d2k1 d2k1Var214 = d2k1Var3;
                boolean z3111115 = t810Var.g;
                if (z6) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                return new hob1(str11117, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV111, zS11, dr00Var, zV112, (mbw0) null, lfi0VarR11, d2k1VarU, (xfn0) null, set0VarS11, wcmVarP3, uhoVarQ11, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var11, j12, z3111115, false, d2k1Var214, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
            }
            d2k1Var4 = d2k1Var;
            z11 = z8;
            String str111110 = mey0Var.a;
            if (zG) {
                d2k1Var5 = d2k1Var4;
            } else {
                d2k1Var5 = d2k1Var4;
            }
            if (zG) {
                d2k1Var6 = d2k1Var3;
            } else if (d2k1Var19 == null) {
                d2k1Var6 = d2k1Var4;
            } else {
                d2k1Var6 = d2k1Var19;
            }
            if (zG) {
                d2k1Var7 = d2k1Var3;
            } else {
                d2k1Var7 = d2k1Var4;
            }
            zkm zkmVar13 = zkmVar;
            boolean zS12 = p2o1.s(zkmVar13, d2k1Var4);
            boolean zV113 = p2o1.v(zkmVar13, d2k1Var4);
            if (d2k1Var19 == null) {
                d2k1Var8 = "";
            } else {
                d2k1Var8 = d2k1Var19;
            }
            boolean zV114 = upo1.v(t810Var, d2k1Var8);
            k4m k4mVarF15 = upo1.F(i);
            String str111111 = mey0Var.f;
            if (z9) {
                if (e2k1Var != null) {
                    d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                } else {
                    d2k1VarValueOf = d2k1Var3;
                }
                d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
            } else {
                d2k1VarJ = d2k1Var3;
            }
            boolean z3111116 = t810Var.g;
            boolean z3111117 = t810Var.m;
            boolean z3111118 = t810Var.o;
            njeVar3 = njeVar2;
            if (str2 == null) {
                str9 = njeVar3.b;
            } else {
                str9 = str2;
            }
            lfi0 lfi0VarR12 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF15, wcmVarP3, str111111, d2k1VarJ, false, false, z3111116, z3111117, z2, z3111118, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
            if (z19) {
                String str111112 = mey0Var.a;
                String str2111116 = mey0Var.c;
                gab0 gab0Var12 = nbw0Var.m;
                String str2111117 = gab0Var12.a;
                String str2111118 = gab0Var12.b;
                if (hwtVar != null) {
                    z15 = hwtVar.d;
                } else {
                    z15 = true;
                }
                d2k1VarU = bpo1.u(648, str111112, str2111116, str2111117, null, str2111118, null, z15, false, z2, false);
            } else {
                d2k1VarU = d2k1Var3;
            }
            d2k1Var9 = mey0Var.c;
            if (zG) {
                d2k1Var10 = d2k1Var3;
            } else if (d2k1Var19 == null) {
                d2k1Var10 = d2k1Var9;
            } else {
                d2k1Var10 = d2k1Var19;
            }
            if (zG) {
                d2k1Var11 = d2k1Var3;
            } else {
                d2k1Var11 = d2k1Var3;
            }
            set0 set0VarS12 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
            z12 = z11;
            if (d2k1Var19 == null) {
                d2k1Var12 = "";
            } else {
                d2k1Var12 = d2k1Var19;
            }
            uho uhoVarQ12 = bpo1.q(d2k1Var12, d2k1Var4, str12);
            if (pjw0Var2 == null) {
                d2k1VarU = d2k1VarU;
                z12 = z12;
                m9g1Var = d2k1Var3;
            } else {
                d2k1VarU = d2k1VarU;
                z12 = z12;
                m9g1Var = d2k1Var3;
            }
            String str2111119 = mey0Var.b;
            String str21111110 = mey0Var.a;
            if (pjw0Var2 != null) {
                hwt hwtVar13 = t810Var.c;
                if (prlVar != null) {
                    d2k1Var18 = prlVar.c;
                } else {
                    d2k1Var18 = d2k1Var3;
                }
                lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar13, d2k1Var18);
                pjw0Var = pjw0Var2;
            } else {
                pjw0Var = pjw0Var2;
                ubw0.a.getClass();
                lsm0VarO = rbw0.b;
            }
            lsm0 lsm0Var12 = lsm0VarO;
            if (z9) {
            }
            if (t810Var.u) {
                d2k1Var13 = 3000L;
            } else {
                d2k1Var13 = d2k1Var3;
            }
            if (pjw0Var != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z3111119 = !t810Var.t;
            if (io70Var != null) {
                d2k1Var14 = io70Var.b;
            } else {
                d2k1Var14 = d2k1Var3;
            }
            if (zG) {
                d2k1Var15 = d2k1Var14;
            } else {
                d2k1Var15 = d2k1Var3;
            }
            sbw0 sbw0Var12 = new sbw0(str2111119, str21111110, "", lsm0Var12, j, z, z10, z13, z3111119, d2k1Var15, d2k1Var13);
            if (!z19) {
                jP = -1;
            } else if (z2) {
                jP = duration.p() * 1000;
            } else {
                d2k1Var16 = pjw0Var.b;
                if (d2k1Var16 instanceof mjw0) {
                    d2k1Var17 = (mjw0) d2k1Var16;
                } else {
                    d2k1Var17 = d2k1Var3;
                }
                if (d2k1Var17 != null) {
                    jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                }
                jP = jU * 1000;
            }
            long j13 = jP;
            if (pjw0Var != null) {
                zA = dr00Var.a();
                Set set116 = s4b1.f;
                if (uic.g(d2k1Var4, blc0.ed)) {
                    zA = true;
                }
                if (zA) {
                    if (z22) {
                        d2k1Var3 = 2131959807;
                    } else {
                        d2k1Var3 = 2131959807;
                    }
                }
            }
            d2k1 d2k1Var215 = d2k1Var3;
            boolean z31111110 = t810Var.g;
            if (z6) {
                z14 = false;
            } else {
                z14 = false;
            }
            return new hob1(str111110, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV113, zS12, dr00Var, zV114, (mbw0) null, lfi0VarR12, d2k1VarU, (xfn0) null, set0VarS12, wcmVarP3, uhoVarQ12, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var12, j13, z31111110, false, d2k1Var215, z, z25, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
        }
        str2 = strY1;
        if (z) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (z2) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (t810Var.i) {
            z5 = false;
        } else {
            z5 = false;
        }
        boolean z218 = z3;
        String str120 = mey0Var.d;
        if (pjw0Var2 != null) {
            njw0Var = pjw0Var2.b;
        } else {
            njw0Var = null;
        }
        z6 = z4;
        if (njw0Var instanceof mjw0) {
            mjw0Var = (mjw0) njw0Var;
        } else {
            mjw0Var = null;
        }
        vp70Var = vp70.d;
        if (mjw0Var != null) {
            str3 = null;
        } else {
            str3 = null;
        }
        str4 = nbw0Var.g;
        z7 = z5;
        i = nbw0Var.l;
        yh10Var = new yh10(str12, str3, (String) null, new ugo0(false, str11, str120, false, false, (String) null, (mgo0) null, 493), 20);
        if (z7) {
            yh10Var2 = yh10Var;
        } else {
            yh10Var2 = null;
        }
        hzyVar = rhi0Var.i;
        if (hzyVar == null) {
            xkk1Var = rhi0Var.g;
            if (xkk1Var == null) {
                njeVar2 = njeVar;
            } else {
                njeVar2 = njeVar;
            }
            if (str5 == null) {
                str5 = "";
            }
            iC = l1d.C(hzyVar.a);
            if (iC != 3) {
                if (iC == 6) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        next = it.next();
                        Iterator it5 = it;
                        ho70Var2 = (ho70) next;
                        if (!ihc1.y0(ho70Var2.a)) {
                            str8 = ho70Var2.b;
                            Set set117 = s4b1.f;
                            if (uic.g(str8, blc0.m2)) {
                                obj = next;
                                break;
                            }
                        }
                        it = it5;
                    }
                    ho70Var = (ho70) obj;
                    if (ho70Var != null) {
                        d2k1Var = d2k1Var20;
                        vp70Var2 = vp70Var;
                        mgo0Var = new mgo0(ho70Var.b, ho70Var.a, 2, str5);
                    }
                }
                d2k1Var = d2k1Var20;
                vp70Var2 = vp70Var;
            } else {
                d2k1Var = d2k1Var20;
                vp70Var2 = vp70Var;
                if (io70Var != null) {
                    str6 = io70Var.b;
                    str7 = io70Var.a;
                    if (!ihc1.y0(str7)) {
                        Set set118 = s4b1.f;
                        if (uic.g(str6, blc0.fh)) {
                            mgo0Var = new mgo0(str6, str7, 1, str5);
                        }
                    }
                }
            }
            if (d2k1Var19 == null) {
                d2k1Var2 = "";
            } else {
                d2k1Var2 = d2k1Var19;
            }
            boolean z219 = t810Var.g;
            boolean z2110 = t810Var.h;
            boolean z2111 = t810Var.i;
            boolean z2112 = t810Var.j;
            if (vu30Var != null) {
                eei0Var = new eei0(vu30Var, mey0Var, (byte) 7);
            } else {
                eei0Var = null;
            }
            wcm wcmVarP4 = bpo1.p(d2k1Var2, yh10Var2, z219, z2110, z2111, z2112, function0, null, str12, false, eei0Var, false, mgo0Var, null, 43524);
            r4p1VarH = fza.h(nbw0Var.j);
            if (pjw0Var2 != null) {
                if (q8i0VarB != null) {
                    if (q8i0VarB.equals(l8i0.a)) {
                        String strL4 = o2p1.l(xkk1Var2, str4);
                        ar00 ar00Var4 = new ar00(nbw0Var.c, (String) null, upo1.D(nbw0Var), nbw0Var.b, 18);
                        k4m k4mVarF16 = upo1.F(i);
                        if (hwtVar != null) {
                            z16 = true;
                        } else {
                            z16 = true;
                        }
                        vp70Var3 = vp70Var2;
                        dr00Var = new cr00(k4mVarF16, z16, ar00Var4, strL4, r4p1VarH);
                    } else {
                        if (!q8i0VarB.equals(m8i0Var)) {
                            eg.o();
                            return null;
                        }
                        mjw0Var2 = pjw0Var2.b;
                        if (mjw0Var2 instanceof mjw0) {
                            mjw0Var3 = mjw0Var2;
                        } else {
                            mjw0Var3 = null;
                        }
                        if (mjw0Var3 != null) {
                            mq70 mq70Var5 = mjw0Var3.a.b;
                            vp70Var3 = vp70Var2;
                            up70 up70VarA6 = mq70Var5.a(vp70Var3);
                            if (up70VarA6 != null) {
                            }
                            if (str10 == null) {
                                str10 = "";
                            }
                            dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                        } else {
                            vp70Var3 = vp70Var2;
                        }
                        if (str10 == null) {
                            str10 = "";
                        }
                        dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                    }
                    d2k1Var3 = null;
                } else {
                    vp70Var3 = vp70Var2;
                    d2k1Var3 = null;
                    dr00Var = null;
                }
                if (dr00Var != null) {
                    z8 = false;
                }
                z9 = dr00Var instanceof dr00;
                if (z17) {
                    z10 = z8;
                } else {
                    z10 = z8;
                }
                if (z9) {
                    Set set119 = s4b1.f;
                    d2k1Var4 = d2k1Var;
                    if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                        z11 = true;
                    }
                    String str111113 = mey0Var.a;
                    if (zG) {
                        d2k1Var5 = d2k1Var4;
                    } else {
                        d2k1Var5 = d2k1Var4;
                    }
                    if (zG) {
                        d2k1Var6 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var6 = d2k1Var4;
                    } else {
                        d2k1Var6 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var7 = d2k1Var3;
                    } else {
                        d2k1Var7 = d2k1Var4;
                    }
                    zkm zkmVar14 = zkmVar;
                    boolean zS13 = p2o1.s(zkmVar14, d2k1Var4);
                    boolean zV115 = p2o1.v(zkmVar14, d2k1Var4);
                    if (d2k1Var19 == null) {
                        d2k1Var8 = "";
                    } else {
                        d2k1Var8 = d2k1Var19;
                    }
                    boolean zV116 = upo1.v(t810Var, d2k1Var8);
                    k4m k4mVarF17 = upo1.F(i);
                    String str111114 = mey0Var.f;
                    if (z9) {
                        if (e2k1Var != null) {
                            d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                        } else {
                            d2k1VarValueOf = d2k1Var3;
                        }
                        d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                    } else {
                        d2k1VarJ = d2k1Var3;
                    }
                    boolean z31111111 = t810Var.g;
                    boolean z31111112 = t810Var.m;
                    boolean z31111113 = t810Var.o;
                    njeVar3 = njeVar2;
                    if (str2 == null) {
                        str9 = njeVar3.b;
                    } else {
                        str9 = str2;
                    }
                    lfi0 lfi0VarR13 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF17, wcmVarP4, str111114, d2k1VarJ, false, false, z31111111, z31111112, z2, z31111113, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                    if (z19) {
                        String str111115 = mey0Var.a;
                        String str21111111 = mey0Var.c;
                        gab0 gab0Var13 = nbw0Var.m;
                        String str21111112 = gab0Var13.a;
                        String str21111113 = gab0Var13.b;
                        if (hwtVar != null) {
                            z15 = hwtVar.d;
                        } else {
                            z15 = true;
                        }
                        d2k1VarU = bpo1.u(648, str111115, str21111111, str21111112, null, str21111113, null, z15, false, z2, false);
                    } else {
                        d2k1VarU = d2k1Var3;
                    }
                    d2k1Var9 = mey0Var.c;
                    if (zG) {
                        d2k1Var10 = d2k1Var3;
                    } else if (d2k1Var19 == null) {
                        d2k1Var10 = d2k1Var9;
                    } else {
                        d2k1Var10 = d2k1Var19;
                    }
                    if (zG) {
                        d2k1Var11 = d2k1Var3;
                    } else {
                        d2k1Var11 = d2k1Var3;
                    }
                    set0 set0VarS13 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                    z12 = z11;
                    if (d2k1Var19 == null) {
                        d2k1Var12 = "";
                    } else {
                        d2k1Var12 = d2k1Var19;
                    }
                    uho uhoVarQ13 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                    if (pjw0Var2 == null) {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    } else {
                        d2k1VarU = d2k1VarU;
                        z12 = z12;
                        m9g1Var = d2k1Var3;
                    }
                    String str21111114 = mey0Var.b;
                    String str21111115 = mey0Var.a;
                    if (pjw0Var2 != null) {
                        hwt hwtVar14 = t810Var.c;
                        if (prlVar != null) {
                            d2k1Var18 = prlVar.c;
                        } else {
                            d2k1Var18 = d2k1Var3;
                        }
                        lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar14, d2k1Var18);
                        pjw0Var = pjw0Var2;
                    } else {
                        pjw0Var = pjw0Var2;
                        ubw0.a.getClass();
                        lsm0VarO = rbw0.b;
                    }
                    lsm0 lsm0Var13 = lsm0VarO;
                    if (z9) {
                    }
                    if (t810Var.u) {
                        d2k1Var13 = 3000L;
                    } else {
                        d2k1Var13 = d2k1Var3;
                    }
                    if (pjw0Var != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z31111114 = !t810Var.t;
                    if (io70Var != null) {
                        d2k1Var14 = io70Var.b;
                    } else {
                        d2k1Var14 = d2k1Var3;
                    }
                    if (zG) {
                        d2k1Var15 = d2k1Var14;
                    } else {
                        d2k1Var15 = d2k1Var3;
                    }
                    sbw0 sbw0Var13 = new sbw0(str21111114, str21111115, "", lsm0Var13, j, z, z10, z13, z31111114, d2k1Var15, d2k1Var13);
                    if (!z19) {
                        jP = -1;
                    } else if (z2) {
                        jP = duration.p() * 1000;
                    } else {
                        d2k1Var16 = pjw0Var.b;
                        if (d2k1Var16 instanceof mjw0) {
                            d2k1Var17 = (mjw0) d2k1Var16;
                        } else {
                            d2k1Var17 = d2k1Var3;
                        }
                        if (d2k1Var17 != null) {
                            jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                        }
                        jP = jU * 1000;
                    }
                    long j14 = jP;
                    if (pjw0Var != null) {
                        zA = dr00Var.a();
                        Set set1110 = s4b1.f;
                        if (uic.g(d2k1Var4, blc0.ed)) {
                            zA = true;
                        }
                        if (zA) {
                            if (z22) {
                                d2k1Var3 = 2131959807;
                            } else {
                                d2k1Var3 = 2131959807;
                            }
                        }
                    }
                    d2k1 d2k1Var216 = d2k1Var3;
                    boolean z31111115 = t810Var.g;
                    if (z6) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    return new hob1(str111113, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV115, zS13, dr00Var, zV116, (mbw0) null, lfi0VarR13, d2k1VarU, (xfn0) null, set0VarS13, wcmVarP4, uhoVarQ13, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var13, j14, z31111115, false, d2k1Var216, z, z218, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
                }
                d2k1Var4 = d2k1Var;
                z11 = z8;
                String str111116 = mey0Var.a;
                if (zG) {
                    d2k1Var5 = d2k1Var4;
                } else {
                    d2k1Var5 = d2k1Var4;
                }
                if (zG) {
                    d2k1Var6 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var6 = d2k1Var4;
                } else {
                    d2k1Var6 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var7 = d2k1Var3;
                } else {
                    d2k1Var7 = d2k1Var4;
                }
                zkm zkmVar15 = zkmVar;
                boolean zS14 = p2o1.s(zkmVar15, d2k1Var4);
                boolean zV117 = p2o1.v(zkmVar15, d2k1Var4);
                if (d2k1Var19 == null) {
                    d2k1Var8 = "";
                } else {
                    d2k1Var8 = d2k1Var19;
                }
                boolean zV118 = upo1.v(t810Var, d2k1Var8);
                k4m k4mVarF18 = upo1.F(i);
                String str111117 = mey0Var.f;
                if (z9) {
                    if (e2k1Var != null) {
                        d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                    } else {
                        d2k1VarValueOf = d2k1Var3;
                    }
                    d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                } else {
                    d2k1VarJ = d2k1Var3;
                }
                boolean z31111116 = t810Var.g;
                boolean z31111117 = t810Var.m;
                boolean z31111118 = t810Var.o;
                njeVar3 = njeVar2;
                if (str2 == null) {
                    str9 = njeVar3.b;
                } else {
                    str9 = str2;
                }
                lfi0 lfi0VarR14 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF18, wcmVarP4, str111117, d2k1VarJ, false, false, z31111116, z31111117, z2, z31111118, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                if (z19) {
                    String str111118 = mey0Var.a;
                    String str21111116 = mey0Var.c;
                    gab0 gab0Var14 = nbw0Var.m;
                    String str21111117 = gab0Var14.a;
                    String str21111118 = gab0Var14.b;
                    if (hwtVar != null) {
                        z15 = hwtVar.d;
                    } else {
                        z15 = true;
                    }
                    d2k1VarU = bpo1.u(648, str111118, str21111116, str21111117, null, str21111118, null, z15, false, z2, false);
                } else {
                    d2k1VarU = d2k1Var3;
                }
                d2k1Var9 = mey0Var.c;
                if (zG) {
                    d2k1Var10 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var10 = d2k1Var9;
                } else {
                    d2k1Var10 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var11 = d2k1Var3;
                } else {
                    d2k1Var11 = d2k1Var3;
                }
                set0 set0VarS14 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                z12 = z11;
                if (d2k1Var19 == null) {
                    d2k1Var12 = "";
                } else {
                    d2k1Var12 = d2k1Var19;
                }
                uho uhoVarQ14 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                if (pjw0Var2 == null) {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                } else {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                }
                String str21111119 = mey0Var.b;
                String str211111110 = mey0Var.a;
                if (pjw0Var2 != null) {
                    hwt hwtVar15 = t810Var.c;
                    if (prlVar != null) {
                        d2k1Var18 = prlVar.c;
                    } else {
                        d2k1Var18 = d2k1Var3;
                    }
                    lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar15, d2k1Var18);
                    pjw0Var = pjw0Var2;
                } else {
                    pjw0Var = pjw0Var2;
                    ubw0.a.getClass();
                    lsm0VarO = rbw0.b;
                }
                lsm0 lsm0Var14 = lsm0VarO;
                if (z9) {
                }
                if (t810Var.u) {
                    d2k1Var13 = 3000L;
                } else {
                    d2k1Var13 = d2k1Var3;
                }
                if (pjw0Var != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z31111119 = !t810Var.t;
                if (io70Var != null) {
                    d2k1Var14 = io70Var.b;
                } else {
                    d2k1Var14 = d2k1Var3;
                }
                if (zG) {
                    d2k1Var15 = d2k1Var14;
                } else {
                    d2k1Var15 = d2k1Var3;
                }
                sbw0 sbw0Var14 = new sbw0(str21111119, str211111110, "", lsm0Var14, j, z, z10, z13, z31111119, d2k1Var15, d2k1Var13);
                if (!z19) {
                    jP = -1;
                } else if (z2) {
                    jP = duration.p() * 1000;
                } else {
                    d2k1Var16 = pjw0Var.b;
                    if (d2k1Var16 instanceof mjw0) {
                        d2k1Var17 = (mjw0) d2k1Var16;
                    } else {
                        d2k1Var17 = d2k1Var3;
                    }
                    if (d2k1Var17 != null) {
                        jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                    }
                    jP = jU * 1000;
                }
                long j15 = jP;
                if (pjw0Var != null) {
                    zA = dr00Var.a();
                    Set set1111 = s4b1.f;
                    if (uic.g(d2k1Var4, blc0.ed)) {
                        zA = true;
                    }
                    if (zA) {
                        if (z22) {
                            d2k1Var3 = 2131959807;
                        } else {
                            d2k1Var3 = 2131959807;
                        }
                    }
                }
                d2k1 d2k1Var217 = d2k1Var3;
                boolean z311111110 = t810Var.g;
                if (z6) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                return new hob1(str111116, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV117, zS14, dr00Var, zV118, (mbw0) null, lfi0VarR14, d2k1VarU, (xfn0) null, set0VarS14, wcmVarP4, uhoVarQ14, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var14, j15, z311111110, false, d2k1Var217, z, z218, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
            }
            vp70Var3 = vp70Var2;
            d2k1Var3 = null;
            z8 = false;
            dr00Var = new dr00(false, upo1.F(i), false, o2p1.k(xkk1Var2, vp70Var3, str4));
            z9 = dr00Var instanceof dr00;
            if (z17) {
                z10 = z8;
            } else {
                z10 = z8;
            }
            if (z9) {
                Set set1112 = s4b1.f;
                d2k1Var4 = d2k1Var;
                if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                    z11 = true;
                }
                String str111119 = mey0Var.a;
                if (zG) {
                    d2k1Var5 = d2k1Var4;
                } else {
                    d2k1Var5 = d2k1Var4;
                }
                if (zG) {
                    d2k1Var6 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var6 = d2k1Var4;
                } else {
                    d2k1Var6 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var7 = d2k1Var3;
                } else {
                    d2k1Var7 = d2k1Var4;
                }
                zkm zkmVar16 = zkmVar;
                boolean zS15 = p2o1.s(zkmVar16, d2k1Var4);
                boolean zV119 = p2o1.v(zkmVar16, d2k1Var4);
                if (d2k1Var19 == null) {
                    d2k1Var8 = "";
                } else {
                    d2k1Var8 = d2k1Var19;
                }
                boolean zV1110 = upo1.v(t810Var, d2k1Var8);
                k4m k4mVarF19 = upo1.F(i);
                String str1111110 = mey0Var.f;
                if (z9) {
                    if (e2k1Var != null) {
                        d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                    } else {
                        d2k1VarValueOf = d2k1Var3;
                    }
                    d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                } else {
                    d2k1VarJ = d2k1Var3;
                }
                boolean z311111111 = t810Var.g;
                boolean z311111112 = t810Var.m;
                boolean z311111113 = t810Var.o;
                njeVar3 = njeVar2;
                if (str2 == null) {
                    str9 = njeVar3.b;
                } else {
                    str9 = str2;
                }
                lfi0 lfi0VarR15 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF19, wcmVarP4, str1111110, d2k1VarJ, false, false, z311111111, z311111112, z2, z311111113, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                if (z19) {
                    String str1111111 = mey0Var.a;
                    String str211111111 = mey0Var.c;
                    gab0 gab0Var15 = nbw0Var.m;
                    String str211111112 = gab0Var15.a;
                    String str211111113 = gab0Var15.b;
                    if (hwtVar != null) {
                        z15 = hwtVar.d;
                    } else {
                        z15 = true;
                    }
                    d2k1VarU = bpo1.u(648, str1111111, str211111111, str211111112, null, str211111113, null, z15, false, z2, false);
                } else {
                    d2k1VarU = d2k1Var3;
                }
                d2k1Var9 = mey0Var.c;
                if (zG) {
                    d2k1Var10 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var10 = d2k1Var9;
                } else {
                    d2k1Var10 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var11 = d2k1Var3;
                } else {
                    d2k1Var11 = d2k1Var3;
                }
                set0 set0VarS15 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                z12 = z11;
                if (d2k1Var19 == null) {
                    d2k1Var12 = "";
                } else {
                    d2k1Var12 = d2k1Var19;
                }
                uho uhoVarQ15 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                if (pjw0Var2 == null) {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                } else {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                }
                String str211111114 = mey0Var.b;
                String str211111115 = mey0Var.a;
                if (pjw0Var2 != null) {
                    hwt hwtVar16 = t810Var.c;
                    if (prlVar != null) {
                        d2k1Var18 = prlVar.c;
                    } else {
                        d2k1Var18 = d2k1Var3;
                    }
                    lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar16, d2k1Var18);
                    pjw0Var = pjw0Var2;
                } else {
                    pjw0Var = pjw0Var2;
                    ubw0.a.getClass();
                    lsm0VarO = rbw0.b;
                }
                lsm0 lsm0Var15 = lsm0VarO;
                if (z9) {
                }
                if (t810Var.u) {
                    d2k1Var13 = 3000L;
                } else {
                    d2k1Var13 = d2k1Var3;
                }
                if (pjw0Var != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z311111114 = !t810Var.t;
                if (io70Var != null) {
                    d2k1Var14 = io70Var.b;
                } else {
                    d2k1Var14 = d2k1Var3;
                }
                if (zG) {
                    d2k1Var15 = d2k1Var14;
                } else {
                    d2k1Var15 = d2k1Var3;
                }
                sbw0 sbw0Var15 = new sbw0(str211111114, str211111115, "", lsm0Var15, j, z, z10, z13, z311111114, d2k1Var15, d2k1Var13);
                if (!z19) {
                    jP = -1;
                } else if (z2) {
                    jP = duration.p() * 1000;
                } else {
                    d2k1Var16 = pjw0Var.b;
                    if (d2k1Var16 instanceof mjw0) {
                        d2k1Var17 = (mjw0) d2k1Var16;
                    } else {
                        d2k1Var17 = d2k1Var3;
                    }
                    if (d2k1Var17 != null) {
                        jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                    }
                    jP = jU * 1000;
                }
                long j16 = jP;
                if (pjw0Var != null) {
                    zA = dr00Var.a();
                    Set set1113 = s4b1.f;
                    if (uic.g(d2k1Var4, blc0.ed)) {
                        zA = true;
                    }
                    if (zA) {
                        if (z22) {
                            d2k1Var3 = 2131959807;
                        } else {
                            d2k1Var3 = 2131959807;
                        }
                    }
                }
                d2k1 d2k1Var218 = d2k1Var3;
                boolean z311111115 = t810Var.g;
                if (z6) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                return new hob1(str111119, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV119, zS15, dr00Var, zV1110, (mbw0) null, lfi0VarR15, d2k1VarU, (xfn0) null, set0VarS15, wcmVarP4, uhoVarQ15, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var15, j16, z311111115, false, d2k1Var218, z, z218, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
            }
            d2k1Var4 = d2k1Var;
            z11 = z8;
            String str1111112 = mey0Var.a;
            if (zG) {
                d2k1Var5 = d2k1Var4;
            } else {
                d2k1Var5 = d2k1Var4;
            }
            if (zG) {
                d2k1Var6 = d2k1Var3;
            } else if (d2k1Var19 == null) {
                d2k1Var6 = d2k1Var4;
            } else {
                d2k1Var6 = d2k1Var19;
            }
            if (zG) {
                d2k1Var7 = d2k1Var3;
            } else {
                d2k1Var7 = d2k1Var4;
            }
            zkm zkmVar17 = zkmVar;
            boolean zS16 = p2o1.s(zkmVar17, d2k1Var4);
            boolean zV1111 = p2o1.v(zkmVar17, d2k1Var4);
            if (d2k1Var19 == null) {
                d2k1Var8 = "";
            } else {
                d2k1Var8 = d2k1Var19;
            }
            boolean zV1112 = upo1.v(t810Var, d2k1Var8);
            k4m k4mVarF110 = upo1.F(i);
            String str1111113 = mey0Var.f;
            if (z9) {
                if (e2k1Var != null) {
                    d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                } else {
                    d2k1VarValueOf = d2k1Var3;
                }
                d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
            } else {
                d2k1VarJ = d2k1Var3;
            }
            boolean z311111116 = t810Var.g;
            boolean z311111117 = t810Var.m;
            boolean z311111118 = t810Var.o;
            njeVar3 = njeVar2;
            if (str2 == null) {
                str9 = njeVar3.b;
            } else {
                str9 = str2;
            }
            lfi0 lfi0VarR16 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF110, wcmVarP4, str1111113, d2k1VarJ, false, false, z311111116, z311111117, z2, z311111118, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
            if (z19) {
                String str1111114 = mey0Var.a;
                String str211111116 = mey0Var.c;
                gab0 gab0Var16 = nbw0Var.m;
                String str211111117 = gab0Var16.a;
                String str211111118 = gab0Var16.b;
                if (hwtVar != null) {
                    z15 = hwtVar.d;
                } else {
                    z15 = true;
                }
                d2k1VarU = bpo1.u(648, str1111114, str211111116, str211111117, null, str211111118, null, z15, false, z2, false);
            } else {
                d2k1VarU = d2k1Var3;
            }
            d2k1Var9 = mey0Var.c;
            if (zG) {
                d2k1Var10 = d2k1Var3;
            } else if (d2k1Var19 == null) {
                d2k1Var10 = d2k1Var9;
            } else {
                d2k1Var10 = d2k1Var19;
            }
            if (zG) {
                d2k1Var11 = d2k1Var3;
            } else {
                d2k1Var11 = d2k1Var3;
            }
            set0 set0VarS16 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
            z12 = z11;
            if (d2k1Var19 == null) {
                d2k1Var12 = "";
            } else {
                d2k1Var12 = d2k1Var19;
            }
            uho uhoVarQ16 = bpo1.q(d2k1Var12, d2k1Var4, str12);
            if (pjw0Var2 == null) {
                d2k1VarU = d2k1VarU;
                z12 = z12;
                m9g1Var = d2k1Var3;
            } else {
                d2k1VarU = d2k1VarU;
                z12 = z12;
                m9g1Var = d2k1Var3;
            }
            String str211111119 = mey0Var.b;
            String str2111111110 = mey0Var.a;
            if (pjw0Var2 != null) {
                hwt hwtVar17 = t810Var.c;
                if (prlVar != null) {
                    d2k1Var18 = prlVar.c;
                } else {
                    d2k1Var18 = d2k1Var3;
                }
                lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar17, d2k1Var18);
                pjw0Var = pjw0Var2;
            } else {
                pjw0Var = pjw0Var2;
                ubw0.a.getClass();
                lsm0VarO = rbw0.b;
            }
            lsm0 lsm0Var16 = lsm0VarO;
            if (z9) {
            }
            if (t810Var.u) {
                d2k1Var13 = 3000L;
            } else {
                d2k1Var13 = d2k1Var3;
            }
            if (pjw0Var != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z311111119 = !t810Var.t;
            if (io70Var != null) {
                d2k1Var14 = io70Var.b;
            } else {
                d2k1Var14 = d2k1Var3;
            }
            if (zG) {
                d2k1Var15 = d2k1Var14;
            } else {
                d2k1Var15 = d2k1Var3;
            }
            sbw0 sbw0Var16 = new sbw0(str211111119, str2111111110, "", lsm0Var16, j, z, z10, z13, z311111119, d2k1Var15, d2k1Var13);
            if (!z19) {
                jP = -1;
            } else if (z2) {
                jP = duration.p() * 1000;
            } else {
                d2k1Var16 = pjw0Var.b;
                if (d2k1Var16 instanceof mjw0) {
                    d2k1Var17 = (mjw0) d2k1Var16;
                } else {
                    d2k1Var17 = d2k1Var3;
                }
                if (d2k1Var17 != null) {
                    jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                }
                jP = jU * 1000;
            }
            long j17 = jP;
            if (pjw0Var != null) {
                zA = dr00Var.a();
                Set set1114 = s4b1.f;
                if (uic.g(d2k1Var4, blc0.ed)) {
                    zA = true;
                }
                if (zA) {
                    if (z22) {
                        d2k1Var3 = 2131959807;
                    } else {
                        d2k1Var3 = 2131959807;
                    }
                }
            }
            d2k1 d2k1Var219 = d2k1Var3;
            boolean z3111111110 = t810Var.g;
            if (z6) {
                z14 = false;
            } else {
                z14 = false;
            }
            return new hob1(str1111112, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV1111, zS16, dr00Var, zV1112, (mbw0) null, lfi0VarR16, d2k1VarU, (xfn0) null, set0VarS16, wcmVarP4, uhoVarQ16, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var16, j17, z3111111110, false, d2k1Var219, z, z218, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
        }
        d2k1Var = d2k1Var20;
        vp70Var2 = vp70Var;
        njeVar2 = njeVar;
        mgo0Var = null;
        if (d2k1Var19 == null) {
            d2k1Var2 = "";
        } else {
            d2k1Var2 = d2k1Var19;
        }
        boolean z2113 = t810Var.g;
        boolean z2114 = t810Var.h;
        boolean z2115 = t810Var.i;
        boolean z2116 = t810Var.j;
        if (vu30Var != null) {
            eei0Var = new eei0(vu30Var, mey0Var, (byte) 7);
        } else {
            eei0Var = null;
        }
        wcm wcmVarP5 = bpo1.p(d2k1Var2, yh10Var2, z2113, z2114, z2115, z2116, function0, null, str12, false, eei0Var, false, mgo0Var, null, 43524);
        r4p1VarH = fza.h(nbw0Var.j);
        if (pjw0Var2 != null) {
            if (q8i0VarB != null) {
                if (q8i0VarB.equals(l8i0.a)) {
                    String strL5 = o2p1.l(xkk1Var2, str4);
                    ar00 ar00Var5 = new ar00(nbw0Var.c, (String) null, upo1.D(nbw0Var), nbw0Var.b, 18);
                    k4m k4mVarF111 = upo1.F(i);
                    if (hwtVar != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    vp70Var3 = vp70Var2;
                    dr00Var = new cr00(k4mVarF111, z16, ar00Var5, strL5, r4p1VarH);
                } else {
                    if (!q8i0VarB.equals(m8i0Var)) {
                        eg.o();
                        return null;
                    }
                    mjw0Var2 = pjw0Var2.b;
                    if (mjw0Var2 instanceof mjw0) {
                        mjw0Var3 = mjw0Var2;
                    } else {
                        mjw0Var3 = null;
                    }
                    if (mjw0Var3 != null) {
                        mq70 mq70Var6 = mjw0Var3.a.b;
                        vp70Var3 = vp70Var2;
                        up70 up70VarA7 = mq70Var6.a(vp70Var3);
                        if (up70VarA7 != null) {
                        }
                        if (str10 == null) {
                            str10 = "";
                        }
                        dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                    } else {
                        vp70Var3 = vp70Var2;
                    }
                    if (str10 == null) {
                        str10 = "";
                    }
                    dr00Var = new dr00(true, upo1.F(i), upo1.B(hwtVar), o2p1.k(xkk1Var2, vp70Var3, str10));
                }
                d2k1Var3 = null;
            } else {
                vp70Var3 = vp70Var2;
                d2k1Var3 = null;
                dr00Var = null;
            }
            if (dr00Var != null) {
                z8 = false;
            }
            z9 = dr00Var instanceof dr00;
            if (z17) {
                z10 = z8;
            } else {
                z10 = z8;
            }
            if (z9) {
                Set set1115 = s4b1.f;
                d2k1Var4 = d2k1Var;
                if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                    z11 = true;
                }
                String str1111115 = mey0Var.a;
                if (zG) {
                    d2k1Var5 = d2k1Var4;
                } else {
                    d2k1Var5 = d2k1Var4;
                }
                if (zG) {
                    d2k1Var6 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var6 = d2k1Var4;
                } else {
                    d2k1Var6 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var7 = d2k1Var3;
                } else {
                    d2k1Var7 = d2k1Var4;
                }
                zkm zkmVar18 = zkmVar;
                boolean zS17 = p2o1.s(zkmVar18, d2k1Var4);
                boolean zV1113 = p2o1.v(zkmVar18, d2k1Var4);
                if (d2k1Var19 == null) {
                    d2k1Var8 = "";
                } else {
                    d2k1Var8 = d2k1Var19;
                }
                boolean zV1114 = upo1.v(t810Var, d2k1Var8);
                k4m k4mVarF112 = upo1.F(i);
                String str1111116 = mey0Var.f;
                if (z9) {
                    if (e2k1Var != null) {
                        d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                    } else {
                        d2k1VarValueOf = d2k1Var3;
                    }
                    d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
                } else {
                    d2k1VarJ = d2k1Var3;
                }
                boolean z3111111111 = t810Var.g;
                boolean z3111111112 = t810Var.m;
                boolean z3111111113 = t810Var.o;
                njeVar3 = njeVar2;
                if (str2 == null) {
                    str9 = njeVar3.b;
                } else {
                    str9 = str2;
                }
                lfi0 lfi0VarR17 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF112, wcmVarP5, str1111116, d2k1VarJ, false, false, z3111111111, z3111111112, z2, z3111111113, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
                if (z19) {
                    String str1111117 = mey0Var.a;
                    String str2111111111 = mey0Var.c;
                    gab0 gab0Var17 = nbw0Var.m;
                    String str2111111112 = gab0Var17.a;
                    String str2111111113 = gab0Var17.b;
                    if (hwtVar != null) {
                        z15 = hwtVar.d;
                    } else {
                        z15 = true;
                    }
                    d2k1VarU = bpo1.u(648, str1111117, str2111111111, str2111111112, null, str2111111113, null, z15, false, z2, false);
                } else {
                    d2k1VarU = d2k1Var3;
                }
                d2k1Var9 = mey0Var.c;
                if (zG) {
                    d2k1Var10 = d2k1Var3;
                } else if (d2k1Var19 == null) {
                    d2k1Var10 = d2k1Var9;
                } else {
                    d2k1Var10 = d2k1Var19;
                }
                if (zG) {
                    d2k1Var11 = d2k1Var3;
                } else {
                    d2k1Var11 = d2k1Var3;
                }
                set0 set0VarS17 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
                z12 = z11;
                if (d2k1Var19 == null) {
                    d2k1Var12 = "";
                } else {
                    d2k1Var12 = d2k1Var19;
                }
                uho uhoVarQ17 = bpo1.q(d2k1Var12, d2k1Var4, str12);
                if (pjw0Var2 == null) {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                } else {
                    d2k1VarU = d2k1VarU;
                    z12 = z12;
                    m9g1Var = d2k1Var3;
                }
                String str2111111114 = mey0Var.b;
                String str2111111115 = mey0Var.a;
                if (pjw0Var2 != null) {
                    hwt hwtVar18 = t810Var.c;
                    if (prlVar != null) {
                        d2k1Var18 = prlVar.c;
                    } else {
                        d2k1Var18 = d2k1Var3;
                    }
                    lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar18, d2k1Var18);
                    pjw0Var = pjw0Var2;
                } else {
                    pjw0Var = pjw0Var2;
                    ubw0.a.getClass();
                    lsm0VarO = rbw0.b;
                }
                lsm0 lsm0Var17 = lsm0VarO;
                if (z9) {
                }
                if (t810Var.u) {
                    d2k1Var13 = 3000L;
                } else {
                    d2k1Var13 = d2k1Var3;
                }
                if (pjw0Var != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z3111111114 = !t810Var.t;
                if (io70Var != null) {
                    d2k1Var14 = io70Var.b;
                } else {
                    d2k1Var14 = d2k1Var3;
                }
                if (zG) {
                    d2k1Var15 = d2k1Var14;
                } else {
                    d2k1Var15 = d2k1Var3;
                }
                sbw0 sbw0Var17 = new sbw0(str2111111114, str2111111115, "", lsm0Var17, j, z, z10, z13, z3111111114, d2k1Var15, d2k1Var13);
                if (!z19) {
                    jP = -1;
                } else if (z2) {
                    jP = duration.p() * 1000;
                } else {
                    d2k1Var16 = pjw0Var.b;
                    if (d2k1Var16 instanceof mjw0) {
                        d2k1Var17 = (mjw0) d2k1Var16;
                    } else {
                        d2k1Var17 = d2k1Var3;
                    }
                    if (d2k1Var17 != null) {
                        jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                    }
                    jP = jU * 1000;
                }
                long j18 = jP;
                if (pjw0Var != null) {
                    zA = dr00Var.a();
                    Set set1116 = s4b1.f;
                    if (uic.g(d2k1Var4, blc0.ed)) {
                        zA = true;
                    }
                    if (zA) {
                        if (z22) {
                            d2k1Var3 = 2131959807;
                        } else {
                            d2k1Var3 = 2131959807;
                        }
                    }
                }
                d2k1 d2k1Var2110 = d2k1Var3;
                boolean z3111111115 = t810Var.g;
                if (z6) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                return new hob1(str1111115, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV1113, zS17, dr00Var, zV1114, (mbw0) null, lfi0VarR17, d2k1VarU, (xfn0) null, set0VarS17, wcmVarP5, uhoVarQ17, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var17, j18, z3111111115, false, d2k1Var2110, z, z218, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
            }
            d2k1Var4 = d2k1Var;
            z11 = z8;
            String str1111118 = mey0Var.a;
            if (zG) {
                d2k1Var5 = d2k1Var4;
            } else {
                d2k1Var5 = d2k1Var4;
            }
            if (zG) {
                d2k1Var6 = d2k1Var3;
            } else if (d2k1Var19 == null) {
                d2k1Var6 = d2k1Var4;
            } else {
                d2k1Var6 = d2k1Var19;
            }
            if (zG) {
                d2k1Var7 = d2k1Var3;
            } else {
                d2k1Var7 = d2k1Var4;
            }
            zkm zkmVar19 = zkmVar;
            boolean zS18 = p2o1.s(zkmVar19, d2k1Var4);
            boolean zV1115 = p2o1.v(zkmVar19, d2k1Var4);
            if (d2k1Var19 == null) {
                d2k1Var8 = "";
            } else {
                d2k1Var8 = d2k1Var19;
            }
            boolean zV1116 = upo1.v(t810Var, d2k1Var8);
            k4m k4mVarF113 = upo1.F(i);
            String str1111119 = mey0Var.f;
            if (z9) {
                if (e2k1Var != null) {
                    d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                } else {
                    d2k1VarValueOf = d2k1Var3;
                }
                d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
            } else {
                d2k1VarJ = d2k1Var3;
            }
            boolean z3111111116 = t810Var.g;
            boolean z3111111117 = t810Var.m;
            boolean z3111111118 = t810Var.o;
            njeVar3 = njeVar2;
            if (str2 == null) {
                str9 = njeVar3.b;
            } else {
                str9 = str2;
            }
            lfi0 lfi0VarR18 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF113, wcmVarP5, str1111119, d2k1VarJ, false, false, z3111111116, z3111111117, z2, z3111111118, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
            if (z19) {
                String str11111110 = mey0Var.a;
                String str2111111116 = mey0Var.c;
                gab0 gab0Var18 = nbw0Var.m;
                String str2111111117 = gab0Var18.a;
                String str2111111118 = gab0Var18.b;
                if (hwtVar != null) {
                    z15 = hwtVar.d;
                } else {
                    z15 = true;
                }
                d2k1VarU = bpo1.u(648, str11111110, str2111111116, str2111111117, null, str2111111118, null, z15, false, z2, false);
            } else {
                d2k1VarU = d2k1Var3;
            }
            d2k1Var9 = mey0Var.c;
            if (zG) {
                d2k1Var10 = d2k1Var3;
            } else if (d2k1Var19 == null) {
                d2k1Var10 = d2k1Var9;
            } else {
                d2k1Var10 = d2k1Var19;
            }
            if (zG) {
                d2k1Var11 = d2k1Var3;
            } else {
                d2k1Var11 = d2k1Var3;
            }
            set0 set0VarS18 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
            z12 = z11;
            if (d2k1Var19 == null) {
                d2k1Var12 = "";
            } else {
                d2k1Var12 = d2k1Var19;
            }
            uho uhoVarQ18 = bpo1.q(d2k1Var12, d2k1Var4, str12);
            if (pjw0Var2 == null) {
                d2k1VarU = d2k1VarU;
                z12 = z12;
                m9g1Var = d2k1Var3;
            } else {
                d2k1VarU = d2k1VarU;
                z12 = z12;
                m9g1Var = d2k1Var3;
            }
            String str2111111119 = mey0Var.b;
            String str21111111110 = mey0Var.a;
            if (pjw0Var2 != null) {
                hwt hwtVar19 = t810Var.c;
                if (prlVar != null) {
                    d2k1Var18 = prlVar.c;
                } else {
                    d2k1Var18 = d2k1Var3;
                }
                lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar19, d2k1Var18);
                pjw0Var = pjw0Var2;
            } else {
                pjw0Var = pjw0Var2;
                ubw0.a.getClass();
                lsm0VarO = rbw0.b;
            }
            lsm0 lsm0Var18 = lsm0VarO;
            if (z9) {
            }
            if (t810Var.u) {
                d2k1Var13 = 3000L;
            } else {
                d2k1Var13 = d2k1Var3;
            }
            if (pjw0Var != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z3111111119 = !t810Var.t;
            if (io70Var != null) {
                d2k1Var14 = io70Var.b;
            } else {
                d2k1Var14 = d2k1Var3;
            }
            if (zG) {
                d2k1Var15 = d2k1Var14;
            } else {
                d2k1Var15 = d2k1Var3;
            }
            sbw0 sbw0Var18 = new sbw0(str2111111119, str21111111110, "", lsm0Var18, j, z, z10, z13, z3111111119, d2k1Var15, d2k1Var13);
            if (!z19) {
                jP = -1;
            } else if (z2) {
                jP = duration.p() * 1000;
            } else {
                d2k1Var16 = pjw0Var.b;
                if (d2k1Var16 instanceof mjw0) {
                    d2k1Var17 = (mjw0) d2k1Var16;
                } else {
                    d2k1Var17 = d2k1Var3;
                }
                if (d2k1Var17 != null) {
                    jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                }
                jP = jU * 1000;
            }
            long j19 = jP;
            if (pjw0Var != null) {
                zA = dr00Var.a();
                Set set1117 = s4b1.f;
                if (uic.g(d2k1Var4, blc0.ed)) {
                    zA = true;
                }
                if (zA) {
                    if (z22) {
                        d2k1Var3 = 2131959807;
                    } else {
                        d2k1Var3 = 2131959807;
                    }
                }
            }
            d2k1 d2k1Var2111 = d2k1Var3;
            boolean z31111111110 = t810Var.g;
            if (z6) {
                z14 = false;
            } else {
                z14 = false;
            }
            return new hob1(str1111118, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV1115, zS18, dr00Var, zV1116, (mbw0) null, lfi0VarR18, d2k1VarU, (xfn0) null, set0VarS18, wcmVarP5, uhoVarQ18, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var18, j19, z31111111110, false, d2k1Var2111, z, z218, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
        }
        vp70Var3 = vp70Var2;
        d2k1Var3 = null;
        z8 = false;
        dr00Var = new dr00(false, upo1.F(i), false, o2p1.k(xkk1Var2, vp70Var3, str4));
        z9 = dr00Var instanceof dr00;
        if (z17) {
            z10 = z8;
        } else {
            z10 = z8;
        }
        if (z9) {
            Set set1118 = s4b1.f;
            d2k1Var4 = d2k1Var;
            if (uic.h(d2k1Var4, new blc0[]{blc0.ti, blc0.ui})) {
                z11 = true;
            }
            String str11111111 = mey0Var.a;
            if (zG) {
                d2k1Var5 = d2k1Var4;
            } else {
                d2k1Var5 = d2k1Var4;
            }
            if (zG) {
                d2k1Var6 = d2k1Var3;
            } else if (d2k1Var19 == null) {
                d2k1Var6 = d2k1Var4;
            } else {
                d2k1Var6 = d2k1Var19;
            }
            if (zG) {
                d2k1Var7 = d2k1Var3;
            } else {
                d2k1Var7 = d2k1Var4;
            }
            zkm zkmVar110 = zkmVar;
            boolean zS19 = p2o1.s(zkmVar110, d2k1Var4);
            boolean zV1117 = p2o1.v(zkmVar110, d2k1Var4);
            if (d2k1Var19 == null) {
                d2k1Var8 = "";
            } else {
                d2k1Var8 = d2k1Var19;
            }
            boolean zV1118 = upo1.v(t810Var, d2k1Var8);
            k4m k4mVarF114 = upo1.F(i);
            String str11111112 = mey0Var.f;
            if (z9) {
                if (e2k1Var != null) {
                    d2k1VarValueOf = Long.valueOf(e2k1Var.a);
                } else {
                    d2k1VarValueOf = d2k1Var3;
                }
                d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
            } else {
                d2k1VarJ = d2k1Var3;
            }
            boolean z31111111111 = t810Var.g;
            boolean z31111111112 = t810Var.m;
            boolean z31111111113 = t810Var.o;
            njeVar3 = njeVar2;
            if (str2 == null) {
                str9 = njeVar3.b;
            } else {
                str9 = str2;
            }
            lfi0 lfi0VarR19 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF114, wcmVarP5, str11111112, d2k1VarJ, false, false, z31111111111, z31111111112, z2, z31111111113, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
            if (z19) {
                String str11111113 = mey0Var.a;
                String str21111111111 = mey0Var.c;
                gab0 gab0Var19 = nbw0Var.m;
                String str21111111112 = gab0Var19.a;
                String str21111111113 = gab0Var19.b;
                if (hwtVar != null) {
                    z15 = hwtVar.d;
                } else {
                    z15 = true;
                }
                d2k1VarU = bpo1.u(648, str11111113, str21111111111, str21111111112, null, str21111111113, null, z15, false, z2, false);
            } else {
                d2k1VarU = d2k1Var3;
            }
            d2k1Var9 = mey0Var.c;
            if (zG) {
                d2k1Var10 = d2k1Var3;
            } else if (d2k1Var19 == null) {
                d2k1Var10 = d2k1Var9;
            } else {
                d2k1Var10 = d2k1Var19;
            }
            if (zG) {
                d2k1Var11 = d2k1Var3;
            } else {
                d2k1Var11 = d2k1Var3;
            }
            set0 set0VarS19 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
            z12 = z11;
            if (d2k1Var19 == null) {
                d2k1Var12 = "";
            } else {
                d2k1Var12 = d2k1Var19;
            }
            uho uhoVarQ19 = bpo1.q(d2k1Var12, d2k1Var4, str12);
            if (pjw0Var2 == null) {
                d2k1VarU = d2k1VarU;
                z12 = z12;
                m9g1Var = d2k1Var3;
            } else {
                d2k1VarU = d2k1VarU;
                z12 = z12;
                m9g1Var = d2k1Var3;
            }
            String str21111111114 = mey0Var.b;
            String str21111111115 = mey0Var.a;
            if (pjw0Var2 != null) {
                hwt hwtVar110 = t810Var.c;
                if (prlVar != null) {
                    d2k1Var18 = prlVar.c;
                } else {
                    d2k1Var18 = d2k1Var3;
                }
                lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar110, d2k1Var18);
                pjw0Var = pjw0Var2;
            } else {
                pjw0Var = pjw0Var2;
                ubw0.a.getClass();
                lsm0VarO = rbw0.b;
            }
            lsm0 lsm0Var19 = lsm0VarO;
            if (z9) {
            }
            if (t810Var.u) {
                d2k1Var13 = 3000L;
            } else {
                d2k1Var13 = d2k1Var3;
            }
            if (pjw0Var != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z31111111114 = !t810Var.t;
            if (io70Var != null) {
                d2k1Var14 = io70Var.b;
            } else {
                d2k1Var14 = d2k1Var3;
            }
            if (zG) {
                d2k1Var15 = d2k1Var14;
            } else {
                d2k1Var15 = d2k1Var3;
            }
            sbw0 sbw0Var19 = new sbw0(str21111111114, str21111111115, "", lsm0Var19, j, z, z10, z13, z31111111114, d2k1Var15, d2k1Var13);
            if (!z19) {
                jP = -1;
            } else if (z2) {
                jP = duration.p() * 1000;
            } else {
                d2k1Var16 = pjw0Var.b;
                if (d2k1Var16 instanceof mjw0) {
                    d2k1Var17 = (mjw0) d2k1Var16;
                } else {
                    d2k1Var17 = d2k1Var3;
                }
                if (d2k1Var17 != null) {
                    jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
                }
                jP = jU * 1000;
            }
            long j110 = jP;
            if (pjw0Var != null) {
                zA = dr00Var.a();
                Set set1119 = s4b1.f;
                if (uic.g(d2k1Var4, blc0.ed)) {
                    zA = true;
                }
                if (zA) {
                    if (z22) {
                        d2k1Var3 = 2131959807;
                    } else {
                        d2k1Var3 = 2131959807;
                    }
                }
            }
            d2k1 d2k1Var2112 = d2k1Var3;
            boolean z31111111115 = t810Var.g;
            if (z6) {
                z14 = false;
            } else {
                z14 = false;
            }
            return new hob1(str11111111, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV1117, zS19, dr00Var, zV1118, (mbw0) null, lfi0VarR19, d2k1VarU, (xfn0) null, set0VarS19, wcmVarP5, uhoVarQ19, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var19, j110, z31111111115, false, d2k1Var2112, z, z218, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
        }
        d2k1Var4 = d2k1Var;
        z11 = z8;
        String str11111114 = mey0Var.a;
        if (zG) {
            d2k1Var5 = d2k1Var4;
        } else {
            d2k1Var5 = d2k1Var4;
        }
        if (zG) {
            d2k1Var6 = d2k1Var3;
        } else if (d2k1Var19 == null) {
            d2k1Var6 = d2k1Var4;
        } else {
            d2k1Var6 = d2k1Var19;
        }
        if (zG) {
            d2k1Var7 = d2k1Var3;
        } else {
            d2k1Var7 = d2k1Var4;
        }
        zkm zkmVar111 = zkmVar;
        boolean zS110 = p2o1.s(zkmVar111, d2k1Var4);
        boolean zV1119 = p2o1.v(zkmVar111, d2k1Var4);
        if (d2k1Var19 == null) {
            d2k1Var8 = "";
        } else {
            d2k1Var8 = d2k1Var19;
        }
        boolean zV11110 = upo1.v(t810Var, d2k1Var8);
        k4m k4mVarF115 = upo1.F(i);
        String str11111115 = mey0Var.f;
        if (z9) {
            if (e2k1Var != null) {
                d2k1VarValueOf = Long.valueOf(e2k1Var.a);
            } else {
                d2k1VarValueOf = d2k1Var3;
            }
            d2k1VarJ = e6p1.j(d2k1VarValueOf, Long.valueOf(nbw0Var.i), yqgVar.b());
        } else {
            d2k1VarJ = d2k1Var3;
        }
        boolean z31111111116 = t810Var.g;
        boolean z31111111117 = t810Var.m;
        boolean z31111111118 = t810Var.o;
        njeVar3 = njeVar2;
        if (str2 == null) {
            str9 = njeVar3.b;
        } else {
            str9 = str2;
        }
        lfi0 lfi0VarR110 = bpo1.r(nbw0Var, xkk1Var2, null, ytp0Var, null, z9, k4mVarF115, wcmVarP5, str11111115, d2k1VarJ, false, false, z31111111116, z31111111117, z2, z31111111118, z9, false, false, njeVar3.a, str9, njeVar3.c, strE, false, false, null, null, 126225428);
        if (z19) {
            String str11111116 = mey0Var.a;
            String str21111111116 = mey0Var.c;
            gab0 gab0Var110 = nbw0Var.m;
            String str21111111117 = gab0Var110.a;
            String str21111111118 = gab0Var110.b;
            if (hwtVar != null) {
                z15 = hwtVar.d;
            } else {
                z15 = true;
            }
            d2k1VarU = bpo1.u(648, str11111116, str21111111116, str21111111117, null, str21111111118, null, z15, false, z2, false);
        } else {
            d2k1VarU = d2k1Var3;
        }
        d2k1Var9 = mey0Var.c;
        if (zG) {
            d2k1Var10 = d2k1Var3;
        } else if (d2k1Var19 == null) {
            d2k1Var10 = d2k1Var9;
        } else {
            d2k1Var10 = d2k1Var19;
        }
        if (zG) {
            d2k1Var11 = d2k1Var3;
        } else {
            d2k1Var11 = d2k1Var3;
        }
        set0 set0VarS110 = bpo1.s(d2k1Var9, null, (494 & 4) != 0 ? false : z9, null, z11, (494 & 32) != 0 ? null : d2k1Var10, (494 & 64) != 0 ? null : d2k1Var11, (494 & 128) != 0 ? false : zG, false);
        z12 = z11;
        if (d2k1Var19 == null) {
            d2k1Var12 = "";
        } else {
            d2k1Var12 = d2k1Var19;
        }
        uho uhoVarQ110 = bpo1.q(d2k1Var12, d2k1Var4, str12);
        if (pjw0Var2 == null) {
            d2k1VarU = d2k1VarU;
            z12 = z12;
            m9g1Var = d2k1Var3;
        } else {
            d2k1VarU = d2k1VarU;
            z12 = z12;
            m9g1Var = d2k1Var3;
        }
        String str21111111119 = mey0Var.b;
        String str211111111110 = mey0Var.a;
        if (pjw0Var2 != null) {
            hwt hwtVar111 = t810Var.c;
            if (prlVar != null) {
                d2k1Var18 = prlVar.c;
            } else {
                d2k1Var18 = d2k1Var3;
            }
            lsm0VarO = acq0.O(pjw0Var2, d2k1Var4, d2k1Var4, z2, hwtVar111, d2k1Var18);
            pjw0Var = pjw0Var2;
        } else {
            pjw0Var = pjw0Var2;
            ubw0.a.getClass();
            lsm0VarO = rbw0.b;
        }
        lsm0 lsm0Var110 = lsm0VarO;
        if (z9) {
        }
        if (t810Var.u) {
            d2k1Var13 = 3000L;
        } else {
            d2k1Var13 = d2k1Var3;
        }
        if (pjw0Var != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z31111111119 = !t810Var.t;
        if (io70Var != null) {
            d2k1Var14 = io70Var.b;
        } else {
            d2k1Var14 = d2k1Var3;
        }
        if (zG) {
            d2k1Var15 = d2k1Var14;
        } else {
            d2k1Var15 = d2k1Var3;
        }
        sbw0 sbw0Var110 = new sbw0(str21111111119, str211111111110, "", lsm0Var110, j, z, z10, z13, z31111111119, d2k1Var15, d2k1Var13);
        if (!z19) {
            jP = -1;
        } else if (z2) {
            jP = duration.p() * 1000;
        } else {
            d2k1Var16 = pjw0Var.b;
            if (d2k1Var16 instanceof mjw0) {
                d2k1Var17 = (mjw0) d2k1Var16;
            } else {
                d2k1Var17 = d2k1Var3;
            }
            if (d2k1Var17 != null) {
                jU = jfv.u(jfv.p(ojw0Var.b, ojw0Var.a), ngv.e);
            }
            jP = jU * 1000;
        }
        long j111 = jP;
        if (pjw0Var != null) {
            zA = dr00Var.a();
            Set set11110 = s4b1.f;
            if (uic.g(d2k1Var4, blc0.ed)) {
                zA = true;
            }
            if (zA) {
                if (z22) {
                    d2k1Var3 = 2131959807;
                } else {
                    d2k1Var3 = 2131959807;
                }
            }
        }
        d2k1 d2k1Var2113 = d2k1Var3;
        boolean z311111111110 = t810Var.g;
        if (z6) {
            z14 = false;
        } else {
            z14 = false;
        }
        return new hob1(str11111114, d2k1Var4, d2k1Var5, str11, nbw0Var.p.b, zV1119, zS110, dr00Var, zV11110, (mbw0) null, lfi0VarR110, d2k1VarU, (xfn0) null, set0VarS110, wcmVarP5, uhoVarQ110, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, m9g1Var, (ch7) null, sbw0Var110, j111, z311111111110, false, d2k1Var2113, z, z218, z14, (x360) null, (m4m) null, (y2u0) null, !z19, t810Var.q, d2k1Var6, d2k1Var7, zG, t810Var.r, mey0Var.i, (c5v0) null, 146739712, 1031);
    }

    public static final Next y(ncf ncfVar) {
        acf acfVar = ncfVar.e;
        return Next.i(ncf.a(ncfVar, null, acf.a(acfVar, (ArrayList) null, 3), null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -17, 7), Effects.a(new gye[]{new gye(ncfVar.a.a, acfVar.c)}));
    }

    public static final Next z(ncf ncfVar) {
        return Next.h(ncf.a(ncfVar, null, null, null, null, false, 0, false, false, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, -33, 7));
    }
}
