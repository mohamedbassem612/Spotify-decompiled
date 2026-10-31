package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class laf1 {
    public final wi90 a;
    public final rx7 b;
    public final String c;
    public final String d;

    public laf1(wi90 wi90Var, rx7 rx7Var, String str, String str2) {
        this.a = wi90Var;
        this.b = rx7Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof laf1)) {
            return false;
        }
        laf1 laf1Var = (laf1) obj;
        return this.a.equals(laf1Var.a) && u890.j(this.b, laf1Var.b) && this.c.equals(laf1Var.c) && u890.j(this.d, laf1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        rx7 rx7Var = this.b;
        int iD = cy30.d((iHashCode + (rx7Var == null ? 0 : rx7Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return iD + (str != null ? str.hashCode() : 0);
    }
}
