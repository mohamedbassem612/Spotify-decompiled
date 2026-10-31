package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u910 {
    public final s630 a;
    public final fcl b;
    public final boolean c;
    public final String d;

    public u910(s630 s630Var, fcl fclVar, boolean z, String str) {
        this.a = s630Var;
        this.b = fclVar;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u910)) {
            return false;
        }
        u910 u910Var = (u910) obj;
        return this.a.equals(u910Var.a) && this.b.equals(u910Var.b) && this.c == u910Var.c && u890.j(this.d, u910Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.b.hashCode() + (Boolean.hashCode(this.a.a) * 31)) * 31, 31, this.c);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
