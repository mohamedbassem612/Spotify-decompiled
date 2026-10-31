package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse;
import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsDeleteSession$DeleteSessionResponse;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.Collections;
import java.util.Map;
import spotify.autodownload.esperanto.proto.DecoratedFollowedShowsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ios implements vmt, Init, Function, Predicate, g4u, av30, BiFunction, s0z {
    public final /* synthetic */ byte a;
    public static final ios b = new ios(1);
    public static final ios c = new ios(2);
    public static final ios d = new ios(3);
    public static final ios e = new ios(4);
    public static final ios f = new ios(5);
    public static final ios g = new ios(6);
    public static final ios h = new ios(7);
    public static final ios i = new ios(8);
    public static final ios t = new ios(9);
    public static final ios X = new ios(10);
    public static final ios Y = new ios(11);
    public static final ios Z = new ios(12);
    public static final ios N0 = new ios(13);
    public static final ios O0 = new ios(14);
    public static final ios P0 = new ios(15);
    public static final ios Q0 = new ios(16);
    public static final ios R0 = new ios(17);
    public static final ios S0 = new ios(18);
    public static final ios T0 = new ios(19);
    public static final ios U0 = new ios(20);
    public static final ios V0 = new ios(21);
    public static final ios W0 = new ios(22);
    public static final ios X0 = new ios(23);
    public static final ios Y0 = new ios(24);
    public static final ios Z0 = new ios(25);
    public static final ios a1 = new ios(26);
    public static final ios b1 = new ios(27);
    public static final ios c1 = new ios(28);
    public static final ios d1 = new ios(29);

    public /* synthetic */ ios(byte b2) {
        this.a = b2;
    }

    public Object a(wa71 wa71Var, llw0 llw0Var, jlw0 jlw0Var, Uri uri, onm onmVar) {
        if (llw0Var != null) {
            lcc.F(llw0Var);
        }
        return wa71.b(wa71Var);
    }

    public Object apply(Object obj) {
        Object objInvoke;
        switch (this.a) {
            case 2:
                return new mxe0((th8) obj);
            case 3:
            case 7:
            case 14:
            case 19:
            default:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 4:
                return (hi90) obj;
            case 5:
                return Boolean.valueOf(((fk4) obj).a);
            case 6:
                return Boolean.valueOf(((nc6) obj) instanceof mc6);
            case 8:
                atq0 atq0Var = (atq0) obj;
                oc8 oc8Var = oc8.t;
                if (atq0Var instanceof zsq0) {
                    objInvoke = oc8Var.invoke(atq0Var);
                } else {
                    if (!(atq0Var instanceof xsq0)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = td8.a;
                }
                return (vd8) objInvoke;
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return DecoratedFollowedShowsResponse.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.autodownload.esperanto.proto.DecoratedFollowedShowsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 10:
                xf9 xf9Var = (xf9) obj;
                return new jj9(xf9Var.a, xf9Var.b, xf9Var.c);
            case 11:
                return new xc90(((wc90) obj).a);
            case 12:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch Bridge Tracks", new Object[0]);
                return b7x.a;
            case 13:
                return Boolean.valueOf(y7y0.t("offline", (Map) obj));
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CollectionPlatformEsperantoContainsResponse.q(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoContainsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 16:
                return koh.a;
            case 17:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return CommonMessages.StatusResponse.o(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.CommonMessages.StatusResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 18:
                byte[] bArr4 = (byte[]) obj;
                try {
                    return EsDeleteSession$DeleteSessionResponse.n(bArr4);
                } catch (Exception e5) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsDeleteSession.DeleteSessionResponse: '", Base64.getEncoder().encodeToString(bArr4), "' (Base64)"), e5);
                    return null;
                }
            case 20:
                Integer num = (Integer) obj;
                return new wb10(num.intValue(), t5p1.l(num.intValue()));
            case 21:
                return (oyn) obj;
            case 22:
                int iOrdinal = ((r560) obj).ordinal();
                if (iOrdinal == 0) {
                    return qul1.a;
                }
                if (iOrdinal == 1) {
                    return qul1.b;
                }
                eg.o();
                return null;
        }
    }

    public Object b(wa71 wa71Var, t0c t0cVar, bnt bntVar, Uri uri) {
        return wa71.b(wa71Var);
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 1:
                zu zuVar = (zu) obj;
                zuVar.getClass();
                return First.b(zuVar);
            case 7:
                return First.b((rb7) obj);
            default:
                ncf ncfVar = (ncf) obj;
                return First.c(ncfVar, Collections.singleton(new mye(new bif(ncfVar.a.a, ncfVar.Q0))));
        }
    }

    public Boolean g() {
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return ((PlayerState) obj).track().c();
            case 23:
                return !((l0l) obj).f();
            case 25:
                return ((goh0) obj) instanceof foh0;
            default:
                return !((uv00) obj).f;
        }
    }

    public boolean test(Object obj, Object obj2) {
        return !((Boolean) obj).equals((Boolean) obj2);
    }

    public Object apply(Object obj, Object obj2) {
        ContextTrack contextTrack;
        boolean z = true;
        switch (this.a) {
            case 24:
                Boolean bool = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() && !bool.booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(((Boolean) obj2).booleanValue() && playerState.isPlaying() && !playerState.isPaused() && (contextTrack = (ContextTrack) playerState.track().h()) != null && s3o1.v(contextTrack, false) && !Boolean.parseBoolean((String) contextTrack.metadata().get("pip_disallowed")));
        }
    }
}
