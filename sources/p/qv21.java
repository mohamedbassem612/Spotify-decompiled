package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qv21 {
    public final String a;
    public final String b;
    public final hvu0 c;

    public qv21(String str, String str2, hvu0 hvu0Var) {
        this.a = str;
        this.b = str2;
        this.c = hvu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv21)) {
            return false;
        }
        qv21 qv21Var = (qv21) obj;
        return u890.j(this.a, qv21Var.a) && u890.j(this.b, qv21Var.b) && u890.j(this.c, qv21Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        hvu0 hvu0Var = this.c;
        return iHashCode2 + (hvu0Var != null ? hvu0Var.hashCode() : 0);
    }
}
