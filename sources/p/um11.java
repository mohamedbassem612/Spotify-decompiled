package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class um11 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final tm11 c;

    public um11(String str, d8r0 d8r0Var, tm11 tm11Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = tm11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um11)) {
            return false;
        }
        um11 um11Var = (um11) obj;
        return this.a.equals(um11Var.a) && this.b.equals(um11Var.b) && this.c.equals(um11Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
