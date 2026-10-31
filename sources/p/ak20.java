package p;

import android.graphics.PointF;
import android.net.Uri;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.your_library.esperanto.proto.YourLibraryResponseHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ak20 implements Function, Init, BiFunction, Predicate, s2i1, e6c0, gdr0, tbt0, usi1 {
    public final /* synthetic */ byte a;
    public static final ak20 b = new ak20(0);
    public static final o360 c = new o360();
    public static final ak20 d = new ak20(4);
    public static final ak20 e = new ak20(5);
    public static final ak20 f = new ak20(6);
    public static final ak20 g = new ak20(7);
    public static final ak20 h = new ak20(8);
    public static final ak20 i = new ak20(9);
    public static final ak20 t = new ak20(10);
    public static final ak20 X = new ak20(11);
    public static final ak20 Y = new ak20(13);
    public static final ak20 Z = new ak20(14);
    public static final ak20 N0 = new ak20(15);
    public static final ak20 O0 = new ak20(16);
    public static final ak20 P0 = new ak20(17);
    public static final ak20 Q0 = new ak20(18);
    public static final ak20 R0 = new ak20(19);
    public static final ak20 S0 = new ak20(20);
    public static final ak20 T0 = new ak20(21);
    public static final ak20 U0 = new ak20(22);
    public static final ak20 V0 = new ak20(23);
    public static final ak20 W0 = new ak20(24);
    public static final ak20 X0 = new ak20(25);
    public static final ak20 Y0 = new ak20(26);
    public static final ak20 Z0 = new ak20(27);
    public static final ak20 a1 = new ak20(28);
    public static final ak20 b1 = new ak20(29);

    public /* synthetic */ ak20(byte b2) {
        this.a = b2;
    }

    public static Next c(bob1 bob1Var, String str) {
        Object obj;
        String str2;
        f3f1 f3f1Var = bob1Var.a;
        List list = f3f1Var.b;
        if (u890.j(bob1Var.k.a, str) || str.length() == 0) {
            str = ((c3f1) o7h.q0(list)).a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            c3f1 c3f1Var = (c3f1) it.next();
            arrayList.add(c3f1.a(c3f1Var, u890.j(c3f1Var.a, str), (List) null, 1015));
        }
        f3f1 f3f1VarA = f3f1.a(f3f1Var, arrayList);
        for (Object obj2 : arrayList) {
            if (((c3f1) obj2).d) {
                obj = obj2;
                break;
            }
        }
        c3f1 c3f1Var2 = (c3f1) obj;
        if (c3f1Var2 == null || (str2 = c3f1Var2.c) == null) {
            str2 = "default";
        }
        String str3 = str2;
        return Next.i(bob1.a(bob1Var, f3f1VarA, str3, false, false, (String) null, (List) null, 1020), Effects.a(new vew[]{new vew(str3)}));
    }

    public static Integer d(dyz dyzVar) {
        dw30 dw30Var = dyzVar.a;
        if (dw30Var.a.isEmpty()) {
            return null;
        }
        int i2 = dyzVar.d;
        if (i2 <= 0) {
            if (dyzVar.c) {
                return Integer.valueOf(p7h.L(dw30Var.a));
            }
            return null;
        }
        int i3 = i2 - 1;
        int iL = p7h.L(dw30Var.a);
        if (i3 > iL) {
            i3 = iL;
        }
        return Integer.valueOf(i3);
    }

    public static boolean e(sw4 sw4Var) {
        return sw4Var.a();
    }

    public static Next f(mah0 mah0Var) {
        return mah0Var.f != 1 ? Next.j() : Next.i(mah0.a(mah0Var, null, null, 2, 0, 31), Collections.singleton(new e9h0(mah0Var.b, mah0Var.e)));
    }

    public static mmr0 g(zw30 zw30Var, b35 b35Var) {
        String str = zw30Var.a;
        f3f1 f3f1Var = new f3f1(new g3f1("profile", str, "spotify:activitycenter", "", str), Collections.singletonList(new c3f1("client-native:default", new d3f1(2131953915), "default", true, (String) null, (ArrayList) null, false, (b3f1) null, (String) null, (a3f1) null, 944)), false, 28);
        wkc1 wkc1Var = new wkc1("client-native:default", "default", "EVO");
        b3f1 b3f1Var = (b3f1) oz11.a.get(b35Var.g());
        String str2 = zw30Var.b;
        return new mmr0(new bob1(f3f1Var, str2 != null ? str2 : "default", (String) null, b3f1Var, wkc1Var, (ArrayList) null, 636), Effects.a(new mfw[]{new mfw(str2)}));
    }

    /* JADX WARN: Code duplicated, block: B:108:0x025f  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:175:0x040f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0156  */
    /* JADX WARN: Code duplicated, block: B:52:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x0175  */
    /* JADX WARN: Code duplicated, block: B:60:0x0178  */
    public static Next j(bob1 bob1Var, p600 p600Var) {
        Object obj;
        c3f1 c3f1Var;
        ArrayList arrayList;
        String str;
        Iterator it;
        Object next;
        bq10 bq10Var;
        String str2;
        Object next2;
        dw30 dw30Var;
        Object next3;
        dw30 dw30Var2;
        Iterator it2;
        wkc1 wkc1Var = bob1Var.k;
        String str3 = bob1Var.b;
        f3f1 f3f1Var = bob1Var.a;
        List list = bob1Var.j;
        boolean z = bob1Var.e;
        Logger.b("FunkisHome :: event: " + p600Var + ", state: " + bob1Var, new Object[0]);
        if (p600Var instanceof u500) {
            bq10 bq10Var2 = ((u500) p600Var).a;
            String str4 = bq10Var2.a;
            ArrayList arrayListO0 = o7h.O0(bq10Var2, list);
            int iS = zno1.s(q7h.U(arrayListO0, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
            for (Object obj2 : arrayListO0) {
                linkedHashMap.put(((bq10) obj2).a, obj2);
            }
            return Next.i(m(bob1Var, o7h.l1(linkedHashMap.values()), str4), Effects.a(new vew[]{new vew(str4)}));
        }
        if (p600Var instanceof v500) {
            ArrayList arrayListN0 = o7h.N0((Iterable) null, list);
            int iS2 = zno1.s(q7h.U(arrayListN0, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
            for (Object obj3 : arrayListN0) {
                linkedHashMap2.put(((bq10) obj3).a, obj3);
            }
            return Next.h(m(bob1Var, o7h.l1(linkedHashMap2.values()), str3));
        }
        boolean z2 = p600Var instanceof hxz;
        HashSet hashSetA = w7x.a;
        if (z2) {
            hxz hxzVar = (hxz) p600Var;
            boolean z3 = !bob1Var.c && hxzVar.a;
            bob1 bob1VarA = bob1.a(bob1Var, (f3f1) null, (String) null, hxzVar.a, false, (String) null, (List) null, 1019);
            if (z3) {
                hashSetA = Effects.a(new mfw[]{new mfw(wkc1Var.b)});
            }
            return Next.i(bob1VarA, hashSetA);
        }
        boolean z4 = p600Var instanceof y400;
        ww30 ww30Var = ww30.a;
        if (z4) {
            y400 y400Var = (y400) p600Var;
            return Next.i(bob1.a(bob1Var, (f3f1) null, y400Var.a, false, y400Var.b, (String) null, (List) null, 1005), Effects.a(new taw[]{new taw(ww30Var, y400Var.b)}));
        }
        boolean z5 = p600Var instanceof dyz;
        ww30 ww30Var2 = ww30.c;
        if (!z5) {
            if (p600Var instanceof cyz) {
                return ((cyz) p600Var).b ? Next.a(Effects.a(new taw[]{new taw(ww30Var2, z)})) : Next.j();
            }
            if (p600Var instanceof q300) {
                return Next.a(Effects.a(new qcw[]{new qcw(((q300) p600Var).a)}));
            }
            if (p600Var instanceof uxz) {
                uxz uxzVar = (uxz) p600Var;
                boolean z6 = uxzVar.a;
                return z6 == z ? Next.j() : Next.i(bob1.a(bob1Var, (f3f1) null, (String) null, false, z6, (String) null, (List) null, 1007), Effects.a(new taw[]{new taw(ww30Var, uxzVar.a)}));
            }
            if (!(p600Var instanceof c000)) {
                if (!(p600Var instanceof ozz)) {
                    if (p600Var.equals(ywz.a)) {
                        return c(bob1Var, "");
                    }
                    if (p600Var.equals(ywz.b)) {
                        return Next.a(Effects.a(new taw[]{new taw(ww30Var, z)}));
                    }
                    eg.o();
                    return null;
                }
                String str5 = ((ozz) p600Var).a;
                Iterator it3 = f3f1Var.b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next4 = it3.next();
                    if (u890.j(((c3f1) next4).c, str5)) {
                        obj = next4;
                        break;
                    }
                }
                c3f1 c3f1Var2 = (c3f1) obj;
                return c3f1Var2 != null ? c(bob1Var, c3f1Var2.a) : Next.j();
            }
            List listK = k(wkc1Var.a, f3f1Var.b, ((c000) p600Var).a);
            List<c3f1> list2 = listK;
            ArrayList arrayList2 = new ArrayList();
            for (c3f1 c3f1Var3 : list2) {
                r7h.W(o7h.N0(c3f1Var3.f, Collections.singletonList(c3f1Var3)), arrayList2);
            }
            if (arrayList2.isEmpty()) {
                c3f1Var = (c3f1) o7h.q0(f3f1Var.b);
                arrayList = new ArrayList(q7h.U(list2, 10));
                for (c3f1 c3f1VarA : list2) {
                    if (u890.j(c3f1VarA.a, c3f1Var.a)) {
                        c3f1VarA = c3f1.a(c3f1VarA, true, (List) null, 1015);
                    }
                    arrayList.add(c3f1VarA);
                }
                listK = arrayList;
            } else {
                Iterator it4 = arrayList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        c3f1Var = (c3f1) o7h.q0(f3f1Var.b);
                        arrayList = new ArrayList(q7h.U(list2, 10));
                        while (r1.hasNext()) {
                            if (u890.j(c3f1VarA.a, c3f1Var.a)) {
                                c3f1VarA = c3f1.a(c3f1VarA, true, (List) null, 1015);
                            }
                            arrayList.add(c3f1VarA);
                        }
                        listK = arrayList;
                    } else if (((c3f1) it4.next()).d) {
                    }
                }
            }
            f3f1 f3f1VarA = f3f1.a(f3f1Var, listK);
            c3f1 c3f1VarB = f3f1.b(f3f1VarA.b);
            String str6 = (c3f1VarB == null || (str = c3f1VarB.c) == null) ? "default" : str;
            return Next.i(bob1.a(bob1Var, f3f1VarA, str6, false, false, (String) null, (List) null, 1020), Effects.a(new vew[]{new vew(str6)}));
        }
        dyz dyzVar = (dyz) p600Var;
        Integer numD = d(dyzVar);
        ww30 ww30Var3 = dyzVar.b;
        dw30 dw30Var3 = dyzVar.a;
        if (numD != null) {
            str2 = ((bq10) dw30Var3.a.get(numD.intValue())).c;
            if (str2 == null) {
                it = dw30Var3.a.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((bq10) next).e == null);
                bq10Var = (bq10) next;
                if (bq10Var != null) {
                    str2 = bq10Var.c;
                } else {
                    str2 = null;
                }
            }
        } else {
            it = dw30Var3.a.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((bq10) next).e == null);
            bq10Var = (bq10) next;
            if (bq10Var != null) {
                str2 = bq10Var.c;
            } else {
                str2 = null;
            }
        }
        List list3 = list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it5 = list3.iterator();
        while (it5.hasNext()) {
            linkedHashSet.add(((bq10) it5.next()).a);
        }
        ArrayList arrayList3 = dw30Var3.a;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            dyz dyzVar2 = dyzVar;
            if (!linkedHashSet.contains(((bq10) obj4).a)) {
                arrayList4.add(obj4);
            }
            dyzVar = dyzVar2;
        }
        dyz dyzVar3 = dyzVar;
        ArrayList<bq10> arrayListN1 = o7h.N0(list3, arrayList4);
        dw30 dw30Var4 = new dw30(arrayListN1);
        Map map = ew30.a;
        ArrayList arrayList5 = new ArrayList();
        for (bq10 bq10Var3 : arrayListN1) {
            r7h.W(o7h.N0(ew30.a(bq10Var3), Collections.singletonList(bq10Var3.c)), arrayList5);
        }
        Iterator it6 = arrayList5.iterator();
        do {
            if (!it6.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it6.next();
        } while (!u890.j((String) next2, str3));
        String str7 = (String) next2;
        ww30 ww30Var4 = ww30.b;
        if (str7 == null && ww30Var3 == ww30Var4) {
            str3 = "default";
        } else if (str7 != null) {
            str3 = str7;
        }
        Integer numD2 = d(dyzVar3);
        bq10 bq10Var4 = numD2 != null ? (bq10) o7h.t0(numD2.intValue(), arrayListN1) : null;
        Iterator it7 = arrayListN1.iterator();
        while (true) {
            if (!it7.hasNext()) {
                dw30Var = dw30Var4;
                next3 = null;
                break;
            }
            next3 = it7.next();
            dw30Var = dw30Var4;
            if (((bq10) next3).e != null) {
                break;
            }
            dw30Var4 = dw30Var;
        }
        bq10 bq10Var5 = (bq10) next3;
        if (bq10Var4 != null) {
            String str8 = bq10Var4.c;
            if (bq10Var5 != null) {
                String str9 = bq10Var5.c;
                if (u890.j(str9, str8)) {
                    dw30Var2 = dw30Var;
                } else {
                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayListN1, 10));
                    Iterator it8 = arrayListN1.iterator();
                    while (it8.hasNext()) {
                        bq10 bq10VarA = (bq10) it8.next();
                        String str10 = bq10VarA.c;
                        if (u890.j(str10, str9)) {
                            it2 = it8;
                            bq10VarA = bq10.a(bq10VarA, (aq10) null, (String) null, (zp10) null);
                        } else {
                            it2 = it8;
                            if (u890.j(str10, str8)) {
                                bq10VarA = bq10.a(bq10VarA, bq10Var5.e, bq10Var5.f, bq10Var5.g);
                            }
                            arrayList6.add(bq10VarA);
                            it8 = it2;
                            str8 = str8;
                        }
                        arrayList6.add(bq10VarA);
                        it8 = it2;
                        str8 = str8;
                    }
                    dw30Var2 = new dw30(arrayList6);
                }
            } else {
                dw30Var2 = dw30Var;
            }
        } else {
            dw30Var2 = dw30Var;
        }
        boolean z7 = bob1Var.g;
        b3f1 b3f1Var = bob1Var.h;
        g3f1 g3f1Var = f3f1Var.a;
        ArrayList arrayList7 = dw30Var2.a;
        ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
        Iterator it9 = arrayList7.iterator();
        while (it9.hasNext()) {
            arrayList8.add(ew30.b((bq10) it9.next(), str3, str2, b3f1Var));
        }
        return Next.i(bob1.a(bob1Var, new f3f1(g3f1Var, arrayList8, z7, 24), str3, false, false, str2, (List) null, 988), (str7 != null || ww30Var3 == ww30Var4) ? ww30Var3 == ww30Var ? Effects.a(new taw[]{new taw(ww30Var2, z)}) : hashSetA : Effects.a(new taw[]{new taw(ww30Var4, z)}));
    }

    public static List k(String str, List list, String str2) {
        if (list.isEmpty()) {
            return z6x.a;
        }
        List<c3f1> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (c3f1 c3f1Var : list2) {
            List list3 = c3f1Var.f;
            ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((c3f1) it.next()).a);
            }
            boolean zContains = arrayList2.contains(str);
            arrayList.add(c3f1.a(c3f1Var, !(!u890.j(c3f1Var.a, str2) || u890.j(str, str2) || zContains) || (u890.j(str, str2) && zContains), k(str, c3f1Var.f, str2), 983));
        }
        return arrayList;
    }

    public static c3f1 l(c3f1 c3f1Var, String str) {
        boolean zJ = u890.j(c3f1Var.c, str);
        List list = c3f1Var.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l((c3f1) it.next(), str));
        }
        return c3f1.a(c3f1Var, zJ, arrayList, 983);
    }

    public static bob1 m(bob1 bob1Var, List list, String str) {
        f3f1 f3f1Var = bob1Var.a;
        List list2 = list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((bq10) it.next()).a);
        }
        List list3 = f3f1Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (!linkedHashSet.contains(((c3f1) obj).a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(l((c3f1) it2.next(), str));
        }
        g3f1 g3f1Var = f3f1Var.a;
        ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(ew30.b((bq10) it3.next(), str, (String) null, (b3f1) null));
        }
        return bob1.a(bob1Var, f3f1.a(f3f1Var, o7h.N0(arrayList3, arrayList2)), str, false, false, (String) null, list, 508);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Failed to load terms accepted state", new Object[0]);
                return new wae0(th);
            case 4:
                return ((Uri) obj).toString();
            case 5:
                ie9 ie9Var = (ie9) obj;
                return new m3a0(ie9Var.c, ie9Var.d, ie9Var.e);
            case 10:
                if (((Boolean) obj).booleanValue()) {
                    return new hrn0(g9f0.class, aqr0.a, new c6w0(1, false, (hd5) null, 14));
                }
                return crn0.a;
            case 13:
                return Observable.empty();
            case 16:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    ru50 ru50Var = (ru50) ((spq0) it.next()).h();
                    if (ru50Var != null) {
                        arrayList.add(ru50Var);
                    }
                }
                return arrayList;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return i3o1.o((ContextTrack) ((spq0) obj).h());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                h290 h290VarP = ((EsOffline.GetContextsResponse) obj).p();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
                Iterator it2 = h290VarP.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((EsOffline.ContextInfo) it2.next()).o());
                }
                int iS = zno1.s(q7h.U(arrayList2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : arrayList2) {
                    linkedHashMap.put(((EsOffline.Context) obj2).getUri(), obj2);
                }
                return linkedHashMap;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (ContextTrack) ((spq0) obj).b();
            case 23:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return j5.a;
            case 25:
                int i2 = ((csp0) obj).a.a;
                for (orp0 orp0Var : orp0.values()) {
                    if (orp0Var.a == i2) {
                        return orp0Var;
                    }
                }
                return orp0.UNKNOWN;
            case 28:
                Set set = ((ztv0) obj).a;
                return Single.just(set.size() > 1 ? new muv0(set) : new ruv0((String) o7h.p0(set)));
            default:
                return (eww0) ((spq0) obj).b();
        }
    }

    public List b(boolean z, boolean z2, YourLibraryResponseHeader yourLibraryResponseHeader, List list, List list2) {
        return z6x.a;
    }

    public First e0(Object obj) {
        svr0 svr0Var = (svr0) obj;
        return svr0Var.c == null ? First.c(svr0Var, Collections.singleton(zur0.b)) : First.b(svr0Var);
    }

    public Object h(eha0 eha0Var, float f2) {
        int iO = eha0Var.o();
        if (iO == 1) {
            return pha0.b(eha0Var, f2);
        }
        if (iO == 3) {
            return pha0.b(eha0Var, f2);
        }
        if (iO != 7) {
            hhg1.n("Cannot convert json to point. Next token is ".concat(cy30.z(iO)));
            return null;
        }
        PointF pointF = new PointF(((float) eha0Var.i()) * f2, ((float) eha0Var.i()) * f2);
        while (eha0Var.g()) {
            eha0Var.v();
        }
        return pointF;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4;
        switch (this.a) {
            case 14:
                String str5 = (String) linkedHashMap.get("track_id");
                if (str5 == null || str5.length() != 22) {
                    return null;
                }
                int length = str5.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str5.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                }
                return new ium0(str5, str2, str, xkg0Var);
            default:
                String str6 = (String) linkedHashMap.get("account_id");
                if (str6 == null || !gho1.k(str6) || (str3 = (String) linkedHashMap.get("social_handle")) == null || (str4 = (String) linkedHashMap.get("folder_id")) == null) {
                    return null;
                }
                return new czu0(str6, str3, str4, str2, str, xkg0Var);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return ((t9c0) obj) instanceof p9c0;
            case 9:
                return !((uv00) obj).f;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    public int a(wat watVar, int i2) {
        return i2;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                return o7h.N0((List) obj2, (List) obj);
            default:
                return a9h.a((a9h) obj, (fef0) null, (bff0) obj2, 1);
        }
    }
}
