package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wsa1 implements dta1 {
    public final String a;
    public final Float b;
    public final ltt0 c;

    public wsa1(String str, Float f, ltt0 ltt0Var) {
        this.a = str;
        this.b = f;
        this.c = ltt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsa1)) {
            return false;
        }
        wsa1 wsa1Var = (wsa1) obj;
        return u890.j(this.a, wsa1Var.a) && u890.j(this.b, wsa1Var.b) && this.c == wsa1Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return this.c.hashCode() + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31);
    }
}
