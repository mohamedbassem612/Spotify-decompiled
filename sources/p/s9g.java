package p;

import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class s9g {
    public static final List a = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome", "com.chrome.canary", "com.chrome.dev", "com.chrome.beta", "com.android.chrome");
    public static final List b = Arrays.asList("com.chrome.beta", "com.android.chrome");
    public static final List c = Arrays.asList("com.google.android.apps.chrome", "org.chromium.chrome");

    public static boolean a(PackageManager packageManager, String str, int i) {
        return c.contains(str) || b(packageManager, str) >= i;
    }

    public static int b(PackageManager packageManager, String str) {
        try {
            return Build.VERSION.SDK_INT >= 28 ? (int) packageManager.getPackageInfo(str, 0).getLongVersionCode() : packageManager.getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }
}
