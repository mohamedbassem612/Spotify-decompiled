package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class twi1 extends vwi1 {
    public final String a;
    public final String b;
    public final tv80 c;

    public twi1(String str, String str2, tv80 tv80Var) {
        this.a = str;
        this.b = str2;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twi1)) {
            return false;
        }
        twi1 twi1Var = (twi1) obj;
        return this.a.equals(twi1Var.a) && this.b.equals(twi1Var.b) && u890.j(this.c, twi1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
