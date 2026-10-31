package p;

import android.os.Build;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yj30 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yj30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        switch (this.a) {
            case 0:
                rl1 rl1Var = (rl1) this.b;
                if (rl1Var.b) {
                    SparseIntArray sparseIntArray = ((SparseIntArray[]) rl1Var.c)[0];
                    long metric = frameMetrics.getMetric(8);
                    if (sparseIntArray != null) {
                        int i2 = (int) ((500000 + metric) / 1000000);
                        if (metric >= 0) {
                            sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                FrameMetrics frameMetrics2 = new FrameMetrics(frameMetrics);
                long metric2 = frameMetrics2.getMetric(0);
                long metric3 = frameMetrics2.getMetric(1);
                long metric4 = frameMetrics2.getMetric(2);
                long metric5 = frameMetrics2.getMetric(3);
                long metric6 = frameMetrics2.getMetric(4);
                long metric7 = frameMetrics2.getMetric(5);
                long metric8 = frameMetrics2.getMetric(6);
                long metric9 = frameMetrics2.getMetric(7);
                int i3 = Build.VERSION.SDK_INT;
                long metric10 = i3 >= 31 ? frameMetrics2.getMetric(12) : 0L;
                dk30 dk30Var = (dk30) this.b;
                long j = metric2 + metric3 + metric4 + metric5 + metric6;
                long j2 = metric7 + metric8 + metric9;
                boolean z = i3 >= 31;
                float f = (float) (j / 1000000.0d);
                float f2 = (float) (j2 / 1000000.0d);
                float f3 = (float) (metric6 / 1000000.0d);
                float f4 = (float) (metric10 / 1000000.0d);
                synchronized (dk30Var.U0) {
                    try {
                        float[] fArr = dk30Var.V0;
                        int i4 = dk30Var.Z0;
                        fArr[i4] = f;
                        dk30Var.W0[i4] = f2;
                        dk30Var.X0[i4] = f3;
                        dk30Var.Y0[i4] = f4;
                        dk30Var.Z0 = (i4 + 1) % 120;
                        int i5 = dk30Var.a1;
                        if (i5 < 120) {
                            dk30Var.a1 = i5 + 1;
                        }
                        dk30Var.b1 = f;
                        dk30Var.c1 = f2;
                        dk30Var.d1 = f3;
                        dk30Var.e1 = f4;
                        if (z) {
                            dk30Var.f1 = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
