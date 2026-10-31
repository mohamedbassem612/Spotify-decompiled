package p;

import com.google.protobuf.Empty;
import com.spotify.allboarding.model.v1.proto.SearchItem;
import com.spotify.allboarding.model.v1.proto.SearchResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class b4x0 implements Function, av30, Predicate, s2i1, uga1, Init, hj71 {
    public final /* synthetic */ byte a;
    public static final b4x0 b = new b4x0(0);
    public static final b4x0 c = new b4x0(2);
    public static final b4x0 d = new b4x0(3);
    public static final b4x0 e = new b4x0(4);
    public static final b4x0 f = new b4x0(5);
    public static final b4x0 g = new b4x0(6);
    public static final b4x0 h = new b4x0(7);
    public static final b4x0 i = new b4x0(8);
    public static final b4x0 t = new b4x0(9);
    public static final b4x0 X = new b4x0(10);
    public static final b4x0 Y = new b4x0(11);
    public static final b4x0 Z = new b4x0(12);
    public static final b4x0 N0 = new b4x0(13);
    public static final b4x0 O0 = new b4x0(14);
    public static final b4x0 P0 = new b4x0(15);
    public static final b4x0 Q0 = new b4x0(16);
    public static final b4x0 R0 = new b4x0(17);
    public static final b4x0 S0 = new b4x0(18);
    public static final b4x0 T0 = new b4x0(19);
    public static final b4x0 U0 = new b4x0(20);
    public static final b4x0 V0 = new b4x0(21);
    public static final b4x0 W0 = new b4x0(22);
    public static final b4x0 X0 = new b4x0(23);
    public static final b4x0 Y0 = new b4x0(24);
    public static final b4x0 Z0 = new b4x0(25);
    public static final b4x0 a1 = new b4x0(26);

    public /* synthetic */ b4x0(byte b2) {
        this.a = b2;
    }

    public static tr3 a(tr3 tr3Var) {
        sxc0 sxc0Var = tr3Var.b;
        tn90 tn90Var = sxc0Var.c;
        tr80 tr80Var = sxc0Var.b.a;
        boolean z = tn90Var instanceof b8e0;
        tn90 nn90Var = tn90.a;
        if (z && !(tn90Var instanceof nn90)) {
            if (tn90Var instanceof rn90) {
                nn90Var = tn90Var;
            } else {
                boolean zIsEmpty = tr80Var.isEmpty();
                int i2 = ((rr80) tr80Var).b;
                int i3 = ((rr80) tr80Var).a;
                if (!zIsEmpty) {
                    b8e0 b8e0Var = (b8e0) tn90Var;
                    if (!b8e0Var.a().isEmpty() && ((rr80) b8e0Var.a()).a <= i3 && ((rr80) b8e0Var.a()).b >= i2) {
                        int i4 = i3 - ((rr80) b8e0Var.a()).a;
                        int i5 = i2 - ((rr80) b8e0Var.a()).a;
                        int iU = ryo1.u(tn90Var);
                        b8e0 b8e0Var2 = (b8e0) tn90Var;
                        nn90Var = new nn90(iU, b8e0Var2.getCount(), tr80Var, b8e0Var2.getItems().subList(i4, i5 + 1), b8e0Var2.g(), b8e0Var2.getFilters(), b8e0Var2.h());
                    }
                }
            }
        }
        return tr3.b(tr3Var, null, sxc0.a(sxc0Var, null, null, nn90Var, null, null, null, 251), null, false, 13);
    }

    public static tr3 b(fab0 fab0Var, mml mmlVar, int i2, List list, dia1 dia1Var, as3 as3Var, a3t0 a3t0Var, boolean z, int i3, ln01 ln01Var, List list2, int i4) {
        int i5 = i4 & 8;
        List list3 = z6x.a;
        List list4 = i5 != 0 ? list3 : list;
        dia1 dia1Var2 = (i4 & 16) != 0 ? dia1.b : dia1Var;
        as3 as3Var2 = (i4 & 32) != 0 ? as3.b : as3Var;
        a3t0 a3t0Var2 = (i4 & 64) != 0 ? a3t0.a : a3t0Var;
        boolean z2 = (i4 & 128) != 0 ? false : z;
        mn01 mn01Var = (i4 & 1024) != 0 ? kn01.a : ln01Var;
        List listQ0 = (i4 & 2048) != 0 ? f46.Q0(dia1.values()) : list2;
        bqq0 bqq0Var = new bqq0(fab0Var, as3Var2, dia1Var2, list4, mmlVar, false, a3t0Var2, z2, false);
        tr80 tr80Var = tr80.d;
        return new tr3(listQ0, new sxc0(bqq0Var, new oqz0(tr80Var, tr80Var, 0), tn90.a, i2, i3, mn01Var, list3, list3), new w7c0(b7x.a), false);
    }

    public static int c(agy0 agy0Var) {
        int i2 = agy0Var == null ? -1 : phy0.a[agy0Var.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return 3;
            }
            if (i2 == 3) {
                return 4;
            }
            if (i2 == 4) {
                return 2;
            }
        }
        return 1;
    }

    public Object apply(Object obj) {
        k9 nqm1Var;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(y7y0.t("apply-child-content-restrictions", (Map) obj));
            case 1:
            case 5:
            case 10:
            case 14:
            case 15:
            case 17:
            case 19:
            case 21:
            default:
                pt8 pt8Var = (qt8) obj;
                if (pt8Var.equals(ot8.a)) {
                    nqm1Var = mqm1.c;
                } else {
                    if (!(pt8Var instanceof pt8)) {
                        eg.o();
                        return null;
                    }
                    nqm1Var = new nqm1(pt8Var.a);
                }
                return (pr61) nqm1Var.b;
            case 2:
                String message = ((Throwable) obj).getMessage();
                return new u8z0(message != null ? message : "");
            case 3:
                m901 m901Var = (m901) obj;
                return new mmr0(Boolean.valueOf(m901Var.l), Integer.valueOf(m901Var.h));
            case 4:
                Throwable th = (Throwable) obj;
                Logger.e(th, "Assisted Curation Recs Loader: failed to load recs: %s", new Object[]{th.getMessage()});
                return z6x.a;
            case 6:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    i1z i1zVar = (i1z) entry.getValue();
                    int i2 = i1zVar.E;
                    linkedHashMap.put(key, (i2 == 3 || i2 == 4 || !i1zVar.o) ? ewn.a : k8p1.k(i1zVar.D.a(b9v0.class)) ? fwn.a : uml1.T0);
                }
                return sqg0.U(linkedHashMap);
            case 7:
                return Boolean.valueOf(((o841) obj) == o841.b);
            case 8:
                List<SearchItem> itemsList = ((SearchResponse) obj).getItemsList();
                ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
                for (SearchItem searchItem : itemsList) {
                    searchItem.getClass();
                    int iOrdinal = searchItem.r().ordinal();
                    int i3 = iOrdinal != 1 ? iOrdinal != 2 ? 1 : 3 : 2;
                    xl81 xl81VarB = cpn1.B(searchItem.n());
                    String uri = searchItem.getUri();
                    String title = searchItem.getTitle();
                    String value = searchItem.q().getValue();
                    String str = value == null ? "" : value;
                    String value2 = searchItem.o().getValue();
                    arrayList.add(new h951(i3, xl81VarB, uri, title, str, value2 == null ? "" : value2, searchItem.p()));
                }
                return new e331(arrayList);
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 11:
                return ((io81) obj).c;
            case 12:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList2 = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList2.add((Map) obj2);
                }
                ArrayList<Map.Entry> arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    r7h.W(((Map) it.next()).entrySet(), arrayList3);
                }
                int iS = zno1.s(q7h.U(arrayList3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS);
                for (Map.Entry entry2 : arrayList3) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
                return linkedHashMap2;
            case 13:
                List list = (List) obj;
                return !list.isEmpty() ? ((vrc0) o7h.q0(list)).a : "";
            case 16:
                return d7c1.a;
            case 18:
                return (l4m) obj;
            case 20:
                beh behVar = (feh) obj;
                return behVar instanceof beh ? new w7z0(behVar.a) : x7z0.a;
            case 22:
                String strUri = ((ContextTrack) ((PlayerState) obj).track().b()).uri();
                Set set = s4b1.f;
                return Boolean.valueOf(uic.x(strUri).c == blc0.Pg);
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 17:
                return First.b(shm0.a((shm0) obj, false, false, 7));
            default:
                x0j1 x0j1Var = (x0j1) obj;
                if (x0j1Var instanceof v0j1) {
                    return First.c(x0j1Var, Collections.singleton(e0j1.a));
                }
                if (x0j1Var instanceof w0j1) {
                    return First.b(x0j1Var);
                }
                eg.o();
                return null;
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new o0a1(xkg0Var, str2, str);
    }

    public Object n(k371 k371Var, lnm lnmVar) {
        wa71 wa71Var;
        List list = k371Var.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof f5) {
                arrayList.add(obj);
            }
        }
        f5 f5Var = (f5) o7h.s0(arrayList);
        if (f5Var == null || (wa71Var = k371Var.a) == null) {
            return null;
        }
        return new qj71(Collections.singletonList(new u771(new t771(wa71Var, tyo1.p(blc0.gg, new String[0])), new pz61(new y171(rc11.a.b(z4.class)), new e5(f5Var.a, f5Var.b), az61.d, false))), 0, puk.d);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return ((ln41) obj) instanceof jn41;
            case 10:
                return ((cma1) obj).b == 1;
            case 19:
                return !((uv00) obj).f;
            default:
                return ((spq0) obj).c();
        }
    }
}
