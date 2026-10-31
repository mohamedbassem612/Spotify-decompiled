package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pmh0 {
    public final String a;
    public final String b;
    public final ppl c;
    public final boolean d;
    public final w4i1 e;

    public pmh0(String str, String str2, ppl pplVar, boolean z, w4i1 w4i1Var) {
        this.a = str;
        this.b = str2;
        this.c = pplVar;
        this.d = z;
        this.e = w4i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmh0)) {
            return false;
        }
        pmh0 pmh0Var = (pmh0) obj;
        return u890.j(this.a, pmh0Var.a) && u890.j(this.b, pmh0Var.b) && this.c.equals(pmh0Var.c) && this.d == pmh0Var.d && u890.j(this.e, pmh0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }
}
