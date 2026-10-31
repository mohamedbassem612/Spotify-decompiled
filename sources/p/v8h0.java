package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@o661(with = w8h0.class)
public final class v8h0 {
    public static final u8h0 Companion = new u8h0();
    public final boolean a;
    public final String b;
    public final String c;
    public final double d;
    public final String e;
    public final String f;

    public v8h0(boolean z, String str, String str2, double d, String str3, String str4) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8h0)) {
            return false;
        }
        v8h0 v8h0Var = (v8h0) obj;
        return this.a == v8h0Var.a && u890.j(this.b, v8h0Var.b) && u890.j(this.c, v8h0Var.c) && Double.compare(this.d, v8h0Var.d) == 0 && u890.j(this.e, v8h0Var.e) && u890.j(this.f, v8h0Var.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iE = xcg1.e(this.d, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.e;
        int iHashCode3 = (iE + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
