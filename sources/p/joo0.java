package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class joo0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;

    public joo0(int i, boolean z, String str, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joo0)) {
            return false;
        }
        joo0 joo0Var = (joo0) obj;
        return this.a.equals(joo0Var.a) && this.b.equals(joo0Var.b) && this.c == joo0Var.c && this.d == joo0Var.d && this.e == joo0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ab80.k(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
