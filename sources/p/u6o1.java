package p;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u6o1 {
    public static volatile u6o1 h;
    public final ExecutorService a;
    public final AppMeasurementSdk b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile svn1 f;
    public volatile long g;

    public u6o1(Context context, Bundle bundle) {
        x2o1 x2o1Var = new x2o1(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), x2o1Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        this.c = new ArrayList();
        try {
            if (blo1.z(context, ijo1.A(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, u6o1.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new d0o1(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new o6o1(this));
    }

    public static u6o1 c(Context context, Bundle bundle) {
        zod.s(context);
        if (h == null) {
            synchronized (u6o1.class) {
                try {
                    if (h == null) {
                        h = new u6o1(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final void a(w4o1 w4o1Var) {
        this.a.execute(w4o1Var);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (!z && z2) {
            a(new lzn1(this, exc));
        }
    }
}
