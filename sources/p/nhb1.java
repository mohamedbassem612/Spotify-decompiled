package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nhb1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final izh1 f;
    public final vzh1 g;

    public nhb1(String str, String str2, String str3, String str4, boolean z, izh1 izh1Var, vzh1 vzh1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = izh1Var;
        this.g = vzh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhb1)) {
            return false;
        }
        nhb1 nhb1Var = (nhb1) obj;
        return u890.j(this.a, nhb1Var.a) && u890.j(this.b, nhb1Var.b) && u890.j(this.c, nhb1Var.c) && u890.j(this.d, nhb1Var.d) && this.e == nhb1Var.e && u890.j(this.f, nhb1Var.f) && u890.j(this.g, nhb1Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (this.f.hashCode() + xcg1.g((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31;
        vzh1 vzh1Var = this.g;
        return iHashCode + (vzh1Var != null ? vzh1Var.hashCode() : 0);
    }

    public /* synthetic */ nhb1(String str, String str2, String str3, String str4, boolean z, izh1 izh1Var, int i) {
        this(str, str2, str3, str4, z, (i & 32) != 0 ? fzh1.a : izh1Var, (vzh1) null);
    }
}
