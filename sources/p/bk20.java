package p;

import android.view.View;
import com.google.protobuf.Empty;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bk20 implements Function, k1q0, Init, BiPredicate, Predicate, av30, Function3, BiFunction, tbt0, s2i1 {
    public final /* synthetic */ byte a;
    public static final bk20 b = new bk20(0);
    public static final bk20 c = new bk20(2);
    public static final bk20 d = new bk20(3);
    public static final bk20 e = new bk20(4);
    public static final bk20 f = new bk20(5);
    public static final bk20 g = new bk20(6);
    public static final bk20 h = new bk20(7);
    public static final bk20 i = new bk20(8);
    public static final bk20 t = new bk20(9);
    public static final bk20 X = new bk20(10);
    public static final bk20 Y = new bk20(11);
    public static final bk20 Z = new bk20(12);
    public static final bk20 N0 = new bk20(13);
    public static final bk20 O0 = new bk20(14);
    public static final bk20 P0 = new bk20(15);
    public static final bk20 Q0 = new bk20(16);
    public static final bk20 R0 = new bk20(17);
    public static final bk20 S0 = new bk20(18);
    public static final bk20 T0 = new bk20(19);
    public static final bk20 U0 = new bk20(20);
    public static final bk20 V0 = new bk20(21);
    public static final bk20 W0 = new bk20(22);
    public static final bk20 X0 = new bk20(23);
    public static final bk20 Y0 = new bk20(24);
    public static final bk20 Z0 = new bk20(25);
    public static final bk20 a1 = new bk20(26);
    public static final bk20 b1 = new bk20(27);
    public static final bk20 c1 = new bk20(28);
    public static final bk20 d1 = new bk20(29);

    public /* synthetic */ bk20(byte b2) {
        this.a = b2;
    }

    public static Next c(e340 e340Var, String str, long j, int i2) {
        return Next.h(e340.a(e340Var, 0, 3, 0L, o7h.O0(new r3z0(i2, e340Var.b().a, str, j), e340Var.i), 239));
    }

    public int a(String str) {
        return 0;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new CompletableFromAction(new jt8((dma1) obj, (byte) 1));
            case 4:
                return PlayerState.EMPTY;
            case 5:
                return foo1.r((Set) obj);
            case 10:
                return crn0.a;
            case 13:
                return new tdj0(((Boolean) obj).booleanValue());
            case 16:
                return ((e2p0) obj).h;
            case 17:
                Object[] objArr = (Object[]) obj;
                ArrayList arrayList = new ArrayList(objArr.length);
                for (Object obj2 : objArr) {
                    arrayList.add((ubm) obj2);
                }
                int iS = zno1.s(q7h.U(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((ubm) obj3).a, obj3);
                }
                return linkedHashMap;
            case 18:
                Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
                int iS2 = zno1.s(q7h.U(setEntrySet, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap2.put(((a2v) entry.getKey()).a, (h2v) entry.getValue());
                }
                return linkedHashMap2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return ((xoc0) obj).a;
            case 27:
                return new qbv0((ClientPollResponse) obj);
            case 28:
                return ((cuv0) obj).a;
            default:
                eww0 eww0Var = (eww0) obj;
                String str = eww0Var.b;
                String str2 = eww0Var.f;
                if (str2 == null) {
                    str2 = "";
                }
                return new n2x0(str, str2, eww0Var.l);
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 6:
                return First.b((mya0) obj);
            case 7:
                return First.b((n2c0) obj);
            default:
                return First.b((mah0) obj);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new fxu0(xkg0Var, str2, str);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && !((Boolean) obj3).booleanValue());
    }

    public boolean test(Object obj) {
        boolean z;
        switch (this.a) {
            case 9:
                return ((e501) ((f501) obj)).a.length() > 0;
            case 11:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            case 14:
                z = ((uv00) obj).f;
                break;
            default:
                ContextTrack contextTrack = (ContextTrack) obj;
                contextTrack.getClass();
                z = Boolean.parseBoolean((String) contextTrack.metadata().get("is_advertisement"));
                break;
        }
        return !z;
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        switch (this.a) {
            case 2:
                nk80 nk80VarI = hsl1Var.a.i(647);
                int i2 = nk80VarI.b;
                int i3 = nk80VarI.d;
                view.setPadding(nk80VarI.a, i2, nk80VarI.c, i3);
                break;
            default:
                view.setPadding(view.getPaddingLeft(), hsl1Var.a.i(519).b, view.getPaddingRight(), view.getPaddingBottom());
                break;
        }
        return hsl1.b;
    }

    public boolean test(Object obj, Object obj2) {
        x3s0 x3s0Var = (x3s0) obj2;
        return x3s0Var.equals(k1p1.i((x3s0) obj, x3s0Var.a()));
    }

    public void b(String str, int i2) {
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 21:
                return new mmr0((spq0) obj, (spq0) obj2);
            default:
                Long l = (Long) obj;
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj2).track().h();
                String strUri = contextTrack != null ? contextTrack.uri() : null;
                if (strUri == null) {
                    strUri = "";
                }
                return new mmr0(strUri, Integer.valueOf((int) l.longValue()));
        }
    }
}
