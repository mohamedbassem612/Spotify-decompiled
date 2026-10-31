package p;

import androidx.car.app.navigation.model.Maneuver;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_esperanto.proto.IsSnoozedResponse;
import com.spotify.contextmenu.platform.ContextMenuContentLoadException;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.outcome.outcomeapi.exceptions.HttpError;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o9p1 implements Predicate, Function, Init, s2i1, BiFunction, av30 {
    public static o9p1 b;
    public final /* synthetic */ byte a;
    public static final o9p1 c = new o9p1(1);
    public static final o9p1 d = new o9p1(2);
    public static final o9p1 e = new o9p1(3);
    public static final o9p1 f = new o9p1(4);
    public static final o9p1 g = new o9p1(5);
    public static final o9p1 h = new o9p1(6);
    public static final o9p1 i = new o9p1(7);
    public static final o9p1 t = new o9p1(8);
    public static final o9p1 X = new o9p1(9);
    public static final o9p1 Y = new o9p1(10);
    public static final o9p1 Z = new o9p1(11);
    public static final o9p1 N0 = new o9p1(12);
    public static final o9p1 O0 = new o9p1(13);
    public static final /* synthetic */ o9p1 P0 = new o9p1(14);
    public static final o9p1 Q0 = new o9p1(15);
    public static final o9p1 R0 = new o9p1(16);
    public static final o9p1 S0 = new o9p1(17);
    public static final o9p1 T0 = new o9p1(18);
    public static final edo U0 = new edo((String) null, (String) null, (String) null, (String) null, (ki0) null, (i6h1) null);
    public static final o9p1 V0 = new o9p1(20);
    public static final o9p1 W0 = new o9p1(21);
    public static final o9p1 X0 = new o9p1(22);
    public static final o9p1 Y0 = new o9p1(23);
    public static final o9p1 Z0 = new o9p1(24);
    public static final o9p1 a1 = new o9p1(25);
    public static final o9p1 b1 = new o9p1(26);
    public static final o9p1 c1 = new o9p1(27);
    public static final o9p1 d1 = new o9p1(28);
    public static final o9p1 e1 = new o9p1(29);

    public /* synthetic */ o9p1(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 2:
                return Observable.empty();
            case 3:
                qfd qfdVar = (qfd) o7h.q0((List) obj);
                if (!qfdVar.b && qfdVar.c == 3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                int iC = l1d.C(((iam) obj).a);
                if (iC != 5) {
                    return iC != 7 ? nk3.f : nk3.d;
                }
                return nk3.c;
            case 5:
                return (ContextTrack) ((spq0) obj).b();
            case 6:
            case 8:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 19:
            case 21:
            case 22:
            case 25:
            case 26:
            default:
                return ((tgq0) obj).a;
            case 7:
                jx7 jx7Var = (jx7) obj;
                return Boolean.valueOf(jx7Var.a.n(jx7Var.b.a));
            case 10:
                ContextTrack contextTrack = (ContextTrack) obj;
                if (l4o1.D(contextTrack)) {
                    return l4m.a;
                }
                return l4o1.K(contextTrack) ? l4m.b : l4m.c;
            case 12:
                return Boolean.valueOf(((tal) obj).equals(sal.a));
            case 15:
                byte[] bArr = (byte[]) obj;
                try {
                    return IsSnoozedResponse.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.collection_esperanto.proto.IsSnoozedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 17:
                return gio.a;
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 20:
                dma1 dma1Var = (dma1) obj;
                String strE = dma1Var.e(ghr.k, "");
                return new mmr0(new fhr(strE != null ? strE : "", dma1Var.g(ghr.l, 0L)), dma1Var);
            case 23:
                return Boolean.valueOf(((gkf1) obj).c);
            case 24:
                return dau.a;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Throwable contextMenuContentLoadException = (Throwable) obj;
                if (contextMenuContentLoadException instanceof HttpError) {
                    contextMenuContentLoadException = new ContextMenuContentLoadException(contextMenuContentLoadException);
                }
                return Single.error(contextMenuContentLoadException);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Logger.e((Throwable) obj, "GetState failed, suppressing further player state emissions", new Object[0]);
                return Observable.never();
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 6:
                return First.b((vn6) obj);
            default:
                return First.c((o2y) obj, Collections.singleton(n1y.a));
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new mab(xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                return ((spq0) obj).c();
            case 8:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            case 9:
                return true;
            case 13:
                return ((zpd) obj) != zpd.b;
            case 16:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    r7h.W(((zvh) it.next()).b, arrayList);
                }
                return !arrayList.isEmpty();
            default:
                return ((spq0) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((Boolean) obj, (Boolean) obj2);
    }
}
