package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Empty;
import com.spotify.authentication.login5esperanto.EsCodeRequired;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsContextPlayerState;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Collections;
import java.util.Map;
import retrofit2.HttpException;
import spotify.autodownload.esperanto.proto.ShowStateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qz70 implements vmt, k10, Function, BiFunction, Predicate, Init, av30, Function3 {
    public final /* synthetic */ byte a;
    public static final qz70 b = new qz70(1);
    public static final qz70 c = new qz70(2);
    public static final qz70 d = new qz70(3);
    public static final qz70 e = new qz70(4);
    public static final qz70 f = new qz70(5);
    public static final qz70 g = new qz70(6);
    public static final qz70 h = new qz70(7);
    public static final qz70 i = new qz70(8);
    public static final qz70 t = new qz70(9);
    public static final qz70 X = new qz70(10);
    public static final qz70 Y = new qz70(11);
    public static final qz70 Z = new qz70(12);
    public static final qz70 N0 = new qz70(13);
    public static final qz70 O0 = new qz70(14);
    public static final qz70 P0 = new qz70(15);
    public static final qz70 Q0 = new qz70(16);
    public static final qz70 R0 = new qz70(17);
    public static final qz70 S0 = new qz70(18);
    public static final qz70 T0 = new qz70(19);
    public static final qz70 U0 = new qz70(20);
    public static final qz70 V0 = new qz70(21);
    public static final qz70 W0 = new qz70(22);
    public static final qz70 X0 = new qz70(23);
    public static final qz70 Y0 = new qz70(24);
    public static final qz70 Z0 = new qz70(25);
    public static final qz70 a1 = new qz70(27);
    public static final qz70 b1 = new qz70(28);
    public static final qz70 c1 = new qz70(29);

    public /* synthetic */ qz70(byte b2) {
        this.a = b2;
    }

    public static Drawable c(Context context, int i2, int i3, int i4) {
        float f2;
        if ((i4 & 4) != 0) {
            i3 = 5;
        }
        int i5 = (i4 & 8) == 0 ? 2130968769 : 0;
        Drawable drawable = context.getDrawable(i2);
        if (drawable == null) {
            hhg1.n("Icon drawable resource must be valid");
            return null;
        }
        if (i3 == 1) {
            f2 = 0.33f;
        } else if (i3 == 2) {
            f2 = 0.5f;
        } else if (i3 == 3) {
            f2 = 0.66f;
        } else if (i3 == 4) {
            f2 = 0.75f;
        } else {
            if (i3 != 5) {
                throw null;
            }
            f2 = 1.0f;
        }
        int iO = ago1.o(context, 2130968791, 0);
        int iO2 = ago1.o(context, i5, 0);
        drawable.setTint(iO);
        return new x10(drawable, f2, iO2, (byte) 2);
    }

    public Object a(wa71 wa71Var, llw0 llw0Var, jlw0 jlw0Var, Uri uri, onm onmVar) {
        String str;
        a6j0 a6j0VarG = wa71Var.g();
        if (uri == null) {
            uri = null;
            jlw0 jlw0Var2 = llw0Var instanceof jlw0 ? (jlw0) llw0Var : null;
            if (jlw0Var2 != null && (str = jlw0Var2.a) != null) {
                uri = Uri.parse(str);
            }
        }
        return new pz70(uri, a6j0VarG.a, a6j0VarG.d, a6j0VarG.e, a6j0VarG.f, a6j0VarG.b, a6j0VarG.c);
    }

    public Object apply(Object obj) {
        String strUri;
        switch (this.a) {
            case 2:
                HttpException httpException = (Throwable) obj;
                return httpException instanceof HttpException ? Single.just(new ln81(httpException.a)) : Single.error(httpException);
            case 3:
                return (ContextTrack) ((spq0) obj).b();
            case 4:
                return new e331(new m231(new Exception(l1d.m("Extension error: ", ((Throwable) obj).getMessage()))));
            case 5:
                return ((PlayerState) obj).track();
            case 6:
                String str = (String) ((ContextTrack) ((PlayerState) obj).track().b()).metadata().get("save_track.uri");
                return str == null ? "" : str;
            case 7:
            case 8:
            case 12:
            case 13:
            case 14:
            case 22:
            case 23:
            case 26:
            default:
                return new e331(new m231((Throwable) obj));
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return ShowStateResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.autodownload.esperanto.proto.ShowStateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                ag9 ag9Var = (ag9) obj;
                return new mj9(ag9Var.a, ag9Var.b);
            case 11:
                String str2 = ((yaa0) obj).a;
                return (str2 == null || str2.length() == 0) ? i5b.a : new h5b(str2);
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CollectionPlatformEsperantoContainsResponse.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 16:
                return poh.a;
            case 17:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return Empty.q(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 18:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return EsContextPlayerState.ContextPlayerState.Z(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsContextPlayerState.ContextPlayerState: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 19:
                btn btnVar = (btn) obj;
                boolean z = btnVar.f;
                ssn ssnVar = btnVar.g;
                return new v37(z, ssnVar.a, ssnVar.b, btnVar.h);
            case 20:
                return Collections.singletonList((String) obj);
            case 21:
                return (oyn) obj;
            case 24:
                n57.e("[Puffin] DisableProcessing failed: " + ((Throwable) obj));
                return Completable.j(o9n.a);
            case 25:
                return Boolean.valueOf(((BoolValue) obj).getValue());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                PlayerState playerState = (PlayerState) obj;
                return (!playerState.track().c() || (strUri = ((ContextTrack) playerState.track().b()).uri()) == null) ? "" : strUri;
            case 28:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
        }
    }

    public Object b(wa71 wa71Var, t0c t0cVar, bnt bntVar, Uri uri) {
        String str;
        a6j0 a6j0VarG = wa71Var.g();
        Uri uri2 = null;
        bnt bntVar2 = t0cVar instanceof bnt ? (bnt) t0cVar : null;
        if (bntVar2 != null && (str = bntVar2.e) != null) {
            uri2 = Uri.parse(str);
        }
        return new pz70(uri2, a6j0VarG.a, a6j0VarG.d, a6j0VarG.e, a6j0VarG.f, a6j0VarG.b, a6j0VarG.c);
    }

    public First e0(Object obj) {
        return First.b((eof) obj);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && (((Boolean) obj2).booleanValue() || !((Boolean) obj3).booleanValue()));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 8:
                return ((EsCodeRequired.CodeRequiredProceedResult) obj).o();
            case 12:
                return ((kow) obj) instanceof iow;
            case 13:
                return ((spq0) obj).c();
            default:
                return ((spq0) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj2;
        return new s87(((t87) obj).a, y7y0.t("has-podcasts-available", map), y7y0.x(map));
    }
}
