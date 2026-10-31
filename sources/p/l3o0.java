package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l3o0 {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final y0o0 e;

    public l3o0(int i, String str, String str2, boolean z, y0o0 y0o0Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = y0o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3o0)) {
            return false;
        }
        l3o0 l3o0Var = (l3o0) obj;
        return this.a == l3o0Var.a && u890.j(this.b, l3o0Var.b) && u890.j(this.c, l3o0Var.c) && this.d == l3o0Var.d && u890.j(this.e, l3o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
