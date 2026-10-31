package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class re6 implements se6 {
    public final le6 a;
    public final gj6 b;

    public re6(le6 le6Var, gj6 gj6Var) {
        this.a = le6Var;
        this.b = gj6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof re6) {
            re6 re6Var = (re6) obj;
            if (this.a == re6Var.a && this.b.equals(re6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
