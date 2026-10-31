package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r1d extends fai0 {
    public final jy8 N0;
    public kdn0 Z;

    public r1d(jy8 jy8Var) {
        this.N0 = jy8Var;
    }

    public final Object e() {
        kdn0 kdn0Var = this.Z;
        return kdn0Var == null ? this.N0 : kdn0Var.e();
    }

    public final void n(ymd0 ymd0Var, rjp0 rjp0Var) {
        throw new UnsupportedOperationException();
    }

    public final void o(kdn0 kdn0Var) {
        eai0 eai0Var;
        kdn0 kdn0Var2 = this.Z;
        if (kdn0Var2 != null && (eai0Var = (eai0) ((fai0) this).Y.c(kdn0Var2)) != null) {
            eai0Var.a.k(eai0Var);
        }
        this.Z = kdn0Var;
        super.n(kdn0Var, new q1d(this, (byte) 0));
    }
}
