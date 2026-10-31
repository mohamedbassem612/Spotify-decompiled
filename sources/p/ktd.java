package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract /* synthetic */ class ktd {
    public static int[] _values() {
        return l1d.H(5);
    }

    public static final String a(int i) {
        return d(i);
    }

    public static final boolean b(int i) {
        return i == 6 || i == 4;
    }

    public static int c(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("SignUp")) {
            return 1;
        }
        if (str.equals("AgeAssurance")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.genalphaauthentication.childinitiatedauthapi.ChildInitiatedAuthFlow.".concat(str));
        return 0;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "next";
            case 2:
                return "male";
            case 3:
                return "female";
            case 4:
                return "none_binary";
            case 5:
                return "other";
            case 6:
                return "prefer_not_to_say";
            case 7:
                return "dismiss";
            case 8:
                return "ok";
            case 9:
                return "back_pressed";
            case 10:
                return "back_button";
            case 11:
                return "sign_up";
            case 12:
                return "login";
            case 13:
                return "facebook";
            case 14:
                return "google_auth_button";
            case 15:
                return "naver_auth_button";
            case 16:
                return "cancel";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "magiclink_reset_password";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "open_email_app";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "magiclink_send_request";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "get_help";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "try_again_button";
            case 22:
                return "phone_number_sign_up";
            case 23:
                return "choose_calling_code";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "request_otp";
            case 25:
                return "resend_sms";
            case 26:
                return "resend_email";
            case 27:
                return "resend_email_otp";
            case 28:
                return "login_with_password";
            case 29:
                return "edit_phone_number";
            case 30:
                return "validate_otp";
            case 31:
                return "samsung_effortless_login_started";
            case 32:
                return "samsung_effortless_login_dismissed";
            case 33:
                return "log_out";
            case 34:
                return "more_options_button";
            case 35:
                return "google_registration_disabled_email_signup_button";
            case 36:
                return "google_registration_disabled_dismiss_button";
            case 37:
                return "account_switching_close_button";
            case 38:
                return "continue";
            case 39:
                return "dismiss";
            case 40:
                return "support";
            case 41:
                return "retry";
            case 42:
                return "contact";
            case 43:
                return "create_account";
            case 44:
                return "passkey_auth_button";
            default:
                throw null;
        }
    }

    public static float e(float f, float f2, float f3, float f4) {
        return (f3 - (f * f2)) / f4;
    }

    public static int f(int i, byte[] bArr, int i2) {
        return (Arrays.hashCode(bArr) + i) * i2;
    }

    public static int g(iu30 iu30Var, int i, int i2) {
        return (iu30Var.hashCode() + i) * i2;
    }

    public static int h(tw21 tw21Var, int i, int i2) {
        return (Integer.hashCode(tw21Var.a) + i) * i2;
    }

    public static String i(String str, Exception exc) {
        return str + exc;
    }

    public static StringBuilder j(String str, i0h1 i0h1Var, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i0h1Var);
        sb.append(str2);
        return sb;
    }

    public static p3v k(float f, x340 x340Var) {
        p3v p3vVar = new p3v(f);
        x340Var.s0(p3vVar);
        return p3vVar;
    }

    public static uyx l(nim0 nim0Var, float f, x340 x340Var, x340 x340Var2) {
        op71.g(x340Var, u291.v(nim0Var, f));
        return cbx.d(x340Var2);
    }

    public static qim0 m(era eraVar, qim0 qim0Var) {
        return qim0Var.then(new tq60(eraVar));
    }

    public static jdn0 n(x340 x340Var) {
        jdn0 jdn0Var = new jdn0();
        x340Var.s0(jdn0Var);
        return jdn0Var;
    }

    public static hrr0 o(float f, x340 x340Var) {
        hrr0 hrr0VarQ = v8r.q(new p3v(f));
        x340Var.s0(hrr0VarQ);
        return hrr0VarQ;
    }

    public static void p(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void q(long j, String str, StringBuilder sb) {
        sb.append((Object) u7h.h(j));
        sb.append(str);
    }

    public static void r(String str, String str2) {
        oon1.H(str + str2);
    }

    public static void s(j2i j2iVar, x340 x340Var, Integer num, boolean z, boolean z2) {
        j2iVar.invoke(x340Var, num);
        x340Var.r(z);
        x340Var.r(z2);
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "SEARCH";
        }
        if (i == 2) {
            return "LYRICS_STICKERS";
        }
        if (i == 3) {
            return "GIFS";
        }
        throw null;
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "S256";
        }
        if (i == 2) {
            return "PLAIN";
        }
        throw null;
    }

    public static /* synthetic */ String v(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "AgeAssurance";
        }
        return "SignUp";
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "POLYMORPHIC";
        }
        return "ALL_JSON_OBJECTS";
    }
}
