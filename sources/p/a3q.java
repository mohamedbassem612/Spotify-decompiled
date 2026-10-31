package p;

import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;
import com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity;
import com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity;
import com.spotify.gpb.googlecheckout.GoogleCheckoutActivity;
import com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity;
import com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity;
import com.spotify.marquee.marquee.MarqueeActivity;
import com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity;
import com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity;
import com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity;
import com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity;
import com.spotify.payment.callback.PaymentCallbackActivity;
import com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider;
import com.spotify.tap.go.service.GoBluetoothService;
import com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a3q implements cl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ a3q(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public final dl4 a(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new uw0(daqVar, (GoBluetoothService) obj);
            case 1:
                return new qqp(daqVar, (GoogleCheckoutActivity) obj);
            case 2:
                return new k9k(daqVar, (HelpWebViewActivity) obj);
            case 3:
                return new wdm(daqVar, (IPLDialogsHostActivity) obj);
            case 4:
                return new em0(daqVar, (InAppBrowserActivity) obj);
            case 5:
                return new g1i(daqVar, (InAppBrowserLauncherActivity) obj);
            case 6:
                return new k9k(daqVar, (LearnMoreWebActivity) obj);
            case 7:
                return new g1i(daqVar, (LiveSharingRecordingDialogsHostActivity) obj);
            case 8:
                return new e3q(daqVar, (LoginActivity) obj);
            case 9:
                return new uzp(daqVar, (byte) 4);
            case 10:
                return new vzp(daqVar, (byte) 3);
            case 11:
                return new s3p(daqVar, (LyricsFullscreenPageActivity) obj);
            case 12:
                return new uw0(daqVar, (MarqueeActivity) obj);
            case 13:
                return new i3q(daqVar);
            case 14:
                return new wtp(daqVar);
            case 15:
                return new f9p(daqVar, (MiuiDynamicNpvWidgetProvider) obj);
            case 16:
                return new k2q(daqVar, (byte) 2);
            case 17:
                return new b1q(daqVar, (byte) 4);
            case 18:
                return new tnm(daqVar, (NotificationPermissionRequestActivity) obj);
            case 19:
                return new v5q(daqVar, (NowPlayingActivity) obj);
            case 20:
                return new f9p(daqVar, (NpvWidgetProvider) obj);
            case 21:
                return new k9k(daqVar, (OfflineDeviceLimitReachedActivity) obj);
            case 22:
                uq8 uq8Var = new uq8((byte) 26, false);
                uq8Var.b = iy81.a(new szp(daqVar, (byte) 8));
                return uq8Var;
            case 23:
                return new z0q(daqVar);
            case 24:
                return new kp5(daqVar, (OutputSwitcherPermissionNudgeActivity) obj);
            case 25:
                return new wtp(daqVar, (PageActivityProxy) obj);
            case 26:
                return new qqp(daqVar, (ParentalConsentWebActivity) obj);
            case 27:
                return new h72(daqVar, (PartnerAccountLinkingActivity) obj);
            case 28:
                return new k9k(daqVar, (PaymentCallbackActivity) obj);
            default:
                return new izp(daqVar, (byte) 5);
        }
    }
}
