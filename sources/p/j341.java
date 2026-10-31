package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j341 {
    public final String a;
    public final String b;

    public j341(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a(vu30 vu30Var) {
        String str;
        String str2 = this.a;
        String str3 = this.b;
        return (str3 == null || (str = (String) vu30Var.invoke(str2, str3)) == null) ? str2 : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j341)) {
            return false;
        }
        j341 j341Var = (j341) obj;
        return this.a.equals(j341Var.a) && u890.j(this.b, j341Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
