package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rzw0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public rzw0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzw0)) {
            return false;
        }
        rzw0 rzw0Var = (rzw0) obj;
        return u890.j(this.a, rzw0Var.a) && u890.j(this.b, rzw0Var.b) && u890.j(this.c, rzw0Var.c) && this.d == rzw0Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
