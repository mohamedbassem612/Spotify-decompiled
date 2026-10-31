package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ib31 implements jb31 {
    public final ega1 a;
    public final int b;

    public ib31(ega1 ega1Var, int i) {
        this.a = ega1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib31)) {
            return false;
        }
        ib31 ib31Var = (ib31) obj;
        return this.a.equals(ib31Var.a) && this.b == ib31Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
