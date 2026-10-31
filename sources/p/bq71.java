package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bq71 {
    public final String a;
    public final String b;
    public final String c;
    public final bc71 d;
    public final boolean e;
    public final int f;

    public bq71(String str, String str2, String str3, bc71 bc71Var, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bc71Var;
        this.e = z;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq71)) {
            return false;
        }
        bq71 bq71Var = (bq71) obj;
        return u890.j(this.a, bq71Var.a) && u890.j(this.b, bq71Var.b) && u890.j(this.c, bq71Var.c) && u890.j(this.d, bq71Var.d) && this.e == bq71Var.e && this.f == bq71Var.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return l1d.C(this.f) + xcg1.g((this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }
}
