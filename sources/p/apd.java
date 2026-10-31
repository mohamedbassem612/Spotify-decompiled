package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class apd {
    public final nwc a;
    public final nwc b;
    public final hvc c;
    public final p80 d;
    public final boolean e;
    public final y6x0 f;
    public final Float g;
    public final int h;

    public apd(nwc nwcVar, nwc nwcVar2, hvc hvcVar, p80 p80Var, y6x0 y6x0Var, Float f, int i) {
        nwcVar = (i & 1) != 0 ? null : nwcVar;
        nwcVar2 = (i & 2) != 0 ? null : nwcVar2;
        p80Var = (i & 8) != 0 ? o80.a : p80Var;
        boolean z = (i & 16) != 0;
        y6x0Var = (i & 32) != 0 ? null : y6x0Var;
        f = (i & 64) != 0 ? null : f;
        this.a = nwcVar;
        this.b = nwcVar2;
        this.c = hvcVar;
        this.d = p80Var;
        this.e = z;
        this.f = y6x0Var;
        this.g = f;
        this.h = 3;
    }

    public final p80 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apd)) {
            return false;
        }
        apd apdVar = (apd) obj;
        return u890.j(this.a, apdVar.a) && u890.j(this.b, apdVar.b) && this.c.equals(apdVar.c) && this.d.equals(apdVar.d) && this.e == apdVar.e && u890.j(this.f, apdVar.f) && u890.j(this.g, apdVar.g) && this.h == apdVar.h;
    }

    public final int hashCode() {
        nwc nwcVar = this.a;
        int iHashCode = (nwcVar == null ? 0 : nwcVar.hashCode()) * 31;
        nwc nwcVar2 = this.b;
        int iG = xcg1.g((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (nwcVar2 == null ? 0 : nwcVar2.hashCode())) * 31)) * 31)) * 31, 31, this.e);
        y6x0 y6x0Var = this.f;
        int iHashCode2 = (iG + (y6x0Var == null ? 0 : y6x0Var.hashCode())) * 31;
        Float f = this.g;
        return l1d.C(this.h) + ((iHashCode2 + (f != null ? f.hashCode() : 0)) * 31);
    }
}
