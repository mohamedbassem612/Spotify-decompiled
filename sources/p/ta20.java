package p;

import com.spotify.authentication.login5esperanto.EsInteractionRequired;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.offline_esperanto.proto.EsOffline$LicenseStatusResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ta20 implements Function, BiFunction, Init, Predicate, Producer, s2i1 {
    public final /* synthetic */ byte a;
    public static final ta20 b = new ta20(0);
    public static final ta20 c = new ta20(1);
    public static final ta20 d = new ta20(2);
    public static final ta20 e = new ta20(3);
    public static final ta20 f = new ta20(4);
    public static final ta20 g = new ta20(5);
    public static final ta20 h = new ta20(6);
    public static final ta20 i = new ta20(7);
    public static final ta20 t = new ta20(8);
    public static final ta20 X = new ta20(9);
    public static final ta20 Y = new ta20(10);
    public static final ta20 Z = new ta20(11);
    public static final ta20 N0 = new ta20(12);
    public static final ta20 O0 = new ta20(13);
    public static final ta20 P0 = new ta20(14);
    public static final ta20 Q0 = new ta20(15);
    public static final ta20 R0 = new ta20(16);
    public static final ta20 S0 = new ta20(17);
    public static final ta20 T0 = new ta20(18);
    public static final ta20 U0 = new ta20(19);
    public static final ta20 V0 = new ta20(20);
    public static final ta20 W0 = new ta20(21);
    public static final ta20 X0 = new ta20(22);
    public static final ta20 Y0 = new ta20(23);
    public static final ta20 Z0 = new ta20(24);
    public static final ta20 a1 = new ta20(25);
    public static final ta20 b1 = new ta20(26);
    public static final ta20 c1 = new ta20(27);
    public static final ta20 d1 = new ta20(28);
    public static final ta20 e1 = new ta20(29);

    public /* synthetic */ ta20(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public Object apply(Object obj) {
        uov0 uov0Var = null;
        switch (this.a) {
            case 0:
                poa1 poa1Var = (poa1) obj;
                List list = poa1Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r8s0) it.next()).a);
                }
                return new i5w0(new p3c1(poa1Var.c, poa1Var.d, poa1Var.a, arrayList));
            case 1:
                return ((ne81) obj).a;
            case 2:
                return Boolean.valueOf(((lfd) obj).b);
            case 3:
                return ((r0e0) obj).e;
            case 4:
                return b7x.a;
            case 5:
                return Boolean.valueOf(y7y0.t("is-pigeon", (Map) obj));
            case 6:
            case 7:
            case 9:
            case 11:
            case 14:
            case 15:
            case 22:
            default:
                for (Object obj2 : (Object[]) obj) {
                    uov0 uov0Var2 = obj2 instanceof uov0 ? (uov0) obj2 : null;
                    if (uov0Var2 != null) {
                        uov0Var = uov0Var2;
                        if (uov0Var != null) {
                            return uov0Var;
                        }
                        return tov0.a;
                    }
                }
                if (uov0Var != null) {
                    return uov0Var;
                }
                return tov0.a;
            case 8:
                return new etc0(((yoc0) obj).a);
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsInteractionRequired.InteractionRequiredProceedResult.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.authentication.login5esperanto.EsInteractionRequired.InteractionRequiredProceedResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 12:
                return sjg0.a;
            case 13:
                return imi0.b;
            case 16:
                return (ContextTrack) ((PlayerState) obj).track().b();
            case 17:
                return ((th61) obj).a;
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline$LicenseStatusResponse.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.LicenseStatusResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                return CompletableEmpty.a;
            case 20:
                return Observable.fromIterable(((z310) obj).a);
            case 21:
                faw fawVar = (faw) obj;
                return Observable.just(fawVar).delay(fawVar.a.toMillis(), TimeUnit.MILLISECONDS).map(sa20.W0);
            case 23:
                return ((mtl) obj).a;
            case 24:
                PlayerState playerState = (PlayerState) obj;
                boolean zIsPaused = playerState.isPaused();
                boolean zIsPlaying = playerState.isPlaying();
                String strContextUri = playerState.contextUri();
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                return new g300(contextTrack != null ? contextTrack.uri() : null, zIsPaused, strContextUri, zIsPlaying);
        }
    }

    public First e0(Object obj) {
        return First.b((eeb0) obj);
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3 = (String) linkedHashMap.get("playlist_id");
        if (str3 == null || str3.length() != 22) {
            return null;
        }
        int length = str3.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str3.charAt(i2);
            if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                return null;
            }
        }
        String str4 = (String) linkedHashMap.get("row_id");
        if (str4 == null) {
            return null;
        }
        return new jyu0(str3, str4, xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 9:
                return ((th61) obj).b;
            case 11:
                return ((PlayerState) obj).track().c();
            case 22:
                Iterator<T> it = ((RecentlyPlayedResponse) obj).getItems().iterator();
                while (it.hasNext()) {
                    if (((RecentlyPlayedEntity) it.next()).getDerivedData().i) {
                        return false;
                    }
                }
                return true;
            case 25:
                return ((spq0) obj).c();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((y3i1) obj) instanceof w3i1;
            default:
                return ((b021) obj) instanceof zz11;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 6:
                return (Double) obj;
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue());
        }
    }
}
