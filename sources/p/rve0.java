package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rve0 implements Update {
    public static final rve0 b = new rve0((byte) 0);
    public static final rve0 c = new rve0((byte) 1);
    public static final rve0 d = new rve0((byte) 2);
    public static final rve0 e = new rve0((byte) 3);
    public static final rve0 f = new rve0((byte) 4);
    public static final rve0 g = new rve0((byte) 5);
    public static final rve0 h = new rve0((byte) 6);
    public static final rve0 i = new rve0((byte) 7);
    public static final rve0 j = new rve0((byte) 8);
    public final /* synthetic */ byte a;

    public rve0(x8j1 x8j1Var) {
        this.a = (byte) 10;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:212:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:213:0x04f8  */
    public final Next a(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Next nextH;
        List listA;
        List list;
        ArrayList arrayListN0;
        ArrayList arrayList;
        kyn0 kyn0Var;
        hwn0 hwn0Var;
        nsn0 nsn0Var;
        List list2;
        mmr0 mmr0VarN;
        switch (this.a) {
            case 0:
                qae qaeVar = (qae) obj;
                mae maeVar = (mae) obj2;
                if (maeVar instanceof lae) {
                    boolean z = qaeVar.a;
                    boolean z2 = ((lae) maeVar).a;
                    if (z == z2) {
                        return Next.j();
                    }
                    Map map = qaeVar.b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(((Map.Entry) it.next()).getKey(), j82.y(z2));
                    }
                    return Next.h(new qae(linkedHashMap, z2));
                }
                if (!(maeVar instanceof kae)) {
                    eg.o();
                    return null;
                }
                qaeVar.getClass();
                boolean z3 = qaeVar.a;
                Map map2 = qaeVar.b;
                Set set = ((kae) maeVar).a;
                int iS = zno1.s(q7h.U(set, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj3 : set) {
                    linkedHashMap2.put(obj3, j82.y(z3));
                }
                return Next.h(new qae(sqg0.O(map2, linkedHashMap2), z3));
            case 1:
                ijo ijoVar = (ijo) obj;
                z450 z450Var = (l700) obj2;
                if (z450Var instanceof v450) {
                    v450 v450Var = (v450) z450Var;
                    String str = v450Var.a;
                    return Next.a(Collections.singleton(new qgo(str, v450Var.b, ijoVar.a.contains(str))));
                }
                if (!(z450Var instanceof w450)) {
                    if (z450Var instanceof y450) {
                        ijoVar.getClass();
                        y450 y450Var = (y450) z450Var;
                        return Next.i(ijo.a(ijoVar, null, null, y450Var.a, null, 11), Collections.singleton(new gip0(y450Var.a)));
                    }
                    if (!(z450Var instanceof z450)) {
                        eg.o();
                        return null;
                    }
                    z450 z450Var2 = z450Var;
                    if (ijoVar.c.containsAll(z450Var2.a())) {
                        return Next.j();
                    }
                    LinkedHashSet linkedHashSetY0 = dm61.y0(z450Var2.a(), ijoVar.c);
                    return Next.i(ijo.a(ijoVar, null, null, linkedHashSetY0, null, 11), Collections.singleton(new gip0(linkedHashSetY0)));
                }
                w450 w450Var = (w450) z450Var;
                Map map3 = w450Var.b;
                Map map4 = w450Var.a;
                Set setEntrySet = map4.entrySet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : setEntrySet) {
                    if (((Boolean) ((Map.Entry) obj4).getValue()).booleanValue()) {
                        arrayList2.add(obj4);
                    } else {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList4.add((String) ((Map.Entry) it2.next()).getKey());
                }
                Set setP1 = o7h.p1(arrayList4);
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    arrayList5.add((String) ((Map.Entry) it3.next()).getKey());
                }
                mmr0 mmr0VarN2 = oqn1.n(setP1, o7h.p1(arrayList5));
                Set set2 = (Set) mmr0VarN2.a;
                Set set3 = (Set) mmr0VarN2.b;
                Set setEntrySet2 = map3.entrySet();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : setEntrySet2) {
                    if (((Boolean) ((Map.Entry) obj5).getValue()).booleanValue()) {
                        arrayList6.add(obj5);
                    } else {
                        arrayList7.add(obj5);
                    }
                }
                ArrayList arrayList8 = new ArrayList(q7h.U(arrayList6, 10));
                Iterator it4 = arrayList6.iterator();
                while (it4.hasNext()) {
                    arrayList8.add((String) ((Map.Entry) it4.next()).getKey());
                }
                Set setP2 = o7h.p1(arrayList8);
                ArrayList arrayList9 = new ArrayList(q7h.U(arrayList7, 10));
                Iterator it5 = arrayList7.iterator();
                while (it5.hasNext()) {
                    arrayList9.add((String) ((Map.Entry) it5.next()).getKey());
                }
                mmr0 mmr0VarN3 = oqn1.n(setP2, o7h.p1(arrayList9));
                Set set4 = (Set) mmr0VarN3.a;
                Set set5 = (Set) mmr0VarN3.b;
                ijoVar.getClass();
                return Next.h(ijo.a(ijoVar, dm61.v0(dm61.y0(ijoVar.a, set2), set3), dm61.v0(dm61.y0(ijoVar.b, set4), set5), null, dm61.y0(dm61.y0(ijoVar.d, map4.keySet()), map3.keySet()), 4));
            case 2:
                whx0 whx0Var = (whx0) obj;
                wkl wklVar = (all) obj2;
                if (wklVar instanceof wkl) {
                    return Next.h(new whx0(sqg0.O(whx0Var.a, wklVar.a)));
                }
                if (wklVar instanceof xkl) {
                    return Next.i(new whx0(whx0Var.a), Collections.singleton(new skl(((xkl) wklVar).a)));
                }
                eg.o();
                return null;
            case 3:
                k2v k2vVar = (k2v) obj;
                hwu hwuVar = (hwu) obj2;
                if (hwuVar instanceof ewu) {
                    ewu ewuVar = (ewu) hwuVar;
                    return Next.a(Collections.singleton(new uuu(ewuVar.a, ewuVar.b)));
                }
                if (hwuVar instanceof dwu) {
                    k2vVar.getClass();
                    dwu dwuVar = (dwu) hwuVar;
                    String str2 = dwuVar.a;
                    return Next.i(rc2.n(k2vVar, g2v.a, str2), Collections.singleton(new tuu(str2, dwuVar.b)));
                }
                if (hwuVar instanceof fwu) {
                    k2vVar.getClass();
                    fwu fwuVar = (fwu) hwuVar;
                    String str3 = fwuVar.a;
                    return Next.i(rc2.n(k2vVar, f2v.a, str3), Collections.singleton(new vuu(str3, fwuVar.b)));
                }
                if (hwuVar instanceof gwu) {
                    gwu gwuVar = (gwu) hwuVar;
                    return Next.h(new k2v(sqg0.O(k2vVar.a, gwuVar.a), sqg0.O(k2vVar.b, gwuVar.b)));
                }
                eg.o();
                return null;
            case 4:
                g2v0 g2v0Var = (g2v0) obj;
                f2v0 f2v0Var = (f2v0) obj2;
                if (u890.j(f2v0Var, d2v0.a)) {
                    g2v0Var.getClass();
                    nextH = Next.i(new g2v0(false), Collections.singleton(c2v0.a));
                } else {
                    if (!(f2v0Var instanceof e2v0)) {
                        eg.o();
                        return null;
                    }
                    boolean z4 = ((e2v0) f2v0Var).a;
                    g2v0Var.getClass();
                    nextH = Next.h(new g2v0(z4));
                }
                return nextH;
            case 5:
                j9v0 j9v0Var = (j9v0) obj;
                i9v0 i9v0Var = (i9v0) obj2;
                if (i9v0Var instanceof g9v0) {
                    return Next.a(Collections.singleton(new d9v0(((g9v0) i9v0Var).a)));
                }
                if (i9v0Var instanceof h9v0) {
                    return Next.h(new j9v0(sqg0.O(j9v0Var.a, ((h9v0) i9v0Var).a)));
                }
                eg.o();
                return null;
            case 6:
                elv0 elv0Var = (elv0) obj;
                xkv0 xkv0Var = (blv0) obj2;
                if (xkv0Var instanceof xkv0) {
                    return Next.h(new elv0(sqg0.O(elv0Var.a, xkv0Var.a)));
                }
                if (!(xkv0Var instanceof tkv0)) {
                    if (xkv0Var instanceof vkv0) {
                        vkv0 vkv0Var = (vkv0) xkv0Var;
                        return Next.i(new elv0(sqg0.P(elv0Var.a, oqn1.n(vkv0Var.a(), Boolean.TRUE))), Collections.singleton(new wjv0(vkv0Var.a())));
                    }
                    if (xkv0Var instanceof zkv0) {
                        zkv0 zkv0Var = (zkv0) xkv0Var;
                        return Next.i(new elv0(sqg0.P(elv0Var.a, oqn1.n(zkv0Var.a(), Boolean.FALSE))), Collections.singleton(new yjv0(zkv0Var.a())));
                    }
                    eg.o();
                    return null;
                }
                Map map5 = elv0Var.a;
                Set set6 = ((tkv0) xkv0Var).a;
                Set set7 = set6;
                int iS2 = zno1.s(q7h.U(set7, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj6 : set7) {
                    linkedHashMap3.put(obj6, Boolean.FALSE);
                }
                return Next.i(new elv0(sqg0.O(map5, linkedHashMap3)), Collections.singleton(new ujv0(set6)));
            case 7:
                b521 b521Var = (b521) obj;
                a521 a521Var = (a521) obj2;
                if (a521Var instanceof x421) {
                    LinkedHashMap linkedHashMapX = sqg0.X(b521Var.a);
                    for (Map.Entry entry : ((x421) a521Var).a.entrySet()) {
                        linkedHashMapX.put(entry.getKey(), new xnl((List) entry.getValue()));
                    }
                    return Next.h(new b521(linkedHashMapX));
                }
                if (a521Var instanceof y421) {
                    Object obj7 = b521Var.a.get(((y421) a521Var).a);
                    xnl xnlVar = obj7 instanceof xnl ? (xnl) obj7 : null;
                    if (xnlVar == null || (listA = xnlVar.a()) == null) {
                        listA = z6x.a;
                    }
                    List list3 = listA;
                    ArrayList arrayList10 = new ArrayList(q7h.U(list3, 10));
                    Iterator it6 = list3.iterator();
                    while (it6.hasNext()) {
                        arrayList10.add(((bgu0) it6.next()).a());
                    }
                    return Next.i(b521Var, Collections.singleton(new r421(o7h.p1(arrayList10))));
                }
                boolean z5 = a521Var instanceof w421;
                ynl ynlVar = ynl.a;
                if (z5) {
                    LinkedHashMap linkedHashMapX2 = sqg0.X(b521Var.a);
                    String str4 = ((w421) a521Var).a;
                    linkedHashMapX2.put(str4, ynlVar);
                    return Next.i(new b521(linkedHashMapX2), Collections.singleton(new q421(Collections.singleton(str4))));
                }
                if (!(a521Var instanceof z421)) {
                    eg.o();
                    return null;
                }
                Set set8 = ((z421) a521Var).a;
                int iS3 = zno1.s(q7h.U(set8, 10));
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                for (Object obj8 : set8) {
                    linkedHashMap4.put(obj8, ynlVar);
                }
                b521Var.getClass();
                return Next.h(new b521(linkedHashMap4));
            case 8:
                o731 o731Var = (o731) obj;
                j731 j731Var = (m731) obj2;
                if (j731Var instanceof j731) {
                    Map map6 = o731Var.a;
                    Set set9 = o731Var.e;
                    j731 j731Var2 = j731Var;
                    LinkedHashMap linkedHashMapO = sqg0.O(map6, j731Var2.b);
                    LinkedHashSet linkedHashSetY1 = dm61.y0(set9, o7h.v0(j731Var2.a, o731Var.b));
                    return (linkedHashMapO.equals(o731Var.a) && linkedHashSetY1.equals(set9)) ? Next.j() : Next.h(o731.a(o731Var, linkedHashMapO, (Set) null, (Map) null, (Map) null, linkedHashSetY1, 14));
                }
                if (j731Var instanceof h731) {
                    o731Var.getClass();
                    Set set10 = ((h731) j731Var).a;
                    return Next.i(o731.a(o731Var, (LinkedHashMap) null, set10, (Map) null, (Map) null, (LinkedHashSet) null, 29), Collections.singleton(new y631(set10)));
                }
                if (j731Var instanceof i731) {
                    i731 i731Var = (i731) j731Var;
                    return Next.h(o731.a(o731Var, (LinkedHashMap) null, (Set) null, sqg0.P(o731Var.c, oqn1.n(i731Var.a(), i731Var.b())), (Map) null, (LinkedHashSet) null, 27));
                }
                if (!(j731Var instanceof l731)) {
                    if (j731Var instanceof k731) {
                        k731 k731Var = (k731) j731Var;
                        return !o731Var.c.containsKey(k731Var.a()) ? Next.j() : Next.h(o731.a(o731Var, (LinkedHashMap) null, (Set) null, sqg0.K(k731Var.a(), o731Var.c), (Map) null, (LinkedHashSet) null, 27));
                    }
                    eg.o();
                    return null;
                }
                Map map7 = o731Var.c;
                Map mapP = o731Var.d;
                l731 l731Var = (l731) j731Var;
                iu30 iu30Var = (iu30) map7.get(l731Var.a());
                if (iu30Var == null) {
                    return Next.j();
                }
                Object obj9 = mapP.get(l731Var.a());
                Boolean bool = Boolean.TRUE;
                if (!u890.j(obj9, bool)) {
                    mapP = sqg0.P(mapP, oqn1.n(l731Var.a(), bool));
                }
                return Next.i(o731.a(o731Var, (LinkedHashMap) null, (Set) null, (Map) null, mapP, (LinkedHashSet) null, 23), Collections.singleton(new z631(s731.a((s731) iu30Var.invoke(l731Var.a()), l731Var.b()))));
            case 9:
                lhm0 lhm0Var = (lhm0) obj;
                g000 g000Var = (g700) obj2;
                wvn0 wvn0Var = qvn0.b;
                hwn0 hwn0Var2 = lhm0Var.a;
                kyn0 kyn0Var2 = lhm0Var.b;
                boolean z6 = g000Var instanceof g000;
                ArrayList arrayListO0 = z6x.a;
                if (z6) {
                    nsn0 nsn0Var2 = g000Var.a;
                    if (mif1.i(nsn0Var2, kyn0Var2)) {
                        return Next.h(lhm0.a(lhm0Var, (hwn0) null, (kyn0) null, 0, (List) null, (String) null, nsn0Var2, 31));
                    }
                    if (kyn0Var2 != null) {
                        kyn0 kyn0Var3 = !kyn0Var2.c ? kyn0Var2 : null;
                        if (kyn0Var3 != null) {
                            arrayListO0 = o7h.O0(new tvn0(kyn0Var2.b, kyn0Var2.a), kyn0Var3.d);
                        }
                    }
                    return Next.h(lhm0.a(lhm0Var, (hwn0) null, new kyn0(nsn0Var2, 1, arrayListO0, 4), 0, (List) null, (String) null, (nsn0) null, 29));
                }
                boolean z7 = g000Var instanceof zzz;
                nsn0 nsn0Var3 = jsn0.a;
                if (z7) {
                    nsn0 nsn0Var4 = ((zzz) g000Var).a;
                    ArrayList arrayList11 = (kyn0Var2 == null || (list2 = kyn0Var2.d) == null) ? new ArrayList() : new ArrayList(list2);
                    int i2 = kyn0Var2 != null ? kyn0Var2.b : 0;
                    int i3 = i2 == 0 ? -1 : own0.a[l1d.C(i2)];
                    if (i3 == -1) {
                        arrayList11.add(wvn0Var);
                    } else if (i3 != 1) {
                        if (i3 != 2) {
                            eg.o();
                        } else if (mif1.i(nsn0Var4, kyn0Var2)) {
                            nsn0Var4 = kyn0Var2.a;
                        } else {
                            arrayList11.add(new rvn0(kyn0Var2.a));
                        }
                    } else if (nsn0Var4.equals(nsn0Var3)) {
                        nsn0Var4 = kyn0Var2.a;
                        arrayList11.add(qvn0.a);
                    } else if (mif1.i(nsn0Var4, kyn0Var2)) {
                        nsn0Var4 = kyn0Var2.a;
                    } else {
                        nsn0 nsn0Var5 = kyn0Var2.a;
                        if (nsn0Var4.equals(nsn0Var5)) {
                            nsn0Var4 = nsn0Var5;
                        } else {
                            r7h.W(p7h.M(new wvn0[]{new tvn0(kyn0Var2.b, nsn0Var5), wvn0Var}), arrayList11);
                        }
                    }
                    return Next.h(lhm0.a(lhm0Var, (hwn0) null, new kyn0(nsn0Var4, 2, arrayList11, 4), 0, (List) null, (String) null, (nsn0) null, 61));
                }
                if (!(g000Var instanceof f000)) {
                    if (g000Var instanceof wvz) {
                        wvz wvzVar = (wvz) g000Var;
                        return Next.i(lhm0.a(lhm0Var, wvzVar.a, (kyn0Var2 == null || kyn0Var2.a.a()) ? null : kyn0Var2, 2, arrayListO0, (String) null, (nsn0) null, 16), Effects.a(new qun0[]{new qun0(wvzVar.a, hwn0Var2, bsn0.a, (kyn0Var2 == null || (list = kyn0Var2.d) == null) ? arrayListO0 : list, lhm0Var.d, (String) null, (Long) null)}));
                    }
                    if (g000Var instanceof xvz) {
                        xvz xvzVar = (xvz) g000Var;
                        if (kyn0Var2 == null) {
                            kyn0Var2 = new kyn0(asn0.a, 2, (List) null, 12);
                        }
                        return Next.h(lhm0.a(lhm0Var, xvzVar.a, kyn0Var2, 1, (List) null, (String) null, (nsn0) null, 56));
                    }
                    if (g000Var instanceof nzz) {
                        return Next.h(lhm0.a(lhm0Var, (hwn0) null, (kyn0) null, 0, o7h.O0(((nzz) g000Var).a(), o7h.e1(2, lhm0Var.d)), (String) null, (nsn0) null, 55));
                    }
                    if (g000Var instanceof cwz) {
                        return Next.h(lhm0.a(lhm0Var, (hwn0) null, (kyn0) null, 0, (List) null, ((cwz) g000Var).getId(), (nsn0) null, 47));
                    }
                    eg.o();
                    return null;
                }
                f000 f000Var = (f000) g000Var;
                hwn0 hwn0Var3 = f000Var.a;
                List list4 = f000Var.b;
                if (kyn0Var2 == null && u890.j(hwn0Var2, hwn0Var3)) {
                    return Next.j();
                }
                int i4 = kyn0Var2 != null ? kyn0Var2.b : 0;
                int i5 = i4 == 0 ? -1 : own0.a[l1d.C(i4)];
                wvn0 wvn0Var2 = svn0.a;
                if (i5 == -1) {
                    arrayListN0 = o7h.N0(list4, p7h.M(new wvn0[]{wvn0Var, wvn0Var2}));
                } else {
                    if (i5 == 1) {
                        kyn0Var2.getClass();
                        nsn0Var3 = kyn0Var2.a;
                        String str5 = hwn0Var3.b.b;
                        boolean z8 = (!(nsn0Var3 instanceof lsn0) || str5 == null || u890.j(((lsn0) nsn0Var3).b, str5)) ? false : true;
                        List list5 = kyn0Var2.d;
                        if (z8) {
                            ArrayList arrayListN1 = o7h.N0(list4, list5);
                            kyn0Var = new kyn0(nsn0Var3, kyn0Var2.b, true, list5);
                            nsn0Var3 = gsn0.a;
                            arrayList = arrayListN1;
                        } else {
                            arrayListN0 = o7h.O0(wvn0Var2, o7h.N0(list4, list5));
                        }
                        if (kyn0Var == null && (nsn0Var = lhm0Var.f) != null) {
                            kyn0Var = new kyn0(nsn0Var, 1, (List) null, 12);
                        }
                        kyn0 kyn0Var4 = kyn0Var;
                        hwn0 hwn0Var4 = f000Var.a;
                        if (u890.j(nsn0Var3, fsn0.a)) {
                            hwn0Var = null;
                        } else {
                            hwn0Var = hwn0Var2;
                        }
                        return Next.i(lhm0.a(lhm0Var, f000Var.a, kyn0Var4, 0, arrayListO0, (String) null, (nsn0) null, 4), Effects.a(new qun0[]{new qun0(hwn0Var4, hwn0Var, nsn0Var3, arrayList, lhm0Var.d, lhm0Var.e, f000Var.c)}));
                    }
                    if (i5 == 2) {
                        nsn0Var3 = kyn0Var2.a;
                        arrayListN0 = o7h.N0(list4, kyn0Var2.d);
                    } else {
                        eg.o();
                    }
                }
                arrayList = arrayListN0;
                kyn0Var = null;
                if (kyn0Var == null) {
                    kyn0Var = new kyn0(nsn0Var, 1, (List) null, 12);
                }
                kyn0 kyn0Var5 = kyn0Var;
                hwn0 hwn0Var5 = f000Var.a;
                if (u890.j(nsn0Var3, fsn0.a)) {
                    hwn0Var = null;
                } else {
                    hwn0Var = hwn0Var2;
                }
                return Next.i(lhm0.a(lhm0Var, f000Var.a, kyn0Var5, 0, arrayListO0, (String) null, (nsn0) null, 4), Effects.a(new qun0[]{new qun0(hwn0Var5, hwn0Var, nsn0Var3, arrayList, lhm0Var.d, lhm0Var.e, f000Var.c)}));
                return null;
            default:
                f8j1 f8j1Var = (f8j1) obj;
                s7j1 s7j1Var = (z7j1) obj2;
                boolean z9 = f8j1Var.b;
                long j2 = f8j1Var.h;
                e8j1 e8j1Var = f8j1Var.g;
                boolean z10 = f8j1Var.c;
                ji0 ji0Var = f8j1Var.e;
                boolean z11 = f8j1Var.a;
                if (s7j1Var.equals(p7j1.a)) {
                    return Next.i(f8j1Var, Collections.singleton(new g7j1("cta_button", ji0Var)));
                }
                if (s7j1Var.equals(q7j1.a)) {
                    return Next.i(f8j1Var, Collections.singleton(new g7j1("container", ji0Var)));
                }
                if (s7j1Var.equals(r7j1.a)) {
                    n1x n1xVar = f8j1Var.f;
                    return Next.i(f8j1Var, Collections.singleton(new e7j1(n1xVar != null ? n1xVar.a : "")));
                }
                boolean zEquals = s7j1Var.equals(x7j1.a);
                h7j1 h7j1Var = h7j1.a;
                k7j1 k7j1Var = k7j1.a;
                d8j1 d8j1Var = d8j1.a;
                c8j1 c8j1Var = c8j1.a;
                if (zEquals) {
                    if (u890.j(e8j1Var, c8j1Var)) {
                        return Next.i(f8j1.a(f8j1Var, false, false, false, false, d8j1Var, 0L, 191), Collections.singleton(k7j1Var));
                    }
                    return u890.j(e8j1Var, d8j1Var) ? Next.i(f8j1.a(f8j1Var, false, false, false, false, c8j1Var, 0L, 191), Collections.singleton(h7j1Var)) : Next.j();
                }
                boolean zEquals2 = s7j1Var.equals(y7j1.a);
                f7j1 f7j1Var = f7j1.a;
                if (zEquals2) {
                    return Next.i(f8j1.a(f8j1Var, !z11, false, false, false, (e8j1) null, 0L, 254), z11 ? dm61.z0(new o7j1[]{n7j1.a, i7j1.a}) : Collections.singleton(f7j1Var));
                }
                boolean z12 = s7j1Var instanceof s7j1;
                Set setSingleton = w7x.a;
                if (z12) {
                    if (!z10) {
                        s7j1 s7j1Var2 = s7j1Var;
                        if (s7j1Var2.a()) {
                            return Next.i(f8j1.a(f8j1Var, false, s7j1Var2.a(), true, false, (e8j1) null, 0L, 249), Collections.singleton(new m7j1(s7j1Var2.b(), z11)));
                        }
                    }
                    s7j1 s7j1Var3 = s7j1Var;
                    if (s7j1Var3.a()) {
                        if ((e8j1Var instanceof b8j1) || (e8j1Var instanceof a8j1)) {
                            setSingleton = new LinkedHashSet();
                            setSingleton.add(new j7j1(ji0Var, j2));
                        } else if (u890.j(e8j1Var, c8j1Var)) {
                            setSingleton = Collections.singleton(k7j1Var);
                        }
                        mmr0VarN = oqn1.n(d8j1Var, setSingleton);
                    } else {
                        mmr0VarN = (s7j1Var3.a() || !(e8j1Var instanceof d8j1)) ? oqn1.n(e8j1Var, setSingleton) : oqn1.n(c8j1Var, Collections.singleton(h7j1Var));
                    }
                    return Next.i(f8j1.a(f8j1Var, false, s7j1Var3.a(), false, false, (e8j1) mmr0VarN.a, 0L, 189), (Set) mmr0VarN.b);
                }
                if (s7j1Var instanceof v7j1) {
                    fzt0 fzt0VarA = ((v7j1) s7j1Var).a();
                    if (u890.j(fzt0VarA, izt0.a)) {
                        return Next.h(f8j1.a(f8j1Var, false, false, false, false, d8j1Var, 0L, 63));
                    }
                    if (fzt0VarA instanceof fzt0) {
                        fzt0 fzt0Var = fzt0VarA;
                        int iC = l1d.C(fzt0Var.b());
                        boolean z13 = iC == 2 || iC == 3 || iC == 4;
                        boolean z14 = fzt0Var.b() == 6;
                        if (z14) {
                            z10 = false;
                        }
                        f8j1 f8j1VarA = f8j1.a(f8j1Var, false, false, z10, z14 ? false : f8j1Var.d, new a8j1(z13), z13 ? 0L : fzt0Var.a(), 51);
                        if (z14) {
                            setSingleton = Collections.singleton(new l7j1(fzt0Var.a(), z11));
                        }
                        return Next.i(f8j1VarA, setSingleton);
                    }
                    if (fzt0VarA instanceof gzt0) {
                        gzt0 gzt0Var = (gzt0) fzt0VarA;
                        return Next.i(f8j1.a(f8j1Var, false, false, false, false, c8j1Var, gzt0Var.a(), 63), Collections.singleton(new l7j1(gzt0Var.a(), z11)));
                    }
                    if (u890.j(fzt0VarA, hzt0.a)) {
                        return Next.h(f8j1.a(f8j1Var, false, false, false, false, d8j1Var, 0L, 63));
                    }
                    if (u890.j(fzt0VarA, jzt0.a)) {
                        f8j1 f8j1VarA2 = f8j1.a(f8j1Var, false, false, false, true, (e8j1) null, z9 ? 0L : j2, 119);
                        if (z9) {
                            setSingleton = Collections.singleton(new j7j1(ji0Var, j2));
                        }
                        return Next.i(f8j1VarA2, setSingleton);
                    }
                    if (u890.j(fzt0VarA, kzt0.a)) {
                        return Next.h(f8j1.a(f8j1Var, false, false, false, false, new a8j1(true), 0L, 179));
                    }
                    eg.o();
                } else {
                    if (s7j1Var instanceof u7j1) {
                        return ((u7j1) s7j1Var).a() ? Next.i(f8j1.a(f8j1Var, true, false, false, false, (e8j1) null, 0L, 254), Collections.singleton(f7j1Var)) : Next.j();
                    }
                    if (s7j1Var instanceof w7j1) {
                        return z10 ? Next.j() : Next.i(f8j1.a(f8j1Var, false, false, true, false, (e8j1) null, 0L, 251), Collections.singleton(new m7j1(((w7j1) s7j1Var).a(), z11)));
                    }
                    if (s7j1Var instanceof t7j1) {
                        return z10 ? Next.j() : Next.i(f8j1.a(f8j1Var, false, false, true, false, (e8j1) null, 0L, 251), Collections.singleton(new m7j1(((t7j1) s7j1Var).a(), z11)));
                    }
                    eg.o();
                }
                return null;
        }
    }

    public /* synthetic */ rve0(byte b2) {
        this.a = b2;
    }
}
