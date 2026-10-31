package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class flj0 {
    public final elj0 a;
    public final boolean b = true;
    public final int c;

    public flj0(elj0 elj0Var, int i) {
        this.a = elj0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flj0)) {
            return false;
        }
        flj0 flj0Var = (flj0) obj;
        return u890.j(this.a, flj0Var.a) && this.b == flj0Var.b && this.c == flj0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
