package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ydh1 {
    public final lxg a;
    public final idd1 b = new idd1(new dch1(this, (byte) 4));
    public final Set c;
    public final xj61 d;

    public ydh1(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, gbp gbpVar, ynb0 ynb0Var4, ynb0 ynb0Var5, ynb0 ynb0Var6, ynb0 ynb0Var7, ynb0 ynb0Var8, ynb0 ynb0Var9, ynb0 ynb0Var10, ynb0 ynb0Var11, ynb0 ynb0Var12, ynb0 ynb0Var13, ynb0 ynb0Var14, ynb0 ynb0Var15, ynb0 ynb0Var16, ynb0 ynb0Var17, ynb0 ynb0Var18, ynb0 ynb0Var19, ynb0 ynb0Var20, ynb0 ynb0Var21, ynb0 ynb0Var22, ynb0 ynb0Var23, ynb0 ynb0Var24, ynb0 ynb0Var25, ynb0 ynb0Var26, ynb0 ynb0Var27, ynb0 ynb0Var28, ynb0 ynb0Var29, ynb0 ynb0Var30, ynb0 ynb0Var31, ynb0 ynb0Var32, ynb0 ynb0Var33, ynb0 ynb0Var34, ynb0 ynb0Var35, ynb0 ynb0Var36, ynb0 ynb0Var37, ynb0 ynb0Var38, ynb0 ynb0Var39, ynb0 ynb0Var40, ynb0 ynb0Var41, ynb0 ynb0Var42, ynb0 ynb0Var43, ynb0 ynb0Var44, ynb0 ynb0Var45, boolean z, lxg lxgVar, n350 n350Var, ynb0 ynb0Var46, ynb0 ynb0Var47, ynb0 ynb0Var48, gbp gbpVar2, ynb0 ynb0Var49, ynb0 ynb0Var50, ynb0 ynb0Var51, gbp gbpVar3, ynb0 ynb0Var52, ynb0 ynb0Var53, ynb0 ynb0Var54, ynb0 ynb0Var55, ynb0 ynb0Var56, ynb0 ynb0Var57, ynb0 ynb0Var58, ynb0 ynb0Var59, ynb0 ynb0Var60, ynb0 ynb0Var61, ynb0 ynb0Var62, ynb0 ynb0Var63, ynb0 ynb0Var64, ynb0 ynb0Var65, ynb0 ynb0Var66, thq thqVar, ynb0 ynb0Var67) {
        this.a = lxgVar;
        Set setZ0 = dm61.z0(new wdh1("AudiobooksOnboarding", ynb0Var16, true), new vdh1("AgeAssuranceUiPlugin", ynb0Var2, ((Boolean) gbpVar.get()).booleanValue()), new vdh1("AgeAssuranceBlockingPlugin", ynb0Var, true), new vdh1("AgeSignalBlockingPlugin", ynb0Var3, true), new wdh1("LockState", ynb0Var17, true), new wdh1("GraduationLauncher", ynb0Var18, true), new wdh1("AccountSwitcherSnackbar", ynb0Var19, true), new vdh1("SmartControlSuppressionActivityPlugin", ynb0Var20, true), new vdh1("SmartControlTriggerPlugin", ynb0Var21, true), new vdh1("BottomSheetRenderer", ynb0Var22, true), new vdh1("PlaybackTrigger", ynb0Var23, true), new vdh1("VolumeSmartControlPlugin", ynb0Var24, true), new vdh1("AutoAddAccountsPlugin", ynb0Var25, true), new wdh1("RemoteVolumeWidgetPlugin", ynb0Var26, true), new vdh1("AudiobookPlayerListener", ynb0Var4, true), new vdh1("PreviewEndedUpsellUiPlugin", ynb0Var50, true), new vdh1("BackgroundRestrictionChecker", ynb0Var5, true), new wdh1("FreeTierDowngrader", ynb0Var6, true), new wdh1("MarqueeBackgroundState", ynb0Var7, true), new wdh1("NowPlayingMini", ynb0Var8, true), new wdh1("Redirector", ynb0Var9, true), new wdh1("CarDetectionShowNpv", ynb0Var10, true), new wdh1("QuickPlay", ynb0Var13, true), new vdh1("AccessoryOnboarding", ynb0Var14, true), new vdh1("WearAppOnboardingPlugin", ynb0Var43, true), new wdh1("PoSessionCounter", ynb0Var15, true), new wdh1("FreeEmployeeDayMainActivity", ynb0Var27, true), new vdh1("RuntimeConsumption", ynb0Var28, true), new wdh1("TooltipAttacher", ynb0Var29, true), new vdh1("ReinventFreePlayerErrorListener", ynb0Var30, true), new vdh1("OnDemandTrialsAutomaticOptIn", ynb0Var31, true), new vdh1("GoogleAssistantCmpNudgePlugin", ynb0Var32, true), new vdh1("SamsungDeviceDetectedNudgeTriggerPlugin", ynb0Var33, true), new wdh1("LiveSharingControllerActivity", ynb0Var34, n350Var.a()), new wdh1("Monitoring", ynb0Var35, true), new wdh1("SideDrawer", ynb0Var37, true), new wdh1("MessageOrchestrationLogger", ynb0Var38, true), new wdh1("ActivityPageOverlayMessagePresenter", ynb0Var39, true), new vdh1("LastVisitedPageShortcut", ynb0Var40, true), new wdh1("MetricKeeperSessionUi", ynb0Var36, true), new wdh1("WidgetPromoNativeNudge", ynb0Var41, true), new wdh1("ClientMessagingPlatformUi", ynb0Var42, true), new vdh1("WatchFeedAppInBackgroundMonitor", ynb0Var11, true), new vdh1("QuizPlaybackPlugin", ynb0Var12, true), new vdh1("SleepTimerNudge", ynb0Var44, true), new vdh1("KidsModeNudge", ynb0Var45, z), new wdh1("UnboxingHub", ynb0Var46, true), new vdh1("AudiobookProgressNudgePlugin", ynb0Var47, true), new vdh1("GlassesEducationStartupPlugin", ynb0Var67, true), new vdh1("VersionSunsettingUiPlugin", ynb0Var48, ((Boolean) gbpVar2.get()).booleanValue()), new vdh1("PlayerSunsetErrorObserver", ynb0Var49, ((Boolean) gbpVar3.get()).booleanValue()), new vdh1("BetamaxSunsetDeferredUi", ynb0Var51, ((Boolean) gbpVar3.get()).booleanValue()), new vdh1("PlayIntegritySessionPlugin", ynb0Var52, true), new vdh1("NearbyDevicesPermissionAppStartupTrigger", ynb0Var53, true), new vdh1("JamNotificationRemoverPlugin", ynb0Var54, true), new vdh1("RecentSearchesSessionPlugin", ynb0Var55, true), new vdh1("RecommendedSearchesSessionPlugin", ynb0Var56, true), new vdh1("NotificationPermissionPlugin", ynb0Var57, true), new wdh1("NotificationPermissionRequestPlugin", ynb0Var58, true), new vdh1("RecsQualityTriggerPlugin", ynb0Var59, true), new vdh1("UserFeedbackShakeDetectorPlugIn", ynb0Var60, true), new vdh1("ProfileCompletionAppStartupTrigger", ynb0Var61, true), new vdh1("VerificationNotificationPlugin", ynb0Var62, true), new vdh1("PlaybackTimeoutUiPlugin", ynb0Var63, true), new vdh1("ObservationPlatformPlugin", ynb0Var64, true), new vdh1("ScreenshotSharingPlugin", ynb0Var65, true), new vdh1("NotificationsOptInNudgesUiPlugin", ynb0Var66, ((Boolean) thqVar.get()).booleanValue()));
        this.c = setZ0;
        xj61 xj61Var = new xj61();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setZ0) {
            if (obj instanceof vdh1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((vdh1) obj2).c) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((vdh1) it.next()).b);
        }
        xj61Var.addAll(arrayList3);
        this.d = cwl1.j(xj61Var);
    }
}
