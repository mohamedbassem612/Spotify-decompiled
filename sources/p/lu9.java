package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lu9 {
    public final String a;
    public final String b;
    public final String c;

    public lu9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu9)) {
            return false;
        }
        lu9 lu9Var = (lu9) obj;
        return u890.j(this.a, lu9Var.a) && u890.j(this.b, lu9Var.b) && u890.j(this.c, lu9Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
