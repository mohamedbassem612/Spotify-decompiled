package p;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pue0 {
    public final String a;
    public final boolean b;
    public final String c;

    public pue0(String str, String str2) {
        zod.p(str, "The log tag cannot be null or empty.");
        this.a = str;
        this.c = str2;
        this.b = str.length() <= 23;
    }

    public final void a(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b && Log.isLoggable(this.a, 3)) {
            c(str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.b && Log.isLoggable(this.a, 3)) {
            c(str, objArr);
        }
    }

    public final void c(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.c;
        String strF = TextUtils.isEmpty(str2) ? "" : f4i1.f("[", str2, "] ");
        if (TextUtils.isEmpty(strF)) {
            return;
        }
        strF.concat(str);
    }
}
