package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class no90 {
    public final int a;
    public final lo90 b;
    public final oo90 c;

    public no90(int i, lo90 lo90Var, oo90 oo90Var) {
        this.a = i;
        this.b = lo90Var;
        this.c = oo90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no90)) {
            return false;
        }
        no90 no90Var = (no90) obj;
        return this.a == no90Var.a && this.b.equals(no90Var.b) && this.c.equals(no90Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c.a) + xcg1.g(l1d.C(this.a) * 31, 31, this.b.a);
    }
}
