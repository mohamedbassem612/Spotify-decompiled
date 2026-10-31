package p;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class d1i0 extends yac0 {
    public static final /* synthetic */ int i = 0;
    public c1i0 d;
    public yqh0 e;
    public twa f;
    public boolean h;
    public final Object b = new Object();
    public final Handler c = new Handler(Looper.getMainLooper());
    public final y36 g = new y36(0);

    public static ixh0 j(Intent intent) {
        ComponentName component = intent.getComponent();
        String packageName = component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService";
        Bundle bundleG = cy30.g("androidx.media3.session.hint.controller_info_type", "android.intent.action.MEDIA_BUTTON");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            bundleG.putBundle("androidx.media3.session.hint.intent_extras", extras);
        }
        Uri data = intent.getData();
        if (data != null) {
            bundleG.putString("androidx.media3.session.hint.session_id", fzh0.i(data));
        }
        return new ixh0(new MediaSessionManager.RemoteUserInfo(packageName, -1, -1), 1011000300, 10, false, (hxh0) null, bundleG);
    }

    public final void i(kph0 kph0Var) {
        kph0 kph0Var2;
        boolean z = true;
        dm5.n(!kph0Var.g(), "session is already released");
        synchronized (this.b) {
            kph0Var2 = (kph0) this.g.get(kph0Var.b());
            if (kph0Var2 != null && kph0Var2 != kph0Var) {
                z = false;
            }
            dm5.n(z, "Session ID should be unique");
            this.g.put(kph0Var.b(), kph0Var);
        }
        if (kph0Var2 == null) {
            zoi1.c0(this.c, new a1i0(this, kph0Var, (byte) 0));
        }
    }

    public final yqh0 k() {
        yqh0 yqh0Var = this.e;
        if (yqh0Var != null) {
            return yqh0Var;
        }
        dm5.s(getBaseContext(), "Accessing service context before onCreate()");
        k7s k7sVarL = new fp7(getApplicationContext()).l();
        twa twaVar = this.f;
        if (twaVar == null) {
            twaVar = new twa(this);
            this.f = twaVar;
        }
        yqh0 yqh0Var2 = new yqh0(this, k7sVarL, twaVar);
        this.e = yqh0Var2;
        return yqh0Var2;
    }

    public final ArrayList l() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.g.values());
        }
        return arrayList;
    }

    public final void m(Throwable th) {
        if (Build.VERSION.SDK_INT < 31 || !(th instanceof ForegroundServiceStartNotAllowedException)) {
            return;
        }
        this.c.post(new gv40(this, (byte) 20));
    }

    public abstract kph0 n(ixh0 ixh0Var);

    public final v5 o(boolean z) {
        k().g(z);
        return w5.y(ia.y(f280.b, new cwa((byte) 15), x74.N(this)), new z0i0(this, (byte) 0), x74.N(this));
    }

    @Override // p.yac0, android.app.Service
    public IBinder onBind(Intent intent) {
        String action;
        kph0 kph0VarN;
        String str = zoi1.a;
        super.onBind(intent);
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            c1i0 c1i0Var = this.d;
            c1i0Var.getClass();
            return c1i0Var;
        }
        if (!action.equals("android.media.browse.MediaBrowserService") || (kph0VarN = n(ixh0.a())) == null) {
            return null;
        }
        i(kph0VarN);
        return kph0VarN.d();
    }

    @Override // p.yac0, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.d = new c1i0(this);
    }

    @Override // p.yac0, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        yqh0 yqh0Var = this.e;
        if (yqh0Var != null) {
            yqh0Var.b();
        }
        c1i0 c1i0Var = this.d;
        if (c1i0Var != null) {
            c1i0Var.b1();
            this.d = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5  */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        String strN;
        boolean zEquals;
        super.onStartCommand(intent, i2, i3);
        if (intent != null) {
            if (this.f == null) {
                this.f = new twa(this);
            }
            Uri data = intent.getData();
            if (twa.r(intent) || twa.q(intent)) {
                kph0 kph0VarN = null;
                if (data != null) {
                    synchronized (this.b) {
                        try {
                            t980 it = ((v36) this.g.values()).iterator();
                            while (true) {
                                t980 t980Var = it;
                                if (!t980Var.hasNext()) {
                                    break;
                                }
                                kph0 kph0Var = (kph0) t980Var.next();
                                if (Objects.equals(kph0Var.c().k(), data)) {
                                    kph0VarN = kph0Var;
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (kph0VarN != null) {
                    if (twa.r(intent)) {
                        iqh0 iqh0VarC = kph0VarN.c();
                        iqh0VarC.e().post(new zyh0(iqh0VarC, intent, (byte) 5));
                    } else {
                        strN = twa.n(intent);
                        if (strN == null) {
                            k().f(kph0VarN, strN, twa.o(intent));
                        } else if (!this.h) {
                            r();
                            return 1;
                        }
                    }
                    if (!this.h && intent.hasExtra("androidx.media3.session.intent.uid")) {
                        zEquals = Objects.equals(k().d(), intent.getStringExtra("androidx.media3.session.intent.uid"));
                        this.h = zEquals;
                        if (!zEquals) {
                            oon1.H("Terminating service that was started by a stale start intent");
                            r();
                        }
                    }
                } else {
                    kph0VarN = n(j(intent));
                    if (kph0VarN != null) {
                        i(kph0VarN);
                        if (twa.r(intent)) {
                            iqh0 iqh0VarC2 = kph0VarN.c();
                            iqh0VarC2.e().post(new zyh0(iqh0VarC2, intent, (byte) 5));
                        } else {
                            strN = twa.n(intent);
                            if (strN == null) {
                                k().f(kph0VarN, strN, twa.o(intent));
                            } else if (!this.h) {
                                r();
                                return 1;
                            }
                        }
                        if (!this.h) {
                            zEquals = Objects.equals(k().d(), intent.getStringExtra("androidx.media3.session.intent.uid"));
                            this.h = zEquals;
                            if (!zEquals) {
                                oon1.H("Terminating service that was started by a stale start intent");
                                r();
                            }
                        }
                    } else if (!this.h) {
                        r();
                        return 1;
                    }
                }
            } else if (!this.h) {
                zEquals = Objects.equals(k().d(), intent.getStringExtra("androidx.media3.session.intent.uid"));
                this.h = zEquals;
                if (!zEquals) {
                    oon1.H("Terminating service that was started by a stale start intent");
                    r();
                }
            }
        }
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        if (k().e()) {
            ArrayList arrayListL = l();
            for (int i2 = 0; i2 < arrayListL.size(); i2++) {
                if (((kph0) arrayListL.get(i2)).f().i()) {
                    return;
                }
            }
        }
        k().b();
        ArrayList arrayListL2 = l();
        for (int i3 = 0; i3 < arrayListL2.size(); i3++) {
            ((kph0) arrayListL2.get(i3)).f().M(false);
        }
        stopSelf();
    }

    public final void q(kph0 kph0Var) {
        synchronized (this.b) {
            dm5.n(this.g.containsKey(kph0Var.b()), "session not found");
            this.g.remove(kph0Var.b());
        }
        zoi1.c0(this.c, new a1i0(this, kph0Var, (byte) 1));
    }

    public final void r() {
        try {
            try {
                Pair pairA = k().a(this);
                int iIntValue = ((Integer) pairA.first).intValue();
                Notification notification = (Notification) pairA.second;
                if (Build.VERSION.SDK_INT >= 29) {
                    g961.h(this, iIntValue, notification);
                } else {
                    startForeground(iIntValue, notification);
                }
                k().b();
                sto1.h(this);
                stopSelf();
            } catch (IllegalStateException e) {
                if (Build.VERSION.SDK_INT < 31 || !czh0.f(e)) {
                    throw e;
                }
                this.c.post(new gv40(this, (byte) 20));
                stopSelf();
            }
        } catch (Throwable th) {
            stopSelf();
            throw th;
        }
    }
}
