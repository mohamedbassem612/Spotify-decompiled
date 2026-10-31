package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tm81 {
    public static final sg0 e = new sg0(1, (lnm) null, (byte) 29);
    public final String a;
    public final iu30 b;
    public final boolean c;
    public final int d;

    public tm81(int i, int i2, String str, iu30 iu30Var, boolean z) {
        iu30Var = (i2 & 2) != 0 ? e : iu30Var;
        z = (i2 & 4) != 0 ? false : z;
        i = (i2 & 8) != 0 ? 0 : i;
        this.a = str;
        this.b = iu30Var;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm81)) {
            return false;
        }
        tm81 tm81Var = (tm81) obj;
        return u890.j(this.a, tm81Var.a) && this.b.equals(tm81Var.b) && this.c == tm81Var.c && this.d == tm81Var.d;
    }

    public final int hashCode() {
        int iG = xcg1.g(ktd.g(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        int i = this.d;
        return iG + (i == 0 ? 0 : l1d.C(i));
    }
}
