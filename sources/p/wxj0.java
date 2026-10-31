package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wxj0 {
    public final s69 a;
    public final s69 b;
    public final duk1 c;
    public final gez d;
    public final gez e;
    public final jez f;
    public final r920 g;
    public final r920 h;
    public final ha20 i;
    public final ox30 j;
    public final ox30 k;
    public final rx30 l;

    public wxj0(s69 s69Var, s69 s69Var2, duk1 duk1Var, gez gezVar, gez gezVar2, jez jezVar, r920 r920Var, r920 r920Var2, ha20 ha20Var, ox30 ox30Var, ox30 ox30Var2, rx30 rx30Var) {
        this.a = s69Var;
        this.b = s69Var2;
        this.c = duk1Var;
        this.d = gezVar;
        this.e = gezVar2;
        this.f = jezVar;
        this.g = r920Var;
        this.h = r920Var2;
        this.i = ha20Var;
        this.j = ox30Var;
        this.k = ox30Var2;
        this.l = rx30Var;
    }

    public static wxj0 a(wxj0 wxj0Var, s69 s69Var, s69 s69Var2, duk1 duk1Var, gez gezVar, gez gezVar2, jez jezVar, r920 r920Var, r920 r920Var2, ha20 ha20Var, ox30 ox30Var, ox30 ox30Var2, rx30 rx30Var, int i) {
        if ((i & 1) != 0) {
            s69Var = wxj0Var.a;
        }
        s69 s69Var3 = s69Var;
        if ((i & 2) != 0) {
            s69Var2 = wxj0Var.b;
        }
        return new wxj0(s69Var3, s69Var2, (i & 4) != 0 ? wxj0Var.c : duk1Var, (i & 8) != 0 ? wxj0Var.d : gezVar, (i & 16) != 0 ? wxj0Var.e : gezVar2, (i & 32) != 0 ? wxj0Var.f : jezVar, (i & 64) != 0 ? wxj0Var.g : r920Var, (i & 128) != 0 ? wxj0Var.h : r920Var2, (i & 256) != 0 ? wxj0Var.i : ha20Var, (i & 512) != 0 ? wxj0Var.j : ox30Var, (i & 1024) != 0 ? wxj0Var.k : ox30Var2, (i & 2048) != 0 ? wxj0Var.l : rx30Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxj0)) {
            return false;
        }
        wxj0 wxj0Var = (wxj0) obj;
        return u890.j(this.a, wxj0Var.a) && u890.j(this.b, wxj0Var.b) && this.c == wxj0Var.c && u890.j(this.d, wxj0Var.d) && u890.j(this.e, wxj0Var.e) && this.f == wxj0Var.f && u890.j(this.g, wxj0Var.g) && u890.j(this.h, wxj0Var.h) && this.i == wxj0Var.i && u890.j(this.j, wxj0Var.j) && u890.j(this.k, wxj0Var.k) && this.l == wxj0Var.l;
    }

    public final int hashCode() {
        s69 s69Var = this.a;
        int iHashCode = (s69Var == null ? 0 : s69Var.hashCode()) * 31;
        s69 s69Var2 = this.b;
        int iHashCode2 = (iHashCode + (s69Var2 == null ? 0 : s69Var2.hashCode())) * 31;
        duk1 duk1Var = this.c;
        int iHashCode3 = (iHashCode2 + (duk1Var == null ? 0 : duk1Var.hashCode())) * 31;
        gez gezVar = this.d;
        int iHashCode4 = (iHashCode3 + (gezVar == null ? 0 : gezVar.hashCode())) * 31;
        gez gezVar2 = this.e;
        int iHashCode5 = (iHashCode4 + (gezVar2 == null ? 0 : gezVar2.hashCode())) * 31;
        jez jezVar = this.f;
        int iHashCode6 = (iHashCode5 + (jezVar == null ? 0 : jezVar.hashCode())) * 31;
        r920 r920Var = this.g;
        int iHashCode7 = (iHashCode6 + (r920Var == null ? 0 : r920Var.hashCode())) * 31;
        r920 r920Var2 = this.h;
        int iHashCode8 = (iHashCode7 + (r920Var2 == null ? 0 : r920Var2.hashCode())) * 31;
        ha20 ha20Var = this.i;
        int iHashCode9 = (iHashCode8 + (ha20Var == null ? 0 : ha20Var.hashCode())) * 31;
        ox30 ox30Var = this.j;
        int iHashCode10 = (iHashCode9 + (ox30Var == null ? 0 : ox30Var.hashCode())) * 31;
        ox30 ox30Var2 = this.k;
        int iHashCode11 = (iHashCode10 + (ox30Var2 == null ? 0 : ox30Var2.hashCode())) * 31;
        rx30 rx30Var = this.l;
        return iHashCode11 + (rx30Var != null ? rx30Var.hashCode() : 0);
    }
}
