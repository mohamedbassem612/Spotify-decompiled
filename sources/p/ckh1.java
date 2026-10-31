package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ckh1 extends uz21 implements fka1 {
    public final r8i0 b;
    public final long c;

    public ckh1(r8i0 r8i0Var, long j) {
        this.b = r8i0Var;
        this.c = j;
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) {
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // p.uz21
    public final long d() {
        return this.c;
    }

    @Override // p.uz21
    public final gbc d1() {
        return sj1.g(this);
    }

    @Override // p.uz21
    public final r8i0 e() {
        return this.b;
    }

    @Override // p.fka1
    public final gve1 l() {
        return gve1.d;
    }

    @Override // p.uz21, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
