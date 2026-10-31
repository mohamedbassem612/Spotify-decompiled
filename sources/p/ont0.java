package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ont0 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final aeo i;
    public final dw9 j;
    public final String k;
    public final m650 l;

    public ont0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, aeo aeoVar, dw9 dw9Var, String str9, m650 m650Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = aeoVar;
        this.j = dw9Var;
        this.k = str9;
        this.l = m650Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ont0)) {
            return false;
        }
        ont0 ont0Var = (ont0) obj;
        return this.a.equals(ont0Var.a) && this.b.equals(ont0Var.b) && this.c.equals(ont0Var.c) && this.d.equals(ont0Var.d) && this.e.equals(ont0Var.e) && this.f.equals(ont0Var.f) && this.g.equals(ont0Var.g) && this.h.equals(ont0Var.h) && this.i.equals(ont0Var.i) && this.j.equals(ont0Var.j) && u890.j(this.k, ont0Var.k) && u890.j(this.l, ont0Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + ((this.i.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31;
        String str = this.k;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        m650 m650Var = this.l;
        return iHashCode2 + (m650Var != null ? m650Var.hashCode() : 0);
    }
}
