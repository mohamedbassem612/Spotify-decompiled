package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x2k0 implements k4k0 {
    public final ijf1 a;
    public final s69 b;
    public final s69 c;
    public final yoo d;
    public final bpo e;
    public final rx30 f;

    public x2k0(ijf1 ijf1Var, s69 s69Var, s69 s69Var2, yoo yooVar, bpo bpoVar, rx30 rx30Var) {
        this.a = ijf1Var;
        this.b = s69Var;
        this.c = s69Var2;
        this.d = yooVar;
        this.e = bpoVar;
        this.f = rx30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2k0)) {
            return false;
        }
        x2k0 x2k0Var = (x2k0) obj;
        return this.a == x2k0Var.a && this.b.equals(x2k0Var.b) && u890.j(this.c, x2k0Var.c) && this.d == x2k0Var.d && this.e == x2k0Var.e && this.f == x2k0Var.f;
    }

    public final int hashCode() {
        int iH = v8i0.h(this.b, this.a.hashCode() * 31, 31);
        s69 s69Var = this.c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iH + (s69Var == null ? 0 : s69Var.hashCode())) * 31)) * 31)) * 31;
        rx30 rx30Var = this.f;
        return iHashCode + (rx30Var != null ? rx30Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = this.b.a();
        s69 s69Var = this.c;
        return "OnFxCurveChanged(track=" + this.a + ", updatedCurves=" + strA + ", otherTrackCurves=" + (s69Var != null ? s69Var.a() : null) + ", action=" + this.d + ", curveType=" + this.e + ", baseStyleId=" + this.f + ")";
    }
}
