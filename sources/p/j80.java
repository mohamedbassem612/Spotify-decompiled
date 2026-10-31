package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class j80 implements n80 {
    public final String a;
    public final String b;
    public final Long c;

    public j80(Long l, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return u890.j(this.a, j80Var.a) && u890.j(this.b, j80Var.b) && u890.j(this.c, j80Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public /* synthetic */ j80(String str, String str2) {
        this(null, str, str2);
    }
}
