package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v7w0 implements h0r0 {
    public final s7w0 a;
    public final hvj b;
    public final uic c;
    public final ngs0 d;
    public final cbr0 e;

    public v7w0(s7w0 s7w0Var, hvj hvjVar, uic uicVar, ngs0 ngs0Var) {
        this.a = s7w0Var;
        this.b = hvjVar;
        this.c = uicVar;
        this.d = ngs0Var;
        dbr0 stm0Var = new stm0();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{stm0Var, new bn70(yon1.G1("BLUEJAY_BRIEF_PRESET_PREVIEW", "bluejay/brief-preset-preview", 225, "bluejay"), nik1.q6, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return hvj.b(this.b, f4p1.g(this.a), new j2i(604540863, new dvt0(this, (byte) 12), true));
    }

    public final void c(b0k b0kVar, int i) {
        h311 h311VarV;
        u7w0 u7w0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1515676977);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            s7w0 s7w0Var = this.a;
            ven0 ven0VarH = rwq.h(s7w0Var.g, x340Var, 0);
            boolean zG = x340Var.g(cir0Var.h()) | x340Var.g(cir0Var.g());
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = new n7w0(cir0Var.h(), s7w0Var, this.c);
                x340Var.s0(objT2);
            }
            n7w0 n7w0Var = (n7w0) objT2;
            a8w0 a8w0Var = (a8w0) ven0VarH.getValue();
            y7w0 y7w0Var = a8w0Var instanceof y7w0 ? (y7w0) a8w0Var : null;
            if (y7w0Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    u7w0Var = new u7w0(this, i, (byte) 1);
                }
            } else {
                t7w0 t7w0Var = y7w0Var.a;
                boolean zI = x340Var.i(c9nVar) | x340Var.i(n7w0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == obj) {
                    objT3 = new hzu0(c9nVar, n7w0Var, (byte) 19);
                    x340Var.s0(objT3);
                }
                iu30 iu30Var = (iu30) objT3;
                boolean zI2 = x340Var.i(cir0Var);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == obj) {
                    objT4 = new xrs(cir0Var, (byte) 1);
                    x340Var.s0(objT4);
                }
                otw.c(this.d, new g7w0(t7w0Var, iu30Var, (iu30) objT4), (qim0) null, (ipb1) null, x340Var, 0, 12);
            }
            h311VarV.d = u7w0Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            u7w0Var = new u7w0(this, i, (byte) 0);
            h311VarV.d = u7w0Var;
        }
    }
}
