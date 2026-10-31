package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xu0 {
    public final String a;
    public final Long b;
    public final String c;

    public xu0(Long l, String str, String str2) {
        this.a = str;
        this.b = l;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu0)) {
            return false;
        }
        xu0 xu0Var = (xu0) obj;
        return this.a.equals(xu0Var.a) && u890.j(this.b, xu0Var.b) && u890.j(this.c, xu0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
