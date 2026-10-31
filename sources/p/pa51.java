package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pa51 {
    public final String a;
    public final boolean b;
    public final oa51 c;
    public final int d;
    public final na51 e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public pa51(String str, boolean z, oa51 oa51Var, int i, na51 na51Var, String str2, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = oa51Var;
        this.d = i;
        this.e = na51Var;
        this.f = str2;
        this.g = z2;
        this.h = z3;
    }

    public final int a() {
        return this.d;
    }

    public final String b() {
        return this.f;
    }

    public final na51 c() {
        return this.e;
    }

    public final oa51 d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa51)) {
            return false;
        }
        pa51 pa51Var = (pa51) obj;
        return u890.j(this.a, pa51Var.a) && this.b == pa51Var.b && this.c == pa51Var.c && this.d == pa51Var.d && this.e == pa51Var.e && this.f.equals(pa51Var.f) && this.g == pa51Var.g && this.h == pa51Var.h;
    }

    public final boolean f() {
        return this.b;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.h) + xcg1.g(cy30.d((this.e.hashCode() + ab80.k(this.d, (this.c.hashCode() + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31, 31)) * 31, 31, this.f), 31, this.g);
    }
}
