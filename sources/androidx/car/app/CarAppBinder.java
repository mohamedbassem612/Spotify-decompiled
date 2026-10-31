package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.util.Log;
import androidx.car.app.serialization.BundlerException;
import com.spotify.base.java.logging.Logger;
import com.spotify.carapplibrary.androidauto.AndroidAutoService;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p.ap41;
import p.cto1;
import p.cwc;
import p.dma1;
import p.e0q;
import p.e6p0;
import p.f4i1;
import p.fn31;
import p.fqn0;
import p.fsn0;
import p.gwn0;
import p.hhg1;
import p.hma1;
import p.hp41;
import p.ia61;
import p.iwc;
import p.jly0;
import p.jwc;
import p.k8c0;
import p.l1d;
import p.lnm;
import p.o7h;
import p.qhd1;
import p.qzn0;
import p.r4p;
import p.sge1;
import p.tac0;
import p.tcc;
import p.tw60;
import p.u890;
import p.u8h1;
import p.ux60;
import p.vvc;
import p.w8c0;
import p.x8c0;
import p.ynb0;
import p.z321;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
final class CarAppBinder extends ICarApp.Stub {
    private volatile int mAuthenticatedUid = -1;
    private volatile ia61 mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private ux60 mHostValidator;
    private volatile j mService;

