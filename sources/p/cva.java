package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cva implements d441 {
    public final /* synthetic */ byte a;
    public final d441 b;

    public /* synthetic */ cva(d441 d441Var, byte b) {
        this.a = b;
        this.b = d441Var;
    }

    public final void K(int i, String str) {
        byte b = this.a;
        d441 d441Var = this.b;
        switch (b) {
            case 0:
                d441Var.K(i, str);
                break;
            default:
                d441Var.K(i, str);
                break;
        }
    }

    public final String P0(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.P0(i);
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                d441 d441Var = this.b;
                d441Var.reset();
                d441Var.x();
                return;
        }
    }

    public final boolean f1() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.f1();
        }
    }

    public final byte[] getBlob(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getBlob(i);
        }
    }

    public final boolean getBoolean() {
        byte b = this.a;
        d441 d441Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return d441Var.getBoolean();
    }

    public final int getColumnCount() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getColumnCount();
        }
    }

    public final String getColumnName(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getColumnName(i);
        }
    }

    public final long getLong(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.getLong(i);
        }
    }

    public final boolean isNull(int i) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                return this.b.isNull(i);
        }
    }

    public final void n(byte[] bArr, int i) {
        byte b = this.a;
        d441 d441Var = this.b;
        switch (b) {
            case 0:
                d441Var.n(bArr, i);
                break;
            default:
                d441Var.n(bArr, i);
                break;
        }
    }

    public final void r(int i, long j) {
        byte b = this.a;
        d441 d441Var = this.b;
        switch (b) {
            case 0:
                d441Var.r(i, j);
                break;
            default:
                d441Var.r(i, j);
                break;
        }
    }

    public final void reset() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
            default:
                this.b.reset();
                return;
        }
    }

    public final void s(double d, int i) {
        byte b = this.a;
        d441 d441Var = this.b;
        switch (b) {
            case 0:
                d441Var.s(d, i);
                break;
            default:
                d441Var.s(d, i);
                break;
        }
    }

    public final void t(int i) {
        byte b = this.a;
        d441 d441Var = this.b;
        switch (b) {
            case 0:
                d441Var.t(i);
                break;
            default:
                d441Var.t(i);
                break;
        }
    }

    public final void x() {
        byte b = this.a;
        d441 d441Var = this.b;
        switch (b) {
            case 0:
                d441Var.x();
                break;
            default:
                d441Var.x();
                break;
        }
    }
}
