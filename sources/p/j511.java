package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j511 {
    public final String a;
    public final String b;
    public final o17 c;

    public j511(String str, String str2, o17 o17Var) {
        this.a = str;
        this.b = str2;
        this.c = o17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j511)) {
            return false;
        }
        j511 j511Var = (j511) obj;
        return this.a.equals(j511Var.a) && this.b.equals(j511Var.b) && u890.j(this.c, j511Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        o17 o17Var = this.c;
        return (iD + (o17Var == null ? 0 : o17Var.hashCode())) * 31;
    }
}
