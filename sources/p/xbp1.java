package p;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_esperanto.proto.CollectionUnplayedResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionArtist;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xbp1 implements Predicate, Init, Function, BiFunction, ut9, s2i1, t2n, k1q0, av30 {
    public static xbp1 b;
    public final /* synthetic */ byte a;
    public static final xbp1 c = new xbp1(1);
    public static final xbp1 d = new xbp1(2);
    public static final xbp1 e = new xbp1(3);
    public static final xbp1 f = new xbp1(4);
    public static final xbp1 g = new xbp1(5);
    public static final xbp1 h = new xbp1(6);
    public static final xbp1 i = new xbp1(7);
    public static final xbp1 t = new xbp1(8);
    public static final xbp1 X = new xbp1(9);
    public static final xbp1 Y = new xbp1(10);
    public static final xbp1 Z = new xbp1(11);
    public static final xbp1 N0 = new xbp1(12);
    public static final xbp1 O0 = new xbp1(13);
    public static final xbp1 P0 = new xbp1(14);
    public static final xbp1 Q0 = new xbp1(15);
    public static final xbp1 R0 = new xbp1(16);
    public static final xbp1 S0 = new xbp1(18);
    public static final xbp1 T0 = new xbp1(19);
    public static final xbp1 U0 = new xbp1(20);
    public static final xbp1 V0 = new xbp1(21);
    public static final xbp1 W0 = new xbp1(22);
    public static final xbp1 X0 = new xbp1(23);
    public static final xbp1 Y0 = new xbp1(24);
    public static final xbp1 Z0 = new xbp1(25);
    public static final xbp1 a1 = new xbp1(26);
    public static final xbp1 b1 = new xbp1(27);
    public static final xbp1 c1 = new xbp1(28);
    public static final xbp1 d1 = new xbp1(29);

    public /* synthetic */ xbp1(byte b2) {
        this.a = b2;
    }

    public static boolean a(cz4 cz4Var) {
        return cz4Var.a();
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                Logger.e((Throwable) obj, "Error resolving cover art URI", new Object[0]);
                return Single.just("");
            case 4:
                return Observable.just(vm3.a);
            case 5:
                return new odn((pbn) obj, true);
            case 6:
                CollectionArtist collectionArtist = (CollectionArtist) o7h.t0(0, ((CollectionDecorateResponse) obj).getArtistList());
                return collectionArtist == null ? CollectionArtist.s() : collectionArtist;
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 14:
            case 16:
            case 17:
            case 22:
            default:
                Set set = s4b1.f;
                String strZ = uic.e((String) obj).z();
                strZ.getClass();
                return strZ;
            case 9:
                return new sw8();
            case 13:
                return ((Boolean) obj).booleanValue() ? new nqd("car_debug") : new oqd("car_debug");
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionUnplayedResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.CollectionUnplayedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 19:
                return new e331(rih1.a);
            case 20:
                zhr zhrVar = (zhr) obj;
                wt8 wt8Var = zhrVar.a;
                if (wt8Var instanceof ut8) {
                    return new cr61(nik1.u2.a, true, false);
                }
                if (wt8Var instanceof tt8) {
                    return new cr61(nik1.u2.a, false, ((tt8) wt8Var).a && zhrVar.b);
                }
                if (wt8Var.equals(vt8.a)) {
                    return br61.a;
                }
                if (wt8Var.equals(vt8.b)) {
                    return ar61.a;
                }
                eg.o();
                return null;
            case 21:
                return new fh20((Map) obj);
            case 23:
                f0g1 f0g1Var = (f0g1) obj;
                return new mmr0(Long.valueOf(f0g1Var.b), Long.valueOf(f0g1Var.c));
            case 24:
                return new s9u(((Boolean) obj).booleanValue());
            case 25:
                return Boolean.valueOf(!(((l62) obj).P0 instanceof k860));
            case 26:
                n57.e("[Puffin] EnterProcessingEnvironment failed: " + ((Throwable) obj));
                return Completable.j(p9n.a);
            case 27:
                return gk3.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return m6p1.q((EsResponseWithReasons.ResponseWithReasons) obj);
        }
    }

    public First e0(Object obj) {
        return First.b((t71) obj);
    }

    public Object g(Object obj) {
        uz21 uz21Var = (uz21) obj;
        try {
            nac nacVar = new nac();
            uz21Var.d1().Z0(nacVar);
            return new tz21(uz21Var.e(), uz21Var.d(), nacVar);
        } finally {
            uz21Var.close();
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 11:
                return new qab(xkg0Var, str2, str);
            default:
                String str3 = (String) linkedHashMap.get("concept_id");
                if (str3 != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new e6k(str3, xkg0Var, str2, str);
                }
                return null;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((spq0) obj).c();
            case 7:
                return ((th61) obj).b;
            default:
                return ((spq0) obj).c();
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        int i2 = nk80VarI.b;
        int i3 = nk80VarI.d;
        view.setPadding(nk80VarI.a, i2, nk80VarI.c, i3);
        return hsl1.b;
    }

    public Object apply(Object obj, Object obj2) {
        return new m910(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }
}
