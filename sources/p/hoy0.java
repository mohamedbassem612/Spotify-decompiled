package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hoy0 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;
    public final String e;

    public hoy0(int i, String str, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoy0)) {
            return false;
        }
        hoy0 hoy0Var = (hoy0) obj;
        return this.a.equals(hoy0Var.a) && this.b.equals(hoy0Var.b) && this.c == hoy0Var.c && this.d == hoy0Var.d && this.e.equals(hoy0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }
}
