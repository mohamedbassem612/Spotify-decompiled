package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sp51 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final hy50 e;
    public final boolean f;
    public final Long g;

    public sp51(String str, String str2, String str3, String str4, hy50 hy50Var, boolean z, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = hy50Var;
        this.f = z;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp51)) {
            return false;
        }
        sp51 sp51Var = (sp51) obj;
        return u890.j(this.a, sp51Var.a) && u890.j(this.b, sp51Var.b) && u890.j(this.c, sp51Var.c) && u890.j(this.d, sp51Var.d) && this.e.equals(sp51Var.e) && this.f == sp51Var.f && u890.j(this.g, sp51Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iG = xcg1.g((this.e.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.f);
        Long l = this.g;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
