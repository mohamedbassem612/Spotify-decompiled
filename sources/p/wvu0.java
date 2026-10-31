package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wvu0 {
    public final String a;
    public final String b;
    public final String c;

    public wvu0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvu0)) {
            return false;
        }
        wvu0 wvu0Var = (wvu0) obj;
        return this.a.equals(wvu0Var.a) && this.b.equals(wvu0Var.b) && u890.j(this.c, wvu0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
