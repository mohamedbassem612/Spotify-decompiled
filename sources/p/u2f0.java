package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u2f0 {
    public final kly0 a;
    public final iwe0 b;
    public final a1g c;

    public u2f0(kly0 kly0Var, p5x0 p5x0Var, iwe0 iwe0Var, a1g a1gVar) {
        this.a = kly0Var;
        this.b = iwe0Var;
        this.c = a1gVar;
    }

    public static Intent a(u2f0 u2f0Var, Context context, Intent intent, boolean z, Uri uri, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            uri = null;
        }
        if ((i3 & 16) != 0) {
            i = 268468224;
        }
        boolean z2 = (i3 & 32) != 0;
        if ((i3 & 64) != 0) {
            i2 = 1;
        }
        if (u2f0Var.b(i2, uri)) {
            return p5x0.d(context, i);
        }
        return u2f0Var.b.b(context, intent, z, uri, i, z2, i2 == 3);
    }

    public final boolean b(int i, Uri uri) {
        return (i == 2 || i == 3 || !((jq) this.a.get()).j() || kyo1.q(uri) || this.c.b() != null) ? false : true;
    }
}
