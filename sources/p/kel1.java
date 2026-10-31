package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kel1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public kel1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kel1)) {
            return false;
        }
        kel1 kel1Var = (kel1) obj;
        return Float.compare(this.a, kel1Var.a) == 0 && Float.compare(this.b, kel1Var.b) == 0 && Float.compare(this.c, kel1Var.c) == 0 && Float.compare(this.d, kel1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
