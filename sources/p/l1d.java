package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract /* synthetic */ class l1d {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178};

    public static void A(JSONException jSONException, StringBuilder sb) {
        sb.append(jSONException.getMessage());
        i1k0.C(sb.toString());
    }

    public static void B(yqg yqgVar, hma1 hma1Var, bma1 bma1Var) {
        hma1Var.c(bma1Var, yqgVar.b());
        hma1Var.g();
    }

    public static /* synthetic */ int C(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "AZTEC";
            case 2:
                return "CODABAR";
            case 3:
                return "CODE_39";
            case 4:
                return "CODE_93";
            case 5:
                return "CODE_128";
            case 6:
                return "DATA_MATRIX";
            case 7:
                return "EAN_8";
            case 8:
                return "EAN_13";
            case 9:
                return "ITF";
            case 10:
                return "MAXICODE";
            case 11:
                return "PDF_417";
            case 12:
                return "QR_CODE";
            case 13:
                return "RSS_14";
            case 14:
                return "RSS_EXPANDED";
            case 15:
                return "UPC_A";
            case 16:
                return "UPC_E";
            case 17:
                return "UPC_EAN_EXTENSION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "READY";
        }
        return "PENDING";
    }

    public static /* synthetic */ String F(int i) {
        if (i == 1) {
            return "INITIALISED";
        }
        if (i != 2) {
            return i != 3 ? "null" : "UNINITIALISED";
        }
        return "INITIALISING";
    }

    public static /* synthetic */ String G(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int[] H(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ Integer a(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    public static /* synthetic */ void b(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ boolean d(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static float e(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return ((i - i2) / i3) + i4;
    }

    public static MobiusLoop.Builder g(MobiusLoop.Builder builder) {
        return builder.f(new AndroidLogger());
    }

    public static Observable h(boolean z) {
        Observable observableJust = Observable.just(Boolean.valueOf(z));
        observableJust.getClass();
        return observableJust;
    }

    public static Object i(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String j(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String k(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String l(long j, String str) {
        return str + j;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String o(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static String q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String r(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder s(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder t(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static Set u(Class cls) {
        return Collections.singleton(new zp21(cls));
    }

    public static KotlinNothingValueException v(Object obj) {
        hm5.M(obj);
        return new KotlinNothingValueException();
    }

    public static KotlinNothingValueException w(String str) {
        qf80.d(str);
        return new KotlinNothingValueException();
    }

    public static llm x(q8n q8nVar) {
        return smo1.e(flo1.l(guo1.B(), q8nVar));
    }

    public static l811 y(Object obj) {
        hm5.M(obj);
        return new l811();
    }

    public static void z(String str, String str2, String str3) {
        n57.e(str + str2 + str3);
    }
}
