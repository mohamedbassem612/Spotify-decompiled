package p;

import com.spotify.accessory.statemanager.AccessoryStateManager;
import com.spotify.player.esperanto.proto.EsContextPlayerError;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import retrofit2.HttpException;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cxo1 implements Function, Predicate, s2i1, c0g, av30, BiFunction {
    public static cxo1 b;
    public final /* synthetic */ byte a;
    public static final cxo1 c = new cxo1(1);
    public static final cxo1 d = new cxo1(2);
    public static final cxo1 e = new cxo1(3);
    public static final cxo1 f = new cxo1(4);
    public static final cxo1 g = new cxo1(5);
    public static final cxo1 h = new cxo1(6);
    public static final cxo1 i = new cxo1(7);
    public static final cxo1 t = new cxo1(8);
    public static final cxo1 X = new cxo1(9);
    public static final cxo1 Y = new cxo1(10);
    public static final cxo1 Z = new cxo1(11);
    public static final cxo1 N0 = new cxo1(12);
    public static final cxo1 O0 = new cxo1(13);
    public static final cxo1 P0 = new cxo1(14);
    public static final cxo1 Q0 = new cxo1(15);
    public static final cxo1 R0 = new cxo1(16);
    public static final cxo1 S0 = new cxo1(18);
    public static final cxo1 T0 = new cxo1(19);
    public static final cxo1 U0 = new cxo1(20);
    public static final cxo1 V0 = new cxo1(21);
    public static final cxo1 W0 = new cxo1(22);
    public static final cxo1 X0 = new cxo1(23);
    public static final cxo1 Y0 = new cxo1(24);
    public static final cxo1 Z0 = new cxo1(25);
    public static final cxo1 a1 = new cxo1(26);
    public static final cxo1 b1 = new cxo1(27);
    public static final cxo1 c1 = new cxo1(28);
    public static final cxo1 d1 = new cxo1(29);

    public /* synthetic */ cxo1(byte b2) {
        this.a = b2;
    }

    public static e46 a(List list, zim0 zim0Var, tnw0 tnw0Var) {
        List listL1 = o7h.l1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listL1.iterator();
        while (it.hasNext()) {
            sgl sglVarB = b(it.next(), null);
            if (sglVarB != null) {
                arrayList.add(sglVarB);
            }
        }
        return zim0Var != null ? new q1h1(arrayList, zim0Var.e().r(tnw0Var)) : new e46(arrayList, new p5(tnw0Var, (byte) 13));
    }

    public static sgl b(Object obj, ajm0 ajm0Var) {
        if (obj instanceof Byte) {
            return new shc(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new wz71(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new zr80(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new r5f0(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new fne((Character) obj);
        }
        if (obj instanceof Float) {
            return new hpb(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new hpb(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new hpb((Boolean) obj);
        }
        if (obj instanceof String) {
            return new ghc1((String) obj);
        }
        if (obj instanceof byte[]) {
            return a(f46.L0((byte[]) obj), ajm0Var, tnw0.h);
        }
        boolean z = obj instanceof short[];
        z6x z6xVarSingletonList = z6x.a;
        int i2 = 0;
        if (z) {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length != 0) {
                if (length != 1) {
                    z6xVarSingletonList = new ArrayList(sArr.length);
                    int length2 = sArr.length;
                    while (i2 < length2) {
                        z6xVarSingletonList.add(Short.valueOf(sArr[i2]));
                        i2++;
                    }
                } else {
                    z6xVarSingletonList = Collections.singletonList(Short.valueOf(sArr[0]));
                }
            }
            return a(z6xVarSingletonList, ajm0Var, tnw0.i);
        }
        if (obj instanceof int[]) {
            return a(f46.O0((int[]) obj), ajm0Var, tnw0.t);
        }
        if (obj instanceof long[]) {
            return a(f46.P0((long[]) obj), ajm0Var, tnw0.Y);
        }
        if (!(obj instanceof char[])) {
            if (obj instanceof float[]) {
                return a(f46.N0((float[]) obj), ajm0Var, tnw0.X);
            }
            if (obj instanceof double[]) {
                return a(f46.M0((double[]) obj), ajm0Var, tnw0.Z);
            }
            if (obj instanceof boolean[]) {
                return a(f46.R0((boolean[]) obj), ajm0Var, tnw0.f);
            }
            if (obj == null) {
                return new fep0(null);
            }
            return null;
        }
        char[] cArr = (char[]) obj;
        int length3 = cArr.length;
        if (length3 != 0) {
            if (length3 != 1) {
                z6xVarSingletonList = new ArrayList(cArr.length);
                int length4 = cArr.length;
                while (i2 < length4) {
                    z6xVarSingletonList.add(Character.valueOf(cArr[i2]));
                    i2++;
                }
            } else {
                z6xVarSingletonList = Collections.singletonList(Character.valueOf(cArr[0]));
            }
        }
        return a(z6xVarSingletonList, ajm0Var, tnw0.g);
    }

    public static synchronized void c() {
        if (b == null) {
            b = new cxo1((byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public Object apply(Object obj) throws Throwable {
        rh7 rh7Var;
        String str;
        String strA0;
        ErrorType errorType;
        int i2 = 1;
        switch (this.a) {
            case 1:
                return ((PlayerState) obj).track();
            case 2:
                fwe0 fwe0Var = (gwe0) obj;
                if (fwe0Var instanceof fwe0) {
                    return fwe0Var.a;
                }
                if (fwe0Var.equals(ewe0.a) || fwe0Var.equals(ewe0.b) || fwe0Var.equals(ewe0.c)) {
                    eg.m("Failed to retrieve child credential");
                    return null;
                }
                eg.o();
                return null;
            case 3:
                qfd qfdVar = (qfd) o7h.s0((List) obj);
                return (qfdVar == null || qfdVar.b || qfdVar.c != 3 || (rh7Var = qfdVar.d) == null) ? new gb2(null, false) : new gb2(Integer.valueOf(rh7Var.a), true);
            case 4:
                iam iamVar = ((tv00) obj).b;
                iamVar.getClass();
                return iamVar;
            case 5:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
            case 22:
            case 25:
            default:
                ly21 ly21Var = (py21) obj;
                if (ly21Var instanceof ly21) {
                    return new beh(l1d.m("Playback failed: ", ly21Var.a.b()));
                }
                if (ly21Var instanceof oy21) {
                    return new ceh();
                }
                eg.o();
                return null;
            case 6:
                List list = (List) obj;
                String str2 = ((vy6) o7h.q0(list)).b;
                String str3 = ((vy6) o7h.q0(list)).c.b;
                if (str3 == null) {
                    str3 = "";
                }
                return new sm6(str2, str3, ((vy6) o7h.q0(list)).a);
            case 7:
                return Boolean.valueOf(((List) obj).size() > 1);
            case 8:
                return new kxe0((rm8) obj);
            case 9:
                return (o5e0) ((spq0) obj).b();
            case 10:
                return Boolean.valueOf(l4o1.J((ContextTrack) obj));
            case 12:
                return new q7c(((Boolean) obj).booleanValue());
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionGetUnplayedEpisodesResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 20:
                zsq0 zsq0Var = (atq0) obj;
                if (zsq0Var instanceof zsq0) {
                    return ((c481) zsq0Var.a).a;
                }
                if (zsq0Var instanceof xsq0) {
                    throw ((xsq0) zsq0Var).a;
                }
                eg.o();
                return null;
            case 21:
                e2z e2zVar = (e2z) obj;
                return new dxr(e2zVar.l, e2zVar.a, e2zVar.b, e2zVar.c);
            case 23:
                return ((gkf1) obj).b;
            case 24:
                return new cau(((Boolean) obj).booleanValue());
            case 26:
                sy21 sy21Var = (sy21) obj;
                if (!sy21Var.a.Q0) {
                    throw new HttpException(sy21Var);
                }
                r4c0 r4c0Var = (r4c0) sy21Var.b;
                if (r4c0Var != null && (str = r4c0Var.b) != null) {
                    return str;
                }
                eg.m("Response body is null.");
                return null;
            case 27:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                if (contextTrack == null || !l4o1.U(contextTrack) || (strA0 = l4o1.a0(contextTrack, "pointer.uri")) == null || !nhc1.Y(strA0, "spotify:podcast-chapter:", false)) {
                    i2 = (contextTrack == null || !l4o1.T(contextTrack)) ? 0 : 2;
                }
                return new d6z(i2);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                EsContextPlayerError.ContextPlayerError contextPlayerError = (EsContextPlayerError.ContextPlayerError) obj;
                switch (contextPlayerError.n().ordinal()) {
                    case 0:
                        errorType = ErrorType.SUCCESS;
                        break;
                    case 1:
                        errorType = ErrorType.PLAYBACK_STUCK;
                        break;
                    case 2:
                        errorType = ErrorType.PLAYBACK_ERROR;
                        break;
                    case 3:
                        errorType = ErrorType.LICENSE_CHANGE;
                        break;
                    case 4:
                        errorType = ErrorType.PLAY_RESTRICTED;
                        break;
                    case 5:
                        errorType = ErrorType.STOP_RESTRICTED;
                        break;
                    case 6:
                        errorType = ErrorType.UPDATE_RESTRICTED;
                        break;
                    case 7:
                        errorType = ErrorType.PAUSE_RESTRICTED;
                        break;
                    case 8:
                        errorType = ErrorType.RESUME_RESTRICTED;
                        break;
                    case 9:
                        errorType = ErrorType.SKIP_TO_PREV_RESTRICTED;
                        break;
                    case 10:
                        errorType = ErrorType.SKIP_TO_NEXT_RESTRICTED;
                        break;
                    case 11:
                        errorType = ErrorType.SKIP_TO_NON_EXISTENT_TRACK;
                        break;
                    case 12:
                        errorType = ErrorType.SEEK_TO_RESTRICTED;
                        break;
                    case 13:
                        errorType = ErrorType.TOGGLE_REPEAT_CONTEXT_RESTRICTED;
                        break;
                    case 14:
                        errorType = ErrorType.TOGGLE_REPEAT_TRACK_RESTRICTED;
                        break;
                    case 15:
                        errorType = ErrorType.SET_OPTIONS_RESTRICTED;
                        break;
                    case 16:
                        errorType = ErrorType.TOGGLE_SHUFFLE_RESTRICTED;
                        break;
                    case 17:
                        errorType = ErrorType.SET_QUEUE_RESTRICTED;
                        break;
                    case 18:
                        errorType = ErrorType.INTERRUPT_PLAYBACK_RESTRICTED;
                        break;
                    case 19:
                        errorType = ErrorType.ONE_TRACK_UNPLAYABLE;
                        break;
                    case 20:
                        errorType = ErrorType.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED;
                        break;
                    case 21:
                        errorType = ErrorType.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED;
                        break;
                    case 22:
                        errorType = ErrorType.SKIP_TO_NON_EXISTENT_TRACK_AUTO_STOPPED;
                        break;
                    case 23:
                        errorType = ErrorType.QUEUE_REVISION_MISMATCH;
                        break;
                    case 24:
                        errorType = ErrorType.VIDEO_PLAYBACK_ERROR;
                        break;
                    case 25:
                        errorType = ErrorType.VIDEO_GEORESTRICTED;
                        break;
                    case 26:
                        errorType = ErrorType.VIDEO_UNSUPPORTED_PLATFORM_VERSION;
                        break;
                    case 27:
                        errorType = ErrorType.VIDEO_UNSUPPORTED_CLIENT_VERSION;
                        break;
                    case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                        errorType = ErrorType.VIDEO_UNSUPPORTED_KEY_VERSION;
                        break;
                    case 29:
                        errorType = ErrorType.VIDEO_MANIFEST_DELETED;
                        break;
                    case 30:
                        errorType = ErrorType.VIDEO_COUNTRY_RESTRICTED;
                        break;
                    case 31:
                        errorType = ErrorType.VIDEO_UNAVAILABLE;
                        break;
                    case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        errorType = ErrorType.VIDEO_CATALOGUE_RESTRICTED;
                        break;
                    case 33:
                        errorType = ErrorType.INVALID;
                        break;
                    case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                        errorType = ErrorType.TIMEOUT;
                        break;
                    case 35:
                        errorType = ErrorType.PLAYBACK_REPORTING_ERROR;
                        break;
                    case 36:
                        errorType = ErrorType.UNKNOWN;
                        break;
                    case 37:
                        errorType = ErrorType.ADD_TO_QUEUE_RESTRICTED;
                        break;
                    case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                        errorType = ErrorType.PICK_AND_SHUFFLE_CAPPED;
                        break;
                    case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                        errorType = ErrorType.PICK_AND_SHUFFLE_CONNECT_RESTRICTED;
                        break;
                    case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                        errorType = ErrorType.CONTEXT_LOADING_FAILED;
                        break;
                    case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                        errorType = ErrorType.AUDIOBOOK_NOT_PLAYABLE;
                        break;
                    case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                    case 43:
                    case 48:
                    default:
                        errorType = ErrorType.UNKNOWN;
                        break;
                    case 44:
                        errorType = ErrorType.PLAYBACK_START_SLOW;
                        break;
                    case 45:
                        errorType = ErrorType.PLAYBACK_START_TIMEOUT;
                        break;
                    case 46:
                        errorType = ErrorType.PLAYBACK_STUCK_TIMEOUT;
                        break;
                    case 47:
                        errorType = ErrorType.PLAYBACK_CLIENT_VERSION_IS_SUNSETTED;
                        break;
                    case 49:
                        errorType = ErrorType.UNKNOWN;
                        break;
                }
                PlayerError.Builder builder = PlayerError.builder(errorType);
                String str4 = (String) contextPlayerError.getDataMap().get("track_uri");
                if (str4 != null) {
                    builder.getClass();
                    builder.trackUri(str4);
                }
                String str5 = (String) contextPlayerError.getDataMap().get("context_uri");
                if (str5 != null) {
                    builder.getClass();
                    builder.contextUri(str5);
                }
                String str6 = (String) contextPlayerError.getDataMap().get("view_uri");
                if (str6 != null) {
                    builder.getClass();
                    builder.viewUri(str6);
                }
                String str7 = (String) contextPlayerError.getDataMap().get("reasons");
                if (str7 == null) {
                    str7 = (String) contextPlayerError.getDataMap().get("playback_error");
                }
                if (str7 != null) {
                    builder.getClass();
                    builder.reasons(str7);
                }
                return builder.build();
        }
    }

    public mr20 e(boolean z) {
        return new huz(Boolean.valueOf(!z), (byte) 10);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new pab(xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        ii iiVarA;
        switch (this.a) {
            case 5:
                return ((spq0) obj).c();
            case 13:
                AccessoryStateManager.Event event = (AccessoryStateManager.Event) obj;
                qi accessory = event.getAccessory();
                return (((accessory == null || (iiVarA = accessory.a()) == null) ? 0 : iiVarA.b) == 2 && accessory.e != 5) || (event instanceof AccessoryStateManager.Event.NoAccessoryConnected);
            case 16:
                return ((Boolean) obj).booleanValue();
            case 19:
                return !((uv00) obj).f;
            default:
                return !((YourLibraryResponse) obj).q().r();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((kx7) obj, (Boolean) obj2);
    }
}
