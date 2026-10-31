package p;

import android.content.Context;
import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class okx0 implements DisplayManager.DisplayListener {
    public final /* synthetic */ ssw0 a;
    public final /* synthetic */ Context b;

    public okx0(ssw0 ssw0Var, Context context) {
        this.a = ssw0Var;
        this.b = context;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        qkx0.e(this.a, this.b);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        qkx0.e(this.a, this.b);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        qkx0.e(this.a, this.b);
    }
}
