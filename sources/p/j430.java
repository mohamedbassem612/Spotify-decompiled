package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j430 {
    public final vnb1 a;
    public final String b;
    public final fcl c;

    public j430(vnb1 vnb1Var, String str, fcl fclVar) {
        this.a = vnb1Var;
        this.b = str;
        this.c = fclVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j430)) {
            return false;
        }
        j430 j430Var = (j430) obj;
        return this.a.equals(j430Var.a) && u890.j(this.b, j430Var.b) && this.c.equals(j430Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
