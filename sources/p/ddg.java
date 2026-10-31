package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ddg extends edg {
    public final String a;
    public final x4i1 b;
    public final String c;
    public final boolean d;

    public ddg(String str, x4i1 x4i1Var, String str2, boolean z) {
        this.a = str;
        this.b = x4i1Var;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddg)) {
            return false;
        }
        ddg ddgVar = (ddg) obj;
        return u890.j(this.a, ddgVar.a) && this.b.equals(ddgVar.b) && u890.j(this.c, ddgVar.c) && this.d == ddgVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
