package p;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xjo0 {
    public final Bundle a;
    public IconCompat b;
    public final z221[] c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public xjo0(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, z221[] z221VarArr, boolean z, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.j() == 2) {
            this.f = iconCompat.h();
        }
        this.g = dko0.d(charSequence);
        this.h = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = z221VarArr;
        this.d = z;
        this.e = z2;
    }
}
