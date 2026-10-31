package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jwv0 extends ayq0 {
    public final String b;
    public final String c;
    public final ave0 d;

    public jwv0(String str, String str2, ave0 ave0Var) {
        super(6);
        this.b = str;
        this.c = str2;
        this.d = ave0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwv0)) {
            return false;
        }
        jwv0 jwv0Var = (jwv0) obj;
        return u890.j(this.b, jwv0Var.b) && u890.j(this.c, jwv0Var.c) && this.d.equals(jwv0Var.d);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
