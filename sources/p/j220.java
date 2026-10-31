package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j220 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public j220(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j220)) {
            return false;
        }
        j220 j220Var = (j220) obj;
        return Float.compare(this.a, j220Var.a) == 0 && Float.compare(this.b, j220Var.b) == 0 && Float.compare(this.c, j220Var.c) == 0 && Float.compare(this.d, j220Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
