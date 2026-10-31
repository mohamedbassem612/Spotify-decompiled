package p;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zhh0 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final d4e0 d;
    public final HashMap e = new HashMap();
    public yge0 f;
    public final /* synthetic */ jih0 g;

    public zhh0(jih0 jih0Var, String str, int i, int i2, d4e0 d4e0Var) {
        this.g = jih0Var;
        this.a = str;
        this.b = i;
        this.c = i2;
        if (str == null) {
            bhn0.i("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            hhg1.n("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            g0i0.a(i, i2, str);
        }
        this.d = d4e0Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.e.post(new an90(this, (byte) 9));
    }
}
