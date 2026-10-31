package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nbn0 implements pbn0 {
    public final String a;
    public final String b;
    public final String c;
    public final u7h d;
    public final pjw0 e;

    public nbn0(String str, String str2, String str3, u7h u7hVar, pjw0 pjw0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u7hVar;
        this.e = pjw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbn0)) {
            return false;
        }
        nbn0 nbn0Var = (nbn0) obj;
        return u890.j(this.a, nbn0Var.a) && this.b.equals(nbn0Var.b) && u890.j(this.c, nbn0Var.c) && u890.j(this.d, nbn0Var.d) && this.e.equals(nbn0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        u7h u7hVar = this.d;
        return this.e.hashCode() + ((iHashCode + (u7hVar != null ? Long.hashCode(u7hVar.a) : 0)) * 31);
    }
}
