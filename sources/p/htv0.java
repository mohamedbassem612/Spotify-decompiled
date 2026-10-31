package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class htv0 {
    public final String a;
    public final doc b;
    public final boolean c;
    public final qp20 d;
    public final ave0 e;

    public htv0(String str, doc docVar, boolean z, qp20 qp20Var, ave0 ave0Var) {
        this.a = str;
        this.b = docVar;
        this.c = z;
        this.d = qp20Var;
        this.e = ave0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htv0)) {
            return false;
        }
        htv0 htv0Var = (htv0) obj;
        return u890.j(this.a, htv0Var.a) && this.b.equals(htv0Var.b) && this.c == htv0Var.c && u890.j(this.d, htv0Var.d) && this.e.equals(htv0Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c);
        qp20 qp20Var = this.d;
        return this.e.hashCode() + ((iG + (qp20Var != null ? qp20Var.hashCode() : 0)) * 31);
    }
}
