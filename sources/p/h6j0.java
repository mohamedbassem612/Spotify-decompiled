package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h6j0 extends m6j0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public h6j0(int i, String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6j0)) {
            return false;
        }
        h6j0 h6j0Var = (h6j0) obj;
        return u890.j(this.a, h6j0Var.a) && u890.j(this.b, h6j0Var.b) && this.c == h6j0Var.c && this.d == h6j0Var.d && this.e == h6j0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
