package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y8h1 implements zxn0 {
    public final Object a = new Object();
    public boolean b = true;

    @Override // p.zxn0
    public final void c(Bundle bundle) {
        boolean z;
        if (bundle != null) {
            synchronized (this.a) {
                z = this.b;
            }
            boolean z2 = bundle.getBoolean("ubi.nav-logger.page-view-processor-state-first-view", z);
            synchronized (this.a) {
                this.b = z2;
            }
        }
    }

    @Override // p.zxn0
    public final void d(Bundle bundle) {
        boolean z;
        synchronized (this.a) {
            z = this.b;
        }
        bundle.putBoolean("ubi.nav-logger.page-view-processor-state-first-view", z);
    }
}
