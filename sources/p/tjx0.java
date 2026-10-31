package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tjx0 implements gtf1 {
    public final n541 a;
    public final n541 b;
    public final x6u c = new x6u();
    public final AtomicReference d = new AtomicReference(sjx0.a);

    public tjx0(n541 n541Var) {
        this.a = n541Var;
        this.b = n541Var;
    }

    @Override // p.gtf1
    public final void a(ie30 ie30Var) {
        this.a.a(ie30Var);
    }

    @Override // p.gtf1
    public final void b(long j, int i, int i2, int i3, ftf1 ftf1Var) {
        h().b(j, i, i2, i3, ftf1Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == sjx0.b) {
            this.b.A(false);
            atomicReference.set(sjx0.c);
        }
    }

    @Override // p.gtf1
    public final void c(izr0 izr0Var, int i, int i2) {
        h().c(izr0Var, i, i2);
    }

    @Override // p.gtf1
    public final int d(z0r z0rVar, int i, boolean z) {
        return h().d(z0rVar, i, z);
    }

    @Override // p.gtf1
    public final int e(z0r z0rVar, int i, boolean z) {
        return h().e(z0rVar, i, z);
    }

    @Override // p.gtf1
    public final void f(int i, izr0 izr0Var) {
        h().f(i, izr0Var);
    }

    public final gtf1 h() {
        return this.d.get() == sjx0.c ? this.c : this.b;
    }

    @Override // p.gtf1
    public final void g(long j) {
    }
}
