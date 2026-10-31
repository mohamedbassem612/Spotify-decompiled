package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d5g0 extends t4n1 {
    public final String b;
    public final iyr0 c;

    public d5g0(String str, iyr0 iyr0Var) {
        this.b = str;
        this.c = iyr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5g0)) {
            return false;
        }
        d5g0 d5g0Var = (d5g0) obj;
        return this.b.equals(d5g0Var.b) && this.c == d5g0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
