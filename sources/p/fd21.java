package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class fd21 {
    public static int[] _values() {
        return l1d.H(42);
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 42;
            case 1:
            case 5:
            case 14:
            case 22:
            default:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            case 10:
                return 8;
            case 11:
                return 9;
            case 12:
                return 10;
            case 13:
                return 11;
            case 15:
                return 12;
            case 16:
                return 13;
            case 17:
                return 14;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return 15;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return 16;
            case 20:
                return 17;
            case 21:
                return 18;
            case 23:
                return 19;
            case 24:
                return 20;
            case 25:
                return 21;
            case 26:
                return 22;
            case 27:
                return 23;
            case 28:
                return 24;
            case 29:
                return 25;
            case 30:
                return 26;
            case 31:
                return 27;
            case 32:
                return 28;
            case 33:
                return 29;
            case 34:
                return 30;
            case 35:
                return 31;
            case 36:
                return 32;
            case 37:
                return 33;
            case 38:
                return 34;
            case 39:
                return 35;
            case 40:
                return 36;
            case 41:
                return 37;
            case 42:
                return 38;
            case 43:
                return 39;
            case 44:
                return 40;
            case 45:
                return 41;
        }
    }

    public static int b(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("REQUESTED")) {
            return 2;
        }
        if (str.equals("PENDING")) {
            return 3;
        }
        if (str.equals("DOWNLOADING")) {
            return 4;
        }
        if (str.equals("DOWNLOADED")) {
            return 5;
        }
        if (str.equals("FAILURE")) {
            return 6;
        }
        hhg1.n("No enum constant com.spotify.offline.util.Resource.State.".concat(str));
        return 0;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "load_first_result_search_recents";
        }
        if (i == 2) {
            return "load_first_result_first_step_search";
        }
        if (i == 3) {
            return "load_first_result_second_step_search";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "error";
        }
        if (i == 3) {
            return "cancelled";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "failure";
        }
        if (i == 3) {
            return "exception";
        }
        if (i == 4) {
            return "unknown";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "hydrogen_endpoint";
        }
        if (i == 2) {
            return "natural_language_endpoint";
        }
        throw null;
    }

    public static float g(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) * f4;
    }

    public static String h(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ boolean i(AtomicReference atomicReference) {
        Object obj = w0h1.b;
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean j(AtomicReference atomicReference, ec51 ec51Var, ec51 ec51Var2) {
        while (!atomicReference.compareAndSet(ec51Var, ec51Var2)) {
            if (atomicReference.get() != ec51Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean k(AtomicReference atomicReference, lxl1 lxl1Var) {
        while (!atomicReference.compareAndSet(null, lxl1Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean l(AtomicReference atomicReference) {
        nn41 nn41Var;
        do {
            nn41Var = nn41.a;
            if (atomicReference.compareAndSet(nn41Var, nn41.b)) {
                return true;
            }
        } while (atomicReference.get() == nn41Var);
        return false;
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "SQUARE";
        }
        if (i == 2) {
            return "CIRCLE";
        }
        throw null;
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "SECTION_ACTIVE";
        }
        if (i == 2) {
            return "SECTION_SUGGESTED";
        }
        if (i == 3) {
            return "SECTION_UNSPECIFIED";
        }
        throw null;
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "PLAYING";
        }
        if (i == 2) {
            return "PAUSED";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }

    public static /* synthetic */ String p(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "Rtl";
        }
        return "Ltr";
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "AUTOMATIC";
        }
        if (i != 2) {
            return i != 3 ? "null" : "WRITE_AHEAD_LOGGING";
        }
        return "TRUNCATE";
    }

    public static /* synthetic */ int r(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("SQUARE")) {
            return 1;
        }
        if (str.equals("CIRCLE")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.allboarding.allboardingdomain.model.RenderType.".concat(str));
        return 0;
    }

    public static /* synthetic */ int s(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("PLAYING")) {
            return 1;
        }
        if (str.equals("PAUSED")) {
            return 2;
        }
        if (str.equals("NONE")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.search.common.RowPlayState.".concat(str));
        return 0;
    }

    public static /* synthetic */ int t(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("SECTION_ACTIVE")) {
            return 1;
        }
        if (str.equals("SECTION_SUGGESTED")) {
            return 2;
        }
        if (str.equals("SECTION_UNSPECIFIED")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.campfire.models.Section.".concat(str));
        return 0;
    }
}
