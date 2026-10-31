package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f0e1 {
    public final af5 a;
    public af5 b;
    public boolean c = false;
    public csm0 d = null;

    public f0e1(af5 af5Var, af5 af5Var2) {
        this.a = af5Var;
        this.b = af5Var2;
    }

    public final csm0 a() {
        return this.d;
    }

    public final af5 b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0e1)) {
            return false;
        }
        f0e1 f0e1Var = (f0e1) obj;
        return u890.j(this.a, f0e1Var.a) && u890.j(this.b, f0e1Var.b) && this.c == f0e1Var.c && u890.j(this.d, f0e1Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        csm0 csm0Var = this.d;
        return iG + (csm0Var == null ? 0 : csm0Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + this.a + ", substitution=" + this.b + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
