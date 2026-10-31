package p;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.MobileDeviceInfo;
import com.spotify.core.http.CronetRuntime;
import com.spotify.core.http.NoOpCronetRuntime;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class j1l implements jly0 {
    public static jo20 A(b8p b8pVar) {
        return new jo20(b8pVar.I, (byte) 21);
    }

    public static zsk1 B(b8p b8pVar) {
        zsk1 zsk1Var = (zsk1) b8pVar.D.get();
        c8o.m(zsk1Var);
        return zsk1Var;
    }

    public static b8p a(k3l k3lVar) {
        return new b8p(k3lVar);
    }

    public static c8p b(ulc ulcVar) {
        c8p c8pVar = new c8p();
        c8pVar.a = xqu.b(new fyo((byte) 9));
        return c8pVar;
    }

    public static h21 c(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 17);
    }

    public static q2l d(g5t g5tVar) {
        q2l q2lVar = new q2l();
        q2lVar.a = g5tVar;
        return q2lVar;
    }

    public static x2l e(g5t g5tVar) {
        x2l x2lVar = new x2l();
        x2lVar.a = g5tVar;
        return x2lVar;
    }

    public static h21 f(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 18);
    }

    public static yb00 g(EventSenderCoreBridge eventSenderCoreBridge) {
        return new yb00(eventSenderCoreBridge);
    }

    public static ApplicationScopeConfiguration h(ajg ajgVar, hlg hlgVar, Context context, jqt jqtVar, com.spotify.core.coreimpl.ApplicationScopeConfiguration applicationScopeConfiguration, g55 g55Var, tz4 tz4Var, hb4 hb4Var) {
        String strZ = upn1.z(upn1.n(context.getApplicationContext()));
        ApplicationScopeConfiguration applicationScopeConfiguration2 = new ApplicationScopeConfiguration();
        applicationScopeConfiguration2.setClientId("9a8d2f0ce77a4e248bb71fefcb557637");
        applicationScopeConfiguration2.setCachePath(applicationScopeConfiguration.getCachePath());
        applicationScopeConfiguration2.setDeviceId(jqtVar.a());
        String str = Build.MODEL;
        applicationScopeConfiguration2.setDeviceHardwareModel(str);
        applicationScopeConfiguration2.setClientRevision(v7n0.b);
        applicationScopeConfiguration2.setClientVersionLong(((zym0) ajgVar).e());
        applicationScopeConfiguration2.setAccesspointLanguage(strZ);
        applicationScopeConfiguration2.setDefaultHTTPUserAgent(String.format("Spotify/%s Android/%s (%s)", Arrays.copyOf(new Object[]{ajgVar.a(), Integer.valueOf(Build.VERSION.SDK_INT), str}, 3)));
        applicationScopeConfiguration2.setEncryptedPersistedClientToken(hlgVar.a.e(hlg.b, (String) null));
        applicationScopeConfiguration2.setEnableClientToken(true);
        applicationScopeConfiguration2.setAppNativeLogin5SetupLifecycle(true);
        applicationScopeConfiguration2.setEnableRequestBucketCollection(g55Var.o());
        applicationScopeConfiguration2.setRequestBucketingInterval(g55Var.l());
        applicationScopeConfiguration2.setEnableTrafficStatsCollection(g55Var.p());
        applicationScopeConfiguration2.setEnableConnectionQualityReport(g55Var.f());
        applicationScopeConfiguration2.setConnectionQualityMaxTimerErrorMs(g55Var.b());
        applicationScopeConfiguration2.setConnectionQualityPoorLatencyThresholdMs(g55Var.d());
        applicationScopeConfiguration2.setConnectionQualityMinP90SampleCount(g55Var.c());
        applicationScopeConfiguration2.setConnectionQualityPoorTimeoutCount(g55Var.e());
        applicationScopeConfiguration2.setConnectionQualityMaxConcurrentLatencyBypass(g55Var.a());
        applicationScopeConfiguration2.setDebounceGoodToPoorThreshold(g55Var.h());
        applicationScopeConfiguration2.setDebouncePoorToGoodThreshold(g55Var.i());
        applicationScopeConfiguration2.setDebounceUnknownToPoorThreshold(g55Var.k());
        applicationScopeConfiguration2.setDebounceUnknownToGoodThreshold(g55Var.j());
        applicationScopeConfiguration2.setSpeedTestUrlVariant(g55Var.n());
        applicationScopeConfiguration2.setSpeedTestSampleRatePercent(g55Var.m());
        applicationScopeConfiguration2.setUseSharedReachability(tz4Var.a());
        applicationScopeConfiguration2.setDisableDecoratorScheduling(hb4Var.e());
        applicationScopeConfiguration2.setDecoratorZeroHop(hb4Var.c());
        applicationScopeConfiguration2.setUseGlobalRoutingDefault(hb4Var.i());
        return applicationScopeConfiguration2;
    }

    public static wnr i(c8p c8pVar) {
        wnr wnrVar = (wnr) c8pVar.a.get();
        c8o.m(wnrVar);
        return wnrVar;
    }

    public static jn7 j(CallbackRouter callbackRouter) {
        return new jn7(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 5)));
    }

    public static dxz0 k(d8p d8pVar) {
        dxz0 dxz0Var = (dxz0) d8pVar.b.get();
        c8o.m(dxz0Var);
        return dxz0Var;
    }

    public static Observable l(d8p d8pVar) {
        Observable observable = (Observable) d8pVar.c.get();
        c8o.m(observable);
        return observable;
    }

    public static rcl m(m980 m980Var) {
        return new rcl(m980Var);
    }

    public static CronetRuntime n(Context context, au71 au71Var, yqg yqgVar, v4g1 v4g1Var) {
        h8o h8oVarP;
        String strE = au71Var.a.e(q270.a, "okhttp");
        String str = strE != null ? strE : "okhttp";
        if (str.equals("cronetH3")) {
            h8oVarP = yto1.p(context, yqgVar, true, new ubl(v4g1Var, (byte) 0));
        } else {
            h8oVarP = str.equals("cronet") ? yto1.p(context, yqgVar, false, new ubl(v4g1Var, (byte) 1)) : NoOpCronetRuntime.INSTANCE;
        }
        c8o.m(h8oVarP);
        return h8oVarP;
    }

    public static MobileDeviceInfo o(ajg ajgVar, Context context, j0u j0uVar) {
        MobileDeviceInfo mobileDeviceInfo = new MobileDeviceInfo();
        mobileDeviceInfo.setOsVersion(Build.VERSION.RELEASE);
        mobileDeviceInfo.setApiLevel(Build.VERSION.SDK_INT);
        mobileDeviceInfo.setName(upf.e(context));
        zym0 zym0Var = (zym0) ajgVar;
        String strC = zym0Var.c();
        if (strC == null) {
            strC = "";
        }
        mobileDeviceInfo.setInstallerName(strC);
        mobileDeviceInfo.setModel(Build.MODEL);
        mobileDeviceInfo.setBrand(Build.BRAND);
        mobileDeviceInfo.setManufacturer(Build.MANUFACTURER);
        mobileDeviceInfo.setDeviceType(j0uVar.a.ordinal());
        mobileDeviceInfo.setVolumeSteps(32);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            mobileDeviceInfo.setScreenWidth(displayMetrics.widthPixels);
            mobileDeviceInfo.setScreenHeight(displayMetrics.heightPixels);
            mobileDeviceInfo.setSmallestScreenWidthDp(context.getResources().getConfiguration().smallestScreenWidthDp);
            mobileDeviceInfo.setScreenDensityCurrent(displayMetrics.densityDpi);
        } else {
            mobileDeviceInfo.setScreenWidth(0);
            mobileDeviceInfo.setScreenHeight(0);
            mobileDeviceInfo.setSmallestScreenWidthDp(0);
            mobileDeviceInfo.setScreenDensityCurrent(0);
        }
        mobileDeviceInfo.setScreenDensityStable(DisplayMetrics.DENSITY_DEVICE_STABLE);
        mobileDeviceInfo.setCachePath(zym0Var.a + "/" + ((String) zym0Var.e.getValue()) + "/" + UUID.randomUUID());
        mobileDeviceInfo.setDesktopFormFactor(Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.desktop.gms")));
        return mobileDeviceInfo;
    }

    public static m980 p(boolean z) {
        return new m980((byte) 6, z);
    }

    public static w1n0 q(g5t g5tVar, ynb0 ynb0Var, ynb0 ynb0Var2, q8n q8nVar) {
        return new w1n0(g5tVar, ynb0Var, ynb0Var2, q8nVar);
    }

    public static php0 r(o1s0 o1s0Var) {
        return new php0(rqt0.u(new m9r0(yoi1.g(o1s0Var.a.j()), o1s0Var, (byte) 4)), (byte) 15);
    }

    public static r3b1 s(Context context, rcl rclVar, Scheduler scheduler) {
        return new r3b1(context, rclVar, scheduler);
    }

    public static tl61 t(b8p b8pVar) {
        return new tl61((g3e) b8pVar.O.get(), (d6b1) b8pVar.a.S.get(), xqu.a(b8pVar.Z));
    }

    public static jo20 u(b8p b8pVar) {
        return new jo20(b8pVar.I, (byte) 18);
    }

    public static jo20 v(b8p b8pVar) {
        return new jo20(b8pVar.I, (byte) 20);
    }

    public static boa1 w(b8p b8pVar) {
        return (boa1) b8pVar.h1.get();
    }

    public static vhb1 x(b8p b8pVar) {
        vhb1 vhb1Var = (vhb1) b8pVar.g1.get();
        c8o.m(vhb1Var);
        return vhb1Var;
    }

    public static vtk1 y(b8p b8pVar) {
        x6m0 x6m0Var = (x6m0) b8pVar.F.get();
        wtk1 wtk1Var = (wtk1) b8pVar.L0.get();
        return new vtk1("SystemVolumeSpikeDetector", wtk1Var.a, wtk1Var.b, wtk1Var.c, wtk1Var.d, x6m0Var.e.doOnNext(p.V0));
    }

    public static ftk1 z(b8p b8pVar) {
        return (ftk1) b8pVar.P.get();
    }
}
