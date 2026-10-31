package p;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.semantics.SemanticState;
import com.spotify.base.java.logging.Logger;
import com.spotify.download.esperanto.proto.EsDownload;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import spotify.autodownload.esperanto.proto.DisableAllEnabledShowsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mpi1 implements Function, s2i1, BiFunction, kob, BiPredicate, yu30, snt, Predicate {
    public final /* synthetic */ byte a;
    public static final mpi1 b = new mpi1(0);
    public static final mpi1 c = new mpi1(1);
    public static final mpi1 d = new mpi1(2);
    public static final mpi1 e = new mpi1(3);
    public static final mpi1 f = new mpi1(4);
    public static final mpi1 g = new mpi1(5);
    public static final mpi1 h = new mpi1(6);
    public static final mpi1 i = new mpi1(7);
    public static final mpi1 t = new mpi1(8);
    public static final mpi1 X = new mpi1(9);
    public static final mpi1 Y = new mpi1(10);
    public static final mpi1 Z = new mpi1(11);
    public static final mpi1 N0 = new mpi1(12);
    public static final mpi1 O0 = new mpi1(14);
    public static final mpi1 P0 = new mpi1(15);
    public static final mpi1 Q0 = new mpi1(16);
    public static final mpi1 R0 = new mpi1(17);
    public static final mpi1 S0 = new mpi1(18);
    public static final mpi1 T0 = new mpi1(19);
    public static final mpi1 U0 = new mpi1(20);
    public static final mpi1 V0 = new mpi1(21);
    public static final mpi1 W0 = new mpi1(22);
    public static final mpi1 X0 = new mpi1(23);
    public static final mpi1 Y0 = new mpi1(24);
    public static final mpi1 Z0 = new mpi1(25);
    public static final mpi1 a1 = new mpi1(26);
    public static final mpi1 b1 = new mpi1(27);
    public static final mpi1 c1 = new mpi1(28);
    public static final mpi1 d1 = new mpi1(29);

    public /* synthetic */ mpi1(byte b2) {
        this.a = b2;
    }

    public static m0d a(Context context, LinkedHashMap linkedHashMap) {
        String simCountryIso = ((TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
        String country = context.getResources().getConfiguration().locale.getCountry();
        country.getClass();
        if (linkedHashMap.isEmpty()) {
            eg.m("Check failed.");
            return null;
        }
        if (!TextUtils.isEmpty(simCountryIso)) {
            m0d m0dVar = (m0d) linkedHashMap.get(simCountryIso != null ? simCountryIso.toUpperCase(Locale.US) : null);
            if (m0dVar != null) {
                return m0dVar;
            }
        }
        m0d m0dVar2 = (m0d) linkedHashMap.get(country);
        return m0dVar2 == null ? (m0d) linkedHashMap.values().iterator().next() : m0dVar2;
    }

    public static final File b() {
        if (dhn.a.contains(mpi1.class)) {
            return null;
        }
        try {
            File file = new File(wf10.a().getFilesDir(), "facebook_ml/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        } catch (Throwable th) {
            dhn.a(mpi1.class, th);
            return null;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return Boolean.FALSE;
            case 2:
                return ((l62) obj).O0;
            case 3:
                return Boolean.valueOf(((l0l) ((spq0) obj).b()).l());
            case 4:
                Logger.e((Throwable) obj, "Assisted Curation Album Loader failed.", new Object[0]);
                return Single.just(gb3.a);
            case 5:
                return Boolean.valueOf(((ck4) obj).c);
            case 6:
                return Boolean.valueOf(((h26) obj).a);
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 14:
            case 17:
            case 18:
            case 24:
            default:
                return kuz.c;
            case 9:
                byte[] bArr = (byte[]) obj;
                try {
                    return DisableAllEnabledShowsResponse.n(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.autodownload.esperanto.proto.DisableAllEnabledShowsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 11:
                return bjo.a;
            case 15:
                return Boolean.valueOf(y7y0.t("offline", (Map) obj));
            case 16:
                return new qwo0((String) ((mmr0) obj).b);
            case 19:
                return new t23(((Throwable) obj).getMessage());
            case 20:
                return or11.a;
            case 21:
                return new k231(((beh) obj).a);
            case 22:
                return rih1.a;
            case 23:
                return Boolean.valueOf(((up91) obj) == up91.b);
            case 25:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsDownload.RequestDataResponse.t(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.download.esperanto.proto.EsDownload.RequestDataResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 26:
                return ((ContextTrack) obj).uri();
        }
    }

    public String c(String str) {
        List listX;
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = u890.q(str.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            String string = str.subSequence(i2, length + 1).toString();
            Pattern patternCompile = Pattern.compile("\\s+");
            ihc1.N0(0);
            Matcher matcher = patternCompile.matcher(string);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList.add(string.subSequence(iEnd, string.length()).toString());
                listX = arrayList;
            } else {
                listX = k4p1.x(string.toString());
            }
            return TextUtils.join(" ", (String[]) listX.toArray(new String[0]));
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public int[] d(String str) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            int[] iArr = new int[SemanticState.Focused];
            byte[] bytes = c(str).getBytes(Charset.forName("UTF-8"));
            for (int i2 = 0; i2 < 128; i2++) {
                if (i2 < bytes.length) {
                    iArr[i2] = bytes[i2] & 255;
                } else {
                    iArr[i2] = 0;
                }
            }
            return iArr;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 8:
                String str3 = (String) linkedHashMap.get("book_id");
                if (str3 == null || str3.length() != 22) {
                    return null;
                }
                int length = str3.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str3.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                }
                return new fd8(str3, xkg0Var, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("identifier");
                if (str4 == null) {
                    return null;
                }
                return new m7l(str4, str2, str, xkg0Var);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((spq0) obj).c();
            default:
                return !((uv00) obj).f;
        }
    }

    public boolean test(Object obj, Object obj2) {
        return u890.j(((PlayerState) obj).track(), ((PlayerState) obj2).track());
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((fi41) obj, (Set) obj2);
    }
}
