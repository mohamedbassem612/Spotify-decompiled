package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dju0 implements kju0 {
    public final String a;
    public final String b;
    public final int c;
    public final zxc0 d;

    public dju0(String str, String str2, int i, zxc0 zxc0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = zxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dju0)) {
            return false;
        }
        dju0 dju0Var = (dju0) obj;
        return u890.j(this.a, dju0Var.a) && u890.j(this.b, dju0Var.b) && this.c == dju0Var.c && u890.j(this.d, dju0Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        zxc0 zxc0Var = this.d;
        return iF + (zxc0Var == null ? 0 : zxc0Var.hashCode());
    }
}
