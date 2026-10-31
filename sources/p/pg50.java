package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pg50 {
    public final int a;
    public final float b;
    public final int c;
    public final boolean d;
    public final int e;

    public pg50(int i, float f, int i2, boolean z, int i3) {
        this.a = i;
        this.b = f;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg50)) {
            return false;
        }
        pg50 pg50Var = (pg50) obj;
        return this.a == pg50Var.a && Float.compare(this.b, pg50Var.b) == 0 && this.c == pg50Var.c && this.d == pg50Var.d && this.e == pg50Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xcg1.g(kaa0.f(this.c, x0d.f(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }
}
