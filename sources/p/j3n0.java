package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class j3n0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public j3n0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3n0)) {
            return false;
        }
        j3n0 j3n0Var = (j3n0) obj;
        return this.a.equals(j3n0Var.a) && this.b.equals(j3n0Var.b) && u890.j(this.c, j3n0Var.c) && this.d.equals(j3n0Var.d) && this.e == j3n0Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }
}
