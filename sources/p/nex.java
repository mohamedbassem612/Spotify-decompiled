package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nex extends qex {
    public final int b;

    public nex(int i) {
        super(new jgx(i), 0);
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nex) && this.b == ((nex) obj).b;
    }

    public final int hashCode() {
        return l1d.C(this.b);
    }

    public final String toString() {
        return "Contrasting(colorSet=" + rjx.E(this.b) + ")";
    }
}
