package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qre0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public qre0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qre0)) {
            return false;
        }
        qre0 qre0Var = (qre0) obj;
        return Float.compare(this.a, qre0Var.a) == 0 && Float.compare(this.b, qre0Var.b) == 0 && Float.compare(this.c, qre0Var.c) == 0 && Float.compare(this.d, qre0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
