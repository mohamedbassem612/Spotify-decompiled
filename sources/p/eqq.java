package p;

import android.os.Parcel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class eqq {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i) {
        if (i == 1) {
            return "WARNING";
        }
        if (i != 2) {
            return i != 3 ? "null" : "HIDDEN";
        }
        return SearchEndpointResponseKt.RESULT_ERROR;
    }

    public static /* synthetic */ int C(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("SUNDAY")) {
            return 1;
        }
        if (str.equals("MONDAY")) {
            return 2;
        }
        if (str.equals("TUESDAY")) {
            return 3;
        }
        if (str.equals("WEDNESDAY")) {
            return 4;
        }
        if (str.equals("THURSDAY")) {
            return 5;
        }
        if (str.equals("FRIDAY")) {
            return 6;
        }
        if (str.equals("SATURDAY")) {
            return 7;
        }
        hhg1.n("No enum constant com.spotify.promptedplaylists.artifactpage.api.Days.".concat(str));
        return 0;
    }

    public static int a(String str) {
        return str != null ? 4 : 1;
    }

    public static final int b(int i) {
        return g(i);
    }

    public static final String c(int i) {
        return h(i);
    }

    public static final String d(int i) {
        if (i == 1) {
            return "preinstall_campaign";
        }
        if (i == 2) {
            return "preinstall_partner";
        }
        throw null;
    }

    public static final String e(int i) {
        return i(i);
    }

    public static final String f(int i) {
        switch (i) {
            case 1:
                return "v1/url";
            case 2:
                return "v1/app-link-settings";
            case 3:
                return "v1/install";
            case 4:
                return "v1/open";
            case 5:
                return "v1/content-events";
            case 6:
                return "v2/event/standard";
            case 7:
                return "v2/event/custom";
            case 8:
                return "v1/cpid/latd";
            case 9:
                return "v1/qr-code";
            case 10:
                return "local/logout";
            case 11:
                return "local/setIdentity";
            default:
                throw null;
        }
    }

    public static /* synthetic */ byte g(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    if (i == 4) {
                        return (byte) 4;
                    }
                    throw null;
                }
            }
        }
        return b;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "branch_data";
        }
        if (i == 2) {
            return "branch_force_new_session";
        }
        if (i == 3) {
            return "branch_used";
        }
        if (i == 4) {
            return "branch";
        }
        if (i == 5) {
            return "io.branch.sdk.auto_linked";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "only_me";
        }
        if (i == 3) {
            return "friends";
        }
        if (i == 4) {
            return "everyone";
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "data_fetch_error";
        }
        if (i == 2) {
            return "timeout";
        }
        if (i == 3) {
            return "parse_error";
        }
        if (i == 4) {
            return "legal_restriction";
        }
        throw null;
    }

    public static int k(int i, int i2, hux huxVar) {
        return (huxVar.hashCode() + i) * i2;
    }

    public static View l(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static String m(String str, UUID uuid) {
        return str + uuid;
    }

    public static String n(nim0 nim0Var, float f, b0k b0kVar, int i, b0k b0kVar2) {
        op71.g(b0kVar, u291.h(nim0Var, f));
        return cwl1.o0(b0kVar2, i);
    }

    public static jly0 o(ib3 ib3Var, int i) {
        return xqu.b(new tsq(ib3Var, i, (byte) 5));
    }

    public static jly0 p(cyo cyoVar, int i) {
        return iy81.a(new tsq(cyoVar, i, (byte) 18));
    }

    public static jly0 q(hqq hqqVar, int i) {
        return xqu.b(new ipq(hqqVar, i, (byte) 11));
    }

    public static jly0 r(qtq qtqVar, int i) {
        return xqu.b(new tsq(qtqVar, i, (byte) 9));
    }

    public static jly0 s(lvq lvqVar, int i) {
        return xqu.b(new tsq(lvqVar, i, (byte) 26));
    }

    public static void t(int i, int i2, ConstraintLayout constraintLayout) {
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
    }

    public static void u(Parcel parcel, int i, Long l) {
        parcel.writeInt(i);
        parcel.writeLong(l.longValue());
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "Required";
        }
        if (i == 2) {
            return "Optional";
        }
        if (i == 3) {
            return "Result";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "ONLY_ME";
        }
        if (i == 3) {
            return "FRIENDS";
        }
        if (i == 4) {
            return "EVERYONE";
        }
        throw null;
    }

    public static /* synthetic */ String x(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "GENERIC";
        }
        return SearchEndpointResponseKt.RESULT_SUCCESS;
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "MEMORY_CACHE";
        }
        if (i == 2) {
            return "MEMORY";
        }
        if (i != 3) {
            return i != 4 ? "null" : "NETWORK";
        }
        return "DISK";
    }

    public static /* synthetic */ String z(int i) {
        if (i == 1) {
            return "Required";
        }
        if (i != 2) {
            return i != 3 ? "null" : "Result";
        }
        return "Optional";
    }
}
