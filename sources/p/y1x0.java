package p;

import android.net.Uri;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class y1x0 implements Function, Predicate, Init, BiFunction, np80 {
    public final /* synthetic */ byte a;
    public static final y1x0 b = new y1x0(0);
    public static final y1x0 c = new y1x0(1);
    public static final y1x0 d = new y1x0(2);
    public static final y1x0 e = new y1x0(3);
    public static final y1x0 f = new y1x0(5);
    public static final y1x0 g = new y1x0(6);
    public static final y1x0 h = new y1x0(7);
    public static final y1x0 i = new y1x0(8);
    public static final y1x0 t = new y1x0(9);
    public static final y1x0 X = new y1x0(10);
    public static final y1x0 Y = new y1x0(11);
    public static final y1x0 Z = new y1x0(12);
    public static final y1x0 N0 = new y1x0(13);
    public static final y1x0 O0 = new y1x0(14);
    public static final y1x0 P0 = new y1x0(15);
    public static final y1x0 Q0 = new y1x0(16);
    public static final y1x0 R0 = new y1x0(17);
    public static final y1x0 S0 = new y1x0(18);
    public static final y1x0 T0 = new y1x0(19);
    public static final y1x0 U0 = new y1x0(20);
    public static final y1x0 V0 = new y1x0(21);
    public static final y1x0 W0 = new y1x0(22);
    public static final y1x0 X0 = new y1x0(23);
    public static final y1x0 Y0 = new y1x0(24);
    public static final y1x0 Z0 = new y1x0(26);
    public static final y1x0 a1 = new y1x0(27);

    public /* synthetic */ y1x0(byte b2) {
        this.a = b2;
    }

    public static String b(String str) {
        Matcher matcher;
        zzg1 zzg1Var;
        zzg1[] zzg1VarArrValues = zzg1.values();
        int iS = zno1.s(zzg1VarArrValues.length);
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        int i2 = 0;
        for (zzg1 zzg1Var2 : zzg1VarArrValues) {
            linkedHashMap.put(zzg1Var2, Pattern.compile("(spotify:artist:([a-zA-Z0-9]+))".concat(zzg1Var2.a)));
        }
        zzg1[] zzg1VarArrValues2 = zzg1.values();
        int length = zzg1VarArrValues2.length;
        Matcher matcher2 = null;
        while (true) {
            if (i2 >= length) {
                matcher = matcher2;
                zzg1Var = null;
                break;
            }
            zzg1Var = zzg1VarArrValues2[i2];
            Object obj = linkedHashMap.get(zzg1Var);
            obj.getClass();
            matcher = ((Pattern) obj).matcher(str);
            if (matcher.find()) {
                break;
            }
            i2++;
            matcher2 = matcher;
        }
        if (zzg1Var == null) {
            hhg1.n("Specified artistUri doesn't match any type");
            return null;
        }
        if (matcher == null) {
            u890.C("matcher");
            throw null;
        }
        String strGroup = matcher.group(2);
        strGroup.getClass();
        return strGroup;
    }

    public static String c(String str) {
        return String.format("spotify:artist:%s:concerts", Arrays.copyOf(new Object[]{b(str)}, 1));
    }

    public static t2j1 d(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        int iHashCode = upperCase.hashCode();
        t2j1 t2j1Var = t2j1.c;
        if (iHashCode == -1402997159) {
            upperCase.equals("VERIFICATION_NEEDED");
            return t2j1Var;
        }
        if (iHashCode != -1211756856) {
            if (iHashCode == 175259132 && upperCase.equals("INELIGIBLE")) {
                return t2j1.b;
            }
        } else if (upperCase.equals("VERIFIED")) {
            return t2j1.a;
        }
        return t2j1Var;
    }

    public static Next e(z011 z011Var, j011 j011Var) {
        Object next;
        Map mapP = z011Var.g;
        List list = z011Var.a;
        boolean z = j011Var instanceof h011;
        nz01 nz01Var = oz01.a;
        if (z) {
            h011 h011Var = (h011) j011Var;
            if (!(h011Var.d instanceof qlw0)) {
                nz01Var = new nz01(h011Var.c);
            }
            return Next.a(Collections.singleton(nz01Var));
        }
        if (j011Var instanceof i011) {
            tv80 tv80Var = ((i011) j011Var).a;
            if (tv80Var != null) {
                return Next.a(Collections.singleton(new jz01(tv80Var)));
            }
            hhg1.n("Required value was null.");
            return null;
        }
        boolean z2 = j011Var instanceof zz01;
        hz01 hz01Var = hz01.a;
        if (z2) {
            return Next.a(Collections.singleton(hz01Var));
        }
        if (j011Var instanceof d011) {
            d011 d011Var = (d011) j011Var;
            String str = d011Var.a;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((kjf1) next).a, str));
            kjf1 kjf1Var = (kjf1) next;
            if (kjf1Var != null) {
                mapP = sqg0.P(mapP, new mmr0(str, kjf1Var));
            }
            return Next.i(z011.a(z011Var, null, false, mapP, 63), Collections.singleton(new gz01(d011Var.b, str, d011Var.c, d011Var.d)));
        }
        if (j011Var instanceof yz01) {
            yz01 yz01Var = (yz01) j011Var;
            String str2 = yz01Var.a;
            return mapP.containsKey(str2) ? Next.j() : Next.a(Collections.singleton(new kz01(str2, yz01Var.b, yz01Var.c)));
        }
        if (j011Var instanceof wz01) {
            return Next.i(z011.a(z011Var, null, false, sqg0.K(((wz01) j011Var).a, mapP), 63), Collections.singleton(lz01.a));
        }
        if (j011Var instanceof xz01) {
            xz01 xz01Var = (xz01) j011Var;
            String str3 = xz01Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!u890.j(((kjf1) obj).a, str3)) {
                    arrayList.add(obj);
                }
            }
            return Next.i(z011.a(z011Var, arrayList, false, sqg0.K(str3, mapP), 62), f46.S0(new pz01[]{new mz01(str3, xz01Var.b), nz01Var}));
        }
        if (!(j011Var instanceof e011)) {
            if (!(j011Var instanceof a011)) {
                if (j011Var instanceof b011) {
                    return Next.a(Collections.singleton(iz01.a));
                }
                return j011Var instanceof c011 ? Next.h(z011.a(z011Var, null, ((c011) j011Var).a, null, 123)) : Next.j();
            }
            a011 a011Var = (a011) j011Var;
            List<kjf1> list2 = list;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            for (kjf1 kjf1VarA : list2) {
                vw01 vw01Var = (vw01) a011Var.a.get(kjf1VarA.a);
                if (vw01Var != null && vw01Var != kjf1VarA.h) {
                    kjf1VarA = kjf1.a(kjf1VarA, null, vw01Var, 127);
                }
                arrayList2.add(kjf1VarA);
            }
            return arrayList2.equals(list) ? Next.j() : Next.h(z011.a(z011Var, arrayList2, false, null, 126));
        }
        List list3 = ((e011) j011Var).a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list3) {
            if (!mapP.containsKey(((kjf1) obj2).a)) {
                arrayList3.add(obj2);
            }
        }
        List list4 = list;
        ArrayList arrayList4 = new ArrayList(q7h.U(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((kjf1) it2.next()).a);
        }
        Set setP1 = o7h.p1(arrayList4);
        int iS = zno1.s(q7h.U(arrayList3, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj3 : arrayList3) {
            linkedHashMap.put(((kjf1) obj3).a, obj3);
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : list4) {
            if (linkedHashMap.containsKey(((kjf1) obj4).a)) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList3) {
            if (!setP1.contains(((kjf1) obj5).a)) {
                arrayList6.add(obj5);
            }
        }
        ArrayList arrayListN0 = o7h.N0(arrayList6, arrayList5);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (arrayListN0.isEmpty()) {
            linkedHashSet.add(nz01Var);
            if (z011Var.f) {
                linkedHashSet.add(hz01Var);
            }
        }
        Set setP2 = o7h.p1(linkedHashSet);
        return (arrayListN0.equals(list) && setP2.isEmpty()) ? Next.j() : Next.i(z011.a(z011Var, arrayListN0, false, null, 126), setP2);
    }

    public static void f(Object obj) {
        n8o1 n8o1Var = ((vyn1) obj).zzc;
        if (n8o1Var.e) {
            n8o1Var.e = false;
        }
    }

    public void a(qim0 qim0Var, float f2, long j, hw61 hw61Var, b0k b0kVar, int i2) {
        float f3;
        long j2;
        hw61 hw61VarB;
        long j3;
        float f4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(917773249);
        int i3 = i2 | (x340Var.g(qim0Var) ? 4 : 2) | 1168;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                avw0 avw0Var = cbx.b(x340Var).c;
                j3 = cbx.a(x340Var).b.c;
                cua cuaVar = cbx.b(x340Var).f;
                f4 = 2.0f;
                hw61VarB = er31.b(2.0f);
            } else {
                x340Var.b0();
                f4 = f2;
                j3 = j;
                hw61VarB = hw61Var;
            }
            x340Var.s();
            t1c.a(i1p1.q(dug.f(u291.h(u291.f(qim0Var, 1.0f), f4), j3, hw61VarB), hw61VarB), x340Var, 0);
            j2 = j3;
            f3 = f4;
        } else {
            x340Var.b0();
            f3 = f2;
            j2 = j;
            hw61VarB = hw61Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r9g0(this, qim0Var, f3, j2, hw61VarB, i2);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new p2x0((q730) obj);
            case 1:
                return new krx0(((Boolean) obj).booleanValue());
            case 2:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            default:
                return spq0.d(((Uri) obj).toString());
            case 3:
                return Single.just(new kcg1(z6x.a));
            case 6:
                return new gq3((List) obj);
            case 10:
                Object obj2 = ((cma1) obj).a;
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                hhg1.n("Required value was null.");
                return null;
            case 11:
                return spq0.a(((gnm) obj).a);
            case 12:
                return new g8o0((Throwable) obj, (bk8) null);
            case 13:
                return ((ul91) obj).b;
            case 14:
                return new g8o0((Throwable) obj, (bk8) null);
            case 15:
                ((Number) obj).intValue();
                return Maybe.l(1L, TimeUnit.SECONDS, Schedulers.b);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ern0((s4b1) obj);
            case 22:
                return Boolean.valueOf(((gbl) obj).b);
        }
    }

    public First e0(Object obj) {
        return First.b((b061) obj);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((uv00) obj).f;
            case 5:
                return !ihc1.y0((String) obj);
            case 7:
                return ((PlayerState) obj).track().c();
            case 8:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            case 16:
                return ((feh) obj) instanceof beh;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((th61) obj).b;
            default:
                th61 th61Var = (th61) obj;
                return (th61Var.c || th61Var.d) ? false : true;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((PlayerState) obj, (Boolean) obj2);
    }
}
