package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w8f1 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final l651 e;

    public w8f1(String str, String str2, int i, boolean z, l651 l651Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = l651Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8f1)) {
            return false;
        }
        w8f1 w8f1Var = (w8f1) obj;
        return u890.j(this.a, w8f1Var.a) && u890.j(this.b, w8f1Var.b) && this.c == w8f1Var.c && this.d == w8f1Var.d && this.e == w8f1Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
