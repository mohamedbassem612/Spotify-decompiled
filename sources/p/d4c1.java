package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d4c1 {
    public final String a;
    public final String b;
    public final h290 c;

    public d4c1(String str, String str2, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4c1)) {
            return false;
        }
        d4c1 d4c1Var = (d4c1) obj;
        return this.a.equals(d4c1Var.a) && u890.j(this.b, d4c1Var.b) && this.c.equals(d4c1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
