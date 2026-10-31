package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity;
import com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity;
import com.spotify.adsdisplay.products.cmp.CMPActivity;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import com.spotify.allboarding.allboardingimpl.presentation.error.ErrorFragment;
import com.spotify.allboarding.allboardingimpl.presentation.summary.SummaryFragment;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import com.spotify.allboarding.allboardingimpl.skip.SkipDialogFragment;
import com.spotify.allboarding.contextualaudio.presentation.ContextualAudioFragment;
import com.spotify.allboarding.notificationpermission.view.NotificationPermissionFragment;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity;
import com.spotify.apprater.appraterdialog.AppRaterActivity;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.blend.tastematch.BlendStoryContainerActivity;
import com.spotify.blend.tastematch.BlendTasteMatchFragment;
import com.spotify.blend.tastematch.GroupBlendTasteMatchFragment;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider;
import com.spotify.storage.localstorage.DiskAlmostFullActivity;
import com.spotify.widgets.npvwidget.m;
import com.spotify.widgets.npvwidget.u;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.io.File;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p2p implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p2p(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    private final Object a() {
        g1i g1iVar = (g1i) this.d;
        AppRaterActivity appRaterActivity = (AppRaterActivity) g1iVar.b;
        daq daqVar = (daq) this.c;
        byte b = this.b;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) g1iVar.e).get();
            daq daqVar2 = (daq) g1iVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
        }
        if (b == 1) {
            return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) g1iVar.d).get(), (yqg) daqVar.J1.get(), appRaterActivity);
        }
        if (b == 2) {
            return j310.x(appRaterActivity, (t8u0) daqVar.d9.get());
        }
        jah.e(b);
        return null;
    }

    private final Object b() {
        i0q i0qVar = (i0q) this.d;
        AuthorizationActivity authorizationActivity = i0qVar.a;
        daq daqVar = (daq) this.c;
        byte b = this.b;
        if (b == 0) {
            gu7 gu7Var = (gu7) i0qVar.d.get();
            daq daqVar2 = i0qVar.b;
            return t380.p(s2.p(gu7Var, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
        }
        if (b == 1) {
            return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) i0qVar.c.get(), (yqg) daqVar.J1.get(), authorizationActivity);
        }
        if (b == 2) {
            return j310.x(authorizationActivity, (t8u0) daqVar.d9.get());
        }
        if (b == 3) {
            return new zq8();
        }
        jah.e(b);
        return null;
    }

    private final Object c() {
        k9k k9kVar = (k9k) this.d;
        AuthorizationCommandProxyActivity authorizationCommandProxyActivity = (AuthorizationCommandProxyActivity) k9kVar.b;
        daq daqVar = (daq) this.c;
        byte b = this.b;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) k9kVar.e).get();
            daq daqVar2 = (daq) k9kVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
        }
        if (b == 1) {
            return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) k9kVar.d).get(), (yqg) daqVar.J1.get(), authorizationCommandProxyActivity);
        }
        if (b == 2) {
            return j310.x(authorizationCommandProxyActivity, (t8u0) daqVar.d9.get());
        }
        jah.e(b);
        return null;
    }

    private final Object d() {
        daq daqVar = (daq) this.c;
        kp5 kp5Var = (kp5) this.d;
        daq daqVar2 = (daq) kp5Var.b;
        dg30 dg30Var = (Activity) kp5Var.a;
        byte b = this.b;
        if (b == 0) {
            return new ior(daqVar.H(), new r2l(dg30Var, new h21(xqu.a((p2p) kp5Var.e), (byte) 17), new h21(xqu.a((p2p) kp5Var.d), (byte) 18), new t2l(dg30Var, (byte) 0), (g0l) daqVar2.E5.get(), (zor) daqVar2.V6.get(), new v1k((i8h1) daqVar2.A5.get())), (fur) ((p2p) kp5Var.g).get());
        }
        if (b == 1) {
            return j1l.d((g5t) kp5Var.c);
        }
        if (b == 2) {
            return new r2l(dg30Var, new h21(xqu.a((p2p) kp5Var.e), (byte) 17), new h21(xqu.a((p2p) kp5Var.d), (byte) 18), new t2l(dg30Var, (byte) 0), (g0l) daqVar.E5.get(), (zor) daqVar.V6.get(), new v1k((i8h1) daqVar2.A5.get()));
        }
        if (b == 3) {
            return j1l.e((g5t) kp5Var.c);
        }
        if (b == 4) {
            return new fur((a1r0) ((jly0) kp5Var.f).get());
        }
        if (b == 5) {
            return new c1r0(dg30Var, (mwn0) daqVar.Wd.get());
        }
        jah.e(b);
        return null;
    }

    private final Object e() {
        ir00 ir00Var;
        tnm tnmVar = (tnm) this.d;
        byte b = this.b;
        if (b == 0) {
            Bundle bundle = (Bundle) ((jly0) tnmVar.e).get();
            if (bundle.getBoolean("link_expired", false)) {
                ir00Var = ir00.d;
            } else {
                ir00Var = bundle.getBoolean("pending_invitation", false) ? ir00.f : ir00.e;
            }
            return new e1b(null, ir00Var);
        }
        if (b == 1) {
            return sd30.p((a1b) tnmVar.b);
        }
        if (b == 2) {
            return (y0b) ((RetrofitMaker) ((daq) this.c).Y3.get()).createWebgateService(y0b.class, "android-blend-invitation");
        }
        if (b == 3) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return new ntk0(yon1.f0().c);
        }
        jah.e(b);
        return null;
    }

    private final Object f() {
        daq daqVar = (daq) this.c;
        i7d i7dVar = (i7d) this.d;
        byte b = this.b;
        switch (b) {
            case 0:
                i7dVar.getClass();
                h380 h380VarB = j380.b(103);
                daq daqVar2 = (daq) i7dVar.b;
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
                h380VarB.e("com.spotify.campaigns.storytelling.container.StorytellingContainerFragment", (p2p) i7dVar.c);
                return new jgu(h380VarB.b(true));
            case 1:
                return new s0q(daqVar, i7dVar, (byte) 5);
            case 2:
                gu7 gu7Var = (gu7) ((jly0) i7dVar.f).get();
                daq daqVar3 = (daq) i7dVar.b;
                return t380.p(s2.p(gu7Var, new y4l(daqVar3.F(), (fpr) daqVar3.Ka.get(), daqVar3.k2())));
            case 3:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) i7dVar.e).get(), (yqg) daqVar.J1.get(), (BlendStoryContainerActivity) i7dVar.a);
            case 4:
                return j310.x((BlendStoryContainerActivity) i7dVar.a, (t8u0) daqVar.d9.get());
            case 5:
                return new a2k(j380.n(h22.class, new h21(xqu.a((p2p) i7dVar.h), (byte) 3), qbs0.class, new t700(xqu.a((p2p) i7dVar.t), (byte) 24), pyf.class, new h21(xqu.a((p2p) i7dVar.X), (byte) 14), mh41.class, new uww0(xqu.a((p2p) i7dVar.Y), (byte) 7)));
            case 6:
                return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
            case 7:
                return kmq0.h((p2p) i7dVar.i, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
            case 8:
                daq daqVar4 = (daq) i7dVar.b;
                daq daqVar5 = (daq) i7dVar.b;
                return new lbs0(new gbs0(daqVar4.D1(), new bx5((Context) daqVar4.x1.a)), new lvc((t2j0) daqVar5.f2.get()), new xcs0((dma1) daqVar5.C5.get(), (yqg) daqVar5.J1.get(), (nfa0) daqVar5.b2.get()));
            case 9:
                return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
            case 10:
                return rx31.c(daqVar.d8, daqVar.A5);
            case 11:
                return (x0b) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(x0b.class, "android-blend-tastematch");
            case 12:
                g1n0 g1n0Var = (g1n0) ((jly0) i7dVar.P0).get();
                int i = t380.c;
                aan0.s(g1n0Var, kg11.t);
                return g1n0Var;
            case 13:
                return new g1n0((BlendStoryContainerActivity) i7dVar.a, (bi0) ((jly0) i7dVar.O0).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
            case 14:
                return new yym0((BlendStoryContainerActivity) i7dVar.a);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        String stringExtra;
        daq daqVar = (daq) this.c;
        o0q o0qVar = (o0q) this.d;
        byte b = this.b;
        switch (b) {
            case 0:
                gu7 gu7Var = (gu7) o0qVar.d.get();
                daq daqVar2 = o0qVar.b;
                return t380.p(s2.p(gu7Var, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
            case 1:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) o0qVar.c.get(), (yqg) daqVar.J1.get(), o0qVar.a);
            case 2:
                return j310.x(o0qVar.a, (t8u0) daqVar.d9.get());
            case 3:
                o0qVar.getClass();
                h380 h380VarB = j380.b(6);
                h380VarB.e(h22.class, new h21(xqu.a(o0qVar.f), (byte) 3));
                h380VarB.e(qbs0.class, new t700(xqu.a(o0qVar.h), (byte) 24));
                h380VarB.e(pyf.class, new h21(xqu.a(o0qVar.i), (byte) 14));
                h380VarB.e(mh41.class, new uww0(xqu.a(o0qVar.t), (byte) 7));
                h380VarB.e(BlendTasteMatchFragment.class, new h21(xqu.a(o0qVar.j1), (byte) 8));
                h380VarB.e(GroupBlendTasteMatchFragment.class, new t700(xqu.a(o0qVar.m1), (byte) 5));
                return new a2k(h380VarB.b(true));
            case 4:
                return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
            case 5:
                return kmq0.h(o0qVar.g, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
            case 6:
                daq daqVar3 = o0qVar.b;
                daq daqVar4 = o0qVar.b;
                return new lbs0(new gbs0(daqVar3.D1(), new bx5((Context) daqVar3.x1.a)), new lvc((t2j0) daqVar4.f2.get()), new xcs0((dma1) daqVar4.C5.get(), (yqg) daqVar4.J1.get(), (nfa0) daqVar4.b2.get()));
            case 7:
                return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
            case 8:
                return rx31.c(daqVar.d8, daqVar.A5);
            case 9:
                jo80 jo80Var = o0qVar.X;
                p2p p2pVar = o0qVar.Z;
                jly0 jly0Var = daqVar.f8;
                jly0 jly0Var2 = daqVar.d8;
                p2p p2pVar2 = o0qVar.P0;
                p2p p2pVar3 = o0qVar.Q0;
                p2p p2pVar4 = o0qVar.S0;
                p2p p2pVar5 = o0qVar.h1;
                caq caqVar = daqVar.A5;
                caq caqVar2 = daqVar.z1;
                p2p p2pVar6 = o0qVar.i1;
                o5b o5bVar = new o5b();
                o5bVar.a = p2pVar;
                o5bVar.b = jly0Var;
                o5bVar.c = jly0Var2;
                o5bVar.d = jo80Var;
                o5bVar.e = p2pVar2;
                o5bVar.f = p2pVar3;
                o5bVar.g = p2pVar4;
                o5bVar.h = p2pVar5;
                o5bVar.i = caqVar;
                o5bVar.j = caqVar2;
                o5bVar.k = p2pVar6;
                return o5bVar;
            case 10:
                return ((Activity) o0qVar.X.a).getResources();
            case 11:
                return (x0b) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(x0b.class, "android-blend-tastematch");
            case 12:
                g1n0 g1n0Var = (g1n0) o0qVar.O0.get();
                int i = t380.c;
                aan0.s(g1n0Var, kg11.t);
                return g1n0Var;
            case 13:
                return new g1n0((Activity) o0qVar.X.a, (bi0) o0qVar.N0.get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
            case 14:
                return new yym0((Activity) o0qVar.X.a);
            case 15:
                return new hf4(true, true, (luk) daqVar.L1.get());
            case 16:
                return new im4(false, (luk) daqVar.L1.get());
            case 17:
                daq daqVar5 = o0qVar.b;
                daq daqVar6 = o0qVar.b;
                Single singleFirstOrError = Observable.combineLatest(aan0.y((Observable) daqVar5.A8.get()), aan0.k((jj4) daqVar6.K4.get()), aan0.w((dxz0) daqVar6.I4.get()), new ncn0((byte) 7)).firstOrError();
                c8o.m(singleFirstOrError);
                Observable map = Observable.combineLatest(aan0.y((Observable) daqVar6.A8.get()), aan0.w((dxz0) daqVar6.I4.get()), new ncn0((byte) 5)).startWithItem(Boolean.TRUE).distinctUntilChanged().skip(1L).filter(new nh61((byte) 4)).map(new ncn0((byte) 6));
                c8o.m(map);
                return new q1n0(singleFirstOrError, map, (Activity) o0qVar.X.a, new q3n0((luk) daqVar6.L1.get()));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new r1n0((q1n0) o0qVar.S0.get(), new q3n0((luk) o0qVar.b.L1.get()));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new jzm0(o0qVar.a, (lzn0) o0qVar.P0.get(), (i8h1) daqVar.A5.get(), kmq0.m((Activity) o0qVar.X.a), (bsp0) o0qVar.Y0.get(), (o7r0) o0qVar.g1.get());
            case 20:
                return new zyp(this, (byte) 1);
            case 21:
                return new azp(this, (byte) 1);
            case 22:
                return new e70(xqu.a(o0qVar.U0));
            case 23:
                return new wy40(xqu.a(o0qVar.P0), xqu.a(daqVar.V2));
            case 24:
                return new bzp(this, (byte) 1);
            case 25:
                return new ybs((czp) o0qVar.f1.get(), (b4n0) daqVar.Sg.get());
            case 26:
                return new czp(this, (byte) 1);
            case 27:
                return new dzp(this, (byte) 1);
            case 28:
                return new ezp(this, (byte) 1);
            case 29:
                return new fzp(this, (byte) 1);
            case 30:
                return new gzp(this, (byte) 1);
            case 31:
                return new hzp(this, (byte) 1);
            case 32:
                return new hun0(new kco0());
            case 33:
                return kmq0.s(o0qVar.a);
            case 34:
                Intent intent = ((Activity) o0qVar.X.a).getIntent();
                return (intent == null || (stringExtra = intent.getStringExtra("key-invitation-token")) == null) ? "" : stringExtra;
            case 35:
                jo80 jo80Var2 = o0qVar.X;
                p2p p2pVar7 = o0qVar.Y;
                jly0 jly0Var3 = daqVar.f8;
                jly0 jly0Var4 = daqVar.d8;
                p2p p2pVar8 = o0qVar.P0;
                p2p p2pVar9 = o0qVar.Q0;
                p2p p2pVar10 = o0qVar.R0;
                p2p p2pVar11 = o0qVar.T0;
                p2p p2pVar12 = o0qVar.h1;
                caq caqVar3 = daqVar.A5;
                p2p p2pVar13 = o0qVar.k1;
                p2p p2pVar14 = o0qVar.l1;
                caq caqVar4 = daqVar.z1;
                p2p p2pVar15 = o0qVar.i1;
                vh50 vh50Var = new vh50();
                vh50Var.a = jo80Var2;
                vh50Var.b = p2pVar7;
                vh50Var.c = jly0Var3;
                vh50Var.d = jly0Var4;
                vh50Var.e = jo80Var2;
                vh50Var.f = p2pVar8;
                vh50Var.g = p2pVar9;
                vh50Var.h = p2pVar10;
                vh50Var.i = p2pVar11;
                vh50Var.j = p2pVar12;
                vh50Var.k = caqVar3;
                vh50Var.l = p2pVar13;
                vh50Var.m = p2pVar14;
                vh50Var.n = caqVar4;
                vh50Var.o = p2pVar15;
                return vh50Var;
            case 36:
                return new qh50((Activity) o0qVar.X.a);
            case 37:
                return new jh50((kh50) ((RetrofitMaker) o0qVar.b.Y3.get()).createWebgateService(kh50.class, "android-blend-tastematch"));
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object h() {
        daq daqVar = (daq) this.c;
        em0 em0Var = (em0) this.d;
        daq daqVar2 = (daq) em0Var.c;
        CMPActivity cMPActivity = (CMPActivity) em0Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                h380 h380VarB = j380.b(103);
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
                h380VarB.e("p.pmc", (p2p) em0Var.d);
                return new jgu(h380VarB.b(true));
            case 1:
                return new s0q(daqVar, em0Var, (byte) 0);
            case 2:
                return t380.p(s2.p((gu7) ((jly0) em0Var.g).get(), new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
            case 3:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) em0Var.f).get(), (yqg) daqVar.J1.get(), cMPActivity);
            case 4:
                return j310.x(cMPActivity, (t8u0) daqVar.d9.get());
            case 5:
                g1n0 g1n0Var = (g1n0) ((jly0) em0Var.t).get();
                int i = t380.c;
                aan0.s(g1n0Var, kg11.t);
                return g1n0Var;
            case 6:
                return new g1n0(cMPActivity, (bi0) ((jly0) em0Var.i).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
            case 7:
                return new yym0(cMPActivity);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object i() {
        k9k k9kVar = (k9k) this.d;
        byte b = this.b;
        if (b == 0) {
            return new njd((kup) ((jly0) k9kVar.e).get());
        }
        if (b == 1) {
            return new kup(this, (byte) 1);
        }
        if (b == 2) {
            return k9o0.v((q2p0) k9kVar.b);
        }
        jah.e(b);
        return null;
    }

    private final Object j() {
        g1i g1iVar = (g1i) this.d;
        byte b = this.b;
        if (b == 0) {
            return new nkd((mup) ((jly0) g1iVar.e).get());
        }
        if (b == 1) {
            return new mup(this, (byte) 1);
        }
        if (b == 2) {
            return k9o0.v((q2p0) g1iVar.b);
        }
        jah.e(b);
        return null;
    }

    private final Object k() {
        daq daqVar = (daq) this.c;
        byte b = this.b;
        if (b == 0) {
            krj1 krj1Var = (krj1) ((Cosmonaut) ((daq) ((k9k) this.d).b).w3.get()).createCosmosService(krj1.class);
            c8o.m(krj1Var);
            return new m9n(krj1Var);
        }
        if (b == 1) {
            return ((ekp) daqVar.Y8.get()).a(new File(((Context) daqVar.x1.a).getCacheDir(), "context-player-video-ads-cache"), 104857600L);
        }
        if (b == 2) {
            return new p74(false, false, false, false, false, (luk) daqVar.L1.get());
        }
        if (b == 3) {
            return new utg0((yqg) daqVar.J1.get());
        }
        jah.e(b);
        return null;
    }

    private final Object l() {
        daq daqVar = (daq) this.c;
        f9p f9pVar = (f9p) this.d;
        byte b = 0;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u5b1((CoverScreenWidgetProvider) f9pVar.t, (Context) daqVar.x1.a);
            case 1:
                return new ry30((t2j0) daqVar.f2.get(), (ru71) ((jly0) f9pVar.b).get(), (String) daqVar.k2.get(), (co40) daqVar.Q4.get(), (p85) daqVar.Il.get());
            case 2:
                return new ru71((Context) daqVar.x1.a, (ut71) daqVar.g2.get());
            case 3:
                daq daqVar2 = (daq) f9pVar.X;
                daq daqVar3 = (daq) f9pVar.X;
                return new u(new pck1((Context) daqVar2.x1.a, xqu.a((p2p) f9pVar.P0), xqu.a((p2p) f9pVar.Q0), xqu.a((p2p) f9pVar.R0), daqVar2.R1(), xqu.a((p2p) f9pVar.S0), (mr20) daqVar2.u5.get(), f9pVar.m(), new p2f0((ru71) ((jly0) f9pVar.b).get(), (mr20) daqVar2.cc.get()), (p85) daqVar2.Il.get(), f9pVar.f(), xqu.a((p2p) f9pVar.X0)), f9pVar.k(), f9pVar.k(), f9pVar.k(), new lb((Context) daqVar3.x1.a), (ne11) daqVar.fm.get(), (q8n) daqVar.E1.get(), (zle1) daqVar.a3.get(), (tol1) ((p2p) f9pVar.Y0).get(), (wu71) ((p2p) f9pVar.T0).get(), new m((i8h1) daqVar3.A5.get(), (mwn0) daqVar3.Wd.get()));
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
                return new e1q(this, b);
            case 7:
                return new piq0(new zhq0((Context) ((daq) f9pVar.X).x1.a), (mih0) ((jly0) f9pVar.c).get());
            case 8:
                return new lw70((gw70) daqVar.d8.get(), (q8n) daqVar.E1.get());
            case 9:
                return new bv00((uu00) daqVar.a5.get(), (q8n) daqVar.E1.get());
            case 10:
                return new bv00(xqu.a((p2p) f9pVar.O0), (q8n) daqVar.E1.get());
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
                y441 y441Var = new y441(new l85(false, (luk) daqVar8.L1.get()), (wu71) ((p2p) f9pVar.T0).get(), new yzu(new iuw((Context) daqVar8.x1.a, (ut71) daqVar8.g2.get()), (huw) ((RetrofitMaker) daqVar8.Y3.get()).createWebgateService(huw.class, "android-widgets-wrapped-eligibility"), (mr20) daqVar8.cc.get(), (nuw) daqVar8.Nn.get()), (cv71) ((p2p) f9pVar.U0).get());
                xim1 xim1Var = (xim1) ((p2p) f9pVar.V0).get();
                zsc zscVarF = f9pVar.f();
                p2p p2pVar = (p2p) f9pVar.W0;
                daq daqVar9 = (daq) f9pVar.X;
                return new hjm1(y441Var, xim1Var, zscVarF, new o860(p2pVar, (rol1) daqVar9.Ln.get(), (yqg) daqVar9.J1.get(), (e080) daqVar9.Pn.get(), (byte) 8));
            case 16:
                return new wu71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case 17:
                return new cv71((Context) daqVar.x1.a, (ut71) daqVar.g2.get(), (mr20) daqVar.cc.get());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                f9pVar.getClass();
                daq daqVar10 = (daq) f9pVar.X;
                return new xim1(new wpl1((upl1) ((RetrofitMaker) daqVar10.Y3.get()).createWebgateService(upl1.class, "android-widgets-dynamicnpvwidget-wrapped-resources"), new mx21((Context) daqVar10.x1.a, (ut71) daqVar10.g2.get())), new zrj1(new ezb1((k931) ((RetrofitMaker) daqVar10.Y3.get()).createWebgateService(k931.class, "android-widgets-dynamicnpvwidget-wrapped-retrieval"), (byte) 1), (ohm1) daqVar10.On.get(), (cv71) ((p2p) f9pVar.U0).get(), (byte) 17));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new jw70((gw70) daqVar.d8.get());
            case 20:
                return new vol1("COVER_SCREEN", xqu.a(daqVar.Gl));
            case 21:
                return new rsc((ru71) ((jly0) f9pVar.b).get());
            case 22:
                return new tx5((Context) daqVar.x1.a, (CoverScreenWidgetProvider) f9pVar.t, (ox5) daqVar.Gl.get());
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object m() {
        daq daqVar = (daq) this.c;
        ks6 ks6Var = (ks6) this.d;
        byte b = this.b;
        switch (b) {
            case 0:
                ks6Var.getClass();
                h380 h380VarB = j380.b(103);
                daq daqVar2 = (daq) ks6Var.b;
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
                h380VarB.e("com.spotify.campaigns.storytelling.container.StorytellingContainerFragment", (p2p) ks6Var.c);
                return new jgu(h380VarB.b(true));
            case 1:
                return new s0q(daqVar, ks6Var, (byte) 3);
            case 2:
                gu7 gu7Var = (gu7) ((jly0) ks6Var.f).get();
                daq daqVar3 = (daq) ks6Var.b;
                return t380.p(s2.p(gu7Var, new y4l(daqVar3.F(), (fpr) daqVar3.Ka.get(), daqVar3.k2())));
            case 3:
                return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) ks6Var.e).get(), (yqg) daqVar.J1.get(), (CulturalMomentsStoryActivity) ks6Var.a);
            case 4:
                return j310.x((CulturalMomentsStoryActivity) ks6Var.a, (t8u0) daqVar.d9.get());
            case 5:
                return new a2k(j380.n(h22.class, new h21(xqu.a((p2p) ks6Var.h), (byte) 3), qbs0.class, new t700(xqu.a((p2p) ks6Var.t), (byte) 24), pyf.class, new h21(xqu.a((p2p) ks6Var.X), (byte) 14), mh41.class, new uww0(xqu.a((p2p) ks6Var.Y), (byte) 7)));
            case 6:
                return wg0.i(daqVar.V2, daqVar.E1, daqVar.Y3, daqVar.C5, daqVar.zm, daqVar.f2, daqVar.f8);
            case 7:
                return kmq0.h((p2p) ks6Var.i, daqVar.z1, daqVar.r3, daqVar.d8, daqVar.f8, daqVar.C5, daqVar.J1, daqVar.Am, daqVar.Fh, daqVar.b2);
            case 8:
                daq daqVar4 = (daq) ks6Var.b;
                daq daqVar5 = (daq) ks6Var.b;
                return new lbs0(new gbs0(daqVar4.D1(), new bx5((Context) daqVar4.x1.a)), new lvc((t2j0) daqVar5.f2.get()), new xcs0((dma1) daqVar5.C5.get(), (yqg) daqVar5.J1.get(), (nfa0) daqVar5.b2.get()));
            case 9:
                return svf.d(daqVar.Bm, daqVar.Fh, daqVar.zm, daqVar.z1, daqVar.C1, daqVar.lk);
            case 10:
                return rx31.c(daqVar.d8, daqVar.A5);
            case 11:
                return new f1q(this, (byte) 0);
            case 12:
                return new j7c1((CulturalMomentsStoryActivity) ks6Var.a, (lzn0) ((p2p) ks6Var.Q0).get(), ks6Var.j());
            case 13:
                g1n0 g1n0Var = (g1n0) ((jly0) ks6Var.P0).get();
                int i = t380.c;
                aan0.s(g1n0Var, kg11.t);
                return g1n0Var;
            case 14:
                return new g1n0((CulturalMomentsStoryActivity) ks6Var.a, (bi0) ((jly0) ks6Var.O0).get(), (fwn0) daqVar.Pe.get(), (mwn0) daqVar.Wd.get(), (String) daqVar.Oe.get(), (syn0) daqVar.Ug.get());
            case 15:
                return new yym0((CulturalMomentsStoryActivity) ks6Var.a);
            case 16:
                return new g1q(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object n() {
        g1i g1iVar = (g1i) this.d;
        DiskAlmostFullActivity diskAlmostFullActivity = (DiskAlmostFullActivity) g1iVar.b;
        daq daqVar = (daq) this.c;
        byte b = this.b;
        if (b == 0) {
            gu7 gu7Var = (gu7) ((jly0) g1iVar.e).get();
            daq daqVar2 = (daq) g1iVar.c;
            return t380.p(s2.p(gu7Var, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
        }
        if (b == 1) {
            return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) g1iVar.d).get(), (yqg) daqVar.J1.get(), diskAlmostFullActivity);
        }
        if (b == 2) {
            return j310.x(diskAlmostFullActivity, (t8u0) daqVar.d9.get());
        }
        jah.e(b);
        return null;
    }

    public final Object get() {
        g1n0 jzm0Var;
        g1n0 gu7Var;
        byte b = this.a;
        Object obj = this.c;
        byte b2 = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                qma qmaVar = (qma) ((c21) obj2).b;
                q2p q2pVar = (q2p) obj;
                t2j0 t2j0Var = q2pVar.f;
                switch (b2) {
                    case 0:
                        l270 l270Var = q2pVar.b;
                        return !qmaVar.e ? ((yyp0) l270Var).b(new yug((byte) 2)) : l270Var;
                    case 1:
                        return new ubu0(t2j0Var);
                    case 2:
                        return new goa(t2j0Var);
                    case 3:
                        return new n2p(this);
                    case 4:
                        return new cn51(qmaVar.S0);
                    case 5:
                        return new o2p(this);
                    case 6:
                        gw70 gw70Var = q2pVar.q;
                        int iOrdinal = qmaVar.T0.ordinal();
                        if (iOrdinal == 0) {
                            return null;
                        }
                        if (iOrdinal == 1) {
                            return new qha(gw70Var, (byte) 1);
                        }
                        if (iOrdinal == 2) {
                            return new qha(gw70Var, (byte) 0);
                        }
                        eg.o();
                        return null;
                    default:
                        jah.e(b2);
                        return null;
                }
            case 1:
                g1i g1iVar = (g1i) obj2;
                if (b2 == 0) {
                    return new njd((kup) ((jly0) g1iVar.e).get());
                }
                if (b2 == 1) {
                    return new kup(this, (byte) 0);
                }
                if (b2 == 2) {
                    return k9o0.v((q2p0) g1iVar.b);
                }
                jah.e(b2);
                return null;
            case 2:
                k9k k9kVar = (k9k) obj2;
                if (b2 == 0) {
                    return new nkd((mup) ((jly0) k9kVar.e).get());
                }
                if (b2 == 1) {
                    return new mup(this, (byte) 0);
                }
                if (b2 == 2) {
                    return k9o0.v((q2p0) k9kVar.b);
                }
                jah.e(b2);
                return null;
            case 3:
                nwp nwpVar = (nwp) obj;
                c21 c21Var = (c21) obj2;
                q2p0 q2p0Var = (q2p0) c21Var.b;
                switch (b2) {
                    case 0:
                        return k9o0.t(q2p0Var);
                    case 1:
                        return k9o0.B(q2p0Var);
                    case 2:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) c21Var.e).get()), (Flowable) ((jly0) c21Var.f).get(), (Flowable) ((jly0) c21Var.g).get(), c21Var.d());
                    case 3:
                        return f2u0.z((Flowable) ((jly0) c21Var.e).get(), (Scheduler) nwpVar.s.get(), (yqg) nwpVar.i.get(), c21Var.d());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) c21Var.e).get(), c21Var.d());
                    case 5:
                        return k9o0.z(q2p0Var);
                    case 6:
                        return new rup(this, (byte) 0);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 4:
                nwp nwpVar2 = (nwp) obj;
                wdm wdmVar = (wdm) obj2;
                switch (b2) {
                    case 0:
                        return new sxo(this, (byte) 1);
                    case 1:
                        return k9o0.B((q2p0) wdmVar.b);
                    case 2:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) wdmVar.d).get()), (Flowable) ((jly0) wdmVar.e).get(), (Flowable) ((jly0) wdmVar.f).get(), wdmVar.b());
                    case 3:
                        return f2u0.z((Flowable) ((jly0) wdmVar.d).get(), (Scheduler) nwpVar2.s.get(), (yqg) nwpVar2.i.get(), wdmVar.b());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) wdmVar.d).get(), wdmVar.b());
                    case 5:
                        PublishProcessor publishProcessorD = ((q2p0) wdmVar.b).d();
                        publishProcessorD.getClass();
                        return new FlowableOnBackpressureLatest(publishProcessorD);
                    case 6:
                        return k9o0.z((q2p0) wdmVar.b);
                    case 7:
                        return k9o0.t((q2p0) wdmVar.b);
                    case 8:
                        return k9o0.v((q2p0) wdmVar.b);
                    case 9:
                        return k9o0.r((q2p0) wdmVar.b);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 5:
                nwp nwpVar3 = (nwp) obj;
                if (b2 == 0) {
                    return new xup(this, (byte) 0);
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        return k9o0.v((q2p0) ((g1i) obj2).b);
                    }
                    jah.e(b2);
                    return null;
                }
                gbp gbpVar = nwpVar3.l;
                em0 em0Var = nwpVar3.a;
                Flowable flowable = (Flowable) gbpVar.get();
                tdf0 tdf0Var = (tdf0) ((daq) em0Var.b).Cr.get();
                c8o.l(tdf0Var);
                wdf0 wdf0Var = (wdf0) ((daq) em0Var.b).Qr.get();
                c8o.l(wdf0Var);
                return new tnu(wdf0Var, flowable, tdf0Var);
            case 6:
                nwp nwpVar4 = (nwp) obj;
                kp5 kp5Var = (kp5) obj2;
                q2p0 q2p0Var2 = (q2p0) kp5Var.a;
                if (b2 == 0) {
                    return k9o0.t(q2p0Var2);
                }
                if (b2 == 1) {
                    return k9o0.B(q2p0Var2);
                }
                if (b2 == 2) {
                    return f2u0.B(f2u0.D((Flowable) ((jly0) kp5Var.d).get()), (Flowable) ((jly0) kp5Var.e).get(), (Flowable) ((jly0) kp5Var.f).get(), kp5Var.m());
                }
                if (b2 == 3) {
                    return f2u0.z((Flowable) ((jly0) kp5Var.d).get(), (Scheduler) nwpVar4.s.get(), (yqg) nwpVar4.i.get(), kp5Var.m());
                }
                if (b2 == 4) {
                    return f2u0.y((Flowable) ((jly0) kp5Var.d).get(), kp5Var.m());
                }
                if (b2 == 5) {
                    return k9o0.z(q2p0Var2);
                }
                jah.e(b2);
                return null;
            case 7:
                nwp nwpVar5 = (nwp) obj;
                s24 s24Var = (s24) obj2;
                switch (b2) {
                    case 0:
                        return new gkd();
                    case 1:
                        return f2u0.z((Flowable) ((jly0) s24Var.e).get(), (Scheduler) nwpVar5.s.get(), (yqg) nwpVar5.i.get(), s24Var.u());
                    case 2:
                        return k9o0.B((q2p0) s24Var.b);
                    case 3:
                        return k9o0.v((q2p0) s24Var.b);
                    case 4:
                        n6r0 n6r0Var = (n6r0) ((jly0) s24Var.h).get();
                        em0 em0Var2 = new em0(s24Var.O(), s24Var.S(), s24Var.B(), new asn(s24Var.O(), new lvc1((Flowable) ((jly0) s24Var.f).get(), f2u0.D((Flowable) ((jly0) s24Var.e).get()))), s24Var.j0(), (iac0) ((jly0) s24Var.g).get());
                        em0 em0Var3 = nwpVar5.a;
                        em0 em0Var4 = nwpVar5.a;
                        gw70 gw70VarA0 = em0Var3.a0();
                        c8o.l(gw70VarA0);
                        woa woaVarS = em0Var4.s();
                        c8o.l(woaVarS);
                        kma kmaVarR = em0Var4.r();
                        c8o.l(kmaVarR);
                        s801 s801VarI0 = em0Var4.I0();
                        c8o.l(s801VarI0);
                        o7h1 o7h1Var = new o7h1((n6r0) ((jly0) s24Var.h).get(), (i8h1) ((nwp) s24Var.c).Z.get());
                        zhy zhyVarE = s24Var.E();
                        hwp hwpVar = (hwp) nwpVar5.T1.get();
                        d4e0 d4e0Var = new d4e0((n6r0) ((jly0) s24Var.h).get(), (byte) 24);
                        hod0 hod0Var = new hod0((n6r0) ((jly0) s24Var.h).get(), (byte) 28);
                        boolean zA = s24Var.s().a();
                        d4q d4qVar = (d4q) ((teq) em0Var4.c).b.Bb.get();
                        c8o.l(d4qVar);
                        return new uwl(n6r0Var, em0Var2, gw70VarA0, woaVarS, kmaVarR, s801VarI0, o7h1Var, zhyVarE, hwpVar, d4e0Var, hod0Var, zA, d4qVar);
                    case 5:
                        return ((q2p0) s24Var.b).i();
                    case 6:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) s24Var.e).get()), (Flowable) ((jly0) s24Var.f).get(), (Flowable) ((jly0) s24Var.t).get(), s24Var.u());
                    case 7:
                        return f2u0.y((Flowable) ((jly0) s24Var.e).get(), s24Var.u());
                    case 8:
                        return k9o0.z((q2p0) s24Var.b);
                    case 9:
                        return k9o0.t((q2p0) s24Var.b);
                    case 10:
                        return new owp(this, (byte) 0);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 8:
                toj0 toj0Var = (toj0) obj2;
                AccountPickerActivity accountPickerActivity = (AccountPickerActivity) toj0Var.b;
                daq daqVar = (daq) obj;
                if (b2 == 0) {
                    gu7 gu7Var2 = (gu7) ((jly0) toj0Var.e).get();
                    daq daqVar2 = (daq) toj0Var.c;
                    return t380.p(s2.p(gu7Var2, new y4l(daqVar2.F(), (fpr) daqVar2.Ka.get(), daqVar2.k2())));
                }
                if (b2 == 1) {
                    return new gu7((ark1) daqVar.x8.get(), (Flowable) daqVar.D5.get(), (w9u0) ((jly0) toj0Var.d).get(), (yqg) daqVar.J1.get(), accountPickerActivity);
                }
                if (b2 == 2) {
                    return j310.x(accountPickerActivity, (t8u0) daqVar.d9.get());
                }
                if (b2 == 3) {
                    return new yyp(this);
                }
                jah.e(b2);
                return null;
            case 9:
                daq daqVar3 = (daq) obj;
                yxo yxoVar = (yxo) obj2;
                switch (b2) {
                    case 0:
                        gu7 gu7Var3 = (gu7) ((jly0) yxoVar.e).get();
                        daq daqVar4 = (daq) yxoVar.d;
                        return t380.p(s2.p(gu7Var3, new y4l(daqVar4.F(), (fpr) daqVar4.Ka.get(), daqVar4.k2())));
                    case 1:
                        return new gu7((ark1) daqVar3.x8.get(), (Flowable) daqVar3.D5.get(), (w9u0) yxoVar.b.get(), (yqg) daqVar3.J1.get(), (AccountSelectionActivity) yxoVar.c);
                    case 2:
                        return j310.x((AccountSelectionActivity) yxoVar.c, (t8u0) daqVar3.d9.get());
                    case 3:
                        c2r0 c2r0Var = (c2r0) daqVar3.hm.get();
                        AccountSelectionActivity accountSelectionActivity = (AccountSelectionActivity) yxoVar.c;
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        return c2r0Var.e(accountSelectionActivity, yon1.G1("KID_ACCOUNT_SELECTION", "kid-account-selection", 886, "kid-account-selection"), nik1.D3.a());
                    case 4:
                        return new r1n0((q1n0) ((p2p) yxoVar.h).get(), new q3n0((luk) ((daq) yxoVar.d).L1.get()));
                    case 5:
                        daq daqVar5 = (daq) yxoVar.d;
                        daq daqVar6 = (daq) yxoVar.d;
                        Single singleFirstOrError = Observable.combineLatest(aan0.y((Observable) daqVar5.A8.get()), aan0.k((jj4) daqVar6.K4.get()), aan0.w((dxz0) daqVar6.I4.get()), new ncn0((byte) 7)).firstOrError();
                        c8o.m(singleFirstOrError);
                        Observable map = Observable.combineLatest(aan0.y((Observable) daqVar6.A8.get()), aan0.w((dxz0) daqVar6.I4.get()), new ncn0((byte) 5)).startWithItem(Boolean.TRUE).distinctUntilChanged().skip(1L).filter(new nh61((byte) 4)).map(new ncn0((byte) 6));
                        c8o.m(map);
                        return new q1n0(singleFirstOrError, map, (AccountSelectionActivity) yxoVar.c, new q3n0((luk) daqVar6.L1.get()));
                    case 6:
                        jzm0Var = new jzm0((AccountSelectionActivity) yxoVar.c, (lzn0) ((p2p) yxoVar.Y).get(), (i8h1) daqVar3.A5.get(), kmq0.m((AccountSelectionActivity) yxoVar.c), (bsp0) yxoVar.R0.get(), (o7r0) ((p2p) yxoVar.Z0).get());
                        break;
                    case 7:
                        g1n0 g1n0Var = (g1n0) yxoVar.X.get();
                        int i = t380.c;
                        aan0.s(g1n0Var, kg11.t);
                        return g1n0Var;
                    case 8:
                        jzm0Var = new g1n0((AccountSelectionActivity) yxoVar.c, (bi0) yxoVar.t.get(), (fwn0) daqVar3.Pe.get(), (mwn0) daqVar3.Wd.get(), (String) daqVar3.Oe.get(), (syn0) daqVar3.Ug.get());
                        break;
                    case 9:
                        return new yym0((AccountSelectionActivity) yxoVar.c);
                    case 10:
                        return new zyp(this, (byte) 0);
                    case 11:
                        return new azp(this, (byte) 0);
                    case 12:
                        return new e70(xqu.a((p2p) yxoVar.Z));
                    case 13:
                        return new wy40(xqu.a((p2p) yxoVar.Y), xqu.a(daqVar3.V2));
                    case 14:
                        return new bzp(this, (byte) 0);
                    case 15:
                        return ((AccountSelectionActivity) yxoVar.c).getResources();
                    case 16:
                        return new ybs((czp) yxoVar.Y0.get(), (b4n0) daqVar3.Sg.get());
                    case 17:
                        return new czp(this, (byte) 0);
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        return new dzp(this, (byte) 0);
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        return new ezp(this, (byte) 0);
                    case 20:
                        return new fzp(this, (byte) 0);
                    case 21:
                        return new gzp(this, (byte) 0);
                    case 22:
                        return new hzp(this, (byte) 0);
                    case 23:
                        return new hun0(new kco0());
                    case 24:
                        t3b1 t3b1Var = (AccountSelectionActivity) yxoVar.c;
                        gw70 gw70Var2 = (gw70) daqVar3.d8.get();
                        return new xfx(t3b1Var, gw70Var2, new sua((byte) 9));
                    case 25:
                        return new im4(false, (luk) daqVar3.L1.get());
                    case 26:
                        b2r0 b2r0Var = (b2r0) yxoVar.g.get();
                        AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                        return new fp(b2r0Var, new txk0(yon1.G1("KID_ACCOUNT_SELECTION", "kid-account-selection", 886, "kid-account-selection").a, nik1.D3.a, (byte) 25));
                    default:
                        jah.e(b2);
                        return null;
                }
                return jzm0Var;
            case 10:
                daq daqVar7 = (daq) obj;
                p2o0 p2o0Var = (p2o0) obj2;
                AccountSwitcherActivity accountSwitcherActivity = (AccountSwitcherActivity) p2o0Var.b;
                if (b2 == 0) {
                    gu7 gu7Var4 = (gu7) ((jly0) p2o0Var.e).get();
                    daq daqVar8 = (daq) p2o0Var.c;
                    return t380.p(s2.p(gu7Var4, new y4l(daqVar8.F(), (fpr) daqVar8.Ka.get(), daqVar8.k2())));
                }
                if (b2 == 1) {
                    return new gu7((ark1) daqVar7.x8.get(), (Flowable) daqVar7.D5.get(), (w9u0) ((jly0) p2o0Var.d).get(), (yqg) daqVar7.J1.get(), accountSwitcherActivity);
                }
                if (b2 == 2) {
                    return j310.x(accountSwitcherActivity, (t8u0) daqVar7.d9.get());
                }
                if (b2 == 3) {
                    return accountSwitcherActivity;
                }
                jah.e(b2);
                return null;
            case 11:
                ip31 ip31Var = (ip31) obj2;
                AgeVerificationDialogActivity ageVerificationDialogActivity = (AgeVerificationDialogActivity) ip31Var.b;
                daq daqVar9 = (daq) obj;
                if (b2 == 0) {
                    gu7 gu7Var5 = (gu7) ((jly0) ip31Var.e).get();
                    daq daqVar10 = (daq) ip31Var.c;
                    return t380.p(s2.p(gu7Var5, new y4l(daqVar10.F(), (fpr) daqVar10.Ka.get(), daqVar10.k2())));
                }
                if (b2 == 1) {
                    gu7Var = new gu7((ark1) daqVar9.x8.get(), (Flowable) daqVar9.D5.get(), (w9u0) ((jly0) ip31Var.d).get(), (yqg) daqVar9.J1.get(), ageVerificationDialogActivity);
                } else {
                    if (b2 == 2) {
                        return j310.x(ageVerificationDialogActivity, (t8u0) daqVar9.d9.get());
                    }
                    if (b2 == 3) {
                        g1n0 g1n0Var2 = (g1n0) ((jly0) ip31Var.h).get();
                        int i2 = t380.c;
                        aan0.s(g1n0Var2, kg11.t);
                        return g1n0Var2;
                    }
                    if (b2 != 4) {
                        if (b2 == 5) {
                            return new yym0(ageVerificationDialogActivity);
                        }
                        jah.e(b2);
                        return null;
                    }
                    gu7Var = new g1n0(ageVerificationDialogActivity, (bi0) ((jly0) ip31Var.g).get(), (fwn0) daqVar9.Pe.get(), (mwn0) daqVar9.Wd.get(), (String) daqVar9.Oe.get(), (syn0) daqVar9.Ug.get());
                }
                return gu7Var;
            case 12:
                daq daqVar11 = (daq) obj;
                f9p f9pVar = (f9p) obj2;
                switch (b2) {
                    case 0:
                        return (qm3) ((RetrofitMaker) daqVar11.Y3.get()).createWebgateService(qm3.class, "android-allboarding-entrypointmusic");
                    case 1:
                        return new edr0((byte) 1);
                    case 2:
                        f9pVar.getClass();
                        h380 h380VarB = j380.b(12);
                        h380VarB.e(h22.class, new h21(xqu.a((p2p) f9pVar.N0), (byte) 3));
                        h380VarB.e(qbs0.class, new t700(xqu.a((p2p) f9pVar.P0), (byte) 24));
                        h380VarB.e(pyf.class, new h21(xqu.a((p2p) f9pVar.Q0), (byte) 14));
                        h380VarB.e(mh41.class, new uww0(xqu.a((p2p) f9pVar.R0), (byte) 7));
                        h380VarB.e(CarouselFragment.class, new h21(xqu.a((p2p) f9pVar.S0), (byte) 10));
                        h380VarB.e(ContentPickerFragment.class, new h21(xqu.a((p2p) f9pVar.U0), (byte) 19));
                        h380VarB.e(ContextualAudioFragment.class, new h21(xqu.a((p2p) f9pVar.V0), (byte) 21));
                        h380VarB.e(ErrorFragment.class, new h21(xqu.a((p2p) f9pVar.W0), (byte) 29));
                        h380VarB.e(NotificationPermissionFragment.class, new t700(xqu.a((p2p) f9pVar.Z0), (byte) 20));
                        h380VarB.e(SearchFragment.class, new uww0(xqu.a((p2p) f9pVar.g), (byte) 8));
                        h380VarB.e(SkipDialogFragment.class, new uww0(xqu.a((p2p) f9pVar.h), (byte) 14));
                        h380VarB.e(SummaryFragment.class, new uww0(xqu.a((p2p) f9pVar.i), (byte) 22));
                        return new a2k(h380VarB.b(true));
                    case 3:
                        return wg0.i(daqVar11.V2, daqVar11.E1, daqVar11.Y3, daqVar11.C5, daqVar11.zm, daqVar11.f2, daqVar11.f8);
                    case 4:
                        return kmq0.h((p2p) f9pVar.O0, daqVar11.z1, daqVar11.r3, daqVar11.d8, daqVar11.f8, daqVar11.C5, daqVar11.J1, daqVar11.Am, daqVar11.Fh, daqVar11.b2);
                    case 5:
                        daq daqVar12 = (daq) f9pVar.X;
                        daq daqVar13 = (daq) f9pVar.X;
                        return new lbs0(new gbs0(daqVar12.D1(), new bx5((Context) daqVar12.x1.a)), new lvc((t2j0) daqVar13.f2.get()), new xcs0((dma1) daqVar13.C5.get(), (yqg) daqVar13.J1.get(), (nfa0) daqVar13.b2.get()));
                    case 6:
                        return svf.d(daqVar11.Bm, daqVar11.Fh, daqVar11.zm, daqVar11.z1, daqVar11.C1, daqVar11.lk);
                    case 7:
                        return rx31.c(daqVar11.d8, daqVar11.A5);
                    case 8:
                        g5t g5tVar = daqVar11.L1;
                        jly0 jly0Var = daqVar11.d8;
                        jly0 jly0Var2 = (jly0) f9pVar.c;
                        caq caqVar = daqVar11.t9;
                        caq caqVar2 = daqVar11.A5;
                        caq caqVar3 = daqVar11.fg;
                        jly0 jly0Var3 = (jly0) f9pVar.b;
                        caq caqVar4 = daqVar11.r3;
                        caq caqVar5 = daqVar11.z1;
                        dzd dzdVar = new dzd();
                        dzdVar.a = g5tVar;
                        dzdVar.b = jly0Var;
                        dzdVar.c = jly0Var2;
                        dzdVar.d = caqVar;
                        dzdVar.e = caqVar2;
                        dzdVar.f = caqVar3;
                        dzdVar.g = jly0Var3;
                        dzdVar.h = caqVar4;
                        dzdVar.i = caqVar5;
                        return dzdVar;
                    case 9:
                        en3 en3Var = new en3();
                        en3Var.a = vo41.a;
                        return en3Var;
                    case 10:
                        g5t g5tVar2 = daqVar11.L1;
                        p2p p2pVar = (p2p) f9pVar.Y;
                        jly0 jly0Var4 = daqVar11.d8;
                        caq caqVar6 = daqVar11.tm;
                        jly0 jly0Var5 = (jly0) f9pVar.d;
                        jly0 jly0Var6 = (jly0) f9pVar.e;
                        jly0 jly0Var7 = daqVar11.a3;
                        caq caqVar7 = daqVar11.A5;
                        caq caqVar8 = daqVar11.fg;
                        jly0 jly0Var8 = (jly0) f9pVar.b;
                        jly0 jly0Var9 = (jly0) f9pVar.c;
                        caq caqVar9 = daqVar11.r3;
                        caq caqVar10 = daqVar11.z1;
                        j0m j0mVar = new j0m();
                        j0mVar.a = g5tVar2;
                        j0mVar.b = p2pVar;
                        j0mVar.c = jly0Var4;
                        j0mVar.d = caqVar6;
                        j0mVar.e = jly0Var5;
                        j0mVar.f = jly0Var6;
                        j0mVar.g = jly0Var7;
                        j0mVar.h = caqVar7;
                        j0mVar.i = caqVar8;
                        j0mVar.j = jly0Var8;
                        j0mVar.k = jly0Var9;
                        j0mVar.l = caqVar9;
                        j0mVar.m = caqVar10;
                        return j0mVar;
                    case 11:
                        return new gir0();
                    case 12:
                        return new ms3((ccc0) daqVar11.y8.get(), cto1.q((AllboardingActivity) f9pVar.t));
                    case 13:
                        lir0 lir0Var = (AllboardingActivity) f9pVar.t;
                        gw70 gw70Var3 = (gw70) daqVar11.d8.get();
                        return new xfx(lir0Var, gw70Var3, new sua((byte) 9));
                    case 14:
                        return new im4(false, (luk) daqVar11.L1.get());
                    case 15:
                        g5t g5tVar3 = daqVar11.L1;
                        jly0 jly0Var10 = (jly0) f9pVar.b;
                        caq caqVar11 = daqVar11.A5;
                        caq caqVar12 = daqVar11.fg;
                        caq caqVar13 = daqVar11.J6;
                        caq caqVar14 = daqVar11.r3;
                        jly0 jly0Var11 = daqVar11.d8;
                        jo80 jo80Var = (jo80) f9pVar.Z;
                        caq caqVar15 = daqVar11.Cm;
                        jly0 jly0Var12 = (jly0) f9pVar.c;
                        gmm gmmVar = new gmm();
                        gmmVar.a = g5tVar3;
                        gmmVar.b = jly0Var10;
                        gmmVar.c = caqVar11;
                        gmmVar.d = caqVar12;
                        gmmVar.e = caqVar13;
                        gmmVar.f = caqVar14;
                        gmmVar.g = jly0Var11;
                        gmmVar.h = jo80Var;
                        gmmVar.i = caqVar15;
                        gmmVar.j = jly0Var12;
                        return gmmVar;
                    case 16:
                        jly0 jly0Var13 = (jly0) f9pVar.b;
                        caq caqVar16 = daqVar11.A5;
                        jly0 jly0Var14 = (jly0) f9pVar.c;
                        khz khzVar = new khz();
                        khzVar.a = jly0Var13;
                        khzVar.b = caqVar16;
                        khzVar.c = jly0Var14;
                        return khzVar;
                    case 17:
                        jo80 jo80Var2 = (jo80) f9pVar.Z;
                        caq caqVar17 = daqVar11.A2;
                        caq caqVar18 = daqVar11.C1;
                        caq caqVar19 = daqVar11.A5;
                        caq caqVar20 = daqVar11.fg;
                        jly0 jly0Var15 = daqVar11.Fm;
                        p2p p2pVar2 = (p2p) f9pVar.Y0;
                        xro0 xro0Var = new xro0();
                        xro0Var.a = jo80Var2;
                        xro0Var.b = caqVar18;
                        xro0Var.c = caqVar19;
                        xro0Var.d = caqVar20;
                        xro0Var.e = jly0Var15;
                        xro0Var.f = p2pVar2;
                        return xro0Var;
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        return Boolean.valueOf(((ul4) ((p2p) f9pVar.X0).get()).e());
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        return new ul4((luk) daqVar11.L1.get());
                    case 20:
                        p2p p2pVar3 = (p2p) f9pVar.Y;
                        jly0 jly0Var16 = (jly0) f9pVar.b;
                        caq caqVar21 = daqVar11.A2;
                        caq caqVar22 = daqVar11.z1;
                        jly0 jly0Var17 = daqVar11.J1;
                        caq caqVar23 = daqVar11.tm;
                        jly0 jly0Var18 = daqVar11.d8;
                        caq caqVar24 = daqVar11.A5;
                        g5t g5tVar4 = daqVar11.L1;
                        caq caqVar25 = daqVar11.fg;
                        l351 l351Var = new l351();
                        l351Var.a = p2pVar3;
                        l351Var.b = jly0Var16;
                        l351Var.c = caqVar21;
                        l351Var.d = caqVar22;
                        l351Var.e = jly0Var17;
                        l351Var.f = caqVar23;
                        l351Var.g = jly0Var18;
                        l351Var.h = caqVar24;
                        l351Var.i = g5tVar4;
                        l351Var.j = caqVar25;
                        return l351Var;
                    case 21:
                        caq caqVar26 = daqVar11.A5;
                        jly0 jly0Var19 = (jly0) f9pVar.b;
                        k591 k591Var = new k591();
                        k591Var.a = caqVar26;
                        k591Var.b = jly0Var19;
                        return k591Var;
                    case 22:
                        Object obj3 = f9pVar.d;
                        jly0 jly0Var20 = daqVar11.d8;
                        caq caqVar27 = daqVar11.r3;
                        g5t g5tVar5 = daqVar11.L1;
                        jly0 jly0Var21 = (jly0) f9pVar.c;
                        uxc1 uxc1Var = new uxc1();
                        uxc1Var.a = jly0Var20;
                        uxc1Var.b = caqVar27;
                        uxc1Var.c = g5tVar5;
                        uxc1Var.d = jly0Var21;
                        return uxc1Var;
                    default:
                        jah.e(b2);
                        return null;
                }
            case 13:
                daq daqVar14 = (daq) obj;
                if (b2 == 0) {
                    return new f0q(this);
                }
                if (b2 == 1) {
                    return new irb1((zeu0) daqVar14.C6.get());
                }
                if (b2 == 2) {
                    return new i090((gw70) daqVar14.d8.get());
                }
                if (b2 == 3) {
                    return ((AppProtocolRemoteService) ((cp31) obj2).a).getClass().getSimpleName();
                }
                jah.e(b2);
                return null;
            case 14:
                return a();
            case 15:
                return b();
            case 16:
                return c();
            case 17:
                return d();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return e();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return f();
            case 20:
                return g();
            case 21:
                return h();
            case 22:
                g1i g1iVar2 = (g1i) obj2;
                daq daqVar15 = (daq) obj;
                if (b2 == 0) {
                    return new mir0(((b2r0) ((jly0) g1iVar2.d).get()).a());
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        return (br81) ((RetrofitMaker) daqVar15.Y3.get()).createWebgateService(br81.class, "android-login-signup-api-v2");
                    }
                    jah.e(b2);
                    return null;
                }
                c2r0 c2r0Var2 = (c2r0) daqVar15.hm.get();
                CallingCodePickerActivity callingCodePickerActivity = (CallingCodePickerActivity) g1iVar2.b;
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                return c2r0Var2.e(callingCodePickerActivity, yon1.G1("PHONENUMBER_CALLINGCODEPICKER", "phonenumber/callingcodepicker", 1435, "phonenumber"), (qir0) null);
            case 23:
                return i();
            case 24:
                return j();
            case 25:
                return k();
            case 26:
                return l();
            case 27:
                return m();
            case 28:
                return n();
            default:
                wdm wdmVar2 = (wdm) obj2;
                daq daqVar16 = (daq) obj;
                switch (b2) {
                    case 0:
                        return new ggu((q8n) daqVar16.E1.get(), (q8n) daqVar16.V2.get());
                    case 1:
                        Context context = (Context) daqVar16.x1.a;
                        daq daqVar17 = (daq) wdmVar2.b;
                        daq daqVar18 = (daq) wdmVar2.b;
                        return new l6b1(context, new yfu((wre0) daqVar17.Nm.get(), (hxd1) daqVar17.Om.get(), (byte) 21), new oi((fsw0) daqVar18.Pm.get(), ((Boolean) daqVar18.y1.get()).booleanValue(), daqVar18.J1, daqVar18.li, daqVar18.Qm, (p2p) wdmVar2.d, daqVar18.Rm, (p2p) wdmVar2.e, daqVar18.r3, (q8n) daqVar18.V2.get()), new ec80((i6a1) daqVar18.mi.get()));
                    case 2:
                        return new twb((byte) 26);
                    case 3:
                        return new t2b((byte) 17);
                    case 4:
                        return new en41((p2p) wdmVar2.g, (p2p) wdmVar2.Y);
                    case 5:
                        daq daqVar19 = (daq) wdmVar2.b;
                        return new vkv(t380.w((xm41) daqVar19.W4.get(), (xm41) daqVar19.H1.get(), (xm41) daqVar19.V4.get(), (xm41) daqVar19.ta.get(), (xm41) daqVar19.Yl.get(), (xm41) daqVar19.Wm.get(), new xm41[]{(xm41) daqVar19.s4.get(), (xm41) daqVar19.l5.get(), (xm41) daqVar19.eh.get()}));
                    case 6:
                        return new hd61(daqVar16.V4, (l2q) ((jly0) wdmVar2.h).get(), (m2q) ((jly0) wdmVar2.X).get());
                    case 7:
                        return new l2q();
                    case 8:
                        return new m2q(this);
                    case 9:
                        return new n2q(this);
                    case 10:
                        return new e5n(false, (luk) daqVar16.L1.get());
                    default:
                        jah.e(b2);
                        return null;
                }
        }
    }
}
