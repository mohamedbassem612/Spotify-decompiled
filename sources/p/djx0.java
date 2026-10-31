package p;

import com.spotify.connectivity.reachability.esperanto.proto.EsReachabilityProvider;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.show_esperanto.proto.GetShowResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import spotify.show_cosmos.proto.ShowRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class djx0 implements Function, Predicate, Function3, r0c, BiFunction, io.reactivex.rxjava3.functions.BiFunction, s2i1, ya, dba {
    public final /* synthetic */ byte a;
    public static final djx0 b = new djx0(0);
    public static final djx0 c = new djx0(1);
    public static final djx0 d = new djx0(2);
    public static final djx0 e = new djx0(3);
    public static final djx0 f = new djx0(4);
    public static final djx0 g = new djx0(5);
    public static final djx0 h = new djx0(6);
    public static final djx0 i = new djx0(7);
    public static final djx0 t = new djx0(8);
    public static final djx0 X = new djx0(9);
    public static final djx0 Y = new djx0(10);
    public static final djx0 Z = new djx0(11);
    public static final djx0 N0 = new djx0(12);
    public static final djx0 O0 = new djx0(13);
    public static final djx0 P0 = new djx0(14);
    public static final djx0 Q0 = new djx0(15);
    public static final djx0 R0 = new djx0(16);
    public static final djx0 S0 = new djx0(17);
    public static final djx0 T0 = new djx0(18);
    public static final djx0 U0 = new djx0(19);
    public static final djx0 V0 = new djx0(20);
    public static final djx0 W0 = new djx0(21);
    public static final djx0 X0 = new djx0(22);
    public static final djx0 Y0 = new djx0(23);
    public static final djx0 Z0 = new djx0(24);
    public static final djx0 a1 = new djx0(25);
    public static final djx0 b1 = new djx0(26);

    public /* synthetic */ djx0(byte b2) {
        this.a = b2;
    }

    public long a(int i2, a9a a9aVar) {
        String str = ((y9e1) a9aVar.e).a.a.b;
        return e6p1.e(jmo1.h(i2, str), jmo1.g(i2, str));
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.k1;
    }

    public Object apply(Object obj) throws Throwable {
        int i2 = 0;
        switch (this.a) {
            case 0:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList();
                int length = objArr.length;
                while (i2 < length) {
                    Object obj2 = objArr[i2];
                    if (obj2 instanceof GetShowResponse) {
                        arrayList.add(obj2);
                    }
                    i2++;
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((GetShowResponse) it.next()).n().p());
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    ShowRequest.Header header = (ShowRequest.Header) obj3;
                    if (header.s() && header.p().getIsBook()) {
                        arrayList3.add(obj3);
                    }
                }
                int iS = zno1.s(q7h.U(arrayList3, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj4 : arrayList3) {
                    linkedHashMap.put(((ShowRequest.Header) obj4).p().getLink(), obj4);
                }
                return linkedHashMap;
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 15:
            case 16:
            case 17:
            case 20:
            default:
                return new d2l1((wzw0) obj);
            case 2:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsReachabilityProvider.ReachabilityState.s(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.reachability.esperanto.proto.EsReachabilityProvider.ReachabilityState: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 3:
                Object[] objArr2 = (Object[]) obj;
                ArrayList arrayList4 = new ArrayList();
                int length2 = objArr2.length;
                while (i2 < length2) {
                    Object obj5 = objArr2[i2];
                    if (obj5 instanceof List) {
                        arrayList4.add(obj5);
                    }
                    i2++;
                }
                ArrayList arrayListV = q7h.V(arrayList4);
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : arrayListV) {
                    if (hashSet.add(((kjf1) obj6).a)) {
                        arrayList5.add(obj6);
                    }
                }
                return arrayList5;
            case 4:
                return l4o1.n((ContextTrack) obj);
            case 5:
                spq0 spq0Var = (spq0) obj;
                if (!spq0Var.c()) {
                    return new kxg0();
                }
                if (((lx0) spq0Var.b()).c.a.length() <= 0 || ((lx0) spq0Var.b()).a != 1) {
                    return ((lx0) spq0Var.b()).a == 2 ? jxg0.a : new kxg0();
                }
                return new lxg0((lx0) spq0Var.b());
            case 10:
                return new i5w0((u3u0) obj);
            case 12:
                return Observable.just((List) obj, z6x.a);
            case 13:
                return ((Single) ((dxe0) obj).a.h.invoke()).map(mgx0.N0).onErrorReturn(bjx0.O0);
            case 14:
                return crn0.a;
            case 18:
                return Boolean.valueOf(!((erq0) obj).a.isEmpty());
            case 19:
                Throwable th = (Throwable) obj;
                if (th instanceof TimeoutException) {
                    return Boolean.FALSE;
                }
                throw th;
            case 21:
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj7 : (List) obj) {
                    uvj1 uvj1VarX = l4p1.x((y1k1) obj7);
                    Object arrayList6 = linkedHashMap2.get(uvj1VarX);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap2.put(uvj1VarX, arrayList6);
                    }
                    ((List) arrayList6).add(obj7);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(zno1.s(linkedHashMap2.size()));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(entry.getKey(), o7h.F0((List) entry.getValue()));
                }
                ArrayList arrayList7 = new ArrayList(linkedHashMap3.size());
                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                    arrayList7.add(new yvj1((uvj1) entry2.getKey(), (y1k1) entry2.getValue()));
                }
                return o7h.N0(o7h.a1(arrayList7, new epj1((byte) 3)), Collections.singletonList(wvj1.a));
        }
    }

    public boolean b(float f2) {
        throw new IllegalStateException("not implemented");
    }

    public sua0 c() {
        throw new IllegalStateException("not implemented");
    }

    public boolean d(float f2) {
        return false;
    }

    public float e() {
        return 0.0f;
    }

    public float f() {
        return 1.0f;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !gho1.k(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new hji1(str4, str3, xkg0Var, str2, str);
    }

    public boolean isEmpty() {
        return true;
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj3;
        return new m131(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), y7y0.t("obfuscate-restricted-tracks", map), y7y0.u("should-assure-age-content-playback", map, false));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((wu21) it.next()) instanceof uu21) {
                            return false;
                        }
                    }
                }
                return true;
            case 9:
                return ((cma1) obj).b == 1;
            case 15:
                return ((PlayerState) obj).track().c();
            default:
                return ((th61) obj).b;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                return qq81.a((qq81) obj, null, null, (v6s0) obj2, null, null, null, false, null, null, 0, null, 16379);
            default:
                return new mmr0((PlayerState) obj, (Boolean) obj2);
        }
    }
}
