package p;

import com.spotify.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import com.spotify.prefs.prefsimpl.NativePrefs;
import com.spotify.settings.settings.SettingsDelegate;
import com.spotify.settings.settingsimpl.NativeSettings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class du61 implements Runnable {
    public final /* synthetic */ eu61 a;
    public final /* synthetic */ SharedCosmosRouterApi b;
    public final /* synthetic */ p5n c;
    public final /* synthetic */ obl d;
    public final /* synthetic */ String e;
    public final /* synthetic */ SettingsDelegate f;

    public du61(eu61 eu61Var, SharedCosmosRouterApi sharedCosmosRouterApi, p5n p5nVar, obl oblVar, String str, SettingsDelegate settingsDelegate) {
        this.a = eu61Var;
        this.b = sharedCosmosRouterApi;
        this.c = p5nVar;
        this.d = oblVar;
        this.e = str;
        this.f = settingsDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        umn0 umn0Var = NativeSettings.Companion;
        eu61 eu61Var = this.a;
        NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl = eu61Var.a.a;
        NativeRouter nativeRouter = this.b.getNativeRouter();
        NativePrefs nativePrefs = ((q5n) this.c).a;
        NativeConnectivityManager nativeConnectivityManager = this.d.t;
        if (nativeConnectivityManager == null) {
            u890.C("nativeConnectivityManager");
            throw null;
        }
        umn0Var.getClass();
        NativeSettings nativeSettingsCreate = NativeSettings.create(nativeTimerManagerThreadImpl, nativeRouter, nativePrefs, nativeConnectivityManager, this.e);
        nativeSettingsCreate.setDelegate(this.f);
        eu61Var.b = nativeSettingsCreate;
    }
}
