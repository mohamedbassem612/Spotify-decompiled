package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class io6 {
    public final mo6 a;
    public final String b;
    public final String c;

    public io6(mo6 mo6Var, String str, String str2) {
        this.a = mo6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io6)) {
            return false;
        }
        io6 io6Var = (io6) obj;
        return this.a == io6Var.a && u890.j(this.b, io6Var.b) && u890.j(this.c, io6Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
