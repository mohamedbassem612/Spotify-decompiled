package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.car.app.navigation.model.Maneuver;
import com.google.protobuf.Empty;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.download.esperanto.proto.EsDownload;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.prefs.esperanto.proto.EsPrefs;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u321 implements BiFunction, Function, s2i1, Predicate, xkb, Init {
    public static Boolean c;
    public final /* synthetic */ byte a;
    public static final u321 b = new u321(0);
    public static final u321 d = new u321(1);
    public static final u321 e = new u321(2);
    public static final u321 f = new u321(3);
    public static final u321 g = new u321(4);
    public static final u321 h = new u321(5);
    public static final u321 i = new u321(7);
    public static final u321 t = new u321(8);
    public static final u321 X = new u321(9);
    public static final u321 Y = new u321(10);
    public static final u321 Z = new u321(11);
    public static final u321 N0 = new u321(12);
    public static final u321 O0 = new u321(13);
    public static final u321 P0 = new u321(14);
    public static final u321 Q0 = new u321(15);
    public static final u321 R0 = new u321(16);
    public static final u321 S0 = new u321(17);
    public static final u321 T0 = new u321(18);
    public static final u321 U0 = new u321(20);
    public static final u321 V0 = new u321(21);
    public static final u321 W0 = new u321(22);
    public static final u321 X0 = new u321(23);
    public static final u321 Y0 = new u321(24);
    public static final u321 Z0 = new u321(25);
    public static final u321 a1 = new u321(26);
    public static final u321 b1 = new u321(27);
    public static final u321 c1 = new u321(28);
    public static final u321 d1 = new u321(29);

    public /* synthetic */ u321(byte b2) {
        this.a = b2;
    }

    public static boolean b(Context context) {
        return !ph5.I(context);
    }

    public static boolean c(lx4 lx4Var) {
        return lx4Var.a();
    }

    public Intent a(Context context) {
        if (!dhn.a.contains(this)) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    Intent intent = new Intent("ReceiverService");
                    intent.setPackage("com.facebook.katana");
                    if (packageManager.resolveService(intent, 0) != null && ag10.a(context, "com.facebook.katana")) {
                        return intent;
                    }
                    Intent intent2 = new Intent("ReceiverService");
                    intent2.setPackage("com.facebook.wakizashi");
                    if (packageManager.resolveService(intent2, 0) != null && ag10.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }

    public Object apply(Object obj) {
        String str;
        int i2;
        String str2;
        Long lD0;
        int i3;
        int i4 = 0;
        s1l s1lVar = null;
        switch (this.a) {
            case 3:
                mmr0 mmr0Var = (mmr0) obj;
                PlayerState playerState = (PlayerState) mmr0Var.a;
                b380 b380Var = (b380) mmr0Var.b;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                contextTrack.getClass();
                Restrictions restrictions = playerState.restrictions();
                b380Var.getClass();
                boolean z = Boolean.parseBoolean((String) contextTrack.metadata().get("is_connect_cta_enabled"));
                String str3 = (String) contextTrack.metadata().get("duration");
                long jLongValue = (str3 == null || (lD0 = nhc1.d0(10, str3)) == null) ? 0L : lD0.longValue();
                String str4 = (String) contextTrack.metadata().get("advertiser");
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = (String) contextTrack.metadata().get("image_small_url");
                String str6 = str5 == null ? "" : str5;
                String str7 = (z && (str = (String) contextTrack.metadata().get("click_url")) != null) ? str : "";
                String str8 = (String) contextTrack.metadata().get("ad_id");
                String str9 = str8 == null ? "" : str8;
                int iK = sap1.k(b380Var);
                int iC = l1d.C(sap1.k(b380Var));
                if (iC == 0) {
                    i2 = 2131961427;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i2 = 2131961428;
                }
                return new l62(jLongValue, str4, "", "", "", str6, "", str7, "", str9, "", iK, sap1.f(contextTrack, new x6d1(null, i2, true, null)), (z && (str2 = (String) contextTrack.metadata().get("buttonMessage")) != null) ? str2 : "", restrictions.disallowSeekingReasons().isEmpty() ? x031.a : w031.a, sap1.h(contextTrack), 1, AdsModeModel.Format.AUDIO_AD, l4o1.Q(contextTrack) ? AdsModeModel.Product.PODCAST : AdsModeModel.Product.MUSIC, false, pzs0.d, contextTrack.uri());
            case 4:
            case 6:
            case 7:
            case 10:
            case 12:
            case 13:
            case 14:
            case 19:
            case 24:
            default:
                return new nef0(((Boolean) obj).booleanValue());
            case 5:
                return Boolean.valueOf(((yj4) obj).a);
            case 8:
                return new y810(false);
            case 9:
                return (dma1) ((mmr0) obj).b;
            case 11:
                return Boolean.valueOf(y7y0.t("has-blend-access", (Map) obj));
            case 15:
                return new m1h((s2r0) obj);
            case 16:
                ry21 ry21Var = ((sy21) obj).a;
                if (ry21Var.Q0) {
                    return rih1.a;
                }
                eg.m(f4i1.c(ry21Var.d, "Failed to create comment - Status: "));
                return null;
            case 17:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 18:
                spq0 spq0Var = (spq0) obj;
                return Boolean.valueOf(spq0Var.c() ? ((l0l) spq0Var.b()).l() : true);
            case 20:
                return (x2u0) o7h.q0((List) obj);
            case 21:
                nnr nnrVar = (nnr) obj;
                nnrVar.getClass();
                int iD = hqq0.D(nnrVar);
                if (iD != 0) {
                    int iC2 = l1d.C(iD);
                    if (iC2 == 0) {
                        i3 = 5;
                    } else if (iC2 == 1) {
                        i3 = 4;
                    } else if (iC2 == 2) {
                        i3 = 6;
                    } else if (iC2 == 3) {
                        i3 = 2;
                    } else if (iC2 == 4) {
                        i3 = 3;
                    } else {
                        if (iC2 != 5) {
                            eg.o();
                            return null;
                        }
                        i3 = 1;
                    }
                    String strV = hqq0.V(nnrVar);
                    String strR = hqq0.R(nnrVar);
                    String strU = hqq0.U(nnrVar);
                    int iS = hqq0.S(nnrVar);
                    if (iS != 0) {
                        switch (l1d.C(iS)) {
                            case 0:
                                i4 = 7;
                                break;
                            case 1:
                                i4 = 2;
                                break;
                            case 2:
                                i4 = 3;
                                break;
                            case 3:
                                i4 = 4;
                                break;
                            case 4:
                                i4 = 5;
                                break;
                            case 5:
                                i4 = 6;
                                break;
                            case 6:
                                i4 = 1;
                                break;
                            default:
                                eg.o();
                                return null;
                        }
                    }
                    s1lVar = new s1l(i3, i4, strV, strR, strU);
                }
                return spq0.a(s1lVar);
            case 22:
                return Boolean.valueOf(l4o1.Y((ContextTrack) obj));
            case 23:
                return Boolean.valueOf(((l0l) obj).l());
            case 25:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsDownload.MediaManifestResponse.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.MediaManifestResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 26:
                return new wwz((SubmitCheckoutResponse) obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((th61) obj).a;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Boolean.valueOf(((EsPrefs.Value) obj).n());
        }
    }

    public int d(String str, List list, int i2) {
        if (dhn.a.contains(this)) {
            return 0;
        }
        try {
            Context contextA = wf10.a();
            Intent intentA = a(contextA);
            int i3 = 2;
            if (intentA == null) {
                return 2;
            }
            t321 t321Var = new t321();
            try {
                if (!contextA.bindService(intentA, t321Var, 1)) {
                    return 3;
                }
                try {
                    try {
                        t321Var.a.await(5L, TimeUnit.SECONDS);
                        IBinder iBinder = t321Var.b;
                        if (iBinder != null) {
                            yj70 yj70VarS = xj70.s(iBinder);
                            Bundle bundleA = s321.a(str, list, i2);
                            if (bundleA != null) {
                                ((wj70) yj70VarS).s(bundleA);
                                bundleA.toString();
                            }
                            i3 = 1;
                        }
                        contextA.unbindService(t321Var);
                        return i3;
                    } catch (InterruptedException unused) {
                        wf10 wf10Var = wf10.a;
                        contextA.unbindService(t321Var);
                        return 3;
                    }
                } catch (RemoteException unused2) {
                    wf10 wf10Var2 = wf10.a;
                    contextA.unbindService(t321Var);
                    return 3;
                }
            } catch (Throwable th) {
                contextA.unbindService(t321Var);
                wf10 wf10Var3 = wf10.a;
                throw th;
            }
        } catch (Throwable th2) {
            dhn.a(this, th2);
            return 0;
        }
    }

    public First e0(Object obj) {
        return First.b((bve) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 4:
                return new o43(xkg0Var, str2, str);
            default:
                String str3 = (String) linkedHashMap.get("artist_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    String str4 = (String) linkedHashMap.get("category");
                    if (str4 != null) {
                        return new oy6(str3, str4, str2, str, xkg0Var);
                    }
                }
                return null;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 10:
                return ((we9) obj).a != null;
            default:
                return ((Boolean) obj).booleanValue();
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                eww0 eww0Var = (eww0) obj;
                List<gzf> list = (List) obj2;
                ArrayList arrayList = new ArrayList();
                String str = eww0Var.b;
                String str2 = eww0Var.f;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new go(str, str2, (Integer) null));
                for (gzf gzfVar : list) {
                    String str3 = gzfVar.a;
                    String str4 = gzfVar.b;
                    String str5 = gzfVar.c;
                    boolean z = gzfVar.d;
                    arrayList.add(new fo(gzfVar.f, str3, str4, str5, gzfVar.e, z, gzfVar.g));
                }
                return arrayList;
            default:
                return new mmr0((String) obj, (Restrictions) obj2);
        }
    }
}
