package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hlk0 {
    public final Double a;
    public final String b;
    public final String c;

    public hlk0(Double d, String str, String str2) {
        this.a = d;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlk0)) {
            return false;
        }
        hlk0 hlk0Var = (hlk0) obj;
        return u890.j(this.a, hlk0Var.a) && u890.j(this.b, hlk0Var.b) && u890.j(this.c, hlk0Var.c);
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
