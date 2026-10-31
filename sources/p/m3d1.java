package p;

import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m3d1 extends j2t {
    public final pzc o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mzc f90p;
    public j2t q;
    public d4d1 r;

    public m3d1(Size size, int i) {
        super(size, i);
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = x0d.class;
        try {
            this.f90p = mzcVar;
            mzcVar.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            pzcVar.a(e);
        }
        this.o = pzcVar;
    }

    @Override // p.j2t
    public final void a() {
        super.a();
        w8p1.y(new j3d1(this, (byte) 2));
    }

    @Override // p.j2t
    public final n8d0 f() {
        return this.o;
    }

    public final boolean g(j2t j2tVar, Runnable runnable) {
        boolean z;
        Size size = this.h;
        w8p1.m();
        j2tVar.getClass();
        int i = j2tVar.i;
        Size size2 = j2tVar.h;
        j2t j2tVar2 = this.q;
        if (j2tVar2 == j2tVar) {
            return false;
        }
        o0c.q("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", j2tVar2 == null);
        o0c.k("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i2 = this.i;
        o0c.k(l1d.j(i2, i, "The provider's format(", ") must match the parent(", ")"), i2 == i);
        synchronized (this.a) {
            z = this.c;
        }
        o0c.q("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.q = j2tVar;
        poz0.G(true, j2tVar.c(), this.f90p, n5u.a());
        j2tVar.d();
        poz0.F(this.e).b(new i2t(j2tVar, (byte) 2), n5u.a());
        poz0.F(j2tVar.g).b(runnable, x2g0.A());
        return true;
    }
}
