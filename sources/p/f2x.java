package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f2x implements b1x {
    public final ao0 a;
    public final txo b;

    public f2x(ao0 ao0Var, txo txoVar) {
        this.a = ao0Var;
        this.b = txoVar;
    }

    public final Object a(ji0 ji0Var, lnm lnmVar) {
        t7d1 t7d1Var;
        s4d1 s4d1VarK = l2p1.k(ji0Var);
        if (s4d1VarK != null) {
            s7d1 s7d1Var = s4d1VarK.b;
            t7d1Var = new t7d1(s7d1Var.a, s7d1Var.b);
        } else {
            t7d1Var = null;
        }
        x6d1 x6d1Var = new x6d1(ji0Var, 0, false, t7d1Var);
        vxo1 vxo1VarW = suo1.w(x6d1Var);
        if (!(vxo1VarW instanceof uri1)) {
            return x6d1Var;
        }
        co0 co0Var = co0.i;
        String str = ji0Var.a;
        k6d1 k6d1Var = ((uri1) vxo1VarW).c;
        ao0.a(this.a, co0Var, str, (Long) null, (String) k6d1Var.a, (String) null, 116);
        return new m231(new IllegalStateException((String) k6d1Var.b));
    }

    public final boolean b(ji0 ji0Var) {
        return l2p1.k(ji0Var) != null;
    }

    public final xu30 c() {
        return new oat(this, (byte) 27);
    }
}
