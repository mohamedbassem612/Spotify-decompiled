package p;

import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationConsentCheck;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationConsentGrant;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationFixOutcome;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationPermissionOutcome;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationWrite;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class prt {
    public final t2j0 a;

    public prt(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(cgl cglVar, int i, String str) throws NoWhenBranchMatchedException {
        String str2;
        drt drtVarN = DeviceLocationConsentCheck.n();
        if (cglVar != null) {
            int iOrdinal = cglVar.ordinal();
            if (iOrdinal == 0) {
                str2 = "INELIGIBLE";
            } else if (iOrdinal == 1) {
                str2 = "ELIGIBLE_NOT_GRANTED";
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                str2 = "GRANTED";
            }
        } else {
            str2 = "";
        }
        drtVarN.n(str2);
        drtVarN.q(i);
        if (str.length() == 0) {
            str = "unspecified";
        }
        drtVarN.r(str);
        this.a.a(drtVarN.build());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b(boolean z, cgl cglVar, int i, String str) throws NoWhenBranchMatchedException {
        String str2;
        ert ertVarN = DeviceLocationConsentGrant.n();
        ertVarN.n(z ? "GRANT" : "REVOKE");
        if (cglVar != null) {
            int iOrdinal = cglVar.ordinal();
            if (iOrdinal == 0) {
                str2 = "INELIGIBLE";
            } else if (iOrdinal == 1) {
                str2 = "ELIGIBLE_NOT_GRANTED";
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                str2 = "GRANTED";
            }
        } else {
            str2 = "UNKNOWN";
        }
        ertVarN.r(str2);
        ertVarN.q(i);
        if (str.length() == 0) {
            str = "unspecified";
        }
        ertVarN.s(str);
        this.a.a(ertVarN.build());
    }

    public final void c(int i, String str, String str2, long j) {
        String str3;
        ort ortVarN = DeviceLocationFixOutcome.n();
        ortVarN.q(j);
        ortVarN.s();
        if (str2.length() == 0) {
            str2 = "unspecified";
        }
        ortVarN.u(str2);
        int iC = l1d.C(i);
        if (iC == 0) {
            str3 = "TIMEOUT";
        } else if (iC == 1) {
            str3 = "PERMISSION_DENIED";
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            str3 = "FAILED";
        }
        ortVarN.t(str3);
        ortVarN.r(str);
        ortVarN.n(-1.0d);
        this.a.a(ortVarN.build());
    }

    public final void d(int i, int i2, boolean z) {
        vrt vrtVarN = DeviceLocationPermissionOutcome.n();
        vrtVarN.q(hrt.v(i));
        vrtVarN.r(hrt.v(i2));
        vrtVarN.n(z);
        vrtVarN.s("unspecified");
        this.a.a(vrtVarN.build());
    }

    public final void e(doe0 doe0Var, int i, double d, String str) {
        jtt jttVarN = DeviceLocationWrite.n();
        jttVarN.r(doe0Var == doe0.a ? "SUCCESS" : "FAILURE");
        jttVarN.q(i);
        jttVarN.n(d);
        if (str.length() == 0) {
            str = "unspecified";
        }
        jttVarN.s(str);
        this.a.a(jttVarN.build());
    }
}
