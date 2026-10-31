package p;

import android.os.Bundle;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract /* synthetic */ class pzm {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 1:
                return "AED";
            case 2:
                return "AFN";
            case 3:
                return "ALL";
            case 4:
                return "AMD";
            case 5:
                return "ANG";
            case 6:
                return "AOA";
            case 7:
                return "ARS";
            case 8:
                return "AUD";
            case 9:
                return "AWG";
            case 10:
                return "AZN";
            case 11:
                return "BAM";
            case 12:
                return "BBD";
            case 13:
                return "BDT";
            case 14:
                return "BGN";
            case 15:
                return "BHD";
            case 16:
                return "BIF";
            case 17:
                return "BMD";
            case 18:
                return "BND";
            case 19:
                return "BOB";
            case 20:
                return "BOV";
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return "BRL";
            case 22:
                return "BSD";
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return "BTN";
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return "BWP";
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return "BYN";
            case 26:
                return "BYR";
            case 27:
                return "BZD";
            case 28:
                return "CAD";
            case 29:
                return "CDF";
            case 30:
                return "CHE";
            case 31:
                return "CHF";
            case 32:
                return "CHW";
            case 33:
                return "CLF";
            case 34:
                return "CLP";
            case 35:
                return "CNY";
            case 36:
                return "COP";
            case 37:
                return "COU";
            case 38:
                return "CRC";
            case 39:
                return "CUC";
            case 40:
                return "CUP";
            case 41:
                return "CVE";
            case 42:
                return "CZK";
            case 43:
                return "DJF";
            case 44:
                return "DKK";
            case 45:
                return "DOP";
            case 46:
                return "DZD";
            case 47:
                return "EGP";
            case 48:
                return "ERN";
            case 49:
                return "ETB";
            case 50:
                return "EUR";
            case 51:
                return "FJD";
            case 52:
                return "FKP";
            case 53:
                return "GBP";
            case 54:
                return "GEL";
            case 55:
                return "GHS";
            case 56:
                return "GIP";
            case 57:
                return "GMD";
            case 58:
                return "GNF";
            case 59:
                return "GTQ";
            case 60:
                return "GYD";
            case 61:
                return "HKD";
            case 62:
                return "HNL";
            case 63:
                return "HRK";
            case 64:
                return "HTG";
            case 65:
                return "HUF";
            case 66:
                return "IDR";
            case 67:
                return "ILS";
            case 68:
                return "INR";
            case 69:
                return "IQD";
            case 70:
                return "IRR";
            case 71:
                return "ISK";
            case 72:
                return "JMD";
            case 73:
                return "JOD";
            case 74:
                return "JPY";
            case 75:
                return "KES";
            case 76:
                return "KGS";
            case 77:
                return "KHR";
            case 78:
                return "KMF";
            case 79:
                return "KPW";
            case 80:
                return "KRW";
            case 81:
                return "KWD";
            case 82:
                return "KYD";
            case 83:
                return "KZT";
            case 84:
                return "LAK";
            case 85:
                return "LBP";
            case 86:
                return "LKR";
            case 87:
                return "LRD";
            case 88:
                return "LSL";
            case 89:
                return "LYD";
            case 90:
                return "MAD";
            case 91:
                return "MDL";
            case 92:
                return "MGA";
            case 93:
                return "MKD";
            case 94:
                return "MMK";
            case 95:
                return "MNT";
            case 96:
                return "MOP";
            case 97:
                return "MRO";
            case 98:
                return "MUR";
            case 99:
                return "MVR";
            case GetCheckoutPageResponse.UcbCheckout.BillingProvider.QUEBEC_STUDENT_TRIAL_TERM_FIELD_NUMBER /* 100 */:
                return "MWK";
            case 101:
                return "MXN";
            case 102:
                return "MXV";
            case 103:
                return "MYR";
            case 104:
                return "MZN";
            case 105:
                return "NAD";
            case 106:
                return "NGN";
            case 107:
                return "NIO";
            case 108:
                return "NOK";
            case 109:
                return "NPR";
            case 110:
                return "NZD";
            case 111:
                return "OMR";
            case 112:
                return "PAB";
            case 113:
                return "PEN";
            case 114:
                return "PGK";
            case 115:
                return "PHP";
            case 116:
                return "PKR";
            case 117:
                return "PLN";
            case 118:
                return "PYG";
            case 119:
                return "QAR";
            case 120:
                return "RON";
            case 121:
                return "RSD";
            case 122:
                return "RUB";
            case 123:
                return "RWF";
            case 124:
                return "SAR";
            case 125:
                return "SBD";
            case 126:
                return "SCR";
            case 127:
                return "SDG";
            case 128:
                return "SEK";
            case 129:
                return "SGD";
            case 130:
                return "SHP";
            case 131:
                return "SLL";
            case 132:
                return "SOS";
            case 133:
                return "SRD";
            case 134:
                return "SSP";
            case 135:
                return "STD";
            case 136:
                return "SYP";
            case 137:
                return "SZL";
            case 138:
                return "THB";
            case 139:
                return "TJS";
            case 140:
                return "TMT";
            case 141:
                return "TND";
            case 142:
                return "TOP";
            case 143:
                return "TRY";
            case 144:
                return "TTD";
            case 145:
                return "TWD";
            case 146:
                return "TZS";
            case 147:
                return "UAH";
            case 148:
                return "UGX";
            case 149:
                return "USD";
            case 150:
                return "USN";
            case 151:
                return "UYI";
            case 152:
                return "UYU";
            case 153:
                return "UZS";
            case 154:
                return "VEF";
            case 155:
                return "VND";
            case 156:
                return "VUV";
            case 157:
                return "WST";
            case 158:
                return "XAF";
            case 159:
                return "XAG";
            case 160:
                return "XAU";
            case 161:
                return "XBA";
            case 162:
                return "XBB";
            case 163:
                return "XBC";
            case 164:
                return "XBD";
            case 165:
                return "XCD";
            case 166:
                return "XDR";
            case 167:
                return "XFU";
            case 168:
                return "XOF";
            case 169:
                return "XPD";
            case 170:
                return "XPF";
            case 171:
                return "XPT";
            case 172:
                return "XSU";
            case 173:
                return "XTS";
            case 174:
                return "XUA";
            case 175:
                return "XXX";
            case 176:
                return "YER";
            case 177:
                return "ZAR";
            case 178:
                return "ZMW";
            default:
                throw null;
        }
    }

    public static /* synthetic */ float b(int i) {
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return 1.0f;
        }
        if (i == 3) {
            return 0.0f;
        }
        if (i == 4) {
            return 1.0f;
        }
        throw null;
    }

    public static /* synthetic */ float c(int i) {
        float f = 0.0f;
        if (i != 1 && i != 2) {
            f = 1.0f;
            if (i != 3) {
                if (i == 4) {
                    return 1.0f;
                }
                throw null;
            }
        }
        return f;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "value";
            case 2:
                return "event_time";
            case 3:
                return "event_name";
            case 4:
                return "content_ids";
            case 5:
                return "contents";
            case 6:
                return "content_type";
            case 7:
                return "description";
            case 8:
                return "level";
            case 9:
                return "max_rating_value";
            case 10:
                return "num_items";
            case 11:
                return "payment_info_available";
            case 12:
                return "registration_method";
            case 13:
                return "search_string";
            case 14:
                return "success";
            case 15:
                return "order_id";
            case 16:
                return "ad_type";
            case 17:
                return "currency";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "anon_id";
            case 2:
                return "fb_login_id";
            case 3:
                return "madid";
            case 4:
                return "page_id";
            case 5:
                return "page_scoped_user_id";
            case 6:
                return "ud";
            case 7:
                return "advertiser_tracking_enabled";
            case 8:
                return "application_tracking_enabled";
            case 9:
                return "consider_views";
            case 10:
                return "device_token";
            case 11:
                return "extInfo";
            case 12:
                return "include_dwell_data";
            case 13:
                return "include_video_data";
            case 14:
                return "install_referrer";
            case 15:
                return "installer_package";
            case 16:
                return "receipt_data";
            case 17:
                return "url_schemes";
            default:
                throw null;
        }
    }

    public static Bundle f(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static Bundle g(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        return bundle;
    }

    public static los h(mos mosVar) {
        c8o.l(mosVar);
        return new los();
    }

    public static lz20 i(x340 x340Var) {
        lz20 lz20Var = new lz20();
        x340Var.s0(lz20Var);
        return lz20Var;
    }

    public static jly0 j(wxo wxoVar, int i) {
        return iy81.a(new fwo(wxoVar, i, (byte) 8));
    }

    public static void k(float f, ven0 ven0Var) {
        ven0Var.setValue(new p3v(f));
    }

    public static /* synthetic */ boolean l(AtomicReference atomicReference) {
        t7o t7oVar;
        do {
            t7oVar = t7o.a;
            if (atomicReference.compareAndSet(t7oVar, t7o.f)) {
                return true;
            }
        } while (atomicReference.get() == t7oVar);
        return false;
    }

    public static /* synthetic */ boolean m(AtomicReference atomicReference, UrlRequest urlRequest, UrlRequest urlRequest2) {
        while (!atomicReference.compareAndSet(urlRequest, urlRequest2)) {
            if (atomicReference.get() != urlRequest) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean n(AtomicReference atomicReference, t7o t7oVar) {
        while (!atomicReference.compareAndSet(t7oVar, t7o.f)) {
            if (atomicReference.get() != t7oVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean o(AtomicReference atomicReference) {
        t7o t7oVar;
        do {
            t7oVar = t7o.a;
            if (atomicReference.compareAndSet(t7oVar, t7o.b)) {
                return true;
            }
        } while (atomicReference.get() == t7oVar);
        return false;
    }

    public static /* synthetic */ boolean p(AtomicReference atomicReference) {
        t7o t7oVar;
        do {
            t7oVar = t7o.b;
            if (atomicReference.compareAndSet(t7oVar, t7o.d)) {
                return true;
            }
        } while (atomicReference.get() == t7oVar);
        return false;
    }

    public static /* synthetic */ boolean q(AtomicReference atomicReference) {
        t7o t7oVar;
        do {
            t7oVar = t7o.c;
            if (atomicReference.compareAndSet(t7oVar, t7o.d)) {
                return true;
            }
        } while (atomicReference.get() == t7oVar);
        return false;
    }

    public static /* synthetic */ boolean r(AtomicReference atomicReference) {
        t7o t7oVar;
        do {
            t7oVar = t7o.b;
            if (atomicReference.compareAndSet(t7oVar, t7o.f)) {
                return true;
            }
        } while (atomicReference.get() == t7oVar);
        return false;
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "IDLE";
            case 2:
                return "CHECKING_CACHE";
            case 3:
                return "RESOLVING_CUE_AUDIO";
            case 4:
                return "DUCKING";
            case 5:
                return "DOWNLOADING";
            case 6:
                return "PLAYING";
            case 7:
                return "UNDUCKING";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "USER_DATA";
        }
        if (i == 2) {
            return "APP_DATA";
        }
        if (i != 3) {
            return i != 4 ? "null" : "CUSTOM_EVENTS";
        }
        return "CUSTOM_DATA";
    }
}
