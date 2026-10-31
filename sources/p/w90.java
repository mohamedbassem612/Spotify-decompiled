package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w90 {
    public final l62 a;
    public final int b;
    public final long c;

    public w90(l62 l62Var, int i, long j) {
        this.a = l62Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w90)) {
            return false;
        }
        w90 w90Var = (w90) obj;
        return this.a.equals(w90Var.a) && this.b == w90Var.b && this.c == w90Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
