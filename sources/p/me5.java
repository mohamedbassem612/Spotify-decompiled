package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class me5 extends oe5 {
    public float a;
    public float b;
    public float c;

    public me5(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // p.oe5
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // p.oe5
    public final int b() {
        return 3;
    }

    @Override // p.oe5
    public final oe5 c() {
        return new me5(0.0f, 0.0f, 0.0f);
    }

    @Override // p.oe5
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // p.oe5
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof me5)) {
            return false;
        }
        me5 me5Var = (me5) obj;
        return me5Var.a == this.a && me5Var.b == this.b && me5Var.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sbM = gvg.m("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbM.append(f3);
        return sbM.toString();
    }
}
