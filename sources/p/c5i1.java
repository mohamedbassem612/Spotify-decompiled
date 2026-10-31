package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c5i1 {
    public final String a;
    public final String b;
    public final String c;

    public c5i1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5i1)) {
            return false;
        }
        c5i1 c5i1Var = (c5i1) obj;
        return u890.j(this.a, c5i1Var.a) && u890.j(this.b, c5i1Var.b) && u890.j(this.c, c5i1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
