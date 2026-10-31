package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ebi0 {
    public final har0 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ebi0(har0 har0Var, boolean z, boolean z2, boolean z3, int i) {
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        this.a = har0Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebi0)) {
            return false;
        }
        ebi0 ebi0Var = (ebi0) obj;
        return this.a.equals(ebi0Var.a) && this.b == ebi0Var.b && this.c == ebi0Var.c && this.d == ebi0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(Integer.hashCode(this.a.a) * 31, 31, false), 31, false), 31, this.b), 31, this.c);
    }
}
