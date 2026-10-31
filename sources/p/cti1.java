package p;

import android.util.Property;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cti1 implements tfg1 {
    public final float a;
    public final float b;
    public final float c;
    public List e = Collections.EMPTY_LIST;
    public PathInterpolator d = null;

    public cti1(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // p.tfg1
    public final float a(float f) {
        float f2 = this.a;
        float f3 = this.b;
        float fT = f2 < f3 ? o0c.t(f2, f3, f) : o0c.t(f3, f2, f);
        float f4 = f3 - f2;
        if (f4 == 0.0f) {
            f4 = 1.0f / f3;
        }
        float f5 = (fT - f2) / f4;
        float f6 = this.c;
        float f7 = (f5 * f6) + ((1.0f - f5) * 1.0f);
        PathInterpolator pathInterpolator = this.d;
        if (pathInterpolator != null) {
            float f8 = f6 - 1.0f;
            if (f8 == 0.0f) {
                f8 = 1.0f / f6;
            }
            float f9 = (f7 - 1.0f) / f8;
            float interpolation = (pathInterpolator.getInterpolation((f9 * 1.0f) + ((1.0f - f9) * 0.0f)) - 0.0f) / 1.0f;
            f7 = (f6 * interpolation) + ((1.0f - interpolation) * 1.0f);
        }
        if (!this.e.isEmpty()) {
            for (xrd1 xrd1Var : this.e) {
                Iterator it = xrd1Var.b.iterator();
                while (it.hasNext()) {
                    ((Property) it.next()).set(xrd1Var.a, Float.valueOf(f7));
                }
            }
        }
        return f7;
    }
}
