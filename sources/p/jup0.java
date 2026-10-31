package p;

import android.icu.text.UnicodeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class jup0 {
    public static int[] _values() {
        return l1d.H(3);
    }

    public static int a(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 0 : 4;
        }
        return 3;
    }

    public static int b(Boolean bool) {
        if (bool == null) {
            return 1;
        }
        return bool.booleanValue() ? 2 : 3;
    }

    public static final String c(int i) {
        return f(i);
    }

    public static int d(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("PRIMARY")) {
            return 1;
        }
        if (str.equals("SECONDARY")) {
            return 2;
        }
        if (str.equals("TERTIARY")) {
            return 3;
        }
        if (str.equals("QUATERNARY")) {
            return 4;
        }
        hhg1.n("No enum constant com.spotify.profile.profilelist.model.PaginationPhase.".concat(str));
        return 0;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "HmacSHA1";
        }
        if (i == 2) {
            return "HmacSHA256";
        }
        if (i == 3) {
            return "HmacSHA512";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "NOTIFICATION_SETTINGS";
            case 2:
                return "MESSAGING";
            case 3:
                return "PROMPTED_PLAYLISTS";
            case 4:
                return "COMMENTS";
            case 5:
                return "CHATS";
            case 6:
                return "LIVE_EVENTS";
            case 7:
                return "NOTIFICATIONS";
            case 8:
                return "ONBOARDING";
            default:
                throw null;
        }
    }

    public static /* synthetic */ byte g(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "cancellation";
        }
        if (i == 2) {
            return "failure";
        }
        if (i == 3) {
            return "success";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "error_spotify_login_unsuccessful";
            case 2:
                return "error_no_partner_account_app";
            case 3:
                return "error_client_login_unsuccessful";
            case 4:
                return "error_user_cancelled";
            case 5:
                return "error_can_not_connect";
            case 6:
                return "error_linking_accounts";
            case 7:
                return "error_internal";
            case 8:
                return "error_user_logged_out";
            case 9:
                return "error_unknown";
            default:
                throw null;
        }
    }

    public static void j(UnicodeSet unicodeSet, int i, int i2, int i3, int i4) {
        unicodeSet.add(i);
        unicodeSet.addAll(i2, i3);
        unicodeSet.add(i4);
    }

    public static /* synthetic */ void k(dbr0 dbr0Var) {
        if (dbr0Var == null) {
            return;
        }
        bhn0.d();
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "Standard";
            case 2:
                return "Expanded";
            case 3:
                return "Fullscreen";
            case 4:
                return "Collapsed";
            case 5:
                return "Overlay";
            case 6:
                return "Floating";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "HERO";
        }
        if (i == 2) {
            return "SINGLE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "TYPE_NOT_SET";
        }
        return "MULTI";
    }
}
