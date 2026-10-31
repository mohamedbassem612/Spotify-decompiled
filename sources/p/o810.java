package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mdata.esperanto.proto.ObserveResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o810 implements Function, l0i, np80, BiFunction, av30, msf0, Function3, Init, s2i1, Predicate {
    public final /* synthetic */ byte a;
    public static final o810 b = new o810(0);
    public static final o810 c = new o810(1);
    public static final o810 d = new o810(2);
    public static final o810 e = new o810(3);
    public static final o810 f = new o810(4);
    public static final o810 g = new o810(5);
    public static final o810 h = new o810(6);
    public static final o810 i = new o810(7);
    public static final o810 t = new o810(8);
    public static final o810 X = new o810(9);
    public static final o810 Y = new o810(10);
    public static final o810 Z = new o810(11);
    public static final o810 N0 = new o810(12);
    public static final o810 O0 = new o810(13);
    public static final o810 P0 = new o810(14);
    public static final o810 Q0 = new o810(15);
    public static final o810 R0 = new o810(16);
    public static final o810 S0 = new o810(17);
    public static final o810 T0 = new o810(18);
    public static final o810 U0 = new o810(19);
    public static final o810 V0 = new o810(21);
    public static final o810 W0 = new o810(22);
    public static final o810 X0 = new o810(23);
    public static final o810 Y0 = new o810(24);
    public static final o810 Z0 = new o810(25);
    public static final o810 a1 = new o810(26);
    public static final o810 b1 = new o810(27);
    public static final o810 c1 = new o810(28);
    public static final o810 d1 = new o810(29);

    public /* synthetic */ o810(byte b2) {
        this.a = b2;
    }

    public static Next a(s1m1 s1m1Var, q1m1 q1m1Var) {
        return !p2o1.u(s1m1Var, q1m1Var.a, 7) ? Next.j() : Next.i(s1m1.a(p2o1.l(s1m1Var), 2, 0, (Long) null, (i5u0) null, (wa0) null, (e58) null, (String) null, 0, (String) null, false, (String) null, false, (List) null, 0, (List) null, (Integer) null, false, 0, 8388605), f46.S0(new g0m1[]{new a0m1(2), p2o1.x(s1m1Var, 11, new veo(0, (Integer) null, (Integer) null, 0, 0, 31))}));
    }

    public Object apply(Object obj) {
        String str;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                yvg1 yvg1Var = (yvg1) obj;
                return new f2d0(((Number) yvg1Var.a).intValue(), ((Boolean) yvg1Var.c).booleanValue(), ((Number) yvg1Var.b).intValue() != 0);
            case 1:
                hma1 hma1VarEdit = ((dma1) obj).edit();
                hma1VarEdit.a(vk20.e, true);
                hma1VarEdit.g();
                return rih1.a;
            case 2:
            case 5:
            case 8:
            case grn1.d /* 12 */:
            case 15:
            case 19:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            case 21:
            case 22:
            case 23:
            default:
                CollectionAddRemoveItemsResponse collectionAddRemoveItemsResponse = (CollectionAddRemoveItemsResponse) obj;
                int iO = collectionAddRemoveItemsResponse.n().o();
                return (200 > iO || iO >= 300) ? Completable.j(new Exception(collectionAddRemoveItemsResponse.n().q())) : CompletableEmpty.a;
            case 3:
                return new g100((String) obj);
            case 4:
                Map map = (Map) obj;
                if (y7y0.t("is-highlights-and-stats", map)) {
                    return Optional.of(gp20.b);
                }
                return y7y0.t("is-seadragon", map) ? Optional.of(gp20.a) : Optional.empty();
            case 6:
                return new b4a0((re9) obj);
            case 7:
                return j941.a;
            case 9:
                return Boolean.valueOf(((fqd0) obj).e);
            case 10:
                PlayOrigin playOrigin = bge0.d;
                return Boolean.valueOf(!((PlayerState) obj).restrictions().disallowTogglingShuffleReasons().isEmpty());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                l0l l0lVar = (l0l) ((spq0) obj).b();
                return new caf0(new xa0(l0lVar.getName(), l0lVar.getType(), l0lVar.l(), l0lVar.p() == 2, l0lVar.z(), l0lVar.D().a));
            case 13:
                return (String) ((spq0) obj).b();
            case 14:
                byte[] bArr = (byte[]) obj;
                try {
                    return ObserveResponse.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.mdata.esperanto.proto.ObserveResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 16:
                return Boolean.valueOf(!ihc1.y0((String) obj));
            case 17:
                return Boolean.valueOf(y7y0.z((Map) obj));
            case 18:
                w19 w19Var = (w19) obj;
                return new ksx0(w19Var.b, w19Var.e.longValue(), w19Var.f.longValue(), w19Var.g.longValue(), w19Var.a());
            case 24:
                return Boolean.valueOf(((PlayerState) obj).isPlaying());
            case 25:
                return ((PlayerState) obj).adBreakContext();
            case 26:
                kby kbyVar = ((wsc0) obj).f;
                String str2 = kbyVar.b;
                String strA = kbyVar.d.a(1);
                x4i1 x4i1Var = kbyVar.e;
                if (x4i1Var == null || (str = x4i1Var.c) == null) {
                    str = "";
                }
                return new rmy(str2, strA, 5, str);
        }
    }

    public First e0(Object obj) {
        return First.b((thm0) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case 22:
                return new qss0(str2, str, xkg0Var);
            default:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 != null && gho1.n(str4) && (str3 = (String) linkedHashMap.get("track_id")) != null && gho1.n(str3)) {
                    return new ryu0(str4, str3, xkg0Var, str2, str);
                }
                return null;
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new z310(o7h.N0((List) obj3, o7h.N0((List) obj2, (List) obj)), (f410) null, (m510) null, (String) null);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 23:
                return ((g331) obj) instanceof z231;
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        x7c0 x7c0Var = (x7c0) obj2;
        return sqg0.P((Map) obj, new mmr0(x7c0Var.a, x7c0Var.b));
    }
}
