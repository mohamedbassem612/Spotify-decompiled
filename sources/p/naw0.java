package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class naw0 {
    public final String a;
    public final String b;
    public final ksm0 c;

    public naw0(String str, String str2, ksm0 ksm0Var) {
        this.a = str;
        this.b = str2;
        this.c = ksm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naw0)) {
            return false;
        }
        naw0 naw0Var = (naw0) obj;
        return this.a.equals(naw0Var.a) && u890.j(this.b, naw0Var.b) && this.c.equals(naw0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
