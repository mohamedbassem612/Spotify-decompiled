package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ee21 {
    public final otl a;
    public final String b;
    public final String c;

    public ee21(otl otlVar, String str, String str2) {
        this.a = otlVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee21)) {
            return false;
        }
        ee21 ee21Var = (ee21) obj;
        return this.a.equals(ee21Var.a) && u890.j(this.b, ee21Var.b) && u890.j(this.c, ee21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
