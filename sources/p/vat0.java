package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vat0 implements ebt0 {
    public final String a;
    public final tv80 b;

    public vat0(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vat0)) {
            return false;
        }
        vat0 vat0Var = (vat0) obj;
        return this.a.equals(vat0Var.a) && this.b.equals(vat0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
