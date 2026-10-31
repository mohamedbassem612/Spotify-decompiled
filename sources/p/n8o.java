package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n8o extends buo1 {
    public final pl3 b;

    public n8o(pl3 pl3Var) {
        this.b = pl3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8o) && u890.j(this.b, ((n8o) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final int r(int i, int i2, flb0 flb0Var, q5t0 q5t0Var, int i3) {
        return this.b.c(i2, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.b + ")";
    }
}
