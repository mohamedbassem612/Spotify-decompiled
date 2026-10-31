package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lzg1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lzg1(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzg1)) {
            return false;
        }
        lzg1 lzg1Var = (lzg1) obj;
        return this.a.equals(lzg1Var.a) && this.b.equals(lzg1Var.b) && this.c.equals(lzg1Var.c) && this.d.equals(lzg1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
