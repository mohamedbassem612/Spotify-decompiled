package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lk10 {
    public final String a;
    public final int b;
    public final fk10 c;
    public final gk10 d;
    public final String e;
    public final Long f;

    public lk10(String str, int i, fk10 fk10Var, gk10 gk10Var, String str2, Long l) {
        this.a = str;
        this.b = i;
        this.c = fk10Var;
        this.d = gk10Var;
        this.e = str2;
        this.f = l;
    }

    public static lk10 a(lk10 lk10Var, String str, int i, fk10 fk10Var, gk10 gk10Var, Long l, int i2) {
        if ((i2 & 1) != 0) {
            str = lk10Var.a;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            i = lk10Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            fk10Var = lk10Var.c;
        }
        fk10 fk10Var2 = fk10Var;
        if ((i2 & 8) != 0) {
            gk10Var = lk10Var.d;
        }
        gk10 gk10Var2 = gk10Var;
        String str3 = (i2 & 16) != 0 ? lk10Var.e : "https://fan-events-cdn.spotifycdn.com/redemptions/static/redemption-box.webp";
        if ((i2 & 32) != 0) {
            l = lk10Var.f;
        }
        lk10Var.getClass();
        return new lk10(str2, i3, fk10Var2, gk10Var2, str3, l);
    }

    public final boolean b() {
        return this.b == 1 && this.a.length() == 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk10)) {
            return false;
        }
        lk10 lk10Var = (lk10) obj;
        return this.a.equals(lk10Var.a) && this.b == lk10Var.b && this.c == lk10Var.c && this.d == lk10Var.d && this.e.equals(lk10Var.e) && u890.j(this.f, lk10Var.f);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        fk10 fk10Var = this.c;
        int iHashCode = (iK + (fk10Var == null ? 0 : fk10Var.hashCode())) * 31;
        gk10 gk10Var = this.d;
        int iD = cy30.d((iHashCode + (gk10Var == null ? 0 : gk10Var.hashCode())) * 31, 31, this.e);
        Long l = this.f;
        return iD + (l != null ? l.hashCode() : 0);
    }
}
