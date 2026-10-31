package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gfr0 implements qfr0, sfr0 {
    public final String a;
    public final String b;
    public final tfr0 c;

    public gfr0(String str, String str2, tfr0 tfr0Var) {
        this.a = str;
        this.b = str2;
        this.c = tfr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfr0)) {
            return false;
        }
        gfr0 gfr0Var = (gfr0) obj;
        return u890.j(this.a, gfr0Var.a) && this.b.equals(gfr0Var.b) && this.c.equals(gfr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
