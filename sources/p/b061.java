package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b061 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final List g;
    public final ly31 h;
    public final List i;

    public b061(String str, String str2, String str3, String str4, int i, int i2, List list, ly31 ly31Var, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = list;
        this.h = ly31Var;
        this.i = list2;
    }

    public static b061 a(b061 b061Var, ly31 ly31Var, List list, int i) {
        String str = b061Var.a;
        String str2 = b061Var.b;
        String str3 = b061Var.c;
        String str4 = b061Var.d;
        int i2 = b061Var.e;
        int i3 = b061Var.f;
        List list2 = b061Var.g;
        if ((i & 128) != 0) {
            ly31Var = b061Var.h;
        }
        ly31 ly31Var2 = ly31Var;
        if ((i & 256) != 0) {
            list = b061Var.i;
        }
        return new b061(str, str2, str3, str4, i2, i3, list2, ly31Var2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b061)) {
            return false;
        }
        b061 b061Var = (b061) obj;
        return u890.j(this.a, b061Var.a) && u890.j(this.b, b061Var.b) && u890.j(this.c, b061Var.c) && u890.j(this.d, b061Var.d) && this.e == b061Var.e && this.f == b061Var.f && u890.j(this.g, b061Var.g) && u890.j(this.h, b061Var.h) && u890.j(this.i, b061Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + f4i1.b(kaa0.f(this.f, kaa0.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31, this.g)) * 31);
    }
}
