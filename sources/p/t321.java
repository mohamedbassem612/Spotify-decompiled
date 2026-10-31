package p;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t321 implements ServiceConnection {
    public final CountDownLatch a = new CountDownLatch(1);
    public IBinder b;

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b = iBinder;
        this.a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
