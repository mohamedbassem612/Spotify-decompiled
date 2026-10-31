package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z7i1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public z7i1(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7i1)) {
            return false;
        }
        z7i1 z7i1Var = (z7i1) obj;
        return u890.j(this.a, z7i1Var.a) && u890.j(this.b, z7i1Var.b) && u890.j(this.c, z7i1Var.c) && u890.j(this.d, z7i1Var.d) && u890.j(this.e, z7i1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
