package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ggi0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ggi0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggi0)) {
            return false;
        }
        ggi0 ggi0Var = (ggi0) obj;
        return this.a.equals(ggi0Var.a) && this.b.equals(ggi0Var.b) && u890.j(this.c, ggi0Var.c) && u890.j(this.d, ggi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
