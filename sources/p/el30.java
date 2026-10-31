package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class el30 {
    public static final dl30 Companion = new dl30();
    public static final znb0[] f = {dm5.S(2, bc30.c), null, null, null, null};
    public final gl30 a;
    public final String b;
    public final String c;
    public final String d;
    public final bl30 e;

    public /* synthetic */ el30(int i, gl30 gl30Var, String str, String str2, String str3, bl30 bl30Var) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, cl30.a.getDescriptor());
            throw null;
        }
        this.a = gl30Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bl30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el30)) {
            return false;
        }
        el30 el30Var = (el30) obj;
        return this.a == el30Var.a && u890.j(this.b, el30Var.b) && u890.j(this.c, el30Var.c) && u890.j(this.d, el30Var.d) && u890.j(this.e, el30Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public el30(gl30 gl30Var, String str, String str2, String str3, bl30 bl30Var) {
        this.a = gl30Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bl30Var;
    }
}
