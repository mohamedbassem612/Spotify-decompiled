package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ul0 {
    public final int a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final lax f;

    public ul0(int i, String str, String str2, Boolean bool, Boolean bool2, lax laxVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = bool2;
        this.f = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul0)) {
            return false;
        }
        ul0 ul0Var = (ul0) obj;
        return this.a == ul0Var.a && u890.j(this.b, ul0Var.b) && u890.j(this.c, ul0Var.c) && u890.j(this.d, ul0Var.d) && u890.j(this.e, ul0Var.e) && this.f.equals(ul0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
        Boolean bool = this.d;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return this.f.hashCode() + ((iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }
}
