package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yjk0 implements ikk0 {
    public final gez a;
    public final gez b;
    public final int c;
    public final jez d;

    public yjk0(gez gezVar, gez gezVar2, int i, jez jezVar) {
        this.a = gezVar;
        this.b = gezVar2;
        this.c = i;
        this.d = jezVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjk0)) {
            return false;
        }
        yjk0 yjk0Var = (yjk0) obj;
        return u890.j(this.a, yjk0Var.a) && u890.j(this.b, yjk0Var.b) && this.c == yjk0Var.c && this.d == yjk0Var.d;
    }

    public final int hashCode() {
        gez gezVar = this.a;
        int iHashCode = (gezVar == null ? 0 : gezVar.hashCode()) * 31;
        gez gezVar2 = this.b;
        int iF = kaa0.f(this.c, (iHashCode + (gezVar2 == null ? 0 : gezVar2.hashCode())) * 31, 31);
        jez jezVar = this.d;
        return iF + (jezVar != null ? jezVar.hashCode() : 0);
    }
}
