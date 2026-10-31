package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p0o0 implements z0o0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final y0o0 d;

    public p0o0(String str, String str2, boolean z, y0o0 y0o0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = y0o0Var;
    }

    public final boolean a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p0o0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        p0o0 p0o0Var = (p0o0) obj;
        return this.a.equals(p0o0Var.a) && this.b.equals(p0o0Var.b) && this.c == p0o0Var.c && this.d.equals(p0o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(cy30.d(Integer.hashCode(2131231039) * 31, 31, this.a), 31, this.b), 31, this.c);
    }
}
