package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dmr0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public dmr0(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmr0)) {
            return false;
        }
        dmr0 dmr0Var = (dmr0) obj;
        return u890.j(this.a, dmr0Var.a) && this.b.equals(dmr0Var.b) && u890.j(this.c, dmr0Var.c) && this.d.equals(dmr0Var.d) && this.e.equals(dmr0Var.e) && u890.j(this.f, dmr0Var.f) && this.g == dmr0Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
