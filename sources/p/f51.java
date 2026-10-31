package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f51 extends x3p1 {
    public final int c;
    public final int d;

    public f51(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f51)) {
            return false;
        }
        f51 f51Var = (f51) obj;
        return this.c == f51Var.c && this.d == f51Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + (l1d.C(this.c) * 31);
    }

    public final int x() {
        return this.c;
    }

    public final int y() {
        return this.d;
    }
}
