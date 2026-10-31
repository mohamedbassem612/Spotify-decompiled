package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class whf1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public whf1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whf1)) {
            return false;
        }
        whf1 whf1Var = (whf1) obj;
        return Float.compare(this.a, whf1Var.a) == 0 && Float.compare(this.b, whf1Var.b) == 0 && Float.compare(this.c, whf1Var.c) == 0 && Float.compare(this.d, whf1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
