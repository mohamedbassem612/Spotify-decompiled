package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b9u0 {
    public final String a;
    public final String b;
    public final String c;

    public b9u0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9u0)) {
            return false;
        }
        b9u0 b9u0Var = (b9u0) obj;
        return this.a.equals(b9u0Var.a) && u890.j(this.b, b9u0Var.b) && u890.j(this.c, b9u0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
