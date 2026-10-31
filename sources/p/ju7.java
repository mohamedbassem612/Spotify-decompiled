package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ju7 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final boolean f;

    public ju7(String str, String str2, long j, long j2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = str3;
        this.f = z;
    }

    public final String a() {
        return this.a.concat(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju7)) {
            return false;
        }
        ju7 ju7Var = (ju7) obj;
        return this.a.equals(ju7Var.a) && this.b.equals(ju7Var.b) && this.c == ju7Var.c && this.d == ju7Var.d && this.e.equals(ju7Var.e) && this.f == ju7Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(cy30.f(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), 31, this.e);
    }
}
