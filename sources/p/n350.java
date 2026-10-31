package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n350 {
    public final kly0 a;

    public n350(caq caqVar) {
        this.a = caqVar;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT >= 26 && ((wq4) this.a.get()).a();
    }
}
