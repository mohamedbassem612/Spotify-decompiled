package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ti50 {
    public final String a;
    public final String b;
    public final zks0 c;
    public final r4f d;
    public final c380 e;

    public ti50(String str, String str2, zks0 zks0Var, r4f r4fVar, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = zks0Var;
        this.d = r4fVar;
        this.e = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti50)) {
            return false;
        }
        ti50 ti50Var = (ti50) obj;
        return u890.j(this.a, ti50Var.a) && u890.j(this.b, ti50Var.b) && u890.j(this.c, ti50Var.c) && u890.j(this.d, ti50Var.d) && u890.j(this.e, ti50Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 961)) * 31)) * 31);
    }
}
