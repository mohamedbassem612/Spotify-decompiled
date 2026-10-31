package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class si41 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;

    public si41(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
    }

    public static si41 a(si41 si41Var, boolean z, boolean z2, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = si41Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = si41Var.b;
        }
        boolean z4 = z2;
        boolean z5 = si41Var.c;
        if ((i & 8) != 0) {
            str = si41Var.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = si41Var.e;
        }
        si41Var.getClass();
        return new si41(str3, str2, z3, z4, z5);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002b  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si41)) {
            return false;
        }
        si41 si41Var = (si41) obj;
        if (this.a != si41Var.a || this.b != si41Var.b || this.c != si41Var.c) {
            return false;
        }
        String str = si41Var.d;
        String str2 = this.d;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            zEquals = str2.equals(str);
        }
        return zEquals && u890.j(this.e, si41Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
