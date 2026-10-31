package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qwt0 {
    public final pwt0 a;
    public final pwt0 b;

    public qwt0(pwt0 pwt0Var, pwt0 pwt0Var2) {
        this.a = pwt0Var;
        this.b = pwt0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwt0)) {
            return false;
        }
        qwt0 qwt0Var = (qwt0) obj;
        return this.a == qwt0Var.a && this.b == qwt0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
