package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m67 {
    public final String a;
    public final String b;
    public final Boolean c;
    public final Integer d;
    public final String e;
    public final long f;
    public final long g;

    public m67(String str, String str2, Boolean bool, Integer num, String str3, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = bool;
        this.d = num;
        this.e = str3;
        this.f = j;
        this.g = j2;
    }

    public final int a() {
        if (this.c != null) {
            return 1;
        }
        if (this.d != null) {
            return 2;
        }
        return this.e != null ? 3 : 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m67)) {
            return false;
        }
        m67 m67Var = (m67) obj;
        return u890.j(this.a, m67Var.a) && u890.j(this.b, m67Var.b) && u890.j(this.c, m67Var.c) && u890.j(this.d, m67Var.d) && u890.j(this.e, m67Var.e) && this.f == m67Var.f && this.g == m67Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Boolean bool = this.c;
        int iHashCode = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        return Long.hashCode(this.g) + cy30.f((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, this.f, 31);
    }
}
