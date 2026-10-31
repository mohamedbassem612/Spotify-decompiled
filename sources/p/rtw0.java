package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rtw0 implements Function, Predicate, np80, jrn0, t3t, dhc, bu11, c290, ejv {
    public static final rtw0 b = new rtw0((byte) 0);
    public static final rtw0 c = new rtw0((byte) 1);
    public static final rtw0 d = new rtw0((byte) 2);
    public static final rtw0 e = new rtw0((byte) 3);
    public static final rtw0 f = new rtw0((byte) 4);
    public static final rtw0 g = new rtw0((byte) 5);
    public static final rtw0 h = new rtw0((byte) 7);
    public static final rtw0 i = new rtw0((byte) 8);
    public static final rtw0 t = new rtw0((byte) 9);
    public final /* synthetic */ byte a;

    public rtw0(nwt nwtVar) {
        this.a = (byte) 13;
    }

    public static LinkedHashSet A(kl91 kl91Var) {
        Set setP1 = o7h.p1(kl91Var.c.values());
        String str = kl91Var.b.a;
        if (str.length() <= 0) {
            str = null;
        }
        return dm61.y0(dm61.y0(dm61.y0(dm61.y0(setP1, dm61.A0(str)), kl91Var.m.keySet()), kl91Var.n.keySet()), kl91Var.o);
    }

    public static boolean B(kl91 kl91Var, String str, Set set) {
        Map map = kl91Var.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (u890.j((String) entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                li91 li91Var = (li91) kl91Var.d.get(Integer.valueOf(((Number) it.next()).intValue()));
                if (li91Var != null ? set.contains(li91Var.d()) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Next C(i4a1 i4a1Var, iu30 iu30Var) {
        return !i4a1Var.g ? Next.j() : (Next) iu30Var.invoke(i4a1.b(i4a1Var, true, 0L, (String) null, false, false, false, false, false, false, false, (String) null, (List) null, (String) null, false, (rqb1) null, 0, 0, (String) null, false, (Integer) null, false, false, false, (tpt) null, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -66, 1));
    }

    public static boolean D(kl91 kl91Var, ubm ubmVar) {
        return w(kl91Var, ubmVar) && kl91Var.b.j;
    }

    public static boolean E(kl91 kl91Var, Integer num) {
        Map.Entry entry;
        boolean z;
        if (kl91Var.p < kl91Var.a.a) {
            Map map = kl91Var.d;
            if (num != null) {
                li91 li91Var = (li91) map.get(Integer.valueOf(num.intValue()));
                z = !(li91Var != null && li91Var.a());
            } else {
                Iterator it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        entry = null;
                        break;
                    }
                    entry = (Map.Entry) it.next();
                    if (!((li91) entry.getValue()).a()) {
                        entry = null;
                    }
                } while (entry == null);
                z = (entry != null ? (Integer) entry.getKey() : null) == null;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public static boolean F(ubm ubmVar) {
        return ubmVar.a() == 1;
    }

    public static boolean H(kl91 kl91Var, ubm ubmVar) {
        if (D(kl91Var, ubmVar)) {
            return kl91Var.b.l;
        }
        Set setB = ubmVar.e().b();
        if (setB.size() == 1 && setB.contains(if81.b)) {
            return true;
        }
        return u890.j(ubmVar.e().c() ? ubmVar.d().a() : Boolean.TRUE, Boolean.TRUE);
    }

    public static boolean I(ubm ubmVar) {
        Boolean boolT = T(ubmVar);
        if (boolT != null) {
            return boolT.booleanValue();
        }
        return ubmVar.e().a() == if81.c;
    }

    public static boolean K(rtw0 rtw0Var, kl91 kl91Var, int i2) {
        boolean z = (i2 & 1) == 0;
        boolean z2 = (i2 & 2) == 0;
        Boolean bool = kl91Var.g;
        Boolean bool2 = Boolean.FALSE;
        return (u890.j(bool, bool2) || z) && (u890.j(kl91Var.h, Boolean.TRUE) || z2) && (u890.j(kl91Var.f.a, bool2) || kl91Var.a.m);
    }

    public static void L(String str, Object... objArr) {
        Logger.d("social listening impl: ".concat(str), Arrays.copyOf(objArr, objArr.length));
    }

    public static Next M(Next next, kl91 kl91Var) {
        LinkedHashSet linkedHashSetA = A(vbe.w(next));
        if (A(kl91Var).equals(linkedHashSetA)) {
            return next;
        }
        return vbe.y(vbe.w(next), dm61.x0(new oj91(linkedHashSetA), next.b()));
    }

    public static Next O(i4a1 i4a1Var, e3a1 e3a1Var) {
        return e3a1Var.a ? Next.i(i4a1.b(i4a1Var, false, 0L, (String) null, false, false, false, true, false, false, false, (String) null, (List) null, (String) null, false, (rqb1) null, 0, 0, (String) null, true, (Integer) null, false, false, false, (tpt) null, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -262209, 1), Collections.singleton(v1a1.a)) : Next.h(i4a1.b(i4a1Var, false, 0L, (String) null, false, false, false, false, false, false, false, (String) null, (List) null, (String) null, false, (rqb1) null, 0, 0, (String) null, false, (Integer) null, false, false, false, (tpt) null, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -262145, 1));
    }

    public static Next P(i4a1 i4a1Var, m3a1 m3a1Var) {
        return Next.h(i4a1.b(i4a1Var, false, 0L, (String) null, false, false, false, false, false, false, false, (String) null, (List) null, (String) null, false, (rqb1) null, 0, 0, (String) null, false, (Integer) null, false, false, false, m3a1Var.a, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -8388609, 1));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:109:0x0337  */
    public static Next Q(kl91 kl91Var, kk91 kk91Var) throws NoWhenBranchMatchedException {
        Next next;
        Integer numX;
        Integer numX2;
        int i2 = kk91Var.a;
        bl91 bl91Var = kk91Var.b;
        String str = (String) kl91Var.c.get(Integer.valueOf(i2));
        Next next2 = null;
        ubm ubmVar = str != null ? (ubm) kl91Var.e.get(str) : null;
        if (ubmVar == null) {
            return Next.j();
        }
        if (bl91Var instanceof bl91) {
            bl91 bl91Var2 = bl91Var;
            return b0(vbe.z(kl91Var), ubmVar, bl91Var2.E(), 3, bl91Var2.D(), 16);
        }
        boolean z = bl91Var instanceof cl91;
        if81 if81Var = if81.c;
        if (!z) {
            if (!(bl91Var instanceof al91)) {
                eg.o();
                return null;
            }
            al91 al91Var = (al91) bl91Var;
            int iC = l1d.C(al91Var.E());
            if (iC == 0) {
                return Next.j();
            }
            if (iC == 1) {
                return b0(vbe.z(kl91Var), ubmVar, if81.b, 2, al91Var.D(), 16);
            }
            if (iC == 2) {
                return b0(vbe.z(kl91Var), ubmVar, if81Var, 2, al91Var.D(), 16);
            }
            eg.o();
            return null;
        }
        Next nextZ = vbe.z(kl91Var);
        tv80 tv80VarD = ((cl91) bl91Var).D();
        vbe.w(nextZ);
        boolean zC = ubmVar.e().c();
        Boolean boolValueOf = Boolean.valueOf(!zC);
        if (zC) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            kl91 kl91VarW = vbe.w(nextZ);
            String strB = ubmVar.b();
            Map map = kl91VarW.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (u890.j((String) entry.getValue(), strB)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                li91 li91Var = (li91) kl91VarW.d.get(Integer.valueOf(((Number) obj).intValue()));
                if (li91Var != null && li91Var.b()) {
                    arrayList.add(obj);
                }
            }
            Integer num = (Integer) o7h.D0(arrayList);
            if (num != null) {
                return vbe.y(vbe.w(nextZ), dm61.x0(new xj91(num.intValue(), tv80VarD), nextZ.b()));
            }
        }
        kl91 kl91VarW2 = vbe.w(nextZ);
        Integer numValueOf = Integer.valueOf(i2);
        rtw0 rtw0Var = g;
        boolean zW = rtw0Var.W(kl91VarW2, ubmVar, numValueOf);
        Boolean boolValueOf2 = Boolean.valueOf(zW);
        if (!zW) {
            boolValueOf2 = null;
        }
        if (boolValueOf2 != null) {
            li91 li91Var2 = (li91) vbe.w(nextZ).d.get(Integer.valueOf(i2));
            boolean z2 = li91Var2 != null && li91Var2.a();
            Boolean boolValueOf3 = Boolean.valueOf(z2);
            if (!z2) {
                boolValueOf3 = null;
            }
            if (boolValueOf3 != null) {
                return vbe.y(kl91.a(vbe.w(nextZ), (jdu0) null, (Map) null, (Map) null, (Map) null, (y0a1) null, (Boolean) null, (Boolean) null, false, false, 0, (ArrayList) null, (Map) null, (Map) null, (Set) null, vbe.w(nextZ).p + 1, 0, (Map) null, false, 491519), dm61.y0(nextZ.b(), dm61.z0(new bk91[]{new wj91(i2, ubmVar.b()), lj91.a})));
            }
        }
        if81 if81VarN = rtw0Var.N(vbe.w(nextZ), ubmVar, Integer.valueOf(i2));
        if (if81VarN != null) {
            qm71 qm71Var = new qm71(nextZ, ubmVar, tv80VarD, (byte) 10);
            Set setSingleton = w7x.a;
            if81 if81Var2 = if81.a;
            if (if81VarN == if81Var && vbe.w(nextZ).b.o && w(vbe.w(nextZ), ubmVar)) {
                yj91 yj91VarY = Y(vbe.w(nextZ), ubmVar.b());
                if (yj91VarY != null) {
                    setSingleton = Collections.singleton(yj91VarY);
                }
                next = (Next) qm71Var.invoke(if81Var2, setSingleton);
            } else {
                next = (Next) qm71Var.invoke(if81VarN, setSingleton);
            }
            Next nextU = U(x(next, new fk91(ubmVar.b())), new fk91(ubmVar.b()), 500L);
            if (vbe.w(nextU).a.l > 0) {
                nextU = U(x(nextU, new uk91(ubmVar.b())), new uk91(ubmVar.b()), vbe.w(nextU).a.l);
            }
            Integer numValueOf2 = Integer.valueOf(i2);
            if (rtw0Var.G(vbe.w(nextU), ubmVar) && rtw0Var.h0(vbe.w(nextU), ubmVar) == if81Var2) {
                li91 li91Var3 = (li91) vbe.w(nextU).d.get(numValueOf2);
                if (li91Var3 == null || !li91Var3.e()) {
                    if (vbe.w(nextU).q < vbe.w(nextU).a.b && (numX2 = X(vbe.w(nextU), true)) != null) {
                        nextU = vbe.y(kl91.a(vbe.w(nextU), (jdu0) null, (Map) null, (Map) null, (Map) null, (y0a1) null, (Boolean) null, (Boolean) null, false, false, 0, (ArrayList) null, (Map) null, (Map) null, (Set) null, 0, vbe.w(nextU).q + 1, (Map) null, false, 458751), dm61.y0(nextU.b(), dm61.z0(new bk91[]{new yj91(numX2.intValue(), 4, ubmVar.b()), mj91.a})));
                    }
                } else if (Z(vbe.w(nextU), ubmVar.b()) != 0) {
                    nextU = vbe.y(vbe.w(nextU), dm61.x0(new yj91(i2, 4, ubmVar.b()), nextU.b()));
                }
            }
            if (vbe.w(nextU).s) {
                Set setB = nextU.b();
                if ((setB instanceof Collection) && setB.isEmpty()) {
                    numX = X(vbe.w(nextU), false);
                    if (numX != null) {
                        nextU = vbe.y(vbe.w(nextU), dm61.x0(new zj91(numX.intValue(), ubmVar.b()), nextU.b()));
                    }
                } else {
                    Iterator it = setB.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            bk91 bk91Var = (bk91) it.next();
                            if ((bk91Var instanceof yj91) || (bk91Var instanceof wj91) || (bk91Var instanceof xj91)) {
                            }
                        } else {
                            numX = X(vbe.w(nextU), false);
                            if (numX != null) {
                                nextU = vbe.y(vbe.w(nextU), dm61.x0(new zj91(numX.intValue(), ubmVar.b()), nextU.b()));
                            }
                        }
                    }
                }
            }
            next2 = nextU;
        }
        return next2 == null ? nextZ : next2;
    }

    public static Next R(i4a1 i4a1Var, b4a1 b4a1Var) {
        f5a0 f5a0Var = b4a1Var.a;
        ga61 ga61Var = f5a0Var.b;
        return Next.h(i4a1.b(ga61Var != null ? f0(i4a1Var, ga61Var) : i4a1Var.a(), false, 0L, (String) null, false, false, false, false, false, false, false, (String) null, (List) null, (String) null, false, (rqb1) null, 0, 0, (String) null, false, (Integer) null, false, false, false, f5a0Var.a, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -8388609, 1));
    }

    public static i4a1 S(i4a1 i4a1Var) {
        return i4a1.b(i4a1Var, true, 0L, (String) null, false, false, false, false, false, false, false, (String) null, (List) null, (String) null, false, (rqb1) null, 0, 0, (String) null, false, (Integer) null, false, false, false, (tpt) null, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -1154, 1);
    }

    public static Boolean T(ubm ubmVar) {
        if (ubmVar.e().c()) {
            return ubmVar.d().b();
        }
        return null;
    }

    public static Next U(Next next, yk91 yk91Var, long j) {
        return vbe.y(kl91.a(vbe.w(next), (jdu0) null, (Map) null, (Map) null, (Map) null, (y0a1) null, (Boolean) null, (Boolean) null, false, false, vbe.w(next).k + 1, (ArrayList) null, (Map) null, (Map) null, (Set) null, 0, 0, (Map) null, false, 523263), dm61.x0(new rj91(new ol91(vbe.w(next).k, yk91Var), j), next.b()));
    }

    public static Next V(Next next) {
        yrc0 yrc0VarC;
        Set set = vbe.w(next).o;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            ubm ubmVar = (ubm) vbe.w(next).e.get((String) obj);
            if (ubmVar != null && (yrc0VarC = ubmVar.c()) != null && yrc0VarC.a()) {
                arrayList.add(obj);
            }
        }
        Set setP1 = o7h.p1(arrayList);
        if (setP1.isEmpty()) {
            return next;
        }
        Set set2 = setP1;
        kl91 kl91VarA = kl91.a(vbe.w(next), (jdu0) null, (Map) null, (Map) null, (Map) null, (y0a1) null, (Boolean) null, (Boolean) null, false, false, 0, (ArrayList) null, (Map) null, (Map) null, dm61.v0(vbe.w(next).o, set2), 0, 0, (Map) null, false, 507903);
        Set setO1 = o7h.o1(next.b());
        ArrayList arrayList2 = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new tj91((String) it.next()));
        }
        setO1.addAll(arrayList2);
        return vbe.y(kl91VarA, o7h.p1(setO1));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[RETURN] */
    public static Integer X(kl91 kl91Var, boolean z) {
        for (Map.Entry entry : kl91Var.d.entrySet()) {
            if (!((li91) entry.getValue()).c() || (z && ((li91) entry.getValue()).e())) {
                entry = null;
            }
            if (entry != null) {
                if (entry != null) {
                    return (Integer) entry.getKey();
                }
                return null;
            }
        }
        entry = null;
        if (entry != null) {
            return (Integer) entry.getKey();
        }
        return null;
    }

    public static yj91 Y(kl91 kl91Var, String str) {
        Integer numX = X(kl91Var, false);
        yj91 yj91Var = null;
        if (numX != null) {
            if (!kl91Var.a.o) {
                numX = null;
            }
            if (numX != null) {
                yj91Var = new yj91(numX.intValue(), u890.j(kl91Var.f.b, Boolean.TRUE) ? 3 : 2, str);
            }
        }
        return yj91Var;
    }

    public static int Z(kl91 kl91Var, String str) {
        jdu0 jdu0Var = kl91Var.b;
        ubm ubmVar = (ubm) kl91Var.e.get(str);
        return (ubmVar == null || !u890.j(kl91Var.g, Boolean.TRUE) || !g.G(kl91Var, ubmVar) || (w(kl91Var, ubmVar) && jdu0Var.p) || (w(kl91Var, ubmVar) && jdu0Var.o)) ? 0 : 1;
    }

    public static /* synthetic */ Next b0(Next next, ubm ubmVar, if81 if81Var, int i2, tv80 tv80Var, int i3) {
        if ((i3 & 8) != 0) {
            tv80Var = null;
        }
        return g.a0(next, ubmVar, if81Var, i2, tv80Var, null);
    }

    public static int c0(int i2) {
        int iC = l1d.C(i2);
        if (iC == 0 || iC == 1 || iC == 2) {
            return 1;
        }
        if (iC == 4) {
            return 2;
        }
        if (iC != 5) {
            return iC != 6 ? 6 : 4;
        }
        return 3;
    }

    public static Set d0(kl91 kl91Var, ubm ubmVar, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kl91Var.i || kl91Var.a.k) {
            if ((F(ubmVar) || ubmVar.a() == 2) && D(kl91Var, ubmVar)) {
                linkedHashSet.add(new vj91(z, false));
            }
        } else if (D(kl91Var, ubmVar) && (F(ubmVar) || ubmVar.a() == 2)) {
            linkedHashSet.add(new vj91(z, false));
        }
        return o7h.p1(linkedHashSet);
    }

    public static Set e0(kl91 kl91Var, ubm ubmVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kl91Var.i || kl91Var.a.j) {
            if ((F(ubmVar) || ubmVar.a() == 2) && D(kl91Var, ubmVar)) {
                linkedHashSet.add(new vj91(true, true));
            }
        } else if (D(kl91Var, ubmVar) && (F(ubmVar) || ubmVar.a() == 2)) {
            linkedHashSet.add(new vj91(true, true));
        }
        return o7h.p1(linkedHashSet);
    }

    public static i4a1 f0(i4a1 i4a1Var, ga61 ga61Var) {
        List list;
        i4a1 i4a1VarB;
        String str;
        long j = i4a1Var.b;
        Long l = ga61Var.a;
        List list2 = ga61Var.f;
        if (j > (l != null ? l.longValue() : 0L)) {
            return i4a1Var;
        }
        String str2 = ga61Var.c;
        String str3 = str2 == null ? "" : str2;
        if (u890.j(i4a1Var.k, str3)) {
            list = list2;
            i4a1VarB = i4a1Var;
        } else {
            list = list2;
            i4a1VarB = i4a1.b(i4a1Var, false, 0L, (String) null, false, false, false, false, false, false, false, str3, (List) null, (String) null, false, (rqb1) null, 0, 0, (String) null, false, (Integer) null, false, false, false, (tpt) null, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -1025, 1);
        }
        if (i4a1VarB.d && !i4a1VarB.n) {
            i4a1VarB = i4a1.b(i4a1VarB, false, 0L, (String) null, false, false, false, false, false, false, false, (String) null, (List) null, (String) null, (list != null ? list.size() : 0) > 1, (rqb1) null, 0, 0, (String) null, false, (Integer) null, false, false, false, (tpt) null, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -8193, 1);
        }
        Long l2 = ga61Var.a;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        String str4 = ga61Var.b;
        Boolean bool = ga61Var.l;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        boolean z = ga61Var.g;
        boolean z2 = ga61Var.h;
        String str5 = ga61Var.e;
        List list3 = list == null ? z6x.a : list;
        ArrayList<jg61> arrayList = new ArrayList();
        for (Object obj : list3) {
            jg61 jg61Var = (jg61) obj;
            String str6 = jg61Var.b;
            if (str6 != null && str6.length() != 0 && (str = jg61Var.c) != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (jg61 jg61Var2 : arrayList) {
            String str7 = jg61Var2.b;
            str7.getClass();
            String str8 = jg61Var2.c;
            str8.getClass();
            String str9 = jg61Var2.d;
            String str10 = str9 == null ? "" : str9;
            String str11 = jg61Var2.b;
            str11.getClass();
            arrayList2.add(new a0s0(str7, str10, jg61Var2.e, jg61Var2.f, str8, str11.equals(str5 == null ? "" : str5), jg61Var2.g, jg61Var2.h));
        }
        String str12 = i4a1VarB.m;
        if (str12 == null) {
            str12 = "";
        }
        List listA1 = o7h.a1(arrayList2, new hzx0(str12, (byte) 1));
        int i2 = ga61Var.A;
        int i3 = i2 == 0 ? 1 : i2;
        int i4 = ga61Var.z;
        String str13 = ga61Var.j;
        Integer num = ga61Var.k;
        boolean z3 = ga61Var.n;
        boolean z4 = ga61Var.o;
        boolean z5 = ga61Var.p;
        wg61 wg61Var = ga61Var.q;
        fb61 fb61Var = ga61Var.r;
        td61 td61Var = ga61Var.s;
        boolean z6 = ga61Var.t;
        boolean z7 = ga61Var.u;
        i4a1 i4a1Var2 = i4a1VarB;
        wi61 wi61Var = ga61Var.v;
        boolean z8 = ga61Var.w;
        boolean z9 = ga61Var.x;
        ab61 ab61Var = ga61Var.y;
        return i4a1.b(i4a1Var2, false, jLongValue, str4, zBooleanValue, z, z2, false, false, false, false, (String) null, listA1, (String) null, false, rqb1.a, i3, i4, str13, false, num, z3, z4, z5, (tpt) null, wg61Var, fb61Var, td61Var, z6, z7, wi61Var, z8, z9, ab61Var != null ? ab61Var.a() : false, 8665025, 0);
    }

    public static i4a1 g0(i4a1 i4a1Var, ga61 ga61Var, rqb1 rqb1Var) {
        return i4a1.b(f0(i4a1Var, ga61Var), false, 0L, (String) null, false, false, false, false, false, false, false, (String) null, (List) null, (String) null, false, rqb1Var, 0, 0, (String) null, false, (Integer) null, false, false, false, (tpt) null, (wg61) null, (fb61) null, (td61) null, false, false, (wi61) null, false, false, false, -16385, 1);
    }

    public static if81 u(kl91 kl91Var, ubm ubmVar) {
        if (D(kl91Var, ubmVar) ? kl91Var.b.m : I(ubmVar)) {
            return if81.c;
        }
        return H(kl91Var, ubmVar) ? if81.b : if81.a;
    }

    public static ArrayList v(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((bjy0) obj) != bjy0.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((bjy0) it.next()).a);
        }
        return arrayList2;
    }

    public static boolean w(kl91 kl91Var, ubm ubmVar) {
        if (u890.j(kl91Var.b.a, ubmVar.b())) {
            return true;
        }
        if (ubmVar.a() == 2) {
            ubm ubmVar2 = (ubm) kl91Var.e.get(kl91Var.b.a);
            if ((ubmVar2 != null ? ubmVar2.a() : 0) == 2) {
                return true;
            }
        }
        return false;
    }

    public static Next x(Next next, yk91 yk91Var) {
        kl91 kl91VarW = vbe.w(next);
        List list = vbe.w(next).l;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ll91 ll91Var = (ll91) obj;
            ll91Var.b();
            if (!ll91Var.b().a().equals(yk91Var)) {
                arrayList.add(obj);
            }
        }
        return vbe.y(kl91.a(kl91VarW, (jdu0) null, (Map) null, (Map) null, (Map) null, (y0a1) null, (Boolean) null, (Boolean) null, false, false, 0, arrayList, (Map) null, (Map) null, (Set) null, 0, 0, (Map) null, false, 522239), next.b());
    }

    public static Next y(Next next) {
        Map map = vbe.w(next).n;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if81 if81VarD = ((ybd1) entry.getValue()).d();
            boolean z = vbe.w(next).a.n;
            if81 if81VarI0 = if81.d;
            if (z) {
                kl91 kl91VarW = vbe.w(next);
                ubm ubmVar = (ubm) kl91VarW.e.get(str);
                if (ubmVar != null) {
                    if81VarI0 = u(kl91VarW, ubmVar);
                }
            } else {
                kl91 kl91VarW2 = vbe.w(next);
                ubm ubmVar2 = (ubm) kl91VarW2.e.get(str);
                if (ubmVar2 != null) {
                    if81VarI0 = g.i0(kl91VarW2, ubmVar2);
                }
            }
            if (if81VarD == if81VarI0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return next;
        }
        kl91 kl91VarW3 = vbe.w(next);
        Map map2 = vbe.w(next).n;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (!linkedHashMap.containsKey((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        kl91 kl91VarA = kl91.a(kl91VarW3, (jdu0) null, (Map) null, (Map) null, (Map) null, (y0a1) null, (Boolean) null, (Boolean) null, false, false, 0, (ArrayList) null, (Map) null, linkedHashMap2, (Set) null, 0, 0, (Map) null, false, 516095);
        Set setO1 = o7h.o1(next.b());
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            String str2 = (String) entry3.getKey();
            ybd1 ybd1Var = (ybd1) entry3.getValue();
            if81 if81VarD2 = ybd1Var.d();
            if81 if81Var = if81.c;
            if (if81VarD2 == if81Var || ybd1Var.a() == if81Var) {
                boolean z2 = ybd1Var.d() == if81Var;
                kl91 kl91VarW4 = vbe.w(next);
                ubm ubmVar3 = (ubm) kl91VarW4.e.get(str2);
                setO1.add(new nj91(z2, true, str2, z6x.a, ubmVar3 != null ? D(kl91VarW4, ubmVar3) : false ? kl91VarW4.i ? 2 : 3 : 1, c0(ybd1Var.c()), ybd1Var.b()));
            }
        }
        Next nextY = vbe.y(kl91VarA, o7h.p1(setO1));
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            nextY = x(nextY, new xk91((String) it.next()));
        }
        return nextY;
    }

    public static byte[] z(List list) {
        nac nacVar = new nac();
        for (String str : v(list)) {
            nacVar.R(str.length());
            nacVar.Y(str);
        }
        return nacVar.v(nacVar.b);
    }

    public boolean G(kl91 kl91Var, ubm ubmVar) {
        return !K(this, kl91Var, 7) && K(this, kl91Var, 6) && ubmVar.e().b().contains(if81.c);
    }

    public boolean J(kl91 kl91Var, ubm ubmVar) {
        if (K(this, kl91Var, 7) && ubmVar.e().b().contains(if81.c)) {
            return (w(kl91Var, ubmVar) && kl91Var.b.p) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public if81 N(kl91 kl91Var, ubm ubmVar, Integer num) throws NoWhenBranchMatchedException {
        int iOrdinal = h0(kl91Var, ubmVar).ordinal();
        if81 if81Var = if81.b;
        if (iOrdinal == 0) {
            return if81Var;
        }
        if81 if81Var2 = if81.a;
        if (iOrdinal == 1) {
            rtw0 rtw0Var = g;
            if (rtw0Var.J(kl91Var, ubmVar)) {
                boolean zJ = rtw0Var.J(kl91Var, ubmVar);
                if81 if81Var3 = if81.c;
                if (!zJ || E(kl91Var, num) || rtw0Var.h0(kl91Var, ubmVar) == if81Var2 || !ubmVar.e().b().containsAll(dm61.z0(new if81[]{if81Var2, if81Var, if81Var3}))) {
                    return if81Var3;
                }
            }
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return null;
            }
            eg.o();
            return null;
        }
        return if81Var2;
    }

    public boolean W(kl91 kl91Var, ubm ubmVar, Integer num) {
        if (!J(kl91Var, ubmVar) || E(kl91Var, num)) {
            return false;
        }
        if81 if81VarH0 = h0(kl91Var, ubmVar);
        if81 if81Var = if81.a;
        return if81VarH0 == if81Var && ubmVar.e().b().containsAll(dm61.z0(new if81[]{if81Var, if81.b, if81.c}));
    }

    public byte[] a(int i2, byte[] bArr, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    public Next a0(Next next, ubm ubmVar, if81 if81Var, int i2, tv80 tv80Var, if81 if81Var2) {
        boolean zContains;
        if81 if81VarU = if81Var2 == null ? u(vbe.w(next), ubmVar) : if81Var2;
        if (if81VarU != if81.d && if81Var != if81VarU) {
            kl91 kl91VarW = vbe.w(next);
            int iOrdinal = if81Var.ordinal();
            if81 if81Var3 = if81.a;
            if81 if81Var4 = if81.b;
            if (iOrdinal == 0) {
                zContains = ubmVar.e().b().contains(if81Var3);
            } else if (iOrdinal != 1) {
                zContains = iOrdinal != 2 ? false : J(kl91VarW, ubmVar);
            } else {
                zContains = ubmVar.e().b().contains(if81Var4);
            }
            if (zContains) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                long j = vbe.w(next).i ? vbe.w(next).a.c : vbe.w(next).a.d;
                Set setO1 = o7h.o1(next.b());
                boolean zC = ubmVar.e().c();
                if81 if81Var5 = if81.c;
                if (zC && i2 != 5) {
                    setO1.add(new pj91(ubmVar.b(), if81Var != if81Var3, if81Var == if81Var5, !D(vbe.w(next), ubmVar), (!vbe.w(next).a.m && vbe.w(next).a.i && u890.j(vbe.w(next).f.a, Boolean.TRUE)) ? false : true));
                }
                if (if81VarU == if81Var5) {
                    setO1.addAll(d0(vbe.w(next), ubmVar, if81Var == if81Var4));
                }
                if (if81Var == if81Var5) {
                    setO1.addAll(e0(vbe.w(next), ubmVar));
                    if (!vbe.w(next).a.h && (!D(vbe.w(next), ubmVar) || vbe.w(next).i)) {
                        linkedHashSet.add(ubmVar.b());
                    }
                }
                if (if81Var != if81Var5 && if81VarU != if81Var5 && D(vbe.w(next), ubmVar)) {
                    setO1.add(new vj91(if81Var == if81Var4, false));
                }
                return V(U(x(vbe.y(kl91.a(vbe.w(next), (jdu0) null, (Map) null, (Map) null, (Map) null, (y0a1) null, (Boolean) null, (Boolean) null, false, false, 0, (ArrayList) null, (Map) null, sqg0.P(vbe.w(next).n, oqn1.n(ubmVar.b(), new ybd1(if81Var, if81VarU, i2, tv80Var))), dm61.y0(vbe.w(next).o, linkedHashSet), 0, 0, (Map) null, false, 499711), o7h.p1(setO1)), new xk91(ubmVar.b())), new xk91(ubmVar.b()), j));
            }
        }
        return next;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                try {
                    return PutValuesResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
                prm1 prm1Var = (prm1) ((Map) prm1.g.getValue()).get((String) obj);
                if (prm1Var == null) {
                    prm1Var = prm1.i;
                }
                return prm1Var.c;
            case 8:
                return ((spq0) obj).i(wrh.d);
            case 13:
                return Boolean.valueOf(yto.k((String) ((Map) obj).get("filter-age-restricted-content"), false));
            default:
                pze0.m(obj);
                throw null;
        }
    }

    public boolean b(SSLSocket sSLSocket) {
        return nhc1.Y(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // p.ejv
    public int c(Context context, String str, boolean z) {
        return gjv.d(context, str, z);
    }

    @Override // p.c290
    public Object convert(int i2) {
        mpz mpzVar;
        if (i2 == 0) {
            mpzVar = mpz.b;
        } else if (i2 != 1) {
            mpzVar = i2 != 2 ? null : mpz.d;
        } else {
            mpzVar = mpz.c;
        }
        return mpzVar == null ? mpz.e : mpzVar;
    }

    @Override // p.bu11
    public xu30 d() {
        return itl.b;
    }

    @Override // p.bu11
    public h3h1 e(String str) {
        return null;
    }

    @Override // p.bu11
    public h3h1 f(String str) {
        return null;
    }

    @Override // p.bu11
    public w7h1 g(n8h1 n8h1Var, unb1 unb1Var, String str) {
        return ((nyk0) n8h1Var).h(str);
    }

    @Override // p.bu11
    public h3h1 h(String str) {
        return null;
    }

    public if81 h0(kl91 kl91Var, ubm ubmVar) {
        ybd1 ybd1Var = (ybd1) kl91Var.m.get(ubmVar.b());
        if81 if81VarD = ybd1Var != null ? ybd1Var.d() : null;
        ybd1 ybd1Var2 = (ybd1) kl91Var.n.get(ubmVar.b());
        if81 if81VarD2 = ybd1Var2 != null ? ybd1Var2.d() : null;
        if (if81VarD == null) {
            return if81VarD2 == null ? i0(kl91Var, ubmVar) : if81VarD2;
        }
        return if81VarD;
    }

    public if81 i0(kl91 kl91Var, ubm ubmVar) {
        jdu0 jdu0Var = kl91Var.b;
        boolean zJ = u890.j(kl91Var.h, Boolean.FALSE);
        if81 if81Var = if81.c;
        boolean zI = false;
        if (!zJ) {
            if (D(kl91Var, ubmVar) && K(this, kl91Var, 5) && ubmVar.e().b().contains(if81Var) && (!w(kl91Var, ubmVar) || !jdu0Var.p)) {
                zI = jdu0Var.m;
            } else if (J(kl91Var, ubmVar)) {
                zI = I(ubmVar);
            }
        }
        if (zI) {
            return if81Var;
        }
        return H(kl91Var, ubmVar) ? if81.b : if81.a;
    }

    @Override // p.bu11
    public h3h1 j(String str) {
        return null;
    }

    @Override // p.bu11
    public h3h1 k(String str) {
        return null;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        String str = th61Var.a;
        blc0 blc0Var = lqm1.a;
        brm1 brm1Var = new brm1();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        brm1Var.T0(bundle);
        return lfb.k(brm1Var);
    }

    @Override // p.ejv
    public int m(Context context, String str) {
        return gjv.a(context, str);
    }

    @Override // p.bu11
    public w7h1 o(n8h1 n8h1Var, String str) {
        return ((nyk0) n8h1Var).h(str);
    }

    @Override // p.bu11
    public h3h1 q() {
        return null;
    }

    public b6a1 r(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                eg.f(cy30.j(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                return null;
            }
        }
        return new v15(superclass);
    }

    @Override // p.bu11
    public w7h1 s(n8h1 n8h1Var, unb1 unb1Var, String str) {
        return ((nyk0) n8h1Var).g();
    }

    @Override // p.bu11
    public h3h1 t(String str) {
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                nl8 nl8Var = (nl8) obj;
                return nl8Var.a() || (nl8Var instanceof ll8);
            default:
                th61 th61Var = (th61) obj;
                return th61Var.b && !th61Var.d;
        }
    }

    public /* synthetic */ rtw0(byte b2) {
        this.a = b2;
    }
}
