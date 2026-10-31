package p;

import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wnb1 {
    public final jo70 a;
    public final xkk1 b;
    public final hll c;
    public final hzy d;
    public final iix0 e;
    public final h2v f;
    public final zoy0 g;
    public final w281 h;
    public final mdz i;

    public /* synthetic */ wnb1(jo70 jo70Var, xkk1 xkk1Var, hll hllVar, hzy hzyVar, iix0 iix0Var, h2v h2vVar, zoy0 zoy0Var, w281 w281Var, int i) {
        this(jo70Var, xkk1Var, (i & 4) != 0 ? null : hllVar, (i & 8) != 0 ? null : hzyVar, (i & 16) != 0 ? null : iix0Var, (i & 32) != 0 ? null : h2vVar, (i & 64) != 0 ? null : zoy0Var, (i & SemanticState.Focused) != 0 ? null : w281Var, (mdz) null);
    }

    public final hzy a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnb1)) {
            return false;
        }
        wnb1 wnb1Var = (wnb1) obj;
        return u890.j(this.a, wnb1Var.a) && u890.j(this.b, wnb1Var.b) && u890.j(this.c, wnb1Var.c) && u890.j(this.d, wnb1Var.d) && u890.j(this.e, wnb1Var.e) && u890.j(this.f, wnb1Var.f) && u890.j(this.g, wnb1Var.g) && u890.j(this.h, wnb1Var.h) && u890.j(this.i, wnb1Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hll hllVar = this.c;
        int iHashCode2 = (iHashCode + (hllVar == null ? 0 : hllVar.hashCode())) * 31;
        hzy hzyVar = this.d;
        int iC = (iHashCode2 + (hzyVar == null ? 0 : l1d.C(hzyVar.a))) * 31;
        iix0 iix0Var = this.e;
        int iHashCode3 = (iC + (iix0Var == null ? 0 : iix0Var.hashCode())) * 31;
        h2v h2vVar = this.f;
        int iHashCode4 = (iHashCode3 + (h2vVar == null ? 0 : h2vVar.hashCode())) * 31;
        zoy0 zoy0Var = this.g;
        int iHashCode5 = (iHashCode4 + (zoy0Var == null ? 0 : zoy0Var.hashCode())) * 31;
        w281 w281Var = this.h;
        int iHashCode6 = (iHashCode5 + (w281Var == null ? 0 : w281Var.hashCode())) * 31;
        mdz mdzVar = this.i;
        return iHashCode6 + (mdzVar != null ? mdzVar.hashCode() : 0);
    }

    public wnb1(jo70 jo70Var, xkk1 xkk1Var, hll hllVar, hzy hzyVar, iix0 iix0Var, h2v h2vVar, zoy0 zoy0Var, w281 w281Var, mdz mdzVar) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = hllVar;
        this.d = hzyVar;
        this.e = iix0Var;
        this.f = h2vVar;
        this.g = zoy0Var;
        this.h = w281Var;
        this.i = mdzVar;
    }
}
