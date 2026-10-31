package p;

import com.spotify.libs.bluetooth.events.proto.BluetoothLowEnergyStartAdvertisingFailed;
import com.spotify.messages.PreloadStatusErrorNonAuth;
import com.spotify.xrprojected.onboarding.events.proto.XrGlassesOnboardingEligibility;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qib {
    public final t2j0 a;

    public void a(int i, String str) {
        String str2;
        bpv0 bpv0VarN = PreloadStatusErrorNonAuth.n();
        if (i == 1) {
            str2 = "PAI_INSTALL_REFERRER_DISCONNECTED";
        } else if (i == 2) {
            str2 = "PAI_INSTALL_REFERRER_NOT_READY";
        } else if (i == 3) {
            str2 = "PAI_INSTALL_REFERRER_REMOTE_EXCEPTION";
        } else if (i == 4) {
            str2 = "PAI_INSTALL_REFERRER_REPSONSE_NOT_OK";
        } else {
            if (i != 5) {
                throw null;
            }
            str2 = "PAI_SECURITY_EXCEPTION";
        }
        bpv0VarN.q(str2);
        bpv0VarN.n(str);
        this.a.a(bpv0VarN.build());
    }

    public void c(int i, int i2, int i3) {
        String str;
        String str2;
        String str3;
        okm1 okm1VarN = XrGlassesOnboardingEligibility.n();
        if (i == 1) {
            str = "account_linking_nudge";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "education";
        }
        okm1VarN.q(str);
        if (i2 == 1) {
            str2 = "allowed";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str2 = "suppressed";
        }
        okm1VarN.n(str2);
        switch (i3) {
            case 1:
                str3 = "conditions_met";
                break;
            case 2:
                str3 = "offline";
                break;
            case 3:
                str3 = "account_linked";
                break;
            case 4:
                str3 = "account_not_linked";
                break;
            case 5:
                str3 = "link_state_timeout";
                break;
            case 6:
                str3 = "link_state_unavailable";
                break;
            case 7:
                str3 = "image_prefetch_failed";
                break;
            default:
                throw null;
        }
        okm1VarN.r(str3);
        this.a.a(okm1VarN.build());
    }

    public void d(xhb xhbVar) {
        String str;
        ujb ujbVarN = BluetoothLowEnergyStartAdvertisingFailed.n();
        if (xhbVar.equals(shb.a)) {
            str = "alreadyStarted";
        } else if (xhbVar.equals(thb.a)) {
            str = "bluetoothNotSupported";
        } else if (xhbVar.equals(whb.a)) {
            str = "permissionsMissing";
        } else if (xhbVar.equals(uhb.a)) {
            str = "characteristicsMissing";
        } else {
            if (!(xhbVar instanceof vhb)) {
                eg.o();
                return;
            }
            str = ((vhb) xhbVar).a;
        }
        ujbVarN.n(str);
        this.a.a(ujbVarN.build());
    }
}
