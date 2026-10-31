package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateResult;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.esperanto.proto.EsContextTrack;
import com.spotify.player.esperanto.proto.EsProvidedTrack;
import com.spotify.player.esperanto.proto.EsRestrictions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class r6x0 implements Function, Predicate, Init, BiFunction, m2a1, av30, Function3 {
    public final /* synthetic */ byte a;
    public static final r6x0 b = new r6x0(0);
    public static final r6x0 c = new r6x0(1);
    public static final r6x0 d = new r6x0(2);
    public static final r6x0 e = new r6x0(3);
    public static final r6x0 f = new r6x0(4);
    public static final r6x0 g = new r6x0(5);
    public static final r6x0 h = new r6x0(6);
    public static final r6x0 i = new r6x0(7);
    public static final r6x0 t = new r6x0(8);
    public static final r6x0 X = new r6x0(9);
    public static final r6x0 Y = new r6x0(10);
    public static final r6x0 Z = new r6x0(11);
    public static final r6x0 N0 = new r6x0(12);
    public static final r6x0 O0 = new r6x0(13);
    public static final r6x0 P0 = new r6x0(14);
    public static final r6x0 Q0 = new r6x0(15);
    public static final r6x0 R0 = new r6x0(16);
    public static final r6x0 S0 = new r6x0(17);
    public static final r6x0 T0 = new r6x0(18);
    public static final r6x0 U0 = new r6x0(19);
    public static final r6x0 V0 = new r6x0(20);
    public static final r6x0 W0 = new r6x0(21);
    public static final r6x0 X0 = new r6x0(22);
    public static final r6x0 Y0 = new r6x0(23);
    public static final r6x0 Z0 = new r6x0(24);
    public static final r6x0 a1 = new r6x0(25);
    public static final r6x0 b1 = new r6x0(26);

    public /* synthetic */ r6x0(byte b2) {
        this.a = b2;
    }

    public static final wqk0 a(String str, spq0 spq0Var) {
        j5 i5w0Var;
        List list = r64.b;
        if (spq0Var.c()) {
            String str2 = (String) spq0Var.b();
            r6h1 r6h1Var = r6h1.c;
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-android-auto-content-list";
            x6h1VarI.f = "3.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.d = str2;
            y6h1 y6h1VarA = x6h1VarI.a();
            ArrayList arrayList = new ArrayList();
            i5w0Var = new i5w0(c13.m(arrayList, z6x.a, y6h1VarA, arrayList, (u8h1) null));
        } else {
            i5w0Var = j5.a;
        }
        return new wqk0(str, (r6h1) i5w0Var.e(r6h1.c), (byte) 1);
    }

    public static final boolean b(String str) {
        List list = r64.b;
        return "com.spotify.expanded-search-result".equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0222  */
    /* JADX WARN: Code duplicated, block: B:150:0x028c  */
    /* JADX WARN: Code duplicated, block: B:155:0x029c  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:173:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:184:0x030a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0353  */
    /* JADX WARN: Code duplicated, block: B:197:0x0363  */
    /* JADX WARN: Code duplicated, block: B:198:0x036c  */
    /* JADX WARN: Code duplicated, block: B:200:0x036f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0376  */
    /* JADX WARN: Code duplicated, block: B:234:0x0322 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0304 A[SYNTHETIC] */
    public Object apply(Object obj) {
        boolean z;
        EsContextPlayerState.ContextPlayerState contextPlayerState;
        EsRestrictions.Restrictions restrictionsN;
        EsRestrictions.ModeRestrictions modeRestrictions;
        EsRestrictions.RestrictionReasons restrictionReasons;
        boolean z2;
        EsRestrictions.Restrictions restrictionsN2;
        EsRestrictions.ModeRestrictions modeRestrictions2;
        EsRestrictions.RestrictionReasons restrictionReasons2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        EsProvidedTrack.ProvidedTrack providedTrackS;
        boolean z4;
        String str;
        Boolean boolValueOf;
        boolean zBooleanValue;
        Map mapQ;
        String str2;
        EsContextTrack.ContextTrack contextTrackO;
        Map metadataMap;
        List listQ;
        Map mapP;
        Map mapT0;
        List listQ2;
        Map mapP2;
        Map mapT1;
        List listQ3;
        Map mapP3;
        Map mapT2;
        Map mapP4;
        EsProvidedTrack.ProvidedTrack providedTrack;
        EsContextTrack.ContextTrack contextTrackO2;
        String uid;
        EsProvidedTrack.ProvidedTrack providedTrack2;
        EsContextTrack.ContextTrack contextTrackO3;
        String uri;
        EsContextTrack.ContextTrack contextTrackO4;
        String uid2;
        EsContextTrack.ContextTrack contextTrackO5;
        String uri2;
        switch (this.a) {
            case 0:
                return new a6x0((m3x0) obj);
            case 1:
                return crn0.a;
            case 2:
            case 5:
            case 6:
            case 8:
            case 14:
            case 15:
            case 20:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                int iOrdinal = ((EsAuthStorageResult.AuthStorageResult) obj).o().ordinal();
                if (iOrdinal == 0) {
                    return wh8.a;
                }
                if (iOrdinal != 1) {
                    return iOrdinal != 2 ? vh8.a : vh8.b;
                }
                return vh8.c;
            case 3:
                return o7h.d1((List) obj, 10);
            case 4:
                return pyd0.a;
            case 7:
                return new ib41(false);
            case 9:
                return ((th61) obj).a;
            case 10:
                return new q910(((Boolean) obj).booleanValue());
            case 11:
                return new yp81((j6s0) obj);
            case 12:
                return (String) ((spq0) obj).b();
            case 13:
                EsContextPlayerState.ContextPlayerState contextPlayerState2 = (EsContextPlayerState.ContextPlayerState) obj;
                String strS = contextPlayerState2.s();
                String str3 = "";
                String str4 = strS == null ? "" : strS;
                String strT = contextPlayerState2.t();
                String str5 = strT == null ? "" : strT;
                EsProvidedTrack.ProvidedTrack providedTrackS2 = contextPlayerState2.S();
                String str6 = (providedTrackS2 == null || (contextTrackO5 = providedTrackS2.o()) == null || (uri2 = contextTrackO5.getUri()) == null) ? "" : uri2;
                EsProvidedTrack.ProvidedTrack providedTrackS3 = contextPlayerState2.S();
                String str7 = (providedTrackS3 == null || (contextTrackO4 = providedTrackS3.o()) == null || (uid2 = contextTrackO4.getUid()) == null) ? "" : uid2;
                h290 h290VarC = contextPlayerState2.C();
                String str8 = (h290VarC == null || (providedTrack2 = (EsProvidedTrack.ProvidedTrack) o7h.s0(h290VarC)) == null || (contextTrackO3 = providedTrack2.o()) == null || (uri = contextTrackO3.getUri()) == null) ? "" : uri;
                h290 h290VarC2 = contextPlayerState2.C();
                String str9 = (h290VarC2 == null || (providedTrack = (EsProvidedTrack.ProvidedTrack) o7h.s0(h290VarC2)) == null || (contextTrackO2 = providedTrack.o()) == null || (uid = contextTrackO2.getUid()) == null) ? "" : uid;
                String sessionId = contextPlayerState2.getSessionId();
                String str10 = sessionId == null ? "" : sessionId;
                long timestamp = contextPlayerState2.getTimestamp();
                long jO = contextPlayerState2.u().o();
                boolean z5 = contextPlayerState2.z() && contextPlayerState2.S() != null;
                boolean zY = contextPlayerState2.y();
                boolean zT = contextPlayerState2.D().t();
                Map mapQ2 = contextPlayerState2.q();
                if (mapQ2 != null ? Boolean.parseBoolean((String) mapQ2.get("enhanced_context")) : false) {
                    z = true;
                } else {
                    EsContextPlayerOptions.ContextPlayerOptions contextPlayerOptionsD = contextPlayerState2.D();
                    if (u890.j((contextPlayerOptionsD == null || (mapP4 = contextPlayerOptionsD.p()) == null) ? null : (String) mapP4.get("context_enhancement"), "RECOMMENDATION")) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                EsContextPlayerOptions.ContextPlayerOptions contextPlayerOptionsD2 = contextPlayerState2.D();
                boolean zJ = contextPlayerOptionsD2 != null ? u890.j(contextPlayerOptionsD2.p().get("original_enhancement_mode"), "RECOMMENDATION") : false;
                EsRestrictions.Restrictions restrictionsN3 = contextPlayerState2.N();
                EsRestrictions.ModeRestrictions modeRestrictions3 = (restrictionsN3 == null || (mapT2 = restrictionsN3.t0()) == null) ? null : (EsRestrictions.ModeRestrictions) mapT2.get("context_enhancement");
                EsRestrictions.RestrictionReasons restrictionReasons3 = (modeRestrictions3 == null || (mapP3 = modeRestrictions3.p()) == null) ? null : (EsRestrictions.RestrictionReasons) mapP3.get("RECOMMENDATION");
                if (restrictionReasons3 != null && (listQ3 = restrictionReasons3.q()) != null) {
                    contextPlayerState = contextPlayerState2;
                    boolean z6 = listQ3.contains("jam_is_active");
                    restrictionsN = contextPlayerState.N();
                    if (restrictionsN != null || (mapT1 = restrictionsN.t0()) == null) {
                        modeRestrictions = null;
                    } else {
                        modeRestrictions = (EsRestrictions.ModeRestrictions) mapT1.get("context_enhancement");
                    }
                    if (modeRestrictions != null || (mapP2 = modeRestrictions.p()) == null) {
                        restrictionReasons = null;
                    } else {
                        restrictionReasons = (EsRestrictions.RestrictionReasons) mapP2.get("RECOMMENDATION");
                    }
                    if (restrictionReasons == null && (listQ2 = restrictionReasons.q()) != null && listQ2.contains("not_supported_by_content_type")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    restrictionsN2 = contextPlayerState.N();
                    if (restrictionsN2 != null || (mapT0 = restrictionsN2.t0()) == null) {
                        modeRestrictions2 = null;
                    } else {
                        modeRestrictions2 = (EsRestrictions.ModeRestrictions) mapT0.get("context_enhancement");
                    }
                    if (modeRestrictions2 != null || (mapP = modeRestrictions2.p()) == null) {
                        restrictionReasons2 = null;
                    } else {
                        restrictionReasons2 = (EsRestrictions.RestrictionReasons) mapP.get("RECOMMENDATION");
                    }
                    if (restrictionReasons2 == null && (listQ = restrictionReasons2.q()) != null && listQ.contains("filtered_context:isVideoContent")) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    List signalsList = contextPlayerState.getSignalsList();
                    Map mapV0 = contextPlayerState.N().v0();
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapV0.entrySet()) {
                        if (!((EsRestrictions.RestrictionReasons) entry.getValue()).q().isEmpty()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set setKeySet = linkedHashMap.keySet();
                    providedTrackS = contextPlayerState.S();
                    if (providedTrackS != null || (contextTrackO = providedTrackS.o()) == null || (metadataMap = contextTrackO.getMetadataMap()) == null) {
                        z4 = false;
                    } else {
                        z4 = Boolean.parseBoolean((String) metadataMap.get("is_advertisement"));
                    }
                    str = (String) contextPlayerState.q().get("is_context_loading");
                    if (str != null) {
                        boolValueOf = Boolean.valueOf(Boolean.parseBoolean(str));
                    } else {
                        boolValueOf = null;
                    }
                    if (boolValueOf != null) {
                        zBooleanValue = boolValueOf.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    mapQ = contextPlayerState.q();
                    if (mapQ != null && (str2 = (String) mapQ.get("loading.failed")) != null) {
                        str3 = str2;
                    }
                    return new jdu0(str4, str5, str6, str7, str8, str9, str10, timestamp, jO, z5, zY, zT, z, zJ, z6, z2, z3, signalsList, setKeySet, z4, zBooleanValue, str3);
                }
                contextPlayerState = contextPlayerState2;
                restrictionsN = contextPlayerState.N();
                if (restrictionsN != null) {
                    modeRestrictions = null;
                } else {
                    modeRestrictions = null;
                }
                if (modeRestrictions != null) {
                    restrictionReasons = null;
                } else {
                    restrictionReasons = null;
                }
                if (restrictionReasons == null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                restrictionsN2 = contextPlayerState.N();
                if (restrictionsN2 != null) {
                    modeRestrictions2 = null;
                } else {
                    modeRestrictions2 = null;
                }
                if (modeRestrictions2 != null) {
                    restrictionReasons2 = null;
                } else {
                    restrictionReasons2 = null;
                }
                if (restrictionReasons2 == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                List signalsList2 = contextPlayerState.getSignalsList();
                Map mapV1 = contextPlayerState.N().v0();
                linkedHashMap = new LinkedHashMap();
                while (r0.hasNext()) {
                    if (!((EsRestrictions.RestrictionReasons) entry.getValue()).q().isEmpty()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set setKeySet2 = linkedHashMap.keySet();
                providedTrackS = contextPlayerState.S();
                if (providedTrackS != null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                str = (String) contextPlayerState.q().get("is_context_loading");
                if (str != null) {
                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(str));
                } else {
                    boolValueOf = null;
                }
                if (boolValueOf != null) {
                    zBooleanValue = boolValueOf.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                mapQ = contextPlayerState.q();
                if (mapQ != null) {
                    str3 = str2;
                }
                return new jdu0(str4, str5, str6, str7, str8, str9, str10, timestamp, jO, z5, zY, zT, z, zJ, z6, z2, z3, signalsList2, setKeySet2, z4, zBooleanValue, str3);
            case 16:
                return new cbc1((o7c1) obj);
            case 17:
                return new mie1(lhe1.a, true);
            case 18:
                List listB = ((uv00) obj).b(lo7.class);
                ArrayList arrayList = new ArrayList();
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    lo7 lo7Var = ((tv00) it.next()).b;
                    if (lo7Var != null) {
                        arrayList.add(lo7Var);
                    }
                }
                lo7 lo7Var2 = (lo7) o7h.s0(arrayList);
                return lo7Var2 == null ? new lo7(z6x.a) : lo7Var2;
            case 19:
                return Boolean.valueOf(y7y0.F((Map) obj));
            case 21:
                return (zej1) obj;
            case 22:
                return (Float) yoi1.u((Float) obj, new jsg(0.0f, 1.0f));
            case 27:
                EsAuthenticateResult.AuthenticateResult authenticateResult = (EsAuthenticateResult.AuthenticateResult) obj;
                int iS = authenticateResult.s();
                int i2 = iS == 0 ? -1 : kx.a[l1d.C(iS)];
                if (i2 == 1) {
                    EsAuthenticateResult.AuthenticateSuccess authenticateSuccessU = authenticateResult.u();
                    return new ii8(new di8(authenticateSuccessU.getUsername(), authenticateSuccessU.r() ? new wd(authenticateSuccessU.o().r(), authenticateSuccessU.o().q(), new Date(TimeUnit.SECONDS.toMillis(authenticateSuccessU.o().p().q()))) : null, new of8(authenticateSuccessU.p().o().getUsername(), authenticateSuccessU.p().o().o().t())));
                }
                if (i2 == 2) {
                    return new gi8(new ug8(400, "Error fetching child auth blob"));
                }
                eg.m("connectivity login5 esperanto returned unexpected response. should never happen in production");
                return null;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 5:
                return First.b((k221) obj);
            case 6:
                ja31 ja31Var = (ka31) obj;
                if (ja31Var instanceof ja31) {
                    ja31 ja31Var2 = ja31Var;
                    return First.c(ja31Var, Collections.singleton(new s931(ja31Var2.f, ja31Var2.g)));
                }
                if (ja31Var instanceof ia31) {
                    return First.c(ja31Var, Collections.singleton(t931.a));
                }
                eg.o();
                return null;
            default:
                return First.b((hph1) obj);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new tvm1(((Boolean) obj).booleanValue(), ((Boolean) obj3).booleanValue() && ((Boolean) obj2).booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((Map) obj).isEmpty();
            case 15:
                return !((uv00) obj).f;
            default:
                return ((d141) obj) instanceof b141;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((spq0) obj, (fvf1) obj2);
    }
}
