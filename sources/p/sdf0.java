package p;

import android.graphics.PointF;
import android.view.Choreographer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sdf0 extends jba implements Choreographer.FrameCallback {
    public boolean N0;
    public float X;
    public fcf0 Y;
    public boolean Z;
    public float d;
    public boolean e;
    public long f;
    public float g;
    public float h;
    public int i;
    public float t;

    public final void cancel() {
        super.a();
        b(n());
        q(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.Z) {
            q(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        fcf0 fcf0Var = this.Y;
        if (fcf0Var == null || !this.Z) {
            return;
        }
        long j2 = this.f;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / fcf0Var.n) / Math.abs(this.d));
        float f = this.g;
        if (n()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        float fL = l();
        float fK = k();
        PointF pointF = itj0.a;
        if (f2 >= fL && f2 <= fK) {
            z = true;
        }
        float f3 = this.g;
        float fB = itj0.b(f2, l(), k());
        this.g = fB;
        if (this.N0) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = j;
        if (!this.N0 || this.g != f3) {
            i();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
                e();
                this.i++;
                if (getRepeatMode() == 2) {
                    this.e = !this.e;
                    this.d = -this.d;
                } else {
                    float fK2 = n() ? k() : l();
                    this.g = fK2;
                    this.h = fK2;
                }
                this.f = j;
            } else {
                float fL2 = this.d < 0.0f ? l() : k();
                this.g = fL2;
                this.h = fL2;
                q(true);
                b(n());
            }
        }
        if (this.Y == null) {
            return;
        }
        float f4 = this.h;
        float f5 = this.t;
        if (f4 < f5 || f4 > this.X) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f5), Float.valueOf(this.X), Float.valueOf(this.h)));
        }
    }

    public final float getAnimatedFraction() {
        float fL;
        float fK;
        float fL2;
        if (this.Y == null) {
            return 0.0f;
        }
        if (n()) {
            fL = k() - this.h;
            fK = k();
            fL2 = l();
        } else {
            fL = this.h - l();
            fK = k();
            fL2 = l();
        }
        return fL / (fK - fL2);
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(j());
    }

    public final long getDuration() {
        fcf0 fcf0Var = this.Y;
        if (fcf0Var == null) {
            return 0L;
        }
        return (long) fcf0Var.b();
    }

    public final boolean isRunning() {
        return this.Z;
    }

    public final float j() {
        fcf0 fcf0Var = this.Y;
        if (fcf0Var == null) {
            return 0.0f;
        }
        float f = this.h;
        float f2 = fcf0Var.l;
        return (f - f2) / (fcf0Var.m - f2);
    }

    public final float k() {
        fcf0 fcf0Var = this.Y;
        if (fcf0Var == null) {
            return 0.0f;
        }
        float f = this.X;
        return f == 2.1474836E9f ? fcf0Var.m : f;
    }

    public final float l() {
        fcf0 fcf0Var = this.Y;
        if (fcf0Var == null) {
            return 0.0f;
        }
        float f = this.t;
        return f == -2.1474836E9f ? fcf0Var.l : f;
    }

    public final boolean n() {
        return this.d < 0.0f;
    }

    public final void q(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.Z = false;
        }
    }

    public final void r(float f) {
        if (this.g == f) {
            return;
        }
        float fB = itj0.b(f, l(), k());
        this.g = fB;
        if (this.N0) {
            fB = (float) Math.floor(fB);
        }
        this.h = fB;
        this.f = 0L;
        i();
    }

    public final void s(float f, float f2) {
        if (f > f2) {
            bhn0.j("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        fcf0 fcf0Var = this.Y;
        float f3 = fcf0Var == null ? -3.4028235E38f : fcf0Var.l;
        float f4 = fcf0Var == null ? Float.MAX_VALUE : fcf0Var.m;
        float fB = itj0.b(f, f3, f4);
        float fB2 = itj0.b(f2, f3, f4);
        if (fB == this.t && fB2 == this.X) {
            return;
        }
        this.t = fB;
        this.X = fB2;
        r((int) itj0.b(this.h, fB, fB2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setRepeatMode(int i) {
        super/*android.animation.ValueAnimator*/.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }
}
