package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s46 implements t46 {
    public final String a;
    public final String b;
    public final String c;

    public s46(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s46)) {
            return false;
        }
        s46 s46Var = (s46) obj;
        return this.a.equals(s46Var.a) && this.b.equals(s46Var.b) && u890.j(this.c, s46Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
