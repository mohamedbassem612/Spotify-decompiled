package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zc20 extends o1p1 {
    public final String c;
    public final String d;
    public final int e = 1;
    public final String f;

    public zc20(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc20)) {
            return false;
        }
        zc20 zc20Var = (zc20) obj;
        return u890.j(this.c, zc20Var.c) && u890.j(this.d, zc20Var.d) && this.e == zc20Var.e && u890.j(this.f, zc20Var.f);
    }

    public final int hashCode() {
        int iK = ab80.k(this.e, cy30.d(this.c.hashCode() * 31, 31, this.d), 31);
        String str = this.f;
        return iK + (str == null ? 0 : str.hashCode());
    }
}
