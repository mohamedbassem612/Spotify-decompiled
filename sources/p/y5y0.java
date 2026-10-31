package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y5y0 implements a6y0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ y5y0(String str, int i, boolean z) {
        this(str, (i & 2) != 0 ? false : z, false);
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
        if (!(obj instanceof y5y0)) {
            return false;
        }
        y5y0 y5y0Var = (y5y0) obj;
        return u890.j(this.a, y5y0Var.a) && this.b == y5y0Var.b && this.c == y5y0Var.c;
    }

    public final boolean getEnabled() {
        return false;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public y5y0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
