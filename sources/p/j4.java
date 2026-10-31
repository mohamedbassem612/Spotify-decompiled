package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j4 implements k4 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public j4(int i, int i2, String str, String str2, String str3) {
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
        if (!(obj instanceof j4)) {
            return false;
        }
        j4 j4Var = (j4) obj;
        return this.a.equals(j4Var.a) && this.b.equals(j4Var.b) && this.c.equals(j4Var.c) && this.d == j4Var.d && this.e == j4Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }
}
