package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yq9 {
    public final String a;
    public final long b;
    public final long c;
    public final String d;

    public yq9(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq9)) {
            return false;
        }
        yq9 yq9Var = (yq9) obj;
        return u890.j(this.a, yq9Var.a) && this.b == yq9Var.b && this.c == yq9Var.c && this.d.equals(yq9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }
}
