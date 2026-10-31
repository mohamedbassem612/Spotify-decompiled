package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nyv0 {
    public final String a;
    public final String b;
    public final String c;

    public nyv0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyv0)) {
            return false;
        }
        nyv0 nyv0Var = (nyv0) obj;
        return u890.j(this.a, nyv0Var.a) && u890.j(this.b, nyv0Var.b) && u890.j(this.c, nyv0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
