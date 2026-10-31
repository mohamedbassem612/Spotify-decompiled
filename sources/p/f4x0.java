package p;

import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.puffin_esperanto.proto.PuffinProcessingCompatibilityOuterClass;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import spotify.collection.esperanto.proto.CollectionTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f4x0 implements Function, Predicate, BiFunction, g4u, m2a1, av30, d8k1, me, vd, au11 {
    public final /* synthetic */ byte a;
    public static final f4x0 b = new f4x0(0);
    public static final f4x0 c = new f4x0(1);
    public static final f4x0 d = new f4x0(3);
    public static final f4x0 e = new f4x0(5);
    public static final f4x0 f = new f4x0(6);
    public static final f4x0 g = new f4x0(7);
    public static final f4x0 h = new f4x0(8);
    public static final f4x0 i = new f4x0(9);
    public static final f4x0 t = new f4x0(10);
    public static final f4x0 X = new f4x0(11);
    public static final f4x0 Y = new f4x0(12);
    public static final f4x0 Z = new f4x0(13);
    public static final f4x0 N0 = new f4x0(14);
    public static final f4x0 O0 = new f4x0(15);
    public static final f4x0 P0 = new f4x0(16);
    public static final f4x0 Q0 = new f4x0(17);
    public static final f4x0 R0 = new f4x0(18);
    public static final f4x0 S0 = new f4x0(19);
    public static final f4x0 T0 = new f4x0(20);
    public static final f4x0 U0 = new f4x0(21);
    public static final f4x0 V0 = new f4x0(22);
    public static final f4x0 W0 = new f4x0(23);
    public static final f4x0 X0 = new f4x0(24);
    public static final f4x0 Y0 = new f4x0(25);
    public static final f4x0 Z0 = new f4x0(26);

    public /* synthetic */ f4x0(byte b2) {
        this.a = b2;
    }

    public static void e(StringBuilder sb, qka0 qka0Var) {
        List parameters = qka0Var.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((hc11) obj).s() == 2) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        o7h.x0(arrayList, sb, (String) null, "context(", ") ", zqb0.X0, 50);
    }

    public static void f(hcz0 hcz0Var, Set set) {
        if (hcz0Var.u) {
            xj61 xj61Var = new xj61();
            ContextTrack contextTrack = hcz0Var.a;
            if (contextTrack != null) {
                xj61Var.add(contextTrack.uri());
            }
            Iterator it = hcz0Var.c.iterator();
            while (it.hasNext()) {
                xj61Var.add(((ContextTrack) it.next()).uri());
            }
            Iterator it2 = hcz0Var.d.iterator();
            while (it2.hasNext()) {
                xj61Var.add(((ContextTrack) it2.next()).uri());
            }
            xj61 xj61VarJ = cwl1.j(xj61Var);
            Map map = hcz0Var.A;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((kw21) entry.getValue()).f) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List listL1 = o7h.l1(dm61.v0(xj61VarJ, linkedHashMap.keySet()));
            if (listL1.isEmpty()) {
                return;
            }
            set.add(new b5z0(listL1));
        }
    }

    public static void g(StringBuilder sb, String str) {
        sb.append(n8p1.v(ajn0.e(str)));
    }

    public static void h(StringBuilder sb, qka0 qka0Var) {
        List listF = ((dc11) qka0Var).f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            hc11 hc11Var = (hc11) obj;
            if (hc11Var.s() == 1 || hc11Var.s() == 3) {
                arrayList.add(obj);
            }
        }
        hc11 hc11Var2 = (hc11) o7h.t0(0, arrayList);
        if (hc11Var2 != null) {
            sb.append(r(hc11Var2.t(), false));
            sb.append(".");
        }
        hc11 hc11Var3 = (hc11) o7h.t0(1, arrayList);
        if (hc11Var3 != null) {
            sb.append("(");
            sb.append(r(hc11Var3.t(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    public static void i(hcz0 hcz0Var, Set set) {
        if (hcz0Var.C && !hcz0Var.z) {
            ArrayList arrayListN0 = o7h.N0(hcz0Var.d, o7h.N0(hcz0Var.c, p7h.N(hcz0Var.a)));
            ArrayList arrayList = new ArrayList(q7h.U(arrayListN0, 10));
            Iterator it = arrayListN0.iterator();
            while (it.hasNext()) {
                arrayList.add(((ContextTrack) it.next()).uri());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (!hcz0Var.D.containsKey((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                set.add(new z4z0(arrayList2));
            }
            j(hcz0Var, set);
        }
    }

    public static void j(hcz0 hcz0Var, Set set) {
        if (hcz0Var.z) {
            return;
        }
        List listS = v1p1.s(hcz0Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((ContextTrack) it.next()).uri());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (!hcz0Var.E.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        set.add(new e5z0(arrayList));
    }

    public static ArrayList l(hcz0 hcz0Var) {
        ArrayList arrayListN0 = o7h.N0(hcz0Var.d, hcz0Var.c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListN0) {
            if (hcz0Var.e.containsKey(l4o1.c0((ContextTrack) obj))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Next m(hcz0 hcz0Var) {
        return Next.i(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, w7x.a, (String) null, -100663297, 23), Collections.singleton(n5z0.d));
    }

    public static LinkedHashMap n(Map map, Map map2, vu30 vu30Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            kw21 kw21Var = (kw21) linkedHashMap.get(str);
            if (kw21Var == null) {
                kw21Var = new kw21((String) null, false, (String) null, false, (hlk0) null, false);
            }
            linkedHashMap.put(str, vu30Var.invoke(kw21Var, value));
        }
        return linkedHashMap;
    }

    public static String o(nft nftVar) {
        StringBuilder sb = new StringBuilder();
        Iterator it = nftVar.getParameters().iterator();
        Object obj = null;
        Object obj2 = null;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj2;
                break;
            }
            Object next = it.next();
            if (((hc11) next).s() == 3) {
                if (z) {
                    break;
                }
                z = true;
                obj2 = next;
            }
        }
        hc11 hc11Var = (hc11) obj;
        if (hc11Var != null) {
            sb.append(r(hc11Var.t(), false));
            sb.append(".");
        }
        o7h.x0(upn1.u(nftVar), sb, ", ", "(", ")", zqb0.Z0, 48);
        sb.append(" -> ");
        sb.append(r(nftVar.getReturnType(), false));
        return sb.toString();
    }

    public static String p(mma0 mma0Var) {
        StringBuilder sb = new StringBuilder();
        e(sb, mma0Var);
        sb.append(mma0Var instanceof zla0 ? "var " : "val ");
        h(sb, mma0Var);
        g(sb, mma0Var.getName());
        sb.append(": ");
        sb.append(r(mma0Var.getReturnType(), false));
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0053  */
    public static void q(StringBuilder sb, tka0 tka0Var, lf30 lf30Var, List list, boolean z, boolean z2) {
        StringBuilder sb2;
        boolean z3;
        if (tka0Var.getTypeParameters().size() < list.size()) {
            wdg wdgVar = (wdg) tka0Var;
            if (wdgVar.n().getDeclaringClass() != null) {
                sb2 = sb;
                z3 = z2;
                q(sb2, rc11.a.b(wdgVar.n().getDeclaringClass()), lf30Var.e(), o7h.k0(list, tka0Var.getTypeParameters().size()), false, z3);
                sb2.append(".");
                sb2.append(n8p1.v(lf30Var.g()));
            } else {
                sb2 = sb;
                z3 = z2;
                sb2.append(n8p1.x(lf30.f(lf30Var)));
            }
        } else {
            sb2 = sb;
            z3 = z2;
            sb2.append(n8p1.x(lf30.f(lf30Var)));
        }
        t(sb2, o7h.d1(list, tka0Var.getTypeParameters().size()), z, z3);
    }

    public static String r(oma0 oma0Var, boolean z) {
        lf30 lf30Var;
        b7 b7Var = (b7) oma0Var;
        if (b7Var.w()) {
            b7 b7VarY = b7Var.y();
            b7VarY.getClass();
            return r(b7VarY, true);
        }
        b7 b7VarY2 = b7Var.y();
        b7 b7VarB = b7Var.B();
        if (b7VarY2 != null && b7VarB != null) {
            String strS = s(b7VarY2);
            String strS2 = s(b7VarB);
            if (u890.j(strS, nhc1.W(strS2, "?", ""))) {
                return nhc1.W(strS2, "?", "!");
            }
            if (nhc1.R(strS2, "?", false)) {
                if ((strS + '?').equals(strS2)) {
                    return strS + '!';
                }
            }
            if (("(" + strS + ")?").equals(strS2)) {
                return f4i1.f("(", strS, ")!");
            }
            String strW = n8p1.w(strS, strS2, new md11(strS, (byte) 0), new md11(strS, (byte) 1), zqb0.b1);
            if (strW != null) {
                return strW;
            }
            return "(" + strS + ".." + strS2 + ')';
        }
        StringBuilder sb = new StringBuilder();
        oma0 oma0VarE = b7Var.e();
        if (oma0VarE != null) {
            sb.append(oma0VarE);
            sb.append(" /* = ");
        }
        qma0 qma0VarK = oma0Var.k();
        if (qma0VarK instanceof qma0) {
            g(sb, qma0VarK.c);
            if (oma0Var.i()) {
                sb.append("?");
            } else if (b7Var.s()) {
                sb.append(" & Any");
            }
        } else if (qma0VarK instanceof tka0) {
            bla0 bla0Var = (tka0) qma0VarK;
            if (b7Var.t()) {
                lf30Var = rfb1.b;
            } else {
                bla0 bla0VarN = b7Var.n();
                if (bla0VarN == null) {
                    bla0VarN = bla0Var;
                }
                String strO = bla0VarN.o();
                lf30Var = strO != null ? new lf30(strO) : null;
            }
            if (lf30Var == null) {
                lf30Var = new lf30(bla0Var.b.getName());
            }
            if (lf30Var.h(sfb1.k) && u890.j(kbb.A(lf30Var), uv30.d) && !oma0Var.v().contains(tma0.c)) {
                if (b7Var.i()) {
                    sb.append("(");
                }
                if (b7Var.x()) {
                    sb.append("suspend ");
                }
                o7h.x0(o7h.l0(1, b7Var.v()), sb, (String) null, "(", ") -> ", (iu30) null, 114);
                sb.append(o7h.A0(b7Var.v()));
                if (b7Var.i()) {
                    sb.append(")?");
                }
            } else {
                q(sb, bla0Var, lf30Var, oma0Var.v(), oma0Var.i(), z);
            }
        } else if (qma0VarK instanceof pma0) {
            o7h.x0(lf30.f(((pma0) qma0VarK).a.a), sb, ".", (String) null, (String) null, zqb0.a1, 60);
            sb = sb;
            t(sb, oma0Var.v(), oma0Var.i(), z);
        } else {
            sb.append("???");
        }
        if (b7Var.e() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    public static /* synthetic */ String s(oma0 oma0Var) {
        return r(oma0Var, false);
    }

    public static void t(StringBuilder sb, List list, boolean z, boolean z2) {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            o7h.x0(list, sb2, (String) null, "<", ">", new ld11(z2), 50);
        }
        if (z) {
            sb2.append("?");
        }
    }

    public static Map u(Map map, ArrayList arrayList) {
        if (map.isEmpty()) {
            return b7x.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(l4o1.c0((ContextTrack) it.next()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (linkedHashSet.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0253 A[LOOP:8: B:100:0x024d->B:102:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x027a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0290  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:122:0x030b  */
    /* JADX WARN: Code duplicated, block: B:124:0x031f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0337  */
    /* JADX WARN: Code duplicated, block: B:131:0x034b  */
    /* JADX WARN: Code duplicated, block: B:132:0x034f  */
    /* JADX WARN: Code duplicated, block: B:140:0x036d A[LOOP:12: B:138:0x0367->B:140:0x036d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x03de  */
    /* JADX WARN: Code duplicated, block: B:154:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:157:0x0403  */
    /* JADX WARN: Code duplicated, block: B:159:0x0409  */
    /* JADX WARN: Code duplicated, block: B:160:0x0412  */
    /* JADX WARN: Code duplicated, block: B:20:0x0086  */
    /* JADX WARN: Code duplicated, block: B:395:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:? A[LOOP:6: B:72:0x01a8->B:397:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x023a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x02ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x02d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x032a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x03d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x020e  */
    /* JADX WARN: Code duplicated, block: B:93:0x021a  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    public static Next v(hcz0 hcz0Var, z8z0 z8z0Var) {
        boolean z;
        LinkedHashMap linkedHashMap;
        boolean z2;
        LinkedHashMap linkedHashMap2;
        List listL1;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        ContextTrack contextTrack;
        gcz0 gcz0Var;
        hcz0 hcz0VarA;
        ContextTrack contextTrack2;
        ktw0 ktw0Var;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet;
        Iterator it;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it2;
        Iterator it3;
        List listL2;
        Map.Entry entry;
        Iterator it4;
        Map map = hcz0Var.A;
        Set setV0 = hcz0Var.G;
        gcz0 gcz0Var2 = hcz0Var.w;
        b7x b7xVar = hcz0Var.e;
        List list = hcz0Var.d;
        List list2 = hcz0Var.c;
        boolean z3 = z8z0Var instanceof y7z0;
        b7x linkedHashMap5 = b7x.a;
        if (!z3) {
            if (z8z0Var instanceof z7z0) {
                z7z0 z7z0Var = (z7z0) z8z0Var;
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, z7z0Var.a, z7z0Var.b, z7z0Var.c, z7z0Var.d, (ktw0) null, z7z0Var.g, 0, false, false, (List) null, false, false, z7z0Var.h, z7z0Var.f, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -1575393, 31));
            }
            if (z8z0Var instanceof a8z0) {
                ktw0 ktw0Var2 = ((a8z0) z8z0Var).a;
                ContextTrack contextTrack3 = hcz0Var.b;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                if (ktw0Var2 instanceof htw0) {
                    boolean z4 = hcz0Var.k.i() == 2;
                    htw0 htw0Var = (htw0) ktw0Var2;
                    boolean z5 = htw0Var.l == 1;
                    if (htw0Var.u) {
                        if (!htw0Var.s) {
                            linkedHashSet2.add(new r5z0(contextTrack3, list));
                        }
                    } else if (bpo1.z(hcz0Var)) {
                        linkedHashSet2.add(new r5z0(contextTrack3, list));
                    }
                    if (z5) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj : list2) {
                            if (h4o1.o((ContextTrack) obj)) {
                                arrayList4.add(obj);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            linkedHashSet2.add(new k5z0(arrayList4));
                            if (z4) {
                                linkedHashSet2.add(new q5z0());
                            }
                        }
                    }
                }
                Set setO1 = o7h.o1(linkedHashSet2);
                hcz0 hcz0VarA2 = hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, ktw0Var2, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, ktw0Var2.k(), (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, 2147482623, 31);
                i(hcz0VarA2, setO1);
                f(hcz0VarA2, setO1);
                return Next.i(hcz0VarA2, setO1);
            }
            if (z8z0Var instanceof q7z0) {
                q7z0 q7z0Var = (q7z0) z8z0Var;
                hcz0 hcz0VarA3 = hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, q7z0Var.a, hcz0Var.t && q7z0Var.b, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -10485761, 31);
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                f(hcz0VarA3, linkedHashSet3);
                return Next.i(hcz0VarA3, linkedHashSet3);
            }
            if (z8z0Var instanceof m7z0) {
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, ((m7z0) z8z0Var).a, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -9, 31));
            }
            if (z8z0Var instanceof m8z0) {
                return hcz0Var.F ? Next.a(Collections.singleton(l5z0.d)) : Next.a(Collections.singleton(new j5z0(((m8z0) z8z0Var).a)));
            }
            if (z8z0Var instanceof j8z0) {
                j8z0 j8z0Var = (j8z0) z8z0Var;
                return Next.a(Collections.singleton(new o5z0(j8z0Var.c, j8z0Var.a, j8z0Var.b.uri())));
            }
            if (z8z0Var instanceof n8z0) {
                n8z0 n8z0Var = (n8z0) z8z0Var;
                return Next.a(Collections.singleton(new t5z0(n8z0Var.a, n8z0Var.b, n8z0Var.c, n8z0Var.d, hcz0Var.o, hcz0Var.p, hcz0Var.B)));
            }
            if (z8z0Var instanceof f7z0) {
                return Next.a(Collections.singleton(v4z0.d));
            }
            if (z8z0Var instanceof c8z0) {
                return Next.a(Collections.singleton(new t4z0(Collections.singletonList(((c8z0) z8z0Var).b), 2)));
            }
            if (z8z0Var instanceof s7z0) {
                return Next.a(Collections.singleton(new t4z0(Collections.singletonList(((s7z0) z8z0Var).b), 1)));
            }
            if (z8z0Var instanceof t7z0) {
                return Next.j();
            }
            if (z8z0Var instanceof g8z0) {
                ContextTrack contextTrack4 = ((g8z0) z8z0Var).b;
                return Next.i(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, dm61.x0(l4o1.c0(contextTrack4), setV0), (String) null, -1, 23), Collections.singleton(new k5z0(Collections.singletonList(contextTrack4))));
            }
            if (z8z0Var instanceof f8z0) {
                gcz0 gcz0Var3 = new gcz0(list2, list, b7xVar);
                ArrayList arrayListL = l(hcz0Var);
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayListL, 10));
                Iterator it5 = arrayListL.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(l4o1.c0((ContextTrack) it5.next()));
                }
                return Next.i(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, linkedHashMap5, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, gcz0Var3, true, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, dm61.y0(setV0, arrayList5), (String) null, -100663313, 23), Collections.singleton(new k5z0(arrayListL)));
            }
            b7x b7xVar2 = linkedHashMap5;
            if (z8z0Var instanceof v7z0) {
                return Next.a(Collections.singleton(i5z0.d));
            }
            if (z8z0Var instanceof n7z0) {
                n7z0 n7z0Var = (n7z0) z8z0Var;
                boolean z6 = n7z0Var.a;
                boolean z7 = n7z0Var.c;
                List list3 = n7z0Var.b;
                int i2 = z7 ? 1 : hcz0Var.J;
                if (!z7) {
                    b7xVar2 = b7xVar;
                }
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, b7xVar2, false, false, (String) null, (String) null, (ktw0) null, 0, i2, z6, z7, list3, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -61457, 31));
            }
            if (z8z0Var instanceof u7z0) {
                return Next.a(Collections.singleton(h5z0.d));
            }
            if (z8z0Var instanceof e8z0) {
                return Next.j();
            }
            if (z8z0Var instanceof d7z0) {
                return Next.i(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, b7xVar2, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -17, 31), Collections.singleton(new t4z0(l(hcz0Var), 1)));
            }
            if (z8z0Var instanceof i8z0) {
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, b7xVar2, false, false, (String) null, (String) null, (ktw0) null, 0, ((i8z0) z8z0Var).a, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -4113, 31));
            }
            if (z8z0Var instanceof o8z0) {
                o8z0 o8z0Var = (o8z0) z8z0Var;
                ContextTrack contextTrack5 = o8z0Var.a;
                LinkedHashMap linkedHashMap6 = new LinkedHashMap((Map) b7xVar);
                String strC0 = l4o1.c0(contextTrack5);
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, linkedHashMap6, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -17, 31));
            }
            if (z8z0Var instanceof j7z0) {
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, b7xVar2, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -17, 31));
            }
            if (z8z0Var instanceof t8z0) {
                return gcz0Var2 == null ? Next.h(hcz0Var) : Next.i(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, true, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -67108865, 31), Collections.singleton(new m5z0(gcz0Var2)));
            }
            if (z8z0Var instanceof v8z0) {
                if (gcz0Var2 == null) {
                    return Next.h(hcz0Var);
                }
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, u(gcz0Var2.c, o7h.N0(list, list2)), false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -100663313, 31));
            }
            if (z8z0Var instanceof e7z0) {
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, n(map, ((e7z0) z8z0Var).a, j8y0.T0), (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -536870913, 31));
            }
            if (z8z0Var instanceof l8z0) {
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, n(map, ((l8z0) z8z0Var).a, j8y0.V0), (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -536870913, 31));
            }
            if (z8z0Var instanceof r7z0) {
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, n(hcz0Var.A, ((r7z0) z8z0Var).a, j8y0.U0), (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -536870913, 31));
            }
            if (z8z0Var instanceof l7z0) {
                Map map2 = ((l7z0) z8z0Var).a;
                if (map2.isEmpty()) {
                    return Next.j();
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(hcz0Var.B);
                linkedHashMap7.putAll(map2);
                hcz0 hcz0VarA4 = hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, linkedHashMap7, false, (LinkedHashMap) null, (LinkedHashMap) null, false, (Set) null, (String) null, -1073741825, 31);
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                j(hcz0VarA4, linkedHashSet4);
                return Next.i(hcz0VarA4, linkedHashSet4);
            }
            if (z8z0Var instanceof i7z0) {
                LinkedHashMap linkedHashMap8 = ((i7z0) z8z0Var).a;
                if (linkedHashMap8.isEmpty()) {
                    return Next.j();
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(hcz0Var.D);
                linkedHashMap9.putAll(linkedHashMap8);
                hcz0 hcz0VarA5 = hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, linkedHashMap9, (LinkedHashMap) null, false, (Set) null, (String) null, -1, 30);
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                j(hcz0VarA5, linkedHashSet5);
                return Next.i(hcz0VarA5, linkedHashSet5);
            }
            if (z8z0Var instanceof x8z0) {
                LinkedHashMap linkedHashMap10 = ((x8z0) z8z0Var).a;
                if (linkedHashMap10.isEmpty()) {
                    return Next.j();
                }
                LinkedHashMap linkedHashMap11 = new LinkedHashMap(hcz0Var.E);
                linkedHashMap11.putAll(linkedHashMap10);
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, linkedHashMap11, false, (Set) null, (String) null, -1, 29));
            }
            if (z8z0Var instanceof h8z0) {
                return Next.h(hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, ((h8z0) z8z0Var).a, (Set) null, (String) null, -1, 27));
            }
            if (!(z8z0Var instanceof s8z0)) {
                return ((z8z0Var instanceof r8z0) || (z8z0Var instanceof p8z0) || (z8z0Var instanceof u8z0)) ? m(hcz0Var) : Next.j();
            }
            dn90 x80Var = z8z0Var instanceof q8z0 ? new x80(((q8z0) z8z0Var).a) : z8z0Var instanceof s8z0 ? new y80(((s8z0) z8z0Var).a) : z80.e;
            hcz0 hcz0VarA6 = hcz0.a(hcz0Var, (ContextTrack) null, (ContextTrack) null, (ArrayList) null, (List) null, (Map) null, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, false, false, false, false, false, false, (gcz0) null, false, (LinkedHashMap) null, (Map) null, false, (LinkedHashMap) null, (LinkedHashMap) null, false, w7x.a, (String) null, -1, 23);
            return hcz0VarA6.w != null ? Next.i(hcz0VarA6, Collections.singleton(new p5z0(x80Var))) : Next.h(hcz0VarA6);
        }
        y7z0 y7z0Var = (y7z0) z8z0Var;
        ArrayList arrayList6 = y7z0Var.c;
        ArrayList arrayList7 = y7z0Var.b;
        String str = y7z0Var.f;
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        ContextTrack contextTrack6 = y7z0Var.a;
        boolean zEquals = str.equals(hcz0Var.H);
        if (gcz0Var2 == null || hcz0Var.x || zEquals) {
            z = false;
        } else {
            ArrayList arrayListN0 = o7h.N0(list, list2);
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            Iterator it6 = arrayListN0.iterator();
            while (it6.hasNext()) {
                linkedHashSet7.add(l4o1.c0((ContextTrack) it6.next()));
            }
            ArrayList arrayListN1 = o7h.N0(arrayList6, arrayList7);
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            for (Iterator it7 = arrayListN1.iterator(); it7.hasNext(); it7 = it7) {
                linkedHashSet8.add(l4o1.c0((ContextTrack) it7.next()));
            }
            if (linkedHashSet7.equals(linkedHashSet8)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            linkedHashSet6.add(x4z0.d);
        }
        xj61 xj61Var = new xj61();
        if (contextTrack6 != null) {
            xj61Var.add(contextTrack6.uri());
        }
        Iterator it8 = arrayList7.iterator();
        while (it8.hasNext()) {
            xj61Var.add(((ContextTrack) it8.next()).uri());
            z = z;
        }
        boolean z8 = z;
        Iterator it9 = arrayList6.iterator();
        while (it9.hasNext()) {
            xj61Var.add(((ContextTrack) it9.next()).uri());
        }
        xj61 xj61VarJ = cwl1.j(xj61Var);
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        Iterator it10 = map.entrySet().iterator();
        while (it10.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it10.next();
            Iterator it11 = it10;
            if (xj61VarJ.a.containsKey((String) entry2.getKey())) {
                linkedHashMap12.put(entry2.getKey(), entry2.getValue());
            }
            it10 = it11;
        }
        if (hcz0Var.z) {
            linkedHashMap = linkedHashMap12;
        } else {
            LinkedHashMap linkedHashMap13 = new LinkedHashMap();
            Iterator it12 = linkedHashMap12.entrySet().iterator();
            while (it12.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it12.next();
                LinkedHashMap linkedHashMap14 = linkedHashMap12;
                if (((kw21) entry3.getValue()).b) {
                    linkedHashMap13.put(entry3.getKey(), entry3.getValue());
                    it12 = it12;
                }
                linkedHashMap12 = linkedHashMap14;
            }
            linkedHashMap = linkedHashMap12;
            List listL3 = o7h.l1(dm61.v0(xj61VarJ, linkedHashMap13.keySet()));
            if (!listL3.isEmpty()) {
                linkedHashSet6.add(new y4z0(listL3));
            }
        }
        if (contextTrack6 != null) {
            z2 = true;
            boolean z9 = l4o1.L(contextTrack6) ? z2 : false;
            if (hcz0Var.y || z9) {
                linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                    if (((kw21) entry4.getValue()).d) {
                        linkedHashMap2.put(entry4.getKey(), entry4.getValue());
                    }
                }
                listL1 = o7h.l1(dm61.v0(xj61VarJ, linkedHashMap2.keySet()));
                if (!listL1.isEmpty()) {
                    linkedHashSet6.add(new d5z0(listL1));
                }
            }
            if (y7z0Var.d) {
                ArrayList arrayListN2 = o7h.N0(arrayList6, arrayList7);
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayListN2) {
                    if (l4o1.K((ContextTrack) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ContextTrack) it2.next()).uri());
                }
                Set setP1 = o7h.p1(arrayList3);
                Map map3 = hcz0Var.B;
                linkedHashMap5 = new LinkedHashMap();
                it3 = map3.entrySet().iterator();
                while (it3.hasNext()) {
                    entry = (Map.Entry) it3.next();
                    Iterator it13 = it3;
                    if (xj61VarJ.a.containsKey((String) entry.getKey())) {
                        linkedHashMap5.put(entry.getKey(), entry.getValue());
                    }
                    it3 = it13;
                }
                listL2 = o7h.l1(dm61.v0(setP1, linkedHashMap5.keySet()));
                if (!listL2.isEmpty()) {
                    linkedHashSet6.add(new u4z0(listL2));
                }
            }
            b7x b7xVar3 = linkedHashMap5;
            Map map4 = hcz0Var.D;
            linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry5 : map4.entrySet()) {
                if (xj61VarJ.a.containsKey((String) entry5.getKey())) {
                    linkedHashMap3.put(entry5.getKey(), entry5.getValue());
                }
            }
            Map map5 = hcz0Var.E;
            linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry6 : map5.entrySet()) {
                if (xj61VarJ.a.containsKey((String) entry6.getKey())) {
                    linkedHashMap4.put(entry6.getKey(), entry6.getValue());
                }
            }
            ContextTrack contextTrack7 = y7z0Var.a;
            contextTrack = (ContextTrack) o7h.s0(arrayList7);
            if (contextTrack == null) {
                contextTrack = (ContextTrack) o7h.s0(arrayList6);
            }
            Map mapU = u(b7xVar, o7h.N0(arrayList6, arrayList7));
            boolean z10 = y7z0Var.d;
            boolean z11 = y7z0Var.e;
            if (z8) {
                gcz0Var = null;
            } else {
                gcz0Var = gcz0Var2;
            }
            if (!zEquals && !setV0.isEmpty()) {
                ArrayList arrayListN3 = o7h.N0(arrayList6, arrayList7);
                linkedHashSet = new LinkedHashSet();
                it = arrayListN3.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(l4o1.c0((ContextTrack) it.next()));
                }
                setV0 = o7h.v0(setV0, linkedHashSet);
            }
            hcz0VarA = hcz0.a(hcz0Var, contextTrack7, contextTrack, arrayList7, arrayList6, mapU, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, z10, z11, false, false, false, false, gcz0Var, false, linkedHashMap, b7xVar3, false, linkedHashMap3, linkedHashMap4, false, setV0, str, -1728446496, 4);
            contextTrack2 = hcz0VarA.b;
            ktw0Var = hcz0VarA.k;
            i(hcz0VarA, linkedHashSet6);
            f(hcz0VarA, linkedHashSet6);
            if ((ktw0Var instanceof htw0) && ((htw0) ktw0Var).l == 1) {
                List list4 = hcz0VarA.c;
                arrayList = new ArrayList();
                for (Object obj3 : list4) {
                    if (h4o1.o((ContextTrack) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    linkedHashSet6.add(new k5z0(arrayList));
                }
            }
            if (ktw0Var.j()) {
                if (!ktw0Var.h()) {
                    linkedHashSet6.add(new r5z0(contextTrack2, arrayList6));
                }
            } else if ((ktw0Var instanceof htw0) && bpo1.z(hcz0VarA)) {
                linkedHashSet6.add(new r5z0(contextTrack2, arrayList6));
            }
            return Next.i(hcz0VarA, linkedHashSet6);
        }
        z2 = true;
        if (!arrayList7.isEmpty()) {
            Iterator it14 = arrayList7.iterator();
            while (true) {
                if (!it14.hasNext()) {
                    if (!arrayList6.isEmpty()) {
                        it4 = arrayList6.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (l4o1.L((ContextTrack) it4.next())) {
                                }
                            }
                        }
                    }
                } else if (l4o1.L((ContextTrack) it14.next())) {
                }
            }
        } else if (!arrayList6.isEmpty()) {
            it4 = arrayList6.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (l4o1.L((ContextTrack) it4.next())) {
                    }
                }
            }
        }
        if (hcz0Var.y) {
            linkedHashMap2 = new LinkedHashMap();
            while (r9.hasNext()) {
                if (((kw21) entry4.getValue()).d) {
                    linkedHashMap2.put(entry4.getKey(), entry4.getValue());
                }
            }
            listL1 = o7h.l1(dm61.v0(xj61VarJ, linkedHashMap2.keySet()));
            if (!listL1.isEmpty()) {
                linkedHashSet6.add(new d5z0(listL1));
            }
        } else {
            linkedHashMap2 = new LinkedHashMap();
            while (r9.hasNext()) {
                if (((kw21) entry4.getValue()).d) {
                    linkedHashMap2.put(entry4.getKey(), entry4.getValue());
                }
            }
            listL1 = o7h.l1(dm61.v0(xj61VarJ, linkedHashMap2.keySet()));
            if (!listL1.isEmpty()) {
                linkedHashSet6.add(new d5z0(listL1));
            }
        }
        if (y7z0Var.d) {
            ArrayList arrayListN4 = o7h.N0(arrayList6, arrayList7);
            arrayList2 = new ArrayList();
            while (r2.hasNext()) {
                if (l4o1.K((ContextTrack) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((ContextTrack) it2.next()).uri());
            }
            Set setP2 = o7h.p1(arrayList3);
            Map map6 = hcz0Var.B;
            linkedHashMap5 = new LinkedHashMap();
            it3 = map6.entrySet().iterator();
            while (it3.hasNext()) {
                entry = (Map.Entry) it3.next();
                Iterator it15 = it3;
                if (xj61VarJ.a.containsKey((String) entry.getKey())) {
                    linkedHashMap5.put(entry.getKey(), entry.getValue());
                }
                it3 = it15;
            }
            listL2 = o7h.l1(dm61.v0(setP2, linkedHashMap5.keySet()));
            if (!listL2.isEmpty()) {
                linkedHashSet6.add(new u4z0(listL2));
            }
        }
        b7x b7xVar4 = linkedHashMap5;
        Map map7 = hcz0Var.D;
        linkedHashMap3 = new LinkedHashMap();
        while (r2.hasNext()) {
            if (xj61VarJ.a.containsKey((String) entry5.getKey())) {
                linkedHashMap3.put(entry5.getKey(), entry5.getValue());
            }
        }
        Map map8 = hcz0Var.E;
        linkedHashMap4 = new LinkedHashMap();
        while (r2.hasNext()) {
            if (xj61VarJ.a.containsKey((String) entry6.getKey())) {
                linkedHashMap4.put(entry6.getKey(), entry6.getValue());
            }
        }
        ContextTrack contextTrack8 = y7z0Var.a;
        contextTrack = (ContextTrack) o7h.s0(arrayList7);
        if (contextTrack == null) {
            contextTrack = (ContextTrack) o7h.s0(arrayList6);
        }
        Map mapU2 = u(b7xVar, o7h.N0(arrayList6, arrayList7));
        boolean z12 = y7z0Var.d;
        boolean z13 = y7z0Var.e;
        if (z8) {
            gcz0Var = null;
        } else {
            gcz0Var = gcz0Var2;
        }
        if (!zEquals) {
            ArrayList arrayListN5 = o7h.N0(arrayList6, arrayList7);
            linkedHashSet = new LinkedHashSet();
            it = arrayListN5.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(l4o1.c0((ContextTrack) it.next()));
            }
            setV0 = o7h.v0(setV0, linkedHashSet);
        }
        hcz0VarA = hcz0.a(hcz0Var, contextTrack8, contextTrack, arrayList7, arrayList6, mapU2, false, false, (String) null, (String) null, (ktw0) null, 0, 0, false, false, (List) null, z12, z13, false, false, false, false, gcz0Var, false, linkedHashMap, b7xVar4, false, linkedHashMap3, linkedHashMap4, false, setV0, str, -1728446496, 4);
        contextTrack2 = hcz0VarA.b;
        ktw0Var = hcz0VarA.k;
        i(hcz0VarA, linkedHashSet6);
        f(hcz0VarA, linkedHashSet6);
        if (ktw0Var instanceof htw0) {
            List list5 = hcz0VarA.c;
            arrayList = new ArrayList();
            while (r4.hasNext()) {
                if (h4o1.o((ContextTrack) obj3)) {
                    arrayList.add(obj3);
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashSet6.add(new k5z0(arrayList));
            }
        }
        if (ktw0Var.j()) {
            if (!ktw0Var.h()) {
                linkedHashSet6.add(new r5z0(contextTrack2, arrayList6));
            }
        } else if (ktw0Var instanceof htw0) {
            linkedHashSet6.add(new r5z0(contextTrack2, arrayList6));
        }
        return Next.i(hcz0VarA, linkedHashSet6);
    }

    public boolean a(tzc tzcVar) {
        return true;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return new gpy0(((PuffinProcessingCompatibilityOuterClass.PuffinProcessingCompatibility) obj).n());
            case 5:
                return ((vuk) ((ln41) obj).a).l();
            case 7:
                return new fb41(false, "", "");
            case 11:
                return new tp81((zc40) obj);
            case 12:
                int iOrdinal = ((p4o0) obj).ordinal();
                return (iOrdinal == 0 || iOrdinal == 2) ? Single.just(Boolean.FALSE) : Single.just(Boolean.TRUE);
            case 15:
                ln41 ln41Var = (ln41) obj;
                return ln41Var instanceof jn41 ? new an41(new l5v0(ln41Var, (byte) 23)) : bn41.a;
            case 16:
                return new wac1((kas0) obj);
            case 19:
                return Boolean.valueOf(!((a5g1) obj).a.d);
            case 20:
                String message = ((Throwable) obj).getMessage();
                return new w7z0(message != null ? message : "");
            default:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((ssp0) obj2);
                }
                return arrayList;
        }
    }

    public String b() {
        return "fb_extend_sso_token";
    }

    public Function0 c(o6 o6Var) {
        ri30 ri30Var = new ri30(o6Var, (byte) 1);
        o6Var.addOnAttachStateChangeListener(ri30Var);
        return new qga0(o6Var, ri30Var, (byte) 25);
    }

    public String d() {
        return "oauth/access_token";
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return gu11.a;
        }
        if (fe00Var.equals(ce00.a)) {
            return iu11.a;
        }
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return ((k1r) obj) instanceof i1r;
            case 9:
                return ((th61) obj).b;
            case 10:
                return ((PlayerState) ((mmr0) obj).b).track().c();
            case 13:
                return ((String) obj).length() > 0;
            case 21:
                return !((uv00) obj).f;
            default:
                return !((spq0) obj).c();
        }
    }

    public boolean test(Object obj, Object obj2) {
        return !u890.j(((od51) obj).d, ((od51) obj2).d);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 6:
                ((Number) obj2).longValue();
                return obj;
            default:
                return new mmr0((CollectionTrack) obj, (lo7) obj2);
        }
    }
}
