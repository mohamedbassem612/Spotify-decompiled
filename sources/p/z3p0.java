package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z3p0 {
    public final String a;
    public final String b;
    public final String c;

    public z3p0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3p0)) {
            return false;
        }
        z3p0 z3p0Var = (z3p0) obj;
        return this.a.equals(z3p0Var.a) && this.b.equals(z3p0Var.b) && this.c.equals(z3p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
