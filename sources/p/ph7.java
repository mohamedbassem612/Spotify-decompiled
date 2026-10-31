package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ph7 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final k4m e;
    public final int f;

    public ph7(String str, String str2, int i, String str3, k4m k4mVar, int i2, int i3) {
        str3 = (i3 & 8) != 0 ? null : str3;
        k4mVar = (i3 & 16) != 0 ? null : k4mVar;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = k4mVar;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph7)) {
            return false;
        }
        ph7 ph7Var = (ph7) obj;
        return u890.j(this.a, ph7Var.a) && u890.j(this.b, ph7Var.b) && this.c == ph7Var.c && u890.j(this.d, ph7Var.d) && this.e == ph7Var.e && this.f == ph7Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iK = ab80.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int iHashCode2 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        k4m k4mVar = this.e;
        int iHashCode3 = (iHashCode2 + (k4mVar == null ? 0 : k4mVar.hashCode())) * 31;
        int i = this.f;
        return iHashCode3 + (i != 0 ? l1d.C(i) : 0);
    }
}
