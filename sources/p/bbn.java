package p;

import android.net.Uri;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse;
import com.spotify.device_location_service.proto.DeviceLocationServiceOuterClass;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import retrofit2.HttpException;
import spotify.autodownload.esperanto.proto.SetShowStateResponse;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse;
import spotify.collection_cosmos.proto.StatusOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bbn implements Predicate, Function, BiPredicate, Init, g4u, BiFunction, bx81 {
    public final /* synthetic */ byte a;
    public static final bbn b = new bbn(1);
    public static final bbn c = new bbn(2);
    public static final bbn d = new bbn(3);
    public static final bbn e = new bbn(4);
    public static final bbn f = new bbn(5);
    public static final bbn g = new bbn(6);
    public static final bbn h = new bbn(7);
    public static final bbn i = new bbn(8);
    public static final bbn t = new bbn(9);
    public static final bbn X = new bbn(10);
    public static final bbn Y = new bbn(11);
    public static final bbn Z = new bbn(12);
    public static final bbn N0 = new bbn(13);
    public static final bbn O0 = new bbn(14);
    public static final bbn P0 = new bbn(15);
    public static final bbn Q0 = new bbn(16);
    public static final bbn R0 = new bbn(17);
    public static final bbn S0 = new bbn(18);
    public static final bbn T0 = new bbn(19);
    public static final bbn U0 = new bbn(20);
    public static final bbn V0 = new bbn(21);
    public static final bbn W0 = new bbn(22);
    public static final bbn X0 = new bbn(23);
    public static final bbn Y0 = new bbn(24);
    public static final bbn Z0 = new bbn(25);
    public static final bbn a1 = new bbn(26);
    public static final bbn b1 = new bbn(27);
    public static final bbn c1 = new bbn(28);
    public static final bbn d1 = new bbn(29);

    public /* synthetic */ bbn(byte b2) {
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    public Object apply(Object obj) throws HttpException {
        switch (this.a) {
            case 2:
                return new c1f0((th8) obj);
            case 3:
            case 6:
            case 7:
            case 12:
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
            case 22:
            case 23:
            default:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 4:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof g) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 5:
                return Boolean.valueOf(((ck4) obj).e);
            case 8:
                return ((Uri) obj).toString();
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return SetShowStateResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.autodownload.esperanto.proto.SetShowStateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                wf9 wf9Var = (wf9) obj;
                return new ij9(wf9Var.a, wf9Var.b, v1p1.q(wf9Var.c, "Read"), wf9Var.d);
            case 11:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                if (ry21Var.Q0) {
                    dri1 dri1Var = (dri1) sy21Var.b;
                    if (dri1Var != null) {
                        return dri1Var;
                    }
                    throw new HttpException(sy21Var);
                }
                int i2 = ry21Var.d;
                if (i2 == 409) {
                    return hgs0.INSTANCE;
                }
                if (i2 == 410) {
                    return jr00.INSTANCE;
                }
                throw new HttpException(sy21Var);
            case 13:
                return qvm.a;
            case 14:
                return crn0.a;
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CollectionPlatformContextItemsResponse.n(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformContextItemsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 16:
                return new noh((ace0) obj);
            case 17:
                return Double.valueOf(((k0u) ((spq0) obj).b()).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 20:
                Logger.e((Throwable) obj, "AccessoryOnboarding: Error during BT permissions flow", new Object[0]);
                return lcr.a;
            case 21:
                beh behVar = (feh) obj;
                if (!(behVar instanceof beh)) {
                    return az1.a;
                }
                String str = behVar.a;
                int iHashCode = str.hashCode();
                if (iHashCode != -286746318) {
                    if (iHashCode == 1620696383 && str.equals("mft_disallow")) {
                        return zy1.a;
                    }
                } else if (str.equals("not_playing_context")) {
                    return zy1.b;
                }
                return zy1.f;
            case 24:
                return ((DeviceLocationServiceOuterClass.DeviceLocationResponse) obj).toByteArray();
            case 25:
                StatusOuterClass.Status statusN = ((CollectionAddRemoveItemsResponse) obj).n();
                return statusN.o() == 200 ? new oy21(rih1.a) : new ly21(new iy21(statusN.q()));
        }
    }

    public First e0(Object obj) {
        MessageResponseToken messageResponseToken = ((i0c) obj).a;
        return First.b(new i0c(messageResponseToken, p3d1.i(messageResponseToken), false));
    }

    public boolean test(Object obj, Object obj2) {
        switch (this.a) {
            case 3:
                PlayerState playerState = (PlayerState) obj;
                PlayerState playerState2 = (PlayerState) obj2;
                return u890.j(playerState.track().b(), playerState2.track().b()) && u890.j(playerState.restrictions(), playerState2.restrictions()) && u890.j(playerState.adBreakContext().h(), playerState2.adBreakContext().h());
            default:
                return !((ftn) obj).getClass().equals(((ftn) obj2).getClass());
        }
    }

    public void lock() {
    }

    public void unlock() {
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((th61) obj).b;
            case 6:
                return !((uv00) obj).f;
            case 23:
                return !((l0l) obj).isActive();
            case 27:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            default:
                return !((uv00) obj).f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        Object next;
        c481 c481Var = (c481) obj;
        PlayerState playerState = (PlayerState) obj2;
        g281 g281Var = c481Var.a;
        String strContextUri = playerState.contextUri();
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        String str = null;
        String strUri = contextTrack != null ? contextTrack.uri() : null;
        String strA0 = contextTrack != null ? l4o1.a0(contextTrack, "album_uri") : null;
        boolean z = false;
        int i2 = 1;
        boolean z2 = playerState.isPlaying() && !playerState.isPaused();
        String str2 = g281Var.a;
        String str3 = g281Var.n;
        if ((u890.j(strContextUri, str2) || u890.j(strA0, g281Var.a)) && z2 && !u890.j(strUri, str3)) {
            z = true;
        }
        int iC = l1d.C(g281Var.A);
        if (iC != 2) {
            i2 = 3;
            if (iC == 3) {
                i2 = 2;
            }
        }
        if (z) {
            return new rnb(strUri, i2);
        }
        String str4 = g281Var.r;
        if (ihc1.y0(str4)) {
            Iterator it = c481Var.b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((i1z) next).a.equals(str3));
            i1z i1zVar = (i1z) next;
            if (i1zVar != null) {
                str = i1zVar.a;
            }
        } else {
            str = str4;
        }
        return new qnb(str, i2);
    }
}
