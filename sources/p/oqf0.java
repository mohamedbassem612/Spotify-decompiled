package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oqf0 {
    public final String a;
    public final String b;
    public final dhf0 c;
    public final boolean d;
    public final bef0 e;
    public final int f;
    public final boolean g;

    public oqf0(int i, String str, String str2, bef0 bef0Var, dhf0 dhf0Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = dhf0Var;
        this.d = z;
        this.e = bef0Var;
        this.f = i;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqf0)) {
            return false;
        }
        oqf0 oqf0Var = (oqf0) obj;
        return u890.j(this.a, oqf0Var.a) && u890.j(this.b, oqf0Var.b) && this.c == oqf0Var.c && this.d == oqf0Var.d && u890.j(this.e, oqf0Var.e) && this.f == oqf0Var.f && this.g == oqf0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ab80.k(this.f, (this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31, 31);
    }
}
