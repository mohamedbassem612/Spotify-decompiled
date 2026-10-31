package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ok1 {
    public final mk1 a;
    public final qk1 b;

    public ok1(mk1 mk1Var, qk1 qk1Var) {
        this.a = mk1Var;
        this.b = qk1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok1)) {
            return false;
        }
        ok1 ok1Var = (ok1) obj;
        return this.a.equals(ok1Var.a) && this.b == ok1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
