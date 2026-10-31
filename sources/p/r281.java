package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r281 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public r281(String str, String str2, String str3, String str4, String str5) {
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
        if (!(obj instanceof r281)) {
            return false;
        }
        r281 r281Var = (r281) obj;
        return this.a.equals(r281Var.a) && this.b.equals(r281Var.b) && this.c.equals(r281Var.c) && this.d.equals(r281Var.d) && this.e.equals(r281Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
