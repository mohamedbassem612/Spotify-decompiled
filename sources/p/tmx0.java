package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tmx0 {
    public final x360 a;
    public final String b;
    public final String c;
    public final n1x d;
    public final int e;
    public final boolean f;

    public tmx0(x360 x360Var, String str, String str2, n1x n1xVar, int i, boolean z) {
        this.a = x360Var;
        this.b = str;
        this.c = str2;
        this.d = n1xVar;
        this.e = i;
        this.f = z;
    }

    public static tmx0 a(tmx0 tmx0Var, boolean z) {
        return new tmx0(tmx0Var.a, tmx0Var.b, tmx0Var.c, tmx0Var.d, tmx0Var.e, z);
    }

    public final int b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmx0)) {
            return false;
        }
        tmx0 tmx0Var = (tmx0) obj;
        return u890.j(this.a, tmx0Var.a) && u890.j(this.b, tmx0Var.b) && u890.j(this.c, tmx0Var.c) && u890.j(this.d, tmx0Var.d) && this.e == tmx0Var.e && this.f == tmx0Var.f;
    }

    public final int hashCode() {
        x360 x360Var = this.a;
        return Boolean.hashCode(this.f) + ab80.k(this.e, (this.d.hashCode() + cy30.d(cy30.d((x360Var == null ? 0 : x360Var.hashCode()) * 31, 31, this.b), 31, this.c)) * 31, 31);
    }
}
