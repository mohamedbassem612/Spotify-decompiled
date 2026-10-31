package p;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m550 {
    public static final boolean b;
    public final ouz a;

    static {
        b = dqz0.b.b() <= 1.0E-4d;
    }

    public m550(Context context) {
        this.a = new ouz(context);
    }

    public final void a(Bundle bundle, String str) {
        if (b && ihc1.j0(str, "gps")) {
            this.a.p(bundle, str);
        }
    }
}
