package p;

import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity;
import com.spotify.login.loginflowimpl.QuickLoginActivity;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity;
import com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import com.spotify.reporting.reportaction.ReportWebViewActivity;
import com.spotify.scannables.scannables.ScannablesActivity;
import com.spotify.scannables.scannables.view.ScannablesOnboardingActivity;
import com.spotify.wear.pinpairing.PinPairingActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v7q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ v7q(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new g1i(daqVar, (PictureSelectionActivity) obj);
            case 1:
                return new tnm(daqVar, (PinPairingActivity) obj);
            case 2:
                return new rzp(daqVar, (byte) 4);
            case 3:
                return new n0q(daqVar, (byte) 2);
            case 4:
                return new qqp(daqVar);
            case 5:
                return new tnm(daqVar, (PremiumAccountManagementWebviewActivity) obj);
            case 6:
                return new a1q((dl4) daqVar, (iac0) obj, (byte) 3);
            case 7:
                return new f0a(daqVar, (ProfileCompletionSheetHostActivity) obj);
            case 8:
                return new a0q(daqVar);
            case 9:
                return new k2q(daqVar, (byte) 3);
            case 10:
                return new yxo(daqVar, (QuickLoginActivity) obj);
            case 11:
                return new q0q(daqVar, (byte) 6);
            case 12:
                return new y0q(daqVar, (byte) 5);
            case 13:
                return new b6p(daqVar);
            case 14:
                return new b1q(daqVar, (byte) 6);
            case 15:
                return new tnm(daqVar, (ReportWebViewActivity) obj);
            case 16:
                return new yxo(daqVar, (ScannablesActivity) obj);
            case 17:
                return new toj0(daqVar, (ScannablesOnboardingActivity) obj);
            case 18:
                return new t2q(daqVar);
            case 19:
                return new jzp(daqVar, (byte) 2);
            case 20:
                return new n0q(daqVar, (byte) 3);
            case 21:
                return new p0q(daqVar, (byte) 5);
            case 22:
                return new k2q(daqVar, (byte) 6);
            case 23:
                return new em0(daqVar, (SocialListeningInfoDialogActivity) obj);
            case 24:
                return new rzp(daqVar, (byte) 5);
            case 25:
                return new uzp(daqVar, (byte) 7);
            case 26:
                return new pbq(daqVar, (SpotifyCheckoutActivity) obj);
            case 27:
                return new vzp(daqVar, (byte) 5);
            case 28:
                return new teq(daqVar, (SpotifyMainActivity) obj);
            default:
                return new ojq(daqVar, (SpotifyMediaBrowserService) obj);
        }
    }

    public /* synthetic */ v7q(daq daqVar, dl4 dl4Var, byte b) {
        this.a = b;
        this.b = daqVar;
    }
}
