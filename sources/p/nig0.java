package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nig0 {
    public final String a;
    public final String b;
    public final int c;

    public nig0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nig0)) {
            return false;
        }
        nig0 nig0Var = (nig0) obj;
        return this.a.equals(nig0Var.a) && this.b.equals(nig0Var.b) && this.c == nig0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
