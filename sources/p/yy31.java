package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yy31 {
    public final int a;
    public final xy31 b;
    public final xy31 c;
    public final float d;
    public final long e;

    public yy31(int i, xy31 xy31Var, xy31 xy31Var2, float f, long j) {
        this.a = i;
        this.b = xy31Var;
        this.c = xy31Var2;
        this.d = f;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy31)) {
            return false;
        }
        yy31 yy31Var = (yy31) obj;
        return this.a == yy31Var.a && this.b.equals(yy31Var.b) && u890.j(this.c, yy31Var.c) && Float.compare(this.d, yy31Var.d) == 0 && this.e == yy31Var.e;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        xy31 xy31Var = this.c;
        return Long.hashCode(this.e) + x0d.f((iHashCode + (xy31Var == null ? 0 : xy31Var.hashCode())) * 31, 31, this.d);
    }
}
