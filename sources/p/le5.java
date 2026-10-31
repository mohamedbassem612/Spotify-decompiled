package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class le5 extends oe5 {
    public float a;
    public float b;

    public le5(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // p.oe5
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    @Override // p.oe5
    public final int b() {
        return 2;
    }

    @Override // p.oe5
    public final oe5 c() {
        return new le5(0.0f, 0.0f);
    }

    @Override // p.oe5
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // p.oe5
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof le5)) {
            return false;
        }
        le5 le5Var = (le5) obj;
        return le5Var.a == this.a && le5Var.b == this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
