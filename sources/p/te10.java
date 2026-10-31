package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class te10 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public te10(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te10)) {
            return false;
        }
        te10 te10Var = (te10) obj;
        return u890.j(this.a, te10Var.a) && this.b.equals(te10Var.b) && u890.j(this.c, te10Var.c) && this.d == te10Var.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
