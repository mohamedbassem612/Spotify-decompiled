package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i680 implements l680 {
    public final String a;
    public final String b;
    public final ls50 c;

    public i680(String str, String str2, ls50 ls50Var) {
        this.a = str;
        this.b = str2;
        this.c = ls50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i680)) {
            return false;
        }
        i680 i680Var = (i680) obj;
        return u890.j(this.a, i680Var.a) && u890.j(this.b, i680Var.b) && u890.j(this.c, i680Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        ls50 ls50Var = this.c;
        return iD + (ls50Var == null ? 0 : ls50Var.hashCode());
    }
}
