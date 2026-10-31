package p;

import android.content.Context;
import com.spotify.authentication.login5setupimpl.NativeLogin5SetupImpl;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.ConnectivitySdk;
import com.spotify.connectivity.MobileDeviceInfo;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.core.http.CronetRuntime;
import com.spotify.core.http.NativeHttpConnection;
import com.spotify.cosmos.sharedcosmosrouterapi.SharedCosmosRouterApi;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mcl implements obl, f961 {
    public NativeApplicationScope N0;
    public NativeLogin5SetupImpl O0;
    public by60 P0;
    public final wh41 Q0;
    public final Disposable R0;
    public final Disposable S0;
    public final Disposable T0;
    public NativeCredentialsStorage X;
    public NativeConnectionTypeProvider Y;
    public NativeConnectivityPolicyProvider Z;
    public final AnalyticsDelegate a;
    public final a8n b;
    public final c8n c;
    public final p5n d;
    public final ApplicationScopeConfiguration e;
    public final e4g1 f;
    public final exz0 g;
    public final CronetRuntime h;
    public final i420 i;
    public NativeConnectivityManager t;

    public mcl(AnalyticsDelegate analyticsDelegate, a8n a8nVar, c8n c8nVar, p5n p5nVar, ApplicationScopeConfiguration applicationScopeConfiguration, e4g1 e4g1Var, exz0 exz0Var, v4g1 v4g1Var, MobileDeviceInfo mobileDeviceInfo, SharedCosmosRouterApi sharedCosmosRouterApi, Context context, CronetRuntime cronetRuntime, azp0 azp0Var, Observable observable, Observable observable2, Flowable flowable, i420 i420Var) {
        this.a = analyticsDelegate;
        this.b = a8nVar;
        this.c = c8nVar;
        this.d = p5nVar;
        this.e = applicationScopeConfiguration;
        this.f = e4g1Var;
        this.g = exz0Var;
        this.h = cronetRuntime;
        this.i = i420Var;
        NativeHttpConnection.INSTANCE.initialize(cronetRuntime.wrapFactory(new dh30(azp0Var, v4g1Var, (byte) 21)));
        wma1 wma1VarS = x8p1.s("ConnectivitySdk.setMobileDeviceInfo");
        try {
            ConnectivitySdk.Companion.getClass();
            ConnectivitySdk.setMobileDeviceInfo(mobileDeviceInfo);
            wma1VarS.a((Long) null);
            ((d8n) a8nVar).c.runBlocking(new xwn1(sharedCosmosRouterApi, this, (byte) 13));
            NativeConnectivityManager nativeConnectivityManager = this.t;
            if (nativeConnectivityManager == null) {
                u890.C("nativeConnectivityManager");
                throw null;
            }
            this.Q0 = new wh41(nativeConnectivityManager, context);
            this.R0 = observable.subscribe(new xu((Object) this, (byte) 17));
            this.S0 = observable2.subscribe(new kcl(this, (byte) 0));
            this.T0 = Observable.combineLatest(observable2, new ObservableFromPublisher(flowable).map(vf61.Y).distinctUntilChanged().startWithItem(Boolean.FALSE), pbo1.Q0).distinctUntilChanged().observeOn(c8nVar.a).subscribe(new kcl(this, (byte) 1));
        } catch (Throwable th) {
            wma1VarS.a((Long) null);
            throw th;
        }
    }

    public final NativeApplicationScope a() {
        NativeApplicationScope nativeApplicationScope = this.N0;
        if (nativeApplicationScope != null) {
            return nativeApplicationScope;
        }
        u890.C("nativeConnectivityApplicationScope");
        throw null;
    }

    public final void shutdown() {
        this.Q0.f();
        this.R0.dispose();
        this.S0.dispose();
        this.T0.dispose();
        ((d8n) this.b).c.runBlocking(new s10(this, (byte) 26));
    }

    public final Object getApi() {
        return this;
    }
}
