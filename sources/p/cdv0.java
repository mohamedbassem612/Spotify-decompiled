package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cdv0 implements d441 {
    public final d441 a;
    public final long b = s8p1.m();
    public final /* synthetic */ jdv0 c;

    public cdv0(jdv0 jdv0Var, d441 d441Var) {
        this.c = jdv0Var;
        this.a = d441Var;
    }

    public final void K(int i, String str) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            this.a.K(i, str);
        } else {
            vby0.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final String P0(int i) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            return this.a.P0(i);
        }
        vby0.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    public final void close() throws Exception {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            this.a.close();
        } else {
            vby0.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final boolean f1() {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            return this.a.f1();
        }
        vby0.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    public final byte[] getBlob(int i) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            return this.a.getBlob(i);
        }
        vby0.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    public final int getColumnCount() {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            return this.a.getColumnCount();
        }
        vby0.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    public final String getColumnName(int i) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            return this.a.getColumnName(i);
        }
        vby0.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    public final long getLong(int i) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            return this.a.getLong(i);
        }
        vby0.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    public final boolean isNull(int i) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            return this.a.isNull(i);
        }
        vby0.y(21, "Attempted to use statement on a different thread");
        throw null;
    }

    public final void n(byte[] bArr, int i) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            this.a.n(bArr, i);
        } else {
            vby0.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void r(int i, long j) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            this.a.r(i, j);
        } else {
            vby0.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void reset() {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            this.a.reset();
        } else {
            vby0.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void s(double d, int i) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            this.a.s(d, i);
        } else {
            vby0.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void t(int i) {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            this.a.t(i);
        } else {
            vby0.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final void x() {
        if (this.c.e) {
            vby0.y(21, "Statement is recycled");
            throw null;
        }
        if (this.b == s8p1.m()) {
            this.a.x();
        } else {
            vby0.y(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
