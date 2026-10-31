package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jg3 {
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public jg3(int i, long j, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg3)) {
            return false;
        }
        jg3 jg3Var = (jg3) obj;
        return this.a.equals(jg3Var.a) && this.b == jg3Var.b && this.c == jg3Var.c && this.d == jg3Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.f(kaa0.f(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }
}
