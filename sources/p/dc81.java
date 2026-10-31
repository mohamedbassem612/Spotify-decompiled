package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dc81 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public dc81(int i, int i2, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc81)) {
            return false;
        }
        dc81 dc81Var = (dc81) obj;
        return this.a.equals(dc81Var.a) && this.b.equals(dc81Var.b) && this.c.equals(dc81Var.c) && this.d == dc81Var.d && this.e == dc81Var.e;
    }

    public final int hashCode() {
        return l1d.C(this.e) + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
