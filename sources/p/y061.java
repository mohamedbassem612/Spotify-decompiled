package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y061 {
    public final int a;
    public final int b;

    public y061(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y061)) {
            return false;
        }
        y061 y061Var = (y061) obj;
        return this.a == y061Var.a && this.b == y061Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (l1d.C(this.a) * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + xvj1.y(this.a) + ", endAffinity=" + xvj1.y(this.b) + ")";
    }

    public y061(int i) {
        this(i, i);
    }
}
