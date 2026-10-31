package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class llb1 {
    public final ix21 a;
    public final ix21 b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ llb1(ix21 ix21Var, int i) {
        int i2 = i & 1;
        ix21 ix21Var2 = ix21.UNKNOWN;
        this(i2 != 0 ? ix21Var2 : ix21Var, ix21Var2, 4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llb1)) {
            return false;
        }
        llb1 llb1Var = (llb1) obj;
        return this.a == llb1Var.a && this.b == llb1Var.b && this.c == llb1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public llb1(ix21 ix21Var, ix21 ix21Var2, int i) {
        this.a = ix21Var;
        this.b = ix21Var2;
        this.c = i;
    }
}
