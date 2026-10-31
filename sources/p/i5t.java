package p;

import android.os.Handler;
import android.view.FrameMetrics;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i5t implements Window.OnFrameMetricsAvailableListener {
    public static Handler b;
    public final ArrayList a;

    public i5t(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        synchronized (this) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((Window.OnFrameMetricsAvailableListener) it.next()).onFrameMetricsAvailable(window, frameMetrics, i);
            }
        }
    }
}
