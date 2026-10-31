package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nye0 implements h0r0 {
    public final iye0 a;
    public final bza0 b;
    public final pe c;
    public final yuj d;
    public final pye0 e;
    public final kye0 f;
    public final na9 g;
    public final u7e0 h;

    public nye0(iye0 iye0Var, bza0 bza0Var, pe peVar, yuj yujVar, pye0 pye0Var, kye0 kye0Var, na9 na9Var, u7e0 u7e0Var) {
        this.a = iye0Var;
        this.b = bza0Var;
        this.c = peVar;
        this.d = yujVar;
        this.e = pye0Var;
        this.f = kye0Var;
        this.g = na9Var;
        this.h = u7e0Var;
    }

    @Override // p.h0r0
    public final cbr0 a() {
        yxe1 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.l3(), this.e.getViewUri(), (nar0) null), new t1r0(true), new s9h1(14, true, false, false), new kce0()}, false);
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return yuj.b(this.d, this.h.a(f610.e(new p6e0[0], new oxa0(this, (lnm) null, (byte) 7)), this.e.g() == 2, nik1.W1.a), apo.j(-521817791, new kmd0(this, (byte) 10), true), new n7e0(new mye0(this), new fc3(this, (byte) 15), va20.X, gje0.X0));
    }
}
