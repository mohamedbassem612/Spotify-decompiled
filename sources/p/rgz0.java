package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class rgz0 {
    public static final qgz0 Companion = new qgz0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final j2u0 f;
    public final String g;

    public /* synthetic */ rgz0(int i, String str, String str2, String str3, String str4, Long l, j2u0 j2u0Var, String str5) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, pgz0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = j2u0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgz0)) {
            return false;
        }
        rgz0 rgz0Var = (rgz0) obj;
        return u890.j(this.a, rgz0Var.a) && u890.j(this.b, rgz0Var.b) && u890.j(this.c, rgz0Var.c) && u890.j(this.d, rgz0Var.d) && u890.j(this.e, rgz0Var.e) && u890.j(this.f, rgz0Var.f) && u890.j(this.g, rgz0Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.e;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        j2u0 j2u0Var = this.f;
        int iHashCode4 = (iHashCode3 + (j2u0Var == null ? 0 : j2u0Var.hashCode())) * 31;
        String str3 = this.g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
