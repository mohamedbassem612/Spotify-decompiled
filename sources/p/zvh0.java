package p;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zvh0 extends Service {
    public static final /* synthetic */ int f = 0;
    public final Messenger a = new Messenger((Handler) new kv5(this));
    public final nj7 b = new nj7(this, (byte) 7);
    public final yvh0 c;
    public pvh0 d;
    public final mv2 e;

    static {
        Log.isLoggable("MediaRouteProviderSrv", 3);
    }

    public zvh0() {
        vvh0 mv2Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36 && ibc.a() >= 3600001) {
            mv2Var = new vvh0(this);
            this.e = mv2Var;
        } else if (i >= 30) {
            mv2Var = new uvh0(this);
            this.e = mv2Var;
        } else {
            mv2Var = new mv2(this);
            this.e = mv2Var;
        }
        this.c = mv2Var.o();
    }

    public static Bundle a(jqd0 jqd0Var, int i) {
        if (jqd0Var == null) {
            return null;
        }
        svh0 svh0Var = new svh0(jqd0Var);
        svh0Var.u();
        if (i < 4) {
            svh0Var.v(false);
        }
        for (gvh0 gvh0Var : jqd0Var.v()) {
            if (i >= gvh0Var.i() && i <= gvh0Var.h()) {
                svh0Var.d(gvh0Var);
            }
        }
        return svh0Var.f().i();
    }

    public static void c(Messenger messenger, int i) {
        if (i != 0) {
            d(messenger, 1, i, 0, null, null);
        }
    }

    public static void d(Messenger messenger, int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException unused2) {
            messenger.getBinder().toString();
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        context.getPackageManager();
        this.e.a(context);
    }

    public final void b() {
        if (this.d == null) {
            SpotifyMediaRouteProviderService spotifyMediaRouteProviderService = (SpotifyMediaRouteProviderService) this;
            g3e g3eVar = spotifyMediaRouteProviderService.g;
            pvh0 pvh0VarC = null;
            if (g3eVar == null) {
                u890.C("castIntegrationModeState");
                throw null;
            }
            if (((iuq0) g3eVar).b()) {
                bwh0 bwh0Var = spotifyMediaRouteProviderService.i;
                if (bwh0Var == null) {
                    u890.C("servicePlugins");
                    throw null;
                }
                bwh0Var.a();
                bn bnVar = spotifyMediaRouteProviderService.h;
                if (bnVar == null) {
                    u890.C("mediaRouteProviderFactory");
                    throw null;
                }
                pvh0VarC = bnVar.c();
                spotifyMediaRouteProviderService.t = pvh0VarC;
            }
            if (pvh0VarC != null) {
                String strE = pvh0VarC.b.e();
                if (!strE.equals(getPackageName())) {
                    swg0.h(l1d.t("onCreateMediaRouteProvider() returned a provider whose package name does not match the package name of the service.  A media route provider service can only export its own media route providers.  Provider package name: ", strE, ".  Service package name: "), getPackageName(), ".");
                    return;
                }
                this.d = pvh0VarC;
                owh0.b();
                pvh0VarC.d = this.c;
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.e.u(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        pvh0 pvh0Var = this.d;
        if (pvh0Var != null) {
            owh0.b();
            pvh0Var.d = null;
        }
        this.e.v();
        super.onDestroy();
    }
}
