package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zxm0 {
    public final String a;
    public final if5 b;
    public final String c;
    public final boolean d;
    public final gbx e;
    public final iu30 f;
    public final lax g;
    public final boolean h;
    public final boolean i;

    public zxm0(String str, if5 if5Var, String str2, boolean z, gbx gbxVar, iu30 iu30Var, lax laxVar, boolean z2, boolean z3) {
        this.a = str;
        this.b = if5Var;
        this.c = str2;
        this.d = z;
        this.e = gbxVar;
        this.f = iu30Var;
        this.g = laxVar;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxm0)) {
            return false;
        }
        zxm0 zxm0Var = (zxm0) obj;
        return u890.j(this.a, zxm0Var.a) && this.b.equals(zxm0Var.b) && u890.j(this.c, zxm0Var.c) && this.d == zxm0Var.d && this.e.equals(zxm0Var.e) && u890.j(this.f, zxm0Var.f) && u890.j(this.g, zxm0Var.g) && this.h == zxm0Var.h && this.i == zxm0Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(this.i) + xcg1.g((this.g.hashCode() + ktd.g(this.f, (this.e.hashCode() + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31)) * 31, 31, this.h);
    }
}
