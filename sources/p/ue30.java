package p;

import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ue30 implements l3d {
    public final l3d a;

    public ue30(l3d l3dVar) {
        this.a = l3dVar;
    }

    @Override // p.l3d
    public int a() {
        return this.a.a();
    }

    @Override // p.l3d
    public String b() {
        return this.a.b();
    }

    @Override // p.l3d
    public final void c(d2d d2dVar) {
        this.a.c(d2dVar);
    }

    @Override // p.l3d
    public final int d() {
        return this.a.d();
    }

    @Override // p.l3d
    public final List e(int i) {
        return this.a.e(i);
    }

    @Override // p.l3d
    public final g4r f() {
        return this.a.f();
    }

    @Override // p.l3d
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override // p.l3d
    public l3d getImplementation() {
        return this.a.getImplementation();
    }

    @Override // p.l3d
    public final void h(Executor executor, a1d a1dVar) {
        this.a.h(executor, a1dVar);
    }

    @Override // p.l3d
    public final String i() {
        return this.a.i();
    }

    @Override // p.l3d
    public int j(int i) {
        return this.a.j(i);
    }
}
