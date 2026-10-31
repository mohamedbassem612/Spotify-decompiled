package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class taj1 implements fq0 {
    public final fq0 a;
    public final String b;
    public final raj1 c;
    public final saj1 d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public taj1(fq0 fq0Var, String str, raj1 raj1Var, saj1 saj1Var, List list, String str2, String str3, String str4, String str5) {
        this.a = fq0Var;
        this.b = str;
        this.c = raj1Var;
        this.d = saj1Var;
        this.e = list;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final String a() {
        return this.a.a();
    }

    public final saj1 c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taj1)) {
            return false;
        }
        taj1 taj1Var = (taj1) obj;
        return u890.j(this.a, taj1Var.a) && u890.j(this.b, taj1Var.b) && this.c.equals(taj1Var.c) && this.d.equals(taj1Var.d) && u890.j(this.e, taj1Var.e) && u890.j(this.f, taj1Var.f) && u890.j(this.g, taj1Var.g) && u890.j(this.h, taj1Var.h) && u890.j(this.i, taj1Var.i);
    }

    public final String h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.d(cy30.d(f4i1.b((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String k() {
        return this.a.k();
    }
}
