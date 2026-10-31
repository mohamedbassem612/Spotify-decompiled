package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q08 {
    public final String a;
    public final String b;
    public final i08 c;
    public final qtt0 d;
    public final x4p1 e;

    public q08(String str, String str2, i08 i08Var, qtt0 qtt0Var, x4p1 x4p1Var) {
        this.a = str;
        this.b = str2;
        this.c = i08Var;
        this.d = qtt0Var;
        this.e = x4p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q08)) {
            return false;
        }
        q08 q08Var = (q08) obj;
        return u890.j(this.a, q08Var.a) && u890.j(this.b, q08Var.b) && u890.j(this.c, q08Var.c) && this.d == q08Var.d && this.e.equals(q08Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i08 i08Var = this.c;
        int iHashCode3 = (iHashCode2 + (i08Var == null ? 0 : i08Var.hashCode())) * 31;
        qtt0 qtt0Var = this.d;
        return this.e.hashCode() + ((iHashCode3 + (qtt0Var != null ? qtt0Var.hashCode() : 0)) * 31);
    }
}
