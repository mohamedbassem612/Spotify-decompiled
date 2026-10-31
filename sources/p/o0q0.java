package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o0q0 implements p0q0 {
    public final String a;
    public final String b;
    public final String c;
    public final j82 d;
    public final boolean e;

    public o0q0(String str, String str2, int i, String str3) {
        m0q0 m0q0Var = (i & 8) != 0 ? m0q0.d : l0q0.d;
        boolean z = (i & 16) == 0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = m0q0Var;
        this.e = z;
    }

    public final j82 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0q0)) {
            return false;
        }
        o0q0 o0q0Var = (o0q0) obj;
        return u890.j(this.a, o0q0Var.a) && u890.j(this.b, o0q0Var.b) && u890.j(this.c, o0q0Var.c) && this.d.equals(o0q0Var.d) && this.e == o0q0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }
}
