package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jen0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;

    public jen0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f3 - f;
        this.f = f4 - f2;
    }

    public final void a(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        float f = iArr[0];
        float f2 = iArr[1];
        this.a = f;
        this.b = f2;
        this.c = f + view.getWidth();
        this.d = f2 + view.getHeight();
        this.e = view.getWidth();
        this.f = view.getHeight();
    }

    public final void b(jen0 jen0Var) {
        this.a = jen0Var.a;
        this.b = jen0Var.b;
        this.c = jen0Var.c;
        this.d = jen0Var.d;
        this.e = jen0Var.e;
        this.f = jen0Var.f;
    }

    public final float c() {
        return (this.b + this.d) / 2.0f;
    }

    public final void d(float f, float f2, float f3, float f4) {
        float fMax = Math.max(this.a, f);
        float fMax2 = Math.max(this.b, f2);
        b(new jen0(fMax, fMax2, Math.max(fMax, Math.min(this.c, f3)), Math.max(fMax2, Math.min(this.d, f4))));
    }

    public final float e(jen0 jen0Var) {
        return (Math.min(this.d, jen0Var.d) - Math.max(this.b, jen0Var.b)) / this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jen0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jen0 jen0Var = (jen0) obj;
        return this.a == jen0Var.a && this.b == jen0Var.b && this.c == jen0Var.c && this.d == jen0Var.d && this.e == jen0Var.e && this.f == jen0Var.f;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.e;
        float f4 = this.f;
        StringBuilder sbM = gvg.m("Rect(", f, ", ", f2, ", ");
        sbM.append(f3);
        sbM.append(", ");
        sbM.append(f4);
        sbM.append(")");
        return sbM.toString();
    }

    public /* synthetic */ jen0() {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
