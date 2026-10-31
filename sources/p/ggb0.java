package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ggb0 {
    public final String a;
    public final String b;
    public final wz6 c;

    public ggb0(String str, String str2, wz6 wz6Var) {
        this.a = str;
        this.b = str2;
        this.c = wz6Var;
    }

    public final t081 a(Context context, String str, IconCompat iconCompat) {
        s081 s081Var = new s081(context, str);
        s081Var.e(this.b);
        s081Var.b(iconCompat);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.a));
        intent.putExtra("customshortcut.lastvisitedpage", true);
        ywo1.r(intent, new a690(mno1.v));
        s081Var.c(intent);
        s081Var.d();
        return s081Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggb0)) {
            return false;
        }
        ggb0 ggb0Var = (ggb0) obj;
        return this.a.equals(ggb0Var.a) && this.b.equals(ggb0Var.b) && this.c.equals(ggb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
