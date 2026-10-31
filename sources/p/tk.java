package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tk {
    public final Boolean a;
    public final Boolean b;
    public final gjj1 c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;

    public /* synthetic */ tk(Boolean bool, Boolean bool2, gjj1 gjj1Var, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : gjj1Var, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : bool4, (i & 32) != 0 ? null : bool5, (i & 64) != 0 ? null : bool6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk)) {
            return false;
        }
        tk tkVar = (tk) obj;
        return u890.j(this.a, tkVar.a) && u890.j(this.b, tkVar.b) && u890.j(this.c, tkVar.c) && u890.j(this.d, tkVar.d) && u890.j(this.e, tkVar.e) && u890.j(this.f, tkVar.f) && u890.j(this.g, tkVar.g);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        gjj1 gjj1Var = this.c;
        int iHashCode3 = (iHashCode2 + (gjj1Var == null ? 0 : gjj1Var.hashCode())) * 31;
        Boolean bool3 = this.d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.e;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.g;
        return iHashCode6 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public tk(Boolean bool, Boolean bool2, gjj1 gjj1Var, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.a = bool;
        this.b = bool2;
        this.c = gjj1Var;
        this.d = bool3;
        this.e = bool4;
        this.f = bool5;
        this.g = bool6;
    }
}
