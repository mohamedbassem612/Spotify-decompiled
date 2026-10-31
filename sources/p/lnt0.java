package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lnt0 {
    public final String a;
    public final String b;
    public final String c;
    public final n1x d;

    public lnt0(String str, String str2, String str3, n1x n1xVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = n1xVar;
    }

    public final n1x a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnt0)) {
            return false;
        }
        lnt0 lnt0Var = (lnt0) obj;
        return this.a.equals(lnt0Var.a) && u890.j(this.b, lnt0Var.b) && u890.j(this.c, lnt0Var.c) && u890.j(this.d, lnt0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n1x n1xVar = this.d;
        return iHashCode3 + (n1xVar != null ? n1xVar.hashCode() : 0);
    }
}
