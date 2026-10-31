package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ap10 {
    public final String a;
    public final String b;
    public final ep10 c;

    public ap10(String str, String str2, ep10 ep10Var) {
        this.a = str;
        this.b = str2;
        this.c = ep10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap10)) {
            return false;
        }
        ap10 ap10Var = (ap10) obj;
        return u890.j(this.a, ap10Var.a) && u890.j(this.b, ap10Var.b) && this.c.equals(ap10Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
