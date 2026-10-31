package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w5y0 implements a6y0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d = true;

    public w5y0(String str, boolean z, boolean z2) {
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
        if (!(obj instanceof w5y0)) {
            return false;
        }
        w5y0 w5y0Var = (w5y0) obj;
        return u890.j(this.a, w5y0Var.a) && this.b == w5y0Var.b && this.c == w5y0Var.c;
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
