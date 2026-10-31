package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sqg1 {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public sqg1(String str, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqg1)) {
            return false;
        }
        sqg1 sqg1Var = (sqg1) obj;
        return this.a == sqg1Var.a && u890.j(this.b, sqg1Var.b) && this.c == sqg1Var.c && this.d == sqg1Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
