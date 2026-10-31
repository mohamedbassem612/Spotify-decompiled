package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y9d0 {
    public final uqo a;
    public final aad0 b;
    public final lax c;

    public y9d0(uqo uqoVar, aad0 aad0Var, lax laxVar) {
        this.a = uqoVar;
        this.b = aad0Var;
        this.c = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9d0)) {
            return false;
        }
        y9d0 y9d0Var = (y9d0) obj;
        return this.a.equals(y9d0Var.a) && this.b.equals(y9d0Var.b) && u890.j(this.c, y9d0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
