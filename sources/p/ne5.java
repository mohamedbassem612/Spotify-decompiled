package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ne5 extends oe5 {
    public float a;
    public float b;
    public float c;
    public float d;

    public ne5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // p.oe5
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // p.oe5
    public final int b() {
        return 4;
    }

    @Override // p.oe5
    public final oe5 c() {
        return new ne5(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p.oe5
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // p.oe5
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ne5)) {
            return false;
        }
        ne5 ne5Var = (ne5) obj;
        return ne5Var.a == this.a && ne5Var.b == this.b && ne5Var.c == this.c && ne5Var.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbM = gvg.m("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbM.append(f3);
        sbM.append(", v4 = ");
        sbM.append(f4);
        return sbM.toString();
    }
}
