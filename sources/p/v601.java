package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v601 {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final int f;
    public final int g;
    public final boolean h;
    public final qpe1 i;

    public v601(String str, int i, String str2, String str3, List list, int i2, int i3, boolean z, qpe1 qpe1Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = qpe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v601)) {
            return false;
        }
        v601 v601Var = (v601) obj;
        return u890.j(this.a, v601Var.a) && this.b == v601Var.b && u890.j(this.c, v601Var.c) && u890.j(this.d, v601Var.d) && u890.j(this.e, v601Var.e) && this.f == v601Var.f && this.g == v601Var.g && this.h == v601Var.h && this.i == v601Var.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + xcg1.g(kaa0.f(this.g, kaa0.f(this.f, f4i1.b(cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31, this.h);
    }
}
