package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cv31 implements aw31 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public cv31(String str, String str2, int i, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv31)) {
            return false;
        }
        cv31 cv31Var = (cv31) obj;
        return this.a == cv31Var.a && u890.j(this.b, cv31Var.b) && u890.j(this.c, cv31Var.c) && u890.j(this.d, cv31Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final int p() {
        return this.a;
    }
}
