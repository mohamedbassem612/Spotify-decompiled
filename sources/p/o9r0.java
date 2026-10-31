package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o9r0 {
    public final String a;
    public final String b;
    public final String c;

    public o9r0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9r0)) {
            return false;
        }
        o9r0 o9r0Var = (o9r0) obj;
        return u890.j(this.a, o9r0Var.a) && u890.j(this.b, o9r0Var.b) && u890.j(this.c, o9r0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
