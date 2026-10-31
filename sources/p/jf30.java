package p;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jf30 extends gve1 {
    public gve1 e;

    public jf30(gve1 gve1Var) {
        this.e = gve1Var;
    }

    @Override // p.gve1
    public final gve1 a() {
        return this.e.a();
    }

    @Override // p.gve1
    public final gve1 b() {
        return this.e.b();
    }

    @Override // p.gve1
    public final long c() {
        return this.e.c();
    }

    @Override // p.gve1
    public final gve1 d(long j) {
        return this.e.d(j);
    }

    @Override // p.gve1
    public final boolean e() {
        return this.e.e();
    }

    @Override // p.gve1
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // p.gve1
    public final gve1 g(long j, TimeUnit timeUnit) {
        return this.e.g(j, timeUnit);
    }

    @Override // p.gve1
    public final long h() {
        return this.e.h();
    }
}
