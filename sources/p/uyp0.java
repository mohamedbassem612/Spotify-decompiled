package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uyp0 extends uz21 {
    public final uz21 b;
    public final ff01 c;
    public IOException d;

    public uyp0(uz21 uz21Var) {
        this.b = uz21Var;
        this.c = sj1.g(new lpc(this, uz21Var.d1()));
    }

    @Override // p.uz21, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // p.uz21
    public final long d() {
        return this.b.d();
    }

    @Override // p.uz21
    public final gbc d1() {
        return this.c;
    }

    @Override // p.uz21
    public final r8i0 e() {
        return this.b.e();
    }
}
