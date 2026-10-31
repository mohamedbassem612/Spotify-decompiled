package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ycd1 {
    public final xcd1 a;
    public final jo70 b;
    public final xkk1 c;
    public final Float d;

    public ycd1(xcd1 xcd1Var, jo70 jo70Var, xkk1 xkk1Var, Float f) {
        this.a = xcd1Var;
        this.b = jo70Var;
        this.c = xkk1Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycd1)) {
            return false;
        }
        ycd1 ycd1Var = (ycd1) obj;
        return this.a.equals(ycd1Var.a) && u890.j(this.b, ycd1Var.b) && u890.j(this.c, ycd1Var.c) && u890.j(this.d, ycd1Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jo70 jo70Var = this.b;
        int iHashCode2 = (iHashCode + (jo70Var == null ? 0 : jo70Var.hashCode())) * 31;
        xkk1 xkk1Var = this.c;
        int iHashCode3 = (iHashCode2 + (xkk1Var == null ? 0 : xkk1Var.hashCode())) * 31;
        Float f = this.d;
        return iHashCode3 + (f != null ? f.hashCode() : 0);
    }
}
