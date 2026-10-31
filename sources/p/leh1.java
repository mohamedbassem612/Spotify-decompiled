package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class leh1 {
    public final tw21 a;
    public final tw21 b;
    public final tw21 c;
    public final tw21 d;
    public final tw21 e;

    public leh1(tw21 tw21Var, tw21 tw21Var2, tw21 tw21Var3, tw21 tw21Var4, tw21 tw21Var5) {
        this.a = tw21Var;
        this.b = tw21Var2;
        this.c = tw21Var3;
        this.d = tw21Var4;
        this.e = tw21Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof leh1)) {
            return false;
        }
        leh1 leh1Var = (leh1) obj;
        return this.a.equals(leh1Var.a) && this.b.equals(leh1Var.b) && this.c.equals(leh1Var.c) && this.d.equals(leh1Var.d) && this.e.equals(leh1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ktd.h(this.d, ktd.h(this.c, ktd.h(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }
}
