package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rr60 {
    public final wr30 a;
    public final boolean b;
    public final boolean c;

    public rr60(wr30 wr30Var, int i) {
        wr30Var = (i & 1) != 0 ? null : wr30Var;
        boolean z = (i & 2) != 0;
        boolean z2 = (i & 4) == 0;
        this.a = wr30Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr60)) {
            return false;
        }
        rr60 rr60Var = (rr60) obj;
        return u890.j(this.a, rr60Var.a) && this.b == rr60Var.b && this.c == rr60Var.c;
    }

    public final int hashCode() {
        wr30 wr30Var = this.a;
        return Boolean.hashCode(this.c) + xcg1.g((wr30Var == null ? 0 : wr30Var.hashCode()) * 31, 31, this.b);
    }
}
