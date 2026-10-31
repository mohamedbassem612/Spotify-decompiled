package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pw81 extends pim0 implements m7v, sjp0 {
    public hw61 O0;
    public bw61 P0;
    public v9v Q0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pw81)) {
            return false;
        }
        pw81 pw81Var = (pw81) obj;
        return u890.j(this.O0, pw81Var.O0) && u890.j(this.P0, pw81Var.P0);
    }

    public final void f0() {
        this.Q0 = null;
        ha71.x(this);
    }

    public final int hashCode() {
        return this.P0.hashCode() + (this.O0.hashCode() * 31);
    }

    public final void t0(lsl lslVar) {
        v9v v9vVar;
        v9v v9vVar2 = this.Q0;
        if (v9vVar2 == null) {
            em3 em3VarA = oap1.y(this).a();
            hw61 hw61Var = this.O0;
            bw61 bw61Var = this.P0;
            em3VarA.getClass();
            v9v v9vVar3 = new v9v(hw61Var, bw61Var, em3VarA);
            this.Q0 = v9vVar3;
            v9vVar = v9vVar3;
        } else {
            v9vVar = v9vVar2;
        }
        jmr0.g(v9vVar, lslVar, lslVar.j(), 0.0f, (f2b) null, 6);
        lslVar.s1();
    }
}
