package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class io10 implements jo10 {
    public final String a;
    public final String b;
    public final qo10 c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;

    public io10(String str, String str2, qo10 qo10Var, String str3, String str4, String str5, Integer num, String str6, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = qo10Var;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = num;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io10)) {
            return false;
        }
        io10 io10Var = (io10) obj;
        return u890.j(this.a, io10Var.a) && u890.j(this.b, io10Var.b) && this.c.equals(io10Var.c) && this.d.equals(io10Var.d) && u890.j(this.e, io10Var.e) && this.f.equals(io10Var.f) && u890.j(this.g, io10Var.g) && u890.j(this.h, io10Var.h) && this.i.equals(io10Var.i) && this.j.equals(io10Var.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d(cy30.d((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        Integer num = this.g;
        return this.j.hashCode() + cy30.d(cy30.d((iD + (num != null ? num.hashCode() : 0)) * 31, 31, this.h), 31, this.i);
    }
}
