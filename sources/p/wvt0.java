package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wvt0 implements gwt0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public wvt0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvt0)) {
            return false;
        }
        wvt0 wvt0Var = (wvt0) obj;
        return u890.j(this.a, wvt0Var.a) && u890.j(this.b, wvt0Var.b) && u890.j(this.c, wvt0Var.c) && this.d == wvt0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
