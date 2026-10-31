package p;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class bb00 {
    public static int[] _values() {
        return l1d.H(3);
    }

    public static final String a(int i) {
        return c(i);
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "ADD";
        }
        if (i == 2) {
            return "REMOVE";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "button_clicked";
        }
        if (i == 2) {
            return "card_clicked";
        }
        if (i == 3) {
            return "cta_see_all";
        }
        if (i == 4) {
            return "";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "positive_interested";
            case 2:
                return "negative_not_interested";
            case 3:
                return "negative_repetitive";
            case 4:
                return "negative_brand";
            case 5:
                return "negative_product";
            case 6:
                return "negative_already_using";
            case 7:
                return "negative_something_else";
            case 8:
                return "report_adult_content";
            case 9:
                return "report_deceptive_misleading";
            case 10:
                return "report_dangerous_inappropriate";
            case 11:
                return "report_illegal_restricted";
            case 12:
                return "report_quality_technical";
            case 13:
                return "dsa_tapped";
            case 14:
                return "brand_survey_info_tapped";
            case 15:
                return "neutral_close_ad";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "activity";
        }
        if (i == 2) {
            return "service";
        }
        if (i == 3) {
            return "receiver";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "enable_phone_number_with_new_tc";
            case 2:
                return "google_login_enabled";
            case 3:
                return "google_registration_enabled";
            case 4:
                return "naver_login_enabled";
            case 5:
                return "naver_registration_enabled";
            case 6:
                return "enable_samsung_login";
            case 7:
                return "enable_samsung_login_using_single_sign_in";
            case 8:
                return "mobile_enable_south_korea_experience";
            case 9:
                return "mobile_disable_facebook_login";
            case 10:
                return "mobile_disable_facebook_signup";
            case 11:
                return "disable_to_in_test_suite";
            case 12:
                return "enable_navigate_to_home_in_test_suite";
            case 13:
                return "android_disable_too_many_requests_dialog";
            default:
                throw null;
        }
    }

    public static int g(yz21 yz21Var, int i, int i2) {
        return (yz21Var.hashCode() + i) * i2;
    }

    public static err0 h(int i, x340 x340Var) {
        err0 err0Var = new err0(i);
        x340Var.s0(err0Var);
        return err0Var;
    }

    public static hrr0 i(rih1 rih1Var, f331 f331Var, x340 x340Var) {
        hrr0 hrr0Var = new hrr0(rih1Var, f331Var);
        x340Var.s0(hrr0Var);
        return hrr0Var;
    }

    public static void j(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ void k(gb00 gb00Var, Object obj, bpe0 bpe0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gb00.g;
        while (!atomicReferenceFieldUpdater.compareAndSet(gb00Var, obj, bpe0Var) && atomicReferenceFieldUpdater.get(gb00Var) == obj) {
        }
    }

    public static /* synthetic */ void l(s2j0 s2j0Var) {
        if (s2j0Var == null) {
            return;
        }
        bhn0.d();
    }

    public static /* synthetic */ boolean m(AtomicReference atomicReference, AtomicReference atomicReference2) {
        while (!atomicReference.compareAndSet(null, atomicReference2)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean n(AtomicReference atomicReference, ui20 ui20Var) {
        while (!atomicReference.compareAndSet(null, ui20Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean o(gb00 gb00Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gb00.g;
        while (!atomicReferenceFieldUpdater.compareAndSet(gb00Var, obj, null)) {
            if (atomicReferenceFieldUpdater.get(gb00Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean p(gb00 gb00Var, Object obj, bpe0 bpe0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gb00.g;
        while (!atomicReferenceFieldUpdater.compareAndSet(gb00Var, obj, bpe0Var)) {
            if (atomicReferenceFieldUpdater.get(gb00Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "UPDATE";
        }
        if (i == 2) {
            return "ENABLE";
        }
        if (i == 3) {
            return "REMOVE";
        }
        throw null;
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "REPLACE";
        }
        if (i == 2) {
            return "KEEP";
        }
        if (i == 3) {
            return "APPEND";
        }
        if (i == 4) {
            return "APPEND_OR_REPLACE";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "RESUME";
        }
        if (i == 2) {
            return "PLAY";
        }
        throw null;
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "FACE";
        }
        if (i == 2) {
            return "BACK_BUTTON";
        }
        if (i == 3) {
            return "NONE";
        }
        throw null;
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "OK";
        }
        if (i == 3) {
            return "NOT_RESOLVED";
        }
        if (i != 4) {
            return i != 5 ? "null" : "UNAVAILABLE_FOR_LEGAL_REASONS";
        }
        return "NOT_FOUND";
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "ARTIST";
            case 2:
                return "PLAYLIST";
            case 3:
                return "ALBUM";
            case 4:
                return "PODCAST";
            case 5:
                return "UNKNOWN";
            case 6:
                return "PODCAST_EPISODE";
            case 7:
                return "TRACK";
            default:
                return "null";
        }
    }
}
