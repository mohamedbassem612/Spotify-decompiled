package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z981 {
    public final String a;
    public final String b;
    public final String c;

    public z981(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z981)) {
            return false;
        }
        z981 z981Var = (z981) obj;
        return u890.j(this.a, z981Var.a) && this.b.equals(z981Var.b) && u890.j(this.c, z981Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
