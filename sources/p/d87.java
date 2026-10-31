package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d87 {
    public final yrd a;
    public final String b;
    public final z77 c;

    public d87(yrd yrdVar, String str, z77 z77Var) {
        this.a = yrdVar;
        this.b = str;
        this.c = z77Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d87) {
            d87 d87Var = (d87) obj;
            return u890.j(this.a, d87Var.a) && u890.j(this.b, d87Var.b) && this.c == d87Var.c;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
