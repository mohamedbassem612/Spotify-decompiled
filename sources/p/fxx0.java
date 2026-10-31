package p;

import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fxx0 {
    public static final fxx0 a = new fxx0();

    public static Next A(eux0 eux0Var, vsx0 vsx0Var) {
        if (u890.j(eux0Var.n, Boolean.FALSE)) {
            return b(eux0Var, vsx0Var.a, exx0.a);
        }
        List list = eux0Var.u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof j8f) {
                arrayList.add(obj);
            }
        }
        j8f j8fVar = (j8f) o7h.C0(arrayList);
        String strS = j8fVar != null ? j8fVar.s() : null;
        String str = eux0Var.m;
        if (str != null) {
            return Next.a(Collections.singleton(new kvx0(strS, str)));
        }
        eg.m("Required value was null.");
        return null;
    }

    public static Next B(eux0 eux0Var, ysx0 ysx0Var) {
        Object next;
        String str = ysx0Var.a;
        List list = eux0Var.u;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((b9f) next).s(), str));
        b9f b9fVar = (b9f) next;
        if (b9fVar != null) {
            return Next.h(eux0.a(eux0Var, ztx0.c, null, false, null, null, false, null, null, null, false, o7h.a1(prn1.s(list, b9fVar, new y8f(b9fVar.t(), str, b9fVar.r())), new ktg0((byte) 20)), null, 31457278));
        }
        eg.m(l1d.m("Not able to find message with id ", str));
        return null;
    }

    public static Next C(eux0 eux0Var, ctx0 ctx0Var) {
        for (String str : eux0Var.k) {
            if (u890.j(str, ctx0Var.a)) {
                return c(eux0Var, str);
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    public static Next D(eux0 eux0Var) {
        return (u890.j(eux0Var.a, ztx0.c) && eux0Var.t) ? e(eux0Var) : i(eux0Var);
    }

    public static Next E(eux0 eux0Var, gtx0 gtx0Var) {
        ArrayList arrayListO0 = o7h.O0(new z8f(gtx0Var.b, gtx0Var.a, gtx0Var.c), eux0Var.u);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListO0) {
            if (hashSet.add(((b9f) obj).s())) {
                arrayList.add(obj);
            }
        }
        return Next.i(eux0.a(eux0Var, ztx0.c, null, false, null, null, false, null, null, null, false, o7h.a1(arrayList, new ktg0((byte) 22)), eux0Var.c ? o7h.O0(gtx0Var, eux0Var.v) : z6x.a, 27262974), dm61.A0(prn1.f(eux0Var, new g1x0(eux0Var, gtx0Var, (byte) 14))));
    }

    public static Next F(eux0 eux0Var, htx0 htx0Var) {
        boolean z = htx0Var.d;
        String str = htx0Var.b;
        long j = htx0Var.c;
        String str2 = htx0Var.a;
        List list = eux0Var.u;
        if (z) {
            return Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.O0(new r8f(j, str2, str), list), null, 31457279));
        }
        return Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.O0(new q8f(j, str2, str), list), null, 31457279));
    }

    public static Next G(eux0 eux0Var, jtx0 jtx0Var) {
        return Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.O0(new t8f(jtx0Var.c, jtx0Var.a, jtx0Var.b), eux0Var.u), null, 31457279));
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0274  */
    /* JADX WARN: Code duplicated, block: B:120:0x0276  */
    /* JADX WARN: Code duplicated, block: B:122:0x027f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0281  */
    /* JADX WARN: Code duplicated, block: B:125:0x0284  */
    /* JADX WARN: Code duplicated, block: B:127:0x0288  */
    /* JADX WARN: Code duplicated, block: B:128:0x028b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0290  */
    /* JADX WARN: Code duplicated, block: B:229:0x044f  */
    /* JADX WARN: Code duplicated, block: B:276:0x0516  */
    /* JADX WARN: Code duplicated, block: B:416:0x0897  */
    /* JADX WARN: Code duplicated, block: B:418:0x089b  */
    /* JADX WARN: Code duplicated, block: B:519:0x0b04  */
    /* JADX WARN: Code duplicated, block: B:57:0x014f A[EDGE_INSN: B:57:0x014f->B:58:0x0151 BREAK  A[LOOP:3: B:37:0x0106->B:55:0x0145]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v32 */
    public static Next H(eux0 eux0Var, ktx0 ktx0Var) {
        pvx0 pvx0Var;
        Object next;
        Object next2;
        b9f b9fVar;
        char c;
        Object next3;
        boolean z;
        List list;
        Object next4;
        Object objPrevious;
        z6x z6xVarL1;
        LinkedHashSet linkedHashSetB1;
        List listX;
        ArrayList arrayList;
        LinkedHashSet linkedHashSetB2;
        kqf1 kqf1Var;
        List list2;
        String str;
        ?? arrayList2;
        kqf1 kqf1VarR;
        boolean z2;
        qqn1 qqn1Var;
        pqx0 pqx0Var;
        svi0 svi0VarB;
        Set set;
        svi0 svi0VarB2;
        Set set2;
        z6x arrayList3;
        bwi0 bwi0Var;
        z6x arrayList4;
        bwi0 bwi0Var2;
        String str2 = eux0Var.m;
        dux0 dux0Var = eux0Var.e;
        qqn1 qqn1Var2 = eux0Var.a;
        Set set3 = eux0Var.r;
        boolean z3 = eux0Var.c;
        Set set4 = eux0Var.q;
        List list3 = eux0Var.u;
        List list4 = eux0Var.v;
        kqf1 kqf1Var2 = eux0Var.i;
        boolean z4 = ktx0Var instanceof zsx0;
        String str3 = "";
        char c2 = 2;
        aux0 aux0Var = aux0.c;
        ztx0 ztx0Var = ztx0.c;
        xtx0 xtx0Var = xtx0.c;
        int i = 3;
        z6x z6xVarO0 = z6x.a;
        if (z4) {
            zsx0 zsx0Var = (zsx0) ktx0Var;
            String str4 = zsx0Var.a;
            oqn1 oqn1Var = eux0Var.d;
            boolean z5 = eux0Var.y;
            List list5 = list4;
            boolean zIsEmpty = list5.isEmpty();
            List list6 = zsx0Var.f;
            String str5 = zsx0Var.b;
            boolean z6 = true;
            List list7 = zsx0Var.c;
            List list8 = list6;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj : list8) {
                List list9 = list6;
                String str6 = str3;
                if (obj instanceof cwi0) {
                    arrayList5.add(obj);
                }
                list6 = list9;
                str3 = str6;
            }
            List list10 = list6;
            String str7 = str3;
            ListIterator listIterator = arrayList5.listIterator(arrayList5.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                bwi0 bwi0Var3 = ((cwi0) objPrevious).f;
                if (bwi0Var3 != null && (!bwi0Var3.c.isEmpty()) == z6) {
                    break;
                }
                listIterator = listIterator;
                z6 = true;
            }
            cwi0 cwi0Var = (cwi0) objPrevious;
            ArrayList arrayListO0 = o7h.o0(prn1.s(list8, cwi0Var, cwi0Var != null ? cwi0.c(cwi0Var, (String) null, 0L, -1L, 55) : null));
            ArrayList arrayList6 = new ArrayList(q7h.U(arrayListO0, 10));
            Iterator it = arrayListO0.iterator();
            while (it.hasNext()) {
                arrayList6.add(prn1.v((gwi0) it.next()));
            }
            List listA1 = o7h.a1(arrayList6, new ktg0((byte) 21));
            if (!zIsEmpty && !list3.isEmpty()) {
                ListIterator listIterator2 = list3.listIterator(list3.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        z6xVarL1 = o7h.l1(list3);
                        break;
                    }
                    b9f b9fVar2 = (b9f) listIterator2.previous();
                    if (!(b9fVar2 instanceof z8f) && !(b9fVar2 instanceof v8f) && !(b9fVar2 instanceof w8f) && !(b9fVar2 instanceof u8f)) {
                        listIterator2.next();
                        int size = list3.size() - listIterator2.nextIndex();
                        if (size != 0) {
                            z6xVarL1 = new ArrayList(size);
                            while (listIterator2.hasNext()) {
                                z6xVarL1.add(listIterator2.next());
                            }
                            break;
                        }
                        z6xVarL1 = z6xVarO0;
                        break;
                    }
                }
            } else {
                z6xVarL1 = z6xVarO0;
                break;
            }
            ArrayList arrayListN0 = o7h.N0((Iterable) z6xVarL1, listA1);
            if (list7 != null) {
                List list11 = list7;
                ArrayList arrayList7 = new ArrayList(q7h.U(list11, 10));
                Iterator it2 = list11.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((awi0) it2.next()).a());
                }
                if (cwi0Var == null || (bwi0Var2 = cwi0Var.f) == null) {
                    arrayList4 = z6xVarO0;
                } else {
                    ArrayList arrayList8 = bwi0Var2.c;
                    arrayList4 = new ArrayList(q7h.U(arrayList8, 10));
                    Iterator it3 = arrayList8.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((awi0) it3.next()).a());
                    }
                }
                linkedHashSetB1 = o7h.b1(arrayList7, o7h.p1((Iterable) arrayList4));
            } else {
                linkedHashSetB1 = null;
            }
            boolean z7 = oqn1Var instanceof wtx0;
            Set setR1 = w7x.a;
            if (z7) {
                if (z5) {
                    listX = prn1.x(list7, setR1, linkedHashSetB1);
                } else if (kqf1Var2 != null) {
                    listX = kqf1Var2.c;
                } else {
                    listX = null;
                }
            } else if (!(oqn1Var instanceof utx0)) {
                if (!(oqn1Var instanceof vtx0)) {
                    eg.o();
                    return null;
                }
                List list12 = list7;
                listX = (list12 == null || list12.isEmpty()) ? ((vtx0) oqn1Var).c : prn1.x(list7, setR1, linkedHashSetB1);
            } else if (kqf1Var2 != null) {
                listX = kqf1Var2.c;
            } else {
                listX = null;
            }
            if (listX != null) {
                List list13 = listX;
                arrayList = new ArrayList(q7h.U(list13, 10));
                Iterator it4 = list13.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((iqf1) it4.next()).a());
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                if (cwi0Var == null || (bwi0Var = cwi0Var.f) == null) {
                    arrayList3 = z6xVarO0;
                } else {
                    ArrayList arrayList9 = bwi0Var.c;
                    arrayList3 = new ArrayList(q7h.U(arrayList9, 10));
                    Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        arrayList3.add(((awi0) it5.next()).a());
                    }
                }
                linkedHashSetB2 = o7h.b1(arrayList, o7h.p1((Iterable) arrayList3));
            } else {
                linkedHashSetB2 = null;
            }
            if (cwi0Var != null) {
                bwi0 bwi0Var4 = cwi0Var.f;
                kqf1 kqf1Var3 = bwi0Var4 != null ? new kqf1(bwi0Var4.a, prn1.x(bwi0Var4.c, cwi0Var.e.a, linkedHashSetB2)) : null;
                if (kqf1Var3 != null) {
                    kqf1Var = kqf1Var3;
                } else if (listX == null) {
                    kqf1Var = null;
                } else {
                    if (listX.isEmpty()) {
                        list2 = null;
                    } else {
                        list2 = listX;
                    }
                    if (list2 != null) {
                        if (str5 == null) {
                            str = str7;
                        } else {
                            str = str5;
                        }
                        kqf1Var = new kqf1(str, list2);
                    } else {
                        kqf1Var = null;
                    }
                }
            } else if (listX == null) {
                kqf1Var = null;
            } else {
                if (listX.isEmpty()) {
                    list2 = listX;
                } else {
                    list2 = null;
                }
                if (list2 != null) {
                    if (str5 == null) {
                        str = str7;
                    } else {
                        str = str5;
                    }
                    kqf1Var = new kqf1(str, list2);
                } else {
                    kqf1Var = null;
                }
            }
            if (kqf1Var != null) {
                List list14 = kqf1Var.c;
                arrayList2 = new ArrayList(q7h.U(list14, 10));
                Iterator it6 = list14.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(((iqf1) it6.next()).a());
                }
            } else {
                arrayList2 = z6xVarO0;
            }
            boolean z8 = (arrayList == null || arrayList.isEmpty() || arrayList2.equals(arrayList)) ? false : true;
            gwi0 gwi0Var = (gwi0) o7h.C0(list10);
            Set setP1 = (gwi0Var == null || (svi0VarB2 = gwi0Var.b()) == null || (set2 = svi0VarB2.b) == null) ? setR1 : o7h.p1(dm61.y0(set2, set3));
            if (arrayList != null && z8) {
                Set setP2 = o7h.p1(arrayList);
                setP1 = o7h.r1(o7h.b1(setP2, o7h.p1((Iterable) arrayList2)), o7h.v0(setP1, setP2));
            }
            gwi0 gwi0Var2 = (gwi0) o7h.C0(list10);
            if (gwi0Var2 != null && (svi0VarB = gwi0Var2.b()) != null && (set = svi0VarB.a) != null) {
                setR1 = o7h.p1(dm61.y0(set, set4));
            }
            if (arrayList != null && z8) {
                Set setP3 = o7h.p1(arrayList);
                setR1 = o7h.r1(o7h.b1(o7h.p1((Iterable) arrayList2), setP3), o7h.b1(setR1, setP3));
            }
            if (arrayList == null || !z8) {
                kqf1VarR = kqf1Var;
            } else if (kqf1Var != null) {
                ArrayList arrayListN1 = o7h.N0(kqf1Var.c, listX);
                HashSet hashSet = new HashSet();
                ArrayList<iqf1> arrayList10 = new ArrayList();
                for (Object obj2 : arrayListN1) {
                    if (hashSet.add(((iqf1) obj2).a())) {
                        arrayList10.add(obj2);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                for (iqf1 iqf1VarB : arrayList10) {
                    if (setP1.contains(iqf1VarB.a())) {
                        if (iqf1VarB instanceof eqf1) {
                            iqf1VarB = eqf1.b((eqf1) iqf1VarB, true, null, 251);
                        } else if (!(iqf1VarB instanceof gqf1)) {
                            eg.o();
                            return null;
                        }
                    } else if (setR1.contains(iqf1VarB.a())) {
                        iqf1VarB = null;
                    }
                    if (iqf1VarB != null) {
                        arrayList11.add(iqf1VarB);
                    }
                }
                kqf1VarR = kqf1.r(kqf1Var, arrayList11);
            } else {
                kqf1VarR = null;
            }
            List list15 = list10;
            ArrayList arrayList12 = new ArrayList();
            for (Object obj3 : list15) {
                if (obj3 instanceof cwi0) {
                    arrayList12.add(obj3);
                }
            }
            if (arrayList12.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator it7 = arrayList12.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z2 = false;
                    break;
                }
                bwi0 bwi0Var5 = ((cwi0) it7.next()).f;
                if (bwi0Var5 != null && (!bwi0Var5.c.isEmpty())) {
                    z2 = true;
                    break;
                }
            }
            oqn1 vtx0Var = str2 != null ? new vtx0(listX) : utx0.c;
            boolean z9 = (!(eux0Var.w instanceof stx0) || arrayListN0.isEmpty() || (((b9f) o7h.C0(arrayListN0)) instanceof e8f)) ? false : true;
            if (!list5.isEmpty()) {
                qqn1Var = qqn1Var2;
            } else if (z9) {
                qqn1Var = ztx0Var;
            } else if (z5 || (kqf1VarR != null && (!kqf1VarR.c.isEmpty()))) {
                qqn1Var = xtx0Var;
            } else if (arrayListN0.isEmpty() || z5) {
                qqn1Var = aux0Var;
            } else {
                qqn1Var = ztx0Var;
            }
            boolean z10 = str5 != null ? !str5.equals(kqf1Var != null ? kqf1Var.b : null) : false;
            ArrayList arrayList13 = new ArrayList();
            for (Object obj4 : list15) {
                if (obj4 instanceof cwi0) {
                    arrayList13.add(obj4);
                }
            }
            cwi0 cwi0Var2 = (cwi0) o7h.C0(arrayList13);
            String str8 = zsx0Var.b;
            String str9 = eux0Var.m;
            List list16 = zsx0Var.e;
            dux0 dux0Var2 = new dux0();
            Boolean bool = zsx0Var.h;
            if (bool == null) {
                bool = eux0Var.n;
            }
            Boolean bool2 = bool;
            String str10 = zsx0Var.d;
            if (str10 == null) {
                str10 = eux0Var.l;
            }
            String str11 = str10;
            Boolean boolValueOf = Boolean.valueOf(z3);
            if (!zIsEmpty) {
                boolValueOf = null;
            }
            eux0 eux0Var2 = new eux0(qqn1Var, str4, boolValueOf != null ? boolValueOf.booleanValue() : false, vtx0Var, dux0Var2, true, str8, kqf1VarR, list16, str11, str9, bool2, null, z10, setR1, setP1, z2, arrayListN0, eux0Var.w, false, 21530112);
            gqx0 gqx0Var = cwi0Var != null ? new gqx0(cwi0Var, false, true) : null;
            if (cwi0Var2 != null) {
                pqx0Var = new pqx0(cwi0Var2.c, zsx0Var.g, eux0Var.x);
                if (!z5 || !zIsEmpty || z9) {
                    pqx0Var = null;
                }
            } else {
                pqx0Var = null;
            }
            String str12 = eux0Var.o;
            return Next.i(eux0Var2, dm61.B0(new frx0[]{gqx0Var, pqx0Var, str12 != null ? new yqx0(str4, str12, setR1, setP1) : null, new qqx0(str4), rqx0.a, new vqx0(list4)}));
        }
        boolean z11 = false;
        if (ktx0Var instanceof asx0) {
            return Next.a(Collections.singleton(gvx0.a));
        }
        String str13 = "Collection contains no element matching the predicate.";
        if (ktx0Var instanceof hsx0) {
            hsx0 hsx0Var = (hsx0) ktx0Var;
            String str14 = hsx0Var.a;
            if (kqf1Var2 == null) {
                eg.m("Could not find track with id ".concat(str14));
                return null;
            }
            List<iqf1> list17 = kqf1Var2.c;
            for (iqf1 iqf1Var : list17) {
                if (u890.j(iqf1Var.a(), str14)) {
                    long j = 2;
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj5 : list3) {
                        long j2 = j;
                        b9f b9fVar3 = (b9f) obj5;
                        if (!(b9fVar3 instanceof m8f) && !(b9fVar3 instanceof w8f)) {
                            arrayList14.add(obj5);
                        }
                        j = j2;
                    }
                    long j3 = j;
                    long jT = ((b9f) o7h.A0(list3)).t();
                    ArrayList arrayListO1 = o7h.O0(str14, dux0Var.a);
                    ArrayList arrayList15 = new ArrayList(dux0Var.b);
                    arrayList15.remove(str14);
                    Iterator it8 = o7h.a1(arrayList14, new ktg0((byte) 18)).iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            list = list17;
                            next4 = null;
                            break;
                        }
                        next4 = it8.next();
                        Iterator it9 = it8;
                        b9f b9fVar4 = (b9f) next4;
                        list = list17;
                        if ((b9fVar4 instanceof s8f) || (b9fVar4 instanceof p8f)) {
                            break;
                        }
                        it8 = it9;
                        list17 = list;
                    }
                    b9f b9fVar5 = (b9f) next4;
                    long jT2 = b9fVar5 != null ? b9fVar5.t() : jT + j3;
                    ArrayList arrayListS = prn1.s(list, iqf1Var, iqf1Var instanceof eqf1 ? eqf1.b((eqf1) iqf1Var, true, null, 251) : iqf1Var);
                    ArrayList arrayList16 = new ArrayList();
                    for (Object obj6 : arrayListS) {
                        if (!set4.contains(((iqf1) obj6).a())) {
                            arrayList16.add(obj6);
                        }
                    }
                    kqf1 kqf1VarR2 = kqf1.r(kqf1Var2, arrayList16);
                    if (z3) {
                        z6xVarO0 = o7h.O0(hsx0Var, list4);
                    }
                    LinkedHashSet linkedHashSetX0 = dm61.x0(str14, set3);
                    dux0 dux0Var3 = new dux0(arrayListO1, arrayList15, dux0Var.c);
                    char c3 = c2;
                    eux0 eux0VarA = eux0.a(eux0Var, null, dux0Var3, false, null, kqf1VarR2, false, null, linkedHashSetX0, null, false, arrayList14, z6xVarO0, 27000559);
                    frx0 frx0VarF = prn1.f(eux0Var, new g1x0(eux0Var, hsx0Var, (byte) 11));
                    arx0 arx0Var = new arx0(jT, arrayListO1.size() == 1);
                    zqx0 zqx0Var = new zqx0(jT2);
                    frx0[] frx0VarArr = new frx0[i];
                    frx0VarArr[0] = frx0VarF;
                    frx0VarArr[1] = arx0Var;
                    frx0VarArr[c3] = zqx0Var;
                    return Next.i(eux0VarA, dm61.B0(frx0VarArr));
                }
                c2 = c2;
                str13 = str13;
                i = 3;
            }
            bhn0.t(str13);
            return null;
        }
        char c4 = 2;
        if (ktx0Var instanceof zrx0) {
            return Next.h(eux0.a(eux0Var, u890.j(qqn1Var2, xtx0Var) ? ztx0Var : qqn1Var2, null, false, mua0.a, null, false, null, null, null, false, null, null, 33554366));
        }
        if (ktx0Var instanceof btx0) {
            return Next.h(eux0.a(eux0Var, aux0Var, null, false, null, null, false, null, null, null, false, null, null, 33554398));
        }
        if (ktx0Var instanceof osx0) {
            osx0 osx0Var = (osx0) ktx0Var;
            String str15 = osx0Var.a;
            if (kqf1Var2 != null) {
                List<iqf1> list18 = kqf1Var2.c;
                ArrayList arrayList17 = new ArrayList();
                for (Object obj7 : list18) {
                    if (!u890.j(((iqf1) obj7).a(), str15)) {
                        arrayList17.add(obj7);
                    }
                }
                if (arrayList17.size() == list18.size()) {
                    arrayList17 = null;
                }
                if (arrayList17 != null) {
                    LinkedHashSet linkedHashSetX1 = dm61.x0(str15, set4);
                    ArrayList arrayList18 = new ArrayList();
                    for (Object obj8 : list3) {
                        b9f b9fVar6 = (b9f) obj8;
                        if (!(b9fVar6 instanceof p8f) && !(b9fVar6 instanceof w8f)) {
                            arrayList18.add(obj8);
                        }
                    }
                    long jT3 = ((b9f) o7h.A0(list3)).t();
                    ArrayList arrayList19 = new ArrayList(dux0Var.a);
                    arrayList19.remove(str15);
                    ArrayList arrayList20 = new ArrayList(dux0Var.b);
                    arrayList20.remove(str15);
                    ArrayList arrayListO2 = o7h.O0(str15, dux0Var.c);
                    Iterator it10 = arrayList18.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            c = c4;
                            next3 = null;
                            break;
                        }
                        next3 = it10.next();
                        b9f b9fVar7 = (b9f) next3;
                        c = c4;
                        if ((b9fVar7 instanceof m8f) || (b9fVar7 instanceof s8f)) {
                            break;
                        }
                        c4 = c;
                    }
                    b9f b9fVar8 = (b9f) next3;
                    long jT4 = b9fVar8 != null ? b9fVar8.t() : jT3 + 2;
                    kqf1 kqf1VarR3 = kqf1.r(kqf1Var2, arrayList17);
                    if (z3) {
                        z6xVarO0 = o7h.O0(osx0Var, list4);
                    }
                    eux0 eux0VarA2 = eux0.a(eux0Var, null, new dux0(arrayList19, arrayList20, arrayListO2), false, null, kqf1VarR3, false, linkedHashSetX1, null, null, false, arrayList18, z6xVarO0, 27131631);
                    for (iqf1 iqf1Var2 : list18) {
                        if (u890.j(iqf1Var2.a(), str15)) {
                            if (iqf1Var2 instanceof eqf1) {
                                eqf1 eqf1Var = (eqf1) iqf1Var2;
                                String str16 = eqf1Var.f.a;
                                pvx0 pvx0Var2 = str16 != null ? new pvx0(eqf1Var.a, str16) : null;
                                frx0 frx0VarF2 = prn1.f(eux0Var, new g1x0(eux0Var, linkedHashSetX1, (byte) 12));
                                if (arrayListO2.size() == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                frx0 brx0Var = new brx0(jT3, z);
                                zqx0 zqx0Var2 = new zqx0(jT4);
                                frx0[] frx0VarArr2 = new frx0[4];
                                frx0VarArr2[0] = pvx0Var2;
                                frx0VarArr2[1] = frx0VarF2;
                                frx0VarArr2[c] = brx0Var;
                                frx0VarArr2[3] = zqx0Var2;
                                return Next.i(eux0VarA2, dm61.B0(frx0VarArr2));
                            }
                            if (!(iqf1Var2 instanceof gqf1)) {
                                eg.o();
                                return null;
                            }
                            frx0 frx0VarF3 = prn1.f(eux0Var, new g1x0(eux0Var, linkedHashSetX1, (byte) 12));
                            if (arrayListO2.size() == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            frx0 brx0Var2 = new brx0(jT3, z);
                            zqx0 zqx0Var3 = new zqx0(jT4);
                            frx0[] frx0VarArr3 = new frx0[4];
                            frx0VarArr3[0] = pvx0Var2;
                            frx0VarArr3[1] = frx0VarF3;
                            frx0VarArr3[c] = brx0Var2;
                            frx0VarArr3[3] = zqx0Var3;
                            return Next.i(eux0VarA2, dm61.B0(frx0VarArr3));
                        }
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
            }
            return Next.j();
        }
        if (ktx0Var instanceof ftx0) {
            ftx0 ftx0Var = (ftx0) ktx0Var;
            String str17 = ftx0Var.a;
            if (kqf1Var2 == null) {
                eg.m("Could not find track with id ".concat(str17));
                return null;
            }
            List<iqf1> list19 = kqf1Var2.c;
            for (iqf1 iqf1Var3 : list19) {
                if (u890.j(iqf1Var3.a(), str17)) {
                    ArrayList arrayList21 = new ArrayList();
                    for (Object obj9 : list3) {
                        b9f b9fVar9 = (b9f) obj9;
                        if (!(b9fVar9 instanceof s8f) && !(b9fVar9 instanceof w8f)) {
                            arrayList21.add(obj9);
                        }
                    }
                    long jT5 = ((b9f) o7h.A0(list3)).t();
                    ArrayList arrayList22 = new ArrayList(dux0Var.a);
                    arrayList22.remove(str17);
                    ArrayList arrayListO3 = o7h.O0(str17, dux0Var.b);
                    Iterator it11 = arrayList21.iterator();
                    do {
                        if (!it11.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it11.next();
                        b9fVar = (b9f) next2;
                        if (b9fVar instanceof m8f) {
                            break;
                        }
                    } while (!(b9fVar instanceof p8f));
                    b9f b9fVar10 = (b9f) next2;
                    long jT6 = b9fVar10 != null ? b9fVar10.t() : jT5 + 2;
                    ArrayList arrayListS2 = prn1.s(list19, iqf1Var3, iqf1Var3 instanceof eqf1 ? eqf1.b((eqf1) iqf1Var3, z11, null, 251) : iqf1Var3);
                    ArrayList arrayList23 = new ArrayList();
                    for (Object obj10 : arrayListS2) {
                        if (!set4.contains(((iqf1) obj10).a())) {
                            arrayList23.add(obj10);
                        }
                    }
                    kqf1 kqf1VarR4 = kqf1.r(kqf1Var2, arrayList23);
                    if (z3) {
                        z6xVarO0 = o7h.O0(ftx0Var, list4);
                    }
                    return Next.i(eux0.a(eux0Var, null, new dux0(arrayList22, arrayListO3, dux0Var.c), false, null, kqf1VarR4, false, null, dm61.u0(str17, set3), null, false, arrayList21, z6xVarO0, 27000559), dm61.B0(new frx0[]{prn1.f(eux0Var, new g1x0(eux0Var, ftx0Var, (byte) 13)), new crx0(jT5, arrayListO3.size() == 1), new zqx0(jT6)}));
                }
                z11 = false;
            }
            bhn0.t("Collection contains no element matching the predicate.");
            return null;
        }
        if (ktx0Var instanceof fsx0) {
            b9f b9fVar11 = (b9f) o7h.s0(list3);
            return b9fVar11 != null ? Next.a(Collections.singleton(new mqx0(eux0Var.b, b9fVar11.t()))) : Next.j();
        }
        if (ktx0Var instanceof gsx0) {
            gsx0 gsx0Var = (gsx0) ktx0Var;
            return Next.a(Collections.singleton(new dqx0(gsx0Var.a, gsx0Var.b)));
        }
        if (ktx0Var instanceof orx0) {
            eux0 eux0Var3 = new eux0(cux0.c, eux0Var.b, eux0Var.y, eux0Var.d, new dux0(), eux0Var.f, null, null, eux0Var.k, eux0Var.l, eux0Var.m, null, null, eux0Var.f12p, null, null, false, null, eux0Var.w, false, 25085824);
            if (kqf1Var2 != null) {
                List list20 = kqf1Var2.c;
                ArrayList arrayList24 = new ArrayList();
                for (Object obj11 : list20) {
                    if (obj11 instanceof eqf1) {
                        arrayList24.add(obj11);
                    }
                }
                Iterator it12 = arrayList24.iterator();
                do {
                    if (!it12.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it12.next();
                } while (!((eqf1) next).f.e);
                eqf1 eqf1Var2 = (eqf1) next;
                if (eqf1Var2 != null) {
                    String str18 = eqf1Var2.a;
                    String str19 = eqf1Var2.f.a;
                    pvx0Var = new pvx0(str18, str19 == null ? "" : str19);
                } else {
                    pvx0Var = null;
                }
            } else {
                pvx0Var = null;
            }
            return Next.i(eux0Var3, dm61.B0(new frx0[]{pvx0Var, new jqx0(str2)}));
        }
        if (ktx0Var instanceof etx0) {
            etx0 etx0Var = (etx0) ktx0Var;
            return Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.O0(new v8f(etx0Var.c, etx0Var.a, etx0Var.b), eux0Var.u), null, 31457279));
        }
        if (ktx0Var instanceof isx0) {
            isx0 isx0Var = (isx0) ktx0Var;
            boolean z12 = isx0Var.d;
            String str20 = isx0Var.b;
            long j4 = isx0Var.c;
            String str21 = isx0Var.a;
            List list21 = eux0Var.u;
            return z12 ? Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.O0(new l8f(j4, str21, str20), list21), null, 31457279)) : Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.O0(new k8f(j4, str21, str20), list21), null, 31457279));
        }
        if (ktx0Var instanceof yrx0) {
            return Next.h(eux0.a(eux0Var, null, null, false, lua0.a, null, false, null, null, null, false, null, null, 33554367));
        }
        if (ktx0Var instanceof mrx0) {
            return e(eux0Var);
        }
        if (ktx0Var instanceof psx0) {
            psx0 psx0Var = (psx0) ktx0Var;
            boolean z13 = psx0Var.d;
            String str22 = psx0Var.b;
            long j5 = psx0Var.c;
            String str23 = psx0Var.a;
            List list22 = eux0Var.u;
            return z13 ? Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.O0(new o8f(j5, str23, str22), list22), null, 31457279)) : Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.O0(new n8f(j5, str23, str22), list22), null, 31457279));
        }
        if (ktx0Var instanceof rrx0) {
            return i(eux0Var);
        }
        if (ktx0Var instanceof csx0) {
            List list23 = eux0Var.u;
            ArrayList arrayList25 = new ArrayList();
            for (Object obj12 : list23) {
                if (obj12 instanceof j8f) {
                    arrayList25.add(obj12);
                }
            }
            j8f j8fVar = (j8f) o7h.C0(arrayList25);
            return Next.a(Collections.singleton(new lvx0(j8fVar != null ? j8fVar.s() : null, eux0Var.y)));
        }
        if (ktx0Var instanceof itx0) {
            boolean z14 = eux0Var.j;
            boolean z15 = ((itx0) ktx0Var).a;
            return z14 == z15 ? Next.j() : Next.h(eux0.a(eux0Var, null, null, false, null, null, z15, null, null, null, false, null, null, 33553919));
        }
        if (ktx0Var instanceof htx0) {
            return F(eux0Var, (htx0) ktx0Var);
        }
        if (ktx0Var instanceof qsx0) {
            return b(eux0Var, ((qsx0) ktx0Var).a, dxx0.a);
        }
        if (ktx0Var instanceof atx0) {
            return Next.h(eux0.a(eux0Var, new ytx0(nsx0.a), null, true, null, null, false, null, null, null, false, null, null, 33554398));
        }
        if (ktx0Var instanceof jsx0) {
            return s(eux0Var, (jsx0) ktx0Var);
        }
        if (ktx0Var instanceof ksx0) {
            return t(eux0Var, (ksx0) ktx0Var);
        }
        if (ktx0Var instanceof vsx0) {
            return A(eux0Var, (vsx0) ktx0Var);
        }
        if (ktx0Var instanceof srx0) {
            return b(eux0Var, ((srx0) ktx0Var).a, cxx0.a);
        }
        if (ktx0Var instanceof vrx0) {
            return l(eux0Var);
        }
        if (ktx0Var instanceof qrx0) {
            return h(eux0Var);
        }
        if (ktx0Var instanceof jrx0) {
            return Next.a(Collections.singleton(new nqx0(eux0Var.b, ((jrx0) ktx0Var).a)));
        }
        if (ktx0Var instanceof jtx0) {
            return G(eux0Var, (jtx0) ktx0Var);
        }
        if (ktx0Var instanceof xsx0) {
            return c(eux0Var, ((xsx0) ktx0Var).a);
        }
        if (ktx0Var instanceof dtx0) {
            return D(eux0Var);
        }
        if (ktx0Var instanceof tsx0) {
            return y(eux0Var);
        }
        if (ktx0Var instanceof nsx0) {
            return w(eux0Var);
        }
        if (ktx0Var instanceof urx0) {
            return k(eux0Var, (urx0) ktx0Var);
        }
        if (ktx0Var instanceof rsx0) {
            return x(eux0Var, (rsx0) ktx0Var);
        }
        if (ktx0Var instanceof prx0) {
            return g(eux0Var);
        }
        if (ktx0Var instanceof ssx0) {
            xvi0 xvi0Var = ((ssx0) ktx0Var).a;
            return a(eux0Var, new b8f(xvi0Var.c, xvi0Var.d, xvi0Var.a, xvi0Var.b));
        }
        if (ktx0Var instanceof esx0) {
            return r(eux0Var);
        }
        if (ktx0Var instanceof lsx0) {
            return u(eux0Var, (lsx0) ktx0Var);
        }
        if (ktx0Var instanceof usx0) {
            return z(eux0Var, (usx0) ktx0Var);
        }
        if (ktx0Var instanceof ctx0) {
            return C(eux0Var, (ctx0) ktx0Var);
        }
        if (ktx0Var instanceof wrx0) {
            return m(eux0Var);
        }
        if (ktx0Var instanceof bsx0) {
            return o(eux0Var, (bsx0) ktx0Var);
        }
        if (ktx0Var instanceof krx0) {
            return p(eux0Var, (krx0) ktx0Var);
        }
        if (ktx0Var instanceof lrx0) {
            return d(eux0Var, (lrx0) ktx0Var);
        }
        if (ktx0Var instanceof dsx0) {
            return q();
        }
        if (ktx0Var instanceof ysx0) {
            return B(eux0Var, (ysx0) ktx0Var);
        }
        if (ktx0Var instanceof gtx0) {
            return E(eux0Var, (gtx0) ktx0Var);
        }
        if (ktx0Var instanceof xrx0) {
            return n(eux0Var, (xrx0) ktx0Var);
        }
        if (ktx0Var instanceof trx0) {
            return j(eux0Var, (trx0) ktx0Var);
        }
        if (ktx0Var instanceof nrx0) {
            return f(eux0Var, (nrx0) ktx0Var);
        }
        if (ktx0Var instanceof msx0) {
            return v();
        }
        if (ktx0Var instanceof wsx0) {
            return Next.j();
        }
        eg.o();
        return null;
    }

    public static Next a(eux0 eux0Var, j8f j8fVar) {
        Object next;
        List list = eux0Var.u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof j8f) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(j8fVar.s(), ((j8f) next).s()));
        j8f j8fVar2 = (j8f) next;
        if (j8fVar2 == null) {
            return Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.a1(o7h.O0(j8fVar, list), new ktg0((byte) 15)), null, 31457279));
        }
        return j8fVar2.u() <= j8fVar.u() ? Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.a1(prn1.s(list, j8fVar2, j8fVar), new ktg0((byte) 16)), null, 31457279)) : Next.j();
    }

    public static Next b(eux0 eux0Var, tv80 tv80Var, iu30 iu30Var) {
        ArrayList arrayList;
        Object objPrevious;
        kqf1 kqf1Var = eux0Var.i;
        if (kqf1Var != null) {
            List list = kqf1Var.c;
            arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((iqf1) it.next()).a());
            }
        } else {
            arrayList = z6x.a;
        }
        ArrayList arrayList2 = arrayList;
        List list2 = eux0Var.u;
        ListIterator listIterator = list2.listIterator(list2.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!(((b9f) objPrevious) instanceof e8f));
        b9f b9fVar = (b9f) objPrevious;
        String strS = b9fVar != null ? b9fVar.s() : null;
        if (arrayList2.isEmpty() || strS == null) {
            return Next.j();
        }
        String str = eux0Var.b;
        Set set = eux0Var.r;
        Set set2 = eux0Var.q;
        Boolean bool = eux0Var.n;
        String str2 = kqf1Var != null ? kqf1Var.b : "";
        String str3 = eux0Var.m;
        String str4 = eux0Var.h;
        String str5 = str4 == null ? "" : str4;
        boolean z = eux0Var.f12p;
        String str6 = eux0Var.l;
        return Next.a(Collections.singleton(iu30Var.invoke(new zwu0(str, str2, arrayList2, set2, set, (str6 == null || str6.length() == 0) ? null : str6, bool, str3, str5, tv80Var, strS, z))));
    }

    public static Next c(eux0 eux0Var, String str) {
        String string = ihc1.e1(str).toString();
        return string.length() > 0 ? Next.a(Collections.singleton(new yqx0(eux0Var.b, string, eux0Var.q, eux0Var.r))) : Next.j();
    }

    public static Next d(eux0 eux0Var, lrx0 lrx0Var) {
        wvi0 wvi0Var = lrx0Var.a;
        List list = eux0Var.u;
        qqn1 qqn1Var = eux0Var.a;
        ArrayList<z8f> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof z8f) {
                arrayList.add(obj);
            }
        }
        for (z8f z8fVar : arrayList) {
            if (z8fVar.b.equals(wvi0Var.a)) {
                if (!u890.j(qqn1Var, ztx0.c)) {
                    qqn1Var = xtx0.c;
                }
                return Next.h(eux0.a(eux0Var, qqn1Var, null, false, null, null, false, null, null, null, false, o7h.a1(prn1.s(list, z8fVar, new x8f(wvi0Var.b, wvi0Var.a, wvi0Var.c)), new ktg0((byte) 17)), null, 31457278));
            }
        }
        bhn0.t("Collection contains no element matching the predicate.");
        return null;
    }

    public static Next e(eux0 eux0Var) {
        return Next.h(eux0.a(eux0Var, xtx0.c, null, false, null, null, false, null, null, null, false, null, null, 33554430));
    }

    public static Next f(eux0 eux0Var, nrx0 nrx0Var) {
        w8f w8fVar = new w8f(nrx0Var.c, nrx0Var.a, nrx0Var.b);
        List list = eux0Var.u;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            b9f b9fVar = (b9f) it.next();
            if ((b9fVar instanceof m8f) || (b9fVar instanceof s8f) || (b9fVar instanceof p8f)) {
                break;
            }
            i++;
        }
        ArrayList arrayList = new ArrayList(list);
        if (i != -1) {
            arrayList.add(i, w8fVar);
        } else {
            arrayList.add(w8fVar);
        }
        return Next.h(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, o7h.l1(arrayList), null, 31457279));
    }

    public static Next g(eux0 eux0Var) {
        return Next.h(eux0.a(eux0Var, new ytx0(qrx0.a), null, true, null, null, false, null, null, null, false, null, null, 33554398));
    }

    public static Next h(eux0 eux0Var) {
        String str = eux0Var.h;
        List list = eux0Var.u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof j8f) {
                arrayList.add(obj);
            }
        }
        return Next.a(Collections.singleton(new eqx0(((j8f) o7h.A0(arrayList)).s(), str)));
    }

    public static Next i(eux0 eux0Var) {
        return Next.a(Collections.singleton((eux0Var.c || eux0Var.u.isEmpty()) ? gvx0.a : new ovx0(eux0Var.y)));
    }

    public static Next j(eux0 eux0Var, trx0 trx0Var) {
        eux0 eux0VarA;
        z6x arrayList;
        cwi0 cwi0Var = trx0Var.a;
        svi0 svi0Var = cwi0Var.e;
        bwi0 bwi0Var = cwi0Var.f;
        long j = cwi0Var.c;
        List list = eux0Var.u;
        Set set = eux0Var.q;
        kqf1 kqf1Var = eux0Var.i;
        b9f b9fVar = (b9f) o7h.C0(list);
        if (j >= (b9fVar != null ? b9fVar.t() : 0L)) {
            String str = null;
            List listX = prn1.x(bwi0Var != null ? bwi0Var.c : null, set, (LinkedHashSet) null);
            z6x z6xVarN0 = z6x.a;
            if (kqf1Var != null) {
                List list2 = kqf1Var.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof eqf1) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((eqf1) obj2).c) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = z6xVarN0;
            }
            List list3 = listX;
            if (!list3.isEmpty()) {
                z6xVarN0 = o7h.N0(listX, (Collection) arrayList);
            } else if (kqf1Var != null) {
                z6xVarN0 = kqf1Var.c;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : (Iterable) z6xVarN0) {
                if (hashSet.add(((iqf1) obj3).a())) {
                    arrayList3.add(obj3);
                }
            }
            qqn1 qqn1Var = trx0Var.b ? eux0Var.a : !list3.isEmpty() ? xtx0.c : ztx0.c;
            boolean z = eux0Var.t || !arrayList3.isEmpty();
            String str2 = bwi0Var != null ? bwi0Var.a : null;
            if (str2 == null || str2.length() == 0) {
                if (kqf1Var != null) {
                    str = kqf1Var.b;
                }
            } else if (bwi0Var != null) {
                str = bwi0Var.a;
            }
            if (str == null) {
                str = "";
            }
            eux0VarA = eux0.a(eux0Var, qqn1Var, null, false, null, new kqf1(str, arrayList3), false, dm61.y0(set, svi0Var.a), dm61.y0(eux0Var.r, svi0Var.b), null, z, null, null, 32112382);
        } else {
            eux0VarA = eux0Var;
        }
        return a(eux0VarA, prn1.u(cwi0Var));
    }

    public static Next k(eux0 eux0Var, urx0 urx0Var) {
        Object next;
        Set setW0 = dm61.w0(new frx0[]{new gqx0(urx0Var.a, eux0Var.t, false)});
        kqf1 kqf1Var = eux0Var.i;
        if (kqf1Var != null) {
            List list = kqf1Var.c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof eqf1) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((eqf1) next).f.e);
            eqf1 eqf1Var = (eqf1) next;
            if (eqf1Var != null) {
                String str = eqf1Var.a;
                String str2 = eqf1Var.f.a;
                if (str2 == null) {
                    str2 = "";
                }
                setW0.add(new pvx0(str, str2));
            }
        }
        return Next.a(setW0);
    }

    public static Next l(eux0 eux0Var) {
        return Next.h(eux0.a(eux0Var, ztx0.c, null, false, null, null, false, null, null, null, false, null, null, 33554430));
    }

    public static Next m(eux0 eux0Var) {
        return Next.i(eux0.a(eux0Var, cux0.c, null, false, null, null, false, null, null, null, false, null, null, 33554430), Collections.singleton(new jqx0(eux0Var.m)));
    }

    public static Next n(eux0 eux0Var, xrx0 xrx0Var) {
        qqn1 qqn1Var = eux0Var.a;
        if (!u890.j(qqn1Var, ztx0.c)) {
            qqn1Var = xtx0.c;
        }
        eux0 eux0VarA = eux0.a(eux0Var, qqn1Var, null, false, null, null, false, null, null, null, false, null, null, 33554430);
        dwi0 dwi0Var = xrx0Var.a;
        return a(eux0VarA, new i8f(dwi0Var.c, dwi0Var.d, dwi0Var.a, dwi0Var.b));
    }

    public static Next o(eux0 eux0Var, bsx0 bsx0Var) {
        if (u890.j(eux0Var.b, bsx0Var.a)) {
            b9f b9fVar = (b9f) o7h.C0(eux0Var.u);
            if (u890.j(b9fVar != null ? b9fVar.s() : null, bsx0Var.b)) {
                return Next.h(eux0.a(eux0Var, null, null, false, null, null, false, dm61.y0(eux0Var.q, bsx0Var.c), dm61.y0(eux0Var.r, bsx0Var.d), null, false, null, null, 33161215));
            }
        }
        return Next.j();
    }

    public static Next p(eux0 eux0Var, krx0 krx0Var) {
        Set setSingleton;
        boolean z = eux0Var.f;
        boolean z2 = krx0Var.a;
        eux0 eux0VarA = eux0.a(eux0Var, null, null, z2 ? z : false, null, null, false, null, null, null, false, null, null, 33554399);
        if (!z2 || z) {
            setSingleton = w7x.a;
        } else {
            setSingleton = Collections.singleton(new tqx0(eux0Var.m, eux0Var.b));
        }
        return Next.i(eux0VarA, setSingleton);
    }

    public static Next q() {
        return Next.a(Collections.singleton(sqx0.a));
    }

    public static Next r(eux0 eux0Var) {
        return Next.h(eux0.a(eux0Var, bux0.c, null, false, null, null, false, null, null, null, false, null, null, 33554430));
    }

    public static Next s(eux0 eux0Var, jsx0 jsx0Var) {
        Object next;
        String str = jsx0Var.a;
        kqf1 kqf1Var = eux0Var.i;
        Object nvx0Var = null;
        if (kqf1Var != null) {
            Iterator it = kqf1Var.c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((iqf1) next).a(), str));
            iqf1 iqf1Var = (iqf1) next;
            if (iqf1Var != null) {
                boolean z = iqf1Var instanceof eqf1;
                if (z && ((eqf1) iqf1Var).f.a == null) {
                    return Next.j();
                }
                if (!z) {
                    if (iqf1Var instanceof gqf1) {
                        eg.m("Can't play preview for unsupported type ".concat(((gqf1) iqf1Var).a));
                        return null;
                    }
                    eg.o();
                    return null;
                }
                eqf1 eqf1Var = (eqf1) iqf1Var;
                String str2 = eqf1Var.a;
                cqf1 cqf1Var = eqf1Var.f;
                boolean z2 = cqf1Var.e;
                String str3 = cqf1Var.a;
                if (z2) {
                    if (str3 != null) {
                        nvx0Var = new pvx0(str2, str3);
                    }
                } else if (str3 != null) {
                    nvx0Var = new nvx0(str2, str3);
                }
                return Next.a(Collections.singleton(nvx0Var));
            }
        }
        eg.m("Track not found with id ".concat(str));
        return null;
    }

    public static Next t(eux0 eux0Var, ksx0 ksx0Var) {
        kqf1 kqf1Var = eux0Var.i;
        if (kqf1Var == null) {
            return Next.j();
        }
        List<Object> list = kqf1Var.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (Object objB : list) {
            if (objB instanceof eqf1) {
                eqf1 eqf1Var = (eqf1) objB;
                cqf1 cqf1Var = eqf1Var.f;
                cqf1 cqf1Var2 = eqf1Var.a.equals(ksx0Var.a) ? cqf1Var : null;
                objB = eqf1.b(eqf1Var, false, cqf1Var2 != null ? new cqf1(cqf1Var2.a, ksx0Var.b, ksx0Var.c, ksx0Var.d, ksx0Var.e) : new cqf1(cqf1Var.a), 223);
            } else if (!(objB instanceof gqf1)) {
                eg.o();
                return null;
            }
            arrayList.add(objB);
        }
        return Next.h(eux0.a(eux0Var, null, null, false, null, kqf1.r(kqf1Var, arrayList), false, null, null, null, false, null, null, 33554175));
    }

    public static Next u(eux0 eux0Var, lsx0 lsx0Var) {
        svi0 svi0VarB;
        Set set;
        svi0 svi0VarB2;
        Set set2;
        List list = lsx0Var.a;
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(prn1.v((gwi0) it.next()));
        }
        ArrayList arrayListN0 = o7h.N0(eux0Var.u, arrayList);
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListN0) {
            if (hashSet.add(((b9f) obj).s())) {
                arrayList2.add(obj);
            }
        }
        List listA1 = o7h.a1(arrayList2, new ktg0((byte) 19));
        gwi0 gwi0Var = (gwi0) o7h.C0(list);
        Set set3 = w7x.a;
        Set set4 = (gwi0Var == null || (svi0VarB2 = gwi0Var.b()) == null || (set2 = svi0VarB2.a) == null) ? set3 : set2;
        gwi0 gwi0Var2 = (gwi0) o7h.C0(list);
        return Next.h(eux0.a(eux0Var, null, null, false, null, null, false, set4, (gwi0Var2 == null || (svi0VarB = gwi0Var2.b()) == null || (set = svi0VarB.b) == null) ? set3 : set, null, false, listA1, null, 31064063));
    }

    public static Next v() {
        return Next.a(Collections.singleton(new ivx0()));
    }

    public static Next w(eux0 eux0Var) {
        return Next.i(eux0.a(eux0Var, cux0.c, null, false, null, null, false, null, null, null, false, null, null, 33554430), Collections.singleton(new tqx0(eux0Var.m, eux0Var.b)));
    }

    public static Next x(eux0 eux0Var, rsx0 rsx0Var) {
        String str = eux0Var.b;
        List list = eux0Var.u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof j8f) {
                arrayList.add(obj);
            }
        }
        return Next.a(Collections.singleton(new mvx0(str, ((j8f) o7h.A0(arrayList)).s(), rsx0Var.a)));
    }

    public static Next y(eux0 eux0Var) {
        List list = eux0Var.u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof j8f) {
                arrayList.add(obj);
            }
        }
        j8f j8fVar = (j8f) o7h.C0(arrayList);
        if (j8fVar == null) {
            return Next.j();
        }
        return Next.a(Collections.singleton(new uqx0(j8fVar.t(), j8fVar.u(), eux0Var.b, j8fVar.s())));
    }

    public static Next z(eux0 eux0Var, usx0 usx0Var) {
        List list = eux0Var.u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!u890.j(((b9f) obj).s(), usx0Var.a)) {
                arrayList.add(obj);
            }
        }
        return Next.i(eux0.a(eux0Var, null, null, false, null, null, false, null, null, null, false, arrayList, null, 31457279), Collections.singleton(new xqx0(eux0Var.b, usx0Var.a, usx0Var.b, eux0Var.q, eux0Var.r)));
    }
}
