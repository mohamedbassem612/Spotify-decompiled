package p;

import android.content.Intent;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy;
import com.spotify.signup.signup.v2.proto.FieldError;
import com.spotify.signup.signup.v2.proto.ValidateAccountResponse;
import com.spotify.tap.playback.TapLoggedOutException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;
import spotify.playlist.esperanto.proto.ResponseStatus;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class i2x0 implements Function, av30, Predicate, sga1, sh, s2i1, au11, h271 {
    public static final i2x0 X0;
    public static final i2x0 Y0;
    public final /* synthetic */ byte a;
    public static final i2x0 b = new i2x0(0);
    public static final i2x0 c = new i2x0(1);
    public static final i2x0 d = new i2x0(2);
    public static final i2x0 e = new i2x0(3);
    public static final i2x0 f = new i2x0(4);
    public static final i2x0 g = new i2x0(5);
    public static final i2x0 h = new i2x0(7);
    public static final i2x0 i = new i2x0(8);
    public static final i2x0 t = new i2x0(10);
    public static final i2x0 X = new i2x0(12);
    public static final i2x0 Y = new i2x0(13);
    public static final i2x0 Z = new i2x0(14);
    public static final i2x0 N0 = new i2x0(15);
    public static final i2x0 O0 = new i2x0(16);
    public static final i2x0 P0 = new i2x0(17);
    public static final i2x0 Q0 = new i2x0(18);
    public static final i2x0 R0 = new i2x0(19);
    public static final i2x0 S0 = new i2x0(20);
    public static final i2x0 T0 = new i2x0(21);
    public static final i2x0 U0 = new i2x0(22);
    public static final i2x0 V0 = new i2x0(23);
    public static final i2x0 W0 = new i2x0(24);
    public static final i2x0 Z0 = new i2x0(26);
    public static final i2x0 a1 = new i2x0(27);

    static {
        byte b2 = 25;
        X0 = new i2x0(b2);
        Y0 = new i2x0(b2);
    }

    public /* synthetic */ i2x0(byte b2) {
        this.a = b2;
    }

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String c(String str, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(" ");
        sb.append(str);
        sb.append(" for uri ");
        sb.append(str3);
        return l1d.n(": ", str2, sb);
    }

    public static LinkedHashSet d(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet e(String str, String... strArr) {
        return d("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet f(String str, String... strArr) {
        return d("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static boolean g(Intent intent) {
        return intent.getBooleanExtra("needs_foreground_start", false);
    }

    public static py21 h(String str, String str2, Function0 function0, int i2) {
        if (200 <= i2 && i2 < 300) {
            return new oy21(function0.invoke());
        }
        if (i2 == 400) {
            return new ly21(new by21(c("BAD REQUEST", str, i2, str2)));
        }
        if (i2 == 403) {
            return new ly21(new cy21(c("FORBIDDEN", str, i2, str2)));
        }
        if (i2 == 404) {
            return new ly21(new gy21(c("NOT FOUND", str, i2, str2)));
        }
        if (i2 == 410) {
            return new ly21(new dy21(c("GONE", str, i2, str2)));
        }
        if (i2 == 451) {
            return new ly21(new hy21(c("UNAVAILABLE FOR LEGAL REASONS", str, i2, str2)));
        }
        if (i2 == 500) {
            return new ly21(new fy21(c("INTERNAL ERROR", str, i2, str2)));
        }
        if (i2 == 507) {
            return new ly21(new ey21(c("INSUFFICIENT STORAGE", str, i2, str2)));
        }
        return new ly21(new iy21("Error code " + i2 + " is not handled for uri " + str2 + ": " + str));
    }

    public static py21 j(String str, Throwable th, Function0 function0) {
        int i2 = th instanceof HttpException ? ((HttpException) th).a : -1;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return h(message, str, function0, i2);
    }

    public static py21 l(ResponseStatus responseStatus, String str, Function0 function0) {
        return h(responseStatus.p(), str, function0, responseStatus.getStatusCode());
    }

    public static void m(Intent intent) {
        intent.putExtra("needs_foreground_start", true);
    }

    public Object apply(Object obj) {
        c320 c320Var;
        switch (this.a) {
            case 0:
                return new y2x0((String) obj);
            case 1:
                dwx0 dwx0Var = (dwx0) obj;
                return new mmr0(rc11.a.b(dwx0Var.a.getClass()), Boolean.valueOf(dwx0Var.g));
            case 2:
                beh behVar = (feh) obj;
                return behVar instanceof beh ? new w7z0(behVar.a) : x7z0.a;
            case 3:
                if (obj == null) {
                    return ubg1.a;
                }
                bhn0.d();
                return null;
            case 4:
            case 6:
            case 9:
            case 11:
            case 15:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
            case 22:
            default:
                return new vpm1((zpm1) obj);
            case 5:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsRemoteConfigDummy.ResolveDummyResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.remoteconfig.esperanto.proto.EsRemoteConfigDummy.ResolveDummyResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 7:
                return ((z310) obj).a;
            case 8:
                return new e151((fw41) obj);
            case 10:
                Object obj2 = ((cma1) obj).a;
                if (obj2 != null) {
                    return (Boolean) obj2;
                }
                hhg1.n("Required value was null.");
                return null;
            case 12:
                ValidateAccountResponse validateAccountResponse = (ValidateAccountResponse) obj;
                int iO = validateAccountResponse.o();
                int i2 = iO == 0 ? -1 : cr81.b[l1d.C(iO)];
                if (i2 == 1) {
                    return new c320(bk2.d);
                }
                dk2 dk2Var = dk2.d;
                if (i2 != 2) {
                    return new c320(dk2Var);
                }
                int iP = validateAccountResponse.n().p();
                int i3 = iP != 0 ? cr81.a[l1d.C(iP)] : -1;
                if (i3 != 1) {
                    if (i3 != 2) {
                        return i3 != 3 ? new c320(dk2Var) : new c320(dk2Var);
                    }
                    return new c320(ak2.d);
                }
                String strY0 = o7h.y0(validateAccountResponse.n().o().o(), "\n", (String) null, (String) null, oa81.d1, 30);
                h290 h290VarO = validateAccountResponse.n().o().o();
                if (h290VarO.isEmpty()) {
                    c320Var = new c320(new zj2(strY0));
                } else {
                    Iterator it = h290VarO.iterator();
                    while (it.hasNext()) {
                        if (((FieldError) it.next()).n() == 10) {
                            c320Var = new c320(new ck2(strY0));
                        }
                    }
                    c320Var = new c320(new zj2(strY0));
                }
                return c320Var;
            case 13:
                return (String) ((spq0) obj).b();
            case 14:
                Throwable th = (Throwable) obj;
                return Single.error(th instanceof TimeoutException ? don.a : th instanceof gon ? (gon) th : eon.a);
            case 16:
                return new e7c1((kas0) obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((Boolean) obj).booleanValue() ? CompletableEmpty.a : Completable.j(TapLoggedOutException.a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((ContextTrack) ((PlayerState) obj).track().b()).uri();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    wu21 wu21Var = (wu21) entry.getValue();
                    if (wu21Var instanceof vu21) {
                        up70 up70VarA = ((vu21) wu21Var).a.a(vp70.c);
                        String str = up70VarA != null ? up70VarA.a.a : null;
                        linkedHashMap.put(key, str);
                    } else if (!(wu21Var instanceof tu21) && !(wu21Var instanceof uu21)) {
                        eg.o();
                        return null;
                    }
                    linkedHashMap.put(key, str);
                }
                return new e7z0(linkedHashMap);
            case 23:
                return new b2l1(i3a.j("Playback command rx chain failed: ", (Throwable) obj));
        }
    }

    public Object b(u171 u171Var) {
        qz61 qz61Var = u171Var.a;
        if (!u890.j(qz61Var.c, ysd.a)) {
            hhg1.n("Expected Unknown card data for audio chapter card");
            return null;
        }
        String strZ = qz61Var.b.z();
        if (strZ != null) {
            return new vp7(strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new sni1(xkg0Var, str2, str);
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return eu11.a;
        }
        if (fe00Var.equals(ce00.a)) {
            return iu11.a;
        }
        return null;
    }

    public boolean r(View view) {
        view.performClick();
        return true;
    }

    public Object s(t171 t171Var) {
        throw new UnsupportedOperationException("Chat preview input not supported for audio chapter cards");
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for audio chapter cards");
    }

    public boolean test(Object obj) {
        return ((spq0) obj).c();
    }
}
