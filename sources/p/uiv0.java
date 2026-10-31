package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uiv0 {
    public final String a;
    public final long b;
    public final int c;
    public final int d;

    public uiv0(int i, long j, String str, int i2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiv0)) {
            return false;
        }
        uiv0 uiv0Var = (uiv0) obj;
        return u890.j(this.a, uiv0Var.a) && this.b == uiv0Var.b && this.c == uiv0Var.c && this.d == uiv0Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ab80.k(this.c, cy30.f(this.a.hashCode() * 31, this.b, 31), 31);
    }
}
