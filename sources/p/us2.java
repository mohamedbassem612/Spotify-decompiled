package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class us2 {
    public final String a;
    public final Boolean b;
    public final String c;
    public final Integer d;

    public us2(String str, Boolean bool, String str2, Integer num) {
        this.a = str;
        this.b = bool;
        this.c = str2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us2)) {
            return false;
        }
        us2 us2Var = (us2) obj;
        return u890.j(this.a, us2Var.a) && this.b.equals(us2Var.b) && u890.j(this.c, us2Var.c) && u890.j(this.d, us2Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
