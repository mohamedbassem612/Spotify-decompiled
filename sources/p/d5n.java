package p;

import com.spotify.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.appstorage.userdirectory.UserDirectoryApi;
import com.spotify.base.java.logging.Logger;
import com.spotify.boombox.audiosink.NativeAudioSinkChainFactory;
import com.spotify.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.core.core.DeviceType;
import com.spotify.core.corefullimpl.FullAuthenticatedScopeConfiguration;
import com.spotify.core.corefullimpl.NativeFullAuthenticatedScopeImpl;
import com.spotify.core.coreimpl.NativeApplicationScopeImpl;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.esperanto.esperanto.Transport;
import com.spotify.fileaccess.fileio.NativeFileIO;
import com.spotify.localfiles.localfilesapi.LocalFilesApi;
import com.spotify.localfiles.localfilesimpl.NativeLocalFilesDelegate;
import com.spotify.native_crypto.NativeCryptoProvider;
import com.spotify.offline.NativeForegroundProvider;
import com.spotify.offline.NativeOfflinePluginRegistry;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin;
import com.spotify.prefs.prefsimpl.NativePrefs;
import com.spotify.remoteconfig.NativeRemoteConfigImpl;
import com.spotify.settings.settingsimpl.NativeSettings;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.schedulers.ExecutorScheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d5n implements b5n, f961 {
    public final l1v0 N0;
    public final e5n O0;
    public final Observable P0;
    public final z48 Q0;
    public final nrt R0;
    public final azp0 S0;
    public final q8n T0;
    public final ajg U0;
    public final i420 V0;
    public final int W0;
    public final LocalFilesApi X;
    public NativeFullAuthenticatedScopeImpl X0;
    public final UserDirectoryApi Y;
    public final FullAuthenticatedScopeConfiguration Z;
    public final a8n a;
    public final c8n b;
    public final SharedCosmosRouterApi c;
    public final p5n d;
    public final qz11 e;
    public final obl f;
    public final b6n g;
    public final ncl h;
    public final ph61 i;
    public final eu61 t;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public d5n(a8n a8nVar, c8n c8nVar, SharedCosmosRouterApi sharedCosmosRouterApi, p5n p5nVar, qz11 qz11Var, obl oblVar, b6n b6nVar, ncl nclVar, ph61 ph61Var, eu61 eu61Var, LocalFilesApi localFilesApi, UserDirectoryApi userDirectoryApi, FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration, l1v0 l1v0Var, e5n e5nVar, Observable observable, z48 z48Var, nrt nrtVar, azp0 azp0Var, q8n q8nVar, ajg ajgVar, i420 i420Var) throws NoWhenBranchMatchedException {
        this.a = a8nVar;
        this.b = c8nVar;
        this.c = sharedCosmosRouterApi;
        this.d = p5nVar;
        this.e = qz11Var;
        this.f = oblVar;
        this.g = b6nVar;
        this.h = nclVar;
        this.i = ph61Var;
        this.t = eu61Var;
        this.X = localFilesApi;
        this.Y = userDirectoryApi;
        this.Z = fullAuthenticatedScopeConfiguration;
        this.N0 = l1v0Var;
        this.O0 = e5nVar;
        this.P0 = observable;
        this.Q0 = z48Var;
        this.R0 = nrtVar;
        this.S0 = azp0Var;
        this.T0 = q8nVar;
        this.U0 = ajgVar;
        this.V0 = i420Var;
        lo9 lo9Var = ((d8n) a8nVar).c;
        int i = lo9Var.isCurrentThread() ? 2 : 1;
        this.W0 = i;
        int iC = l1d.C(i);
        if (iC == 0) {
            lo9Var.runBlocking(new g54(this, (byte) 5));
        } else if (iC == 1) {
            this.X0 = b();
        } else {
            eg.o();
            throw null;
        }
    }

    public final NativeFullAuthenticatedScopeImpl a() {
        NativeFullAuthenticatedScopeImpl nativeFullAuthenticatedScopeImpl = this.X0;
        if (nativeFullAuthenticatedScopeImpl != null) {
            return nativeFullAuthenticatedScopeImpl;
        }
        u890.C("authenticatedScopeImpl");
        throw null;
    }

    public final NativeFullAuthenticatedScopeImpl b() {
        NativeCryptoProvider nativeCryptoProviderA;
        NativeFullAuthenticatedScopeImpl.Companion companion = NativeFullAuthenticatedScopeImpl.INSTANCE;
        NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl = ((d8n) this.a).a;
        NativeRouter nativeRouter = this.c.getNativeRouter();
        NativePrefs nativePrefs = this.d.a;
        NativeRemoteConfigImpl nativeRemoteConfigImpl = this.e.a;
        obl oblVar = this.f;
        NativeConnectivityManager nativeConnectivityManager = ((mcl) oblVar).t;
        if (nativeConnectivityManager == null) {
            u890.C("nativeConnectivityManager");
            throw null;
        }
        NativeApplicationScope nativeApplicationScopeA = ((mcl) oblVar).a();
        NativeSession nativeSessionA = this.i.a();
        NativeAuthenticatedScope nativeAuthenticatedScope = this.h.t;
        if (nativeAuthenticatedScope == null) {
            u890.C("authenticatedScope");
            throw null;
        }
        NativeApplicationScopeImpl nativeApplicationScopeImpl = this.g.g;
        if (nativeApplicationScopeImpl == null) {
            u890.C("nativeCoreApplicationScopeImpl");
            throw null;
        }
        NativeLocalFilesDelegate nativeLocalFilesDelegate = this.X.getNativeLocalFilesDelegate();
        NativeUserDirectoryManager nativeUserDirectoryManager = this.Y.getNativeUserDirectoryManager();
        FullAuthenticatedScopeConfiguration fullAuthenticatedScopeConfiguration = this.Z;
        p1v0 p1v0Var = this.N0;
        p1v0Var.getClass();
        ArrayList arrayList = new ArrayList();
        if (p1v0Var.a.a()) {
            npz npzVarQ = EsOfflinePlugin.PluginMetadata.q();
            npzVarQ.t("reference_offline_plugin");
            npzVarQ.r();
            npzVarQ.u();
            hz00 hz00Var = hz00.b;
            npzVarQ.n();
            npzVarQ.s(true);
            byte[] byteArray = npzVarQ.build().toByteArray();
            Transport w811Var = new w811();
            if (p1v0Var.a.b()) {
                w811Var = new o1v0(p1v0Var, w811Var);
            }
            arrayList.add(new NativeOfflinePluginRegistry.Entry(byteArray, w811Var));
        }
        if (((dr4) p1v0Var.d.a.get()).b()) {
            npz npzVarQ2 = EsOfflinePlugin.PluginMetadata.q();
            npzVarQ2.t("lyrics_offline_plugin");
            npzVarQ2.r();
            npzVarQ2.u();
            hz00 hz00Var2 = hz00.b;
            npzVarQ2.n();
            npzVarQ2.s(true);
            byte[] byteArray2 = npzVarQ2.build().toByteArray();
            Transport qmf0Var = new qmf0(p1v0Var.b, p1v0Var.c, p1v0Var.d, p1v0Var.f);
            if (p1v0Var.a.b()) {
                qmf0Var = new o1v0(p1v0Var, qmf0Var);
            }
            arrayList.add(new NativeOfflinePluginRegistry.Entry(byteArray2, qmf0Var));
        }
        kyl1 kyl1Var = p1v0Var.e;
        Transport transportQ = iqo1.q(kyl1Var.a, kyl1Var.b, kyl1Var.c, kyl1Var.d, kyl1Var.e, kyl1Var.f, p1v0Var.f);
        if (transportQ != null) {
            npz npzVarQ3 = EsOfflinePlugin.PluginMetadata.q();
            npzVarQ3.t("workout_tts_cue_offline_plugin");
            npzVarQ3.r();
            npzVarQ3.u();
            npzVarQ3.s(false);
            npzVarQ3.q();
            byte[] byteArray3 = npzVarQ3.build().toByteArray();
            if (p1v0Var.a.b()) {
                transportQ = new o1v0(p1v0Var, transportQ);
            }
            arrayList.add(new NativeOfflinePluginRegistry.Entry(byteArray3, transportQ));
        }
        NativeOfflinePluginRegistry nativeOfflinePluginRegistry = new NativeOfflinePluginRegistry(arrayList);
        Observable observable = this.P0;
        g960 g960Var = new g960(this, (byte) 1);
        Scheduler scheduler = Schedulers.a;
        NativeForegroundProvider nativeForegroundProvider = new NativeForegroundProvider(observable.observeOn(new ExecutorScheduler(g960Var, false, false)));
        NativeFileIO nativeFileIO = this.V0.a;
        mrt mrtVar = this.R0.a;
        c85 c85Var = new c85(this.S0, this.T0, this.b.a, this.U0);
        c85 c85Var2 = new c85(this.S0, this.T0, this.b.a, this.U0);
        int deviceType = this.Z.getDeviceType();
        if (deviceType == DeviceType.SMARTPHONE.getValue() || deviceType == DeviceType.TABLET.getValue()) {
            NativeCryptoProvider.Companion.getClass();
            nativeCryptoProviderA = amn0.a();
        } else {
            nativeCryptoProviderA = null;
        }
        NativeFullAuthenticatedScopeImpl nativeFullAuthenticatedScopeImplCreate$default = NativeFullAuthenticatedScopeImpl.Companion.create$default(companion, nativeTimerManagerThreadImpl, nativeRouter, nativePrefs, nativeRemoteConfigImpl, nativeConnectivityManager, nativeApplicationScopeA, nativeSessionA, nativeAuthenticatedScope, nativeApplicationScopeImpl, nativeLocalFilesDelegate, nativeUserDirectoryManager, fullAuthenticatedScopeConfiguration, nativeOfflinePluginRegistry, nativeForegroundProvider, nativeFileIO, null, mrtVar, c85Var, c85Var2, nativeCryptoProviderA, 32768, null);
        eu61 eu61Var = this.t;
        ph61 ph61Var = this.i;
        NativeSettings nativeSettings = eu61Var.b;
        if (nativeSettings == null) {
            u890.C("settings");
            throw null;
        }
        nativeSettings.enterAuthenticatedScope(nativeFullAuthenticatedScopeImplCreate$default, ph61Var.a());
        z48 z48Var = this.Q0;
        if (z48Var == null) {
            return nativeFullAuthenticatedScopeImplCreate$default;
        }
        Transport transportAudioSinkChainWrapperEsperantoTransport = nativeFullAuthenticatedScopeImplCreate$default.audioSinkChainWrapperEsperantoTransport();
        NativeAudioSinkChainFactory nativeAudioSinkChainFactoryAudioSinkChainFactory = nativeFullAuthenticatedScopeImplCreate$default.audioSinkChainFactory();
        synchronized (z48Var) {
            z48Var.a = transportAudioSinkChainWrapperEsperantoTransport;
            z48Var.b = nativeAudioSinkChainFactoryAudioSinkChainFactory;
        }
        return nativeFullAuthenticatedScopeImplCreate$default;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void c() throws NoWhenBranchMatchedException {
        int iC = l1d.C(this.W0);
        if (iC == 0) {
            ((d8n) this.a).c.runBlocking(new s10(this, (byte) 29));
        } else if (iC == 1) {
            d();
        } else {
            eg.o();
        }
    }

    public final void d() {
        z48 z48Var = this.Q0;
        if (z48Var != null) {
            synchronized (z48Var) {
                z48Var.a = new yco0();
                z48Var.b = null;
            }
        }
        this.N0.g.dispose();
        NativeSettings nativeSettings = this.t.b;
        if (nativeSettings == null) {
            u890.C("settings");
            throw null;
        }
        nativeSettings.exitAuthenticatedScope();
        NativeFullAuthenticatedScopeImpl nativeFullAuthenticatedScopeImpl = this.X0;
        if (nativeFullAuthenticatedScopeImpl == null) {
            u890.C("authenticatedScopeImpl");
            throw null;
        }
        nativeFullAuthenticatedScopeImpl.prepareForShutdown();
        NativeFullAuthenticatedScopeImpl nativeFullAuthenticatedScopeImpl2 = this.X0;
        if (nativeFullAuthenticatedScopeImpl2 == null) {
            u890.C("authenticatedScopeImpl");
            throw null;
        }
        nativeFullAuthenticatedScopeImpl2.flushCaches();
        NativeFullAuthenticatedScopeImpl nativeFullAuthenticatedScopeImpl3 = this.X0;
        if (nativeFullAuthenticatedScopeImpl3 == null) {
            u890.C("authenticatedScopeImpl");
            throw null;
        }
        nativeFullAuthenticatedScopeImpl3.destroy();
        Logger.b("CoreFullSessionService shutdown completed", new Object[0]);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void shutdown() throws NoWhenBranchMatchedException, InterruptedException {
        Logger.b("CoreFullSessionService shutdown called", new Object[0]);
        if (!this.O0.a()) {
            c();
            return;
        }
        Logger.b("CoreFullSessionService performing shutdown with watchdog...", new Object[0]);
        c5n c5nVar = new c5n(this, (byte) 0);
        mw81 mw81VarT = x8p1.t(31, (String) null, new j3m(this, new c5n(this, (byte) 1)));
        try {
            c5nVar.invoke();
        } finally {
            mw81VarT.interrupt();
            mw81VarT.join();
        }
    }

    public final Object getApi() {
        return this;
    }
}
