package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wju0 {
    public final String a;
    public final String b;
    public final String c;

    public wju0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wju0)) {
            return false;
        }
        wju0 wju0Var = (wju0) obj;
        return u890.j(this.a, wju0Var.a) && u890.j(this.b, wju0Var.b) && u890.j(this.c, wju0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
