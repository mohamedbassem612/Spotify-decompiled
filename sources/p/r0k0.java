package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r0k0 implements k1k0 {
    public final lhg1 a;
    public final String b;
    public final boolean c;
    public final long d;
    public final String e;

    public r0k0(lhg1 lhg1Var, String str, boolean z, long j, String str2, int i) {
        z = (i & 4) != 0 ? false : z;
        j = (i & 8) != 0 ? 0L : j;
        this.a = lhg1Var;
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0k0)) {
            return false;
        }
        r0k0 r0k0Var = (r0k0) obj;
        return u890.j(this.a, r0k0Var.a) && u890.j(this.b, r0k0Var.b) && this.c == r0k0Var.c && this.d == r0k0Var.d && u890.j(this.e, r0k0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iF = cy30.f(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), this.d, 31);
        String str2 = this.e;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = gvg.n("PlayTransition(transition=", this.a.b(), ", interactionId=", this.b, ", recordOriginalContextPlayState=");
        sbN.append(this.c);
        sbN.append(", debounceMs=");
        sbN.append(this.d);
        return l1d.q(sbN, ", armId=", this.e, ")");
    }
}
