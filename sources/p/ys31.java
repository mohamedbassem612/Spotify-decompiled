package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ys31 {
    public final String a;
    public final String b;
    public final h7r c;
    public final ohe0 d;

    public ys31(String str, String str2, h7r h7rVar, ohe0 ohe0Var) {
        this.a = str;
        this.b = str2;
        this.c = h7rVar;
        this.d = ohe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys31)) {
            return false;
        }
        ys31 ys31Var = (ys31) obj;
        return u890.j(this.a, ys31Var.a) && this.b.equals(ys31Var.b) && u890.j(this.c, ys31Var.c) && u890.j(this.d, ys31Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        h7r h7rVar = this.c;
        int iHashCode = (iD + (h7rVar == null ? 0 : h7rVar.hashCode())) * 31;
        ohe0 ohe0Var = this.d;
        return iHashCode + (ohe0Var != null ? ohe0Var.hashCode() : 0);
    }
}
