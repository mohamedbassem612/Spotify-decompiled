package p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.crypto.tink.shaded.protobuf.c;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract /* synthetic */ class cy30 {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "ACCEPTED";
            case 2:
                return "PROTOBUF_SERIALIZATION_FAILED";
            case 3:
                return "REJECTED_MISSING_NAME";
            case 4:
                return "REJECTED_MISSING_OWNER";
            case 5:
                return "REJECTED_PAYLOAD_TOO_LARGE";
            case 6:
                return "REJECTED_RATE_LIMITED";
            case 7:
                return "OTHER_ERROR";
            default:
                return "null";
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(int i, View view, ViewGroup viewGroup) throws NoWhenBranchMatchedException {
        th30.P(2);
        int iC = l1d.C(i);
        if (iC == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (th30.P(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (iC == 1) {
            if (th30.P(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (th30.P(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iC == 2) {
            if (th30.P(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (iC != 3) {
                eg.o();
                return;
            }
            if (th30.P(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }

    public static int b(int i, int i2, int i3) {
        return c.h(i) + i2 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return qwg.T0(i) + i2 + i3 + i4;
    }

    public static int d(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, Map map) {
        return (map.hashCode() + i) * i2;
    }

    public static int f(int i, long j, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static Bundle g(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static String h(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String i(int i, String str, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String j(Class cls, String str) {
        return str + cls;
    }

    public static String k(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String l(String str, char c, String str2) {
        return str + c + str2;
    }

    public static String m(String str, Object obj, String str2) {
        return str + obj + str2;
    }

    public static String n(String str, String str2, char c) {
        return str + str2 + c;
    }

    public static String o(String str, String str2, String str3) {
        return Pattern.compile(str).matcher(str2).replaceAll(str3);
    }

    public static String p(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder q(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder s(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static llm t(q8n q8nVar) {
        return smo1.e(flo1.l(q8nVar, guo1.B()));
    }

    public static p811 u(Object obj) {
        hm5.M(obj);
        return new p811();
    }

    public static void v(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static int w(int i, int i2, int i3, int i4) {
        return c.i(i) + i2 + i3 + i4;
    }

    public static int x(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "BANNER";
        }
        if (i == 2) {
            return "FULLSCREEN";
        }
        if (i == 3) {
            return "MODAL";
        }
        if (i == 4) {
            return "SNACKBAR";
        }
        if (i == 5) {
            return "FORMAT_NOT_SET";
        }
        throw null;
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
