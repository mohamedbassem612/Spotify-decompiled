package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class soo implements woo {
    public final gez a;
    public final gez b;
    public final jez c;

    public soo(gez gezVar, gez gezVar2, jez jezVar) {
        this.a = gezVar;
        this.b = gezVar2;
        this.c = jezVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soo)) {
            return false;
        }
        soo sooVar = (soo) obj;
        return u890.j(this.a, sooVar.a) && u890.j(this.b, sooVar.b) && this.c == sooVar.c;
    }

    public final int hashCode() {
        gez gezVar = this.a;
        int iHashCode = (gezVar == null ? 0 : gezVar.hashCode()) * 31;
        gez gezVar2 = this.b;
        int iHashCode2 = (iHashCode + (gezVar2 == null ? 0 : gezVar2.hashCode())) * 31;
        jez jezVar = this.c;
        return iHashCode2 + (jezVar != null ? jezVar.hashCode() : 0);
    }
}
