package p;

import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class g7a0 {
    public static long k = -1;
    public final WeakReference a;
    public final Choreographer b = Choreographer.getInstance();
    public final zjs0 c;
    public final ArrayList d;
    public final Window e;
    public long f;
    public long g;
    public long h;
    public final uj30 i;
    public final f7a0 j;

    public g7a0(e7a0 e7a0Var, View view, Window window) {
        this.a = new WeakReference(view);
        this.c = iro1.p(view);
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = window;
        this.i = new uj30(arrayList);
        this.j = new f7a0(this, e7a0Var);
    }

    public long a(FrameMetrics frameMetrics) {
        View view = (View) this.a.get();
        Field field = m5t.a;
        return sap1.g(view);
    }

    public uj30 b(long j, long j2, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        this.h = j + metric;
        ytp0 ytp0Var = this.c.a;
        if (ytp0Var != null) {
            ytp0Var.o(this.d);
        }
        boolean z = metric > j2;
        long metric2 = frameMetrics.getMetric(8);
        uj30 uj30Var = this.i;
        uj30Var.b = j;
        uj30Var.c = metric;
        uj30Var.d = z;
        uj30Var.e = metric2;
        return uj30Var;
    }

    public long c(FrameMetrics frameMetrics) {
        return ((Long) m5t.a.get(this.b)).longValue();
    }
}
