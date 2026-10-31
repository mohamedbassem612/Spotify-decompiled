package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ona0 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final sna0 c;

    public ona0(String str, d8r0 d8r0Var, sna0 sna0Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = sna0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ona0)) {
            return false;
        }
        ona0 ona0Var = (ona0) obj;
        return this.a.equals(ona0Var.a) && this.b.equals(ona0Var.b) && this.c.equals(ona0Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
