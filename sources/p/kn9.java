package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kn9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public kn9(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn9)) {
            return false;
        }
        kn9 kn9Var = (kn9) obj;
        return this.a.equals(kn9Var.a) && this.b.equals(kn9Var.b) && u890.j(this.c, kn9Var.c) && this.d.equals(kn9Var.d) && u890.j(this.e, kn9Var.e) && this.f.equals(kn9Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
