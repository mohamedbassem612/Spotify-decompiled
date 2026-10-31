package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nvi0 implements qp00 {
    public final qp00 a;
    public final pnf1 b;

    public nvi0(qp00 qp00Var, pnf1 pnf1Var) {
        this.a = qp00Var;
        this.b = pnf1Var;
    }

    @Override // p.qp00
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override // p.qp00
    public final boolean b(long j, yag yagVar, List list) {
        return this.a.b(j, yagVar, list);
    }

    @Override // p.qp00
    public final int c() {
        return this.a.c();
    }

    @Override // p.qp00
    public final void d() {
        this.a.d();
    }

    @Override // p.qp00
    public final ie30 e(int i) {
        return this.b.d[this.a.f(i)];
    }

    public final boolean equals(Object obj) {
        if (u(obj) && (obj instanceof nvi0)) {
            return this.b.equals(((nvi0) obj).b);
        }
        return false;
    }

    @Override // p.qp00
    public final int f(int i) {
        return this.a.f(i);
    }

    @Override // p.qp00
    public final void g() {
        this.a.g();
    }

    @Override // p.qp00
    public final boolean h(int i, long j) {
        return this.a.h(i, j);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // p.qp00
    public final void i(float f) {
        this.a.i(f);
    }

    @Override // p.qp00
    public final Object j() {
        return this.a.j();
    }

    @Override // p.qp00
    public final void k() {
        this.a.k();
    }

    @Override // p.qp00
    public final void l(long j, long j2, long j3, List list, vjh0[] vjh0VarArr) {
        this.a.l(j, j2, j3, list, vjh0VarArr);
    }

    @Override // p.qp00
    public final int length() {
        return this.a.length();
    }

    @Override // p.qp00
    public final int m(int i) {
        return this.a.m(i);
    }

    @Override // p.qp00
    public final pnf1 n() {
        return this.b;
    }

    @Override // p.qp00
    public final void o(boolean z) {
        this.a.o(z);
    }

    @Override // p.qp00
    public final void p() {
        this.a.p();
    }

    @Override // p.qp00
    public final int q(long j, List list) {
        return this.a.q(j, list);
    }

    @Override // p.qp00
    public final int r() {
        return this.a.r();
    }

    @Override // p.qp00
    public final ie30 s() {
        return this.b.d[this.a.r()];
    }

    @Override // p.qp00
    public final int t() {
        return this.a.t();
    }

    public final boolean u(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nvi0) {
            return this.a.equals(((nvi0) obj).a);
        }
        return false;
    }

    @Override // p.qp00
    public final void v() {
        this.a.v();
    }
}
