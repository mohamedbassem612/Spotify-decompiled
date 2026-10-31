package p;

import com.spotify.mobius.Connection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract /* synthetic */ class ywx0 {
    public static final String a(int i) {
        if (i == 1) {
            return "user_rating_permitted";
        }
        if (i == 2) {
            return "user_rating_forbidden";
        }
        throw null;
    }

    public static final int b(int i) {
        return i(i);
    }

    public static final String c(int i) {
        return h(i);
    }

    public static final String d(int i) {
        if (i == 1) {
            return "OS_PROMPT";
        }
        if (i == 2) {
            return "ALERT_SETTINGS_REDIRECT";
        }
        if (i == 3) {
            return "DIRECT_SETTINGS_REDIRECT";
        }
        if (i == 4) {
            return "NOT_APPLICABLE";
        }
        if (i == 5) {
            return "UNKNOWN";
        }
        throw null;
    }

    public static final String e(int i) {
        if (i == 1) {
            return "ACCEPT";
        }
        if (i == 2) {
            return "DENY";
        }
        if (i == 3) {
            return "OPEN_SETTINGS";
        }
        if (i == 4) {
            return "CANCEL";
        }
        throw null;
    }

    public static final String f(int i) {
        if (i == 1) {
            return "load";
        }
        if (i == 2) {
            return "add";
        }
        if (i == 3) {
            return "delete";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "Unknown Error";
            case 2:
                return "Network Error";
            case 3:
                return "Site key invalid";
            case 4:
                return "Key type invalid";
            case 5:
                return "Package name not allowed";
            case 6:
                return "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information";
            case 7:
                return "Invalid timeout, minimum value is 5_000L milliseconds";
            case 8:
                return "No network found on device";
            case 9:
                return "Internal Error";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "PENDING";
        }
        if (i == 2) {
            return "PURCHASED";
        }
        if (i == 3) {
            return "UNSPECIFIED_STATE";
        }
        throw null;
    }

    public static /* synthetic */ short i(int i) {
        switch (i) {
            case 1:
                return (short) 2;
            case 2:
                return (short) 8;
            case 3:
                return (short) 16;
            case 4:
                return (short) 1;
            case 5:
                return (short) 4;
            case 6:
                return (short) 32;
            case 7:
                return (short) 128;
            default:
                throw null;
        }
    }

    public static int j(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static wux k(nim0 nim0Var, float f, x340 x340Var, x340 x340Var2) {
        op71.g(x340Var, u291.h(nim0Var, f));
        return cbx.b(x340Var2);
    }

    public static void l(int i, j2i j2iVar, h2c h2cVar, x340 x340Var, boolean z) {
        j2iVar.invoke(h2cVar, x340Var, Integer.valueOf(i));
        x340Var.r(z);
    }

    public static /* synthetic */ void m(AtomicReference atomicReference, roy0 roy0Var) {
        while (!atomicReference.compareAndSet(roy0Var, null) && atomicReference.get() == roy0Var) {
        }
    }

    public static void n(nim0 nim0Var, float f, x340 x340Var, boolean z) {
        op71.g(x340Var, u291.r(nim0Var, f));
        x340Var.r(z);
    }

    public static /* synthetic */ boolean o(AtomicReference atomicReference, Object obj, Connection connection) {
        while (!atomicReference.compareAndSet(obj, connection)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "Section";
        }
        if (i == 2) {
            return "World";
        }
        throw null;
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "REASON_UNSPECIFIED";
            case 2:
                return "REASON_CONTENT_SHARING";
            case 3:
                return "REASON_COLLABORATIVE_PLAYLISTS";
            case 4:
                return "REASON_BLENDS";
            case 5:
                return "REASON_GROUP_SESSIONS";
            case 6:
                return "REASON_FAMILY";
            case 7:
                return "REASON_FOLLOWING";
            case 8:
                return "REASON_MESSAGING";
            case 9:
                return "REASON_WRAPPED_PARTY";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "NOT_FOUND";
        }
        if (i == 2) {
            return "NETWORK_ERROR";
        }
        if (i == 3) {
            return "UNKNOWN";
        }
        throw null;
    }

    public static /* synthetic */ int s(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("Section")) {
            return 1;
        }
        if (str.equals("World")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.home.evopage.element.promptablesection.promptbottomsheet.PromptKind.".concat(str));
        return 0;
    }

    public static /* synthetic */ int t(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("REASON_UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("REASON_CONTENT_SHARING")) {
            return 2;
        }
        if (str.equals("REASON_COLLABORATIVE_PLAYLISTS")) {
            return 3;
        }
        if (str.equals("REASON_BLENDS")) {
            return 4;
        }
        if (str.equals("REASON_GROUP_SESSIONS")) {
            return 5;
        }
        if (str.equals("REASON_FAMILY")) {
            return 6;
        }
        if (str.equals("REASON_FOLLOWING")) {
            return 7;
        }
        if (str.equals("REASON_MESSAGING")) {
            return 8;
        }
        if (str.equals("REASON_WRAPPED_PARTY")) {
            return 9;
        }
        hhg1.n("No enum constant com.spotify.campfire.models.Reason.".concat(str));
        return 0;
    }

    public static /* synthetic */ int u(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("NOT_FOUND")) {
            return 1;
        }
        if (str.equals("NETWORK_ERROR")) {
            return 2;
        }
        if (str.equals("UNKNOWN")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.campaigns.wrapped.receipt.mobius.ReceiptErrorReason.".concat(str));
        return 0;
    }
}
