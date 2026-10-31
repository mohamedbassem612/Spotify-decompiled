package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z5y0 implements a6y0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d = true;

    public z5y0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5y0)) {
            return false;
        }
        z5y0 z5y0Var = (z5y0) obj;
        return u890.j(this.a, z5y0Var.a) && this.b == z5y0Var.b && this.c == z5y0Var.c;
    }

    public final boolean getEnabled() {
        return this.d;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
