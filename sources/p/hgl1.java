package p;

import android.os.Build;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.wear.Sdk;
import com.google.wear.WearApiVersion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class hgl1 {
    public static final ggl1 a = new ggl1();

    public static Integer a() {
        try {
            if (Build.VERSION.SDK_INT >= 34) {
                return Integer.valueOf(Sdk.VERSION.RELEASE);
            }
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "ro.cw_build.platform_qpr.version");
            return Integer.valueOf(str == null ? -1 : Integer.parseInt(str));
        } catch (Exception unused) {
            return -1;
        }
    }

    public static boolean b(String str) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 36;
        if (i >= 36) {
            WearApiVersion wearApiVersionLookup = Sdk.VERSION_CODES.lookup(str);
            return wearApiVersionLookup != null && Sdk.isApiVersionAtLeast(wearApiVersionLookup);
        }
        if (TextUtils.isEmpty(str)) {
            hhg1.n("Non-empty version required.");
            return false;
        }
        Matcher matcher = Pattern.compile("WEAR_(\\w+)_(\\d+)").matcher(str);
        if (!matcher.matches()) {
            hhg1.n("Invalid/unrecognized version: ".concat(str));
            return false;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        switch (strGroup) {
            case "TIRAMISU":
                i2 = 33;
                break;
            case "CINNAMON_BUN":
                i2 = 37;
                break;
            case "UDC":
                i2 = 34;
                break;
            case "VIC":
                i2 = 35;
                break;
            case "BAKLAVA":
                break;
            default:
                i2 = Alert.DURATION_SHOW_INDEFINITELY;
                break;
        }
        int i3 = Integer.parseInt(matcher.group(2));
        if (i <= i2) {
            if (i >= i2) {
                ggl1 ggl1Var = a;
                if (ggl1Var.a() != i3 && ggl1Var.a() <= i3) {
                }
            }
        }
    }
}
