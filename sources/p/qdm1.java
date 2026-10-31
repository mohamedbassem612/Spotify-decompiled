package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qdm1 {
    public final mdm1 a;
    public final mdm1 b;
    public final String c;
    public final ndm1 d;
    public final cdm1 e;

    public qdm1(mdm1 mdm1Var, mdm1 mdm1Var2, String str, ndm1 ndm1Var, cdm1 cdm1Var) {
        this.a = mdm1Var;
        this.b = mdm1Var2;
        this.c = str;
        this.d = ndm1Var;
        this.e = cdm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qdm1) {
            qdm1 qdm1Var = (qdm1) obj;
            if (this.a == qdm1Var.a && this.b == qdm1Var.b && this.c.equals(qdm1Var.c) && this.d == qdm1Var.d && this.e.equals(qdm1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }
}
