package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j6v0 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final Long e;
    public final Long f;

    public j6v0(String str, String str2, long j, String str3, Long l, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6v0)) {
            return false;
        }
        j6v0 j6v0Var = (j6v0) obj;
        return this.a.equals(j6v0Var.a) && u890.j(this.b, j6v0Var.b) && this.c == j6v0Var.c && u890.j(this.d, j6v0Var.d) && this.e.equals(j6v0Var.e) && this.f.equals(j6v0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + cy30.d(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d)) * 31);
    }
}
