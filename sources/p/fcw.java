package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fcw extends j0o1 {
    public final String c;
    public final String d;
    public final bef0 e;
    public final int f;

    public fcw(String str, String str2, bef0 bef0Var, int i) {
        this.c = str;
        this.d = str2;
        this.e = bef0Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcw)) {
            return false;
        }
        fcw fcwVar = (fcw) obj;
        return u890.j(this.c, fcwVar.c) && this.d.equals(fcwVar.d) && u890.j(this.e, fcwVar.e) && this.f == fcwVar.f;
    }

    public final int hashCode() {
        return l1d.C(this.f) + ((this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d)) * 31);
    }
}
