package p;

import android.media.AudioRecord;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy;
import com.spotify.thestage.vtec.datasource.GenericViewException;
import com.spotify.thestage.vtec.datasource.TheStageRestrictedException;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import spotify.socialgraph.esperanto.proto.FollowedUsersResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u3x0 implements Function3, Predicate, Function, av30, BiFunction, sga1, s2i1, yg30, Init, ijp1, u28 {
    public final /* synthetic */ byte a;
    public static final u3x0 b = new u3x0((byte) 0);
    public static final u3x0 c = new u3x0((byte) 1);
    public static final u3x0 d = new u3x0((byte) 2);
    public static final u3x0 e = new u3x0((byte) 3);
    public static final u3x0 f = new u3x0((byte) 4);
    public static final u3x0 g = new u3x0((byte) 5);
    public static final u3x0 h = new u3x0((byte) 6);
    public static final u3x0 i = new u3x0((byte) 7);
    public static final u3x0 t = new u3x0((byte) 8);
    public static final u3x0 X = new u3x0((byte) 9);
    public static final u3x0 Y = new u3x0((byte) 10);
    public static final u3x0 Z = new u3x0((byte) 11);
    public static final u3x0 N0 = new u3x0((byte) 12);
    public static final u3x0 O0 = new u3x0((byte) 13);
    public static final u3x0 P0 = new u3x0((byte) 14);
    public static final u3x0 Q0 = new u3x0((byte) 15);
    public static final u3x0 R0 = new u3x0((byte) 16);
    public static final u3x0 S0 = new u3x0((byte) 17);
    public static final u3x0 T0 = new u3x0((byte) 18);
    public static final u3x0 U0 = new u3x0((byte) 19);
    public static final u3x0 V0 = new u3x0((byte) 20);
    public static final u3x0 W0 = new u3x0((byte) 21);
    public static final u3x0 X0 = new u3x0((byte) 22);
    public static final u3x0 Y0 = new u3x0((byte) 23);
    public static final u3x0 Z0 = new u3x0((byte) 24);
    public static final u3x0 a1 = new u3x0((byte) 25);
    public static final u3x0 b1 = new u3x0((byte) 26);
    public static final u3x0 c1 = new u3x0((byte) 27);

    public u3x0(p2o0 p2o0Var) {
        this.a = (byte) 28;
    }

    public int a() {
        return 44100;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    public Object apply(Object obj) {
        Object obj2 = null;
        z = false;
        boolean z = false;
        switch (this.a) {
            case 2:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                return new r8z0(message);
            case 3:
                m901 m901Var = (m901) obj;
                return new mmr0(m901Var.c, m901Var.d);
            case 4:
            case 10:
            case 13:
            case 15:
            case 17:
            case 18:
            case 20:
            case 22:
            default:
                Map map = (j380) obj;
                Map map2 = map.isEmpty() ? null : map;
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        if (entry.getKey() == e3s0.g) {
                            z = !((g19) entry.getValue()).a;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                return ((kz11) obj).callSingle("spotify.remote_config.esperanto.proto.RemoteConfigDummyResolve", "ResolveDummyProperty", EsRemoteConfigDummy.ResolveDummyRequest.n()).map(i2x0.g).toObservable();
            case 6:
                return new p1n1(false);
            case 7:
                List list = ((z310) obj).a;
                return list.size() > 5 ? list.subList(0, 5) : list;
            case 8:
                return new o451((List) obj);
            case 9:
                return rih1.a;
            case 11:
                return ((go81) obj).c;
            case 12:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj3 : objArr) {
                    arrayList.add((Map) obj3);
                }
                ArrayList<Map.Entry> arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((Map) it.next()).entrySet(), arrayList2);
                }
                int iS = zno1.s(q7h.U(arrayList2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Map.Entry entry2 : arrayList2) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
                return linkedHashMap;
            case 14:
                byte[] bArr = (byte[]) obj;
                try {
                    return FollowedUsersResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.socialgraph.esperanto.proto.FollowedUsersResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                for (Object obj4 : ((YourLibraryContainsResponse) obj).o()) {
                    if (((YourLibraryContainsResponseEntity) obj4).o()) {
                        obj2 = obj4;
                        YourLibraryContainsResponseEntity yourLibraryContainsResponseEntity = (YourLibraryContainsResponseEntity) obj2;
                        return Boolean.valueOf(yourLibraryContainsResponseEntity != null ? yourLibraryContainsResponseEntity.o() : false);
                    }
                }
                YourLibraryContainsResponseEntity yourLibraryContainsResponseEntity2 = (YourLibraryContainsResponseEntity) obj2;
                return Boolean.valueOf(yourLibraryContainsResponseEntity2 != null ? yourLibraryContainsResponseEntity2.o() : false);
            case 19:
                return new x910((w19) obj);
            case 21:
                return new e331(new m231((Throwable) obj));
            case 23:
                k2l1 k2l1Var = (Throwable) obj;
                return k2l1Var instanceof TheStageRestrictedException ? new c5e0(new elb1(k2l1Var)) : new c5e0(new elb1(new GenericViewException(k2l1Var.getMessage())));
        }
    }

    public First e0(Object obj) {
        return First.b((y0k1) obj);
    }

    public void f(zf30 zf30Var) {
        nmn1.p((nnf1) zf30Var);
    }

    public t28 h(int i2, int i3) {
        return k(i2, 44100, i3);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new qtd1(xkg0Var, str2, str);
    }

    public t28 k(int i2, int i3, int i4) {
        return new km3(new AudioRecord(i2, i3, 16, 2, i4));
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        m3x0 m3x0Var = (m3x0) obj;
        String str = (String) obj3;
        m3x0Var.getClass();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (ihc1.y0(str)) {
            str = null;
        }
        return m3x0.a(m3x0Var, 0, (String) null, (String) null, false, false, false, false, 0, 0, (q730) null, false, false, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (l3x0) null, false, false, (Boolean) null, (String) null, false, zBooleanValue, str, -1, 3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return !((uv00) obj).f;
            case 4:
                ContextTrack contextTrack = (ContextTrack) obj;
                contextTrack.getClass();
                return l4o1.X(contextTrack);
            case 20:
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
            default:
                wv00 wv00Var = (uv00) obj;
                return !wv00Var.f || wv00Var.c();
        }
    }

    public boolean zzb(Class cls) {
        return cip1.class.isAssignableFrom(cls);
    }

    public tjp1 zzc(Class cls) {
        if (!cip1.class.isAssignableFrom(cls)) {
            hhg1.n("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (tjp1) cip1.g(cls.asSubclass(cip1.class)).j(3, (cip1) null);
        } catch (Exception e2) {
            bhn0.o("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    public /* synthetic */ u3x0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        boolean z = false;
        switch (this.a) {
            case 10:
                Boolean bool = (Boolean) obj2;
                if (((Boolean) obj).booleanValue() && bool.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                Boolean bool2 = (Boolean) obj2;
                if (((Boolean) obj).booleanValue() && !bool2.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
