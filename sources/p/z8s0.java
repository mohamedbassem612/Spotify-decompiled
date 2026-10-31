package p;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z8s0 extends tua0 {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public y8s0 m;

    public z8s0(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    public final Object f(sua0 sua0Var, float f) {
        float f2;
        y8s0 y8s0Var = (y8s0) sua0Var;
        Path path = y8s0Var.q;
        if (path == null) {
            return (PointF) sua0Var.b;
        }
        j2e0 j2e0Var = ((fba) this).e;
        if (j2e0Var != null) {
            f2 = f;
            PointF pointF = (PointF) j2e0Var.j(((sua0) y8s0Var).g, ((sua0) y8s0Var).h.floatValue(), (PointF) ((sua0) y8s0Var).b, (PointF) ((sua0) y8s0Var).c, d(), f2, ((fba) this).d);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        y8s0 y8s0Var2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (y8s0Var2 != y8s0Var) {
            pathMeasure.setPath(path, false);
            this.m = y8s0Var;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
