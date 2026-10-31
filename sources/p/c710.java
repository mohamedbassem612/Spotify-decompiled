package p;

import android.content.Intent;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c710 implements Function, jrn0, av30, BiPredicate, l0i, asy, Function4, Init, s2i1, Predicate, fmu0 {
    public final /* synthetic */ byte a;
    public static final c710 b = new c710(0);
    public static final c710 c = new c710(1);
    public static final c710 d = new c710(2);
    public static final c710 e = new c710(3);
    public static final c710 f = new c710(4);
    public static final c710 g = new c710(5);
    public static final c710 h = new c710(6);
    public static final c710 i = new c710(7);
    public static final c710 t = new c710(9);
    public static final c710 X = new c710(10);
    public static final c710 Y = new c710(11);
    public static final c710 Z = new c710(12);
    public static final c710 N0 = new c710(13);
    public static final c710 O0 = new c710(14);
    public static final c710 P0 = new c710(15);
    public static final c710 Q0 = new c710(16);
    public static final c710 R0 = new c710(17);
    public static final c710 S0 = new c710(18);
    public static final c710 T0 = new c710(19);
    public static final c710 U0 = new c710(21);
    public static final c710 V0 = new c710(22);
    public static final c710 W0 = new c710(23);
    public static final c710 X0 = new c710(24);
    public static final c710 Y0 = new c710(25);
    public static final c710 Z0 = new c710(26);
    public static final c710 a1 = new c710(27);
    public static final c710 b1 = new c710(28);
    public static final c710 c1 = new c710(29);

    public /* synthetic */ c710(byte b2) {
        this.a = b2;
    }

    public static boolean b(hb4 hb4Var) {
        return hb4Var.f();
    }

    public static Next c(s1m1 s1m1Var, wa0 wa0Var, List list) {
        iyl1 iyl1VarA = wa0Var.a();
        String string = UUID.randomUUID().toString();
        s1m1 s1m1VarA = s1m1.a(s1m1Var, 4, 0, null, null, wa0Var, null, null, 2, string, false, null, false, list, 0, null, null, false, 0, 8379613);
        a0m1 a0m1Var = new a0m1(4);
        String str = s1m1Var.l;
        b0m1 b0m1Var = new b0m1(iyl1VarA, string, str == null ? "" : str);
        String str2 = iyl1VarA.a;
        ryl1 ryl1Var = s1m1Var.t;
        return Next.i(s1m1VarA, f46.S0(new g0m1[]{a0m1Var, b0m1Var, new yzl1(new seo(str2, ryl1Var.b, ryl1Var.c, str == null ? "" : str, string)), p2o1.y(s1m1VarA, 1)}));
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        return new tip0((lai1) obj, (dam) obj2, (gpy0) obj3, ((Boolean) obj4).booleanValue());
    }

    public Object a(String str, tv80 tv80Var, lnm lnmVar) {
        return Boolean.FALSE;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((PlayerState) obj).contextUri();
            case 1:
                ima1 ima1Var = (dma1) obj;
                bma1 bma1Var = dk20.b;
                return yoi1.i(ima1Var.q(bma1Var), o6x.a).map(o610.c).startWithItem(Boolean.valueOf(ima1Var.h(bma1Var, false)));
            case 2:
                mmr0 mmr0Var = (mmr0) obj;
                return new dxo0((String) mmr0Var.a, (String) mmr0Var.b);
            case 3:
                return new k100(a8w.a);
            case 4:
            case 7:
            case 8:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 21:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
            default:
                return sig0.a;
            case 5:
                return new c011(((Boolean) obj).booleanValue());
            case 6:
                ge9 ge9Var = (ge9) obj;
                return new p3a0(ge9Var.a, ge9Var.b, ge9Var.c);
            case 9:
                return ((fqd0) obj).b;
            case 10:
                return (f6r0) obj;
            case 11:
                return new iaf0(((Boolean) obj).booleanValue());
            case 12:
                Float f2 = (Float) ((cma1) obj).a;
                return Float.valueOf(f2 != null ? f2.floatValue() : 1.0f);
            case 14:
                return ((GetEntityResponse) obj).n().t();
            case 17:
                return ((e2p0) obj).d;
            case 19:
                return Boolean.valueOf(y7y0.t("has-podcasts-available", (Map) obj));
            case 24:
                beh behVar = (feh) obj;
                return behVar instanceof beh ? Completable.j(new RuntimeException(behVar.a)) : CompletableEmpty.a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                blb blbVar = ((rzh) obj).c;
                return blbVar instanceof blb ? new i5w0(blbVar.a) : j5.a;
            case 28:
                return new mbv0(((Boolean) obj).booleanValue());
        }
    }

    public First e0(Object obj) {
        return First.b(rhm0.a((rhm0) obj, null, false, 15));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 22:
                String str3 = (String) linkedHashMap.get("preset_id");
                if (str3 == null) {
                    return null;
                }
                return new iss0(str3, xkg0Var, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length = str4.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str4.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                }
                return new nyu0(str4, xkg0Var, str2, str);
        }
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        return new ern0(uic.x(pro1.t("kidsFamilyExclude")));
    }

    public boolean test(Object obj, Object obj2) {
        gbc0 gbc0Var = (gbc0) obj;
        gbc0 gbc0Var2 = (gbc0) obj2;
        if ((gbc0Var instanceof ebc0) && (gbc0Var2 instanceof ebc0)) {
            return true;
        }
        return (gbc0Var instanceof fbc0) && (gbc0Var2 instanceof fbc0);
    }

    public boolean test(Object obj) {
        return ((g331) obj) instanceof z231;
    }
}
