package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gnn implements rtn0 {
    public final onn a;
    public final bpb1 b;
    public final xe01 c;

    public gnn(onn onnVar) {
        this.a = onnVar;
        bpb1 bpb1VarB = gio1.b(yln.a);
        this.b = bpb1VarB;
        this.c = d5p1.h(bpb1VarB);
    }

    public final void a(otn0 otn0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(943310529);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(otn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Float f = (Float) xto.j(this.a.b, x340Var).getValue();
            Float fValueOf = f != null ? Float.valueOf(yoi1.o(f.floatValue(), -1.0f, 1.0f)) : null;
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new fnn(this, (byte) 0);
                x340Var.s0(objT);
            }
            s110.c(otn0Var, fValueOf, ern1.x(qim0Var, (iu30) objT), x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(this, otn0Var, qim0Var, i, (byte) 22);
        }
    }
}
