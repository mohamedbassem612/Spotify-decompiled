package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nte1 {
    public final hux a;
    public final String b;
    public final mte1 c;

    public nte1(hux huxVar, String str, mte1 mte1Var) {
        this.a = huxVar;
        this.b = str;
        this.c = mte1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nte1)) {
            return false;
        }
        nte1 nte1Var = (nte1) obj;
        return this.a.equals(nte1Var.a) && this.b.equals(nte1Var.b) && u890.j(this.c, nte1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        mte1 mte1Var = this.c;
        return iD + (mte1Var == null ? 0 : mte1Var.a.hashCode());
    }
}
