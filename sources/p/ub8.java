package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ub8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Float e;

    public ub8(String str, String str2, String str3, String str4, Float f) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub8)) {
            return false;
        }
        ub8 ub8Var = (ub8) obj;
        return this.a.equals(ub8Var.a) && u890.j(this.b, ub8Var.b) && u890.j(this.c, ub8Var.c) && u890.j(this.d, ub8Var.d) && u890.j(this.e, ub8Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.e;
        return iHashCode4 + (f != null ? f.hashCode() : 0);
    }
}
