package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xa7 {
    public final String a;
    public final String b;
    public final tv80 c;

    public xa7(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa7)) {
            return false;
        }
        xa7 xa7Var = (xa7) obj;
        return u890.j(this.a, xa7Var.a) && u890.j(this.b, xa7Var.b) && u890.j(this.c, xa7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tv80 tv80Var = this.c;
        return iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
