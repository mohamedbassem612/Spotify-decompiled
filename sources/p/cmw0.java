package p;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cmw0 implements DisplayManager.DisplayListener {
    public final /* synthetic */ gmw0 a;

    public cmw0(gmw0 gmw0Var) {
        this.a = gmw0Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        gmw0 gmw0Var = this.a;
        Display display = gmw0Var.getDisplay();
        if (display == null || display.getDisplayId() != i) {
            return;
        }
        gmw0Var.a();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }
}
