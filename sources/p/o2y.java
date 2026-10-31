package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o2y {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final rpu e;
    public final boolean f;
    public final ou80 g;
    public final boolean h;

    public o2y(String str, boolean z, boolean z2, boolean z3, rpu rpuVar, boolean z4, ou80 ou80Var, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = rpuVar;
        this.f = z4;
        this.g = ou80Var;
        this.h = z5;
    }

    public static o2y a(o2y o2yVar, String str, boolean z, rpu rpuVar, boolean z2, ou80 ou80Var, int i) {
        if ((i & 1) != 0) {
            str = o2yVar.a;
        }
        String str2 = str;
        boolean z3 = (i & 2) != 0 ? o2yVar.b : false;
        boolean z4 = (i & 4) != 0 ? o2yVar.c : true;
        if ((i & 8) != 0) {
            z = o2yVar.d;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            rpuVar = o2yVar.e;
        }
        rpu rpuVar2 = rpuVar;
        if ((i & 32) != 0) {
            z2 = o2yVar.f;
        }
        boolean z6 = z2;
        if ((i & 64) != 0) {
            ou80Var = o2yVar.g;
        }
        return new o2y(str2, z3, z4, z5, rpuVar2, z6, ou80Var, (i & 128) != 0 ? o2yVar.h : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2y)) {
            return false;
        }
        o2y o2yVar = (o2y) obj;
        return u890.j(this.a, o2yVar.a) && this.b == o2yVar.b && this.c == o2yVar.c && this.d == o2yVar.d && this.e == o2yVar.e && this.f == o2yVar.f && u890.j(this.g, o2yVar.g) && this.h == o2yVar.h;
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(xcg1.g(xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        rpu rpuVar = this.e;
        int iG2 = xcg1.g((iG + (rpuVar == null ? 0 : rpuVar.hashCode())) * 31, 31, this.f);
        ou80 ou80Var = this.g;
        return Boolean.hashCode(this.h) + ((iG2 + (ou80Var != null ? ou80Var.a.hashCode() : 0)) * 31);
    }
}
