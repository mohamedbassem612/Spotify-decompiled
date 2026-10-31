package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fpv0 {
    public final String a;
    public final int b;
    public final int c;
    public final float d;

    public fpv0(String str, int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpv0)) {
            return false;
        }
        fpv0 fpv0Var = (fpv0) obj;
        return u890.j(this.a, fpv0Var.a) && this.b == fpv0Var.b && this.c == fpv0Var.c && Float.compare(this.d, fpv0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
}
