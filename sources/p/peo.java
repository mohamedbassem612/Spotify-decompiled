package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class peo {
    public final iyl1 a;
    public final int b;
    public final int c;

    public peo(iyl1 iyl1Var, int i, int i2) {
        this.a = iyl1Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof peo)) {
            return false;
        }
        peo peoVar = (peo) obj;
        return this.a.equals(peoVar.a) && this.b == peoVar.b && this.c == peoVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
