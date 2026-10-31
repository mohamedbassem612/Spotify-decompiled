package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nkh0 {
    public final String a;
    public final int b;
    public final String c;

    public nkh0(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkh0)) {
            return false;
        }
        nkh0 nkh0Var = (nkh0) obj;
        return this.a.equals(nkh0Var.a) && this.b == nkh0Var.b && this.c.equals(nkh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
