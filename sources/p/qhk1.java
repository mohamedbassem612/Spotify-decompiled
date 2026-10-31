package p;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qhk1 {
    public final int a;
    public final int b;
    public final a c;
    public final int d;
    public final e821 f;
    public final Interpolator g;
    public float i;
    public float j;
    public final boolean m;
    public final p321 e = new p321((byte) 2);
    public boolean h = false;
    public final Rect l = new Rect();
    public long k = System.nanoTime();

    public qhk1(e821 e821Var, a aVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.m = false;
        this.f = e821Var;
        this.c = aVar;
        this.d = i2;
        ArrayList arrayList = (ArrayList) e821Var.d;
        if (arrayList == null) {
            arrayList = new ArrayList();
            e821Var.d = arrayList;
        }
        arrayList.add(this);
        this.g = interpolator;
        this.a = i4;
        this.b = i5;
        if (i3 == 3) {
            this.m = true;
        }
        this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        a();
    }

    public final void a() {
        boolean z = this.h;
        int i = this.b;
        int i2 = this.a;
        Interpolator interpolator = this.g;
        a aVar = this.c;
        e821 e821Var = this.f;
        if (z) {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.k;
            this.k = jNanoTime;
            float interpolation = this.i - (((float) (j * 1.0E-6d)) * this.j);
            this.i = interpolation;
            if (interpolation < 0.0f) {
                this.i = 0.0f;
                interpolation = 0.0f;
            }
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zD = aVar.d(interpolation, jNanoTime, aVar.b, this.e);
            if (this.i <= 0.0f) {
                if (i2 != -1) {
                    aVar.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    aVar.b.setTag(i, null);
                }
                ((ArrayList) e821Var.e).add(this);
            }
            if (this.i > 0.0f || zD) {
                ((MotionLayout) e821Var.b).invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j2 = jNanoTime2 - this.k;
        this.k = jNanoTime2;
        float interpolation2 = (((float) (j2 * 1.0E-6d)) * this.j) + this.i;
        this.i = interpolation2;
        if (interpolation2 >= 1.0f) {
            this.i = 1.0f;
            interpolation2 = 1.0f;
        }
        if (interpolator != null) {
            interpolation2 = interpolator.getInterpolation(interpolation2);
        }
        boolean zD2 = aVar.d(interpolation2, jNanoTime2, aVar.b, this.e);
        if (this.i >= 1.0f) {
            if (i2 != -1) {
                aVar.b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                aVar.b.setTag(i, null);
            }
            if (!this.m) {
                ((ArrayList) e821Var.e).add(this);
            }
        }
        if (this.i < 1.0f || zD2) {
            ((MotionLayout) e821Var.b).invalidate();
        }
    }

    public final void b() {
        this.h = true;
        int i = this.d;
        if (i != -1) {
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        }
        ((MotionLayout) this.f.b).invalidate();
        this.k = System.nanoTime();
    }
}
