package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ksx0 extends ktx0 {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;

    public ksx0(String str, long j, long j2, long j3, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksx0)) {
            return false;
        }
        ksx0 ksx0Var = (ksx0) obj;
        return u890.j(this.a, ksx0Var.a) && this.b == ksx0Var.b && this.c == ksx0Var.c && this.d == ksx0Var.d && this.e == ksx0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + cy30.f(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }
}
