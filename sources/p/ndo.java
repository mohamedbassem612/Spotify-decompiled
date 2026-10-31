package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ndo {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public ndo(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndo)) {
            return false;
        }
        ndo ndoVar = (ndo) obj;
        return this.a.equals(ndoVar.a) && this.b.equals(ndoVar.b) && this.c.equals(ndoVar.c) && this.d == ndoVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
