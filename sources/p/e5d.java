package p;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e5d implements jrd1 {
    public final eqq0 a;
    public static final sy8 b = new sy8("camerax.core.appConfig.cameraFactoryProvider", w1d.class, null);
    public static final sy8 c = new sy8("camerax.core.appConfig.deviceSurfaceManagerProvider", x1d.class, null);
    public static final sy8 d = new sy8("camerax.core.appConfig.useCaseConfigFactoryProvider", y1d.class, null);
    public static final sy8 e = new sy8("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final sy8 f = new sy8("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final sy8 g = new sy8("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final sy8 h = new sy8("camerax.core.appConfig.availableCamerasLimiter", u4d.class, null);
    public static final sy8 i = new sy8("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final sy8 t = new sy8("camerax.core.appConfig.cameraProviderInitRetryPolicy", wc31.class, null);
    public static final sy8 X = new sy8("camerax.core.appConfig.quirksSettings", ygz0.class, null);

    public e5d(eqq0 eqq0Var) {
        this.a = eqq0Var;
    }

    public final u4d a() {
        Object objE;
        try {
            objE = this.a.e(h);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        return (u4d) objE;
    }

    public final w1d b() {
        Object objE;
        try {
            objE = this.a.e(b);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        return (w1d) objE;
    }

    public final long d() {
        Object objE = -1L;
        try {
            objE = this.a.e(i);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objE).longValue();
    }

    public final qsk l() {
        return this.a;
    }

    public final x1d n() {
        Object objE;
        try {
            objE = this.a.e(c);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        return (x1d) objE;
    }

    public final y1d r() {
        Object objE;
        try {
            objE = this.a.e(d);
        } catch (IllegalArgumentException unused) {
            objE = null;
        }
        return (y1d) objE;
    }
}
