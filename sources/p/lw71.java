package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lw71 {
    public final String a;
    public final String b;
    public final cqf c;
    public final long d;

    public lw71(String str, String str2, cqf cqfVar, long j) {
        this.a = str;
        this.b = str2;
        this.c = cqfVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw71)) {
            return false;
        }
        lw71 lw71Var = (lw71) obj;
        return this.a.equals(lw71Var.a) && u890.j(this.b, lw71Var.b) && this.c == lw71Var.c && this.d == lw71Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
