package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rx7 {
    public final String a;
    public final ual1 b;
    public final sju c;

    public rx7(String str, ual1 ual1Var, sju sjuVar) {
        this.a = str;
        this.b = ual1Var;
        this.c = sjuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx7)) {
            return false;
        }
        rx7 rx7Var = (rx7) obj;
        return u890.j(this.a, rx7Var.a) && u890.j(this.b, rx7Var.b) && u890.j(this.c, rx7Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        sju sjuVar = this.c;
        return iHashCode + (sjuVar == null ? 0 : sjuVar.hashCode());
    }
}
