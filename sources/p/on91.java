package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class on91 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;
    public final long e;

    public on91(long j, long j2, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
        this.e = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on91)) {
            return false;
        }
        on91 on91Var = (on91) obj;
        return u890.j(this.a, on91Var.a) && u890.j(this.b, on91Var.b) && this.c == on91Var.c && this.d == on91Var.d && this.e == on91Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + xcg1.g(cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d);
    }
}
