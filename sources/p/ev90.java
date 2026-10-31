package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ev90 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final yu90 f;

    public ev90(String str, String str2, int i, int i2, int i3, yu90 yu90Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = yu90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev90)) {
            return false;
        }
        ev90 ev90Var = (ev90) obj;
        return u890.j(this.a, ev90Var.a) && u890.j(this.b, ev90Var.b) && this.c == ev90Var.c && this.d == ev90Var.d && this.e == ev90Var.e && u890.j(this.f, ev90Var.f);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.e, ab80.k(this.d, ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
        yu90 yu90Var = this.f;
        return iF + (yu90Var == null ? 0 : yu90Var.hashCode());
    }
}
