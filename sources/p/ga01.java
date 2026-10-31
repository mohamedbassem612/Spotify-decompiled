package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ga01 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public ga01(int i, String str, String str2, boolean z) {
        str2 = (i & 2) != 0 ? null : str2;
        z = (i & 4) != 0 ? false : z;
        boolean z2 = (i & 8) == 0;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga01)) {
            return false;
        }
        ga01 ga01Var = (ga01) obj;
        return u890.j(this.a, ga01Var.a) && u890.j(this.b, ga01Var.b) && this.c == ga01Var.c && this.d == ga01Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
