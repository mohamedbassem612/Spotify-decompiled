package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final hy50 e;

    public z2(String str, String str2, String str3, String str4, hy50 hy50Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hy50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return this.a.equals(z2Var.a) && this.b.equals(z2Var.b) && this.c.equals(z2Var.c) && u890.j(this.d, z2Var.d) && this.e.equals(z2Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
