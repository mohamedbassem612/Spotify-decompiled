package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yr01 extends vxo1 {
    public final String c;
    public final String d;
    public final String e;

    public yr01(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr01)) {
            return false;
        }
        yr01 yr01Var = (yr01) obj;
        return u890.j(this.c, yr01Var.c) && this.d.equals(yr01Var.d) && u890.j(this.e, yr01Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
