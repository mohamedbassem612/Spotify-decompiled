package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k1d1 extends n1d1 {
    public final yk30 d;

    public k1d1(sk30 sk30Var, String str) {
        super(sk30Var, str);
        this.d = sk30Var.d(str);
    }

    @Override // p.d441
    public final void K(int i, String str) {
        a();
        this.d.w0(i, str);
    }

    @Override // p.d441
    public final String P0(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
        this.c = true;
    }

    @Override // p.d441
    public final boolean f1() {
        a();
        this.d.b.execute();
        return false;
    }

    @Override // p.d441
    public final byte[] getBlob(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    @Override // p.d441
    public final int getColumnCount() {
        a();
        return 0;
    }

    @Override // p.d441
    public final String getColumnName(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    @Override // p.d441
    public final long getLong(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    @Override // p.d441
    public final boolean isNull(int i) {
        a();
        vby0.y(21, "no row");
        throw null;
    }

    @Override // p.d441
    public final void n(byte[] bArr, int i) {
        a();
        this.d.n(bArr, i);
    }

    @Override // p.d441
    public final void r(int i, long j) {
        a();
        this.d.r(i, j);
    }

    @Override // p.d441
    public final void s(double d, int i) {
        a();
        this.d.s(d, i);
    }

    @Override // p.d441
    public final void t(int i) {
        a();
        this.d.t(i);
    }

    @Override // p.n1d1, p.d441
    public final void x() {
        a();
        this.d.x();
    }
}
