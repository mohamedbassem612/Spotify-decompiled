package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l580 implements ServiceConnection {
    public final /* synthetic */ byte a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.a) {
            case 0:
                AtomicBoolean atomicBoolean = m580.a;
                Context contextA = wf10.a();
                x580 x580Var = x580.a;
                Object objI = null;
                if (!dhn.a.contains(x580.class)) {
                    try {
                        objI = x580.a.i(contextA, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
                    } catch (Throwable th) {
                        dhn.a(x580.class, th);
                    }
                }
                m580.g = objI;
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        byte b = this.a;
    }

    private final void b(ComponentName componentName) {
    }

    private final void c(ComponentName componentName) {
    }

    private final void a(ComponentName componentName, IBinder iBinder) {
    }
}
