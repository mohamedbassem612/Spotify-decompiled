package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yxy0 implements xxy0 {
    public final xxy0 b;
    public final xxy0 c;
    public final kly0 d;

    public yxy0(xxy0 xxy0Var, xxy0 xxy0Var2, caq caqVar) {
        this.b = xxy0Var;
        this.c = xxy0Var2;
        this.d = caqVar;
    }

    public final void a() {
        this.b.a();
        this.c.a();
    }

    public final void b(int i, String str) {
        f().b(i, str);
    }

    public final void c() {
        f().c();
    }

    public final Completable d() {
        return f().d();
    }

    public final Completable e() {
        return f().e();
    }

    public final xxy0 f() {
        return ((zg4) this.d.get()).b() ? this.c : this.b;
    }
}
