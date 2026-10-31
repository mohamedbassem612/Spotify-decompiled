package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ny7 {
    public final ju7 a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Integer e;
    public final String f;
    public final boolean g;

    public ny7(ju7 ju7Var, String str, String str2, boolean z, Integer num, String str3, int i) {
        str2 = (i & 4) != 0 ? null : str2;
        z = (i & 8) != 0 ? true : z;
        num = (i & 16) != 0 ? null : num;
        str3 = (i & 32) != 0 ? null : str3;
        boolean z2 = (i & 64) != 0;
        this.a = ju7Var;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = num;
        this.f = str3;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny7)) {
            return false;
        }
        ny7 ny7Var = (ny7) obj;
        return this.a.equals(ny7Var.a) && this.b.equals(ny7Var.b) && u890.j(this.c, ny7Var.c) && this.d == ny7Var.d && u890.j(this.e, ny7Var.e) && u890.j(this.f, ny7Var.f) && this.g == ny7Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iG = xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        int iHashCode = (iG + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
