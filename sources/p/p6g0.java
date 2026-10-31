package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class p6g0 implements Update {
    /* JADX WARN: Code duplicated, block: B:132:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    /* JADX WARN: Code duplicated, block: B:262:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x00d1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:283:0x009f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x02b2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:68:0x012f  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    public final Next a(Object obj, Object obj2) {
        List<bzr0> list;
        Iterator it;
        mxr0 mxr0Var;
        List<bzr0> list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list3;
        Iterator it2;
        r6g0 r6g0Var = (r6g0) obj;
        n6g0 n6g0Var = (n6g0) obj2;
        iyr0 iyr0Var = r6g0Var.c;
        Map mapP = r6g0Var.t;
        String str = r6g0Var.a;
        List list4 = r6g0Var.f;
        List list5 = r6g0Var.g;
        List list6 = r6g0Var.h;
        List list7 = r6g0Var.i;
        if (n6g0Var instanceof f6g0) {
            return Next.h(r6g0.a(r6g0Var, ((f6g0) n6g0Var).a, null, null, null, null, null, 2039));
        }
        if (n6g0Var instanceof g6g0) {
            String str2 = ((g6g0) n6g0Var).a;
            List<o6g0> list8 = list7;
            boolean z = list8 instanceof Collection;
            if (!z || !list8.isEmpty()) {
                Iterator it3 = list8.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        list3 = list6;
                        if ((list3 instanceof Collection) || !list3.isEmpty()) {
                            it2 = list3.iterator();
                            do {
                                if (it2.hasNext()) {
                                }
                            } while (!u890.j(((bzr0) it2.next()).b, str2));
                        }
                    } else if (u890.j(((mxr0) it3.next()).b, str2)) {
                    }
                    if (!z && list8.isEmpty()) {
                        list2 = list6;
                        if (list2 instanceof Collection) {
                        }
                        for (bzr0 bzr0Var : list2) {
                            if (u890.j(bzr0Var.b, str2)) {
                            }
                        }
                        arrayList = new ArrayList(q7h.U(list8, 10));
                        for (o6g0 o6g0VarA : list8) {
                            if (u890.j(o6g0VarA.getUri(), str2)) {
                                o6g0VarA = mxr0.a((mxr0) o6g0VarA, true, false, 23);
                            }
                            arrayList.add(o6g0VarA);
                        }
                        arrayList2 = new ArrayList(q7h.U(list2, 10));
                        for (o6g0 o6g0VarA2 : list2) {
                            if (u890.j(o6g0VarA2.getUri(), str2)) {
                                o6g0VarA2 = bzr0.a((bzr0) o6g0VarA2, true, false, 23);
                            }
                            arrayList2.add(o6g0VarA2);
                        }
                        return Next.i(r6g0.a(r6g0Var, null, null, null, arrayList2, arrayList, null, 1663), Collections.singleton(new a5g0(str, str2)));
                    }
                    it = list8.iterator();
                    while (it.hasNext()) {
                        mxr0Var = (mxr0) it.next();
                        if (u890.j(mxr0Var.b, str2) || (!mxr0Var.d && !mxr0Var.e)) {
                        }
                    }
                    list2 = list6;
                    if ((list2 instanceof Collection) || !list2.isEmpty()) {
                        while (r1.hasNext()) {
                            if (u890.j(bzr0Var.b, str2) || (!bzr0Var.d && !bzr0Var.e)) {
                            }
                        }
                    }
                    arrayList = new ArrayList(q7h.U(list8, 10));
                    while (r2.hasNext()) {
                        if (u890.j(o6g0VarA.getUri(), str2)) {
                            o6g0VarA = mxr0.a((mxr0) o6g0VarA, true, false, 23);
                        }
                        arrayList.add(o6g0VarA);
                    }
                    arrayList2 = new ArrayList(q7h.U(list2, 10));
                    while (r2.hasNext()) {
                        if (u890.j(o6g0VarA2.getUri(), str2)) {
                            o6g0VarA2 = bzr0.a((bzr0) o6g0VarA2, true, false, 23);
                        }
                        arrayList2.add(o6g0VarA2);
                    }
                    return Next.i(r6g0.a(r6g0Var, null, null, null, arrayList2, arrayList, null, 1663), Collections.singleton(new a5g0(str, str2)));
                }
            }
            list3 = list6;
            if (list3 instanceof Collection) {
                it2 = list3.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!u890.j(((bzr0) it2.next()).b, str2));
                if (!z) {
                    it = list8.iterator();
                    while (it.hasNext()) {
                        mxr0Var = (mxr0) it.next();
                        if (u890.j(mxr0Var.b, str2)) {
                        }
                    }
                    list2 = list6;
                    if (list2 instanceof Collection) {
                    }
                    while (r1.hasNext()) {
                        if (u890.j(bzr0Var.b, str2)) {
                        }
                    }
                    arrayList = new ArrayList(q7h.U(list8, 10));
                    while (r2.hasNext()) {
                        if (u890.j(o6g0VarA.getUri(), str2)) {
                            o6g0VarA = mxr0.a((mxr0) o6g0VarA, true, false, 23);
                        }
                        arrayList.add(o6g0VarA);
                    }
                    arrayList2 = new ArrayList(q7h.U(list2, 10));
                    while (r2.hasNext()) {
                        if (u890.j(o6g0VarA2.getUri(), str2)) {
                            o6g0VarA2 = bzr0.a((bzr0) o6g0VarA2, true, false, 23);
                        }
                        arrayList2.add(o6g0VarA2);
                    }
                    return Next.i(r6g0.a(r6g0Var, null, null, null, arrayList2, arrayList, null, 1663), Collections.singleton(new a5g0(str, str2)));
                }
                it = list8.iterator();
                while (it.hasNext()) {
                    mxr0Var = (mxr0) it.next();
                    if (u890.j(mxr0Var.b, str2)) {
                    }
                }
                list2 = list6;
                if (list2 instanceof Collection) {
                }
                while (r1.hasNext()) {
                    if (u890.j(bzr0Var.b, str2)) {
                    }
                }
                arrayList = new ArrayList(q7h.U(list8, 10));
                while (r2.hasNext()) {
                    if (u890.j(o6g0VarA.getUri(), str2)) {
                        o6g0VarA = mxr0.a((mxr0) o6g0VarA, true, false, 23);
                    }
                    arrayList.add(o6g0VarA);
                }
                arrayList2 = new ArrayList(q7h.U(list2, 10));
                while (r2.hasNext()) {
                    if (u890.j(o6g0VarA2.getUri(), str2)) {
                        o6g0VarA2 = bzr0.a((bzr0) o6g0VarA2, true, false, 23);
                    }
                    arrayList2.add(o6g0VarA2);
                }
                return Next.i(r6g0.a(r6g0Var, null, null, null, arrayList2, arrayList, null, 1663), Collections.singleton(new a5g0(str, str2)));
            }
            it2 = list3.iterator();
            do {
                if (it2.hasNext()) {
                }
            } while (!u890.j(((bzr0) it2.next()).b, str2));
            if (!z) {
                it = list8.iterator();
                while (it.hasNext()) {
                    mxr0Var = (mxr0) it.next();
                    if (u890.j(mxr0Var.b, str2)) {
                    }
                }
                list2 = list6;
                if (list2 instanceof Collection) {
                }
                while (r1.hasNext()) {
                    if (u890.j(bzr0Var.b, str2)) {
                    }
                }
                arrayList = new ArrayList(q7h.U(list8, 10));
                while (r2.hasNext()) {
                    if (u890.j(o6g0VarA.getUri(), str2)) {
                        o6g0VarA = mxr0.a((mxr0) o6g0VarA, true, false, 23);
                    }
                    arrayList.add(o6g0VarA);
                }
                arrayList2 = new ArrayList(q7h.U(list2, 10));
                while (r2.hasNext()) {
                    if (u890.j(o6g0VarA2.getUri(), str2)) {
                        o6g0VarA2 = bzr0.a((bzr0) o6g0VarA2, true, false, 23);
                    }
                    arrayList2.add(o6g0VarA2);
                }
                return Next.i(r6g0.a(r6g0Var, null, null, null, arrayList2, arrayList, null, 1663), Collections.singleton(new a5g0(str, str2)));
            }
            it = list8.iterator();
            while (it.hasNext()) {
                mxr0Var = (mxr0) it.next();
                if (u890.j(mxr0Var.b, str2)) {
                }
            }
            list2 = list6;
            if (list2 instanceof Collection) {
            }
            while (r1.hasNext()) {
                if (u890.j(bzr0Var.b, str2)) {
                }
            }
            arrayList = new ArrayList(q7h.U(list8, 10));
            while (r2.hasNext()) {
                if (u890.j(o6g0VarA.getUri(), str2)) {
                    o6g0VarA = mxr0.a((mxr0) o6g0VarA, true, false, 23);
                }
                arrayList.add(o6g0VarA);
            }
            arrayList2 = new ArrayList(q7h.U(list2, 10));
            while (r2.hasNext()) {
                if (u890.j(o6g0VarA2.getUri(), str2)) {
                    o6g0VarA2 = bzr0.a((bzr0) o6g0VarA2, true, false, 23);
                }
                arrayList2.add(o6g0VarA2);
            }
            return Next.i(r6g0.a(r6g0Var, null, null, null, arrayList2, arrayList, null, 1663), Collections.singleton(new a5g0(str, str2)));
            return Next.j();
        }
        if (n6g0Var instanceof i6g0) {
            String str3 = ((i6g0) n6g0Var).a;
            List<o6g0> list9 = list7;
            ArrayList arrayList3 = new ArrayList(q7h.U(list9, 10));
            for (o6g0 o6g0VarA3 : list9) {
                if (u890.j(o6g0VarA3.getUri(), str3)) {
                    o6g0VarA3 = mxr0.a((mxr0) o6g0VarA3, false, true, 7);
                }
                arrayList3.add(o6g0VarA3);
            }
            List<o6g0> list10 = list6;
            ArrayList arrayList4 = new ArrayList(q7h.U(list10, 10));
            for (o6g0 o6g0VarA4 : list10) {
                if (u890.j(o6g0VarA4.getUri(), str3)) {
                    o6g0VarA4 = bzr0.a((bzr0) o6g0VarA4, false, true, 7);
                }
                arrayList4.add(o6g0VarA4);
            }
            return Next.i(r6g0.a(r6g0Var, null, null, null, arrayList4, arrayList3, null, 1663), Collections.singleton(new d5g0(str3, iyr0Var)));
        }
        if (n6g0Var instanceof h6g0) {
            String str4 = ((h6g0) n6g0Var).a;
            List<o6g0> list11 = list7;
            ArrayList arrayList5 = new ArrayList(q7h.U(list11, 10));
            for (o6g0 o6g0VarA5 : list11) {
                if (u890.j(o6g0VarA5.getUri(), str4)) {
                    o6g0VarA5 = mxr0.a((mxr0) o6g0VarA5, false, false, 23);
                }
                arrayList5.add(o6g0VarA5);
            }
            List<o6g0> list12 = list6;
            ArrayList arrayList6 = new ArrayList(q7h.U(list12, 10));
            for (o6g0 o6g0VarA6 : list12) {
                if (u890.j(o6g0VarA6.getUri(), str4)) {
                    o6g0VarA6 = bzr0.a((bzr0) o6g0VarA6, false, false, 23);
                }
                arrayList6.add(o6g0VarA6);
            }
            return Next.i(r6g0.a(r6g0Var, null, null, null, arrayList6, arrayList5, null, 1663), Collections.singleton(new c5g0(str4)));
        }
        if (n6g0Var instanceof l6g0) {
            String str5 = ((l6g0) n6g0Var).a;
            List<mxr0> list13 = list7;
            if ((list13 instanceof Collection) && list13.isEmpty()) {
                list = list6;
                if (list instanceof Collection) {
                    for (bzr0 bzr0Var2 : list) {
                        if (u890.j(bzr0Var2.b, str5)) {
                        }
                    }
                } else {
                    while (r1.hasNext()) {
                        if (u890.j(bzr0Var2.b, str5)) {
                        }
                    }
                }
                return Next.j();
            }
            for (mxr0 mxr0Var2 : list13) {
                if (!u890.j(mxr0Var2.b, str5) || !mxr0Var2.e) {
                }
            }
            list = list6;
            if ((list instanceof Collection) || !list.isEmpty()) {
                while (r1.hasNext()) {
                    if (u890.j(bzr0Var2.b, str5) || !bzr0Var2.e) {
                    }
                }
            }
            return Next.j();
            return Next.a(Collections.singleton(new b5g0(str, str5, ilo1.D(iyr0Var))));
        }
        if (n6g0Var instanceof k6g0) {
            String str6 = ((k6g0) n6g0Var).a;
            List<o6g0> list14 = list7;
            ArrayList arrayList7 = new ArrayList(q7h.U(list14, 10));
            for (o6g0 o6g0VarA7 : list14) {
                if (u890.j(o6g0VarA7.getUri(), str6)) {
                    o6g0VarA7 = mxr0.a((mxr0) o6g0VarA7, false, false, 15);
                }
                arrayList7.add(o6g0VarA7);
            }
            List<o6g0> list15 = list6;
            ArrayList arrayList8 = new ArrayList(q7h.U(list15, 10));
            for (o6g0 o6g0VarA8 : list15) {
                if (u890.j(o6g0VarA8.getUri(), str6)) {
                    o6g0VarA8 = bzr0.a((bzr0) o6g0VarA8, false, false, 15);
                }
                arrayList8.add(o6g0VarA8);
            }
            return Next.h(r6g0.a(r6g0Var, null, null, null, arrayList8, arrayList7, null, 1663));
        }
        if (n6g0Var instanceof j6g0) {
            return Next.a(Collections.singleton(new c5g0(((j6g0) n6g0Var).a)));
        }
        if (n6g0Var instanceof c6g0) {
            c6g0 c6g0Var = (c6g0) n6g0Var;
            String str7 = c6g0Var.a;
            List<y4g0> list16 = list5;
            ArrayList arrayList9 = new ArrayList(q7h.U(list16, 10));
            for (y4g0 y4g0VarA : list16) {
                if (u890.j(y4g0VarA.b, str7)) {
                    y4g0VarA = y4g0.a(y4g0VarA, false, true, false, 95);
                }
                arrayList9.add(y4g0VarA);
            }
            List<f7g0> list17 = list4;
            ArrayList arrayList10 = new ArrayList(q7h.U(list17, 10));
            for (f7g0 f7g0VarA : list17) {
                if (u890.j(f7g0VarA.b, str7) || u890.j(f7g0VarA.f, str7)) {
                    f7g0VarA = f7g0.a(f7g0VarA, false, false, true, false, 3071);
                }
                arrayList10.add(f7g0VarA);
            }
            return Next.i(r6g0.a(r6g0Var, null, arrayList10, arrayList9, null, null, sqg0.K(str7, mapP), 1439), Collections.singleton(new g5g0(str, c6g0Var.b, str7, c6g0Var.c)));
        }
        if (n6g0Var instanceof d6g0) {
            d6g0 d6g0Var = (d6g0) n6g0Var;
            String str8 = d6g0Var.a;
            List<y4g0> list18 = list5;
            ArrayList arrayList11 = new ArrayList(q7h.U(list18, 10));
            for (y4g0 y4g0VarA2 : list18) {
                if (u890.j(y4g0VarA2.b, str8)) {
                    y4g0VarA2 = y4g0.a(y4g0VarA2, false, false, false, 95);
                }
                arrayList11.add(y4g0VarA2);
            }
            List<f7g0> list19 = list4;
            ArrayList arrayList12 = new ArrayList(q7h.U(list19, 10));
            for (f7g0 f7g0VarA2 : list19) {
                if (u890.j(f7g0VarA2.b, str8) || u890.j(f7g0VarA2.f, str8)) {
                    f7g0VarA2 = f7g0.a(f7g0VarA2, false, false, false, false, 3071);
                }
                arrayList12.add(f7g0VarA2);
            }
            return Next.i(r6g0.a(r6g0Var, null, arrayList12, arrayList11, null, null, null, 1951), Collections.singleton(new e5g0(str8, d6g0Var.b)));
        }
        if (n6g0Var instanceof e6g0) {
            e6g0 e6g0Var = (e6g0) n6g0Var;
            boolean z2 = e6g0Var.b;
            String str9 = e6g0Var.a;
            List<y4g0> list20 = list5;
            ArrayList arrayList13 = new ArrayList(q7h.U(list20, 10));
            for (y4g0 y4g0VarA3 : list20) {
                if (u890.j(y4g0VarA3.b, str9)) {
                    y4g0VarA3 = y4g0.a(y4g0VarA3, z2, false, false, 15);
                }
                arrayList13.add(y4g0VarA3);
            }
            List<f7g0> list21 = list4;
            ArrayList arrayList14 = new ArrayList(q7h.U(list21, 10));
            for (f7g0 f7g0VarA3 : list21) {
                if (u890.j(f7g0VarA3.b, str9)) {
                    f7g0VarA3 = f7g0.a(f7g0VarA3, e6g0Var.b, false, false, false, 767);
                } else if (u890.j(f7g0VarA3.f, str9)) {
                    f7g0VarA3 = f7g0.a(f7g0VarA3, false, e6g0Var.b, false, false, 2559);
                }
                arrayList14.add(f7g0VarA3);
            }
            if (!z2) {
                mapP = sqg0.P(mapP, new mmr0(str9, e6g0Var.c));
            }
            return Next.i(r6g0.a(r6g0Var, null, arrayList14, arrayList13, null, null, mapP, 1439), e6g0Var.d ? Collections.singleton(new f5g0(str9, z2)) : w7x.a);
        }
        if (!(n6g0Var instanceof m6g0)) {
            if (n6g0Var.equals(b6g0.a)) {
                return Next.a(Collections.singleton(new z4g0(r6g0Var.X)));
            }
            eg.o();
            return null;
        }
        m6g0 m6g0Var = (m6g0) n6g0Var;
        String str10 = m6g0Var.a;
        if (!mapP.containsKey(str10) || !u890.j(mapP.get(str10), m6g0Var.b)) {
            return Next.j();
        }
        List<y4g0> list22 = list5;
        ArrayList arrayList15 = new ArrayList(q7h.U(list22, 10));
        for (y4g0 y4g0VarA4 : list22) {
            if (u890.j(y4g0VarA4.b, str10)) {
                y4g0VarA4 = y4g0.a(y4g0VarA4, false, false, true, 63);
            }
            arrayList15.add(y4g0VarA4);
        }
        List<f7g0> list23 = list4;
        ArrayList arrayList16 = new ArrayList(q7h.U(list23, 10));
        for (f7g0 f7g0VarA4 : list23) {
            if (u890.j(f7g0VarA4.b, str10)) {
                f7g0VarA4 = f7g0.a(f7g0VarA4, false, false, false, true, 2047);
            }
            arrayList16.add(f7g0VarA4);
        }
        return Next.h(r6g0.a(r6g0Var, null, arrayList16, arrayList15, null, null, sqg0.K(str10, mapP), 1439));
    }
}
