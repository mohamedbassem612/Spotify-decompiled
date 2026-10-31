package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class upi0 {
    public final boolean a;
    public final jwm b;
    public final jwm c;

    public upi0(boolean z, jwm jwmVar, jwm jwmVar2) {
        this.a = z;
        this.b = jwmVar;
        this.c = jwmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upi0)) {
            return false;
        }
        upi0 upi0Var = (upi0) obj;
        return this.a == upi0Var.a && u890.j(this.b, upi0Var.b) && this.c.equals(upi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
