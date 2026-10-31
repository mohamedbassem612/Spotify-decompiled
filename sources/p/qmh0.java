package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qmh0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;

    public qmh0(String str, String str2, int i, int i2, int i3, int i4, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmh0)) {
            return false;
        }
        qmh0 qmh0Var = (qmh0) obj;
        return u890.j(this.a, qmh0Var.a) && u890.j(this.b, qmh0Var.b) && this.c == qmh0Var.c && this.d == qmh0Var.d && this.e == qmh0Var.e && this.f == qmh0Var.f && this.g == qmh0Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ab80.k(this.f, kaa0.f(this.e, kaa0.f(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31);
    }
}
