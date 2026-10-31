package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i6j0 extends m6j0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public i6j0(int i, String str, String str2, boolean z, boolean z2) {
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
        if (!(obj instanceof i6j0)) {
            return false;
        }
        i6j0 i6j0Var = (i6j0) obj;
        return u890.j(this.a, i6j0Var.a) && u890.j(this.b, i6j0Var.b) && this.c == i6j0Var.c && this.d == i6j0Var.d && this.e == i6j0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
