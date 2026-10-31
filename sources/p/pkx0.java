package p;

import android.companion.virtual.VirtualDeviceManager;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pkx0 implements VirtualDeviceManager.VirtualDeviceListener {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ Context b;

    public pkx0(ssw0 ssw0Var, Context context) {
        this.a = ssw0Var;
        this.b = context;
    }

    public final void onVirtualDeviceClosed(int i) {
        qkx0.e(this.a, this.b);
    }

    public final void onVirtualDeviceCreated(int i) {
        qkx0.e(this.a, this.b);
    }
}
