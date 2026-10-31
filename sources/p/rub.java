package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rub extends lvx {
    public final String d;
    public final boolean e;
    public final t7q0 f;
    public final boolean g;
    public final boolean h;

    public rub(String str, boolean z, t7q0 t7q0Var, boolean z2, boolean z3) {
        this.d = str;
        this.e = z;
        this.f = t7q0Var;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rub)) {
            return false;
        }
        rub rubVar = (rub) obj;
        return u890.j(this.d, rubVar.d) && this.e == rubVar.e && u890.j(this.f, rubVar.f) && this.g == rubVar.g && this.h == rubVar.h;
    }

    public final int hashCode() {
        int iG = xcg1.g(this.d.hashCode() * 31, 31, this.e);
        t7q0 t7q0Var = this.f;
        return Boolean.hashCode(this.h) + xcg1.g((iG + (t7q0Var == null ? 0 : t7q0Var.hashCode())) * 31, 31, this.g);
    }
}
