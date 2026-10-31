package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ww6 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public ww6(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww6)) {
            return false;
        }
        ww6 ww6Var = (ww6) obj;
        return u890.j(this.a, ww6Var.a) && this.b.equals(ww6Var.b) && u890.j(this.c, ww6Var.c) && this.d == ww6Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
