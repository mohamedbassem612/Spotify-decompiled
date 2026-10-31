package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tur0 {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;

    public tur0(String str, long j, long j2, String str2, String str3, int i, boolean z) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tur0)) {
            return false;
        }
        tur0 tur0Var = (tur0) obj;
        return this.a.equals(tur0Var.a) && this.b == tur0Var.b && this.c == tur0Var.c && this.d.equals(tur0Var.d) && this.e.equals(tur0Var.e) && this.f == tur0Var.f && this.g == tur0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ab80.k(this.f, cy30.d(cy30.d(cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), 31);
    }
}
