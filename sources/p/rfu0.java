package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rfu0 extends sfu0 {
    public final String a;
    public final long b;
    public final float c;
    public final long d;

    public rfu0(long j, long j2, String str, float f) {
        this.a = str;
        this.b = j;
        this.c = f;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfu0)) {
            return false;
        }
        rfu0 rfu0Var = (rfu0) obj;
        return u890.j(this.a, rfu0Var.a) && this.b == rfu0Var.b && Float.compare(this.c, rfu0Var.c) == 0 && this.d == rfu0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + x0d.f(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }
}
