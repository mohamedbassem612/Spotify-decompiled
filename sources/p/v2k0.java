package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v2k0 implements k4k0 {
    public final ijf1 a;
    public final s69 b;
    public final s69 c;
    public final yoo d;
    public final bpo e;
    public final ha20 f;

    public v2k0(ijf1 ijf1Var, s69 s69Var, s69 s69Var2, yoo yooVar, bpo bpoVar, ha20 ha20Var) {
        this.a = ijf1Var;
        this.b = s69Var;
        this.c = s69Var2;
        this.d = yooVar;
        this.e = bpoVar;
        this.f = ha20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2k0)) {
            return false;
        }
        v2k0 v2k0Var = (v2k0) obj;
        return this.a == v2k0Var.a && this.b.equals(v2k0Var.b) && u890.j(this.c, v2k0Var.c) && this.d == v2k0Var.d && this.e == v2k0Var.e && this.f == v2k0Var.f;
    }

    public final int hashCode() {
        int iH = v8i0.h(this.b, this.a.hashCode() * 31, 31);
        s69 s69Var = this.c;
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iH + (s69Var == null ? 0 : s69Var.hashCode())) * 31)) * 31)) * 31;
        ha20 ha20Var = this.f;
        return iHashCode + (ha20Var != null ? ha20Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = this.b.a();
        s69 s69Var = this.c;
        return "OnFilterCurveChanged(track=" + this.a + ", updatedCurves=" + strA + ", otherTrackCurves=" + (s69Var != null ? s69Var.a() : null) + ", action=" + this.d + ", curveType=" + this.e + ", baseStyleId=" + this.f + ")";
    }
}
