package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eo10 {
    public final String a;
    public final String b;
    public final boolean c;
    public final Long d;

    public eo10(Long l, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo10)) {
            return false;
        }
        eo10 eo10Var = (eo10) obj;
        return this.a.equals(eo10Var.a) && u890.j(this.b, eo10Var.b) && this.c == eo10Var.c && u890.j(this.d, eo10Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iG = xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        return iG + (l != null ? l.hashCode() : 0);
    }
}
