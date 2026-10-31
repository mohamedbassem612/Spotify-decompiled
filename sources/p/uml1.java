package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo;
import com.spotify.connectivity.esperanto.proto.ForceOfflineResponse;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import spotify.autodownload.esperanto.proto.ShowStateResponse;
import spotify.collection.esperanto.proto.CollectionAlbum;
import spotify.collection.esperanto.proto.CollectionGetArtistViewResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uml1 implements Predicate, Function, s2i1, nh7, Function3 {
    public final /* synthetic */ byte a;
    public static final uml1 b = new uml1(1);
    public static final uml1 c = new uml1(2);
    public static final uml1 d = new uml1(3);
    public static final uml1 e = new uml1(4);
    public static final uml1 f = new uml1(5);
    public static final uml1 g = new uml1(6);
    public static final uml1 h = new uml1(7);
    public static final uml1 i = new uml1(8);
    public static final uml1 t = new uml1(9);
    public static final uml1 X = new uml1(10);
    public static final uml1 Y = new uml1(11);
    public static final uml1 Z = new uml1(12);
    public static final uml1 N0 = new uml1(13);
    public static final uml1 O0 = new uml1(14);
    public static final uml1 P0 = new uml1(15);
    public static final uml1 Q0 = new uml1(16);
    public static final uml1 R0 = new uml1(17);
    public static final uml1 S0 = new uml1(18);
    public static final uml1 T0 = new uml1(19);
    public static final uml1 U0 = new uml1(20);
    public static final uml1 V0 = new uml1(21);
    public static final uml1 W0 = new uml1(22);
    public static final uml1 X0 = new uml1(23);
    public static final uml1 Y0 = new uml1(24);
    public static final uml1 Z0 = new uml1(25);
    public static final uml1 a1 = new uml1(26);
    public static final uml1 b1 = new uml1(27);
    public static final uml1 c1 = new uml1(28);
    public static final uml1 d1 = new uml1(29);

    public /* synthetic */ uml1(byte b2) {
        this.a = b2;
    }

    public synchronized Intent a(Context context, int i2) {
        Intent intent;
        try {
            if (i2 == 0) {
                throw new NullPointerException("WhatsApp application type must be defined.");
            }
            String strG = xvj1.g(i2);
            intent = new Intent();
            intent.setPackage(strG);
            intent.setAction("com.whatsapp.otp.OTP_REQUESTED");
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 67108864 : 0);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putParcelable("_ci_", activity);
            Package r4 = uml1.class.getPackage();
            String implementationVersion = r4 != null ? r4.getImplementationVersion() : null;
            if (implementationVersion == null) {
                implementationVersion = "1.0.0_not_from_manifest";
            }
            extras.putString("SDK_VERSION", implementationVersion);
            intent.putExtras(extras);
        } catch (Throwable th) {
            throw th;
        }
        return intent;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return new pi8((nl8) obj);
            case 3:
                return wgt0.a;
            case 4:
            case 7:
            case 11:
            case 13:
            case 19:
            case 22:
            case 23:
            case 25:
            case 27:
            default:
                oy21 oy21Var = (py21) obj;
                if (oy21Var instanceof ly21) {
                    bhn0.A(((ly21) oy21Var).a, "Failed to fetch show list: ");
                    return null;
                }
                if (oy21Var instanceof oy21) {
                    return (wsc0) oy21Var.a;
                }
                eg.o();
                return null;
            case 5:
                return Boolean.valueOf(y7y0.L((Map) obj));
            case 6:
                return new j910(false, false, false);
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsStoredUserInfo.NullableStoredUserInfo.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo.NullableStoredUserInfo: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 9:
                return Boolean.valueOf(((ShowStateResponse) obj).getEnabled());
            case 10:
                return sqg0.U(((PlayerState) obj).contextMetadata());
            case 12:
                return ((kow) obj).b;
            case 14:
                return crn0.a;
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return Status.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.Status: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 16:
                return (String) ((spq0) obj).b();
            case 17:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return ForceOfflineResponse.p(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.esperanto.proto.ForceOfflineResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 18:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 20:
                h290 h290VarO = ((CollectionGetArtistViewResponse) obj).n().o();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : h290VarO) {
                    if (u890.j(((CollectionAlbum) obj2).p().getOffline(), "yes")) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CollectionAlbum) it.next()).o().getLink());
                }
                return arrayList2;
            case 21:
                return new e331((yav) obj);
            case 24:
                z9i1 z9i1VarB = ((kai1) obj).b();
                return new me20(z9i1VarB.a, z9i1VarB.b, z9i1VarB.d, z9i1VarB.e, z9i1VarB.g, false, false);
            case 26:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                return new hvq0(zBooleanValue ? ivq0.c : ivq0.b, zBooleanValue);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 4:
                String str3 = (String) linkedHashMap.get("album_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new ah3(str3, str2, str, xkg0Var);
                }
                return null;
            default:
                return new vab(xkg0Var, str2, str);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((gbl) obj3).b && !((Boolean) obj2).booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((jfl1) obj).a == 2;
            case 13:
                return ((PlayerState) obj).track().c();
            case 22:
                return ((spq0) obj).c();
            case 23:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            default:
                wv00 wv00Var2 = (uv00) obj;
                return wv00Var2.c() || !wv00Var2.f;
        }
    }
}
