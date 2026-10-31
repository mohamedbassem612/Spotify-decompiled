package p;

import android.content.Context;
import android.provider.Settings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xk4 {
    public final Context a;
    public String b;

    public xk4(Context context) {
        this.a = context;
    }

    public final String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        this.b = string;
        return string;
    }
}
