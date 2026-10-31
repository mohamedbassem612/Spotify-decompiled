package p;

import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i7a0 extends h7a0 {
    public final vj30 l;

    public i7a0(e7a0 e7a0Var, View view, Window window) {
        super(e7a0Var, view, window);
        vj30 vj30Var = new vj30(this.d);
        vj30Var.f = 0L;
        vj30Var.g = 0L;
        this.l = vj30Var;
    }

    @Override // p.g7a0
    public final long a(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }

    @Override // p.g7a0
    public final uj30 b(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.h = j + metric;
        ytp0 ytp0Var = this.c.a;
        if (ytp0Var != null) {
            ytp0Var.o(this.d);
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        long metric3 = frameMetrics.getMetric(7) + (metric2 - frameMetrics.getMetric(12));
        long metric4 = metric2 - frameMetrics.getMetric(13);
        vj30 vj30Var = this.l;
        vj30Var.b = j;
        vj30Var.c = metric;
        vj30Var.d = z;
        vj30Var.e = metric3;
        vj30Var.f = metric2;
        vj30Var.g = metric4;
        return vj30Var;
    }
}
