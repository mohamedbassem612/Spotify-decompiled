package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bjs0 extends cjs0 {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final bro1 i;
    public final bro1 j;

    /* JADX WARN: Illegal instructions before constructor call */
    public bjs0(String str, String str2, String str3, String str4, boolean z, bro1 bro1Var, sis0 sis0Var) {
        boolean z2 = bro1Var instanceof tis0;
        tis0 tis0Var = z2 ? (tis0) bro1Var : null;
        boolean z3 = tis0Var != null ? tis0Var.b : false;
        tis0 tis0Var2 = z2 ? (tis0) bro1Var : null;
        super(z3, tis0Var2 != null ? tis0Var2.c : false, z2);
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = bro1Var;
        this.j = sis0Var;
    }

    @Override // p.cjs0
    public final String c() {
        return this.e;
    }

    @Override // p.cjs0
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjs0)) {
            return false;
        }
        bjs0 bjs0Var = (bjs0) obj;
        return u890.j(this.d, bjs0Var.d) && u890.j(this.e, bjs0Var.e) && u890.j(this.f, bjs0Var.f) && u890.j(this.g, bjs0Var.g) && this.h == bjs0Var.h && u890.j(this.i, bjs0Var.i) && u890.j(this.j, bjs0Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iG = xcg1.g(cy30.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, this.h);
        bro1 bro1Var = this.i;
        int iHashCode3 = (iG + (bro1Var == null ? 0 : bro1Var.hashCode())) * 31;
        bro1 bro1Var2 = this.j;
        return iHashCode3 + (bro1Var2 != null ? bro1Var2.hashCode() : 0);
    }

    public /* synthetic */ bjs0(String str, String str2, String str3, String str4, boolean z, bro1 bro1Var, int i) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : bro1Var, (sis0) null);
    }
}
