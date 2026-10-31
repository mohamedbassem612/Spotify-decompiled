package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ura0 {
    public final boolean a;
    public final rq2 b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;

    public ura0(boolean z, rq2 rq2Var, String str, int i, String str2, String str3, String str4, int i2) {
        rq2Var = (i2 & 2) != 0 ? rq2.c : rq2Var;
        i = (i2 & 8) != 0 ? 1 : i;
        str2 = (i2 & 16) != 0 ? null : str2;
        str3 = (i2 & 32) != 0 ? null : str3;
        boolean z2 = (i2 & 128) == 0;
        this.a = z;
        this.b = rq2Var;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ura0)) {
            return false;
        }
        ura0 ura0Var = (ura0) obj;
        return this.a == ura0Var.a && this.b == ura0Var.b && this.c.equals(ura0Var.c) && this.d == ura0Var.d && u890.j(this.e, ura0Var.e) && u890.j(this.f, ura0Var.f) && u890.j(this.g, ura0Var.g) && this.h == ura0Var.h;
    }

    public final int hashCode() {
        int iK = ab80.k(this.d, cy30.d((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c), 31);
        String str = this.e;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
