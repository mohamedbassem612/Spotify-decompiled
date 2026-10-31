package p;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vw4 {
    public final PathMeasure a;
    public float[] b;
    public float[] c;

    public vw4(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final float a() {
        return this.a.getLength();
    }

    public final void b(float f, float f2, u8s0 u8s0Var) {
        if (!(u8s0Var instanceof tw4)) {
            hhg1.h("Unable to obtain android.graphics.Path");
        } else {
            this.a.getSegment(f, f2, ((tw4) u8s0Var).a, true);
        }
    }

    public final void c(u8s0 u8s0Var, boolean z) {
        Path path;
        if (u8s0Var == null) {
            path = null;
        } else {
            if (!(u8s0Var instanceof tw4)) {
                hhg1.h("Unable to obtain android.graphics.Path");
                return;
            }
            path = ((tw4) u8s0Var).a;
        }
        this.a.setPath(path, z);
    }
}
