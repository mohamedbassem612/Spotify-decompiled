package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e01 {
    public final String a;
    public final String b;
    public final Long c;

    public e01(Long l, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e01)) {
            return false;
        }
        e01 e01Var = (e01) obj;
        return u890.j(this.a, e01Var.a) && u890.j(this.b, e01Var.b) && u890.j(this.c, e01Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
