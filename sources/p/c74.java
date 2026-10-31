package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c74 implements uxh0 {
    public static final PlayOrigin e;
    public final f8q c;
    public final Context d;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("android-auto");
        a690 a690Var = b690.a;
        e = builder.referrerIdentifier("android-auto").build();
    }

    public c74(f8q f8qVar, Context context) {
        this.c = f8qVar;
        this.d = context;
    }

    public final m210 a(String str) {
        String str2;
        String str3;
        Context context = this.d;
        UsbManager usbManager = (UsbManager) x74.S(context, UsbManager.class);
        UsbAccessory[] accessoryList = usbManager != null ? usbManager.getAccessoryList() : null;
        if (accessoryList != null && accessoryList.length != 0) {
            int length = accessoryList.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str2 = "bluetooth_or_usb";
                    break;
                }
                UsbAccessory usbAccessory = accessoryList[i];
                if (u890.j(usbAccessory.getModel(), "Android Open Automotive Protocol") || u890.j(usbAccessory.getModel(), "Android Auto")) {
                    str2 = "usb";
                    break;
                }
                i++;
            }
        } else {
            str2 = "wireless";
        }
        String str4 = str2;
        try {
            str3 = context.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionName;
            if (str3 == null) {
                str3 = "unknown";
            }
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "not_installed";
        }
        return new m210(214, "android_auto", (String) null, (String) null, str4, "car", (String) null, (String) null, str3, "media_session", str);
    }

    public final boolean b(String str) {
        return jo31.o(str);
    }

    public final lxh0 c(x610 x610Var, int i) {
        return this.c.b(x610Var, e, i);
    }
}
