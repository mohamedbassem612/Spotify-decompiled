package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qw50 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final o10 g;
    public final String h;
    public final String i;

    public qw50(String str, String str2, String str3, String str4, String str5, String str6, o10 o10Var, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = o10Var;
        this.h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw50)) {
            return false;
        }
        qw50 qw50Var = (qw50) obj;
        return this.a.equals(qw50Var.a) && this.b.equals(qw50Var.b) && this.c.equals(qw50Var.c) && this.d.equals(qw50Var.d) && this.e.equals(qw50Var.e) && this.f.equals(qw50Var.f) && this.g.equals(qw50Var.g) && this.h.equals(qw50Var.h) && this.i.equals(qw50Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d((this.g.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.h);
    }
}
