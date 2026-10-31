package p;

import android.net.Uri;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wnx0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(ui8 ui8Var, nx9 nx9Var, vuk vukVar, mlv0 mlv0Var, wdm wdmVar, pd61 pd61Var, ex01 ex01Var) {
        super(2);
        this.a = (byte) 9;
        this.c = ui8Var;
        this.d = nx9Var;
        this.e = mlv0Var;
        this.b = wdmVar;
        this.f = pd61Var;
    }

    private final Object a(Object obj, Object obj2) {
        kb61 kb61Var = (kb61) obj2;
        ui8 ui8Var = (ui8) this.c;
        nx9 nx9Var = (nx9) this.d;
        mlv0 mlv0Var = (mlv0) this.e;
        wdm wdmVar = (wdm) this.b;
        pd61 pd61Var = (pd61) this.f;
        l3n1 l3n1VarC = nx9Var.c();
        klm klmVar = ((wn41) obj).a;
        go80 go80VarA = klmVar.a("AppleTvDiscoveryStateDaemon", new s2n0(new vcp0(0, pd61Var.Z1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8), new vcp0(0, pd61Var.a2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9), (byte) 28));
        kly0 kly0Var = pd61Var.n1;
        qcp0 qcp0Var = new qcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17);
        ucp0 ucp0Var = new ucp0(pd61Var, (byte) 0);
        qcp0 qcp0Var2 = new qcp0(0, pd61Var.s0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18);
        ucp0 ucp0Var2 = new ucp0(pd61Var, (byte) 1);
        qcp0 qcp0Var3 = new qcp0(0, pd61Var.v, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19);
        qcp0 qcp0Var4 = new qcp0(0, pd61Var.X0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20);
        qcp0 qcp0Var5 = new qcp0(0, pd61Var.u0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21);
        kly0 kly0Var2 = pd61Var.a;
        go80 go80VarA2 = klmVar.a("AdOnAppOpenEligibilityDaemon", new ang(qcp0Var, ucp0Var, qcp0Var2, ucp0Var2, qcp0Var3, qcp0Var4, qcp0Var5, new qcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22), new ucp0(pd61Var, (byte) 2), (byte) 1));
        qcp0 qcp0Var6 = new qcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23);
        kly0 kly0Var3 = pd61Var.I0;
        qcp0 qcp0Var7 = new qcp0(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24);
        qcp0 qcp0Var8 = new qcp0(0, pd61Var.t, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25);
        qcp0 qcp0Var9 = new qcp0(0, pd61Var.y, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26);
        qcp0 qcp0Var10 = new qcp0(0, pd61Var.z, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27);
        qcp0 qcp0Var11 = new qcp0(0, pd61Var.A, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28);
        kly0 kly0Var4 = pd61Var.c1;
        go80 go80VarA3 = klmVar.a("AgeSignalVerificationDaemon", new ang(qcp0Var6, qcp0Var7, qcp0Var8, qcp0Var9, qcp0Var10, qcp0Var11, new qcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 29), new vcp0(0, pd61Var.H, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), new vcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), (byte) 3));
        go80 go80VarA4 = klmVar.a("APLogoutDaemon", new ivn0(new u6j0(mlv0Var, (byte) 13), (byte) 26));
        go80 go80VarA5 = klmVar.a("ForcedLogoutDaemon", new k7h0(new u6j0(ui8Var, (byte) 14), new sap0(ui8Var, (byte) 13), new y52(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10), new zcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8), (byte) 11));
        go80 go80VarA6 = klmVar.a("LogoutEverywhereDaemon", new iyo0(new sap0(ui8Var, (byte) 15), new zcp0(0, pd61Var.q, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23), new zcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24), (byte) 22));
        go80 go80VarA7 = klmVar.a("RemoteLogoutDaemon", new ocp0(new sap0(ui8Var, (byte) 16), new bdp0(mlv0Var, (byte) 0), (byte) 12));
        go80 go80VarA8 = klmVar.a("AnrWatchdogConfigurationCacheDaemon", new iyo0(new vcp0(0, pd61Var.p, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), new zap0(l3n1VarC, (byte) 1), new vcp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3), (byte) 4));
        go80 go80VarA9 = klmVar.a("UserIdMonitoringDaemon", new mcp0(new cdp0(0, pd61Var.v0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), (byte) 22));
        xcp0 xcp0Var = new xcp0(0, pd61Var.n, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6);
        xcp0 xcp0Var2 = new xcp0(0, pd61Var.E, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7);
        xcp0 xcp0Var3 = new xcp0(0, pd61Var.F, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 8);
        xcp0 xcp0Var4 = new xcp0(0, pd61Var.D, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9);
        xcp0 xcp0Var5 = new xcp0(0, pd61Var.G, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10);
        kly0 kly0Var5 = pd61Var.e;
        go80 go80VarA10 = klmVar.a("DataSaverModeObserverDaemon", new dy7(xcp0Var, xcp0Var2, xcp0Var3, xcp0Var4, xcp0Var5, new xcp0(0, kly0Var5, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11), (byte) 17));
        go80 go80VarA11 = klmVar.a("DecipherClientEventsDaemon", new iyo0(new xcp0(0, pd61Var.Q, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12), new ycp0(wdmVar, (byte) 0), new xcp0(0, pd61Var.P, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13), (byte) 12));
        zcp0 zcp0Var = new zcp0(0, pd61Var.I, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9);
        zcp0 zcp0Var2 = new zcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 10);
        zcp0 zcp0Var3 = new zcp0(0, pd61Var.J, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11);
        zcp0 zcp0Var4 = new zcp0(0, pd61Var.d, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12);
        zcp0 zcp0Var5 = new zcp0(0, pd61Var.K, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13);
        kly0 kly0Var6 = pd61Var.d1;
        go80 go80VarA12 = klmVar.a("ForegroundLocationRefreshDaemon", new dy7(zcp0Var, zcp0Var2, zcp0Var3, zcp0Var4, zcp0Var5, new zcp0(0, kly0Var6, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), (byte) 20));
        go80 go80VarA13 = klmVar.a("ExplicitFeedbackSessionDaemon", new nbp0(new zcp0(0, pd61Var.N, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 7), (byte) 10));
        go80 go80VarA14 = klmVar.a("JamCapabilitiesDaemon", new nbp0(new zcp0(0, pd61Var.V0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21), (byte) 15));
        xcp0 xcp0Var6 = new xcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21);
        xcp0 xcp0Var7 = new xcp0(0, pd61Var.H, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22);
        xcp0 xcp0Var8 = new xcp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23);
        kly0 kly0Var7 = pd61Var.w;
        xcp0 xcp0Var9 = new xcp0(0, kly0Var7, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24);
        kly0 kly0Var8 = pd61Var.f;
        go80 go80VarA15 = klmVar.a("DeviceIdentifierLoggerDaemon", new kbp0(xcp0Var6, xcp0Var7, xcp0Var8, xcp0Var9, new xcp0(0, kly0Var8, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), (byte) 1));
        xcp0 xcp0Var10 = new xcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 26);
        kly0 kly0Var9 = pd61Var.A1;
        go80 go80VarA16 = klmVar.a("DeviceMetricsDaemon", new rap0(xcp0Var10, new xcp0(0, kly0Var9, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), (byte) 14));
        go80 go80VarA17 = klmVar.a("GcStatsMetricsDaemon", new nbp0(new zcp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15), (byte) 12));
        go80 go80VarA18 = klmVar.a("OopsRemoteConfigDaemon", new rap0(new adp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0), new adp0(0, kly0Var9, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), (byte) 27));
        go80 go80VarA19 = klmVar.a("PersistentMetricPublisherDaemon", new mcp0(new rbp0(kb61Var, (byte) 22), (byte) 1));
        go80 go80VarA20 = klmVar.a("OopsSessionScopeDaemon", new mcp0(new vap0(nx9Var, (byte) 29), (byte) 0));
        go80 go80VarA21 = klmVar.a("AppFocusStateDaemon", new iyo0(new vcp0(0, pd61Var.m0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4), new vcp0(0, pd61Var.T, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 5), new vcp0(0, kly0Var5, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 6), (byte) 7));
        cdp0 cdp0Var = new cdp0(0, pd61Var.p0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0);
        kly0 kly0Var10 = pd61Var.Y0;
        go80 go80VarA22 = klmVar.a("UbiLoggerDaemon", new k7h0(cdp0Var, new cdp0(0, kly0Var10, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 1), new cdp0(0, pd61Var.k, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 2), new cdp0(0, kly0Var5, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 3), (byte) 27));
        go80 go80VarA23 = klmVar.a("HttpLifecycleListenerAuthenticatedDaemon", new k7h0(new zcp0(0, pd61Var.i1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17), new zcp0(0, pd61Var.z0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18), new zcp0(0, pd61Var.g, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19), new sap0(ui8Var, (byte) 14), (byte) 13));
        go80 go80VarA24 = klmVar.a("ClientMessagingPlatformDaemon", new riv(new ucp0(pd61Var, (byte) 5), new ucp0(pd61Var, (byte) 6), new ucp0(pd61Var, (byte) 7), new ucp0(pd61Var, (byte) 8), new ucp0(pd61Var, (byte) 9), new ucp0(pd61Var, (byte) 10), new ucp0(pd61Var, (byte) 11), new ucp0(pd61Var, (byte) 12), new ucp0(pd61Var, (byte) 13), new ucp0(pd61Var, (byte) 3), new ucp0(pd61Var, (byte) 4)));
        go80 go80VarA25 = klmVar.a("MessagingPlatformDaemon", new nbp0(new zcp0(0, pd61Var.L, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), (byte) 23));
        y52 y52Var = new y52(0, kly0Var3, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12);
        u6j0 u6j0Var = new u6j0(kb61Var, (byte) 15);
        adp0 adp0Var = new adp0(0, kly0Var2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 19);
        kly0 kly0Var11 = pd61Var.i;
        adp0 adp0Var2 = new adp0(0, kly0Var11, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 20);
        kly0 kly0Var12 = pd61Var.O;
        adp0 adp0Var3 = new adp0(0, kly0Var12, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 21);
        adp0 adp0Var4 = new adp0(0, pd61Var.H0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22);
        adp0 adp0Var5 = new adp0(0, pd61Var.n, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 23);
        adp0 adp0Var6 = new adp0(0, pd61Var.T0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 24);
        adp0 adp0Var7 = new adp0(0, pd61Var.k1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25);
        y52 y52Var2 = new y52(0, pd61Var.l1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11);
        adp0 adp0Var8 = new adp0(0, kly0Var8, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11);
        kly0 kly0Var13 = pd61Var.o1;
        adp0 adp0Var9 = new adp0(0, kly0Var13, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12);
        adp0 adp0Var10 = new adp0(0, kly0Var, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 13);
        adp0 adp0Var11 = new adp0(0, kly0Var7, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14);
        adp0 adp0Var12 = new adp0(0, pd61Var.f1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 15);
        adp0 adp0Var13 = new adp0(0, kly0Var10, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 16);
        adp0 adp0Var14 = new adp0(0, kly0Var4, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17);
        kly0 kly0Var14 = pd61Var.G0;
        go80 go80VarA26 = klmVar.a("PuffinDaemon", new pap0(y52Var, u6j0Var, adp0Var, adp0Var2, adp0Var3, adp0Var4, adp0Var5, adp0Var6, adp0Var7, y52Var2, adp0Var8, adp0Var9, adp0Var10, adp0Var11, adp0Var12, adp0Var13, adp0Var14, new adp0(0, kly0Var14, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 18), (byte) 2));
        go80 go80VarA27 = klmVar.a("DefaultAccessoryStateManagerDaemon", new nap0(new xcp0(0, pd61Var.y2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 14), (byte) 25));
        go80 go80VarA28 = klmVar.a("NearbyDevicesPermissionMessageBoxTriggerDaemon", new nbp0(new zcp0(0, pd61Var.q2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), (byte) 26));
        go80 go80VarA29 = klmVar.a("NearbyDevicesPermissionOnboardingTriggerDaemon", new nbp0(new zcp0(0, pd61Var.p2, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28), (byte) 27));
        go80 go80VarA30 = klmVar.a("ConnectAggregatorDiscovererDaemon", new nap0(new vcp0(0, pd61Var.c0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 28), (byte) 14));
        go80 go80VarA31 = klmVar.a("AudioOutputProviderDaemon", new nap0(new vcp0(0, pd61Var.d0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 22), (byte) 2));
        go80 go80VarA32 = klmVar.a("ConnectAggregatorDaemon", new nap0(new vcp0(0, pd61Var.b0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 27), (byte) 13));
        go80 go80VarA33 = klmVar.a("BluetoothDevicesDiscovererDaemon", new nap0(new vcp0(0, pd61Var.e0, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 25), (byte) 9));
        go80 go80VarA34 = klmVar.a("DefaultConnectUIDisablerDaemon", new nap0(new xcp0(0, pd61Var.Y1, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 17), (byte) 28));
        go80 go80VarA35 = klmVar.a("ConnectStateProviderDaemon", new nap0(new xcp0(pd61Var.m, (byte) 1), (byte) 17));
        go80 go80VarA36 = klmVar.a("ConnectTransfererDaemon", new nap0(new xcp0(pd61Var.R, (byte) 2), (byte) 18));
        kly0 kly0Var15 = pd61Var.C;
        go80 go80VarA37 = klmVar.a("IsLocalPlaybackProviderDaemon", new nbp0(new zcp0(kly0Var15, (byte) 20), (byte) 14));
        go80 go80VarA38 = klmVar.a("LocalDeviceProviderDaemon", new nbp0(new zcp0(pd61Var.f0, (byte) 22), (byte) 18));
        go80 go80VarA39 = klmVar.a("DefaultApplicationStateProviderDaemon", new nap0(new xcp0(pd61Var.V1, (byte) 15), (byte) 26));
        go80 go80VarA40 = klmVar.a("DefaultConnectHeadsetPluggedStatusProviderDaemon", new nap0(new xcp0(pd61Var.W1, (byte) 16), (byte) 27));
        go80 go80VarA41 = klmVar.a("DeviceDiscoverySnapshotPluginDaemon", new nbp0(new xcp0(pd61Var.b2, (byte) 20), (byte) 1));
        go80 go80VarA42 = klmVar.a("DefaultDeviceSortingDataManagerDaemon", new nap0(new xcp0(pd61Var.X1, (byte) 18), (byte) 29));
        go80 go80VarA43 = klmVar.a("ArtisanalCastSessionDaemon", new s2n0(new vcp0(pd61Var.z2, (byte) 10), new vcp0(kly0Var6, (byte) 11), (byte) 29));
        go80 go80VarA44 = klmVar.a("StartActiveDiscoveryOnDeviceChangeDaemon", new ocp0(new adp0(pd61Var.A2, (byte) 26), new adp0(kly0Var6, (byte) 27), (byte) 17));
        go80 go80VarA45 = klmVar.a("UmoDeviceSuggestionPluginDaemon", new ocp0(new cdp0(pd61Var.U1, (byte) 4), new cdp0(kly0Var6, (byte) 5), (byte) 21));
        go80 go80VarA46 = klmVar.a("DefaultMessageBoxRequestHandlerDaemon", new nbp0(new xcp0(pd61Var.v2, (byte) 19), (byte) 0));
        go80 go80VarA47 = klmVar.a("OutputSwitcherServicesDisablerPluginDaemon", new rap0(new adp0(pd61Var.d2, (byte) 2), new adp0(kly0Var6, (byte) 3), (byte) 28));
        go80 go80VarA48 = klmVar.a("PassiveRoutesDiscoveryPluginDaemon", new rap0(new adp0(pd61Var.c2, (byte) 4), new adp0(kly0Var6, (byte) 5), (byte) 29));
        go80 go80VarA49 = klmVar.a("CastDaemon", new rap0(new y52(pd61Var.M1, (byte) 9), new vcp0(kly0Var6, (byte) 26), (byte) 7));
        go80 go80VarA50 = klmVar.a("AutomotivePlaybackGrabbingExceptionDaemon", new nap0(new vcp0(pd61Var.Q1, (byte) 24), (byte) 7));
        go80 go80VarA51 = klmVar.a("ProjectedCarPlaybackGrabbingExceptionDaemon", new mcp0(new adp0(pd61Var.R1, (byte) 10), (byte) 6));
        go80 go80VarA52 = klmVar.a("PlaybackGrabbingExceptionDefaultDaemon", new mcp0(new adp0(pd61Var.S1, (byte) 6), (byte) 2));
        go80 go80VarA53 = klmVar.a("VolumeProviderSelectorDaemon", new mcp0(new cdp0(pd61Var.j0, (byte) 16), (byte) 26));
        go80 go80VarA54 = klmVar.a("ConnectVolumeInteractorDaemon", new nap0(new xcp0(pd61Var.g0, (byte) 3), (byte) 19));
        go80 go80VarA55 = klmVar.a("ConnectVolumeSpikeDetectorDaemon", new nap0(new xcp0(pd61Var.w2, (byte) 4), (byte) 20));
        go80 go80VarA56 = klmVar.a("ConnectVolumeUiHandlerDaemon", new nap0(new xcp0(pd61Var.h0, (byte) 5), (byte) 21));
        go80 go80VarA57 = klmVar.a("MobiusAppVolumeStateDaemon", new nbp0(new zcp0(pd61Var.T1, (byte) 26), (byte) 25));
        go80 go80VarA58 = klmVar.a("PlaybackVolumeProviderDaemon", new mcp0(new adp0(pd61Var.i0, (byte) 9), (byte) 4));
        go80 go80VarA59 = klmVar.a("SystemVolumeSpikeDetectorDaemon", new mcp0(new adp0(pd61Var.x2, (byte) 29), (byte) 21));
        go80 go80VarA60 = klmVar.a("VolumeStateDaemon", new mcp0(new cdp0(pd61Var.e2, (byte) 17), (byte) 27));
        go80 go80VarA61 = klmVar.a("AudioRouteForwarderDaemon", new nap0(new vcp0(pd61Var.f2, (byte) 23), (byte) 3));
        go80 go80VarA62 = klmVar.a("ConnectEnvironmentLoggerDaemon", new nap0(new xcp0(pd61Var.g2, (byte) 0), (byte) 16));
        go80 go80VarA63 = klmVar.a("ConnectDiscovererDaemon", new nap0(new vcp0(pd61Var.O1, (byte) 29), (byte) 15));
        go80 go80VarA64 = klmVar.a("OffNetworkDaemon", new nbp0(new zcp0(pd61Var.h2, (byte) 29), (byte) 29));
        go80 go80VarA65 = klmVar.a("DeviceSuggestionProviderDaemon", new nbp0(new zcp0(pd61Var.i2, (byte) 1), (byte) 5));
        go80 go80VarA66 = klmVar.a("DevicePredictabilityBleDeviceAggregatorDaemon", new nbp0(new xcp0(pd61Var.t2, (byte) 28), (byte) 2));
        go80 go80VarA67 = klmVar.a("GoogleDeviceSuggestionsSourceDaemon", new nbp0(new zcp0(pd61Var.j2, (byte) 16), (byte) 13));
        go80 go80VarS = aqo1.s(klmVar, new qcp0(pd61Var.k2));
        go80 go80VarN = g6p1.n(klmVar, new cdp0(pd61Var.l2, (byte) 18));
        go80 go80VarL = i6p1.l(klmVar, new cdp0(pd61Var.u2, (byte) 19));
        go80 go80VarM = pro1.m(klmVar, new vcp0(pd61Var.m2, (byte) 7));
        go80 go80VarG = wwo1.G(klmVar, new xcp0(pd61Var.r2, (byte) 29));
        go80 go80VarO = ywo1.o(klmVar, new zcp0(pd61Var.s2, (byte) 0));
        go80 go80VarV = k4p1.v(klmVar, new adp0(pd61Var.n2, (byte) 28));
        go80 go80VarT = dxo1.t(klmVar, new zcp0(pd61Var.o2, (byte) 2));
        cdp0 cdp0Var2 = new cdp0(kly0Var2, (byte) 27);
        ycp0 ycp0Var = new ycp0(wdmVar, (byte) 4);
        ycp0 ycp0Var2 = new ycp0(wdmVar, (byte) 5);
        ddp0 ddp0Var = new ddp0(wdmVar, (byte) 0);
        cdp0 cdp0Var3 = new cdp0(kly0Var10, (byte) 28);
        cdp0 cdp0Var4 = new cdp0(kly0Var12, (byte) 29);
        kly0 kly0Var16 = pd61Var.d;
        go80 go80VarR = o6p1.r(klmVar, cdp0Var2, ycp0Var, ycp0Var2, ddp0Var, cdp0Var3, cdp0Var4, new edp0(kly0Var16, (byte) 0), new edp0(kly0Var11, (byte) 1), new edp0(kly0Var, (byte) 2), new cdp0(kly0Var8, (byte) 22), new rbp0(kb61Var, (byte) 23), new cdp0(kly0Var3, (byte) 23), new cdp0(kly0Var4, (byte) 24), new ycp0(wdmVar, (byte) 3), new cdp0(pd61Var.v, (byte) 25), new cdp0(pd61Var.F1, (byte) 26));
        go80 go80VarT2 = m6p1.t(klmVar, new cdp0(kly0Var2, (byte) 20), new ycp0(wdmVar, (byte) 1), new ycp0(wdmVar, (byte) 2), new cdp0(kly0Var, (byte) 21));
        y52 y52Var3 = new y52(pd61Var.l0, (byte) 8);
        vcp0 vcp0Var = new vcp0(kly0Var14, (byte) 15);
        vcp0 vcp0Var2 = new vcp0(kly0Var16, (byte) 16);
        vcp0 vcp0Var3 = new vcp0(kly0Var2, (byte) 17);
        vcp0 vcp0Var4 = new vcp0(kly0Var15, (byte) 18);
        rbp0 rbp0Var = new rbp0(kb61Var, (byte) 20);
        vcp0 vcp0Var5 = new vcp0(pd61Var.B, (byte) 19);
        vcp0 vcp0Var6 = new vcp0(kly0Var5, (byte) 20);
        kly0 kly0Var17 = pd61Var.h1;
        return p7h.M(new go80[]{go80VarA, go80VarA2, go80VarA3, go80VarA4, go80VarA5, go80VarA6, go80VarA7, go80VarA8, go80VarA9, go80VarA10, go80VarA11, go80VarA12, go80VarA13, go80VarA14, go80VarA15, go80VarA16, go80VarA17, go80VarA18, go80VarA19, go80VarA20, go80VarA21, go80VarA22, go80VarA23, go80VarA24, go80VarA25, go80VarA26, go80VarA27, go80VarA28, go80VarA29, go80VarA30, go80VarA31, go80VarA32, go80VarA33, go80VarA34, go80VarA35, go80VarA36, go80VarA37, go80VarA38, go80VarA39, go80VarA40, go80VarA41, go80VarA42, go80VarA43, go80VarA44, go80VarA45, go80VarA46, go80VarA47, go80VarA48, go80VarA49, go80VarA50, go80VarA51, go80VarA52, go80VarA53, go80VarA54, go80VarA55, go80VarA56, go80VarA57, go80VarA58, go80VarA59, go80VarA60, go80VarA61, go80VarA62, go80VarA63, go80VarA64, go80VarA65, go80VarA66, go80VarA67, go80VarS, go80VarN, go80VarL, go80VarM, go80VarG, go80VarO, go80VarV, go80VarT, go80VarR, go80VarT2, tro1.r(klmVar, y52Var3, vcp0Var, vcp0Var2, vcp0Var3, vcp0Var4, rbp0Var, vcp0Var5, vcp0Var6, new vcp0(kly0Var17, (byte) 21), new rbp0(kb61Var, (byte) 15), new rbp0(kb61Var, (byte) 16), new rbp0(kb61Var, (byte) 17), new vcp0(kly0Var10, (byte) 12), new rbp0(kb61Var, (byte) 18), new rbp0(kb61Var, (byte) 19), new vcp0(pd61Var.a1, (byte) 13), new vcp0(pd61Var.m1, (byte) 14)), wxo1.t(klmVar, new rbp0(kb61Var, (byte) 21), new zcp0(kly0Var17, (byte) 3), new zcp0(kly0Var8, (byte) 4), new zcp0(kly0Var3, (byte) 5)), z1p1.u(klmVar, new adp0(pd61Var.B2, (byte) 7), new adp0(pd61Var.C2, (byte) 8)), byo1.q(klmVar, new zcp0(pd61Var.U, (byte) 6)), h5p1.z(klmVar, new cdp0(pd61Var.I2, (byte) 7), new cdp0(pd61Var.K2, (byte) 8), new cdp0(pd61Var.J2, (byte) 9), new cdp0(pd61Var.N2, (byte) 10), new cdp0(pd61Var.O2, (byte) 11), new cdp0(kly0Var11, (byte) 12), new cdp0(pd61Var.S0, (byte) 13), new cdp0(kly0Var, (byte) 14), new cdp0(kly0Var13, (byte) 15))});
    }

    private final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        s9p1.A((iie1) this.c, (c380) this.d, (qim0) this.b, (iu30) this.f, (iu30) this.e, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:102:0x0414  */
    /* JADX WARN: Code duplicated, block: B:104:0x041d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0421  */
    /* JADX WARN: Code duplicated, block: B:108:0x047f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0490  */
    /* JADX WARN: Code duplicated, block: B:114:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:116:0x04be  */
    /* JADX WARN: Code duplicated, block: B:117:0x04df  */
    /* JADX WARN: Code duplicated, block: B:119:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:120:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:123:0x0512  */
    /* JADX WARN: Code duplicated, block: B:124:0x051e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0524  */
    /* JADX WARN: Code duplicated, block: B:129:0x0530  */
    /* JADX WARN: Code duplicated, block: B:130:0x0536  */
    /* JADX WARN: Code duplicated, block: B:134:0x0555  */
    /* JADX WARN: Code duplicated, block: B:137:0x057f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0583  */
    /* JADX WARN: Code duplicated, block: B:141:0x05db  */
    /* JADX WARN: Code duplicated, block: B:143:0x0603  */
    /* JADX WARN: Code duplicated, block: B:145:0x0633  */
    /* JADX WARN: Code duplicated, block: B:148:0x0641  */
    /* JADX WARN: Code duplicated, block: B:149:0x066d  */
    /* JADX WARN: Code duplicated, block: B:152:0x071b  */
    /* JADX WARN: Code duplicated, block: B:153:0x071f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0740  */
    /* JADX WARN: Type inference failed for: r5v37, types: [android.os.Parcelable, java.lang.Object, p.zgb1] */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        float f;
        int i;
        float f2;
        qim0 qim0VarJ;
        iu30 iu30Var;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        pbh pbhVar;
        qim0 qim0VarY;
        boolean z;
        float f3;
        qim0 qim0VarA;
        boolean zI;
        Object objT;
        Object objT2;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        int i2 = 2;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                yon1.h((mox0) obj6, (idm) obj7, (hft0) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ijo1.k((p9z0) obj6, (Function0) obj7, (jtl1) obj5, (qim0) obj4, (vu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                g211 g211Var = (g211) obj4;
                f211 f211Var = g211Var.a;
                xhl xhlVar = (xhl) obj7;
                if ((iIntValue & 11) == 2) {
                    x340 x340Var2 = x340Var;
                    if (x340Var2.H()) {
                        x340Var2.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj6).setValue(rih1Var);
                int i3 = ((uhl) xhlVar).b;
                xhlVar.m();
                x340 x340Var3 = x340Var;
                x340Var3.i0(-1221824500);
                xhl xhlVar2 = (xhl) xhlVar.l().b;
                nnb0 nnb0VarK = xhlVar2.k();
                nnb0 nnb0VarK2 = xhlVar2.k();
                onb0 onb0VarH = xhlVar.h(new nnb0[]{nnb0VarK, nnb0VarK2}, ybe.c);
                Object objT3 = x340Var3.T();
                m4c m4cVar = fkj0.X;
                if (objT3 == m4cVar) {
                    objT3 = t011.Y;
                    x340Var3.s0(objT3);
                }
                ((iu30) objT3).invoke(new n5j1(((nnb0) onb0VarH).a, xhlVar.b(onb0VarH)));
                Object objT4 = x340Var3.T();
                if (objT4 == m4cVar) {
                    objT4 = t011.Z;
                    x340Var3.s0(objT4);
                }
                qim0 qim0VarJ2 = xhl.j(nim0Var, nnb0VarK, (iu30) objT4);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                cvx cvxVar2 = cbx.b(x340Var3).b;
                qim0 qim0VarB = uyn1.B(qim0VarJ2, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var3, 0);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarB);
                hzj.A.getClass();
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA2, x340Var3, y580.O0);
                nko1.H(xos0VarM2, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE2, x340Var3, y580.Y);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                cvx cvxVar3 = cbx.b(x340Var3).b;
                uwo1.e(f211Var.c, uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, new a0e1(5), (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var3, 0, 0, 1696);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                cvx cvxVar4 = cbx.b(x340Var3).b;
                uwo1.e(f211Var.b, uyn1.B(qim0VarF2, 0.0f, 4.0f, 0.0f, 0.0f, 13), cbx.d(x340Var3).j, 0L, new a0e1(5), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var3, 0, 0, 1704);
                x340Var3.r(true);
                iu30 iu30Var2 = (iu30) obj3;
                boolean zI2 = x340Var3.i(nnb0VarK);
                Object objT5 = x340Var3.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new pu(nnb0VarK, (byte) 25);
                    x340Var3.s0(objT5);
                }
                qim0 qim0VarJ3 = xhl.j(nim0Var, nnb0VarK2, (iu30) objT5);
                cvx cvxVar5 = cbx.b(x340Var3).b;
                cvx cvxVar6 = cbx.b(x340Var3).b;
                cvx cvxVar7 = cbx.b(x340Var3).b;
                vyo1.l(g211Var, iu30Var2, uyn1.B(qim0VarJ3, 4.0f, 0.0f, 16.0f, 4.0f, 2), x340Var3, 0);
                x340Var3.r(false);
                if (((uhl) xhlVar).b == i3) {
                    return rih1Var;
                }
                qxd0.S((su) obj5, x340Var3);
                return rih1Var;
            case 3:
                g211 g211Var2 = (g211) obj4;
                x340 x340Var4 = (b0k) obj;
                xhl xhlVar3 = (xhl) obj7;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    x340 x340Var5 = x340Var4;
                    if (x340Var5.H()) {
                        x340Var5.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj6).setValue(rih1Var);
                int i4 = ((uhl) xhlVar3).b;
                xhlVar3.m();
                x340 x340Var6 = x340Var4;
                x340Var6.i0(-1318730493);
                xhl xhlVar4 = (xhl) xhlVar3.l().b;
                ihl ihlVarK = xhlVar4.k();
                ihl ihlVarK2 = xhlVar4.k();
                Object objT6 = x340Var6.T();
                m4c m4cVar2 = fkj0.X;
                if (objT6 == m4cVar2) {
                    objT6 = t011.N0;
                    x340Var6.s0(objT6);
                }
                eso1.e(Uri.parse(g211Var2.a.d), isl.a, d7e.r(1.0f, xhl.j(nim0Var, ihlVarK, (iu30) objT6), false), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var6, 24624, 0, 4072);
                iu30 iu30Var3 = (iu30) obj3;
                boolean zI3 = x340Var6.i(ihlVarK);
                Object objT7 = x340Var6.T();
                if (zI3 || objT7 == m4cVar2) {
                    objT7 = new pu(ihlVarK, (byte) 26);
                    x340Var6.s0(objT7);
                }
                vyo1.b(g211Var2, iu30Var3, xhl.j(nim0Var, ihlVarK2, (iu30) objT7), x340Var6, 0);
                x340Var6.r(false);
                if (((uhl) xhlVar3).b == i4) {
                    return rih1Var;
                }
                qxd0.S((su) obj5, x340Var6);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                g0p1.o((String) obj6, (qim0) obj4, (String) obj7, (Function0) obj5, (j2i) obj3, (b0k) obj, czo1.p(196609));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                d7e.i((noq) obj6, (ja31) obj7, (Function0) obj5, (Function0) obj4, (xu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                tm80.m((zv31) obj6, (Function0) obj7, (Function0) obj5, (vu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ((ga51) obj6).e((hux) obj7, (ryn1) obj5, (xt61) obj3, (qim0) obj4, (b0k) obj, czo1.p(521));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                fno1.d((String) obj6, (String) obj7, (c380) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                return a(obj, obj2);
            case 10:
                x340 x340Var7 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                az20 az20Var = (az20) obj5;
                ven0 ven0Var = (ven0) obj4;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    r961 r961Var = ((vt61) obj6).d;
                    tt61 tt61Var = (tt61) ven0Var.getValue();
                    c380 c380Var = tt61Var != null ? tt61Var.a : null;
                    c380 c380Var2 = (c380) ((ven0) obj3).getValue();
                    tt61 tt61Var2 = (tt61) ven0Var.getValue();
                    ib60 ib60Var = tt61Var2 != null ? new ib60(tt61Var2.b, vt61.j) : null;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar8 = cbx.b(x340Var8).b;
                    hdh hdhVarN = lnn1.n((vzq0) obj7, uyn1.h(1, 0.0f, 8.0f));
                    boolean zI4 = x340Var8.i(az20Var);
                    Object objT8 = x340Var8.T();
                    if (zI4 || objT8 == fkj0.X) {
                        objT8 = new st61(az20Var, (byte) 0);
                        x340Var8.s0(objT8);
                    }
                    r961Var.b(c380Var, c380Var2, ib60Var, (qim0) null, hdhVarN, (Function0) objT8, x340Var8, 72);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 11:
                b0k b0kVar = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ((kv61) obj6).c((c380) ((ven0) obj3).getValue(), (qim0) obj4, (String) obj7, (vzq0) obj5, b0kVar2, 0);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((kv61) obj6).c((c380) obj7, (qim0) obj4, (String) obj5, (vzq0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                u0p1.e((a1g) obj6, (dwr0) obj7, (vur0) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                x1p1.c((ug71) obj6, (zg71) obj7, (c380) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                l3p1.f((iu30) obj3, (cr71) obj6, (j2i) obj7, (j2i) obj5, (qim0) obj4, (b0k) obj, czo1.p(3457));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                l3p1.p((er71) obj6, (gw70) obj7, (iu30) obj3, (qim0) obj4, (cr71) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                x340 x340Var9 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                he81 he81Var = (he81) obj7;
                m4c m4cVar3 = fkj0.X;
                od81 od81Var = (od81) obj6;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    idd1 idd1Var = od81Var.f;
                    idd1 idd1Var2 = od81Var.d;
                    idd1 idd1Var3 = od81Var.c;
                    idd1 idd1Var4 = od81Var.e;
                    idd1 idd1Var5 = od81Var.g;
                    idd1 idd1Var6 = od81Var.h;
                    qim0 qim0VarZ = uyn1.z(od81Var.i(x340Var10), 0.0f, 2, nim0Var);
                    boolean zG = x340Var10.g(iu30Var4) | x340Var10.i(he81Var);
                    Object objT9 = x340Var10.T();
                    if (zG || objT9 == m4cVar3) {
                        objT9 = new jd81(iu30Var4, he81Var, (byte) 0);
                        x340Var10.s0(objT9);
                    }
                    qim0 qim0VarW = jzn1.w(qim0VarZ, (iu30) objT9, x340Var10);
                    hob1 hob1Var = (hob1) obj5;
                    boolean zI5 = x340Var10.i(od81Var) | x340Var10.g(iu30Var4);
                    Object objT10 = x340Var10.T();
                    if (zI5 || objT10 == m4cVar3) {
                        objT10 = new et61(od81Var, iu30Var4, (byte) 9);
                        x340Var10.s0(objT10);
                    }
                    iu30 iu30Var5 = (iu30) objT10;
                    kd81 kd81Var = (kd81) obj4;
                    Object objT11 = x340Var10.T();
                    if (objT11 == m4cVar3) {
                        objT11 = oa81.h;
                        x340Var10.s0(objT11);
                    }
                    rpo1.e(hob1Var, 0.0f, iu30Var5, kd81Var, idd1Var, idd1Var2, idd1Var3, idd1Var4, false, qim0VarW, false, idd1Var6, (znb0) null, false, (znb0) null, (znb0) null, false, (znb0) null, idd1Var5, (znb0) null, (yqg) null, (i091) null, false, (vu30) null, (String) null, (iu30) objT11, x340Var10, 100663296, 196608, 33289216);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                rqg0.p((rba1) obj6, (String) obj7, (iu30) obj3, (j2i) obj5, (qim0) obj4, (b0k) obj, czo1.p(3079));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                jo31.b((vnr0) obj6, (vnr0) obj7, (drf1) obj5, (vtq) obj3, (qim0) obj4, (b0k) obj, czo1.p(585));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                men1.f((c0b1) obj6, (rbt) obj7, (Function0) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                qcb1 qcb1Var = (qcb1) obj7;
                b0k b0kVar3 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                gra graVar = een.d;
                g2z g2zVar = (g2z) obj6;
                b0k b0kVar4 = (x340) b0kVar3;
                boolean zY = b0kVar4.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                j06 j06Var = ((x340) b0kVar4).a;
                if (!zY) {
                    b0kVar4.b0();
                    return rih1Var;
                }
                qim0 qim0VarW2 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                uwr uwrVar3 = cbx.a;
                cvx cvxVar9 = cbx.b(b0kVar4).b;
                ((g2z) obj6).r(qcb1Var, (iu30) obj3, (jha1) obj5, (iu30) obj4, uyn1.B(qim0VarW2, 0.0f, 0.0f, 0.0f, 8.0f, 7), b0kVar4, 0);
                Object[] objArr = new Object[0];
                Object objT12 = b0kVar4.T();
                m4c m4cVar4 = fkj0.X;
                if (objT12 == m4cVar4) {
                    objT12 = l4b1.h;
                    b0kVar4.s0(objT12);
                }
                ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT12, b0kVar4, 48);
                rbt rbtVar = (rbt) g2zVar.a;
                fct fctVar = rbtVar.q;
                mr20 mr20Var = (xe01) rbtVar.o.a.e;
                mr20 huzVar = mr20Var != null ? mr20Var : new huz(Boolean.TRUE, (byte) 10);
                Boolean bool = (Boolean) ven0Var2.getValue();
                bool.getClass();
                ven0 ven0VarJ = f4p1.j(huzVar, bool, null, b0kVar4, 0, 14);
                Boolean bool2 = (Boolean) ven0VarJ.getValue();
                bool2.booleanValue();
                boolean zI6 = b0kVar4.i(ven0Var2) | b0kVar4.i(ven0VarJ);
                Object objT13 = b0kVar4.T();
                if (zI6 || objT13 == m4cVar4) {
                    objT13 = new vs3(ven0VarJ, ven0Var2, (lnm) null, (byte) 9);
                    b0kVar4.s0(objT13);
                }
                qxd0.t(bool2, b0kVar4, (vu30) objT13);
                ven0 ven0VarJ2 = f4p1.j(fctVar.b, Boolean.FALSE, null, b0kVar4, 48, 14);
                kiv kivVar = t4k.h;
                wat watVar = (wat) b0kVar4.k(kivVar);
                uvb0 uvb0Var = (crl1) b0kVar4.k(t4k.u);
                boolean zE = b0kVar4.e((int) (uvb0Var.a() & 4294967295L));
                Object objT14 = b0kVar4.T();
                if (zE || objT14 == m4cVar4) {
                    objT14 = ktd.k(watVar.M0((int) (uvb0Var.a() & 4294967295L)) * 0.5f, b0kVar4);
                }
                float f4 = ((p3v) objT14).a;
                boolean z2 = p3v.b(f4, 212.0f) <= 0;
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                boolean z3 = z2;
                if (!((Boolean) ven0VarJ.getValue()).booleanValue() && !((Boolean) ven0VarJ2.getValue()).booleanValue()) {
                    if (z3) {
                        i = 2;
                        f2 = 80.0f;
                        f = 0.0f;
                    } else {
                        qim0VarJ = u291.j(0.0f, f4, 1, qim0VarF3);
                    }
                    iu30Var = (iu30) obj4;
                    mbhVarA = jbh.a(f36Var, een.P0, b0kVar4, 0);
                    iHashCode = Long.hashCode(((x340) b0kVar4).T);
                    xos0VarM = b0kVar4.m();
                    qim0VarE = zr7.E(b0kVar4, qim0VarJ);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, b0kVar4, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, b0kVar4, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, b0kVar4, lljVar3);
                    nko1.F(b0kVar4);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, b0kVar4, lljVar4);
                    cct cctVar = rbtVar.o;
                    b0kVar4.i0(-1690486553);
                    b0kVar4.i0(-747260187);
                    era eraVar = een.Q0;
                    pbhVar = pbh.a;
                    qim0 qim0VarC = pbhVar.c(eraVar, nim0Var);
                    float f5 = cbx.b(b0kVar4).b.f;
                    cvx cvxVar10 = cbx.b(b0kVar4).b;
                    qim0VarY = uyn1.y(qim0VarC, f5, 16.0f);
                    if (((Boolean) ven0VarJ.getValue()).booleanValue()) {
                        b0kVar4.i0(1953367037);
                        z = false;
                        b0kVar4.r(false);
                        f3 = 1.0f;
                        qim0VarA = pbhVar.a(1.0f, qim0VarY, false);
                    } else {
                        if (!((Boolean) ven0VarJ2.getValue()).booleanValue() && z3) {
                            b0kVar4.i0(1953741083);
                            b0kVar4.r(false);
                            qim0VarA = u291.r(qim0VarY, 80.0f);
                            z = false;
                        } else if (((Boolean) ven0VarJ2.getValue()).booleanValue()) {
                            b0kVar4.i0(1953947574);
                            qim0VarA = u291.h(qim0VarY, ((wat) b0kVar4.k(kivVar)).M0(((err0) g2zVar.c).s()));
                            z = false;
                            b0kVar4.r(false);
                        } else {
                            z = false;
                            if (z3) {
                                b0kVar4.i0(1954428849);
                                b0kVar4.r(false);
                                qim0VarA = u291.r(qim0VarY, 80.0f);
                            } else {
                                b0kVar4.i0(1954590762);
                                b0kVar4.r(false);
                                f3 = 1.0f;
                                qim0VarA = pbhVar.a(1.0f, qim0VarY, false);
                            }
                        }
                        f3 = 1.0f;
                    }
                    b0kVar4.r(z);
                    if (((Boolean) ven0VarJ.getValue()).booleanValue()) {
                        qim0VarA = d7e.r(f3, u291.i(qim0VarA, 80.0f, 256.0f), true);
                    } else if (!z3) {
                        if (((Boolean) ven0VarJ2.getValue()).booleanValue()) {
                            qim0VarA = d7e.r(f3, qim0VarA, false);
                        } else {
                            qim0VarA = d7e.r(f3, u291.i(qim0VarA, 80.0f, 256.0f), true);
                        }
                    }
                    zI = b0kVar4.i(ven0VarJ2) | b0kVar4.i(g2zVar) | b0kVar4.g(iu30Var);
                    objT = b0kVar4.T();
                    if (zI || objT == m4cVar4) {
                        objT = new ny51(g2zVar, iu30Var, ven0VarJ2, (byte) 21);
                        b0kVar4.s0(objT);
                    }
                    qim0 qim0VarX = ern1.x(qim0VarA, (iu30) objT);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM3 = b0kVar4.m();
                    qim0 qim0VarE3 = zr7.E(b0kVar4, qim0VarX);
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar4, lljVar);
                    nko1.H(xos0VarM3, b0kVar4, lljVar2);
                    x0d.q(iHashCode3, b0kVar4, lljVar3, b0kVar4);
                    nko1.H(qim0VarE3, b0kVar4, lljVar4);
                    cctVar.c(b0kVar4, 0);
                    qgo1.g(rbtVar.h, h2c.a.a(nim0Var, een.Y), b0kVar4);
                    b0kVar4.r(true);
                    b0kVar4.r(false);
                    pbq pbqVar = rbtVar.n;
                    qim0 qim0VarW3 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                    cvx cvxVar11 = cbx.b(b0kVar4).b;
                    qgo1.g(pbqVar, uyn1.B(qim0VarW3, 0.0f, 0.0f, 0.0f, 8.0f, 7), b0kVar4);
                    if (ihc1.y0(qcb1Var.b)) {
                        b0kVar4.i0(-1686469108);
                        b0kVar4.r(false);
                    } else {
                        b0kVar4.i0(-1686865412);
                        String str = qcb1Var.b;
                        cjc0 cjc0Var = new cjc0(1);
                        lee1 lee1Var = cbx.d(b0kVar4).d;
                        qim0 qim0VarN = anm1.N("standard_header_title", uyn1.w(nim0Var, l6o1.s(b0kVar4)));
                        objT2 = b0kVar4.T();
                        if (objT2 == m4cVar4) {
                            objT2 = v3b1.V0;
                            b0kVar4.s0(objT2);
                        }
                        uwo1.e(str, s161.b(qim0VarN, false, (iu30) objT2), lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar4, 0, 0, 1720);
                        b0kVar4.r(false);
                    }
                    if (qcb1Var.f) {
                        b0kVar4.i0(-1686423786);
                        qim0 qim0VarW4 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                        cvx cvxVar12 = cbx.b(b0kVar4).b;
                        qgo1.g(fctVar, uyn1.B(qim0VarW4, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar4);
                        b0kVar4.r(false);
                    } else {
                        b0kVar4.i0(-1686187380);
                        b0kVar4.r(false);
                    }
                    pbq pbqVar2 = rbtVar.l;
                    qim0 qim0VarW5 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                    cvx cvxVar13 = cbx.b(b0kVar4).b;
                    qgo1.g(pbqVar2, uyn1.B(qim0VarW5, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar4);
                    pbq pbqVar3 = rbtVar.g;
                    qim0 qim0VarW6 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                    cvx cvxVar14 = cbx.b(b0kVar4).b;
                    cvx cvxVar15 = cbx.b(b0kVar4).b;
                    qgo1.g(pbqVar3, uyn1.B(qim0VarW6, 0.0f, 8.0f, 0.0f, 4.0f, 5), b0kVar4);
                    b0kVar4.r(true);
                    pbq pbqVar4 = rbtVar.k;
                    qim0 qim0VarW7 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                    cvx cvxVar16 = cbx.b(b0kVar4).b;
                    qgo1.g(pbqVar4, uyn1.B(qim0VarW7, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar4);
                    pbq pbqVar5 = rbtVar.m;
                    qim0 qim0VarW8 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                    cvx cvxVar17 = cbx.b(b0kVar4).b;
                    cvx cvxVar18 = cbx.b(b0kVar4).b;
                    qgo1.g(pbqVar5, uyn1.B(qim0VarW8, 0.0f, 8.0f, 0.0f, 8.0f, 5), b0kVar4);
                    qim0 qim0VarB2 = u291.b(0.0f, 52.0f, 1, nim0Var);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode4 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM4 = b0kVar4.m();
                    qim0 qim0VarE4 = zr7.E(b0kVar4, qim0VarB2);
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0VarC2, b0kVar4, lljVar);
                    nko1.H(xos0VarM4, b0kVar4, lljVar2);
                    x0d.q(iHashCode4, b0kVar4, lljVar3, b0kVar4);
                    nko1.H(qim0VarE4, b0kVar4, lljVar4);
                    qgo1.g(rbtVar.c, uyn1.w(nim0Var, l6o1.r(b0kVar4)), b0kVar4);
                    b0kVar4.r(true);
                    return rih1Var;
                }
                f = 0.0f;
                i = 2;
                f2 = 80.0f;
                qim0VarJ = u291.j(f2, f, i, qim0VarF3);
                iu30Var = (iu30) obj4;
                mbhVarA = jbh.a(f36Var, een.P0, b0kVar4, 0);
                iHashCode = Long.hashCode(((x340) b0kVar4).T);
                xos0VarM = b0kVar4.m();
                qim0VarE = zr7.E(b0kVar4, qim0VarJ);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(n4kVar);
                } else {
                    b0kVar4.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA, b0kVar4, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, b0kVar4, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, b0kVar4, lljVar7);
                nko1.F(b0kVar4);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, b0kVar4, lljVar8);
                cct cctVar2 = rbtVar.o;
                b0kVar4.i0(-1690486553);
                b0kVar4.i0(-747260187);
                era eraVar2 = een.Q0;
                pbhVar = pbh.a;
                qim0 qim0VarC2 = pbhVar.c(eraVar2, nim0Var);
                float f6 = cbx.b(b0kVar4).b.f;
                cvx cvxVar19 = cbx.b(b0kVar4).b;
                qim0VarY = uyn1.y(qim0VarC2, f6, 16.0f);
                if (((Boolean) ven0VarJ.getValue()).booleanValue()) {
                    b0kVar4.i0(1953367037);
                    z = false;
                    b0kVar4.r(false);
                    f3 = 1.0f;
                    qim0VarA = pbhVar.a(1.0f, qim0VarY, false);
                } else if (!((Boolean) ven0VarJ2.getValue()).booleanValue()) {
                    if (((Boolean) ven0VarJ2.getValue()).booleanValue()) {
                        b0kVar4.i0(1953947574);
                        qim0VarA = u291.h(qim0VarY, ((wat) b0kVar4.k(kivVar)).M0(((err0) g2zVar.c).s()));
                        z = false;
                        b0kVar4.r(false);
                    } else {
                        z = false;
                        if (z3) {
                            b0kVar4.i0(1954428849);
                            b0kVar4.r(false);
                            qim0VarA = u291.r(qim0VarY, 80.0f);
                        } else {
                            b0kVar4.i0(1954590762);
                            b0kVar4.r(false);
                            f3 = 1.0f;
                            qim0VarA = pbhVar.a(1.0f, qim0VarY, false);
                        }
                    }
                    f3 = 1.0f;
                } else {
                    if (((Boolean) ven0VarJ2.getValue()).booleanValue()) {
                        b0kVar4.i0(1953947574);
                        qim0VarA = u291.h(qim0VarY, ((wat) b0kVar4.k(kivVar)).M0(((err0) g2zVar.c).s()));
                        z = false;
                        b0kVar4.r(false);
                    } else {
                        z = false;
                        if (z3) {
                            b0kVar4.i0(1954428849);
                            b0kVar4.r(false);
                            qim0VarA = u291.r(qim0VarY, 80.0f);
                        } else {
                            b0kVar4.i0(1954590762);
                            b0kVar4.r(false);
                            f3 = 1.0f;
                            qim0VarA = pbhVar.a(1.0f, qim0VarY, false);
                        }
                    }
                    f3 = 1.0f;
                }
                b0kVar4.r(z);
                if (((Boolean) ven0VarJ.getValue()).booleanValue()) {
                    qim0VarA = d7e.r(f3, u291.i(qim0VarA, 80.0f, 256.0f), true);
                } else if (!z3) {
                    if (((Boolean) ven0VarJ2.getValue()).booleanValue()) {
                        qim0VarA = d7e.r(f3, qim0VarA, false);
                    } else {
                        qim0VarA = d7e.r(f3, u291.i(qim0VarA, 80.0f, 256.0f), true);
                    }
                }
                zI = b0kVar4.i(ven0VarJ2) | b0kVar4.i(g2zVar) | b0kVar4.g(iu30Var);
                objT = b0kVar4.T();
                if (zI) {
                    objT = new ny51(g2zVar, iu30Var, ven0VarJ2, (byte) 21);
                    b0kVar4.s0(objT);
                } else {
                    objT = new ny51(g2zVar, iu30Var, ven0VarJ2, (byte) 21);
                    b0kVar4.s0(objT);
                }
                qim0 qim0VarX2 = ern1.x(qim0VarA, (iu30) objT);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode5 = Long.hashCode(((x340) b0kVar4).T);
                xos0 xos0VarM5 = b0kVar4.m();
                qim0 qim0VarE5 = zr7.E(b0kVar4, qim0VarX2);
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(n4kVar);
                } else {
                    b0kVar4.v0();
                }
                nko1.H(gfh0VarC3, b0kVar4, lljVar5);
                nko1.H(xos0VarM5, b0kVar4, lljVar6);
                x0d.q(iHashCode5, b0kVar4, lljVar7, b0kVar4);
                nko1.H(qim0VarE5, b0kVar4, lljVar8);
                cctVar2.c(b0kVar4, 0);
                qgo1.g(rbtVar.h, h2c.a.a(nim0Var, een.Y), b0kVar4);
                b0kVar4.r(true);
                b0kVar4.r(false);
                pbq pbqVar6 = rbtVar.n;
                qim0 qim0VarW9 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                cvx cvxVar110 = cbx.b(b0kVar4).b;
                qgo1.g(pbqVar6, uyn1.B(qim0VarW9, 0.0f, 0.0f, 0.0f, 8.0f, 7), b0kVar4);
                if (ihc1.y0(qcb1Var.b)) {
                    b0kVar4.i0(-1686865412);
                    String str2 = qcb1Var.b;
                    cjc0 cjc0Var2 = new cjc0(1);
                    lee1 lee1Var2 = cbx.d(b0kVar4).d;
                    qim0 qim0VarN2 = anm1.N("standard_header_title", uyn1.w(nim0Var, l6o1.s(b0kVar4)));
                    objT2 = b0kVar4.T();
                    if (objT2 == m4cVar4) {
                        objT2 = v3b1.V0;
                        b0kVar4.s0(objT2);
                    }
                    uwo1.e(str2, s161.b(qim0VarN2, false, (iu30) objT2), lee1Var2, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var2, 0, (qx8) null, b0kVar4, 0, 0, 1720);
                    b0kVar4.r(false);
                } else {
                    b0kVar4.i0(-1686469108);
                    b0kVar4.r(false);
                }
                if (qcb1Var.f) {
                    b0kVar4.i0(-1686423786);
                    qim0 qim0VarW10 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                    cvx cvxVar111 = cbx.b(b0kVar4).b;
                    qgo1.g(fctVar, uyn1.B(qim0VarW10, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar4);
                    b0kVar4.r(false);
                } else {
                    b0kVar4.i0(-1686187380);
                    b0kVar4.r(false);
                }
                pbq pbqVar7 = rbtVar.l;
                qim0 qim0VarW11 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                cvx cvxVar112 = cbx.b(b0kVar4).b;
                qgo1.g(pbqVar7, uyn1.B(qim0VarW11, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar4);
                pbq pbqVar8 = rbtVar.g;
                qim0 qim0VarW12 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                cvx cvxVar113 = cbx.b(b0kVar4).b;
                cvx cvxVar114 = cbx.b(b0kVar4).b;
                qgo1.g(pbqVar8, uyn1.B(qim0VarW12, 0.0f, 8.0f, 0.0f, 4.0f, 5), b0kVar4);
                b0kVar4.r(true);
                pbq pbqVar9 = rbtVar.k;
                qim0 qim0VarW13 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                cvx cvxVar115 = cbx.b(b0kVar4).b;
                qgo1.g(pbqVar9, uyn1.B(qim0VarW13, 0.0f, 8.0f, 0.0f, 0.0f, 13), b0kVar4);
                pbq pbqVar10 = rbtVar.m;
                qim0 qim0VarW14 = uyn1.w(nim0Var, l6o1.s(b0kVar4));
                cvx cvxVar116 = cbx.b(b0kVar4).b;
                cvx cvxVar117 = cbx.b(b0kVar4).b;
                qgo1.g(pbqVar10, uyn1.B(qim0VarW14, 0.0f, 8.0f, 0.0f, 8.0f, 5), b0kVar4);
                qim0 qim0VarB3 = u291.b(0.0f, 52.0f, 1, nim0Var);
                gfh0 gfh0VarC4 = t1c.c(graVar, false);
                int iHashCode6 = Long.hashCode(((x340) b0kVar4).T);
                xos0 xos0VarM6 = b0kVar4.m();
                qim0 qim0VarE6 = zr7.E(b0kVar4, qim0VarB3);
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(n4kVar);
                } else {
                    b0kVar4.v0();
                }
                nko1.H(gfh0VarC4, b0kVar4, lljVar5);
                nko1.H(xos0VarM6, b0kVar4, lljVar6);
                x0d.q(iHashCode6, b0kVar4, lljVar7, b0kVar4);
                nko1.H(qim0VarE6, b0kVar4, lljVar8);
                qgo1.g(rbtVar.c, uyn1.w(nim0Var, l6o1.r(b0kVar4)), b0kVar4);
                b0kVar4.r(true);
                return rih1Var;
            case 22:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                ?? r5 = (zgb1) obj6;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    xwa xwaVar = (xwa) obj7;
                    lz9 lz9Var = (lz9) obj4;
                    gfh0 gfh0VarC5 = t1c.c(een.h, false);
                    int iHashCode7 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM7 = x340Var12.m();
                    qim0 qim0VarE7 = zr7.E(x340Var12, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var12, y580.O0);
                    nko1.H(xos0VarM7, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode7), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE7, x340Var12, y580.Y);
                    Object objT15 = x340Var12.T();
                    Object obj8 = fkj0.X;
                    if (objT15 == obj8) {
                        objT15 = g2z.x(lz9Var.b, null, 7);
                        x340Var12.s0(objT15);
                    }
                    ka71 ka71Var = (ka71) objT15;
                    llw0 llw0Var = r5.t;
                    int iC = l1d.C(r5.a);
                    if (iC != 0) {
                        if (iC == 1) {
                            i2 = 1;
                        } else {
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                            i2 = 3;
                        }
                    }
                    otw.c(ka71Var, new z971(llw0Var, i2, 1), u291.d(nim0Var, 1.0f), (ipb1) null, x340Var12, 384, 8);
                    und.a(xwaVar, null, r5.Z ? -6.0f : 0.0f, apo.r(-2112743801, new wh91(r5, (byte) 23), x340Var12), x340Var12, 3072, 2);
                    x340Var12.r(true);
                    wkt wktVar = r5.e;
                    boolean zG2 = x340Var12.g((Object) r5) | x340Var12.g((iu30) obj3) | x340Var12.g((xwa) obj7) | x340Var12.g((xwa) obj5);
                    iu30 iu30Var6 = (iu30) obj3;
                    xwa xwaVar2 = (xwa) obj7;
                    xwa xwaVar3 = (xwa) obj5;
                    Object objT16 = x340Var12.T();
                    if (zG2 || objT16 == obj8) {
                        objT16 = new ae1((Parcelable) r5, iu30Var6, xwaVar2, xwaVar3, (lnm) null, (byte) 21);
                        x340Var12.s0(objT16);
                    }
                    qxd0.t(wktVar, x340Var12, (vu30) objT16);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                f3o1.e((String) obj6, (f371) obj7, (Function0) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    kly0 kly0Var = (kly0) obj3;
                    Object objT17 = x340Var14.T();
                    if (objT17 == fkj0.X) {
                        objT17 = (kah1) kly0Var.get();
                        x340Var14.s0(objT17);
                    }
                    kah1 kah1Var = (kah1) objT17;
                    kah1Var.getClass();
                    otw.c(kah1Var, new jah1((String) obj6, (rxe1) obj7, true, (jtc1) obj5, (ResultReceiver) obj4), (qim0) null, (ipb1) null, x340Var14, 64, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                cto1.j((String) obj6, (ArrayList) obj7, (vi11) obj5, (Function0) obj3, (qim0) obj4, (b0k) obj, czo1.p(513));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                cvd1.h((List) obj6, (vu30) obj7, (qim0) obj4, (zzq0) obj5, (vu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                b2p1.q((c380) obj6, (vu30) obj7, (Function0) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                return d(obj, obj2);
            default:
                ((Number) obj2).intValue();
                x9p1.c((wr21) obj6, (String) obj7, (pxk0) obj5, (Function0) obj4, (vu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wnx0(Object obj, Object obj2, Object obj3, Object obj4, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.f = iu30Var;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wnx0(Object obj, Object obj2, Object obj3, Object obj4, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
        this.f = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wnx0(Object obj, Object obj2, Object obj3, Object obj4, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wnx0(Object obj, Object obj2, qim0 qim0Var, Object obj3, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = qim0Var;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(String str, qim0 qim0Var, String str2, Function0 function0, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 4;
        this.c = str;
        this.b = qim0Var;
        this.d = str2;
        this.e = function0;
        this.f = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wnx0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(g2z g2zVar, qcb1 qcb1Var, iu30 iu30Var, jha1 jha1Var, iu30 iu30Var2) {
        super(2);
        this.a = (byte) 21;
        this.c = g2zVar;
        this.d = qcb1Var;
        this.f = iu30Var;
        this.e = jha1Var;
        this.b = iu30Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(iu30 iu30Var, cr71 cr71Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 15;
        this.f = iu30Var;
        this.c = cr71Var;
        this.d = j2iVar;
        this.e = j2iVar2;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(ven0 ven0Var, xhl xhlVar, int i, su suVar, g211 g211Var, iu30 iu30Var) {
        super(2);
        this.a = (byte) 2;
        this.c = ven0Var;
        this.d = xhlVar;
        this.e = suVar;
        this.b = g211Var;
        this.f = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(kv61 kv61Var, qim0 qim0Var, String str, vzq0 vzq0Var, ven0 ven0Var) {
        super(2);
        this.a = (byte) 11;
        this.c = kv61Var;
        this.b = qim0Var;
        this.d = str;
        this.e = vzq0Var;
        this.f = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(er71 er71Var, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, cr71 cr71Var, int i) {
        super(2);
        this.a = (byte) 16;
        this.c = er71Var;
        this.d = gw70Var;
        this.f = iu30Var;
        this.b = qim0Var;
        this.e = cr71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(rba1 rba1Var, String str, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 18;
        this.c = rba1Var;
        this.d = str;
        this.f = iu30Var;
        this.e = j2iVar;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnx0(iie1 iie1Var, c380 c380Var, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, int i) {
        super(2);
        this.a = (byte) 28;
        this.c = iie1Var;
        this.d = c380Var;
        this.b = qim0Var;
        this.f = iu30Var;
        this.e = iu30Var2;
    }
}
