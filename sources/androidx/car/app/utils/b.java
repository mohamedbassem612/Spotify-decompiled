package androidx.car.app.utils;

import p.iac0;
import p.o5s;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b implements o5s {
    public final void onDestroy(iac0 iac0Var) {
        int i = RemoteUtils$SurfaceCallbackStub.a;
        iac0Var.getLifecycle().d(this);
    }
}
