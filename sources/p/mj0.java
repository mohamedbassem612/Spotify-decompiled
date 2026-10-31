package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mj0 implements fq0 {
    public final ji0 a;
    public final ij0 b;
    public final List c;
    public final String d;
    public final gj0 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public mj0(ji0 ji0Var, ij0 ij0Var, List list, String str, gj0 gj0Var, String str2, String str3, String str4, String str5) {
        this.a = ji0Var;
        this.b = ij0Var;
        this.c = list;
        this.d = str;
        this.e = gj0Var;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
    }

    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj0)) {
            return false;
        }
        mj0 mj0Var = (mj0) obj;
        return this.a.equals(mj0Var.a) && this.b.equals(mj0Var.b) && this.c.equals(mj0Var.c) && u890.j(this.d, mj0Var.d) && this.e.equals(mj0Var.e) && u890.j(this.f, mj0Var.f) && u890.j(this.g, mj0Var.g) && u890.j(this.h, mj0Var.h) && u890.j(this.i, mj0Var.i);
    }

    public final String h() {
        return this.a.t;
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d(cy30.d(cy30.d((this.e.hashCode() + cy30.d(f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String k() {
        return this.a.h;
    }
}
