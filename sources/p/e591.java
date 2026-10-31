package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e591 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;

    public e591(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e591)) {
            return false;
        }
        e591 e591Var = (e591) obj;
        return u890.j(this.a, e591Var.a) && u890.j(this.b, e591Var.b) && this.c == e591Var.c && this.d == e591Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }
}
