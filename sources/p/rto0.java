package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rto0 extends omo1 {
    public final String c;
    public final cvy0 d;

    public rto0(String str, cvy0 cvy0Var) {
        this.c = str;
        this.d = cvy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rto0)) {
            return false;
        }
        rto0 rto0Var = (rto0) obj;
        return this.c.equals(rto0Var.c) && this.d.equals(rto0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final cvy0 o() {
        return this.d;
    }
}
