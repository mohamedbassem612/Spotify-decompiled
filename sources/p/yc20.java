package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yc20 extends o1p1 {
    public final String c;
    public final String d;
    public final int e = 1;
    public final c9 f;
    public final String g;

    public yc20(String str, String str2, c9 c9Var, String str3) {
        this.c = str;
        this.d = str2;
        this.f = c9Var;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc20)) {
            return false;
        }
        yc20 yc20Var = (yc20) obj;
        return u890.j(this.c, yc20Var.c) && u890.j(this.d, yc20Var.d) && this.e == yc20Var.e && this.f.equals(yc20Var.f) && u890.j(this.g, yc20Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ab80.k(this.e, cy30.d(this.c.hashCode() * 31, 31, this.d), 31)) * 31;
        String str = this.g;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
