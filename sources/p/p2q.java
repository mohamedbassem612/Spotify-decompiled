package p;

import android.app.Activity;
import android.content.Context;
import com.spotify.blend.tastematch.BlendStoryContainerActivity;
import com.spotify.campaigns.storytelling.container.StorytellingContainerFragment;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;
import com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity;
import com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p2q implements jly0 {
    public final /* synthetic */ byte a;
    public final daq b;
    public final byte c;
    public final dl4 d;
    public final Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ p2q(daq daqVar, dl4 dl4Var, Object obj, int i, byte b) {
        this.a = b;
        this.b = daqVar;
        this.d = dl4Var;
        this.e = obj;
        this.c = i;
    }

    private final Object a() {
        i7d i7dVar = this.d;
        f0a f0aVar = (f0a) this.e;
        daq daqVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                f0aVar.getClass();
                h380 h380VarB = j380.b(104);
                daq daqVar2 = (daq) f0aVar.c;
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
                h380VarB.e("com.spotify.campaigns.storytelling.container.StorytellingContainerFragment", (p2p) ((i7d) f0aVar.d).c);
                h380VarB.e("p.k7c1", (p2q) f0aVar.e);
                return new jgu(h380VarB.b(true));
            case 1:
                return new s0q(daqVar, i7dVar, f0aVar, (byte) 8);
            case 2:
                return ((f1q) ((jly0) f0aVar.g).get()).a(rbc1.a);
            case 3:
                return new f1q(this, (byte) 2);
            case 4:
                x0b x0bVar = (x0b) ((p2p) i7dVar.N0).get();
                BlendStoryContainerActivity blendStoryContainerActivity = (BlendStoryContainerActivity) i7dVar.a;
                lzn0 lzn0Var = (lzn0) ((p2p) i7dVar.Q0).get();
                daq daqVar3 = (daq) i7dVar.b;
                gw70 gw70Var = (gw70) daqVar3.d8.get();
                kcg kcgVar = new kcg();
                String strG = i7dVar.g();
                i8h1 i8h1Var = (i8h1) daqVar3.A5.get();
                c2r0 c2r0Var = (c2r0) daqVar3.hm.get();
                String strConcat = "spotify:blend:story:".concat(i7dVar.g());
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new w4c1(new r4b(x0bVar, blendStoryContainerActivity, lzn0Var, gw70Var, kcgVar, strG, i8h1Var, c2r0Var.d(yon1.g0(), new lik1(strConcat).a()), new xok0(yon1.G1("BLEND_DATA_STORY", "blend/data-story", 215, "blend").c, "spotify:blend:story:".concat(i7dVar.g()), (byte) 6)));
            case 5:
                return new las0();
            case 6:
                return new v6c1();
            case 7:
                return new k9c1();
            case 8:
                return new fb71();
            case 9:
                return new z4c1(new k7b1(1, (w4c1) ((jly0) f0aVar.i).get(), w4c1.class, "storyState", "storyState(I)Lcom/spotify/campaigns/storytelling/common/StoryState;", 0, (byte) 5));
            case 10:
                return ((tz7) daqVar.a.r1.get()).a(((zf30) ((StorytellingContainerFragment) f0aVar.b)).s1);
            case 11:
                return new fgi1();
            case 12:
                return new kq41((tp41) daqVar.Dg.get());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object b() {
        daq daqVar = this.b;
        byte b = this.c;
        if (b == 0) {
            return new ts90((v4o0) daqVar.je.get(), (gkb) daqVar.Rb.get(), (c9c0) daqVar.Ed.get(), (p2q) ((qqp) this.e).e);
        }
        if (b == 1) {
            return new et90((v4o0) daqVar.je.get(), new fjb(false), (z5a0) daqVar.co.get(), (Activity) ((v5q) this.d).i.a);
        }
        if (b == 2) {
            return new i5a1((bo71) daqVar.eo.get(), (Context) daqVar.x1.a, (q8n) daqVar.E1.get());
        }
        jah.e(b);
        return null;
    }

    private final Object c() {
        daq daqVar = this.b;
        byte b = this.c;
        if (b == 0) {
            return new ts90((v4o0) daqVar.je.get(), (gkb) daqVar.Rb.get(), (c9c0) daqVar.Ed.get(), (p2q) ((qqp) this.e).e);
        }
        if (b == 1) {
            return new et90((v4o0) daqVar.je.get(), new fjb(false), (z5a0) daqVar.co.get(), (Activity) this.d.f.a);
        }
        if (b == 2) {
            return new i5a1((bo71) daqVar.eo.get(), (Context) daqVar.x1.a, (q8n) daqVar.E1.get());
        }
        jah.e(b);
        return null;
    }

    private final Object d() {
        daq daqVar = this.b;
        byte b = this.c;
        if (b == 0) {
            return new ts90((v4o0) daqVar.je.get(), (gkb) daqVar.Rb.get(), (c9c0) daqVar.Ed.get(), (p2q) ((qqp) this.e).e);
        }
        if (b == 1) {
            return new et90((v4o0) daqVar.je.get(), new fjb(false), (z5a0) daqVar.co.get(), (IPLDialogsHostActivity) this.d.b);
        }
        if (b == 2) {
            return new i5a1((bo71) daqVar.eo.get(), (Context) daqVar.x1.a, (q8n) daqVar.E1.get());
        }
        jah.e(b);
        return null;
    }

    private final Object e() {
        v5q v5qVar = (v5q) this.d;
        uw0 uw0Var = (uw0) this.e;
        daq daqVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                return new gkd();
            case 1:
                return f2u0.z((Flowable) ((jly0) uw0Var.h).get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get(), uw0Var.e());
            case 2:
                return k9o0.B((q2p0) uw0Var.d);
            case 3:
                return k9o0.v((q2p0) uw0Var.d);
            case 4:
                return new uwl((n6r0) ((jly0) uw0Var.X).get(), new em0(uw0Var.t(), uw0Var.E(), uw0Var.h(), new asn(uw0Var.t(), new lvc1((Flowable) ((jly0) uw0Var.i).get(), f2u0.D((Flowable) ((jly0) uw0Var.h).get()))), uw0Var.P(), (iac0) ((jly0) uw0Var.t).get()), (gw70) daqVar.d8.get(), (woa) daqVar.W8.get(), (kma) daqVar.Od.get(), (s801) v5qVar.H6.get(), new o7h1((n6r0) ((jly0) uw0Var.X).get(), (i8h1) ((daq) uw0Var.e).A5.get()), ((vhy) ((v5q) uw0Var.f).ua.get()).a(new ruc0(((jly0) uw0Var.X).get(), (byte) 26)), (hwp) v5qVar.va.get(), new d4e0((n6r0) ((jly0) uw0Var.X).get(), (byte) 24), new hod0((n6r0) ((jly0) uw0Var.X).get(), (byte) 28), uw0Var.d().a(), (d4q) v5qVar.Ma.get());
            case 5:
                return ((q2p0) uw0Var.d).i();
            case 6:
                return f2u0.B(f2u0.D((Flowable) ((jly0) uw0Var.h).get()), (Flowable) ((jly0) uw0Var.i).get(), (Flowable) ((jly0) uw0Var.Y).get(), uw0Var.e());
            case 7:
                return f2u0.y((Flowable) ((jly0) uw0Var.h).get(), uw0Var.e());
            case 8:
                return k9o0.z((q2p0) uw0Var.d);
            case 9:
                return k9o0.t((q2p0) uw0Var.d);
            case 10:
                return new owp(this, (byte) 1);
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        byte b = this.a;
        ltl1 ltl1Var = ltl1.b;
        tbc1 tbc1Var = rbc1.a;
        teq teqVar = this.d;
        byte b2 = this.c;
        Object obj = this.e;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                if (b2 == 0) {
                    return new ynw((l841) ((e3q) teqVar).t1.get(), (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.A2.get());
                }
                if (b2 == 1) {
                    return new evl0();
                }
                if (b2 != 2) {
                    jah.e(b2);
                    return null;
                }
                c2r0 c2r0Var = (c2r0) daqVar.hm.get();
                jnw jnwVar = (jnw) ((a680) obj).a;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return c2r0Var.e(jnwVar, yon1.G1("LOGIN_DIALOG_SAMSUNGEFFORTLESSLOGIN", "login/dialog/samsungeffortlesslogin", 952, "login"), (qir0) null);
            case 1:
                s24 s24Var = (s24) obj;
                switch (b2) {
                    case 0:
                        return new sxo(this, (byte) 2);
                    case 1:
                        return k9o0.B((q2p0) s24Var.b);
                    case 2:
                        return f2u0.B(f2u0.D((Flowable) ((jly0) s24Var.e).get()), (Flowable) ((jly0) s24Var.f).get(), (Flowable) ((jly0) s24Var.g).get(), s24Var.u());
                    case 3:
                        return f2u0.z((Flowable) ((jly0) s24Var.e).get(), (Scheduler) daqVar.z1.get(), (yqg) daqVar.J1.get(), s24Var.u());
                    case 4:
                        return f2u0.y((Flowable) ((jly0) s24Var.e).get(), s24Var.u());
                    case 5:
                        PublishProcessor publishProcessorD = ((q2p0) s24Var.b).d();
                        publishProcessorD.getClass();
                        return new FlowableOnBackpressureLatest(publishProcessorD);
                    case 6:
                        return k9o0.z((q2p0) s24Var.b);
                    case 7:
                        return k9o0.t((q2p0) s24Var.b);
                    case 8:
                        return k9o0.v((q2p0) s24Var.b);
                    case 9:
                        return k9o0.r((q2p0) s24Var.b);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 2:
                if (b2 == 0) {
                    return new d3q(this);
                }
                if (b2 == 1) {
                    return ((t8u0) daqVar.d9.get()).a(((zf30) ((dqd0) ((toj0) obj).b)).s1);
                }
                if (b2 == 2) {
                    return new in4((luk) daqVar.L1.get());
                }
                jah.e(b2);
                return null;
            case 3:
                uw0 uw0Var = (uw0) obj;
                switch (b2) {
                    case 0:
                        return new o3q(this, (byte) 0);
                    case 1:
                        o0p0 o0p0Var = (o0p0) uw0Var.d;
                        r2r r2rVar = (r2r) daqVar.v5.get();
                        j3r j3rVar = rzq.y;
                        rzq rzqVarF = l2p1.f(r2rVar.a("android-nowplayingbar-nowplayingbar", ywq.O0));
                        ((zf30) o0p0Var).s1.a(new lt1(rzqVarF, (byte) 4));
                        return rzqVarF;
                    case 2:
                        return ((t8u0) daqVar.d9.get()).a(((zf30) ((o0p0) uw0Var.d)).s1);
                    case 3:
                        uw0Var.getClass();
                        return new gqs(new cm30((dma1) ((daq) uw0Var.e).C5.get()), (yqg) daqVar.J1.get());
                    case 4:
                        return new ui11();
                    case 5:
                        return new h05(false, (luk) daqVar.L1.get());
                    case 6:
                        return new r1p0();
                    case 7:
                        return new tap(this, (byte) 4);
                    case 8:
                        return d8.c((o0p0) uw0Var.d);
                    case 9:
                        return tq21.v((o0p0) uw0Var.d, daqVar.i());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 4:
                wj3 wj3Var = (wj3) obj;
                switch (b2) {
                    case 0:
                        return new o3q(this, (byte) 1);
                    case 1:
                        o0p0 o0p0Var2 = (o0p0) wj3Var.b;
                        r2r r2rVar2 = (r2r) teqVar.O4.get();
                        j3r j3rVar2 = rzq.y;
                        rzq rzqVarF2 = l2p1.f(r2rVar2.a("android-nowplayingbar-nowplayingbar", ywq.O0));
                        ((zf30) o0p0Var2).s1.a(new lt1(rzqVarF2, (byte) 4));
                        return rzqVarF2;
                    case 2:
                        return ((t8u0) daqVar.d9.get()).a(((zf30) ((o0p0) wj3Var.b)).s1);
                    case 3:
                        wj3Var.getClass();
                        return new gqs(new cm30((dma1) ((daq) wj3Var.c).C5.get()), (yqg) daqVar.J1.get());
                    case 4:
                        return new ui11();
                    case 5:
                        return new h05(false, (luk) daqVar.L1.get());
                    case 6:
                        return new r1p0();
                    case 7:
                        return new tap(this, (byte) 5);
                    case 8:
                        return new in4((luk) daqVar.L1.get());
                    case 9:
                        return d8.c((o0p0) wj3Var.b);
                    case 10:
                        return tq21.v((o0p0) wj3Var.b, daqVar.i());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 5:
                teq teqVar2 = teqVar;
                switch (b2) {
                    case 0:
                        return new na91((Flowable) daqVar.D5.get(), teqVar2.b.y1(), teqVar2.b.D1(), (Scheduler) daqVar.z1.get());
                    case 1:
                        return new x9p0(teqVar2.b.F(), daqVar.k2());
                    case 2:
                        return new nhr((gj5) teqVar2.f.a, xqu.a(daqVar.a.I1), daqVar.k2());
                    case 3:
                        return new m7a((z1x) teqVar2.b.Hb.get(), (byte) 1);
                    case 4:
                        return new m7a((l7a) daqVar.Lo.get(), (byte) 0);
                    case 5:
                        Flowable flowable = (Flowable) daqVar.D5.get();
                        yiq yiqVar = teqVar2.b;
                        daq daqVar2 = yiqVar.a;
                        return new qu2(flowable, new u961((ov20) daqVar2.P5.get(), xqu.a(yiqVar.b.n3), xqu.a(daqVar2.q5), (vhs0) daqVar2.a.M1.get()), (c3s) daqVar.e6.get(), (o241) daqVar.u4.get(), new cn4((luk) ((daq) ((em0) obj).b).L1.get()), (huh0) teqVar2.zh.get(), (q8n) daqVar.E1.get());
                    case 6:
                        jo80 jo80Var = teqVar2.f;
                        yiq yiqVar2 = teqVar2.b;
                        return new qu2((gj5) jo80Var.a, xqu.a(daqVar.tq), xqu.a(yiqVar2.v2), xqu.a(yiqVar2.Ib));
                    case 7:
                        return new ta2((lzn0) teqVar2.i.get(), (ov20) daqVar.P5.get(), (q8n) daqVar.V2.get());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 6:
                byp bypVar = (byp) obj;
                if (b2 == 0) {
                    return new esj0(new pv4(false, (luk) ((daq) bypVar.c).L1.get()));
                }
                if (b2 == 1) {
                    return new h5v0();
                }
                if (b2 == 2) {
                    return new j0y();
                }
                if (b2 == 3) {
                    return new sh11((rh11) daqVar.ia.get());
                }
                if (b2 != 4) {
                    jah.e(b2);
                    return null;
                }
                b4p0 b4p0Var = (b4p0) bypVar.b;
                r2r r2rVar3 = (r2r) teqVar.O4.get();
                j3r j3rVar3 = rzq.y;
                rzq rzqVarF3 = l2p1.f(r2rVar3.a("android-nowplayingmini-nowplayingmini", ywq.O0));
                ((zf30) b4p0Var).s1.a(new lt1(rzqVarF3, (byte) 6));
                return rzqVarF3;
            case 7:
                ks6 ks6Var = (ks6) teqVar;
                wj3 wj3Var2 = (wj3) obj;
                switch (b2) {
                    case 0:
                        wj3Var2.getClass();
                        h380 h380VarB = j380.b(104);
                        daq daqVar3 = (daq) wj3Var2.c;
                        hbq hbqVar = daqVar3.a;
                        h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
                        h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
                        h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
                        h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar3.c);
                        h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
                        h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
                        h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
                        h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
                        h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar3.d);
                        h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
                        h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar3.e);
                        h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
                        h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar3.f);
                        h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
                        h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
                        h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
                        h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
                        h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
                        h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar3.g);
                        h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
                        h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
                        h380VarB.e("p.k2l", daqVar3.h);
                        h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar3.i);
                        h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
                        h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
                        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar3.t);
                        h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar3.X);
                        h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar3.Y);
                        h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar3.Z);
                        h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar3.N0);
                        h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar3.O0);
                        h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar3.P0);
                        h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar3.Q0);
                        h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
                        h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
                        h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar3.R0);
                        h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar3.S0);
                        h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
                        h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
                        h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar3.T0);
                        h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
                        h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
                        h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
                        h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
                        h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
                        h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
                        h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar3.U0);
                        h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
                        h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
                        h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar3.V0);
                        h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar3.W0);
                        h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar3.X0);
                        h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
                        h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
                        h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
                        h380VarB.e("p.fso0", daqVar3.Y0);
                        h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
                        h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar3.Z0);
                        h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar3.a1);
                        h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
                        h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
                        h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
                        h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
                        h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
                        h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar3.b1);
                        h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
                        h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
                        h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar3.c1);
                        h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar3.d1);
                        h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
                        h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
                        h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
                        h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar3.e1);
                        h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar3.f1);
                        h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
                        h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
                        h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
                        h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar3.g1);
                        h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar3.h1);
                        h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar3.i1);
                        h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
                        h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar3.j1);
                        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar3.k1);
                        h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar3.l1);
                        h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
                        h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar3.m1);
                        h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar3.n1);
                        h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar3.o1);
                        h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar3.p1);
                        h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
                        h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar3.q1);
                        h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
                        h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar3.r1);
                        h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
                        h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
                        h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar3.s1);
                        h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar3.t1);
                        h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar3.u1);
                        h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
                        h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
                        h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
                        h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
                        h380VarB.e("com.spotify.campaigns.storytelling.container.StorytellingContainerFragment", (p2p) ((ks6) wj3Var2.d).c);
                        h380VarB.e("p.k7c1", (p2q) wj3Var2.e);
                        return new jgu(h380VarB.b(true));
                    case 1:
                        return new s0q(daqVar, ks6Var, wj3Var2, (byte) 6);
                    case 2:
                        f1q f1qVar = (f1q) ((jly0) ks6Var.N0).get();
                        htl1 htl1Var = (htl1) ((jtl1) ((daq) ks6Var.b).Qg.get()).b.a.getValue();
                        c4c1 c4c1VarA = f1qVar.a(u890.j(htl1Var != null ? htl1Var.a : null, ltl1Var) ? tbc1Var : new sbc1());
                        ((f1q) ((jly0) ks6Var.N0).get()).a(tbc1Var);
                        return c4c1VarA;
                    case 3:
                        y4c1 y4c1Var = (y4c1) ((RetrofitMaker) ((daq) ks6Var.b).Y3.get()).createWebgateService(y4c1.class, "android-culturalmoments-stories");
                        String stringExtra = ((CulturalMomentsStoryActivity) ks6Var.a).getIntent().getStringExtra("cultural_moments.story.id");
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        return new w4c1(new hgo(y4c1Var, stringExtra, (j7c1) ((jly0) ks6Var.R0).get(), (g1q) ((jly0) ks6Var.S0).get(), (byte) 0));
                    case 4:
                        return new las0();
                    case 5:
                        return new v6c1();
                    case 6:
                        return new k9c1();
                    case 7:
                        return new fb71();
                    case 8:
                        return new z4c1(new k7b1(1, (w4c1) ((jly0) wj3Var2.h).get(), w4c1.class, "storyState", "storyState(I)Lcom/spotify/campaigns/storytelling/common/StoryState;", 0, (byte) 5));
                    case 9:
                        return ((tz7) daqVar.a.r1.get()).a(((zf30) ((StorytellingContainerFragment) wj3Var2.b)).s1);
                    case 10:
                        return new fgi1();
                    case 11:
                        return new kq41((tp41) daqVar.Dg.get());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 8:
                e93 e93Var = (e93) teqVar;
                wj3 wj3Var3 = (wj3) obj;
                switch (b2) {
                    case 0:
                        wj3Var3.getClass();
                        h380 h380VarB2 = j380.b(104);
                        daq daqVar4 = (daq) wj3Var3.c;
                        hbq hbqVar2 = daqVar4.a;
                        h380VarB2.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar2.b);
                        h380VarB2.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar2.c);
                        h380VarB2.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar2.d);
                        h380VarB2.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar4.c);
                        h380VarB2.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar2.e);
                        h380VarB2.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar2.f);
                        h380VarB2.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar2.g);
                        h380VarB2.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar2.h);
                        h380VarB2.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar4.d);
                        h380VarB2.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar2.i);
                        h380VarB2.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar4.e);
                        h380VarB2.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar2.j);
                        h380VarB2.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar4.f);
                        h380VarB2.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar2.k);
                        h380VarB2.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar2.l);
                        h380VarB2.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar2.m);
                        h380VarB2.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar2.n);
                        h380VarB2.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar2.o);
                        h380VarB2.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar4.g);
                        h380VarB2.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar2.p);
                        h380VarB2.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar2.q);
                        h380VarB2.e("p.k2l", daqVar4.h);
                        h380VarB2.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar4.i);
                        h380VarB2.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar2.r);
                        h380VarB2.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar2.s);
                        h380VarB2.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar4.t);
                        h380VarB2.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar4.X);
                        h380VarB2.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar4.Y);
                        h380VarB2.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar4.Z);
                        h380VarB2.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar4.N0);
                        h380VarB2.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar4.O0);
                        h380VarB2.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar4.P0);
                        h380VarB2.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar4.Q0);
                        h380VarB2.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar2.t);
                        h380VarB2.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar2.u);
                        h380VarB2.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar4.R0);
                        h380VarB2.e("com.spotify.tap.go.service.GoBluetoothService", daqVar4.S0);
                        h380VarB2.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar2.v);
                        h380VarB2.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar2.w);
                        h380VarB2.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar4.T0);
                        h380VarB2.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar2.x);
                        h380VarB2.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar2.y);
                        h380VarB2.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar2.z);
                        h380VarB2.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar2.A);
                        h380VarB2.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar2.B);
                        h380VarB2.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar2.C);
                        h380VarB2.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar4.U0);
                        h380VarB2.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar2.D);
                        h380VarB2.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar2.E);
                        h380VarB2.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar4.V0);
                        h380VarB2.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar4.W0);
                        h380VarB2.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar4.X0);
                        h380VarB2.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar2.F);
                        h380VarB2.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar2.G);
                        h380VarB2.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar2.H);
                        h380VarB2.e("p.fso0", daqVar4.Y0);
                        h380VarB2.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar2.I);
                        h380VarB2.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar4.Z0);
                        h380VarB2.e("com.spotify.collection.downloaded.service.OffliningService", daqVar4.a1);
                        h380VarB2.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar2.J);
                        h380VarB2.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar2.K);
                        h380VarB2.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar2.L);
                        h380VarB2.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar2.M);
                        h380VarB2.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar2.N);
                        h380VarB2.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar4.b1);
                        h380VarB2.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar2.O);
                        h380VarB2.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar2.P);
                        h380VarB2.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar4.c1);
                        h380VarB2.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar4.d1);
                        h380VarB2.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar2.Q);
                        h380VarB2.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar2.R);
                        h380VarB2.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar2.S);
                        h380VarB2.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar4.e1);
                        h380VarB2.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar4.f1);
                        h380VarB2.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar2.T);
                        h380VarB2.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar2.U);
                        h380VarB2.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar2.V);
                        h380VarB2.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar4.g1);
                        h380VarB2.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar4.h1);
                        h380VarB2.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar4.i1);
                        h380VarB2.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar2.W);
                        h380VarB2.e("com.spotify.tap.spoton.SpotOnService", daqVar4.j1);
                        h380VarB2.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar4.k1);
                        h380VarB2.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar4.l1);
                        h380VarB2.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar2.X);
                        h380VarB2.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar4.m1);
                        h380VarB2.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar4.n1);
                        h380VarB2.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar4.o1);
                        h380VarB2.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar4.p1);
                        h380VarB2.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar2.Y);
                        h380VarB2.e("com.spotify.widget.widget.WidgetPickerService", daqVar4.q1);
                        h380VarB2.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar2.Z);
                        h380VarB2.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar4.r1);
                        h380VarB2.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar2.a0);
                        h380VarB2.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar2.b0);
                        h380VarB2.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar4.s1);
                        h380VarB2.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar4.t1);
                        h380VarB2.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar4.u1);
                        h380VarB2.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar2.c0);
                        h380VarB2.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar2.d0);
                        h380VarB2.e("com.spotify.music.SpotifyMainActivity", hbqVar2.e0);
                        h380VarB2.e("com.spotify.tome.pageactivity.PageActivity", hbqVar2.f0);
                        h380VarB2.e("com.spotify.campaigns.storytelling.container.StorytellingContainerFragment", (s2q) ((e93) wj3Var3.d).d);
                        h380VarB2.e("p.k7c1", (p2q) wj3Var3.e);
                        return new jgu(h380VarB2.b(true));
                    case 1:
                        return new s0q(daqVar, e93Var, wj3Var3, (byte) 7);
                    case 2:
                        f1q f1qVar2 = (f1q) ((jly0) e93Var.O0).get();
                        htl1 htl1Var2 = (htl1) ((jtl1) ((daq) e93Var.c).Qg.get()).b.a.getValue();
                        c4c1 c4c1VarA2 = f1qVar2.a(u890.j(htl1Var2 != null ? htl1Var2.a : null, ltl1Var) ? tbc1Var : new sbc1());
                        ((f1q) ((jly0) e93Var.O0).get()).a(tbc1Var);
                        return c4c1VarA2;
                    case 3:
                        daq daqVar5 = (daq) e93Var.c;
                        yqg yqgVar = (yqg) daqVar5.J1.get();
                        FandomCollectiblesStoryActivity fandomCollectiblesStoryActivity = (FandomCollectiblesStoryActivity) e93Var.b;
                        a9c1 a9c1VarT = ila0.t(fandomCollectiblesStoryActivity.getIntent(), "fandom_collectibles.story.mode", a9c1.class);
                        if (a9c1VarT == null) {
                            a9c1VarT = a9c1.a;
                        }
                        x4c1 x4c1Var = (x4c1) ((RetrofitMaker) daqVar5.Y3.get()).createWebgateService(x4c1.class, "android-fandomcollectibles-stories");
                        String stringExtra2 = fandomCollectiblesStoryActivity.getIntent().getStringExtra("fandom_collectibles.story.id");
                        return new w4c1(new gfr(new zsc(yqgVar, a9c1VarT, x4c1Var, stringExtra2 != null ? stringExtra2 : ""), (i7c1) ((jly0) e93Var.S0).get(), (y2q) ((jly0) e93Var.T0).get(), (byte) 5));
                    case 4:
                        return new las0();
                    case 5:
                        return new v6c1();
                    case 6:
                        return new k9c1();
                    case 7:
                        return new fb71();
                    case 8:
                        return new z4c1(new k7b1(1, (w4c1) ((jly0) wj3Var3.h).get(), w4c1.class, "storyState", "storyState(I)Lcom/spotify/campaigns/storytelling/common/StoryState;", 0, (byte) 5));
                    case 9:
                        return ((tz7) daqVar.a.r1.get()).a(((zf30) ((StorytellingContainerFragment) wj3Var3.b)).s1);
                    case 10:
                        return new fgi1();
                    case 11:
                        return new kq41((tp41) daqVar.Dg.get());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 9:
                return a();
            case 10:
                if (b2 == 0) {
                    return new ts90((v4o0) daqVar.je.get(), (gkb) daqVar.Rb.get(), (c9c0) daqVar.Ed.get(), (p2q) ((qqp) obj).e);
                }
                if (b2 == 1) {
                    return new et90((v4o0) daqVar.je.get(), new fjb(false), (z5a0) daqVar.co.get(), (SocialListeningInfoDialogActivity) ((em0) teqVar).b);
                }
                if (b2 == 2) {
                    return new i5a1((bo71) daqVar.eo.get(), (Context) daqVar.x1.a, (q8n) daqVar.E1.get());
                }
                jah.e(b2);
                return null;
            case 11:
                return b();
            case 12:
                return c();
            case 13:
                return d();
            case 14:
                return e();
            default:
                pbq pbqVar = (pbq) obj;
                switch (b2) {
                    case 0:
                        return (qhe0) ((jly0) pbqVar.c).get();
                    case 1:
                        c2r0 c2r0Var2 = (c2r0) daqVar.hm.get();
                        n6r0 n6r0VarP = kmq0.p((brm1) pbqVar.f);
                        blc0 blc0Var = lqm1.a;
                        return c2r0Var2.b(n6r0VarP, lqm1.e.a());
                    case 2:
                        return (qhe0) ((jly0) pbqVar.c).get();
                    case 3:
                        Context context = (Context) teqVar.f.a;
                        gw70 gw70Var = (gw70) daqVar.d8.get();
                        return new xfx(context, gw70Var, new sua((byte) 9));
                    case 4:
                        return new z4m0(lqm1.d.c, lqm1.b);
                    case 5:
                        AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                        return new x4m0(yon1.G1("COLLECTION_YOUREPISODES_SETTINGS_REMOVEPLAYED", "collection/yourepisodes/settings/removeplayed", 373, "collection").c, lqm1.b);
                    case 6:
                        AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                        String str = yon1.G1("COLLECTION_YOUREPISODES_SETTINGS_REMOVEUNPLAYED", "collection/yourepisodes/settings/removeunplayed", 374, "collection").c;
                        String str2 = lqm1.b;
                        r6h1 r6h1Var = r6h1.c;
                        return new y4m0(str, str2);
                    default:
                        jah.e(b2);
                        return null;
                }
        }
    }
}
