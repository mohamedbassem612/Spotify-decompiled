package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v8l1 {
    public final oi90 a;
    public final u6l1 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public v8l1(oi90 oi90Var, u6l1 u6l1Var, String str, String str2, String str3, String str4) {
        this.a = oi90Var;
        this.b = u6l1Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8l1)) {
            return false;
        }
        v8l1 v8l1Var = (v8l1) obj;
        return this.a.equals(v8l1Var.a) && u890.j(this.b, v8l1Var.b) && this.c.equals(v8l1Var.c) && this.d.equals(v8l1Var.d) && this.e.equals(v8l1Var.e) && u890.j(this.f, v8l1Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u6l1 u6l1Var = this.b;
        int iD = cy30.d(cy30.d(cy30.d((iHashCode + (u6l1Var == null ? 0 : u6l1Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
