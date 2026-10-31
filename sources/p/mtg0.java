package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mtg0 {
    public final String a;
    public final int b;
    public final long c;
    public final jfv d;

    public mtg0(String str, int i, long j, jfv jfvVar) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = jfvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtg0)) {
            return false;
        }
        mtg0 mtg0Var = (mtg0) obj;
        return u890.j(this.a, mtg0Var.a) && this.b == mtg0Var.b && jfv.f(this.c, mtg0Var.c) && u890.j(this.d, mtg0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = kaa0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        ytw0 ytw0Var = jfv.b;
        int iF2 = cy30.f(iF, this.c, 31);
        jfv jfvVar = this.d;
        return iF2 + (jfvVar != null ? Long.hashCode(jfvVar.a) : 0);
    }
}
