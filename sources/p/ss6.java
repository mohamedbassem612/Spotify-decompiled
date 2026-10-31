package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ss6 {
    public final String a;
    public final String b;
    public final String c;

    public ss6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss6)) {
            return false;
        }
        ss6 ss6Var = (ss6) obj;
        return this.a.equals(ss6Var.a) && this.b.equals(ss6Var.b) && u890.j(this.c, ss6Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
