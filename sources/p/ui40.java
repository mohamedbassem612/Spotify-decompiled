package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ui40 implements pd51 {
    public final String a;
    public final d8r0 b;
    public final ri40 c;

    public ui40(String str, d8r0 d8r0Var, ri40 ri40Var) {
        this.a = str;
        this.b = d8r0Var;
        this.c = ri40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui40)) {
            return false;
        }
        ui40 ui40Var = (ui40) obj;
        return this.a.equals(ui40Var.a) && this.b.equals(ui40Var.b) && this.c.equals(ui40Var.c);
    }

    @Override // p.pd51
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + hrt.i(this.b, this.a.hashCode() * 31, 31);
    }
}
