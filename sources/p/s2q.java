package p;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity;
import com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.endless.sessionstarter.EndlessActivity;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;
import com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity;
import com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity;
import com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity;
import com.spotify.login.loginflowimpl.LoginActivity;
import com.spotify.login.loginflowimpl.QuickLoginActivity;
import com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity;
import com.spotify.marquee.marquee.MarqueeActivity;
import com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity;
import com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity;
import com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity;
import com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity;
import com.spotify.payment.callback.PaymentCallbackActivity;
import com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity;
import com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider;
import com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import com.spotify.reporting.reportaction.ReportWebViewActivity;
import com.spotify.tap.go.service.GoBluetoothService;
import com.spotify.wear.pinpairing.PinPairingActivity;
import com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider;
import com.spotify.widgets.npvwidget.m;
import com.spotify.widgets.npvwidget.u;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s2q implements jly0 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final byte c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ s2q(daq daqVar, Object obj, int i, byte b) {
        this.a = b;
        this.b = daqVar;
        this.d = obj;
        this.c = i;
    }

    public static /* bridge */ /* synthetic */ f9p a(s2q s2qVar) {
        return (f9p) s2qVar.d;
    }

    private final Object c() {
        wdm wdmVar = (wdm) this.d;
        byte b = 1;
        daq daqVar = this.b;
        byte b2 = this.c;
        switch (b2) {
            case 0:
                wdmVar.getClass();
                h380 h380VarB = j380.b(104);
                daq daqVar2 = (daq) wdmVar.c;
                hbq hbqVar = daqVar2.a;
                h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
                h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
                h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
                h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar2.c);
                h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
                h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
                h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
                h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
                h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar2.d);
                h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
                h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar2.e);
                h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
                h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar2.f);
                h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
                h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
                h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
                h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
                h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
                h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar2.g);
                h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
                h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
                h380VarB.e("p.k2l", daqVar2.h);
                h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar2.i);
                h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
                h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
                h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar2.t);
                h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar2.X);
                h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar2.Y);
                h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar2.Z);
                h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar2.N0);
                h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar2.O0);
                h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar2.P0);
                h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar2.Q0);
                h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
                h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
                h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar2.R0);
                h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar2.S0);
                h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
                h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
                h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar2.T0);
                h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
                h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
                h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
                h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
                h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
                h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
                h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar2.U0);
                h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
                h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
                h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar2.V0);
                h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar2.W0);
                h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar2.X0);
                h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
                h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
                h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
                h380VarB.e("p.fso0", daqVar2.Y0);
                h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
                h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar2.Z0);
                h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar2.a1);
                h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
                h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
                h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
                h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
                h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
                h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar2.b1);
                h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
                h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
                h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar2.c1);
                h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar2.d1);
                h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
                h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
                h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
                h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar2.e1);
                h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar2.f1);
                h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
                h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
                h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
                h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar2.g1);
                h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar2.h1);
                h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar2.i1);
                h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
                h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar2.j1);
                h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar2.k1);
                h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar2.l1);
                h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
                h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar2.m1);
                h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar2.n1);
                h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar2.o1);
                h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar2.p1);
                h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
                h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar2.q1);
                h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
                h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar2.r1);
                h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
                h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
                h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar2.s1);
                h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar2.t1);
                h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar2.u1);
                h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
                h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
                h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
                h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
                h380VarB.e("p.hx81", (s2q) wdmVar.d);
                h380VarB.e("p.u0a1", (s2q) wdmVar.e);
                return new jgu(h380VarB.b(true));
            case 1:
                return new n3q(daqVar, wdmVar, (byte) 0);
            case 2:
                return new n3q(daqVar, wdmVar, b);
            case 3:
                gu7 gu7Var = (gu7) ((jly0) wdmVar.h).get();
                daq daqVar3 = (daq) wdmVar.c;
                return t380.p(s2.p(gu7Var, new y4l(daqVar3.F(), (fpr) daqVar3.Ka.get(), daqVar3.k2())));
            case 4:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) wdmVar.g).get(), (yqg) daqVar.J1.get(), (IPLDialogsHostActivity) wdmVar.b);
            case 5:
                return j310.x((IPLDialogsHostActivity) wdmVar.b, (t8u0) daqVar.d9.get());
            case 6:
                IPLDialogsHostActivity iPLDialogsHostActivity = (IPLDialogsHostActivity) wdmVar.b;
                hbq hbqVar2 = daqVar.a;
                hbq hbqVar3 = daqVar.a;
                z1s z1sVarK = vp90.k((mkp) hbqVar2.a.ie.get());
                o1s o1sVar = (o1s) ((jly0) wdmVar.t).get();
                q8h1 q8h1Var = (q8h1) ((mkp) hbqVar3.a.ie.get()).a.l.get();
                c8o.l(q8h1Var);
                q8h1 q8h1Var2 = (q8h1) ((mkp) hbqVar3.a.ie.get()).a.l.get();
                c8o.l(q8h1Var2);
                g2z g2zVarC = vp90.C((uy90) daqVar.hc.get());
                www0 www0Var = (www0) daqVar.ac.get();
                daq daqVar4 = (daq) wdmVar.c;
                return new x1s(iPLDialogsHostActivity, z1sVarK, o1sVar, q8h1Var, q8h1Var2, g2zVarC, www0Var, new ats((sjb1) daqVar4.a.u1.get(), (s2q) wdmVar.X, (c9c0) daqVar4.Ed.get(), (z1s) daqVar4.bo.get(), (yqg) daqVar4.J1.get()), (c9n) daqVar.yh.get());
            case 7:
                return new o1s((IPLDialogsHostActivity) wdmVar.b);
            case 8:
                return ux51.j((xm41) daqVar.l5.get());
            case 9:
                return ((dg30) ((IPLDialogsHostActivity) wdmVar.b)).U0.t();
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object d() {
        em0 em0Var = (em0) this.d;
        daq daqVar = (daq) em0Var.c;
        InAppBrowserActivity inAppBrowserActivity = (InAppBrowserActivity) em0Var.b;
        daq daqVar2 = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                return t380.p(s2.p((gu7) ((jly0) em0Var.e).get(), new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
            case 1:
                return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) em0Var.d).get(), (yqg) daqVar2.J1.get(), inAppBrowserActivity);
            case 2:
                return j310.x(inAppBrowserActivity, (t8u0) daqVar2.d9.get());
            case 3:
                return new c580(inAppBrowserActivity, (xil1) ((jly0) em0Var.g).get(), new cql(inAppBrowserActivity), new yh71(inAppBrowserActivity), (ClipboardManager) inAppBrowserActivity.getSystemService("clipboard"), new a1g1(new gap1((Context) daqVar.x1.a), (byte) 6), new ilh1((lzn0) ((s2q) em0Var.t).get(), inAppBrowserActivity, (byte) 4), (zwz0) daqVar2.U1.get(), (g341) daqVar2.Fh.get(), (kt91) daqVar2.f8.get(), (t2j0) daqVar2.f2.get(), (yqg) daqVar2.J1.get(), new t8r0((Scheduler) daqVar.r3.get(), (Scheduler) daqVar.z1.get()), inAppBrowserActivity, ((byf) daqVar.Bm.get()).b(inAppBrowserActivity, new a42(inAppBrowserActivity, (byte) 4), new e4b1(inAppBrowserActivity, (byte) 3), inAppBrowserActivity, cxf.b, false, inAppBrowserActivity), (xn0) daqVar2.jb.get());
            case 4:
                return new xil1(new q6y(inAppBrowserActivity), new y441(CookieManager.getInstance(), new rl4(false, (luk) daqVar.L1.get())));
            case 5:
                g1n0 g1n0Var = (g1n0) ((jly0) em0Var.i).get();
                int i = t380.c;
                aan0.s(g1n0Var, kg11.t);
                return g1n0Var;
            case 6:
                return new g1n0(inAppBrowserActivity, (bi0) ((jly0) em0Var.h).get(), (fwn0) daqVar2.Pe.get(), (mwn0) daqVar2.Wd.get(), (String) daqVar2.Oe.get(), (syn0) daqVar2.Ug.get());
            case 7:
                return new yym0(inAppBrowserActivity);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object e() {
        g1i g1iVar = (g1i) this.d;
        InAppBrowserLauncherActivity inAppBrowserLauncherActivity = (InAppBrowserLauncherActivity) g1iVar.b;
        byte b = this.c;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) g1iVar.e).get();
            daq daqVar = (daq) g1iVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
        }
        daq daqVar2 = this.b;
        if (b == 1) {
            return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) g1iVar.d).get(), (yqg) daqVar2.J1.get(), inAppBrowserLauncherActivity);
        }
        if (b == 2) {
            return j310.x(inAppBrowserLauncherActivity, (t8u0) daqVar2.d9.get());
        }
        jah.e(b);
        return null;
    }

    private final Object f() {
        k9k k9kVar = (k9k) this.d;
        LearnMoreWebActivity learnMoreWebActivity = (LearnMoreWebActivity) k9kVar.b;
        byte b = this.c;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) k9kVar.e).get();
            daq daqVar = (daq) k9kVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
        }
        daq daqVar2 = this.b;
        if (b == 1) {
            return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) k9kVar.d).get(), (yqg) daqVar2.J1.get(), learnMoreWebActivity);
        }
        if (b == 2) {
            return j310.x(learnMoreWebActivity, (t8u0) daqVar2.d9.get());
        }
        jah.e(b);
        return null;
    }

    private final Object g() {
        g1i g1iVar = (g1i) this.d;
        LiveSharingRecordingDialogsHostActivity liveSharingRecordingDialogsHostActivity = (LiveSharingRecordingDialogsHostActivity) g1iVar.b;
        byte b = this.c;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) g1iVar.e).get();
            daq daqVar = (daq) g1iVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
        }
        daq daqVar2 = this.b;
        if (b == 1) {
            return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) g1iVar.d).get(), (yqg) daqVar2.J1.get(), liveSharingRecordingDialogsHostActivity);
        }
        if (b == 2) {
            return j310.x(liveSharingRecordingDialogsHostActivity, (t8u0) daqVar2.d9.get());
        }
        jah.e(b);
        return null;
    }

    private final Object h() {
        w6s w6sVar;
        lj01 lj01Var;
        e3q e3qVar = (e3q) this.d;
        byte b = 4;
        byte b2 = 3;
        byte b3 = 5;
        byte b4 = 1;
        byte b5 = 0;
        daq daqVar = this.b;
        byte b6 = this.c;
        switch (b6) {
            case 0:
                return new jgu(e3qVar.a());
            case 1:
                return new o2q(daqVar, e3qVar, (byte) 0);
            case 2:
                return new o2q(daqVar, e3qVar, b4);
            case 3:
                return new o2q(daqVar, e3qVar, (byte) 2);
            case 4:
                e3qVar.getClass();
                h380 h380VarB = j380.b(26);
                h380VarB.e(h22.class, k22.p(xqu.a(e3qVar.g)));
                h380VarB.e(qbs0.class, kmq0.c(xqu.a(e3qVar.i)));
                h380VarB.e(pyf.class, svf.b(xqu.a(e3qVar.t)));
                h380VarB.e(mh41.class, rx31.b(xqu.a(e3qVar.X)));
                h380VarB.e(fq81.class, rt71.k(xqu.a(e3qVar.r1)));
                h380VarB.e(fib1.class, fdb1.a(xqu.a(e3qVar.u1)));
                h380VarB.e(ze70.class, mw60.b(xqu.a(e3qVar.v1)));
                h380VarB.e(dj8.class, e78.c(xqu.a(e3qVar.x1)));
                h380VarB.e(k1f0.class, uge0.b(xqu.a(e3qVar.d1)));
                h380VarB.e(pf10.class, j310.e(xqu.a(e3qVar.e1)));
                h380VarB.e(qa50.class, mc40.h(xqu.a(e3qVar.z1)));
                h380VarB.e(wts0.class, gcs0.b(xqu.a(e3qVar.A1)));
                h380VarB.e(zdb.class, fva.a(xqu.a(e3qVar.k1)));
                h380VarB.e(mxw.class, bjv.n(xqu.a(e3qVar.l1)));
                h380VarB.e(u250.class, mc40.b(xqu.a(e3qVar.m1)));
                h380VarB.e(b21.class, wg0.f(xqu.a(e3qVar.H1)));
                h380VarB.e(qq91.class, j991.m(xqu.a(e3qVar.J1)));
                h380VarB.e(evw.class, bjv.m(xqu.a(e3qVar.L1)));
                h380VarB.e(twf0.class, zgf0.l(xqu.a(e3qVar.n1)));
                h380VarB.e(kwf0.class, zgf0.j(xqu.a(e3qVar.M1)));
                h380VarB.e(auk.class, wyj.b(xqu.a(e3qVar.N1)));
                h380VarB.e(c5l1.class, ulk1.a(xqu.a(e3qVar.O1)));
                h380VarB.e(fi2.class, f42.e(xqu.a(e3qVar.P1)));
                h380VarB.e(kk81.class, rt71.i(xqu.a(e3qVar.Q1)));
                h380VarB.e(uj81.class, rt71.b(xqu.a(e3qVar.U1)));
                h380VarB.e(epn0.class, aan0.a(xqu.a(e3qVar.p1)));
                return new a2k(h380VarB.b(true));
            case 5:
                return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
            case 6:
                return kmq0.h(e3qVar.h, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
            case 7:
                daq daqVar2 = e3qVar.b;
                gbs0 gbs0Var = new gbs0(daqVar2.D1(), new bx5((Context) daqVar2.x1.a));
                lvc lvcVar = new lvc((t2j0) e3qVar.b.f2.get());
                daq daqVar3 = e3qVar.b;
                return new lbs0(gbs0Var, lvcVar, new xcs0((dma1) daqVar3.C5.get(), (yqg) daqVar3.J1.get(), (nfa0) daqVar3.b2.get()));
            case 8:
                return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
            case 9:
                return rx31.c(daqVar.d8, daqVar.A5);
            case 10:
                s2q s2qVar = e3qVar.Y;
                jo80 jo80Var = e3qVar.Z;
                caq caqVar = daqVar.I4;
                jo80 jo80Var2 = daqVar.x1;
                s2q s2qVar2 = e3qVar.O0;
                caq caqVar2 = daqVar.z1;
                s2q s2qVar3 = e3qVar.P0;
                caq caqVar3 = daqVar.U5;
                g5t g5tVar = e3qVar.W0;
                s2q s2qVar4 = e3qVar.a1;
                s2q s2qVar5 = e3qVar.b1;
                s2q s2qVar6 = e3qVar.i1;
                caq caqVar4 = daqVar.j2;
                caq caqVar5 = daqVar.hm;
                jly0 jly0Var = daqVar.K3;
                jly0 jly0Var2 = daqVar.G3;
                s2q s2qVar7 = e3qVar.q1;
                caq caqVar6 = daqVar.Wd;
                gq81 gq81Var = new gq81();
                gq81Var.a = s2qVar;
                gq81Var.b = jo80Var;
                gq81Var.c = caqVar;
                gq81Var.d = jo80Var2;
                gq81Var.e = s2qVar2;
                gq81Var.f = caqVar2;
                gq81Var.g = s2qVar3;
                gq81Var.h = caqVar3;
                gq81Var.i = g5tVar;
                gq81Var.j = s2qVar4;
                gq81Var.k = s2qVar5;
                gq81Var.l = s2qVar6;
                gq81Var.m = caqVar4;
                gq81Var.n = caqVar5;
                gq81Var.o = jly0Var;
                gq81Var.f23p = jly0Var2;
                gq81Var.q = s2qVar7;
                gq81Var.r = caqVar6;
                return gq81Var;
            case 11:
                return new fd();
            case 12:
                LoginActivity loginActivity = e3qVar.a;
                gw70 gw70Var = (gw70) daqVar.d8.get();
                return new xfx(loginActivity, gw70Var, new sua((byte) 9));
            case 13:
                return new im4(false, (luk) daqVar.L1.get());
            case 14:
                return new x6s0(new flm((Application) e3qVar.b.x1.a));
            case 15:
                wlv0 wlv0Var = (wlv0) e3qVar.Q0.get();
                dzp0 dzp0VarB = e3qVar.b();
                r320 r320Var = (r320) e3qVar.S0.get();
                Scheduler scheduler = (Scheduler) daqVar.A2.get();
                gks0 gks0Var = (gks0) daqVar.qn.get();
                dp21 dp21Var = (dp21) daqVar.pn.get();
                gfo0 gfo0Var = (gfo0) e3qVar.T0.get();
                daq daqVar4 = e3qVar.b;
                return new fmy0(wlv0Var, dzp0VarB, r320Var, scheduler, gks0Var, dp21Var, gfo0Var, new kqc(dmx0.D((gma1) daqVar4.d3.get(), (Context) daqVar4.x1.a), (r320) e3qVar.S0.get()));
            case 16:
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar.Y3.get();
                jo80 jo80Var3 = e3qVar.Z;
                daq daqVar5 = e3qVar.b;
                return new wlv0(retrofitMaker, new uic((Activity) jo80Var3.a, dmx0.C((g420) daqVar5.O2.get()), (byte) 10), new ip31(upn1.r((Activity) e3qVar.Z.a), (x2g1) daqVar5.j2.get(), (ajg) daqVar5.a2.get(), (DisplayMetrics) daqVar5.Qd.get(), new jc9((Activity) e3qVar.Z.a, (byte) 16), new i6b((dxz0) daqVar5.I4.get(), (byte) 11), dmx0.g((yqg) daqVar5.J1.get()), (f1f0) daqVar5.vm.get()), (ohv0) daqVar.U5.get());
            case 17:
                return new r320(xqu.a(e3qVar.R0));
            case 18:
                return new mqc((Activity) e3qVar.Z.a, dmx0.C((g420) e3qVar.b.O2.get()));
            case 19:
                daq daqVar6 = e3qVar.b;
                dmx0.D((gma1) daqVar6.d3.get(), (Context) daqVar6.x1.a);
                return new gfo0();
            case 20:
                LoginActivity loginActivity2 = e3qVar.a;
                h380 h380VarB2 = j380.b(26);
                daq daqVar7 = e3qVar.b;
                h380VarB2.e(sjt.class, new awe0(uge0.j((Context) daqVar7.x1.a, (pbk1) daqVar7.Oh.get())));
                h380VarB2.e(kjt.class, sa50.d);
                h380VarB2.e(akt.class, new beb(rt71.k(xqu.a(e3qVar.r1)), (byte) 7));
                h380VarB2.e(bkt.class, sa50.h);
                h380VarB2.e(tjt.class, new beb(uge0.b(xqu.a(e3qVar.d1)), b));
                h380VarB2.e(ejt.class, e21.i);
                h380VarB2.e(ojt.class, new beb(j310.e(xqu.a(e3qVar.e1)), (byte) 2));
                h380VarB2.e(xjt.class, sa50.e);
                h380VarB2.e(rjt.class, sa50.b);
                h380VarB2.e(gjt.class, new beb(fva.a(xqu.a(e3qVar.k1)), (byte) 0));
                h380VarB2.e(mjt.class, new beb(bjv.n(xqu.a(e3qVar.l1)), (byte) 1));
                h380VarB2.e(qjt.class, new beb(mc40.b(xqu.a(e3qVar.m1)), b2));
                h380VarB2.e(zit.class, e21.b);
                h380VarB2.e(yit.class, e21.c);
                h380VarB2.e(bjt.class, e21.d);
                h380VarB2.e(ajt.class, e21.e);
                h380VarB2.e(ijt.class, e21.f);
                h380VarB2.e(jjt.class, e21.g);
                h380VarB2.e(sit.class, new beb(zgf0.l(xqu.a(e3qVar.n1)), b3));
                h380VarB2.e(ujt.class, sa50.c);
                h380VarB2.e(ljt.class, e21.j);
                h380VarB2.e(ckt.class, sa50.i);
                h380VarB2.e(djt.class, e21.h);
                h380VarB2.e(zjt.class, sa50.g);
                h380VarB2.e(yjt.class, sa50.f);
                h380VarB2.e(wjt.class, new beb(aan0.a(xqu.a(e3qVar.p1)), (byte) 6));
                return new kg0(h380VarB2.b(true), loginActivity2, (ohv0) daqVar.U5.get());
            case 21:
                jo80 jo80Var4 = daqVar.x1;
                jly0 jly0Var3 = e3qVar.V0;
                gbp gbpVar = daqVar.a.g1;
                g5t g5tVar2 = e3qVar.W0;
                jly0 jly0Var4 = e3qVar.X0;
                s2q s2qVar8 = e3qVar.Y0;
                caq caqVar7 = daqVar.U5;
                jly0 jly0Var5 = e3qVar.U0;
                jo80 jo80Var5 = e3qVar.Z;
                s2q s2qVar9 = e3qVar.a1;
                caq caqVar8 = daqVar.hm;
                g0f0 g0f0Var = new g0f0();
                g0f0Var.a = g5tVar2;
                g0f0Var.b = jly0Var4;
                g0f0Var.c = s2qVar8;
                g0f0Var.d = caqVar7;
                g0f0Var.e = jly0Var5;
                g0f0Var.f = jo80Var5;
                g0f0Var.g = s2qVar9;
                g0f0Var.h = caqVar8;
                return g0f0Var;
            case 22:
                return new ofx(((xfx) e3qVar.O0.get()).a, b5);
            case 23:
                e3qVar.getClass();
                return new lg0(j380.l(yit.class, f21.a));
            case 24:
                return new wwf0((Scheduler) daqVar.z1.get(), (RetrofitMaker) daqVar.Y3.get(), (nxf0) daqVar.a.h1.get(), (ajg) daqVar.a2.get());
            case 25:
                return ((fmy0) e3qVar.U0.get()).b().l;
            case 26:
                return new g69((Activity) e3qVar.Z.a, (g1f0) e3qVar.a1.get(), (ohv0) daqVar.U5.get());
            case 27:
                LoginActivity loginActivity3 = e3qVar.a;
                hce1 hce1Var = new hce1(loginActivity3.o(), new smm(loginActivity3, (i5u) e3qVar.b.rn.get(), (byte) 1), n9p1.s(loginActivity3));
                tka0 tka0VarB = rc11.a.b(dwe0.class);
                String strO = tka0VarB.o();
                if (strO != null) {
                    return hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
                }
                hhg1.n("Local and anonymous classes can not be ViewModels");
                return null;
            case 28:
                return (v4s0) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(v4s0.class, "android-login-passkeys-api");
            case 29:
                jly0 jly0Var6 = daqVar.tg;
                g5t g5tVar3 = e3qVar.W0;
                caq caqVar9 = daqVar.U5;
                caq caqVar10 = daqVar.z1;
                caq caqVar11 = daqVar.A2;
                caq caqVar12 = daqVar.hm;
                caq caqVar13 = daqVar.vg;
                nf10 nf10Var = new nf10();
                nf10Var.a = jly0Var6;
                nf10Var.b = g5tVar3;
                nf10Var.c = caqVar9;
                nf10Var.d = caqVar10;
                nf10Var.e = caqVar11;
                nf10Var.f = caqVar12;
                nf10Var.g = caqVar13;
                return nf10Var;
            case 30:
                jly0 jly0Var7 = e3qVar.V0;
                s2q s2qVar10 = e3qVar.Z0;
                s2q s2qVar11 = e3qVar.g1;
                caq caqVar14 = daqVar.U5;
                jly0 jly0Var8 = e3qVar.U0;
                g5t g5tVar4 = e3qVar.W0;
                jly0 jly0Var9 = e3qVar.X0;
                s2q s2qVar12 = e3qVar.a1;
                jo80 jo80Var6 = e3qVar.Z;
                caq caqVar15 = daqVar.hm;
                s2q s2qVar13 = e3qVar.h1;
                s2q s2qVar14 = e3qVar.j1;
                s2q s2qVar15 = e3qVar.i1;
                caq caqVar16 = daqVar.A5;
                caq caqVar17 = daqVar.Wd;
                jo80 jo80Var7 = daqVar.x1;
                caq caqVar18 = daqVar.vg;
                caq caqVar19 = daqVar.gm;
                caq caqVar20 = daqVar.lj;
                s2q s2qVar16 = e3qVar.c1;
                jly0 jly0Var10 = daqVar.Y3;
                jly0 jly0Var11 = daqVar.Z1;
                jly0 jly0Var12 = daqVar.b2;
                jly0 jly0Var13 = daqVar.sn;
                aeb aebVar = new aeb();
                aebVar.a = s2qVar10;
                aebVar.b = s2qVar11;
                aebVar.c = caqVar14;
                aebVar.d = jly0Var8;
                aebVar.e = g5tVar4;
                aebVar.f = jly0Var9;
                aebVar.g = s2qVar12;
                aebVar.h = jo80Var6;
                aebVar.i = caqVar15;
                aebVar.j = s2qVar13;
                aebVar.k = s2qVar14;
                aebVar.l = s2qVar15;
                aebVar.m = caqVar16;
                aebVar.n = caqVar17;
                aebVar.o = jo80Var7;
                aebVar.f5p = caqVar18;
                aebVar.q = caqVar19;
                aebVar.r = caqVar20;
                aebVar.s = s2qVar16;
                aebVar.t = jly0Var10;
                aebVar.u = jly0Var11;
                aebVar.v = jly0Var12;
                aebVar.w = jly0Var13;
                return aebVar;
            case 31:
                return new t0i((g3g1) e3qVar.f1.get());
            case 32:
                return new g3g1(e3qVar.b());
            case 33:
                return new lde0();
            case 34:
                return new hr81((br81) e3qVar.i1.get(), (String) daqVar.K3.get(), (String) daqVar.G3.get(), (x2g1) daqVar.j2.get());
            case 35:
                return (br81) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(br81.class, "android-login-signup-api-v2");
            case 36:
                g5t g5tVar5 = e3qVar.W0;
                caq caqVar21 = daqVar.U5;
                kxw kxwVar = new kxw();
                kxwVar.a = g5tVar5;
                kxwVar.b = caqVar21;
                return kxwVar;
            case 37:
                jo80 jo80Var8 = daqVar.x1;
                g5t g5tVar6 = e3qVar.W0;
                caq caqVar22 = daqVar.U5;
                jo80 jo80Var9 = e3qVar.Z;
                s2q s2qVar17 = e3qVar.a1;
                caq caqVar23 = daqVar.hm;
                caq caqVar24 = daqVar.vg;
                s250 s250Var = new s250();
                s250Var.a = jo80Var8;
                s250Var.b = g5tVar6;
                s250Var.c = caqVar22;
                s250Var.d = jo80Var9;
                s250Var.e = s2qVar17;
                s250Var.f = caqVar23;
                s250Var.g = caqVar24;
                return s250Var;
            case 38:
                s2q s2qVar18 = e3qVar.Y0;
                jly0 jly0Var14 = daqVar.a.h1;
                s2q s2qVar19 = e3qVar.h1;
                g5t g5tVar7 = e3qVar.W0;
                caq caqVar25 = daqVar.hm;
                caq caqVar26 = daqVar.Wd;
                uwf0 uwf0Var = new uwf0();
                uwf0Var.a = s2qVar18;
                uwf0Var.b = jly0Var14;
                uwf0Var.c = s2qVar19;
                uwf0Var.d = g5tVar7;
                uwf0Var.e = caqVar25;
                uwf0Var.f = caqVar26;
                return uwf0Var;
            case 39:
                jo80 jo80Var10 = e3qVar.Z;
                g5t g5tVar8 = e3qVar.W0;
                caq caqVar27 = daqVar.U5;
                s2q s2qVar20 = e3qVar.o1;
                caq caqVar28 = daqVar.hm;
                cpn0 cpn0Var = new cpn0();
                cpn0Var.a = jo80Var10;
                cpn0Var.b = g5tVar8;
                cpn0Var.c = caqVar27;
                cpn0Var.d = s2qVar20;
                cpn0Var.e = caqVar28;
                return cpn0Var;
            case 40:
                return ppn0.a;
            case 41:
                jo80 jo80Var11 = daqVar.x1;
                hbq hbqVar = daqVar.a;
                return new y0g((Context) jo80Var11.a, (iwe0) daqVar.Af.get(), (kg0) e3qVar.W0.get(), (pbk1) daqVar.Oh.get(), (w0g) hbqVar.i1.get(), (a1g) daqVar.Bf.get(), (dwr0) hbqVar.j1.get(), (q8n) daqVar.w1.get());
            case 42:
                caq caqVar29 = daqVar.lj;
                caq caqVar30 = daqVar.gm;
                hbq hbqVar2 = daqVar.a;
                gbp gbpVar2 = hbqVar2.k1;
                jo80 jo80Var12 = e3qVar.Z;
                jo80 jo80Var13 = daqVar.x1;
                jly0 jly0Var15 = e3qVar.V0;
                s2q s2qVar21 = e3qVar.Z0;
                jly0 jly0Var16 = daqVar.J1;
                s2q s2qVar22 = e3qVar.s1;
                jly0 jly0Var17 = daqVar.Z1;
                s2q s2qVar23 = e3qVar.f1;
                jly0 jly0Var18 = daqVar.d8;
                jly0 jly0Var19 = daqVar.sn;
                caq caqVar31 = daqVar.A2;
                jly0 jly0Var20 = daqVar.b2;
                s2q s2qVar24 = e3qVar.a1;
                caq caqVar32 = daqVar.Cf;
                caq caqVar33 = daqVar.z1;
                caq caqVar34 = daqVar.Wd;
                caq caqVar35 = daqVar.hm;
                s2q s2qVar25 = e3qVar.c1;
                caq caqVar36 = daqVar.qn;
                caq caqVar37 = daqVar.U5;
                jly0 jly0Var21 = e3qVar.U0;
                gbp gbpVar3 = hbqVar2.l1;
                s2q s2qVar26 = e3qVar.t1;
                g5t g5tVar9 = daqVar.z2;
                jly0 jly0Var22 = daqVar.W3;
                caq caqVar38 = daqVar.vg;
                caq caqVar39 = daqVar.A5;
                g5t g5tVar10 = e3qVar.W0;
                gib1 gib1Var = new gib1();
                gib1Var.a = caqVar29;
                gib1Var.b = caqVar30;
                gib1Var.c = gbpVar2;
                gib1Var.d = jo80Var12;
                gib1Var.e = jo80Var13;
                gib1Var.f = jly0Var15;
                gib1Var.g = s2qVar21;
                gib1Var.h = jly0Var16;
                gib1Var.i = jo80Var13;
                gib1Var.j = s2qVar22;
                gib1Var.k = jly0Var17;
                gib1Var.l = s2qVar23;
                gib1Var.m = jly0Var18;
                gib1Var.n = jly0Var19;
                gib1Var.o = caqVar31;
                gib1Var.p = jly0Var20;
                gib1Var.q = s2qVar24;
                gib1Var.r = caqVar32;
                gib1Var.s = caqVar33;
                gib1Var.t = caqVar34;
                gib1Var.u = caqVar35;
                gib1Var.v = s2qVar25;
                gib1Var.w = caqVar36;
                gib1Var.x = caqVar37;
                gib1Var.y = jly0Var21;
                gib1Var.z = gbpVar3;
                gib1Var.A = s2qVar26;
                gib1Var.B = g5tVar9;
                gib1Var.C = jly0Var22;
                gib1Var.D = caqVar38;
                gib1Var.E = caqVar39;
                gib1Var.F = g5tVar10;
                return gib1Var;
            case 43:
                return new o8r();
            case 44:
                zgz0 zgz0Var = new zgz0();
                zgz0Var.b = j5.a;
                return new l841(zgz0Var, (Context) daqVar.x1.a);
            case BetamaxPlaybackSession.MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER /* 45 */:
                return mw60.f(e3qVar.V0, e3qVar.Z0, daqVar.d8, e3qVar.s1, e3qVar.g1, daqVar.qn, e3qVar.U0, daqVar.U5, daqVar.A5, daqVar.Wd, e3qVar.W0, e3qVar.a1);
            case BetamaxPlaybackSession.MEDIA_TYPE_FIELD_NUMBER /* 46 */:
                return e78.f(e3qVar.Z, daqVar.vn, daqVar.wn, e3qVar.U0, e3qVar.W0, daqVar.yn, daqVar.zn, daqVar.x1, daqVar.U5, e3qVar.a1, e3qVar.w1, daqVar.ik, daqVar.j2, daqVar.An, daqVar.vg, e3qVar.c1, daqVar.Z1, daqVar.sn);
            case BetamaxPlaybackSession.MS_PLAYED_INTERNAL_FIELD_NUMBER /* 47 */:
                return new ph11(eth.V((xm41) daqVar.l5.get()), (byte) 5);
            case BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER /* 48 */:
                jo80 jo80Var14 = daqVar.x1;
                jly0 jly0Var23 = e3qVar.X0;
                g5t g5tVar11 = e3qVar.W0;
                caq caqVar40 = daqVar.z1;
                gbp gbpVar4 = daqVar.a.n1;
                caq caqVar41 = daqVar.Oh;
                ra50 ra50Var = new ra50();
                ra50Var.a = g5tVar11;
                ra50Var.b = caqVar40;
                ra50Var.c = gbpVar4;
                ra50Var.d = caqVar41;
                return ra50Var;
            case BetamaxPlaybackSession.MS_PLAYED_PER_SURFACE_FIELD_NUMBER /* 49 */:
                return eth.X((xm41) daqVar.V4.get()).map(vf61.X);
            case BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER /* 50 */:
                jo80 jo80Var15 = daqVar.x1;
                jly0 jly0Var24 = daqVar.b2;
                caq caqVar42 = daqVar.U5;
                s2q s2qVar27 = e3qVar.i1;
                g5t g5tVar12 = e3qVar.W0;
                caq caqVar43 = daqVar.z1;
                caq caqVar44 = daqVar.A2;
                caq caqVar45 = daqVar.hm;
                caq caqVar46 = daqVar.A5;
                caq caqVar47 = daqVar.Wd;
                s2q s2qVar28 = e3qVar.a1;
                xts0 xts0Var = new xts0();
                xts0Var.a = jo80Var15;
                xts0Var.b = jly0Var24;
                xts0Var.c = caqVar42;
                xts0Var.d = s2qVar27;
                xts0Var.e = g5tVar12;
                xts0Var.f = caqVar43;
                xts0Var.g = caqVar44;
                xts0Var.h = caqVar45;
                xts0Var.i = caqVar46;
                xts0Var.j = caqVar47;
                xts0Var.k = s2qVar28;
                return xts0Var;
            case 51:
                return wg0.e(e3qVar.B1, daqVar.z1, e3qVar.C1, daqVar.x1, daqVar.Bn, daqVar.Cn, daqVar.Y3, e3qVar.D1, e3qVar.E1, daqVar.Af, e3qVar.W0, e3qVar.X0, daqVar.U5, daqVar.h2, daqVar.j2, daqVar.tn, daqVar.K3, daqVar.G3, e3qVar.y1, e3qVar.F1, e3qVar.a1, daqVar.Dn, daqVar.Z1, e3qVar.i1, e3qVar.c1, daqVar.sn, daqVar.hm, daqVar.Wd, daqVar.J1, e3qVar.G1, daqVar.S5);
            case BetamaxPlaybackSession.DID_ATTEMPT_TO_PLAY_FIELD_NUMBER /* 52 */:
                fmy0 fmy0Var = (fmy0) e3qVar.U0.get();
                Activity activity = (Activity) e3qVar.Z.a;
                g1f0 g1f0Var = (g1f0) e3qVar.a1.get();
                wab wabVar = fmy0Var.b().l;
                boolean z = g1f0Var.b() && activity.getIntent().getBooleanExtra("is_web_login_flow_supported", true);
                eh8 eh8Var = eh8.AUTH_PROVIDER_EMAIL;
                nj01 nj01Var = y1d1.a;
                tf11 tf11VarA = ua20.a(wabVar, eh8Var, nj01Var);
                eh8 eh8Var2 = eh8.AUTH_PROVIDER_GOOGLE;
                nj01 nj01Var2 = a2d1.a;
                tf11 tf11VarA2 = ua20.a(wabVar, eh8Var2, nj01Var2);
                eh8 eh8Var3 = eh8.AUTH_PROVIDER_PHONE_NUMBER;
                e2d1 e2d1Var = e2d1.a;
                Set setB0 = dm61.B0(new tf11[]{tf11VarA, tf11VarA2, ua20.a(wabVar, eh8Var3, e2d1Var), ua20.a(wabVar, eh8.AUTH_PROVIDER_NAVER, d2d1.a)});
                boolean zJ = g1f0Var.J();
                w6s w6sVar2 = x1d1.a;
                w6s w6sVar3 = c2d1.a;
                if (zJ) {
                    w6sVar = w6sVar3;
                } else {
                    w6sVar = z ? b2d1.a : w6sVar2;
                }
                if (g1f0Var.d()) {
                    long jO = g1f0Var.o();
                    boolean zC = g1f0Var.c();
                    xkg0 xkg0Var = new xkg0();
                    if (g1f0Var.i()) {
                        xkg0Var.put(w6sVar2, Long.valueOf(g1f0Var.o()));
                    }
                    if (g1f0Var.f()) {
                        xkg0Var.put(e2d1Var, Long.valueOf(g1f0Var.O()));
                    }
                    if (g1f0Var.E()) {
                        xkg0Var.put(nj01Var2, Long.valueOf(g1f0Var.h()));
                    }
                    if (g1f0Var.m()) {
                        xkg0Var.put(w6sVar3, Long.valueOf(g1f0Var.t()));
                    }
                    if (g1f0Var.F()) {
                        xkg0Var.put(w1d1.a, Long.valueOf(g1f0Var.K()));
                    }
                    xkg0 xkg0VarB = xkg0Var.b();
                    nj01 nj01Var3 = g1f0Var.x() ? nj01Var : null;
                    if (!g1f0Var.M()) {
                        e2d1Var = null;
                    }
                    lj01Var = new lj01(jO, zC, xkg0VarB, dm61.B0(new nj01[]{nj01Var3, e2d1Var, g1f0Var.y() ? nj01Var2 : null}), g1f0Var.w());
                } else {
                    lj01Var = kj01.a;
                }
                return new a11(setB0, w6sVar, lj01Var);
            case BetamaxPlaybackSession.MS_PLAYED_AUDIBLE_FIELD_NUMBER /* 53 */:
                q2f0 q2f0VarA = uge0.A(new yfu((Context) daqVar.x1.a, (yqg) daqVar.J1.get(), (byte) 27));
                ql8 ql8VarZ = daqVar.z();
                si20 si20VarA0 = daqVar.a0();
                daq daqVar8 = e3qVar.b;
                return t380.v(q2f0VarA, ql8VarZ, si20VarA0, new fn7(new g23((r2b1) daqVar8.al.get(), ce7.n((o1p) daqVar8.i2.get()), ce7.o((o1p) daqVar8.i2.get()), (byte) 27)));
            case BetamaxPlaybackSession.PLAYBACK_ID_FIELD_NUMBER /* 54 */:
                return new ou71((dma1) daqVar.C1.get());
            case BetamaxPlaybackSession.PLAYER_ID_FIELD_NUMBER /* 55 */:
                return new x01((dma1) daqVar.C1.get());
            case BetamaxPlaybackSession.MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER /* 56 */:
                Object obj = e3qVar.Z.a;
                return new a031((Activity) obj, new dms0((Activity) obj), (iwe0) daqVar.Af.get());
            case 57:
                sam0 sam0Var = (xm41) daqVar.V4.get();
                Activity activity2 = (Activity) e3qVar.Z.a;
                pz11 pz11Var = (pz11) daqVar.e2.get();
                xav0 xav0Var = (xav0) daqVar.l2.get();
                p811 p811Var = new p811();
                sam0Var.e(new hla(p811Var, (byte) 1), new i3(p811Var, (byte) 5));
                return new g2t(activity2, pz11Var, xav0Var, p811Var);
            case 58:
                g5t g5tVar13 = e3qVar.W0;
                caq caqVar48 = daqVar.U5;
                s2q s2qVar29 = e3qVar.I1;
                jly0 jly0Var25 = daqVar.f8;
                jly0 jly0Var26 = daqVar.J1;
                s2q s2qVar30 = e3qVar.a1;
                caq caqVar49 = daqVar.hm;
                caq caqVar50 = daqVar.Wd;
                tq91 tq91Var = new tq91();
                tq91Var.a = g5tVar13;
                tq91Var.b = caqVar48;
                tq91Var.c = s2qVar29;
                tq91Var.d = jly0Var25;
                tq91Var.e = jly0Var26;
                tq91Var.f = s2qVar30;
                tq91Var.g = caqVar49;
                tq91Var.h = caqVar50;
                return tq91Var;
            case 59:
                return new nw40((Activity) e3qVar.Z.a);
            case 60:
                g5t g5tVar14 = e3qVar.W0;
                caq caqVar51 = daqVar.U5;
                s2q s2qVar31 = e3qVar.K1;
                jly0 jly0Var27 = daqVar.J1;
                caq caqVar52 = daqVar.hm;
                xvw xvwVar = new xvw();
                xvwVar.a = g5tVar14;
                xvwVar.b = caqVar51;
                xvwVar.c = s2qVar31;
                xvwVar.d = jly0Var27;
                xvwVar.e = caqVar52;
                return xvwVar;
            case 61:
                return new bvw();
            case 62:
                caq caqVar53 = daqVar.Af;
                jly0 jly0Var28 = daqVar.a.h1;
                g5t g5tVar15 = e3qVar.W0;
                lwf0 lwf0Var = new lwf0();
                lwf0Var.a = caqVar53;
                lwf0Var.b = jly0Var28;
                lwf0Var.c = g5tVar15;
                return lwf0Var;
            case 63:
                jo80 jo80Var16 = daqVar.x1;
                g5t g5tVar16 = e3qVar.W0;
                gbp gbpVar5 = daqVar.a.o1;
                caq caqVar54 = daqVar.hm;
                caq caqVar55 = daqVar.A5;
                jly0 jly0Var29 = e3qVar.U0;
                jly0 jly0Var30 = daqVar.U1;
                buk bukVar = new buk();
                bukVar.a = g5tVar16;
                bukVar.b = gbpVar5;
                bukVar.c = caqVar54;
                bukVar.d = caqVar55;
                bukVar.e = jly0Var29;
                bukVar.f = jly0Var30;
                return bukVar;
            case 64:
                jo80 jo80Var17 = daqVar.x1;
                jly0 jly0Var31 = e3qVar.X0;
                g5t g5tVar17 = e3qVar.W0;
                jly0 jly0Var32 = e3qVar.U0;
                caq caqVar56 = daqVar.Xe;
                s2q s2qVar32 = e3qVar.y1;
                caq caqVar57 = daqVar.z1;
                caq caqVar58 = daqVar.A2;
                gbp gbpVar6 = daqVar.a.o1;
                s2q s2qVar33 = e3qVar.a1;
                s2q s2qVar34 = e3qVar.q1;
                caq caqVar59 = daqVar.Bf;
                jly0 jly0Var33 = e3qVar.G1;
                caq caqVar60 = daqVar.S5;
                jly0 jly0Var34 = daqVar.h2;
                caq caqVar61 = daqVar.j2;
                d5l1 d5l1Var = new d5l1();
                d5l1Var.a = jly0Var31;
                d5l1Var.b = g5tVar17;
                d5l1Var.c = jly0Var32;
                d5l1Var.d = caqVar56;
                d5l1Var.e = s2qVar32;
                d5l1Var.f = caqVar57;
                d5l1Var.g = caqVar58;
                d5l1Var.h = gbpVar6;
                d5l1Var.i = s2qVar33;
                d5l1Var.j = s2qVar33;
                d5l1Var.k = s2qVar34;
                d5l1Var.l = caqVar59;
                d5l1Var.m = jly0Var33;
                d5l1Var.n = caqVar60;
                d5l1Var.o = jly0Var34;
                d5l1Var.p = caqVar61;
                return d5l1Var;
            case 65:
                jo80 jo80Var18 = daqVar.x1;
                g5t g5tVar18 = e3qVar.W0;
                caq caqVar62 = daqVar.A5;
                gi2 gi2Var = new gi2();
                gi2Var.a = g5tVar18;
                gi2Var.b = caqVar62;
                return gi2Var;
            case 66:
                caq caqVar63 = daqVar.V2;
                s2q s2qVar35 = e3qVar.F1;
                g5t g5tVar19 = e3qVar.W0;
                caq caqVar64 = daqVar.Bf;
                hbq hbqVar3 = daqVar.a;
                gbp gbpVar7 = hbqVar3.i1;
                gbp gbpVar8 = hbqVar3.p1;
                jly0 jly0Var35 = daqVar.d8;
                caq caqVar65 = daqVar.hm;
                lk81 lk81Var = new lk81();
                lk81Var.a = caqVar63;
                lk81Var.b = s2qVar35;
                lk81Var.c = g5tVar19;
                lk81Var.d = caqVar64;
                lk81Var.e = gbpVar7;
                lk81Var.f = gbpVar8;
                lk81Var.g = jly0Var35;
                lk81Var.h = caqVar65;
                return lk81Var;
            case 67:
                jly0 jly0Var36 = daqVar.d8;
                g5t g5tVar20 = e3qVar.W0;
                s2q s2qVar36 = e3qVar.T1;
                caq caqVar66 = daqVar.Bf;
                gbp gbpVar9 = daqVar.a.p1;
                caq caqVar67 = daqVar.hm;
                s2q s2qVar37 = e3qVar.R1;
                sj81 sj81Var = new sj81();
                sj81Var.a = jly0Var36;
                sj81Var.b = g5tVar20;
                sj81Var.c = s2qVar36;
                sj81Var.d = caqVar66;
                sj81Var.e = gbpVar9;
                sj81Var.f = caqVar67;
                sj81Var.g = s2qVar37;
                return sj81Var;
            case 68:
                return new cd71(e3qVar.a.e0(), new uww0(xqu.a(e3qVar.S1), (byte) 12));
            case 69:
                caq caqVar68 = daqVar.Bf;
                gbp gbpVar10 = daqVar.a.j1;
                caq caqVar69 = daqVar.hm;
                s2q s2qVar38 = e3qVar.R1;
                rk81 rk81Var = new rk81();
                rk81Var.a = caqVar68;
                rk81Var.b = gbpVar10;
                rk81Var.c = caqVar69;
                rk81Var.d = s2qVar38;
                return rk81Var;
            case 70:
                return new z710((Activity) e3qVar.Z.a, (kt91) e3qVar.b.f8.get());
            case 71:
                return new bwe0();
            default:
                jah.e(b6);
                return null;
        }
    }

    private final Object i() {
        s3p s3pVar = (s3p) this.d;
        daq daqVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                gu7 gu7Var = (gu7) ((jly0) s3pVar.b).get();
                daq daqVar2 = (daq) s3pVar.Y0;
                return t380.p(s2.p(gu7Var, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
            case 1:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) s3pVar.a).get(), (yqg) daqVar.J1.get(), (LyricsFullscreenPageActivity) s3pVar.X0);
            case 2:
                return j310.x((LyricsFullscreenPageActivity) s3pVar.X0, (t8u0) daqVar.d9.get());
            case 3:
                return new a2k(j380.n(h22.class, new h21(xqu.a((s2q) s3pVar.a1), (byte) 3), qbs0.class, new t700(xqu.a((s2q) s3pVar.c1), (byte) 24), pyf.class, new h21(xqu.a((s2q) s3pVar.d1), (byte) 14), mh41.class, new uww0(xqu.a((s2q) s3pVar.e1), (byte) 7)));
            case 4:
                return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
            case 5:
                return kmq0.h((s2q) s3pVar.b1, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
            case 6:
                daq daqVar3 = (daq) s3pVar.Y0;
                daq daqVar4 = (daq) s3pVar.Y0;
                return new lbs0(new gbs0(daqVar3.D1(), new bx5((Context) daqVar3.x1.a)), new lvc((t2j0) daqVar4.f2.get()), new xcs0((dma1) daqVar4.C5.get(), (yqg) daqVar4.J1.get(), (nfa0) daqVar4.b2.get()));
            case 7:
                return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
            case 8:
                return rx31.c(daqVar.d8, daqVar.A5);
            case 9:
                return ((dg30) ((LyricsFullscreenPageActivity) s3pVar.X0)).U0.t();
            case 10:
                return new mqp(this, (byte) 1);
            case 11:
                t3b1 t3b1Var = (LyricsFullscreenPageActivity) s3pVar.X0;
                gw70 gw70Var = (gw70) daqVar.d8.get();
                return new xfx(t3b1Var, gw70Var, new sua((byte) 9));
            case 12:
                return new im4(false, (luk) daqVar.L1.get());
            case 13:
                return s3pVar.h().b;
            case 14:
                return new loc1();
            case 15:
                return s3pVar.h().a().x(e710.N0);
            case 16:
                return new in4((luk) daqVar.L1.get());
            case 17:
                return f2u0.C(f2u0.D((Flowable) ((jly0) s3pVar.e).get()), (Flowable) ((jly0) s3pVar.f).get(), (Flowable) ((jly0) s3pVar.g).get(), s3pVar.a());
            case 18:
                return f2u0.A((Flowable) ((jly0) s3pVar.e).get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get(), s3pVar.a());
            case 19:
                return f2u0.y((Flowable) ((jly0) s3pVar.e).get(), s3pVar.a());
            case 20:
                return new rwa0((PublishProcessor) ((jly0) s3pVar.i).get(), (byte) 18);
            case 21:
                return new PublishProcessor();
            case 22:
                return f2u0.B(f2u0.D((Flowable) ((jly0) s3pVar.e).get()), (Flowable) ((jly0) s3pVar.X).get(), (Flowable) ((jly0) s3pVar.g).get(), s3pVar.a());
            case 23:
                return f2u0.z((Flowable) ((jly0) s3pVar.e).get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get(), s3pVar.a());
            case 24:
                return new lm30((LyricsFullscreenPageActivity) s3pVar.X0, (byte) 1);
            case 25:
                return new FlowableOnBackpressureLatest((PublishProcessor) ((jly0) s3pVar.i).get());
            case 26:
                return new xh71((LyricsFullscreenPageActivity) s3pVar.X0, (qfb0) daqVar.Ag.get(), (a1r0) ((jly0) s3pVar.O0).get(), (q8n) daqVar.w1.get());
            case 27:
                return new c1r0((LyricsFullscreenPageActivity) s3pVar.X0, (mwn0) daqVar.Wd.get());
            case 28:
                return new hq41((tp41) daqVar.Dg.get(), (j810) daqVar.En.get(), (xh71) ((s2q) s3pVar.k1).get(), (q8n) daqVar.E1.get());
            case 29:
                return new cr4(false, false, false, (luk) daqVar.L1.get());
            case 30:
                return new er4(false, false, (luk) daqVar.L1.get());
            case 31:
                return new sm4(false, (luk) daqVar.L1.get());
            case 32:
                ynb0 ynb0VarA = xqu.a((jly0) s3pVar.P0);
                s8a1 s8a1Var = (s8a1) ((jly0) s3pVar.T0).get();
                return new oov0(s8a1Var != null ? (d0r) ynb0VarA.get() : null, s8a1Var, (q8n) daqVar.r2.get());
            case 33:
                dv00 dv00Var = (dv00) ((daq) s3pVar.Y0).j8.get();
                LyricsFullscreenPageActivity lyricsFullscreenPageActivity = (LyricsFullscreenPageActivity) s3pVar.X0;
                j3r j3rVar = rzq.y;
                rzq rzqVarF = l2p1.f(dv00Var);
                ((f0i) lyricsFullscreenPageActivity).a.a(new lt1(rzqVarF, (byte) 2));
                return rzqVarF;
            case 34:
                nqp nqpVar = (nqp) ((jly0) s3pVar.S0).get();
                ynb0 ynb0VarA2 = xqu.a((jly0) s3pVar.P0);
                if (new br4(false, false, (luk) ((daq) s3pVar.Y0).L1.get()).b()) {
                    return nqpVar.a((d0r) ynb0VarA2.get());
                }
                return null;
            case 35:
                return new nqp(this, (byte) 1);
            case 36:
                g1n0 g1n0Var = (g1n0) ((jly0) s3pVar.R0).get();
                int i = t380.c;
                aan0.s(g1n0Var, kg11.t);
                return g1n0Var;
            case 37:
                return new g1n0((LyricsFullscreenPageActivity) s3pVar.X0, (bi0) ((jly0) s3pVar.Q0).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
            case 38:
                return new yym0((LyricsFullscreenPageActivity) s3pVar.X0);
            case 39:
                oqp oqpVar = (oqp) ((jly0) s3pVar.V0).get();
                ynb0 ynb0VarA3 = xqu.a((jly0) s3pVar.P0);
                if (new br4(false, false, (luk) ((daq) s3pVar.Y0).L1.get()).a()) {
                    return oqpVar.a((d0r) ynb0VarA3.get());
                }
                return null;
            case 40:
                return new oqp(this, (byte) 1);
            case 41:
                c2r0 c2r0Var = (c2r0) daqVar.hm.get();
                s2q s2qVar = (s2q) s3pVar.r1;
                LyricsFullscreenPageActivity lyricsFullscreenPageActivity2 = (LyricsFullscreenPageActivity) s3pVar.X0;
                lik1 lik1Var = (lik1) s2qVar.get();
                n6r0 n6r0VarP = kmq0.p(lyricsFullscreenPageActivity2);
                String str = lik1Var.a;
                return c2r0Var.e(lyricsFullscreenPageActivity2, n6r0VarP, str != null ? new qir0(str) : null);
            case 42:
                return d8.c((LyricsFullscreenPageActivity) s3pVar.X0);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object j() {
        uw0 uw0Var = (uw0) this.d;
        byte b = 1;
        daq daqVar = this.b;
        byte b2 = this.c;
        switch (b2) {
            case 0:
                uw0Var.getClass();
                h380 h380VarB = j380.b(105);
                daq daqVar2 = (daq) uw0Var.e;
                hbq hbqVar = daqVar2.a;
                h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
                h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
                h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
                h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar2.c);
                h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
                h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
                h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
                h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
                h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar2.d);
                h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
                h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar2.e);
                h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
                h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar2.f);
                h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
                h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
                h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
                h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
                h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
                h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar2.g);
                h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
                h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
                h380VarB.e("p.k2l", daqVar2.h);
                h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar2.i);
                h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
                h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
                h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar2.t);
                h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar2.X);
                h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar2.Y);
                h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar2.Z);
                h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar2.N0);
                h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar2.O0);
                h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar2.P0);
                h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar2.Q0);
                h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
                h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
                h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar2.R0);
                h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar2.S0);
                h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
                h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
                h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar2.T0);
                h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
                h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
                h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
                h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
                h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
                h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
                h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar2.U0);
                h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
                h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
                h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar2.V0);
                h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar2.W0);
                h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar2.X0);
                h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
                h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
                h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
                h380VarB.e("p.fso0", daqVar2.Y0);
                h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
                h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar2.Z0);
                h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar2.a1);
                h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
                h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
                h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
                h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
                h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
                h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar2.b1);
                h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
                h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
                h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar2.c1);
                h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar2.d1);
                h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
                h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
                h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
                h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar2.e1);
                h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar2.f1);
                h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
                h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
                h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
                h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar2.g1);
                h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar2.h1);
                h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar2.i1);
                h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
                h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar2.j1);
                h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar2.k1);
                h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar2.l1);
                h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
                h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar2.m1);
                h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar2.n1);
                h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar2.o1);
                h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar2.p1);
                h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
                h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar2.q1);
                h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
                h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar2.r1);
                h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
                h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
                h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar2.s1);
                h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar2.t1);
                h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar2.u1);
                h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
                h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
                h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
                h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
                h380VarB.e("p.mwg0", (s2q) uw0Var.f);
                h380VarB.e("p.bvg0", (s2q) uw0Var.g);
                h380VarB.e("p.ts10", (s2q) uw0Var.h);
                return new jgu(h380VarB.b(true));
            case 1:
                return new x2q(daqVar, uw0Var, (byte) 2);
            case 2:
                return new x2q(daqVar, uw0Var, b);
            case 3:
                return new x2q(daqVar, uw0Var, (byte) 0);
            case 4:
                gu7 gu7Var = (gu7) ((jly0) uw0Var.X).get();
                daq daqVar3 = (daq) uw0Var.e;
                return t380.p(s2.p(gu7Var, new y4l(daqVar3.F(), (fpr) daqVar3.Ka.get(), daqVar3.k2())));
            case 5:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) uw0Var.t).get(), (yqg) daqVar.J1.get(), (MarqueeActivity) uw0Var.d);
            case 6:
                return j310.x((MarqueeActivity) uw0Var.d, (t8u0) daqVar.d9.get());
            case 7:
                g1n0 g1n0Var = (g1n0) ((jly0) uw0Var.Z).get();
                int i = t380.c;
                aan0.s(g1n0Var, kg11.t);
                return g1n0Var;
            case 8:
                return new g1n0((MarqueeActivity) uw0Var.d, (bi0) ((jly0) uw0Var.Y).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
            case 9:
                return new yym0((MarqueeActivity) uw0Var.d);
            case 10:
                return new rwg0((Resources) ((s2q) uw0Var.N0).get());
            case 11:
                return ((MarqueeActivity) uw0Var.d).getResources();
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object k() {
        f9p f9pVar = (f9p) this.d;
        daq daqVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                return new u5b1((MiuiDynamicNpvWidgetProvider) f9pVar.t, (Context) daqVar.x1.a);
            case 1:
                return new ry30((t2j0) daqVar.f2.get(), (ru71) ((jly0) f9pVar.b).get(), (String) daqVar.k2.get(), (co40) daqVar.Q4.get(), (p85) daqVar.Il.get());
            case 2:
                return new ru71((Context) daqVar.x1.a, (ut71) daqVar.g2.get());
            case 3:
                daq daqVar2 = (daq) f9pVar.X;
                daq daqVar3 = (daq) f9pVar.X;
                return new u(new pck1((Context) daqVar2.x1.a, xqu.a((s2q) f9pVar.P0), xqu.a((s2q) f9pVar.Q0), xqu.a((s2q) f9pVar.R0), daqVar2.R1(), xqu.a((s2q) f9pVar.S0), (mr20) daqVar2.u5.get(), f9pVar.m(), new p2f0((ru71) ((jly0) f9pVar.b).get(), (mr20) daqVar2.cc.get()), (p85) daqVar2.Il.get(), f9pVar.f(), xqu.a((s2q) f9pVar.X0)), f9pVar.k(), f9pVar.k(), f9pVar.k(), new lb((Context) daqVar3.x1.a), (ne11) daqVar.fm.get(), (q8n) daqVar.E1.get(), (zle1) daqVar.a3.get(), (tol1) ((s2q) f9pVar.Y0).get(), (wu71) ((s2q) f9pVar.T0).get(), new m((i8h1) daqVar3.A5.get(), (mwn0) daqVar3.Wd.get()));
            case 4:
                m111 m111VarX = f9pVar.x();
                daq daqVar4 = (daq) f9pVar.X;
                return new gf0(new hyy0(m111VarX, (y011) daqVar4.fm.get(), (byte) 14), f9pVar.g(), f9pVar.m(), (p85) daqVar.Il.get(), f9pVar.e(), (om40) daqVar.Jl.get(), (q8n) daqVar.E1.get(), new il00((p85) daqVar4.Il.get(), (byte) 7), new ffe1(f9pVar.e(), ((Context) daqVar4.x1.a).getString(2131952026), (byte) 7), w081.p((Context) daqVar4.x1.a));
            case 5:
                zhq0 zhq0Var = new zhq0((Context) ((daq) f9pVar.X).x1.a);
                mih0 mih0Var = (mih0) ((jly0) f9pVar.c).get();
                daq daqVar5 = (daq) f9pVar.X;
                return new ktc(zhq0Var, mih0Var, new sp00((mr20) daqVar5.cc.get(), new ow3((Context) daqVar5.x1.a, (g420) daqVar5.O2.get()), (nfa0) daqVar5.b2.get(), (q8n) daqVar5.E1.get(), (byte) 9));
            case 6:
                return new e1q(this, (byte) 1);
            case 7:
                return new piq0(new zhq0((Context) ((daq) f9pVar.X).x1.a), (mih0) ((jly0) f9pVar.c).get());
            case 8:
                return new lw70((gw70) daqVar.d8.get(), (q8n) daqVar.E1.get());
            case 9:
                return new bv00((uu00) daqVar.a5.get(), (q8n) daqVar.E1.get());
            case 10:
                return new bv00(xqu.a((s2q) f9pVar.O0), (q8n) daqVar.E1.get());
            case 11:
                return mw60.v((RetrofitMaker) daqVar.Y3.get());
            case 12:
                m111 m111VarX2 = f9pVar.x();
                daq daqVar6 = (daq) f9pVar.X;
                return new b880(new hyy0(m111VarX2, (y011) daqVar6.fm.get(), (byte) 14), f9pVar.g(), (Context) daqVar.x1.a, f9pVar.m(), new il00((p85) daqVar6.Il.get(), (byte) 7), f9pVar.e(), (q8n) daqVar.E1.get(), (agc0) daqVar.B7.get(), w081.p((Context) daqVar6.x1.a));
            case 13:
                m111 m111VarX3 = f9pVar.x();
                daq daqVar7 = (daq) f9pVar.X;
                return new rfh1(m111VarX3, new hlr((t2j0) daqVar7.f2.get()), (mr20) daqVar.Mn.get(), (q8n) daqVar.E1.get(), w081.p((Context) daqVar7.x1.a));
            case 14:
                return new uq40((uu00) daqVar.a5.get());
            case 15:
                daq daqVar8 = (daq) f9pVar.X;
                y441 y441Var = new y441(new l85(false, (luk) daqVar8.L1.get()), (wu71) ((s2q) f9pVar.T0).get(), new yzu(new iuw((Context) daqVar8.x1.a, (ut71) daqVar8.g2.get()), (huw) ((RetrofitMaker) daqVar8.Y3.get()).createWebgateService(huw.class, "android-widgets-wrapped-eligibility"), (mr20) daqVar8.cc.get(), (nuw) daqVar8.Nn.get()), (cv71) ((s2q) f9pVar.U0).get());
                xim1 xim1Var = (xim1) ((s2q) f9pVar.V0).get();
                zsc zscVarF = f9pVar.f();
                s2q s2qVar = (s2q) f9pVar.W0;
                daq daqVar9 = (daq) f9pVar.X;
                return new hjm1(y441Var, xim1Var, zscVarF, new o860(s2qVar, (rol1) daqVar9.Ln.get(), (yqg) daqVar9.J1.get(), (e080) daqVar9.Pn.get(), (byte) 8));
            case 16:
                return new wu71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case 17:
                return new cv71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case 18:
                f9pVar.getClass();
                daq daqVar10 = (daq) f9pVar.X;
                return new xim1(new wpl1((upl1) ((RetrofitMaker) daqVar10.Y3.get()).createWebgateService(upl1.class, "android-widgets-dynamicnpvwidget-wrapped-resources"), new mx21((Context) daqVar10.x1.a, (ut71) daqVar10.g2.get())), new zrj1(new ezb1((k931) ((RetrofitMaker) daqVar10.Y3.get()).createWebgateService(k931.class, "android-widgets-dynamicnpvwidget-wrapped-retrieval"), (byte) 1), (ohm1) daqVar10.On.get(), (cv71) ((s2q) f9pVar.U0).get(), (byte) 17));
            case 19:
                return new jw70((gw70) daqVar.d8.get());
            case 20:
                return new vol1("MIUI_HOME_SCREEN", xqu.a(daqVar.Gl));
            case 21:
                return new rsc((ru71) ((jly0) f9pVar.b).get());
            case 22:
                return new tx5((Context) daqVar.x1.a, (MiuiDynamicNpvWidgetProvider) f9pVar.t, (ox5) daqVar.Gl.get());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object l() {
        byte b = this.c;
        if (b == 0) {
            return new xup(this, (byte) 1);
        }
        if (b != 1) {
            if (b == 2) {
                return k9o0.v((q2p0) ((cp31) this.d).a);
            }
            jah.e(b);
            return null;
        }
        daq daqVar = this.b;
        return new tnu((wdf0) daqVar.Qr.get(), (Flowable) daqVar.D5.get(), (tdf0) daqVar.Cr.get());
    }

    private final Object m() {
        tnm tnmVar = (tnm) this.d;
        daq daqVar = (daq) tnmVar.c;
        NotificationPermissionRequestActivity notificationPermissionRequestActivity = (NotificationPermissionRequestActivity) tnmVar.b;
        byte b = 1;
        byte b2 = this.c;
        if (b2 != 0) {
            daq daqVar2 = this.b;
            if (b2 == 1) {
                return new s0q(daqVar2, tnmVar, b);
            }
            if (b2 == 2) {
                return t380.p(s2.p((gu7) ((jly0) tnmVar.g).get(), new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
            }
            if (b2 == 3) {
                return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) tnmVar.f).get(), (yqg) daqVar2.J1.get(), notificationPermissionRequestActivity);
            }
            if (b2 == 4) {
                return j310.x(notificationPermissionRequestActivity, (t8u0) daqVar2.d9.get());
            }
            jah.e(b2);
            return null;
        }
        h380 h380VarB = j380.b(103);
        hbq hbqVar = daqVar.a;
        h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
        h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
        h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
        h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar.c);
        h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
        h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
        h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
        h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
        h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar.d);
        h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
        h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar.e);
        h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
        h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar.f);
        h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
        h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
        h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
        h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
        h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
        h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar.g);
        h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
        h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
        h380VarB.e("p.k2l", daqVar.h);
        h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar.i);
        h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
        h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar.t);
        h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar.X);
        h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar.Y);
        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar.Z);
        h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar.N0);
        h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar.O0);
        h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar.P0);
        h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar.Q0);
        h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
        h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
        h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar.R0);
        h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar.S0);
        h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
        h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
        h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar.T0);
        h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
        h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
        h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
        h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
        h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
        h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
        h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar.U0);
        h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
        h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
        h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar.V0);
        h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar.W0);
        h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar.X0);
        h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
        h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
        h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
        h380VarB.e("p.fso0", daqVar.Y0);
        h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
        h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar.Z0);
        h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar.a1);
        h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
        h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
        h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
        h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
        h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
        h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar.b1);
        h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
        h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
        h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar.c1);
        h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar.d1);
        h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
        h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
        h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
        h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar.e1);
        h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar.f1);
        h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
        h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
        h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
        h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar.g1);
        h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar.h1);
        h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar.i1);
        h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
        h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar.j1);
        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar.k1);
        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar.l1);
        h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
        h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar.m1);
        h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar.n1);
        h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar.o1);
        h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar.p1);
        h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
        h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar.q1);
        h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
        h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar.r1);
        h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
        h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
        h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar.s1);
        h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar.t1);
        h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar.u1);
        h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
        h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
        h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
        h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
        h380VarB.e("p.sso0", (s2q) tnmVar.d);
        return new jgu(h380VarB.b(true));
    }

    private final Object n() {
        f9p f9pVar = (f9p) this.d;
        daq daqVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                return new u5b1((NpvWidgetProvider) f9pVar.t, (Context) daqVar.x1.a);
            case 1:
                return new ry30((t2j0) daqVar.f2.get(), (ru71) ((jly0) f9pVar.b).get(), (String) daqVar.k2.get(), (co40) daqVar.Q4.get(), (p85) daqVar.Il.get());
            case 2:
                return new ru71((Context) daqVar.x1.a, (ut71) daqVar.g2.get());
            case 3:
                daq daqVar2 = (daq) f9pVar.X;
                daq daqVar3 = (daq) f9pVar.X;
                return new u(new pck1((Context) daqVar2.x1.a, xqu.a((s2q) f9pVar.P0), xqu.a((s2q) f9pVar.Q0), xqu.a((s2q) f9pVar.R0), daqVar2.R1(), xqu.a((s2q) f9pVar.S0), (mr20) daqVar2.u5.get(), f9pVar.m(), new p2f0((ru71) ((jly0) f9pVar.b).get(), (mr20) daqVar2.cc.get()), (p85) daqVar2.Il.get(), f9pVar.f(), xqu.a((s2q) f9pVar.X0)), f9pVar.k(), f9pVar.k(), f9pVar.k(), new lb((Context) daqVar3.x1.a), (ne11) daqVar.fm.get(), (q8n) daqVar.E1.get(), (zle1) daqVar.a3.get(), (tol1) ((s2q) f9pVar.Y0).get(), (wu71) ((s2q) f9pVar.T0).get(), new m((i8h1) daqVar3.A5.get(), (mwn0) daqVar3.Wd.get()));
            case 4:
                m111 m111VarX = f9pVar.x();
                daq daqVar4 = (daq) f9pVar.X;
                return new gf0(new hyy0(m111VarX, (y011) daqVar4.fm.get(), (byte) 14), f9pVar.g(), f9pVar.m(), (p85) daqVar.Il.get(), f9pVar.e(), (om40) daqVar.Jl.get(), (q8n) daqVar.E1.get(), new il00((p85) daqVar4.Il.get(), (byte) 7), new ffe1(f9pVar.e(), ((Context) daqVar4.x1.a).getString(2131952026), (byte) 7), w081.p((Context) daqVar4.x1.a));
            case 5:
                zhq0 zhq0Var = new zhq0((Context) ((daq) f9pVar.X).x1.a);
                mih0 mih0Var = (mih0) ((jly0) f9pVar.c).get();
                daq daqVar5 = (daq) f9pVar.X;
                return new ktc(zhq0Var, mih0Var, new sp00((mr20) daqVar5.cc.get(), new ow3((Context) daqVar5.x1.a, (g420) daqVar5.O2.get()), (nfa0) daqVar5.b2.get(), (q8n) daqVar5.E1.get(), (byte) 9));
            case 6:
                return new w5q(this);
            case 7:
                return new piq0(new zhq0((Context) ((daq) f9pVar.X).x1.a), (mih0) ((jly0) f9pVar.c).get());
            case 8:
                return new lw70((gw70) daqVar.d8.get(), (q8n) daqVar.E1.get());
            case 9:
                return new bv00((uu00) daqVar.a5.get(), (q8n) daqVar.E1.get());
            case 10:
                return new bv00(xqu.a((s2q) f9pVar.O0), (q8n) daqVar.E1.get());
            case 11:
                return mw60.v((RetrofitMaker) daqVar.Y3.get());
            case 12:
                m111 m111VarX2 = f9pVar.x();
                daq daqVar6 = (daq) f9pVar.X;
                return new b880(new hyy0(m111VarX2, (y011) daqVar6.fm.get(), (byte) 14), f9pVar.g(), (Context) daqVar.x1.a, f9pVar.m(), new il00((p85) daqVar6.Il.get(), (byte) 7), f9pVar.e(), (q8n) daqVar.E1.get(), (agc0) daqVar.B7.get(), w081.p((Context) daqVar6.x1.a));
            case 13:
                m111 m111VarX3 = f9pVar.x();
                daq daqVar7 = (daq) f9pVar.X;
                return new rfh1(m111VarX3, new hlr((t2j0) daqVar7.f2.get()), (mr20) daqVar.Mn.get(), (q8n) daqVar.E1.get(), w081.p((Context) daqVar7.x1.a));
            case 14:
                return new uq40((uu00) daqVar.a5.get());
            case 15:
                daq daqVar8 = (daq) f9pVar.X;
                y441 y441Var = new y441(new l85(false, (luk) daqVar8.L1.get()), (wu71) ((s2q) f9pVar.T0).get(), new yzu(new iuw((Context) daqVar8.x1.a, (ut71) daqVar8.g2.get()), (huw) ((RetrofitMaker) daqVar8.Y3.get()).createWebgateService(huw.class, "android-widgets-wrapped-eligibility"), (mr20) daqVar8.cc.get(), (nuw) daqVar8.Nn.get()), (cv71) ((s2q) f9pVar.U0).get());
                xim1 xim1Var = (xim1) ((s2q) f9pVar.V0).get();
                zsc zscVarF = f9pVar.f();
                s2q s2qVar = (s2q) f9pVar.W0;
                daq daqVar9 = (daq) f9pVar.X;
                return new hjm1(y441Var, xim1Var, zscVarF, new o860(s2qVar, (rol1) daqVar9.Ln.get(), (yqg) daqVar9.J1.get(), (e080) daqVar9.Pn.get(), (byte) 8));
            case 16:
                return new wu71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case 17:
                return new cv71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case 18:
                f9pVar.getClass();
                daq daqVar10 = (daq) f9pVar.X;
                return new xim1(new wpl1((upl1) ((RetrofitMaker) daqVar10.Y3.get()).createWebgateService(upl1.class, "android-widgets-dynamicnpvwidget-wrapped-resources"), new mx21((Context) daqVar10.x1.a, (ut71) daqVar10.g2.get())), new zrj1(new ezb1((k931) ((RetrofitMaker) daqVar10.Y3.get()).createWebgateService(k931.class, "android-widgets-dynamicnpvwidget-wrapped-retrieval"), (byte) 1), (ohm1) daqVar10.On.get(), (cv71) ((s2q) f9pVar.U0).get(), (byte) 17));
            case 19:
                return new jw70((gw70) daqVar.d8.get());
            case 20:
                return new vol1("", xqu.a(daqVar.Gl));
            case 21:
                return new rsc((ru71) ((jly0) f9pVar.b).get());
            case 22:
                return new tx5((Context) daqVar.x1.a, (NpvWidgetProvider) f9pVar.t, (ox5) daqVar.Gl.get());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object o() {
        k9k k9kVar = (k9k) this.d;
        OfflineDeviceLimitReachedActivity offlineDeviceLimitReachedActivity = (OfflineDeviceLimitReachedActivity) k9kVar.b;
        byte b = this.c;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) k9kVar.e).get();
            daq daqVar = (daq) k9kVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
        }
        daq daqVar2 = this.b;
        if (b == 1) {
            return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) k9kVar.d).get(), (yqg) daqVar2.J1.get(), offlineDeviceLimitReachedActivity);
        }
        if (b == 2) {
            return j310.x(offlineDeviceLimitReachedActivity, (t8u0) daqVar2.d9.get());
        }
        jah.e(b);
        return null;
    }

    private final Object p() {
        kp5 kp5Var = (kp5) this.d;
        daq daqVar = (daq) kp5Var.b;
        lir0 lir0Var = (OutputSwitcherPermissionNudgeActivity) kp5Var.a;
        daq daqVar2 = this.b;
        byte b = this.c;
        if (b == 0) {
            return new ior(daqVar2.H(), new r2l(lir0Var, new h21(xqu.a((s2q) kp5Var.e), (byte) 17), new h21(xqu.a((s2q) kp5Var.d), (byte) 18), new t2l(lir0Var, (byte) 0), (g0l) daqVar.E5.get(), (zor) daqVar.V6.get(), new v1k((i8h1) daqVar.A5.get())), (fur) ((s2q) kp5Var.g).get());
        }
        if (b == 1) {
            return j1l.d((g5t) kp5Var.c);
        }
        if (b == 2) {
            return new r2l(lir0Var, new h21(xqu.a((s2q) kp5Var.e), (byte) 17), new h21(xqu.a((s2q) kp5Var.d), (byte) 18), new t2l(lir0Var, (byte) 0), (g0l) daqVar2.E5.get(), (zor) daqVar2.V6.get(), new v1k((i8h1) daqVar.A5.get()));
        }
        if (b == 3) {
            return j1l.e((g5t) kp5Var.c);
        }
        if (b == 4) {
            return new fur((a1r0) ((jly0) kp5Var.f).get());
        }
        if (b == 5) {
            return new c1r0(lir0Var, (mwn0) daqVar2.Wd.get());
        }
        jah.e(b);
        return null;
    }

    private final Object q() {
        h72 h72Var = (h72) this.d;
        daq daqVar = (daq) h72Var.c;
        t3b1 t3b1Var = (PartnerAccountLinkingActivity) h72Var.b;
        byte b = 1;
        daq daqVar2 = this.b;
        byte b2 = this.c;
        switch (b2) {
            case 0:
                h380 h380VarB = j380.b(104);
                hbq hbqVar = daqVar.a;
                h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
                h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
                h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
                h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar.c);
                h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
                h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
                h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
                h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
                h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar.d);
                h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
                h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar.e);
                h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
                h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar.f);
                h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
                h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
                h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
                h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
                h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
                h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar.g);
                h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
                h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
                h380VarB.e("p.k2l", daqVar.h);
                h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar.i);
                h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
                h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
                h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar.t);
                h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar.X);
                h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar.Y);
                h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar.Z);
                h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar.N0);
                h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar.O0);
                h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar.P0);
                h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar.Q0);
                h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
                h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
                h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar.R0);
                h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar.S0);
                h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
                h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
                h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar.T0);
                h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
                h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
                h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
                h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
                h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
                h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
                h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar.U0);
                h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
                h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
                h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar.V0);
                h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar.W0);
                h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar.X0);
                h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
                h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
                h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
                h380VarB.e("p.fso0", daqVar.Y0);
                h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
                h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar.Z0);
                h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar.a1);
                h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
                h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
                h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
                h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
                h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
                h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar.b1);
                h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
                h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
                h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar.c1);
                h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar.d1);
                h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
                h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
                h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
                h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar.e1);
                h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar.f1);
                h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
                h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
                h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
                h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar.g1);
                h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar.h1);
                h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar.i1);
                h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
                h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar.j1);
                h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar.k1);
                h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar.l1);
                h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
                h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar.m1);
                h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar.n1);
                h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar.o1);
                h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar.p1);
                h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
                h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar.q1);
                h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
                h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar.r1);
                h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
                h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
                h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar.s1);
                h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar.t1);
                h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar.u1);
                h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
                h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
                h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
                h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
                h380VarB.e("p.u0s0", (s2q) h72Var.d);
                h380VarB.e("p.t0s0", (s2q) h72Var.e);
                return new jgu(h380VarB.b(true));
            case 1:
                return new t7q(daqVar2, h72Var, b);
            case 2:
                return new t7q(daqVar2, h72Var, (byte) 0);
            case 3:
                return t380.p(s2.p((gu7) ((jly0) h72Var.h).get(), new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
            case 4:
                return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) h72Var.g).get(), (yqg) daqVar2.J1.get(), t3b1Var);
            case 5:
                return j310.x(t3b1Var, (t8u0) daqVar2.d9.get());
            case 6:
                th30 th30Var = (th30) ((s2q) h72Var.t).get();
                Intent intent = t3b1Var.getIntent();
                c8o.m(intent);
                return new v0s0(th30Var, intent);
            case 7:
                return ((dg30) t3b1Var).U0.t();
            case 8:
                return new x0s0();
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object r() {
        k9k k9kVar = (k9k) this.d;
        PaymentCallbackActivity paymentCallbackActivity = (PaymentCallbackActivity) k9kVar.b;
        byte b = this.c;
        if (b == 0) {
            g1n0 g1n0Var = (g1n0) ((jly0) k9kVar.e).get();
            int i = t380.c;
            aan0.s(g1n0Var, kg11.t);
            return g1n0Var;
        }
        if (b == 1) {
            bi0 bi0Var = (bi0) ((jly0) k9kVar.d).get();
            daq daqVar = this.b;
            return new g1n0(paymentCallbackActivity, bi0Var, (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
        }
        if (b == 2) {
            return new yym0(paymentCallbackActivity);
        }
        jah.e(b);
        return null;
    }

    private final Object s() {
        g1i g1iVar = (g1i) this.d;
        PictureSelectionActivity pictureSelectionActivity = (PictureSelectionActivity) g1iVar.b;
        byte b = this.c;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) g1iVar.e).get();
            daq daqVar = (daq) g1iVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
        }
        daq daqVar2 = this.b;
        if (b == 1) {
            return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) g1iVar.d).get(), (yqg) daqVar2.J1.get(), pictureSelectionActivity);
        }
        if (b == 2) {
            return j310.x(pictureSelectionActivity, (t8u0) daqVar2.d9.get());
        }
        jah.e(b);
        return null;
    }

    private final Object t() {
        tnm tnmVar = (tnm) this.d;
        daq daqVar = (daq) tnmVar.c;
        PinPairingActivity pinPairingActivity = (PinPairingActivity) tnmVar.b;
        byte b = this.c;
        if (b != 0) {
            byte b2 = 2;
            daq daqVar2 = this.b;
            if (b == 1) {
                return new v7q(daqVar2, tnmVar, b2);
            }
            if (b == 2) {
                return t380.p(s2.p((gu7) ((jly0) tnmVar.g).get(), new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
            }
            if (b == 3) {
                return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) tnmVar.f).get(), (yqg) daqVar2.J1.get(), pinPairingActivity);
            }
            if (b == 4) {
                return j310.x(pinPairingActivity, (t8u0) daqVar2.d9.get());
            }
            jah.e(b);
            return null;
        }
        h380 h380VarB = j380.b(103);
        hbq hbqVar = daqVar.a;
        h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
        h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
        h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
        h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar.c);
        h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
        h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
        h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
        h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
        h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar.d);
        h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
        h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar.e);
        h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
        h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar.f);
        h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
        h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
        h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
        h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
        h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
        h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar.g);
        h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
        h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
        h380VarB.e("p.k2l", daqVar.h);
        h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar.i);
        h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
        h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar.t);
        h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar.X);
        h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar.Y);
        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar.Z);
        h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar.N0);
        h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar.O0);
        h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar.P0);
        h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar.Q0);
        h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
        h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
        h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar.R0);
        h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar.S0);
        h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
        h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
        h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar.T0);
        h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
        h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
        h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
        h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
        h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
        h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
        h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar.U0);
        h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
        h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
        h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar.V0);
        h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar.W0);
        h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar.X0);
        h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
        h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
        h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
        h380VarB.e("p.fso0", daqVar.Y0);
        h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
        h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar.Z0);
        h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar.a1);
        h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
        h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
        h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
        h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
        h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
        h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar.b1);
        h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
        h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
        h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar.c1);
        h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar.d1);
        h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
        h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
        h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
        h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar.e1);
        h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar.f1);
        h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
        h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
        h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
        h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar.g1);
        h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar.h1);
        h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar.i1);
        h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
        h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar.j1);
        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar.k1);
        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar.l1);
        h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
        h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar.m1);
        h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar.n1);
        h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar.o1);
        h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar.p1);
        h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
        h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar.q1);
        h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
        h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar.r1);
        h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
        h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
        h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar.s1);
        h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar.t1);
        h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar.u1);
        h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
        h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
        h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
        h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
        h380VarB.e("p.w1t0", (s2q) tnmVar.d);
        return new jgu(h380VarB.b(true));
    }

    private final Object u() {
        qqp qqpVar = (qqp) this.d;
        daq daqVar = this.b;
        byte b = this.c;
        if (b == 0) {
            return new z0c0((r5h) daqVar.h7.get());
        }
        if (b == 1) {
            return new x5h((w4h) daqVar.k7.get());
        }
        if (b == 2) {
            return new xid((z0c0) ((s2q) qqpVar.e).get(), (x5h) ((s2q) qqpVar.b).get(), (byte) 18);
        }
        jah.e(b);
        return null;
    }

    private final Object v() {
        tnm tnmVar = (tnm) this.d;
        daq daqVar = (daq) tnmVar.c;
        PremiumAccountManagementWebviewActivity premiumAccountManagementWebviewActivity = (PremiumAccountManagementWebviewActivity) tnmVar.b;
        byte b = this.c;
        if (b != 0) {
            byte b2 = 2;
            daq daqVar2 = this.b;
            if (b == 1) {
                return new s0q(daqVar2, tnmVar, b2);
            }
            if (b == 2) {
                return t380.p(s2.p((gu7) ((jly0) tnmVar.g).get(), new y4l(daqVar.F(), (fpr) daqVar.Ka.get(), daqVar.k2())));
            }
            if (b == 3) {
                return new gu7((ark1) daqVar2.x8.get(), (Flowable) daqVar2.D5.get(), (w9u0) ((jly0) tnmVar.f).get(), (yqg) daqVar2.J1.get(), premiumAccountManagementWebviewActivity);
            }
            if (b == 4) {
                return j310.x(premiumAccountManagementWebviewActivity, (t8u0) daqVar2.d9.get());
            }
            jah.e(b);
            return null;
        }
        h380 h380VarB = j380.b(103);
        hbq hbqVar = daqVar.a;
        h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
        h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
        h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
        h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar.c);
        h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
        h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
        h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
        h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
        h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar.d);
        h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
        h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar.e);
        h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
        h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar.f);
        h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
        h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
        h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
        h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
        h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
        h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar.g);
        h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
        h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
        h380VarB.e("p.k2l", daqVar.h);
        h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar.i);
        h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
        h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar.t);
        h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar.X);
        h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar.Y);
        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar.Z);
        h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar.N0);
        h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar.O0);
        h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar.P0);
        h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar.Q0);
        h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
        h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
        h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar.R0);
        h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar.S0);
        h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
        h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
        h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar.T0);
        h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
        h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
        h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
        h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
        h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
        h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
        h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar.U0);
        h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
        h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
        h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar.V0);
        h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar.W0);
        h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar.X0);
        h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
        h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
        h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
        h380VarB.e("p.fso0", daqVar.Y0);
        h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
        h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar.Z0);
        h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar.a1);
        h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
        h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
        h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
        h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
        h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
        h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar.b1);
        h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
        h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
        h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar.c1);
        h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar.d1);
        h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
        h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
        h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
        h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar.e1);
        h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar.f1);
        h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
        h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
        h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
        h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar.g1);
        h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar.h1);
        h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar.i1);
        h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
        h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar.j1);
        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar.k1);
        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar.l1);
        h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
        h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar.m1);
        h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar.n1);
        h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar.o1);
        h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar.p1);
        h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
        h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar.q1);
        h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
        h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar.r1);
        h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
        h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
        h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar.s1);
        h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar.t1);
        h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar.u1);
        h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
        h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
        h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
        h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
        h380VarB.e("p.ypv0", (s2q) tnmVar.d);
        return new jgu(h380VarB.b(true));
    }

    private final Object w() {
        f0a f0aVar = (f0a) this.d;
        daq daqVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                gu7 gu7Var = (gu7) ((jly0) f0aVar.f).get();
                daq daqVar2 = (daq) f0aVar.c;
                return t380.p(s2.p(gu7Var, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
            case 1:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) f0aVar.e).get(), (yqg) daqVar.J1.get(), (dg30) ((jo80) f0aVar.d).a);
            case 2:
                return j310.x((dg30) ((jo80) f0aVar.d).a, (t8u0) daqVar.d9.get());
            case 3:
                return new a2k(f0aVar.v());
            case 4:
                return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
            case 5:
                return kmq0.h((s2q) f0aVar.i, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
            case 6:
                daq daqVar3 = (daq) f0aVar.c;
                daq daqVar4 = (daq) f0aVar.c;
                return new lbs0(new gbs0(daqVar3.D1(), new bx5((Context) daqVar3.x1.a)), new lvc((t2j0) daqVar4.f2.get()), new xcs0((dma1) daqVar4.C5.get(), (yqg) daqVar4.J1.get(), (nfa0) daqVar4.b2.get()));
            case 7:
                return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
            case 8:
                return rx31.c(daqVar.d8, daqVar.A5);
            case 9:
                s2q s2qVar = (s2q) f0aVar.Z;
                jo80 jo80Var = (jo80) f0aVar.d;
                s2q s2qVar2 = (s2q) f0aVar.O0;
                caq caqVar = daqVar.A5;
                caq caqVar2 = daqVar.z1;
                caq caqVar3 = daqVar.r3;
                jly0 jly0Var = daqVar.gj;
                jly0 jly0Var2 = daqVar.Y3;
                caq caqVar4 = daqVar.fg;
                sww0 sww0Var = new sww0();
                sww0Var.a = s2qVar;
                sww0Var.b = jo80Var;
                sww0Var.c = jo80Var;
                sww0Var.d = s2qVar2;
                sww0Var.e = caqVar;
                sww0Var.f = caqVar2;
                sww0Var.g = caqVar3;
                sww0Var.h = jly0Var;
                sww0Var.i = jly0Var2;
                sww0Var.j = caqVar4;
                return sww0Var;
            case 10:
                return new af10((gw70) daqVar.d8.get(), (nww0) daqVar.Jn.get());
            case 11:
                t3b1 t3b1Var = (ProfileCompletionSheetHostActivity) f0aVar.b;
                gw70 gw70Var = (gw70) daqVar.d8.get();
                return new xfx(t3b1Var, gw70Var, new sua((byte) 9));
            case 12:
                return new im4(false, (luk) daqVar.L1.get());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object x() {
        byte b = this.c;
        switch (b) {
            case 0:
                yxo yxoVar = (yxo) this.d;
                yxoVar.getClass();
                h380 h380VarB = j380.b(6);
                h380VarB.e(h22.class, new h21(xqu.a((s2q) yxoVar.e), (byte) 3));
                h380VarB.e(qbs0.class, new t700(xqu.a((s2q) yxoVar.g), (byte) 24));
                h380VarB.e(pyf.class, new h21(xqu.a((s2q) yxoVar.h), (byte) 14));
                h380VarB.e(mh41.class, new uww0(xqu.a((s2q) yxoVar.i), (byte) 7));
                h380VarB.e(dj8.class, new h21(xqu.a((s2q) yxoVar.S0), (byte) 6));
                h380VarB.e(b21.class, new h21(xqu.a((s2q) yxoVar.c1), (byte) 0));
                return new a2k(h380VarB.b(true));
            case 1:
                daq daqVar = this.b;
                return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
            case 2:
                s2q s2qVar = (s2q) ((yxo) this.d).f;
                daq daqVar2 = this.b;
                return kmq0.h(s2qVar, daqVar2.z1, daqVar2.r3, daqVar2.d8, daqVar2.f8, daqVar2.C5, daqVar2.J1, daqVar2.Am, daqVar2.Fh, daqVar2.b2);
            case 3:
                daq daqVar3 = (daq) ((yxo) this.d).d;
                gbs0 gbs0Var = new gbs0(daqVar3.D1(), new bx5((Context) daqVar3.x1.a));
                lvc lvcVar = new lvc((t2j0) ((daq) ((yxo) this.d).d).f2.get());
                yxo yxoVar2 = (yxo) this.d;
                yxoVar2.getClass();
                daq daqVar4 = (daq) yxoVar2.d;
                return new lbs0(gbs0Var, lvcVar, new xcs0((dma1) daqVar4.C5.get(), (yqg) daqVar4.J1.get(), (nfa0) daqVar4.b2.get()));
            case 4:
                daq daqVar5 = this.b;
                return svf.d(daqVar5.Bm, daqVar5.Fh, daqVar5.zm, daqVar5.z1, daqVar5.C1, daqVar5.lk);
            case 5:
                daq daqVar6 = this.b;
                return rx31.c(daqVar6.d8, daqVar6.A5);
            case 6:
                yxo yxoVar3 = (yxo) this.d;
                jo80 jo80Var = yxoVar3.t;
                daq daqVar7 = this.b;
                return e78.f(jo80Var, daqVar7.vn, daqVar7.wn, yxoVar3.N0, yxoVar3.O0, daqVar7.yn, daqVar7.zn, daqVar7.x1, daqVar7.U5, (s2q) yxoVar3.P0, (s2q) yxoVar3.Q0, daqVar7.ik, daqVar7.j2, daqVar7.An, daqVar7.vg, (s2q) yxoVar3.R0, daqVar7.Z1, daqVar7.sn);
            case 7:
                wlv0 wlv0Var = (wlv0) ((yxo) this.d).b.get();
                daq daqVar8 = (daq) ((yxo) this.d).d;
                dzp0 dzp0Var = new dzp0((x2g1) daqVar8.j2.get(), (t2j0) daqVar8.f2.get(), (dp21) daqVar8.pn.get(), (byte) 8);
                r320 r320Var = (r320) ((yxo) this.d).Y.get();
                Scheduler scheduler = (Scheduler) this.b.A2.get();
                gks0 gks0Var = (gks0) this.b.qn.get();
                dp21 dp21Var = (dp21) this.b.pn.get();
                gfo0 gfo0Var = (gfo0) ((yxo) this.d).Z.get();
                yxo yxoVar4 = (yxo) this.d;
                yxoVar4.getClass();
                daq daqVar9 = (daq) yxoVar4.d;
                return new fmy0(wlv0Var, dzp0Var, r320Var, scheduler, gks0Var, dp21Var, gfo0Var, new kqc(dmx0.D((gma1) daqVar9.d3.get(), (Context) daqVar9.x1.a), (r320) yxoVar4.Y.get()));
            case 8:
                RetrofitMaker retrofitMaker = (RetrofitMaker) this.b.Y3.get();
                yxo yxoVar5 = (yxo) this.d;
                uic uicVar = new uic((Activity) yxoVar5.t.a, dmx0.C((g420) ((daq) yxoVar5.d).O2.get()), (byte) 10);
                yxo yxoVar6 = (yxo) this.d;
                String strR = upn1.r((Activity) yxoVar6.t.a);
                daq daqVar10 = (daq) yxoVar6.d;
                return new wlv0(retrofitMaker, uicVar, new ip31(strR, (x2g1) daqVar10.j2.get(), (ajg) daqVar10.a2.get(), (DisplayMetrics) daqVar10.Qd.get(), new jc9((Activity) yxoVar6.t.a, (byte) 16), new i6b((dxz0) daqVar10.I4.get(), (byte) 11), dmx0.g((yqg) daqVar10.J1.get()), (f1f0) daqVar10.vm.get()), (ohv0) this.b.U5.get());
            case 9:
                return new r320(xqu.a((s2q) ((yxo) this.d).X));
            case 10:
                yxo yxoVar7 = (yxo) this.d;
                return new mqc((Activity) yxoVar7.t.a, dmx0.C((g420) ((daq) yxoVar7.d).O2.get()));
            case 11:
                daq daqVar11 = (daq) ((yxo) this.d).d;
                dmx0.D((gma1) daqVar11.d3.get(), (Context) daqVar11.x1.a);
                return new gfo0();
            case 12:
                QuickLoginActivity quickLoginActivity = (QuickLoginActivity) ((yxo) this.d).c;
                h380 h380VarB2 = j380.b(7);
                h380VarB2.e(ejt.class, e21.i);
                h380VarB2.e(zit.class, e21.b);
                h380VarB2.e(yit.class, e21.c);
                h380VarB2.e(bjt.class, e21.d);
                h380VarB2.e(ajt.class, e21.e);
                h380VarB2.e(ijt.class, e21.f);
                h380VarB2.e(jjt.class, e21.g);
                return new kg0(h380VarB2.b(true), quickLoginActivity, (ohv0) this.b.U5.get());
            case 13:
                i5u i5uVar = (i5u) this.b.rn.get();
                ffz0 ffz0Var = new ffz0();
                i5uVar.a = false;
                return ffz0Var;
            case 14:
                return new ph11(eth.V((xm41) this.b.l5.get()), (byte) 5);
            case 15:
                return (v4s0) ((RetrofitMaker) this.b.Y3.get()).createWebgateService(v4s0.class, "android-login-passkeys-api");
            case 16:
                yxo yxoVar8 = (yxo) this.d;
                s2q s2qVar2 = (s2q) yxoVar8.T0;
                daq daqVar12 = this.b;
                return wg0.e(s2qVar2, daqVar12.z1, (s2q) yxoVar8.U0, daqVar12.x1, daqVar12.Bn, daqVar12.Cn, daqVar12.Y3, (s2q) yxoVar8.V0, (s2q) yxoVar8.W0, daqVar12.Af, yxoVar8.O0, yxoVar8.X0, daqVar12.U5, daqVar12.h2, daqVar12.j2, daqVar12.tn, daqVar12.K3, daqVar12.G3, (s2q) yxoVar8.Y0, (s2q) yxoVar8.Z0, (s2q) yxoVar8.P0, daqVar12.Dn, daqVar12.Z1, (s2q) yxoVar8.a1, (s2q) yxoVar8.R0, daqVar12.sn, daqVar12.hm, daqVar12.Wd, daqVar12.J1, yxoVar8.b1, daqVar12.S5);
            case 17:
                return new a11(w7x.a, f2d1.a, kj01.a);
            case 18:
                daq daqVar13 = this.b;
                q2f0 q2f0VarA = uge0.A(new yfu((Context) daqVar13.x1.a, (yqg) daqVar13.J1.get(), (byte) 27));
                ql8 ql8VarZ = this.b.z();
                si20 si20VarA0 = this.b.a0();
                daq daqVar14 = (daq) ((yxo) this.d).d;
                return t380.v(q2f0VarA, ql8VarZ, si20VarA0, new fn7(new g23((r2b1) daqVar14.al.get(), ce7.n((o1p) daqVar14.i2.get()), ce7.o((o1p) daqVar14.i2.get()), (byte) 27)));
            case 19:
                return new ou71((dma1) this.b.C1.get());
            case 20:
                return new x01((dma1) this.b.C1.get());
            case 21:
                ((yxo) this.d).getClass();
                return new lg0(j380.l(yit.class, f21.a));
            case 22:
                return eth.X((xm41) this.b.V4.get()).map(vf61.X);
            case 23:
                Object obj = ((yxo) this.d).t.a;
                return new a031((Activity) obj, new dms0((Activity) obj), (iwe0) this.b.Af.get());
            case 24:
                return (br81) ((RetrofitMaker) this.b.Y3.get()).createWebgateService(br81.class, "android-login-signup-api-v2");
            case 25:
                sam0 sam0Var = (xm41) this.b.V4.get();
                Activity activity = (Activity) ((yxo) this.d).t.a;
                pz11 pz11Var = (pz11) this.b.e2.get();
                xav0 xav0Var = (xav0) this.b.l2.get();
                p811 p811Var = new p811();
                sam0 sam0Var2 = sam0Var;
                sam0Var2.e(new hla(p811Var, (byte) 1), new i3(p811Var, (byte) 5));
                return new g2t(activity, pz11Var, xav0Var, p811Var);
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        gv4 gu7Var;
        jgu jguVar;
        c1r0 s0qVar;
        g1n0 gu7Var2;
        yym0 yym0Var;
        e6a1 gy40Var;
        byte b = this.a;
        byte b2 = this.c;
        Object obj = this.d;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                em0 em0Var = (em0) obj;
                q2p0 q2p0Var = (q2p0) em0Var.b;
                switch (b2) {
                    case 0:
                        return k9o0.t(q2p0Var);
                    case 1:
                        return k9o0.B(q2p0Var);
                    case 2:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) em0Var.f).get()), (Flowable) ((jly0) em0Var.g).get(), (Flowable) ((jly0) em0Var.h).get(), em0Var.p());
                    case 3:
                        return f2u0.z((Flowable) ((jly0) em0Var.f).get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get(), em0Var.p());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) em0Var.f).get(), em0Var.p());
                    case 5:
                        return k9o0.z(q2p0Var);
                    case 6:
                        return new rup(this, (byte) 1);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 1:
                e93 e93Var = (e93) obj;
                switch (b2) {
                    case 0:
                        gu7 gu7Var3 = (gu7) ((jly0) e93Var.e).get();
                        daq daqVar2 = (daq) e93Var.c;
                        return t380.p(s2.p(gu7Var3, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
                    case 1:
                        gu7Var = new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) e93Var.d).get(), (yqg) daqVar.J1.get(), (EndlessActivity) e93Var.b);
                        break;
                    case 2:
                        return j310.x((EndlessActivity) e93Var.b, (t8u0) daqVar.d9.get());
                    case 3:
                        gu7Var = new a2k(j380.k(h22.class, new h21(xqu.a((s2q) e93Var.g), (byte) 3), qbs0.class, new t700(xqu.a((s2q) e93Var.i), (byte) 24), pyf.class, new h21(xqu.a((s2q) e93Var.t), (byte) 14), mh41.class, new uww0(xqu.a((s2q) e93Var.X), (byte) 7), b0y.class, new h21(xqu.a((s2q) e93Var.Y), (byte) 27)));
                        break;
                    case 4:
                        return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
                    case 5:
                        return kmq0.h((s2q) e93Var.h, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
                    case 6:
                        daq daqVar3 = (daq) e93Var.c;
                        daq daqVar4 = (daq) e93Var.c;
                        gu7Var = new lbs0(new gbs0(daqVar3.D1(), new bx5((Context) daqVar3.x1.a)), new lvc((t2j0) daqVar4.f2.get()), new xcs0((dma1) daqVar4.C5.get(), (yqg) daqVar4.J1.get(), (nfa0) daqVar4.b2.get()));
                        break;
                    case 7:
                        return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
                    case 8:
                        return rx31.c(daqVar.d8, daqVar.A5);
                    case 9:
                        return new p0y();
                    case 10:
                        gu7Var = (g1n0) ((jly0) e93Var.O0).get();
                        int i = t380.c;
                        aan0.s(gu7Var, kg11.t);
                        break;
                    case 11:
                        return new g1n0((EndlessActivity) e93Var.b, (bi0) ((jly0) e93Var.N0).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
                    case 12:
                        gu7Var = new yym0((EndlessActivity) e93Var.b);
                        break;
                    case 13:
                        gu7Var = new e7p0((EndlessActivity) e93Var.b, (lzn0) ((s2q) e93Var.P0).get(), (mwn0) daqVar.Wd.get(), (m7p0) daqVar.q9.get(), (d7p0) ((jly0) e93Var.R0).get(), (s2q) e93Var.S0, (w4p0) daqVar.go.get());
                        break;
                    case 14:
                        return (d7p0) ((jly0) e93Var.Q0).get();
                    case 15:
                        return new d7p0();
                    case 16:
                        gu7Var = new gv4(false, false, (luk) daqVar.L1.get());
                        break;
                    case 17:
                        return ((t8u0) daqVar.d9.get()).a(((f0i) ((EndlessActivity) e93Var.b)).a);
                    case 18:
                        return ((EndlessActivity) e93Var.b).findViewById(2131430262);
                    default:
                        jah.e(b2);
                        return null;
                }
                return gu7Var;
            case 2:
                e93 e93Var2 = (e93) obj;
                switch (b2) {
                    case 0:
                        e93Var2.getClass();
                        h380 h380VarB = j380.b(103);
                        daq daqVar5 = (daq) e93Var2.c;
                        hbq hbqVar = daqVar5.a;
                        h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
                        h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
                        h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
                        h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar5.c);
                        h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
                        h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
                        h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
                        h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
                        h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar5.d);
                        h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
                        h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar5.e);
                        h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
                        h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar5.f);
                        h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
                        h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
                        h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
                        h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
                        h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
                        h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar5.g);
                        h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
                        h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
                        h380VarB.e("p.k2l", daqVar5.h);
                        h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar5.i);
                        h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
                        h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
                        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar5.t);
                        h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar5.X);
                        h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar5.Y);
                        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar5.Z);
                        h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar5.N0);
                        h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar5.O0);
                        h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar5.P0);
                        h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar5.Q0);
                        h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
                        h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
                        h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar5.R0);
                        h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar5.S0);
                        h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
                        h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
                        h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar5.T0);
                        h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
                        h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
                        h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
                        h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
                        h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
                        h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
                        h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar5.U0);
                        h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
                        h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
                        h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar5.V0);
                        h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar5.W0);
                        h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar5.X0);
                        h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
                        h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
                        h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
                        h380VarB.e("p.fso0", daqVar5.Y0);
                        h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
                        h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar5.Z0);
                        h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar5.a1);
                        h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
                        h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
                        h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
                        h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
                        h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
                        h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar5.b1);
                        h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
                        h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
                        h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar5.c1);
                        h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar5.d1);
                        h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
                        h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
                        h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
                        h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar5.e1);
                        h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar5.f1);
                        h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
                        h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
                        h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
                        h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar5.g1);
                        h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar5.h1);
                        h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar5.i1);
                        h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
                        h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar5.j1);
                        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar5.k1);
                        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar5.l1);
                        h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
                        h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar5.m1);
                        h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar5.n1);
                        h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar5.o1);
                        h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar5.p1);
                        h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
                        h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar5.q1);
                        h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
                        h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar5.r1);
                        h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
                        h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
                        h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar5.s1);
                        h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar5.t1);
                        h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar5.u1);
                        h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
                        h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
                        h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
                        h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
                        h380VarB.e("com.spotify.campaigns.storytelling.container.StorytellingContainerFragment", (s2q) e93Var2.d);
                        jguVar = new jgu(h380VarB.b(true));
                        return jguVar;
                    case 1:
                        s0qVar = new s0q(daqVar, e93Var2, (byte) 4);
                        return s0qVar;
                    case 2:
                        gu7 gu7Var4 = (gu7) ((jly0) e93Var2.g).get();
                        daq daqVar6 = (daq) e93Var2.c;
                        return t380.p(s2.p(gu7Var4, new y4l(daqVar6.F(), (fpr) daqVar6.Ka.get(), daqVar6.k2())));
                    case 3:
                        s0qVar = new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) e93Var2.f).get(), (yqg) daqVar.J1.get(), (FandomCollectiblesStoryActivity) e93Var2.b);
                        return s0qVar;
                    case 4:
                        return j310.x((FandomCollectiblesStoryActivity) e93Var2.b, (t8u0) daqVar.d9.get());
                    case 5:
                        s0qVar = new a2k(j380.n(h22.class, new h21(xqu.a((s2q) e93Var2.i), (byte) 3), qbs0.class, new t700(xqu.a((s2q) e93Var2.X), (byte) 24), pyf.class, new h21(xqu.a((s2q) e93Var2.Y), (byte) 14), mh41.class, new uww0(xqu.a((s2q) e93Var2.Z), (byte) 7)));
                        return s0qVar;
                    case 6:
                        return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
                    case 7:
                        return kmq0.h((s2q) e93Var2.t, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
                    case 8:
                        daq daqVar7 = (daq) e93Var2.c;
                        daq daqVar8 = (daq) e93Var2.c;
                        s0qVar = new lbs0(new gbs0(daqVar7.D1(), new bx5((Context) daqVar7.x1.a)), new lvc((t2j0) daqVar8.f2.get()), new xcs0((dma1) daqVar8.C5.get(), (yqg) daqVar8.J1.get(), (nfa0) daqVar8.b2.get()));
                        return s0qVar;
                    case 9:
                        return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
                    case 10:
                        return rx31.c(daqVar.d8, daqVar.A5);
                    case 11:
                        jguVar = new f1q(this, (byte) 1);
                        return jguVar;
                    case 12:
                        s0qVar = new i7c1((FandomCollectiblesStoryActivity) e93Var2.b, (lzn0) ((s2q) e93Var2.R0).get(), e93Var2.e());
                        return s0qVar;
                    case 13:
                        s0qVar = (g1n0) ((jly0) e93Var2.Q0).get();
                        int i2 = t380.c;
                        aan0.s(s0qVar, kg11.t);
                        return s0qVar;
                    case 14:
                        return new g1n0((FandomCollectiblesStoryActivity) e93Var2.b, (bi0) ((jly0) e93Var2.P0).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
                    case 15:
                        s0qVar = new yym0((FandomCollectiblesStoryActivity) e93Var2.b);
                        return s0qVar;
                    case 16:
                        jguVar = new y2q(this);
                        return jguVar;
                    case 17:
                        s0qVar = new xh71((FandomCollectiblesStoryActivity) e93Var2.b, (qfb0) daqVar.Ag.get(), (a1r0) ((jly0) e93Var2.U0).get(), (q8n) daqVar.w1.get());
                        return s0qVar;
                    case 18:
                        s0qVar = new c1r0((FandomCollectiblesStoryActivity) e93Var2.b, (mwn0) daqVar.Wd.get());
                        return s0qVar;
                    default:
                        jah.e(b2);
                        return null;
                }
            case 3:
                ip31 ip31Var = (ip31) obj;
                ForcedGraduationLockActivity forcedGraduationLockActivity = (ForcedGraduationLockActivity) ip31Var.b;
                if (b2 == 0) {
                    gu7 gu7Var5 = (gu7) ((jly0) ip31Var.e).get();
                    daq daqVar9 = (daq) ip31Var.c;
                    return t380.p(s2.p(gu7Var5, new y4l(daqVar9.F(), (fpr) daqVar9.Ka.get(), daqVar9.k2())));
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        return j310.x(forcedGraduationLockActivity, (t8u0) daqVar.d9.get());
                    }
                    if (b2 == 3) {
                        yym0Var = (g1n0) ((jly0) ip31Var.h).get();
                        int i3 = t380.c;
                        aan0.s(yym0Var, kg11.t);
                    } else if (b2 == 4) {
                        gu7Var2 = new g1n0(forcedGraduationLockActivity, (bi0) ((jly0) ip31Var.g).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
                    } else {
                        if (b2 != 5) {
                            jah.e(b2);
                            return null;
                        }
                        yym0Var = new yym0(forcedGraduationLockActivity);
                    }
                    return yym0Var;
                }
                gu7Var2 = new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) ip31Var.d).get(), (yqg) daqVar.J1.get(), forcedGraduationLockActivity);
                return gu7Var2;
            case 4:
                uw0 uw0Var = (uw0) obj;
                switch (b2) {
                    case 0:
                        return bhb.n((Context) daqVar.x1.a, (o4o0) daqVar.F2.get(), (q8n) daqVar.E1.get());
                    case 1:
                        gy40Var = new gy40((jal) ((jly0) uw0Var.g).get(), (g6a1) ((jly0) uw0Var.X).get(), (ha61) ((jly0) uw0Var.Y).get(), (tvt0) ((jly0) uw0Var.N0).get(), (zle1) daqVar.a3.get());
                        break;
                    case 2:
                        return new jal();
                    case 3:
                        gy40Var = new g6a1((e6a1) ((jly0) uw0Var.h).get(), (Scheduler) daqVar.A2.get(), new poj0((GoBluetoothService) uw0Var.d, (Scheduler) ((daq) uw0Var.e).z1.get(), (c341) ((jly0) uw0Var.t).get(), uw0Var.c(), (byte) 21), new q3c());
                        break;
                    case 4:
                        gy40Var = new e6a1(new qy40(), uw0Var.p());
                        break;
                    case 5:
                        gy40Var = new c341((Context) daqVar.x1.a, (String) ((s2q) uw0Var.i).get());
                        break;
                    case 6:
                        Object obj2 = uw0Var.d;
                        return "GoBluetoothService";
                    case 7:
                        return new ha61((GoBluetoothService) uw0Var.d, (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.A2.get(), uw0Var.c(), new zsc(uw0Var.c(), (ey40) ((jly0) uw0Var.c).get(), uw0Var.p()));
                    case 8:
                        gy40Var = new ey40(uw0Var.c());
                        break;
                    case 9:
                        vqd1 vqd1Var = (vqd1) ((jly0) uw0Var.b).get();
                        Scheduler scheduler = (Scheduler) daqVar.z1.get();
                        rzo0 rzo0Var = new rzo0((GoBluetoothService) uw0Var.d, (c341) ((jly0) uw0Var.t).get(), uw0Var.c(), (byte) 14);
                        daq daqVar10 = (daq) uw0Var.e;
                        gy40Var = new tvt0(vqd1Var, scheduler, rzo0Var, new t8r0((dma1) daqVar10.C5.get(), (yqg) daqVar10.J1.get()), new mhc((byte) 29), uw0Var.p());
                        break;
                    case 10:
                        return ((b3q) ((jly0) uw0Var.Z).get()).a(mno1.h0);
                    case 11:
                        return new b3q(this, (byte) 0);
                    default:
                        jah.e(b2);
                        return null;
                }
                return gy40Var;
            case 5:
                k9k k9kVar = (k9k) obj;
                HelpWebViewActivity helpWebViewActivity = (HelpWebViewActivity) k9kVar.b;
                if (b2 == 0) {
                    gu7 gu7Var6 = (gu7) ((jly0) k9kVar.e).get();
                    daq daqVar11 = (daq) k9kVar.c;
                    return t380.p(s2.p(gu7Var6, new y4l(daqVar11.F(), (fpr) daqVar11.Ka.get(), daqVar11.k2())));
                }
                if (b2 == 1) {
                    return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) k9kVar.d).get(), (yqg) daqVar.J1.get(), helpWebViewActivity);
                }
                if (b2 == 2) {
                    return j310.x(helpWebViewActivity, (t8u0) daqVar.d9.get());
                }
                jah.e(b2);
                return null;
            case 6:
                return c();
            case 7:
                return d();
            case 8:
                return e();
            case 9:
                return f();
            case 10:
                return g();
            case 11:
                return h();
            case 12:
                return i();
            case 13:
                return j();
            case 14:
                if (b2 == 0) {
                    return sd30.p((mwg0) ((p2o0) obj).b);
                }
                if (b2 == 1) {
                    return -7829368;
                }
                if (b2 == 2) {
                    return new s4w0((w4h) daqVar.k7.get(), (ccc0) daqVar.y8.get(), (g7h) daqVar.b7.get());
                }
                jah.e(b2);
                return null;
            case 15:
                return k();
            case 16:
                return l();
            case 17:
                return m();
            case 18:
                return n();
            case 19:
                return o();
            case 20:
                return p();
            case 21:
                return q();
            case 22:
                return r();
            case 23:
                return s();
            case 24:
                return t();
            case 25:
                return u();
            case 26:
                return v();
            case 27:
                return w();
            case 28:
                return x();
            default:
                tnm tnmVar = (tnm) obj;
                daq daqVar12 = (daq) tnmVar.c;
                ReportWebViewActivity reportWebViewActivity = (ReportWebViewActivity) tnmVar.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        return new v7q(daqVar, tnmVar, (byte) 12);
                    }
                    if (b2 == 2) {
                        return t380.p(s2.p((gu7) ((jly0) tnmVar.g).get(), new y4l(daqVar12.F(), (fpr) daqVar12.Ka.get(), daqVar12.k2())));
                    }
                    if (b2 == 3) {
                        return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) tnmVar.f).get(), (yqg) daqVar.J1.get(), reportWebViewActivity);
                    }
                    if (b2 == 4) {
                        return j310.x(reportWebViewActivity, (t8u0) daqVar.d9.get());
                    }
                    jah.e(b2);
                    return null;
                }
                h380 h380VarB2 = j380.b(103);
                hbq hbqVar2 = daqVar12.a;
                h380VarB2.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar2.b);
                h380VarB2.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar2.c);
                h380VarB2.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar2.d);
                h380VarB2.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar12.c);
                h380VarB2.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar2.e);
                h380VarB2.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar2.f);
                h380VarB2.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar2.g);
                h380VarB2.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar2.h);
                h380VarB2.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar12.d);
                h380VarB2.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar2.i);
                h380VarB2.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar12.e);
                h380VarB2.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar2.j);
                h380VarB2.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar12.f);
                h380VarB2.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar2.k);
                h380VarB2.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar2.l);
                h380VarB2.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar2.m);
                h380VarB2.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar2.n);
                h380VarB2.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar2.o);
                h380VarB2.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar12.g);
                h380VarB2.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar2.p);
                h380VarB2.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar2.q);
                h380VarB2.e("p.k2l", daqVar12.h);
                h380VarB2.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar12.i);
                h380VarB2.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar2.r);
                h380VarB2.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar2.s);
                h380VarB2.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar12.t);
                h380VarB2.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar12.X);
                h380VarB2.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar12.Y);
                h380VarB2.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar12.Z);
                h380VarB2.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar12.N0);
                h380VarB2.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar12.O0);
                h380VarB2.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar12.P0);
                h380VarB2.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar12.Q0);
                h380VarB2.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar2.t);
                h380VarB2.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar2.u);
                h380VarB2.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar12.R0);
                h380VarB2.e("com.spotify.tap.go.service.GoBluetoothService", daqVar12.S0);
                h380VarB2.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar2.v);
                h380VarB2.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar2.w);
                h380VarB2.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar12.T0);
                h380VarB2.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar2.x);
                h380VarB2.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar2.y);
                h380VarB2.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar2.z);
                h380VarB2.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar2.A);
                h380VarB2.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar2.B);
                h380VarB2.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar2.C);
                h380VarB2.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar12.U0);
                h380VarB2.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar2.D);
                h380VarB2.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar2.E);
                h380VarB2.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar12.V0);
                h380VarB2.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar12.W0);
                h380VarB2.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar12.X0);
                h380VarB2.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar2.F);
                h380VarB2.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar2.G);
                h380VarB2.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar2.H);
                h380VarB2.e("p.fso0", daqVar12.Y0);
                h380VarB2.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar2.I);
                h380VarB2.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar12.Z0);
                h380VarB2.e("com.spotify.collection.downloaded.service.OffliningService", daqVar12.a1);
                h380VarB2.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar2.J);
                h380VarB2.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar2.K);
                h380VarB2.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar2.L);
                h380VarB2.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar2.M);
                h380VarB2.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar2.N);
                h380VarB2.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar12.b1);
                h380VarB2.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar2.O);
                h380VarB2.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar2.P);
                h380VarB2.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar12.c1);
                h380VarB2.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar12.d1);
                h380VarB2.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar2.Q);
                h380VarB2.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar2.R);
                h380VarB2.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar2.S);
                h380VarB2.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar12.e1);
                h380VarB2.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar12.f1);
                h380VarB2.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar2.T);
                h380VarB2.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar2.U);
                h380VarB2.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar2.V);
                h380VarB2.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar12.g1);
                h380VarB2.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar12.h1);
                h380VarB2.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar12.i1);
                h380VarB2.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar2.W);
                h380VarB2.e("com.spotify.tap.spoton.SpotOnService", daqVar12.j1);
                h380VarB2.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar12.k1);
                h380VarB2.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar12.l1);
                h380VarB2.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar2.X);
                h380VarB2.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar12.m1);
                h380VarB2.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar12.n1);
                h380VarB2.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar12.o1);
                h380VarB2.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar12.p1);
                h380VarB2.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar2.Y);
                h380VarB2.e("com.spotify.widget.widget.WidgetPickerService", daqVar12.q1);
                h380VarB2.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar2.Z);
                h380VarB2.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar12.r1);
                h380VarB2.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar2.a0);
                h380VarB2.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar2.b0);
                h380VarB2.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar12.s1);
                h380VarB2.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar12.t1);
                h380VarB2.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar12.u1);
                h380VarB2.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar2.c0);
                h380VarB2.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar2.d0);
                h380VarB2.e("com.spotify.music.SpotifyMainActivity", hbqVar2.e0);
                h380VarB2.e("com.spotify.tome.pageactivity.PageActivity", hbqVar2.f0);
                h380VarB2.e("p.lm21", (s2q) tnmVar.d);
                return new jgu(h380VarB2.b(true));
        }
    }
}
