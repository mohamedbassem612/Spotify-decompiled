package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ml91 {
    public final il91 a;
    public final rqq b;

    public ml91(il91 il91Var, rqq rqqVar) {
        this.a = il91Var;
        this.b = rqqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ml91) {
            ml91 ml91Var = (ml91) obj;
            if (this.a == ml91Var.a && u890.j(this.b, ml91Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
