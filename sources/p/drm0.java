package p;

import android.net.Uri;
import com.spotify.authentication.login5esperanto.EsCodeRequired;
import com.spotify.collection_esperanto.proto.CollectionUnplayedResponse;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse$RelationsUsernameResponse;
import com.spotify.your_library_esperanto.proto.AlsoAvailableOfflineResponse;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function5;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import spotify.autodownload.esperanto.proto.EpisodeLimitResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class drm0 implements Function, BiPredicate, Predicate, BiFunction, Function5 {
    public final /* synthetic */ byte a;
    public static final drm0 b = new drm0((byte) 1);
    public static final drm0 c = new drm0((byte) 2);
    public static final drm0 d = new drm0((byte) 3);
    public static final drm0 e = new drm0((byte) 4);
    public static final drm0 f = new drm0((byte) 5);
    public static final drm0 g = new drm0((byte) 6);
    public static final drm0 h = new drm0((byte) 7);
    public static final drm0 i = new drm0((byte) 8);
    public static final drm0 t = new drm0((byte) 9);
    public static final drm0 X = new drm0((byte) 10);
    public static final drm0 Y = new drm0((byte) 11);
    public static final drm0 Z = new drm0((byte) 12);
    public static final drm0 N0 = new drm0((byte) 13);
    public static final drm0 O0 = new drm0((byte) 14);
    public static final drm0 P0 = new drm0((byte) 15);
    public static final drm0 Q0 = new drm0((byte) 16);
    public static final drm0 R0 = new drm0((byte) 18);
    public static final drm0 S0 = new drm0((byte) 19);
    public static final drm0 T0 = new drm0((byte) 20);
    public static final drm0 U0 = new drm0((byte) 21);
    public static final drm0 V0 = new drm0((byte) 22);
    public static final drm0 W0 = new drm0((byte) 23);
    public static final drm0 X0 = new drm0((byte) 24);
    public static final drm0 Y0 = new drm0((byte) 25);
    public static final drm0 Z0 = new drm0((byte) 26);
    public static final drm0 a1 = new drm0((byte) 27);
    public static final drm0 b1 = new drm0((byte) 28);
    public static final drm0 c1 = new drm0((byte) 29);

    public drm0(Set set) {
        this.a = (byte) 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
    }

    public static boolean a(aod aodVar) {
        return ((Boolean) ((idd1) aodVar.c).getValue()).booleanValue();
    }

    public Object apply(Object obj) {
        mmr0 mmr0Var;
        int i2;
        List list;
        switch (this.a) {
            case 1:
                String message = ((Throwable) obj).getMessage();
                return new eeh(2, message != null ? cy30.g("com.spotify.music.extra.ERROR", message) : null);
            case 2:
                return new g8o0((Throwable) obj, (bk8) null);
            case 3:
                List<qfd> list2 = (List) obj;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (qfd qfdVar : list2) {
                    boolean z = qfdVar.b;
                    String str = qfdVar.a;
                    if (z || (i2 = qfdVar.c) == 4) {
                        mmr0Var = new mmr0(str, hd2.a);
                    } else {
                        boolean z2 = i2 == 3;
                        rh7 rh7Var = qfdVar.d;
                        mmr0Var = new mmr0(str, new gd2(rh7Var != null ? rh7Var.a : 0, z2));
                    }
                    linkedHashMap.put(mmr0Var.a, mmr0Var.b);
                }
                return new tc2(linkedHashMap);
            case 4:
                return Boolean.valueOf(((Map) obj).values().contains(Boolean.TRUE));
            case 5:
            case 8:
            case 10:
            case 13:
            case 14:
            case 17:
            case 21:
            case 22:
            default:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 6:
                return Boolean.valueOf(((Map) obj).values().contains(Boolean.TRUE));
            case 7:
                List list3 = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rj60) it.next()).getUri());
                }
                return arrayList;
            case 9:
                EpisodeLimitResponse episodeLimitResponse = (EpisodeLimitResponse) obj;
                return episodeLimitResponse.n() ? hr61.a : new gr61(episodeLimitResponse.getLimit());
            case 11:
                BlockedlistResponse$RelationsUsernameResponse blockedlistResponse$RelationsUsernameResponse = (BlockedlistResponse$RelationsUsernameResponse) ((sy21) obj).b;
                return blockedlistResponse$RelationsUsernameResponse == null ? BlockedlistResponse$RelationsUsernameResponse.n() : blockedlistResponse$RelationsUsernameResponse;
            case 12:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                int i3 = ry21Var.a().c;
                m510 m510Var = ry21Var.i != null ? m510.c : (ry21Var.t == null || (System.currentTimeMillis() - ry21Var.Z) / 1000 > ((long) i3)) ? m510.a : m510.b;
                q310 q310Var = (q310) sy21Var.b;
                return (q310Var == null || (list = q310Var.a) == null) ? new l510(z6x.a, m510Var, (String) null) : new l510(list, m510Var, (String) null);
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionUnplayedResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.CollectionUnplayedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                return ((PlayerState) obj).track().i(wrh.b);
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                return new gb31(((th61) obj).a);
            case 20:
                return ((AlsoAvailableOfflineResponse) obj).n().o();
            case 23:
                return new bta1(((Integer) obj).intValue());
            case 24:
                n57.e("[Puffin] Error disabling wired filters: " + ((Throwable) obj));
                return CompletableEmpty.a;
            case 25:
                return Optional.of((Throwable) obj);
        }
    }

    public Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        md2 md2Var = (md2) obj5;
        return new n910(md2Var.b, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((bet) obj4).a, md2Var.a);
    }

    public boolean test(Object obj, Object obj2) {
        spq0 spq0Var = (spq0) obj;
        spq0 spq0Var2 = (spq0) obj2;
        ContextTrack contextTrack = (ContextTrack) spq0Var.h();
        String strUri = contextTrack != null ? contextTrack.uri() : null;
        ContextTrack contextTrack2 = (ContextTrack) spq0Var2.h();
        if (!u890.j(strUri, contextTrack2 != null ? contextTrack2.uri() : null)) {
            return false;
        }
        ContextTrack contextTrack3 = (ContextTrack) spq0Var.h();
        Boolean boolValueOf = contextTrack3 != null ? Boolean.valueOf(l4o1.U(contextTrack3)) : null;
        ContextTrack contextTrack4 = (ContextTrack) spq0Var2.h();
        return u890.j(boolValueOf, contextTrack4 != null ? Boolean.valueOf(l4o1.U(contextTrack4)) : null);
    }

    public /* synthetic */ drm0(byte b2) {
        this.a = b2;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return ((EsCodeRequired.CodeRequiredResendResult) obj).o();
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        String strO;
        boolean z = false;
        switch (this.a) {
            case 10:
                ub10 ub10Var = (ub10) obj;
                spq0 spq0Var = (spq0) obj2;
                ContextTrack contextTrack = (ContextTrack) spq0Var.h();
                if (contextTrack != null) {
                    strO = l4o1.o(contextTrack);
                    if (strO == null && (strO = l4o1.s(contextTrack)) == null) {
                        strO = "";
                    }
                } else {
                    strO = null;
                }
                return new wn9(ub10Var, strO != null ? strO : "", spq0Var.c());
            case 13:
                PlayerState playerState = (PlayerState) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                return (u890.j((String) playerState.track().i(bx8.f).e(""), (String) playerState2.track().i(bx8.g).e("")) && playerState.isPaused() == playerState2.isPaused()) ? playerState : playerState2;
            case 14:
                return ((Uri) obj2).toString();
            case 22:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (zBooleanValue && zBooleanValue2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                return new mmr0((pdm) obj, (PlayerState) obj2);
            default:
                wsc0 wsc0Var = (wsc0) obj;
                Boolean bool = (Boolean) obj2;
                boolean zJ = u890.j(wsc0Var.f.q.get("is_audiobook"), "true");
                List list = wsc0Var.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (u890.j(((zuc0) obj3).g.get("is_trailer"), "true")) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((zuc0) it.next()).c);
                }
                if (zJ && bool.booleanValue()) {
                    z = true;
                }
                return new j410(arrayList2, zJ, z);
        }
    }
}
