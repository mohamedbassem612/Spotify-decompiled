package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class noa0 implements qoa0 {
    public final String a;
    public final String b;
    public final String c;

    public noa0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noa0)) {
            return false;
        }
        noa0 noa0Var = (noa0) obj;
        return u890.j(this.a, noa0Var.a) && u890.j(this.b, noa0Var.b) && u890.j(this.c, noa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
