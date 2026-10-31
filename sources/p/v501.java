package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v501 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;

    public v501(String str, String str2, Integer num, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v501)) {
            return false;
        }
        v501 v501Var = (v501) obj;
        return u890.j(this.a, v501Var.a) && u890.j(this.b, v501Var.b) && u890.j(this.c, v501Var.c) && u890.j(this.d, v501Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
