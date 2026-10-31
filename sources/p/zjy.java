package p;

import android.content.Intent;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class zjy {
    public static int[] _values() {
        return l1d.H(2);
    }

    public static final boolean a(int i, k1r k1rVar) {
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC != 1) {
                if (iC == 2) {
                    return k1rVar instanceof h1r;
                }
                eg.o();
                return false;
            }
            if ((k1rVar instanceof h1r) && t3p1.z(((h1r) k1rVar).a)) {
                return true;
            }
        }
        return false;
    }

    public static int b(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static int d(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int e(int i) {
        if (i == 0) {
            return 8;
        }
        switch (i) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            case 8:
                return 6;
            case 9:
                return 7;
            default:
                return 0;
        }
    }

    public static final String f(int i) {
        if (i == 1) {
            return "event_viewed";
        }
        if (i == 2) {
            return "event_clicked";
        }
        if (i == 3) {
            return "event_ui";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "SUBMIT_FAILED";
            case 2:
                return "READY_FOR_PAYMENT_ERROR";
            case 3:
                return "INTENT_FAILED";
            case 4:
                return "REDIRECT_FAILED";
            case 5:
                return "PAYMENT_ERROR";
            case 6:
                return "ABUSE_BLOCK";
            case 7:
                return "PAYMENT_METHOD_ABUSE_BLOCK";
            case 8:
                return "COUNTRY_MISMATCH";
            case 9:
                return "PCI_TOKEN_ERROR";
            case 10:
                return "CALLBACK_FAILED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String h(int i) {
        switch (i) {
            case 1:
                return "facebook_generic";
            case 2:
                return "region_missmatch";
            case 3:
                return "generic";
            case 4:
                return "email_already_exist";
            case 5:
                return "too_short_password";
            case 6:
                return "too_weak_password";
            case 7:
                return "email_format_wrong";
            case 8:
                return "too_young_age";
            case 9:
                return "too_old_age";
            case 10:
                return "invalid_country";
            case 11:
                return "invalid_argument";
            case 12:
                return "no_connection";
            case 13:
                return "network_disabled";
            case 14:
                return "rate_limit";
            case 15:
                return "age_generic";
            case 16:
                return "invalid_form_data";
            case 17:
                return "samsung_effortless_login_failure";
            case 18:
                return "request_from_datacenter";
            case 19:
                return "third_party_auth_failed";
            case 20:
                return "third_party_auth_no_email";
            case 21:
                return "signup_configuration_fetch_failed";
            case 22:
                return "adaptive_auth_api_create";
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return "adaptive_auth_api_get_session";
            case 24:
                return "adaptive_auth_api_complete_creation";
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return "adaptive_auth_challenge_in_progress";
            case 26:
                return "adaptive_auth_session_id_mismatch";
            case 27:
                return "error_endpoint_login_otp-session-expired";
            case 28:
                return "error_endpoint_login_otp-too-many-attempts";
            case 29:
                return "error_sdk_auth-client_challenge-proceed";
            case 30:
                return "error_sdk_auth-client_resend-code";
            case 31:
                return "email_not_linked";
            case 32:
                return "error_endpoint_accountrecovery-v1_username-hint";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "unknown";
            case 2:
                return "timeout";
            case 3:
                return "readiness_timeout";
            case 4:
                return "stream_timeout";
            case 5:
                return "client_error";
            case 6:
                return "server_error";
            case 7:
                return "not_found";
            default:
                throw null;
        }
    }

    public static Comparable j(float f, p3v p3vVar) {
        return pap1.z(p3vVar, new p3v(f));
    }

    public static String k(Intent intent) {
        return uic.x(intent.getDataString()).z();
    }

    public static void l(Number number, float f, kd31 kd31Var, int i) {
        kd31Var.b(f - number.floatValue());
        kd31Var.i(i);
    }

    public static void m(Number number, kd31 kd31Var, int i) {
        kd31Var.b(number.floatValue());
        kd31Var.i(i);
    }

    public static /* synthetic */ void n(gb00 gb00Var, fb00 fb00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gb00.h;
        while (!atomicReferenceFieldUpdater.compareAndSet(gb00Var, null, fb00Var) && atomicReferenceFieldUpdater.get(gb00Var) == null) {
        }
    }

    public static /* synthetic */ boolean o(gb00 gb00Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = gb00.g;
        while (!atomicReferenceFieldUpdater.compareAndSet(gb00Var, null, bwp0.b)) {
            if (atomicReferenceFieldUpdater.get(gb00Var) != null) {
                return false;
            }
        }
        return true;
    }

    public static Comparable p(float f, p3v p3vVar) {
        return yoi1.l(p3vVar, new p3v(f));
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "ALBUM";
            case 2:
                return "ARTIST";
            case 3:
                return "AUDIOBOOK";
            case 4:
                return "EPISODE";
            case 5:
                return "PLAYLIST";
            case 6:
                return "PODCAST";
            case 7:
                return "TRACK";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "NO_MATCH";
        }
        if (i == 2) {
            return "UNAVAILABLE";
        }
        if (i == 3) {
            return "UNKNOWN";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "EXPLICIT";
        }
        if (i != 2) {
            return i != 3 ? "null" : "NONE";
        }
        return "OVER19ONLY";
    }

    public static /* synthetic */ int t(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("NO_MATCH")) {
            return 1;
        }
        if (str.equals("UNAVAILABLE")) {
            return 2;
        }
        if (str.equals("UNKNOWN")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.pagematch.errorpage.ErrorType.".concat(str));
        return 0;
    }
}
