package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ylr0 implements zlr0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public ylr0(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ylr0)) {
            return false;
        }
        ylr0 ylr0Var = (ylr0) obj;
        return this.a.equals(ylr0Var.a) && u890.j(this.b, ylr0Var.b) && u890.j(this.c, ylr0Var.c) && this.d.equals(ylr0Var.d) && u890.j(this.e, ylr0Var.e) && this.f == ylr0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
