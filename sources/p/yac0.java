package p;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class yac0 extends Service implements iac0 {
    public final r961 a = new r961(this);

    @Override // p.iac0
    public final x8c0 getLifecycle() {
        return this.a.f();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.a.s();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.t();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.a.u();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.a.v();
        super.onStart(intent, i);
    }
}
