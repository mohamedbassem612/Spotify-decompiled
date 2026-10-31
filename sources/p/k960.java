package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k960 {
    public final float a;
    public final float b;
    public final float c;

    public k960(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = f / f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k960)) {
            return false;
        }
        k960 k960Var = (k960) obj;
        return Float.compare(this.a, k960Var.a) == 0 && Float.compare(this.b, k960Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
