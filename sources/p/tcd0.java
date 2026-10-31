package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tcd0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final Long d;

    public tcd0(Long l, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcd0)) {
            return false;
        }
        tcd0 tcd0Var = (tcd0) obj;
        return u890.j(this.a, tcd0Var.a) && u890.j(this.b, tcd0Var.b) && this.c == tcd0Var.c && u890.j(this.d, tcd0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
