package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rh81 extends t8p1 {
    public final int d;
    public final ir31 e;

    public rh81(int i, ir31 ir31Var) {
        this.d = i;
        this.e = ir31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rh81) {
            rh81 rh81Var = (rh81) obj;
            return this.d == rh81Var.d && this.e == rh81Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (Integer.hashCode(this.d) * 31);
    }
}
