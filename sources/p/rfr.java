package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rfr {
    public final Context a;
    public final PackageManager b;

    public rfr(Context context) {
        this.a = context;
        this.b = context.getPackageManager();
    }

    public final void a() {
        Context context = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            intent.addFlags(268435456);
            if (this.b.resolveActivity(intent, 0) != null) {
                context.startActivity(intent);
            } else {
                n57.s("Failed to resolve app details settings intent");
            }
        } catch (ActivityNotFoundException e) {
            n57.t("Failed to open app details settings", e);
        } catch (SecurityException e2) {
            n57.t("Failed to open app details settings", e2);
        }
    }
}
