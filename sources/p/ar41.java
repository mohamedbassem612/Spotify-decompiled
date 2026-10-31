package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ar41 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ar41(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar41)) {
            return false;
        }
        ar41 ar41Var = (ar41) obj;
        return Float.compare(this.a, ar41Var.a) == 0 && Float.compare(this.b, ar41Var.b) == 0 && Float.compare(this.c, ar41Var.c) == 0 && Float.compare(this.d, ar41Var.d) == 0 && Float.compare(this.e, ar41Var.e) == 0 && Float.compare(this.f, ar41Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + x0d.f(x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
