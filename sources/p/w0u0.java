package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0u0 {
    public final ktl a;
    public final Boolean b;
    public final jo70 c;
    public final jo70 d;
    public final String e;

    public w0u0(ktl ktlVar, Boolean bool, jo70 jo70Var, jo70 jo70Var2, String str) {
        this.a = ktlVar;
        this.b = bool;
        this.c = jo70Var;
        this.d = jo70Var2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0u0)) {
            return false;
        }
        w0u0 w0u0Var = (w0u0) obj;
        return this.a == w0u0Var.a && u890.j(this.b, w0u0Var.b) && u890.j(this.c, w0u0Var.c) && u890.j(this.d, w0u0Var.d) && u890.j(this.e, w0u0Var.e);
    }

    public final int hashCode() {
        ktl ktlVar = this.a;
        int iHashCode = (ktlVar == null ? 0 : ktlVar.hashCode()) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        jo70 jo70Var = this.c;
        int iHashCode3 = (iHashCode2 + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        jo70 jo70Var2 = this.d;
        int iHashCode4 = (iHashCode3 + (jo70Var2 == null ? 0 : jo70Var2.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ w0u0() {
        this(null, null, null, null, null);
    }
}
