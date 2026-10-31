package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ljh1 implements ez00 {
    public final h290 a;
    public final h290 b;
    public final h290 c;

    public ljh1(h290 h290Var, h290 h290Var2, h290 h290Var3) {
        this.a = h290Var;
        this.b = h290Var2;
        this.c = h290Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljh1)) {
            return false;
        }
        ljh1 ljh1Var = (ljh1) obj;
        return this.a.equals(ljh1Var.a) && this.b.equals(ljh1Var.b) && this.c.equals(ljh1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.g(this.b, this.a.hashCode() * 31, 31);
    }
}
