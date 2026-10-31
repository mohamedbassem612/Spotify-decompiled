package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class db80 {
    public final bfn0 a = new bfn0(0, new cb80[16]);
    public final hrr0 b = v8r.q(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final hrr0 d = v8r.q(Boolean.TRUE);

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-318043801);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                x340Var.i0(-144841960);
                boolean zI = x340Var.i(this);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new rzu(ven0Var, this, (lnm) null, (byte) 22);
                    x340Var.s0(objT2);
                }
                qxd0.t(this, x340Var, (vu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(-143455237);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w9(this, i, (byte) 9);
        }
    }
}
