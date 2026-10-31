package p;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp/yk70;", "Lp/uim0;", "Lp/zk70;", "glimmer"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class yk70 extends uim0 {
    public final x9h a;
    public final jmr0 b;

    public yk70(x9h x9hVar, jmr0 jmr0Var) {
        this.a = x9hVar;
        this.b = jmr0Var;
    }

    public final pim0 a() {
        return new zk70(this.a, this.b);
    }

    public final void b(pim0 pim0Var) {
        zk70 zk70Var = (zk70) pim0Var;
        jmr0 jmr0Var = zk70Var.R0;
        jmr0 jmr0Var2 = this.b;
        boolean zJ = u890.j(jmr0Var, jmr0Var2);
        x9h x9hVar = zk70Var.Q0;
        x9h x9hVar2 = this.a;
        if (u890.j(x9hVar, x9hVar2) && zJ) {
            return;
        }
        zk70Var.Q0 = x9hVar2;
        zk70Var.R0 = jmr0Var2;
        cqc cqcVar = zk70Var.S0;
        if (zJ) {
            ha71.x(cqcVar);
        } else {
            cqcVar.H1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk70)) {
            return false;
        }
        yk70 yk70Var = (yk70) obj;
        return u890.j(this.a, yk70Var.a) && u890.j(this.b, yk70Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(false) * 31;
        x9h x9hVar = this.a;
        return this.b.hashCode() + ((iHashCode + (x9hVar != null ? x9hVar.hashCode() : 0)) * 31);
    }
}
