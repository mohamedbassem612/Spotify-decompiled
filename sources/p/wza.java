package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wza {
    public final jo70 a;
    public final jo70 b;
    public final xkk1 c;
    public final xkk1 d;

    public wza(jo70 jo70Var, jo70 jo70Var2, xkk1 xkk1Var, xkk1 xkk1Var2) {
        this.a = jo70Var;
        this.b = jo70Var2;
        this.c = xkk1Var;
        this.d = xkk1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wza)) {
            return false;
        }
        wza wzaVar = (wza) obj;
        return u890.j(this.a, wzaVar.a) && u890.j(this.b, wzaVar.b) && u890.j(this.c, wzaVar.c) && u890.j(this.d, wzaVar.d);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        jo70 jo70Var2 = this.b;
        int iHashCode2 = (iHashCode + (jo70Var2 == null ? 0 : jo70Var2.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        int iHashCode3 = (iHashCode2 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        xkk1 xkk1Var2 = this.d;
        return iHashCode3 + (xkk1Var2 != null ? xkk1Var2.hashCode() : 0);
    }
}
