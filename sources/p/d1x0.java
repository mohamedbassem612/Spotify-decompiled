package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d1x0 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;

    public d1x0(Integer num, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1x0)) {
            return false;
        }
        d1x0 d1x0Var = (d1x0) obj;
        return u890.j(this.a, d1x0Var.a) && u890.j(this.b, d1x0Var.b) && this.c.equals(d1x0Var.c) && u890.j(this.d, d1x0Var.d) && u890.j(this.e, d1x0Var.e) && this.f == d1x0Var.f && this.g.equals(d1x0Var.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iD = cy30.d(cy30.d(cy30.d((num == null ? 0 : num.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + xcg1.g((iD + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }
}
