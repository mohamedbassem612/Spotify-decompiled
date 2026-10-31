package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i681 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public i681(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i681)) {
            return false;
        }
        i681 i681Var = (i681) obj;
        return u890.j(this.a, i681Var.a) && u890.j(this.b, i681Var.b) && u890.j(this.c, i681Var.c) && u890.j(this.d, i681Var.d) && u890.j(this.e, i681Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
