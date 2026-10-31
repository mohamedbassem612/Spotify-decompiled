package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class py90 {
    public final String a;
    public final ew90 b;
    public final int c;
    public final int d;

    public py90(String str, ew90 ew90Var, int i, int i2) {
        this.a = str;
        this.b = ew90Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py90)) {
            return false;
        }
        py90 py90Var = (py90) obj;
        return u890.j(this.a, py90Var.a) && this.b.equals(py90Var.b) && this.c == py90Var.c && this.d == py90Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + kaa0.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
