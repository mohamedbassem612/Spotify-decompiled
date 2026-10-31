package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iu60 extends ru60 {
    public final int a;
    public final np21 b;

    public iu60(int i, np21 np21Var) {
        this.a = i;
        this.b = np21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu60)) {
            return false;
        }
        iu60 iu60Var = (iu60) obj;
        return this.a == iu60Var.a && u890.j(this.b, iu60Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        np21 np21Var = this.b;
        return iC + (np21Var == null ? 0 : np21Var.hashCode());
    }
}
