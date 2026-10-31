package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d220 {
    public final String a;
    public final String b;
    public final boolean c;
    public final hl51 d;

    public d220(String str, String str2, hl51 hl51Var, int i) {
        boolean z = (i & 4) == 0;
        hl51Var = (i & 8) != 0 ? null : hl51Var;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = hl51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d220)) {
            return false;
        }
        d220 d220Var = (d220) obj;
        return u890.j(this.a, d220Var.a) && this.b.equals(d220Var.b) && this.c == d220Var.c && u890.j(this.d, d220Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        hl51 hl51Var = this.d;
        return iG + (hl51Var == null ? 0 : hl51Var.a.hashCode());
    }
}
