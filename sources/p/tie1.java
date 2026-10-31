package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tie1 {
    public final float a;
    public final float b;

    public tie1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tie1)) {
            return false;
        }
        tie1 tie1Var = (tie1) obj;
        return Float.compare(this.a, tie1Var.a) == 0 && Float.compare(this.b, tie1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
