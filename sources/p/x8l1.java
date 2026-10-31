package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x8l1 {
    public final ii90 a;
    public final v6l1 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public x8l1(ii90 ii90Var, v6l1 v6l1Var, String str, String str2, String str3, String str4) {
        this.a = ii90Var;
        this.b = v6l1Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8l1)) {
            return false;
        }
        x8l1 x8l1Var = (x8l1) obj;
        return this.a.equals(x8l1Var.a) && u890.j(this.b, x8l1Var.b) && u890.j(this.c, x8l1Var.c) && this.d.equals(x8l1Var.d) && this.e.equals(x8l1Var.e) && u890.j(this.f, x8l1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        v6l1 v6l1Var = this.b;
        int iD = cy30.d(cy30.d(cy30.d((iHashCode + (v6l1Var == null ? 0 : v6l1Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
