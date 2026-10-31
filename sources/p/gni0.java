package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gni0 implements le90 {
    public final String a;
    public final String b;
    public final String c;
    public final eni0 d;
    public final eni0 e;
    public final boolean f;
    public final l371 g;
    public final int h;

    public gni0(String str, String str2, String str3, eni0 eni0Var, eni0 eni0Var2, boolean z, l371 l371Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = eni0Var;
        this.e = eni0Var2;
        this.f = z;
        this.g = l371Var;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gni0)) {
            return false;
        }
        gni0 gni0Var = (gni0) obj;
        return this.a.equals(gni0Var.a) && this.b.equals(gni0Var.b) && this.c.equals(gni0Var.c) && this.d.equals(gni0Var.d) && this.e.equals(gni0Var.e) && this.f == gni0Var.f && this.g.equals(gni0Var.g) && this.h == gni0Var.h;
    }

    public final int hashCode() {
        return l1d.C(this.h) + ((this.g.hashCode() + xcg1.g((this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f)) * 31);
    }
}
