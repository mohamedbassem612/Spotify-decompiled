package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class diz {
    public final String a;
    public final int b;
    public final String c;
    public final sg90 d;
    public final boolean e;

    public diz(String str, int i, String str2, sg90 sg90Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = sg90Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diz)) {
            return false;
        }
        diz dizVar = (diz) obj;
        return u890.j(this.a, dizVar.a) && this.b == dizVar.b && u890.j(this.c, dizVar.c) && u890.j(this.d, dizVar.d) && this.e == dizVar.e;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        sg90 sg90Var = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (sg90Var != null ? sg90Var.hashCode() : 0)) * 31);
    }
}
