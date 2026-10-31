package p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f8l implements iac0 {
    public boolean a;
    public x8c0 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final tac0 d = new tac0(this, true);
    public final ek2 e = new ek2(this, (byte) 4);

    public final x8c0 getLifecycle() {
        return this.d;
    }
}
