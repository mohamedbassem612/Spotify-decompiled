package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iwq0 extends t3k1 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public iwq0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwq0)) {
            return false;
        }
        iwq0 iwq0Var = (iwq0) obj;
        return this.b.equals(iwq0Var.b) && this.c.equals(iwq0Var.c) && u890.j(this.d, iwq0Var.d) && u890.j(this.e, iwq0Var.e) && u890.j(this.f, iwq0Var.f) && u890.j(this.g, iwq0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
