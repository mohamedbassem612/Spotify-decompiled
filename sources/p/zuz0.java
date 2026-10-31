package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zuz0 {
    public final String a;
    public final boolean b;
    public final int c;
    public final Boolean d;
    public final Boolean e;

    public zuz0(String str, boolean z, int i, Boolean bool, Boolean bool2) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = bool;
        this.e = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zuz0)) {
            return false;
        }
        zuz0 zuz0Var = (zuz0) obj;
        return u890.j(this.a, zuz0Var.a) && this.b == zuz0Var.b && this.c == zuz0Var.c && u890.j(this.d, zuz0Var.d) && this.e.equals(zuz0Var.e);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
        Boolean bool = this.d;
        return this.e.hashCode() + ((iF + (bool == null ? 0 : bool.hashCode())) * 31);
    }
}
