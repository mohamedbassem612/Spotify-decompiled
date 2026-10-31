package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ohe0 {
    public final String a;
    public final iie0 b;
    public final String c;

    public ohe0(String str, iie0 iie0Var, String str2) {
        this.a = str;
        this.b = iie0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohe0)) {
            return false;
        }
        ohe0 ohe0Var = (ohe0) obj;
        return this.a.equals(ohe0Var.a) && this.b.equals(ohe0Var.b) && u890.j(this.c, ohe0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
