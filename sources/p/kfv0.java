package p;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kfv0 extends jfv0 {
    public final void q(Rect rect, View view) {
        rect.set(((WindowManager) view.getContext().getSystemService("window")).getCurrentWindowMetrics().getBounds());
    }
}
