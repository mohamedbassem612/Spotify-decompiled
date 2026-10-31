package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n200 implements a700 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public n200(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n200)) {
            return false;
        }
        n200 n200Var = (n200) obj;
        return u890.j(this.a, n200Var.a) && this.b == n200Var.b && this.c == n200Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
