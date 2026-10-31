package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g9f0 implements h0r0 {
    public final kyj a;
    public final d9f0 b;
    public final jtl1 c;
    public final cbr0 d;

    public g9f0(kyj kyjVar, d9f0 d9f0Var, jtl1 jtl1Var) {
        this.a = kyjVar;
        this.b = d9f0Var;
        this.c = jtl1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.v4(), nik1.b3, (nar0) null)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.a.a(apo.j(261931381, new kmd0(this, (byte) 15), true), new dx81(new f9f0(this), new e4f0(this, (byte) 1), new dgb((byte) 15)));
    }

    public final void c(e9f0 e9f0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(425884042);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(e9f0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            d1u.v(e9f0Var, iu30Var, this.c, (qim0) null, x340Var, i2 & 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, e9f0Var, iu30Var, i, (byte) 6);
        }
    }
}
