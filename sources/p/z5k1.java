package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z5k1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public z5k1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f <= 0.0f) {
            hhg1.n("scaleX must be greater than 0");
            throw null;
        }
        if (f2 > 0.0f) {
            return;
        }
        hhg1.n("scaleY must be greater than 0");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5k1)) {
            return false;
        }
        z5k1 z5k1Var = (z5k1) obj;
        return Float.compare(this.a, z5k1Var.a) == 0 && Float.compare(this.b, z5k1Var.b) == 0 && Float.compare(this.c, z5k1Var.c) == 0 && Float.compare(this.d, z5k1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
