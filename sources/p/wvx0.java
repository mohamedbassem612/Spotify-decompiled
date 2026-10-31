package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wvx0 {
    public final String a;
    public final String b;

    public wvx0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvx0)) {
            return false;
        }
        wvx0 wvx0Var = (wvx0) obj;
        return u890.j(this.a, wvx0Var.a) && u890.j(this.b, wvx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
