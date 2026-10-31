package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cc81 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public cc81(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc81)) {
            return false;
        }
        cc81 cc81Var = (cc81) obj;
        return this.a.equals(cc81Var.a) && this.b.equals(cc81Var.b) && this.c.equals(cc81Var.c) && this.d == cc81Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
