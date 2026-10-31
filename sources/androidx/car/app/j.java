package androidx.car.app;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p.sge1;
import p.tw60;
import p.yoo1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class j extends Service {
    public final HashMap a = new HashMap();
    public AppInfo b;
    public tw60 c;

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if ("AUTO_DRIVE".equals(str)) {
                sge1.b(new Runnable() { // from class: androidx.car.app.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        j jVar = this.a;
                        synchronized (jVar.a) {
                            try {
                                for (CarAppBinder carAppBinder : jVar.a.values()) {
                                    if (Log.isLoggable("CarApp", 3)) {
                                        Objects.toString(carAppBinder.getCurrentSessionInfo());
                                    }
                                    carAppBinder.onAutoDriveEnabled();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        CarAppBinder carAppBinder;
        Bundle extras = intent.getExtras();
        SessionInfo sessionInfoV = extras == null ? false : extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE") ? yoo1.v(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        synchronized (this.a) {
            try {
                if (!this.a.containsKey(sessionInfoV)) {
                    this.a.put(sessionInfoV, new CarAppBinder(this, sessionInfoV));
                }
                carAppBinder = (CarAppBinder) this.a.get(sessionInfoV);
                Objects.requireNonNull(carAppBinder);
            } catch (Throwable th) {
                throw th;
            }
        }
        return carAppBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.a) {
            try {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((CarAppBinder) it.next()).destroy();
                }
                this.a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
        }
        Bundle extras = intent.getExtras();
        sge1.b(new e(this, extras == null ? false : extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE") ? yoo1.v(intent) : SessionInfo.DEFAULT_SESSION_INFO, (byte) 1));
        Log.isLoggable("CarApp", 3);
        return true;
    }
}
