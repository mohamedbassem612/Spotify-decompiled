package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rr71 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public rr71(String str, String str2, Integer num, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr71)) {
            return false;
        }
        rr71 rr71Var = (rr71) obj;
        return u890.j(this.a, rr71Var.a) && u890.j(this.b, rr71Var.b) && u890.j(this.c, rr71Var.c) && u890.j(this.d, rr71Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
