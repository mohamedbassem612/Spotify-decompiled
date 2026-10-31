package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class okb0 {
    public final String a;
    public final String b;
    public final String c;

    public okb0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okb0)) {
            return false;
        }
        okb0 okb0Var = (okb0) obj;
        return this.a.equals(okb0Var.a) && u890.j(this.b, okb0Var.b) && u890.j(this.c, okb0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
