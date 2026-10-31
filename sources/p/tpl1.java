package p;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tpl1 {
    public static void a(Context context, Class cls, boolean z) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context.getPackageName(), cls.getName()), z ? 1 : 2, 1);
        } catch (Exception e) {
            n57.t("Failed to set widget component state", e);
        }
    }
}
