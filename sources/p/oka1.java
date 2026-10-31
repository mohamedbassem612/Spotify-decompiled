package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oka1 implements h020 {
    public final a080 a;
    public final String b;
    public final int c;

    public oka1(a080 a080Var, String str, int i) {
        this.a = a080Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oka1)) {
            return false;
        }
        oka1 oka1Var = (oka1) obj;
        return u890.j(this.a, oka1Var.a) && u890.j(this.b, oka1Var.b) && this.c == oka1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + eqq.y(this.c) + ')';
    }
}
