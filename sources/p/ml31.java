package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ml31 {
    public final vnr0 a;
    public final boolean b;
    public final vnr0 c;
    public final int d;
    public final ll31 e;
    public final float f;
    public final boolean g;
    public final String h;
    public final dzo1 i;

    public ml31(vnr0 vnr0Var, boolean z, vnr0 vnr0Var2, int i, ll31 ll31Var, float f, boolean z2, String str, dzo1 dzo1Var) {
        this.a = vnr0Var;
        this.b = z;
        this.c = vnr0Var2;
        this.d = i;
        this.e = ll31Var;
        this.f = f;
        this.g = z2;
        this.h = str;
        this.i = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml31)) {
            return false;
        }
        ml31 ml31Var = (ml31) obj;
        return this.a.equals(ml31Var.a) && this.b == ml31Var.b && this.c.equals(ml31Var.c) && this.d == ml31Var.d && this.e.equals(ml31Var.e) && p3v.c(this.f, ml31Var.f) && this.g == ml31Var.g && u890.j(this.h, ml31Var.h) && this.i.equals(ml31Var.i);
    }

    public final int hashCode() {
        int iG = xcg1.g(x0d.f((this.e.hashCode() + kaa0.f(this.d, (this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b)) * 31, 31)) * 31, 31, this.f), 31, this.g);
        String str = this.h;
        return this.i.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
