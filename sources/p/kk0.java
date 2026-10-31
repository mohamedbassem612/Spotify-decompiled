package p;

import android.os.Parcel;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract /* synthetic */ class kk0 {
    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "AGE_RANGE_UNKNOWN";
        }
        if (i == 2) {
            return "PARENTAL_DENIAL";
        }
        if (i == 3) {
            return "UNDERAGE";
        }
        throw null;
    }

    public static /* synthetic */ String B(int i) {
        if (i == 1) {
            return "AGE_RANGE_UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "UNDERAGE";
        }
        return "PARENTAL_DENIAL";
    }

    public static /* synthetic */ int C(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("FORM_ONLY")) {
            return 1;
        }
        if (str.equals("FORM_AND_EXTRA_FIELDS")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.address.address.AddressFormArgs.Presentation.".concat(str));
        return 0;
    }

    public static /* synthetic */ int D(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("DEBUG")) {
            return 1;
        }
        if (str.equals("CHECKOUT")) {
            return 2;
        }
        if (str.equals("ACCOUNT")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.address.address.AddressFormArgs.TrackingContext.".concat(str));
        return 0;
    }

    public static /* synthetic */ int E(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("GOOGLE_PLAY")) {
            return 1;
        }
        if (str.equals("SAMSUNG_GALAXY_STORE")) {
            return 2;
        }
        if (str.equals("AMAZON_APPSTORE")) {
            return 3;
        }
        if (str.equals("APPLE_APP_STORE")) {
            return 4;
        }
        if (str.equals("UNKNOWN")) {
            return 5;
        }
        hhg1.n("No enum constant com.spotify.agesignal.agesignalprovider.AgeSignalSource.".concat(str));
        return 0;
    }

    public static /* synthetic */ int F(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("AGE_RANGE_UNKNOWN")) {
            return 1;
        }
        if (str.equals("PARENTAL_DENIAL")) {
            return 2;
        }
        if (str.equals("UNDERAGE")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.agesignal.agesignalverifier.AgeVerificationResult.BlockReason.".concat(str));
        return 0;
    }

    public static final String a(int i) {
        switch (i) {
            case 1:
                return "eligibility_check_failed";
            case 2:
                return "core_metadata_failed";
            case 3:
                return "realtime_metadata_failed";
            case 4:
                return "buffer_failed";
            case 5:
                return "ad_ended";
            case 6:
                return "ad_skipped";
            case 7:
                return "ad_timeout";
            default:
                throw null;
        }
    }

    public static final String b(int i) {
        if (i == 1) {
            return "view_ad_on_app_open";
        }
        if (i == 2) {
            return "eligibility_check";
        }
        if (i == 3) {
            return "core_metadata_request";
        }
        if (i == 4) {
            return "realtime_metadata_request";
        }
        if (i == 5) {
            return "buffer_start";
        }
        throw null;
    }

    public static int c(String str) {
        return E(str);
    }

    public static int d(String str) {
        return F(str);
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "image_prefetch_failure";
            case 2:
                return "image_postfetch_failure";
            case 3:
                return "image_list_empty";
            case 4:
                return "image_prefetch_exception";
            case 5:
                return "ad_data_missing";
            case 6:
                return "no_carousel_items";
            case 7:
                return "ad_cta_missing";
            case 8:
                return "video_prebuffer_error";
            case 9:
                return "page_load_error";
            case 10:
                return "dimensions_error";
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return "missing_creative";
            default:
                throw null;
        }
    }

    public static int f(c380 c380Var, int i, int i2) {
        return (c380Var.hashCode() + i) * i2;
    }

    public static int g(h290 h290Var, int i, int i2) {
        return (h290Var.hashCode() + i) * i2;
    }

    public static int h(xkg0 xkg0Var, int i, int i2) {
        return (xkg0Var.hashCode() + i) * i2;
    }

    public static CoroutinesSubtypeEffectHandlerBuilder i(MobiusCoroutines.Companion companion) {
        companion.getClass();
        return new CoroutinesSubtypeEffectHandlerBuilder();
    }

    public static String j(float f, int i, x340 x340Var, x340 x340Var2, nim0 nim0Var) {
        op71.g(x340Var, u291.r(nim0Var, f));
        return cwl1.o0(x340Var2, i);
    }

    public static String k(x340 x340Var, int i, Integer num, x340 x340Var2, boolean z) {
        x340Var.i0(i);
        String strO0 = cwl1.o0(x340Var2, num.intValue());
        x340Var.r(z);
        return strO0;
    }

    public static ArrayList l(y6h1 y6h1Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y6h1Var);
        return arrayList;
    }

    public static Iterator m(Parcel parcel, List list) {
        parcel.writeInt(list.size());
        return list.iterator();
    }

    public static Iterator n(x340 x340Var, qim0 qim0Var, llj lljVar, int i, c380 c380Var) {
        nko1.H(qim0Var, x340Var, lljVar);
        x340Var.i0(i);
        return c380Var.iterator();
    }

    public static ye5 o(int i, x340 x340Var) {
        x340Var.i0(i);
        return new ye5();
    }

    public static uyx p(nim0 nim0Var, float f, x340 x340Var, x340 x340Var2) {
        op71.g(x340Var, u291.h(nim0Var, f));
        return cbx.d(x340Var2);
    }

    public static wnb0 q(x340 x340Var, qim0 qim0Var, llj lljVar, float f, boolean z) {
        nko1.H(qim0Var, x340Var, lljVar);
        return new wnb0(f, z);
    }

    public static x6h1 r(x6h1 x6h1Var, String str) {
        y6h1 y6h1VarA = x6h1Var.a();
        Collections.singletonList(str);
        return y6h1VarA.c();
    }

    public static void s(float f, boolean z, x340 x340Var) {
        op71.g(x340Var, new wnb0(f, z));
    }

    public static boolean t(int i, int i2, x340 x340Var) {
        x340Var.k0(i);
        return x340Var.e(l1d.C(i2));
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "PASS";
        }
        if (i == 2) {
            return "FAIL";
        }
        if (i == 3) {
            return "UNCHECKED";
        }
        throw null;
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "API_CREATE";
            case 3:
                return "API_COMPLETE_CREATION";
            case 4:
                return "API_GET_SESSION";
            case 5:
                return "API_AUTH_CLIENT";
            case 6:
                return "CHALLENGE_IN_PROGRESS";
            case 7:
                return "SESSION_ID_MISMATCH";
            case 8:
                return "CHALLENGE_PASSKEY_AUTHN_REQUEST";
            case 9:
                return "CHALLENGE_SMSCODE_REQUEST";
            case 10:
                return "CHALLENGE_EMAILCODE_REQUEST";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "FORM_ONLY";
        }
        if (i == 2) {
            return "FORM_AND_EXTRA_FIELDS";
        }
        throw null;
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "DEBUG";
        }
        if (i == 2) {
            return "CHECKOUT";
        }
        if (i == 3) {
            return "ACCOUNT";
        }
        throw null;
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "GOOGLE_PLAY";
        }
        if (i == 2) {
            return "SAMSUNG_GALAXY_STORE";
        }
        if (i == 3) {
            return "AMAZON_APPSTORE";
        }
        if (i == 4) {
            return "APPLE_APP_STORE";
        }
        if (i == 5) {
            return "UNKNOWN";
        }
        throw null;
    }

    public static /* synthetic */ String z(int i) {
        if (i == 1) {
            return "VERIFIED_ADULT";
        }
        if (i == 2) {
            return "DECLARED_ADULT";
        }
        if (i == 3) {
            return "SUPERVISED_MINOR";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        throw null;
    }
}
