package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d0s0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public d0s0(String str, boolean z, String str2, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0s0)) {
            return false;
        }
        d0s0 d0s0Var = (d0s0) obj;
        return u890.j(this.a, d0s0Var.a) && u890.j(this.b, d0s0Var.b) && this.c == d0s0Var.c && this.d == d0s0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
