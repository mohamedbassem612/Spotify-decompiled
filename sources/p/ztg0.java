package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ztg0 {
    public final float a;
    public final float b;
    public final float c;

    public ztg0(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztg0)) {
            return false;
        }
        ztg0 ztg0Var = (ztg0) obj;
        return Float.compare(this.a, ztg0Var.a) == 0 && Float.compare(this.b, ztg0Var.b) == 0 && Float.compare(this.c, ztg0Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
