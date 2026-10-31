package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vt50 extends wt50 implements Serializable {
    public final int b;

    public vt50(int i) {
        this.b = i;
    }

    @Override // p.wt50
    public final byte[] a() {
        int i = this.b;
        return new byte[]{(byte) i, (byte) (i >> 8), (byte) (i >> 16), (byte) (i >> 24)};
    }

    @Override // p.wt50
    public final int b() {
        return this.b;
    }

    @Override // p.wt50
    public final boolean d(wt50 wt50Var) {
        return this.b == wt50Var.b();
    }
}
