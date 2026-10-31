package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ebe1 {
    public final float a;
    public final int b;

    public ebe1(float f, int i) {
        this.a = f;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebe1)) {
            return false;
        }
        ebe1 ebe1Var = (ebe1) obj;
        return p3v.c(this.a, ebe1Var.a) && this.b == ebe1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
