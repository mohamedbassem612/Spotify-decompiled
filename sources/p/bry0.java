package p;

import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bry0 implements h0r0 {
    public final yuj a;
    public final g0c1 b;
    public final yqy0 c;
    public final jtl1 d;
    public final cbr0 e;

    public bry0(yuj yujVar, g0c1 g0c1Var, yqy0 yqy0Var, jtl1 jtl1Var) {
        this.a = yujVar;
        this.b = g0c1Var;
        this.c = yqy0Var;
        this.d = jtl1Var;
        dbr0 yxe1Var = new yxe1(new jx21(2131960686));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.e = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("PUFFIN_INTRO", "puffin/intro", 1596, "puffin"), nik1.c3, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        g0c1 g0c1Var = this.b;
        return this.a.a(bbp1.g(new ObservableFromPublisher(g0c1Var.a).firstOrError().flatMap(new o2b1(g0c1Var, (byte) 3))), new j2i(184792289, new ixt0(this, (byte) 20), true), new n7e0(new ary0(this), new y6w0(this, (byte) 22), new nfb((byte) 21, false), null), new xvj((xu30) null, (j2i) null, (j2i) null, false, 63));
    }

    public final void c(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1840802908);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            y4o1.i(iu30Var, this.d, (qim0) null, x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(this, iu30Var, i, (byte) 22);
        }
    }
}
