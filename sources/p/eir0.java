package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eir0 implements xnh1 {
    public final n6r0 a;
    public final qir0 b;
    public final qir0 c;

    public eir0(n6r0 n6r0Var, qir0 qir0Var, qir0 qir0Var2) {
        this.a = n6r0Var;
        this.b = qir0Var;
        this.c = qir0Var2;
    }

    public static eir0 d(eir0 eir0Var, qir0 qir0Var, qir0 qir0Var2, int i) {
        n6r0 n6r0Var = eir0Var.a;
        if ((i & 2) != 0) {
            qir0Var = eir0Var.b;
        }
        if ((i & 4) != 0) {
            qir0Var2 = eir0Var.c;
        }
        return new eir0(n6r0Var, qir0Var, qir0Var2);
    }

    @Override // p.xnh1
    public final n6r0 a() {
        return this.a;
    }

    @Override // p.xnh1
    public final xnh1 b(qir0 qir0Var) {
        return d(this, qir0Var, null, 5);
    }

    @Override // p.xnh1
    public final xnh1 c(qir0 qir0Var) {
        return d(this, null, qir0Var, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eir0)) {
            return false;
        }
        eir0 eir0Var = (eir0) obj;
        return u890.j(this.a, eir0Var.a) && u890.j(this.b, eir0Var.b) && u890.j(this.c, eir0Var.c);
    }

    @Override // p.xnh1
    public final qir0 getPageUri() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qir0 qir0Var = this.b;
        int iHashCode2 = (iHashCode + (qir0Var == null ? 0 : qir0Var.a.hashCode())) * 31;
        qir0 qir0Var2 = this.c;
        return iHashCode2 + (qir0Var2 != null ? qir0Var2.a.hashCode() : 0);
    }

    public /* synthetic */ eir0(n6r0 n6r0Var, qir0 qir0Var, int i) {
        this(n6r0Var, (i & 2) != 0 ? null : qir0Var, (qir0) null);
    }
}
