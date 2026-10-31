package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rp8 {
    public final String a;
    public final String b;
    public final String c;

    public rp8(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp8)) {
            return false;
        }
        rp8 rp8Var = (rp8) obj;
        return this.a.equals(rp8Var.a) && u890.j(this.b, rp8Var.b) && this.c.equals(rp8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
