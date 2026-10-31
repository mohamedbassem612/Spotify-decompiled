package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse;
import com.spotify.voiceassistants.errorhandler.NotAuthenticatedException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function9;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableError;
import j$.util.Base64;
import java.util.Collections;
import java.util.List;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s9x0 implements Function, yu30, BiFunction, Init, Function9, com.spotify.mobius.functions.BiFunction, uta1, Predicate, vq8 {
    public final /* synthetic */ byte a;
    public static final s9x0 b = new s9x0(0);
    public static final s9x0 c = new s9x0(1);
    public static final s9x0 d = new s9x0(2);
    public static final s9x0 e = new s9x0(3);
    public static final s9x0 f = new s9x0(4);
    public static final s9x0 g = new s9x0(5);
    public static final s9x0 h = new s9x0(6);
    public static final s9x0 i = new s9x0(7);
    public static final s9x0 t = new s9x0(8);
    public static final s9x0 X = new s9x0(9);
    public static final s9x0 Y = new s9x0(10);
    public static final s9x0 Z = new s9x0(11);
    public static final s9x0 N0 = new s9x0(12);
    public static final s9x0 O0 = new s9x0(13);
    public static final s9x0 P0 = new s9x0(14);
    public static final s9x0 Q0 = new s9x0(15);
    public static final s9x0 R0 = new s9x0(16);
    public static final s9x0 S0 = new s9x0(18);
    public static final s9x0 T0 = new s9x0(19);
    public static final s9x0 U0 = new s9x0(20);
    public static final s9x0 V0 = new s9x0(21);
    public static final s9x0 W0 = new s9x0(22);
    public static final s9x0 X0 = new s9x0(23);
    public static final s9x0 Y0 = new s9x0(24);
    public static final s9x0 Z0 = new s9x0(25);
    public static final s9x0 a1 = new s9x0(26);

    public /* synthetic */ s9x0(byte b2) {
        this.a = b2;
    }

    public static ApiException b(Status status) {
        return rzn1.r(status);
    }

    public static First g(rqe1 rqe1Var) {
        mqe1 mqe1Var = rqe1Var.b;
        iqe1 iqe1Var = iqe1.a;
        if (u890.j(mqe1Var, iqe1Var)) {
            return First.c(new rqe1(2131963214, iqe1Var, ert0.a, "listeningstats"), f46.S0(new pdp1[]{lre1.c, new kre1(0)}));
        }
        if (mqe1Var instanceof kqe1) {
            return First.c(rqe1Var, Collections.singleton(new kre1(((kqe1) mqe1Var).b)));
        }
        if (mqe1Var instanceof hqe1) {
            return First.b(rqe1Var);
        }
        if (mqe1Var instanceof gqe1) {
            return First.b(rqe1Var);
        }
        if (mqe1Var instanceof jqe1) {
            return First.b(rqe1Var);
        }
        if (mqe1Var instanceof lqe1) {
            return First.b(rqe1Var);
        }
        eg.o();
        return null;
    }

    public spq0 a(Uri uri, br8 br8Var) {
        return j5.a;
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                return Observable.empty();
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
                n57.e("Failed to queue track: " + ((beh) obj).a);
                return rih1.a;
            case 3:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return GetRecentlyPlayedTracksResponse.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 4:
            case 5:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return YourLibraryContainsResponse.q(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryContainsResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 6:
                return ((on3) obj).d;
            case 7:
                return new nb41(false, (String) null, 0.0f);
            case 8:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isBuffering() && playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return new yp61((ir61) obj);
            case 13:
                return new to91(Boolean.valueOf(((List) obj).contains(new ll81("plus"))));
            case 14:
                return s3a1.a;
            case 21:
                return ((ContextTrack) obj).uri();
            case 22:
                th61 th61Var = (th61) obj;
                boolean z2 = th61Var.b;
                if (z2 && !th61Var.d) {
                    return Flowable.I(th61Var.a);
                }
                if (z2 || th61Var.c) {
                    int i2 = Flowable.a;
                    return FlowableEmpty.b;
                }
                NotAuthenticatedException notAuthenticatedException = new NotAuthenticatedException();
                int i3 = Flowable.a;
                return new FlowableError(Functions.h(notAuthenticatedException));
        }
    }

    public Bundle c(String str, String str2, int i2, String str3) {
        Logger.d("Google V1 doesn't support token response type", new Object[0]);
        throw new UnsupportedOperationException("Google Home V1 doesn't support token response");
    }

    public Intent d(nhz nhzVar, String str, String str2) {
        Intent intent = new Intent();
        int i2 = nhzVar.b;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    throw null;
                }
            }
        }
        intent.putExtra("ERROR_TYPE", i3);
        intent.putExtra("ERROR_CODE", nhzVar.ordinal());
        intent.putExtra("ERROR_DESCRIPTION", str);
        return intent;
    }

    public Bundle e(String str, String str2, String str3) {
        Bundle bundleF = pzm.f("AUTHORIZATION_CODE", str, "STATE", str2);
        bundleF.putString("REDIRECT_URI", str3);
        return bundleF;
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 5:
                return First.b((ia21) obj);
            default:
                zci1 zci1Var = (zci1) obj;
                return First.b(zci1.a(zci1Var, null, null, iqo1.p(zci1Var), false, null, null, false, 1007));
        }
    }

    public Intent f(Bundle bundle) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtra("AUTHORIZATION_CODE", bundle.getString("AUTHORIZATION_CODE"));
        }
        return intent;
    }

    public spq0 h(Uri uri, nhz nhzVar, String str) {
        return j5.a;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 16:
                return ((y3i1) obj) instanceof w3i1;
            default:
                return !((uv00) obj).f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return (ContextTrack) obj;
            case 11:
                return qq81.a((qq81) obj, (oq81) null, (nxw) null, (v6s0) null, (th2) obj2, (id40) null, (wjn0) null, false, (String) null, (bk8) null, 0, (String) null, 16375);
            case 18:
                return new mmr0((PlayerState) obj, (Boolean) obj2);
            default:
                kcg1 kcg1Var = (kcg1) obj2;
                kcg1Var.getClass();
                return new gag1(kcg1Var, ((Long) obj).longValue());
        }
    }
}
