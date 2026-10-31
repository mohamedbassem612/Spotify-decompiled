package p;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lzd1 extends o5 {
    public o0g1 e;
    public hym0 f;
    public xj30 g;
    public final ks40 h;

    public lzd1(ks40 ks40Var, roj1 roj1Var) {
        super(roj1Var);
        this.h = ks40Var;
    }

    @Override // p.o5
    public final void C(final int i, final long j) {
        final xj30 xj30Var = this.g;
        xj30Var.getClass();
        this.f.getClass();
        ((roj1) this.c).f(new qoj1() { // from class: p.kzd1
            @Override // p.qoj1
            public final void run() {
                lzd1 lzd1Var = this.a;
                int i2 = i;
                xj30 xj30Var2 = xj30Var;
                long j2 = j;
                ie30 ie30Var = xj30Var2.a;
                ss40 ss40Var = new ss40(i2, -1, ie30Var.w, ie30Var.x);
                o0g1 o0g1Var = lzd1Var.e;
                o0g1Var.getClass();
                o0g1Var.q(ss40Var, j2);
                LinkedHashMap linkedHashMap = x8r.a;
                synchronized (x8r.class) {
                }
            }
        }, true);
    }

    @Override // p.o5
    public final void I(xj30 xj30Var, boolean z) {
        this.g = xj30Var;
    }

    @Override // p.o5
    public final void J(hym0 hym0Var) {
        this.f = hym0Var;
    }

    @Override // p.o5
    public final void K(dos dosVar) {
        this.e = new o0g1(this.h, dosVar, (roj1) this.c);
    }

    public final void j(ss40 ss40Var) {
        ((roj1) this.c).f(new ace(this, ss40Var, (byte) 5), true);
    }

    public final void k() {
        this.e.getClass();
        roj1 roj1Var = (roj1) this.c;
        o0g1 o0g1Var = this.e;
        Objects.requireNonNull(o0g1Var);
        roj1Var.f(new vys(o0g1Var, (byte) 2), true);
    }

    @Override // p.o5
    public final synchronized void q() {
        o0g1 o0g1Var = this.e;
        o0g1Var.getClass();
        o0g1Var.onFlush();
        super.q();
    }

    @Override // p.o5
    public final int t() {
        int size;
        o0g1 o0g1Var = this.e;
        o0g1Var.getClass();
        synchronized (o0g1Var) {
            size = ((ArrayDeque) o0g1Var.f).size();
        }
        return size;
    }
}
