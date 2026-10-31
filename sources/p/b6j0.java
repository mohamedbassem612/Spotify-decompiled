package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.h;
import com.spotify.authentication.login5esperanto.EsCodeRequired;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Arrays;
import java.util.Collections;
import spotify.autodownload.esperanto.proto.EnabledShowsCountResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b6j0 implements vmt, k20, Function, au11, Predicate, BiFunction, Init, g4u, av30 {
    public final /* synthetic */ byte a;
    public static final b6j0 b = new b6j0(1);
    public static final b6j0 c = new b6j0(2);
    public static final b6j0 d = new b6j0(4);
    public static final b6j0 e = new b6j0(5);
    public static final b6j0 f = new b6j0(6);
    public static final b6j0 g = new b6j0(7);
    public static final b6j0 h = new b6j0(8);
    public static final b6j0 i = new b6j0(9);
    public static final b6j0 t = new b6j0(10);
    public static final b6j0 X = new b6j0(11);
    public static final b6j0 Y = new b6j0(12);
    public static final b6j0 Z = new b6j0(13);
    public static final b6j0 N0 = new b6j0(14);
    public static final b6j0 O0 = new b6j0(15);
    public static final b6j0 P0 = new b6j0(16);
    public static final b6j0 Q0 = new b6j0(17);
    public static final b6j0 R0 = new b6j0(18);
    public static final b6j0 S0 = new b6j0(19);
    public static final b6j0 T0 = new b6j0(20);
    public static final b6j0 U0 = new b6j0(21);
    public static final b6j0 V0 = new b6j0(22);
    public static final b6j0 W0 = new b6j0(23);
    public static final b6j0 X0 = new b6j0(24);
    public static final b6j0 Y0 = new b6j0(25);
    public static final b6j0 Z0 = new b6j0(26);
    public static final b6j0 a1 = new b6j0(27);
    public static final b6j0 b1 = new b6j0(28);
    public static final b6j0 c1 = new b6j0(29);

    public /* synthetic */ b6j0(byte b2) {
        this.a = b2;
    }

    public static Bundle d(we2 we2Var, Intent intent) {
        return mno1.h(new mmr0[]{new mmr0("age_assurance_type", we2Var), new mmr0("on_age_assurance_complete_intent", intent)});
    }

    public Object a(wa71 wa71Var, llw0 llw0Var, jlw0 jlw0Var, Uri uri, onm onmVar) {
        if (llw0Var != null) {
            lcc.F(llw0Var);
        }
        return wa71Var.g();
    }

    public Object apply(Object obj) {
        String strUri;
        switch (this.a) {
            case 2:
                return new g8o0((Throwable) obj, (bk8) null);
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 14:
            case 19:
            case 22:
            case 26:
            default:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 7:
                return Boolean.valueOf(((th61) obj).h);
            case 9:
                return Integer.valueOf(((EnabledShowsCountResponse) obj).n());
            case 10:
                return new nj9((ve9) obj);
            case 11:
                return Boolean.valueOf(yto.j((String) obj));
            case 12:
                return ((kow) obj).b;
            case 13:
                return (h) ((spq0) obj).b();
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionPlatformEsperantoItemsResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                njh njhVar = (njh) obj;
                return new ooh(njhVar.a, njhVar.b);
            case 17:
                return new nf7(((Boolean) obj).booleanValue());
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 20:
                return ((uh80) obj).l;
            case 21:
                return (oyn) obj;
            case 23:
                return (l0l) ((spq0) obj).b();
            case 24:
                n57.e("[Puffin] LeaveCoreProcessingEnvironment failed: " + ((Throwable) obj));
                return Completable.j(q9n.a);
            case 25:
                Throwable th = (Throwable) obj;
                return th instanceof NullTransportException ? Single.just(Boolean.FALSE) : Single.error(th);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                PlayerState playerState = (PlayerState) obj;
                if (!playerState.track().c() || (strUri = ((ContextTrack) playerState.track().b()).uri()) == null) {
                    strUri = "";
                }
                return new x1z(strUri, playerState.isPlaying() && !playerState.isPaused());
        }
    }

    public Object b(wa71 wa71Var, t0c t0cVar, bnt bntVar, Uri uri) {
        return wa71Var.g();
    }

    public void c(float f2, long j, long j2, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        long j3;
        long j4;
        long jJ0;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1426450771);
        if ((i2 & 6) == 0) {
            i3 = i2 | (b0kVar3.d(f2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | (b0kVar3.f(j) ? 32 : 16) | 128 | (b0kVar3.g(this) ? 2048 : 1024);
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            b0kVar3.d0();
            if ((i2 & 1) == 0 || b0kVar3.E()) {
                uwr uwrVar = cbx.a;
                j4 = cbx.a(b0kVar3).b.b;
            } else {
                b0kVar3.b0();
                j4 = j2;
            }
            b0kVar3.s();
            ytw0 ytw0Var = jfv.b;
            ngv ngvVar = ngv.e;
            long jL0 = fdg1.l0(j, ngvVar);
            double d2 = f2;
            int iS = jch0.S(d2);
            if (iS == d2) {
                jJ0 = jfv.r(iS, jL0);
            } else {
                ngv ngvVarM = jfv.m(jL0);
                jJ0 = fdg1.j0(jfv.s(jL0, ngvVarM) * d2, ngvVarM);
            }
            long jU = jfv.u(jJ0, ngvVar);
            if (jU < 0) {
                jU = 0;
            }
            long j5 = jU / 3600;
            long j6 = (jU % 3600) / 60;
            long j7 = jU % 60;
            String str = j5 > 0 ? String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7)}, 3)) : String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j7)}, 2));
            uwr uwrVar2 = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, (qim0) null, cbx.d(b0kVar3).j, j4, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
            j3 = j4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            j3 = j2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new axx(this, f2, j, j3, i2);
        }
    }

    public First e0(Object obj) {
        quf qufVar = (quf) obj;
        return First.c(qufVar, Collections.singleton(new fuf(qufVar.a.getUsername())));
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return gu11.a;
        }
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return ((spq0) obj).c();
            case 8:
                return ((EsCodeRequired.CodeRequiredResendResult) obj).o();
            case 22:
                return !((Boolean) obj).booleanValue();
            default:
                return !((uv00) obj).f;
        }
    }

    public boolean test(Object obj, Object obj2) {
        return !((v37) obj).equals((v37) obj2);
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((feh) obj, (PlayerError) obj2);
    }
}
