package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e9s0 extends t9s0 {
    public final float c;
    public final float d;

    public e9s0(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9s0)) {
            return false;
        }
        e9s0 e9s0Var = (e9s0) obj;
        return Float.compare(this.c, e9s0Var.c) == 0 && Float.compare(this.d, e9s0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
