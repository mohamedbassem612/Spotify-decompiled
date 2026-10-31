package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zju0 implements aku0 {
    public final String a;
    public final String b;
    public final String c;

    public zju0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zju0)) {
            return false;
        }
        zju0 zju0Var = (zju0) obj;
        return u890.j(this.a, zju0Var.a) && u890.j(this.b, zju0Var.b) && u890.j(this.c, zju0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
