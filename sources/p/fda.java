package p;

import android.os.Build;
import android.view.WindowInsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fda implements hda {
    public final /* synthetic */ kda a;

    public fda(kda kdaVar) {
        this.a = kdaVar;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            kda kdaVar = this.a;
            WindowInsets rootWindowInsets = kdaVar.c.getRootWindowInsets();
            if (rootWindowInsets != null) {
                kdaVar.k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                kdaVar.f();
            }
        }
    }
}
