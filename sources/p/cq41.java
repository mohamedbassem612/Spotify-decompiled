package p;

import android.net.Uri;
import com.spotify.authentication.login5esperanto.EsInteractionRequired;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.esperanto.proto.EsSessionResponse$SessionResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import spotify.autodownload.esperanto.proto.ShowStateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cq41 implements vmt, Predicate, Function, BiFunction, Function3, dwn {
    public final /* synthetic */ byte a;
    public static final cq41 b = new cq41(1);
    public static final cq41 c = new cq41(2);
    public static final cq41 d = new cq41(3);
    public static final cq41 e = new cq41(4);
    public static final cq41 f = new cq41(5);
    public static final cq41 g = new cq41(6);
    public static final cq41 h = new cq41(7);
    public static final cq41 i = new cq41(8);
    public static final cq41 t = new cq41(9);
    public static final cq41 X = new cq41(10);
    public static final cq41 Y = new cq41(11);
    public static final cq41 Z = new cq41(12);
    public static final cq41 N0 = new cq41(13);
    public static final cq41 O0 = new cq41(14);
    public static final cq41 P0 = new cq41(15);
    public static final cq41 Q0 = new cq41(16);
    public static final cq41 R0 = new cq41(17);
    public static final cq41 S0 = new cq41(18);
    public static final cq41 T0 = new cq41(19);
    public static final cq41 U0 = new cq41(20);
    public static final cq41 V0 = new cq41(21);
    public static final cq41 W0 = new cq41(22);
    public static final cq41 X0 = new cq41(23);
    public static final cq41 Y0 = new cq41(24);
    public static final cq41 Z0 = new cq41(25);
    public static final cq41 a1 = new cq41(26);
    public static final cq41 b1 = new cq41(27);
    public static final cq41 c1 = new cq41(28);
    public static final cq41 d1 = new cq41(29);

    public /* synthetic */ cq41(byte b2) {
        this.a = b2;
    }

    public Object a(wa71 wa71Var, llw0 llw0Var, jlw0 jlw0Var, Uri uri, onm onmVar) {
        return b(wa71Var, llw0Var != null ? lcc.F(llw0Var) : null, jlw0Var != null ? new bnt(jlw0Var.a) : null, uri);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                fxe0 fxe0Var = (fxe0) obj;
                return ((Single) fxe0Var.c.d.invoke(fxe0Var.a, fxe0Var.b)).map(zhm0.b).onErrorReturn(drm0.c);
            case 3:
                return new tc2(b7x.a);
            case 4:
            case 6:
            case 7:
            case 8:
            case 11:
            case 12:
            case 16:
            case 19:
            case 22:
            default:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
            case 5:
                return Boolean.valueOf(((zpd) obj) == zpd.e);
            case 9:
                return Boolean.valueOf(((ShowStateResponse) obj).getEnabled());
            case 10:
                return ((PlayerState) obj).track();
            case 13:
                mdz mdzVar = (mdz) o7h.s0((List) obj);
                String str = mdzVar != null ? mdzVar.s : null;
                return str == null ? "" : str;
            case 14:
                return ((Boolean) obj).booleanValue() ? new hrn0(szf.class, aqr0.a, a6w0.a) : crn0.a;
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return Status.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.Status: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 17:
                return ((tal) obj).equals(sal.a) ? new ybl(fcl.b) : new ybl(fcl.a);
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsSessionResponse$SessionResponse.n(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsSessionResponse.SessionResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 20:
                return ((Observable) obj).delay(5L, TimeUnit.SECONDS);
            case 21:
                List<zqt> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (zqt zqtVar : list) {
                    arrayList.add(new mmr0(zqtVar.a, Long.valueOf(zqtVar.b)));
                }
                return sqg0.T(arrayList);
            case 23:
                return ((PlayerState) obj).track();
            case 24:
                return (List) obj;
            case 25:
                return Boolean.valueOf(((String) obj).equals("1"));
            case 26:
                return Boolean.valueOf(l4o1.J((ContextTrack) obj));
        }
    }

    public Object b(wa71 wa71Var, t0c t0cVar, bnt bntVar, Uri uri) {
        Uri uri2;
        String str;
        vkc0 vkc0VarB = wa71.b(wa71Var);
        if (uri != null) {
            uri2 = uri;
        } else {
            bnt bntVar2 = t0cVar instanceof bnt ? (bnt) t0cVar : null;
            if (bntVar2 == null || (str = bntVar2.e) == null) {
                uri2 = null;
            } else {
                uri = Uri.parse(str);
                uri2 = uri;
            }
        }
        return new pz70(uri2, vkc0VarB.a, vkc0VarB.b, vkc0VarB.d, vkc0VarB.c, null, null);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new j910(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                int i2 = ((jfl1) obj).a;
                return i2 == 2 || i2 == 1;
            case 7:
                return !((uv00) obj).f;
            case 8:
                return ((EsInteractionRequired.InteractionRequiredProceedResult) obj).o();
            case 11:
                return !((uv00) obj).f;
            case 12:
                return ((kow) obj) instanceof iow;
            case 16:
                return ((spq0) obj).c();
            case 22:
                return !((Boolean) obj).booleanValue();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            default:
                return !((uv00) obj).f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new w810(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }
}
