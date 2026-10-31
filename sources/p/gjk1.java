package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gjk1 implements n3d {
    public final n3d a;
    public final ijk1 b;
    public final jjk1 c;
    public final hjk1 d;

    public gjk1(n3d n3dVar, hjk1 hjk1Var, uh61 uh61Var) {
        this.a = n3dVar;
        this.d = hjk1Var;
        this.b = new ijk1(n3dVar.c());
        this.c = new jjk1(n3dVar.g());
    }

    @Override // p.d4i1
    public final void b(e4i1 e4i1Var) {
        w8p1.m();
        this.d.b(e4i1Var);
    }

    @Override // p.n3d
    public final c3d c() {
        return this.b;
    }

    @Override // p.d4i1
    public final void e(e4i1 e4i1Var) {
        w8p1.m();
        this.d.e(e4i1Var);
    }

    @Override // p.n3d
    public final l3d g() {
        return this.c;
    }

    @Override // p.d4i1
    public final void i(e4i1 e4i1Var) {
        w8p1.m();
        this.d.i(e4i1Var);
    }

    @Override // p.d4i1
    public final void j(e4i1 e4i1Var) {
        w8p1.m();
        this.d.j(e4i1Var);
    }

    @Override // p.n3d
    public final yfp0 k() {
        return this.a.k();
    }

    @Override // p.n3d
    public final void l(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p.n3d
    public final void m(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p.n3d
    public final boolean n() {
        return false;
    }
}
