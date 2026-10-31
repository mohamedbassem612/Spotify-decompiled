package p;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class sua0 {
    public final fcf0 a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f111p;

    public sua0(Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.f111p = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }

    public final float a() {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            return 1.0f;
        }
        float f = this.n;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.h == null) {
            this.n = 1.0f;
            return 1.0f;
        }
        float fFloatValue = ((this.h.floatValue() - this.g) / (fcf0Var.m - fcf0Var.l)) + b();
        this.n = fFloatValue;
        return fFloatValue;
    }

    public final float b() {
        fcf0 fcf0Var = this.a;
        if (fcf0Var == null) {
            return 0.0f;
        }
        float f = this.m;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float f2 = fcf0Var.l;
        float f3 = (this.g - f2) / (fcf0Var.m - f2);
        this.m = f3;
        return f3;
    }

    public final boolean c() {
        return this.d == null && this.e == null && this.f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.c + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + this.d + '}';
    }

    public sua0(fcf0 fcf0Var, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.f111p = null;
        this.a = fcf0Var;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = baseInterpolator;
        this.f = baseInterpolator2;
        this.g = f;
        this.h = null;
    }

    public sua0(fcf0 fcf0Var, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.f111p = null;
        this.a = fcf0Var;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public sua0(fcf0 fcf0Var, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f, Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.f111p = null;
        this.a = fcf0Var;
        this.b = obj;
        this.c = obj2;
        this.d = baseInterpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public sua0(o650 o650Var, o650 o650Var2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.l = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.o = null;
        this.f111p = null;
        this.a = null;
        this.b = o650Var;
        this.c = o650Var2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = Float.valueOf(Float.MAX_VALUE);
    }
}
