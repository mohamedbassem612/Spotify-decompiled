package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ew9 {
    public final float a;
    public final h4p1 b;

    public ew9(float f, h4p1 h4p1Var) {
        this.a = f;
        this.b = h4p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew9)) {
            return false;
        }
        ew9 ew9Var = (ew9) obj;
        return Float.compare(this.a, ew9Var.a) == 0 && this.b.equals(ew9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }
}
