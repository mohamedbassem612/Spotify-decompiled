package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jjj1 extends ljj1 {
    public final String a;
    public final long b;
    public final long c;

    public jjj1(long j, long j2, String str) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjj1)) {
            return false;
        }
        jjj1 jjj1Var = (jjj1) obj;
        return u890.j(this.a, jjj1Var.a) && this.b == jjj1Var.b && this.c == jjj1Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
