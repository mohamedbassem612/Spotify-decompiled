package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c0j1 {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public c0j1(int i, String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0j1)) {
            return false;
        }
        c0j1 c0j1Var = (c0j1) obj;
        return this.a.equals(c0j1Var.a) && this.b.equals(c0j1Var.b) && this.c == c0j1Var.c && this.d == c0j1Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
