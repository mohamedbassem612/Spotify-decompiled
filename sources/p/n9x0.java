package p;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.Display;
import android.view.View;
import com.google.protobuf.Empty;
import com.spotify.ad.detection.esperanto.proto.AdDetectionOuterClass$DetectResponse;
import com.spotify.appauthorization.sso.internalauth.AuthorizationActivityInternalProxy;
import com.spotify.gander.v2.proto.UpdateNotificationStateResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class n9x0 implements Function, Predicate, wo01, BiPredicate, BiFunction, com.spotify.mobius.functions.Function, Function3, uta1 {
    public final /* synthetic */ byte a;
    public static final n9x0 b = new n9x0((byte) 0);
    public static final n9x0 c = new n9x0((byte) 1);
    public static final n9x0 d = new n9x0((byte) 2);
    public static final n9x0 e = new n9x0((byte) 3);
    public static final n9x0 f = new n9x0((byte) 4);
    public static final n9x0 g = new n9x0((byte) 5);
    public static final n9x0 h = new n9x0((byte) 7);
    public static final n9x0 i = new n9x0((byte) 8);
    public static final n9x0 t = new n9x0((byte) 9);
    public static final n9x0 X = new n9x0((byte) 10);
    public static final n9x0 Y = new n9x0((byte) 11);
    public static final n9x0 Z = new n9x0((byte) 12);
    public static final n9x0 N0 = new n9x0((byte) 13);
    public static final n9x0 O0 = new n9x0((byte) 14);
    public static final n9x0 P0 = new n9x0((byte) 15);
    public static final n9x0 Q0 = new n9x0((byte) 16);
    public static final t8e1 R0 = new t8e1((byte) 3);
    public static final n9x0 S0 = new n9x0((byte) 18);
    public static final n9x0 T0 = new n9x0((byte) 19);
    public static final n9x0 U0 = new n9x0((byte) 20);
    public static final n9x0 V0 = new n9x0((byte) 21);
    public static final n9x0 W0 = new n9x0((byte) 22);
    public static final n9x0 X0 = new n9x0((byte) 23);
    public static final n9x0 Y0 = new n9x0((byte) 24);
    public static final n9x0 Z0 = new n9x0((byte) 25);
    public static final n9x0 a1 = new n9x0((byte) 26);

    public n9x0(rn0 rn0Var) {
        this.a = (byte) 27;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    public static final void a(View view) {
        float refreshRate;
        if (ty4.h == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            ty4.h = (long) (1.0E9f / refreshRate);
        }
    }

    public static void b(Intent intent, wq8 wq8Var) {
        intent.putExtra("CLIENT_ID", wq8Var.a);
        intent.putExtra("CLIENT_IDENTITY", (Parcelable) wq8Var.d);
        intent.putExtra("REDIRECT_URI", wq8Var.c);
        String str = wq8Var.i;
        if (str != null) {
            intent.putExtra("UTM_SOURCE", str);
        }
        String str2 = wq8Var.j;
        if (str2 != null) {
            intent.putExtra("UTM_MEDIUM", str2);
        }
        String str3 = wq8Var.k;
        if (str3 != null) {
            intent.putExtra("UTM_CAMPAIGN", str3);
        }
        intent.putExtra("RESPONSE_TYPE", td6.r(wq8Var.b).toLowerCase(Locale.ENGLISH));
        intent.putExtra("SCOPES", (String[]) wq8Var.f.toArray(new String[0]));
        String str4 = wq8Var.e;
        if (str4 != null) {
            intent.putExtra("STATE", str4);
        }
        String str5 = wq8Var.l;
        if (str5 != null) {
            intent.putExtra("associated_content", str5);
        }
    }

    public static Intent c(Context context, wq8 wq8Var) {
        Intent intentAddCategory = new Intent(context, (Class<?>) AuthorizationActivityInternalProxy.class).setAction("com.spotify.appauthorization.sso.action.ACTIVITY").setPackage(context.getPackageName()).addCategory("android.intent.category.DEFAULT");
        intentAddCategory.addFlags(268435456);
        intentAddCategory.putExtra("VERSION", 1);
        b(intentAddCategory, wq8Var);
        return intentAddCategory;
    }

    public static boolean d(tjs0 tjs0Var) {
        if (tjs0Var.equals(tjs0.a) || tjs0Var.equals(tjs0.c)) {
            return false;
        }
        if (tjs0Var.equals(tjs0.b) || tjs0Var.equals(tjs0.d)) {
            return true;
        }
        eg.o();
        return false;
    }

    public static boolean e(pe peVar, tjs0 tjs0Var) {
        return pwo1.v(peVar, tjs0Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00d5 A[PHI: r12
      0x00d5: PHI (r12v20 int) = (r12v19 int), (r12v21 int), (r12v22 int) binds: [B:13:0x00c8, B:17:0x00ce, B:20:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    public Object apply(Object obj) {
        int i2;
        switch (this.a) {
            case 0:
                return new y9x0((j8x0) obj);
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 4:
                return Boolean.valueOf(l4o1.W((ContextTrack) obj));
            case 7:
                return new mb41(false);
            case 10:
                return Boolean.valueOf(l4o1.J((ContextTrack) obj));
            case 11:
                return ((kp81) obj).a;
            case 13:
                return new lo91((List) obj);
            case 14:
                return new f3a1(k1u.v((Throwable) obj));
            case 18:
                return gk3.a;
            case 20:
                return Boolean.valueOf(((UpdateNotificationStateResponse) obj).n());
            case 24:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return YourLibraryResponse.s(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            default:
                AdDetectionOuterClass$DetectResponse adDetectionOuterClass$DetectResponse = (AdDetectionOuterClass$DetectResponse) obj;
                h290<AdDetectionOuterClass$DetectResponse.Range> h290VarN = adDetectionOuterClass$DetectResponse.n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (AdDetectionOuterClass$DetectResponse.Range range : h290VarN) {
                    arrayList.add(new en0(range.t(), range.p(), range.n(), range.s(), range.o(), rn0.d(range.q()), new dn0(range.r().n())));
                }
                h290<AdDetectionOuterClass$DetectResponse.Range> h290VarO = adDetectionOuterClass$DetectResponse.o();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
                for (AdDetectionOuterClass$DetectResponse.Range range2 : h290VarO) {
                    arrayList2.add(new en0(range2.t(), range2.p(), range2.n(), range2.s(), range2.o(), rn0.d(range2.q()), new dn0(range2.r().n())));
                }
                int iS = adDetectionOuterClass$DetectResponse.s();
                int iQ = adDetectionOuterClass$DetectResponse.q();
                int iT = adDetectionOuterClass$DetectResponse.t();
                int iD = rn0.d(adDetectionOuterClass$DetectResponse.p());
                int iOrdinal = adDetectionOuterClass$DetectResponse.r().ordinal();
                int i3 = 2;
                if (iOrdinal != 1) {
                    i2 = 3;
                    if (iOrdinal != 2) {
                        i3 = 4;
                        if (iOrdinal == 3) {
                            i2 = i3;
                        } else if (iOrdinal != 4) {
                            i2 = 1;
                        } else {
                            i3 = 5;
                            i2 = i3;
                        }
                    }
                } else {
                    i2 = i3;
                }
                return new fn0(arrayList, arrayList2, iS, iQ, iT, iD, i2);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new yvg1((String) obj, (Restrictions) obj2, (fvf1) obj3);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return ((PlayerState) obj).track().c();
            case 8:
                return !((Boolean) ((mmr0) obj).b).booleanValue();
            case 16:
                return ((spq0) obj).c();
            case 19:
                return !((uv00) obj).f;
            default:
                return ((PlayerState) obj).playbackQuality().c();
        }
    }

    public /* synthetic */ n9x0(byte b2) {
        this.a = b2;
    }

    public boolean test(Object obj, Object obj2) {
        yvg1 yvg1Var = (yvg1) obj;
        yvg1 yvg1Var2 = (yvg1) obj2;
        return u890.j((String) yvg1Var.c, (String) yvg1Var2.c) && u890.j((String) yvg1Var.b, (String) yvg1Var2.b);
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 9:
                return new cze1(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            case 21:
                return new mmr0((Boolean) obj, (twj1) obj2);
            default:
                oeg1 oeg1Var = (oeg1) obj;
                return new icg1(oeg1Var.a, oeg1Var.b, (lwz0) obj2);
        }
    }
}
