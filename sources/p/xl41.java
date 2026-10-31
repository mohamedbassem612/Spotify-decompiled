package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xl41 {
    public final String a;
    public final hm41 b;
    public final boolean c;

    public xl41(String str, hm41 hm41Var, boolean z) {
        this.a = str;
        this.b = hm41Var;
        this.c = z;
    }

    public static xl41 a(xl41 xl41Var, hm41 hm41Var, boolean z, int i) {
        String str = xl41Var.a;
        if ((i & 2) != 0) {
            hm41Var = xl41Var.b;
        }
        if ((i & 4) != 0) {
            z = xl41Var.c;
        }
        return new xl41(str, hm41Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl41)) {
            return false;
        }
        xl41 xl41Var = (xl41) obj;
        return u890.j(this.a, xl41Var.a) && u890.j(this.b, xl41Var.b) && this.c == xl41Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hm41 hm41Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (hm41Var == null ? 0 : hm41Var.hashCode())) * 31);
    }
}
