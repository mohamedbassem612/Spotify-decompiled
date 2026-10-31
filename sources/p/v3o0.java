package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v3o0 {
    public final int a;
    public final String b;
    public final c380 c;
    public final boolean d;
    public final y0o0 e;
    public final boolean f;

    public v3o0(int i, String str, c380 c380Var, boolean z, y0o0 y0o0Var, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = c380Var;
        this.d = z;
        this.e = y0o0Var;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3o0)) {
            return false;
        }
        v3o0 v3o0Var = (v3o0) obj;
        return this.a == v3o0Var.a && u890.j(this.b, v3o0Var.b) && u890.j(this.c, v3o0Var.c) && this.d == v3o0Var.d && u890.j(this.e, v3o0Var.e) && this.f == v3o0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + xcg1.g(kk0.f(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d)) * 31);
    }
}
