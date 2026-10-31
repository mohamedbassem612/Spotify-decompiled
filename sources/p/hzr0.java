package p;

import android.app.ActivityManager;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class hzr0 {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = izr0.d;
        boolean z = true;
        if (!eth.r("robolectric", Build.FINGERPRINT) && (((classLoader = izr0.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
