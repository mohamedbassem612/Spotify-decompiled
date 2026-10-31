package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ez6 {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;

    public ez6(String str, String str2, String str3, Integer num, Integer num2, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = num2;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez6)) {
            return false;
        }
        ez6 ez6Var = (ez6) obj;
        return u890.j(this.a, ez6Var.a) && this.b.equals(ez6Var.b) && u890.j(this.c, ez6Var.c) && u890.j(this.d, ez6Var.d) && u890.j(this.e, ez6Var.e) && u890.j(this.f, ez6Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
