package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kj4 {
    public final float a;
    public final float b;

    public kj4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj4)) {
            return false;
        }
        kj4 kj4Var = (kj4) obj;
        return Float.compare(this.a, kj4Var.a) == 0 && Float.compare(this.b, kj4Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ")";
    }
}
