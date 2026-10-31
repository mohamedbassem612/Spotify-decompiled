package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fo10 {
    public final String a;
    public final String b;
    public final qo10 c;

    public fo10(String str, String str2, qo10 qo10Var) {
        this.a = str;
        this.b = str2;
        this.c = qo10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo10)) {
            return false;
        }
        fo10 fo10Var = (fo10) obj;
        return u890.j(this.a, fo10Var.a) && u890.j(this.b, fo10Var.b) && this.c.equals(fo10Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
