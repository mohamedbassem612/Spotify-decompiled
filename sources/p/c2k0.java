package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c2k0 implements k4k0 {
    public final ntf1 a;
    public final uia b;
    public final uia c;
    public final int d;
    public final int e;
    public final Float f;
    public final Float g;

    public c2k0(ntf1 ntf1Var, uia uiaVar, uia uiaVar2, int i, int i2, Float f, Float f2) {
        this.a = ntf1Var;
        this.b = uiaVar;
        this.c = uiaVar2;
        this.d = i;
        this.e = i2;
        this.f = f;
        this.g = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2k0)) {
            return false;
        }
        c2k0 c2k0Var = (c2k0) obj;
        return this.a.equals(c2k0Var.a) && u890.j(this.b, c2k0Var.b) && u890.j(this.c, c2k0Var.c) && this.d == c2k0Var.d && this.e == c2k0Var.e && u890.j(this.f, c2k0Var.f) && u890.j(this.g, c2k0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        uia uiaVar = this.b;
        int iHashCode2 = (iHashCode + (uiaVar == null ? 0 : uiaVar.hashCode())) * 31;
        uia uiaVar2 = this.c;
        int iF = kaa0.f(this.e, kaa0.f(this.d, (iHashCode2 + (uiaVar2 == null ? 0 : uiaVar2.hashCode())) * 31, 31), 31);
        Float f = this.f;
        int iHashCode3 = (iF + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.g;
        return iHashCode3 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        uia uiaVar = this.b;
        Object objValueOf = uiaVar != null ? Integer.valueOf(uiaVar.b.size()) : "null";
        uia uiaVar2 = this.c;
        return "OnBeatsData(beatsA=" + objValueOf + " beats, beatsB=" + (uiaVar2 != null ? Integer.valueOf(uiaVar2.b.size()) : "null") + " beats, trackPairKey=" + this.a + ", durationA=" + this.d + ", durationB=" + this.e + ", bpmA=" + this.f + ", bpmB=" + this.g + ")";
    }
}
