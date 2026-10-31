package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e6l1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public e6l1(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6l1)) {
            return false;
        }
        e6l1 e6l1Var = (e6l1) obj;
        return u890.j(this.a, e6l1Var.a) && u890.j(this.b, e6l1Var.b) && u890.j(this.c, e6l1Var.c) && u890.j(this.d, e6l1Var.d) && u890.j(this.e, e6l1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
