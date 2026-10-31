package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ye {
    public xe a = null;
    public xe b = null;
    public xe c = null;
    public xe d = null;
    public xe e = null;
    public xe f = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj;
        return u890.j(this.a, yeVar.a) && u890.j(this.b, yeVar.b) && u890.j(this.c, yeVar.c) && u890.j(this.d, yeVar.d) && u890.j(this.e, yeVar.e) && u890.j(this.f, yeVar.f);
    }

    public final int hashCode() {
        xe xeVar = this.a;
        int iHashCode = (xeVar == null ? 0 : xeVar.hashCode()) * 31;
        xe xeVar2 = this.b;
        int iHashCode2 = (iHashCode + (xeVar2 == null ? 0 : xeVar2.hashCode())) * 31;
        xe xeVar3 = this.c;
        int iHashCode3 = (iHashCode2 + (xeVar3 == null ? 0 : xeVar3.hashCode())) * 31;
        xe xeVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (xeVar4 == null ? 0 : xeVar4.hashCode())) * 31;
        xe xeVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (xeVar5 == null ? 0 : xeVar5.hashCode())) * 31;
        xe xeVar6 = this.f;
        return iHashCode5 + (xeVar6 != null ? xeVar6.hashCode() : 0);
    }
}
