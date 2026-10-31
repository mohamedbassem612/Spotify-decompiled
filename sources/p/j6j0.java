package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j6j0 extends m6j0 {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public j6j0(int i, String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6j0)) {
            return false;
        }
        j6j0 j6j0Var = (j6j0) obj;
        return this.a.equals(j6j0Var.a) && this.b == j6j0Var.b && this.c.equals(j6j0Var.c) && this.d == j6j0Var.d && this.e == j6j0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }
}
