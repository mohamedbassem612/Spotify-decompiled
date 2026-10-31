package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h9x0 extends w361 {
    public final int c;
    public final boolean d;

    public h9x0(int i, boolean z) {
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9x0)) {
            return false;
        }
        h9x0 h9x0Var = (h9x0) obj;
        return this.c == h9x0Var.c && this.d == h9x0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (l1d.C(this.c) * 31);
    }
}
