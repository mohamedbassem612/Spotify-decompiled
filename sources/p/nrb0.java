package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nrb0 {
    public final int a;
    public final int b;

    public nrb0(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            tf80.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        tf80.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrb0)) {
            return false;
        }
        nrb0 nrb0Var = (nrb0) obj;
        return this.a == nrb0Var.a && this.b == nrb0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return l1d.j(this.a, this.b, "Interval(start=", ", end=", ")");
    }
}