    public CarAppBinder(j jVar, SessionInfo sessionInfo) {
        this.mService = jVar;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private x8c0 getCurrentLifecycle() {
        ia61 ia61Var = this.mCurrentSession;
        if (ia61Var == null) {
            return null;
        }
        return ia61Var.b;
    }

    private ux60 getHostValidator() {
        ux60 ux60Var = this.mHostValidator;
        if (ux60Var != null) {
            return ux60Var;
        }
        j jVar = this.mService;
        Objects.requireNonNull(jVar);
        Context applicationContext = ((AndroidAutoService) jVar).getApplicationContext();
        HashMap map = new HashMap();
        String[] stringArray = applicationContext.getResources().getStringArray(2130903059);
        if (stringArray == null) {
            hhg1.n("Invalid allowlist res id: 2130903059");
            return null;
        }
        for (String str : stringArray) {
            String[] strArrSplit = str.split(",", -1);
            if (strArrSplit.length != 2) {
                hhg1.n(f4i1.f("Invalid allowed host entry: '", str, "'"));
                return null;
            }
            String str2 = strArrSplit[1];
            Locale locale = Locale.US;
            String strReplace = str2.toLowerCase(locale).replace(" ", "");
            String strReplace2 = strArrSplit[0].toLowerCase(locale).replace(" ", "");
            Objects.requireNonNull(strReplace);
            Objects.requireNonNull(strReplace2);
            List arrayList = (List) map.get(strReplace);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strReplace, arrayList);
            }
            arrayList.add(strReplace2);
        }
        ux60 ux60Var2 = new ux60(applicationContext.getPackageManager(), map, false);
        this.mHostValidator = ux60Var2;
        return ux60Var2;
    }

    private boolean isValidCaller(int i) {
        return this.mAuthenticatedUid != -1 && i == this.mAuthenticatedUid;
    }

    private boolean isValidCallingUid(int i, String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                if (getHostValidator().b(new tw60(str, i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isValidClaimedPackage(String str, String[] strArr) {
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getAppInfo$8(IOnDoneCallback iOnDoneCallback) {
        j jVar = this.mService;
        if (jVar == null) {
            androidx.car.app.utils.f.e(iOnDoneCallback, new IllegalStateException("Service is null"), "getAppInfo");
            return;
        }
        try {
            AppInfo appInfoCreate = jVar.b;
            if (appInfoCreate == null) {
                appInfoCreate = AppInfo.create(jVar);
                jVar.b = appInfoCreate;
            }
            androidx.car.app.utils.f.f(iOnDoneCallback, "getAppInfo", appInfoCreate);
        } catch (RuntimeException e) {
            androidx.car.app.utils.f.e(iOnDoneCallback, e, "getAppInfo");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$getAppTheme$9() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getManager$7(String str, IOnDoneCallback iOnDoneCallback) {
        ia61 ia61Var = this.mCurrentSession;
        Objects.requireNonNull(ia61Var);
        str.getClass();
        if (str.equals("app")) {
            k kVar = ia61Var.c;
            Objects.requireNonNull(kVar);
            androidx.car.app.utils.f.f(iOnDoneCallback, "getManager", ((b) kVar.e(b.class)).b);
        } else {
            if (!str.equals("navigation")) {
                androidx.car.app.utils.f.e(iOnDoneCallback, new InvalidParameterException(str.concat(" is not a valid manager type")), "getManager");
                return;
            }
            k kVar2 = ia61Var.c;
            Objects.requireNonNull(kVar2);
            androidx.car.app.utils.f.f(iOnDoneCallback, "getManager", ((androidx.car.app.navigation.b) kVar2.e(androidx.car.app.navigation.b.class)).a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$onAppCreate$0(ICarHost iCarHost, Configuration configuration, Intent intent) {
        e6p0 e6p0Var;
        j jVar = this.mService;
        Objects.requireNonNull(jVar);
        iwc iwcVar = this.mCurrentSession;
        if (iwcVar == null || iwcVar.b.i == w8c0.a) {
            Objects.requireNonNull(this.mCurrentSessionInfo);
            AndroidAutoService androidAutoService = (AndroidAutoService) jVar;
            Logger.b("[CAL] onCreateSession called", new Object[0]);
            dma1 dma1Var = androidAutoService.f;
            if (dma1Var == null) {
                u890.C("prefs");
                throw null;
            }
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.a(vvc.e, true);
            hma1VarEdit.g();
            e0q e0qVar = androidAutoService.d;
            if (e0qVar == null) {
                u890.C("sessionSubcomponentFactory");
                throw null;
            }
            iwcVar = (iwc) ((jly0) new r4p(e0qVar.a, e0qVar.b).D).get();
            this.mCurrentSession = iwcVar;
        }
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        Objects.requireNonNull(handshakeInfo);
        Objects.requireNonNull(jVar.c);
        k kVar = iwcVar.c;
        kVar.getClass();
        kVar.e = handshakeInfo.getHostCarAppApiLevel();
        kVar.c(jVar, configuration);
        sge1.a();
        l lVar = kVar.b;
        Objects.requireNonNull(iCarHost);
        lVar.getClass();
        sge1.a();
        lVar.c();
        lVar.a = iCarHost;
        tac0 tac0Var = iwcVar.b;
        w8c0 w8c0Var = tac0Var.i;
        k kVar2 = iwcVar.c;
        Objects.requireNonNull(kVar2);
        int size = ((hp41) kVar2.e(hp41.class)).a.size();
        if (w8c0Var.a(w8c0.c) && size >= 1) {
            Log.isLoggable("CarApp", 3);
            onNewIntentInternal(iwcVar, intent);
            return null;
        }
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(tac0Var.i);
        }
        iwcVar.a(k8c0.ON_CREATE);
        k kVar3 = iwcVar.c;
        Objects.requireNonNull(kVar3);
        hp41 hp41Var = (hp41) kVar3.e(hp41.class);
        iwc iwcVar2 = iwcVar;
        Logger.b("[CAL] onCreateScreen " + intent + " root " + ((qhd1) iwcVar2.O0.getValue()) + " with lifecycle: " + ((qhd1) iwcVar2.O0.getValue()).b.i, new Object[0]);
        ynb0 ynb0Var = iwcVar2.f;
        qzn0.g(((qzn0) ynb0Var.get()).c, fsn0.a);
        if (o7h.i0(jwc.a, intent.getAction())) {
            qzn0 qzn0Var = (qzn0) ynb0Var.get();
            qzn0Var.b.e((qhd1) qzn0Var.c().j.getValue());
            qzn0Var.c.g(new gwn0("androidauto/widget", (String) null, (String) null, (u8h1) null, 14));
            qzn0Var.d();
            e6p0Var = (e6p0) qzn0Var.c().a.get();
            fqn0 fqn0Var = fqn0.a;
            e6p0Var.d = "spotify:now-playing-view";
        } else {
            e6p0Var = (qhd1) iwcVar2.O0.getValue();
        }
        hp41Var.e(e6p0Var);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppPause$3() {
        ia61 ia61Var = this.mCurrentSession;
        Objects.requireNonNull(ia61Var);
        ia61Var.a(k8c0.ON_PAUSE);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppResume$2() {
        ia61 ia61Var = this.mCurrentSession;
        Objects.requireNonNull(ia61Var);
        ia61Var.a(k8c0.ON_RESUME);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStart$1() {
        ia61 ia61Var = this.mCurrentSession;
        Objects.requireNonNull(ia61Var);
        ia61Var.a(k8c0.ON_START);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onAppStop$4() {
        ia61 ia61Var = this.mCurrentSession;
        Objects.requireNonNull(ia61Var);
        ia61Var.a(k8c0.ON_STOP);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onConfigurationChanged$6(Configuration configuration) {
        ia61 ia61Var = this.mCurrentSession;
        Objects.requireNonNull(ia61Var);
        onConfigurationChangedInternal(ia61Var, configuration);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onHandshakeCompleted$10(IOnDoneCallback iOnDoneCallback, int i, tcc tccVar) {
        if (onHandshakeAlreadyCompletedException("onHandshakeCompleted", iOnDoneCallback, i)) {
            return;
        }
        j jVar = this.mService;
        if (jVar == null) {
            androidx.car.app.utils.f.e(iOnDoneCallback, new IllegalStateException("Service is null"), "onHandshakeCompleted");
            return;
        }
        try {
            HandshakeInfo handshakeInfo = (HandshakeInfo) tccVar.a();
            if (handshakeInfo == null) {
                throw new IllegalArgumentException("Handshake info is null");
            }
            jVar.c = verifyHandshakeInfo(jVar, i, handshakeInfo);
            this.mHandshakeInfo = handshakeInfo;
            this.mAuthenticatedUid = i;
            androidx.car.app.utils.f.f(iOnDoneCallback, "onHandshakeCompleted", null);
        } catch (BundlerException e) {
            e = e;
            jVar.c = null;
            this.mAuthenticatedUid = -1;
            androidx.car.app.utils.f.e(iOnDoneCallback, e, "onHandshakeCompleted");
        } catch (RuntimeException e2) {
            e = e2;
            jVar.c = null;
            this.mAuthenticatedUid = -1;
            androidx.car.app.utils.f.e(iOnDoneCallback, e, "onHandshakeCompleted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onNewIntent$5(Intent intent) {
        ia61 ia61Var = this.mCurrentSession;
        Objects.requireNonNull(ia61Var);
        onNewIntentInternal(ia61Var, intent);
        return null;
    }

    private void onConfigurationChangedInternal(ia61 ia61Var, Configuration configuration) {
        sge1.a();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(configuration);
        }
        k kVar = ia61Var.c;
        kVar.f(configuration);
        kVar.getResources().getConfiguration();
        k kVar2 = ((iwc) ia61Var).c;
        Objects.requireNonNull(kVar2);
        hp41 hp41Var = (hp41) kVar2.e(hp41.class);
        hp41Var.getClass();
        ap41 ap41Var = (ap41) o7h.r0(new ArrayList(hp41Var.a));
        if (ap41Var != null) {
            ap41Var.c();
        }
    }

    private boolean onHandshakeAlreadyCompletedException(String str, IOnDoneCallback iOnDoneCallback, int i) {
        if (this.mAuthenticatedUid == -1 || i == this.mAuthenticatedUid) {
            return false;
        }
        androidx.car.app.utils.f.e(iOnDoneCallback, new SecurityException("Handshake already completed by another host"), str);
        return true;
    }

    private boolean onHostCallException(String str, IOnDoneCallback iOnDoneCallback, int i) {
        if (this.mService == null) {
            androidx.car.app.utils.f.e(iOnDoneCallback, new IllegalStateException("Service is null"), str);
            return true;
        }
        if (isValidCaller(i)) {
            return false;
        }
        androidx.car.app.utils.f.e(iOnDoneCallback, new SecurityException("Calling UID does not match authenticated UID"), str);
        return true;
    }

    private void onNewIntentInternal(ia61 ia61Var, Intent intent) {
        sge1.a();
        iwc iwcVar = (iwc) ia61Var;
        iwcVar.getClass();
        intent.toString();
        if (o7h.i0(jwc.a, intent.getAction())) {
            fn31.T(cto1.q(iwcVar), null, 0, new cwc(iwcVar, (lnm) null, (byte) 6), 3);
        }
    }

    private tw60 verifyHandshakeInfo(j jVar, int i, HandshakeInfo handshakeInfo) {
        String[] packagesForUid = jVar.getPackageManager().getPackagesForUid(i);
        if (!isValidCallingUid(i, packagesForUid)) {
            throw new SecurityException(f4i1.c(i, "Unrecognized host with uid "));
        }
        String hostPackageName = handshakeInfo.getHostPackageName();
        if (!isValidClaimedPackage(hostPackageName, packagesForUid)) {
            throw new SecurityException("Claimed host package name " + hostPackageName + " does not match calling UID " + i);
        }
        tw60 tw60Var = new tw60(hostPackageName, i);
        if (!getHostValidator().b(tw60Var)) {
            throw new SecurityException("The host is not allowed to call this service");
        }
        AppInfo appInfoCreate = jVar.b;
        if (appInfoCreate == null) {
            appInfoCreate = AppInfo.create(jVar);
            jVar.b = appInfoCreate;
        }
        int minCarAppApiLevel = appInfoCreate.getMinCarAppApiLevel();
        int latestCarAppApiLevel = appInfoCreate.getLatestCarAppApiLevel();
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (minCarAppApiLevel > hostCarAppApiLevel) {
            hhg1.n(l1d.j(hostCarAppApiLevel, minCarAppApiLevel, "Host API level (", ") is less than the app's min API level (", ")"));
            return null;
        }
        if (latestCarAppApiLevel >= hostCarAppApiLevel) {
            return tw60Var;
        }
        hhg1.n(l1d.j(hostCarAppApiLevel, latestCarAppApiLevel, "Host API level (", ") is greater than the app's max API level (", ")"));
        return null;
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        sge1.b(new e(this, iOnDoneCallback, (byte) 0));
    }

    @Override // androidx.car.app.ICarApp
    public void getAppTheme(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.f.c(getCurrentLifecycle(), iOnDoneCallback, "getAppTheme", new d(this, (byte) 1));
    }

    public j getCarAppService() {
        return this.mService;
    }

    public ia61 getCurrentSession() {
        return this.mCurrentSession;
    }

    public SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("getManager", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        sge1.b(new Runnable() { // from class: androidx.car.app.h
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$getManager$7(str, iOnDoneCallback);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        int callingUid = Binder.getCallingUid();
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
        }
        if (onHostCallException("onAppCreate", iOnDoneCallback, callingUid)) {
            return;
        }
        androidx.car.app.utils.f.b(iOnDoneCallback, "onAppCreate", new z321() { // from class: androidx.car.app.f
            @Override // p.z321
            public final Object b() {
                return this.a.lambda$onAppCreate$0(iCarHost, configuration, intent);
            }
        });
        Log.isLoggable("CarApp", 3);
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppPause", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        androidx.car.app.utils.f.c(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new d(this, (byte) 2));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppResume", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        androidx.car.app.utils.f.c(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new d(this, (byte) 0));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppStart", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        androidx.car.app.utils.f.c(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new d(this, (byte) 3));
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppStop", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        androidx.car.app.utils.f.c(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new d(this, (byte) 4));
    }

    public void onAutoDriveEnabled() {
        ia61 ia61Var = this.mCurrentSession;
        if (ia61Var != null) {
            k kVar = ia61Var.c;
            Objects.requireNonNull(kVar);
            ((androidx.car.app.navigation.b) kVar.e(androidx.car.app.navigation.b.class)).getClass();
            sge1.a();
            Log.isLoggable("CarApp.Nav", 3);
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onConfigurationChanged", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        androidx.car.app.utils.f.c(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new c(this, configuration, (byte) 0));
    }

    public void onDestroyLifecycle() {
        ia61 ia61Var = this.mCurrentSession;
        if (ia61Var != null) {
            ia61Var.a(k8c0.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(final tcc tccVar, final IOnDoneCallback iOnDoneCallback) {
        final int callingUid = Binder.getCallingUid();
        sge1.b(new Runnable() { // from class: androidx.car.app.g
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$onHandshakeCompleted$10(iOnDoneCallback, callingUid, tccVar);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onNewIntent", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        androidx.car.app.utils.f.c(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new c(this, intent, (byte) 1));
    }

    public void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (hostCarAppApiLevel < 1 || hostCarAppApiLevel > zod.B()) {
            hhg1.n(f4i1.c(hostCarAppApiLevel, "Invalid Car App API level received: "));
        } else {
            this.mHandshakeInfo = handshakeInfo;
            this.mAuthenticatedUid = Binder.getCallingUid();
        }
    }
}
