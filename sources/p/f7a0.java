package p;

import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class f7a0 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ g7a0 a;
    public final /* synthetic */ e7a0 b;

    public /* synthetic */ f7a0(g7a0 g7a0Var, e7a0 e7a0Var) {
        this.a = g7a0Var;
        this.b = e7a0Var;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        frameMetrics.getClass();
        g7a0 g7a0Var = this.a;
        long jMax = Math.max(g7a0Var.c(frameMetrics), g7a0Var.h);
        if (jMax < g7a0Var.g || jMax == g7a0Var.f) {
            return;
        }
        float fA = g7a0Var.a(frameMetrics);
        e7a0 e7a0Var = this.b;
        e7a0Var.a.b(g7a0Var.b(jMax, (long) (fA * e7a0Var.d), frameMetrics));
        g7a0Var.f = jMax;
    }
}
