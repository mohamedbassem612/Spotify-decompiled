package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ntb1 implements ptb1 {
    public final String a;
    public final d761 b;
    public final String c;

    public ntb1(String str, d761 d761Var, String str2) {
        this.a = str;
        this.b = d761Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntb1)) {
            return false;
        }
        ntb1 ntb1Var = (ntb1) obj;
        return this.a.equals(ntb1Var.a) && this.b.equals(ntb1Var.b) && this.c.equals(ntb1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.f(this.a.hashCode() * 31, this.b.a, 31);
    }
}
