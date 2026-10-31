package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j1d1 extends n1d1 {
    public final l1d1 d;

    public j1d1(sk30 sk30Var, String str, l1d1 l1d1Var) {
        super(sk30Var, str);
        this.d = l1d1Var;
    }

    public final void K(int i, String str) {
        this.d.K(i, str);
    }

    public final String P0(int i) {
        return this.d.P0(i);
    }

    public final void close() {
        this.d.close();
    }

    public final boolean f1() {
        l1d1 l1d1Var = this.d;
        boolean zF1 = l1d1Var.f1();
        boolean zEqualsIgnoreCase = l1d1Var.P0(0).equalsIgnoreCase("wal");
        sk30 sk30Var = ((n1d1) this).a;
        if (zEqualsIgnoreCase) {
            sk30Var.a.enableWriteAheadLogging();
            return zF1;
        }
        sk30Var.a.disableWriteAheadLogging();
        return zF1;
    }

    public final byte[] getBlob(int i) {
        return this.d.getBlob(i);
    }

    public final boolean getBoolean() {
        return this.d.getBoolean();
    }

    public final int getColumnCount() {
        return this.d.getColumnCount();
    }

    public final String getColumnName(int i) {
        return this.d.getColumnName(i);
    }

    public final long getLong(int i) {
        return this.d.getLong(i);
    }

    public final boolean isNull(int i) {
        return this.d.isNull(i);
    }

    public final void n(byte[] bArr, int i) {
        this.d.n(bArr, i);
    }

    public final void r(int i, long j) {
        this.d.r(i, j);
    }

    public final void reset() {
        this.d.reset();
    }

    public final void s(double d, int i) {
        this.d.s(d, i);
    }

    public final void t(int i) {
        this.d.t(i);
    }

    public final void x() {
        this.d.x();
    }
}
