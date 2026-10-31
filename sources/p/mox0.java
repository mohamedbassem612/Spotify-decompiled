package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mox0 {
    public final String a;
    public final String b;
    public final m87 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final ykm k;

    public mox0(String str, String str2, m87 m87Var, String str3, String str4, String str5, String str6, String str7, String str8, String str9, ykm ykmVar) {
        this.a = str;
        this.b = str2;
        this.c = m87Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = ykmVar;
    }

    public final String a() {
        return this.f;
    }

    public final boolean b() {
        ykm ykmVar = this.k;
        String str = ykmVar != null ? ykmVar.a : null;
        String str2 = this.h;
        if (u890.j(str2, str)) {
            return true;
        }
        return u890.j(str2, ykmVar != null ? ykmVar.b : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mox0)) {
            return false;
        }
        mox0 mox0Var = (mox0) obj;
        return u890.j(this.a, mox0Var.a) && this.b.equals(mox0Var.b) && this.c.equals(mox0Var.c) && this.d.equals(mox0Var.d) && this.e.equals(mox0Var.e) && this.f.equals(mox0Var.f) && this.g.equals(mox0Var.g) && u890.j(this.h, mox0Var.h) && this.i.equals(mox0Var.i) && u890.j(this.j, mox0Var.j) && u890.j(this.k, mox0Var.k);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        int iD2 = cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.i);
        String str2 = this.j;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ykm ykmVar = this.k;
        return iHashCode + (ykmVar != null ? ykmVar.hashCode() : 0);
    }
}
