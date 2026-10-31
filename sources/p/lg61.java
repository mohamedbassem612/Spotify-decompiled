package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lg61 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public lg61(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public static lg61 a(lg61 lg61Var, String str, int i, int i2) {
        String str2 = lg61Var.a;
        if ((i2 & 2) != 0) {
            str = lg61Var.b;
        }
        String str3 = lg61Var.c;
        lg61Var.getClass();
        return new lg61(str2, str, i, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg61)) {
            return false;
        }
        lg61 lg61Var = (lg61) obj;
        return u890.j(this.a, lg61Var.a) && u890.j(this.b, lg61Var.b) && u890.j(this.c, lg61Var.c) && this.d == lg61Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return l1d.C(this.d) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public /* synthetic */ lg61() {
        this(null, null, 1, null);
    }
}
